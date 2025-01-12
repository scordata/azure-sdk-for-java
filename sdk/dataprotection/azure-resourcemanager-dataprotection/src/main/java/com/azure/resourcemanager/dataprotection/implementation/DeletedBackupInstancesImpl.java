// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.DeletedBackupInstancesClient;
import com.azure.resourcemanager.dataprotection.fluent.models.DeletedBackupInstanceResourceInner;
import com.azure.resourcemanager.dataprotection.models.DeletedBackupInstanceResource;
import com.azure.resourcemanager.dataprotection.models.DeletedBackupInstances;

public final class DeletedBackupInstancesImpl implements DeletedBackupInstances {
    private static final ClientLogger LOGGER = new ClientLogger(DeletedBackupInstancesImpl.class);

    private final DeletedBackupInstancesClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public DeletedBackupInstancesImpl(
        DeletedBackupInstancesClient innerClient,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DeletedBackupInstanceResource> list(String resourceGroupName, String vaultName) {
        PagedIterable<DeletedBackupInstanceResourceInner> inner =
            this.serviceClient().list(resourceGroupName, vaultName);
        return Utils.mapPage(inner, inner1 -> new DeletedBackupInstanceResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DeletedBackupInstanceResource> list(
        String resourceGroupName, String vaultName, Context context) {
        PagedIterable<DeletedBackupInstanceResourceInner> inner =
            this.serviceClient().list(resourceGroupName, vaultName, context);
        return Utils.mapPage(inner, inner1 -> new DeletedBackupInstanceResourceImpl(inner1, this.manager()));
    }

    public Response<DeletedBackupInstanceResource> getWithResponse(
        String resourceGroupName, String vaultName, String backupInstanceName, Context context) {
        Response<DeletedBackupInstanceResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, vaultName, backupInstanceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeletedBackupInstanceResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeletedBackupInstanceResource get(String resourceGroupName, String vaultName, String backupInstanceName) {
        DeletedBackupInstanceResourceInner inner =
            this.serviceClient().get(resourceGroupName, vaultName, backupInstanceName);
        if (inner != null) {
            return new DeletedBackupInstanceResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void undelete(String resourceGroupName, String vaultName, String backupInstanceName) {
        this.serviceClient().undelete(resourceGroupName, vaultName, backupInstanceName);
    }

    public void undelete(String resourceGroupName, String vaultName, String backupInstanceName, Context context) {
        this.serviceClient().undelete(resourceGroupName, vaultName, backupInstanceName, context);
    }

    private DeletedBackupInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
