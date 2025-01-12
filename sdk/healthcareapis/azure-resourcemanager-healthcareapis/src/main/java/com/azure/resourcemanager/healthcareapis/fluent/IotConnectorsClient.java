// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.healthcareapis.fluent.models.IotConnectorInner;
import com.azure.resourcemanager.healthcareapis.models.IotConnectorPatchResource;

/** An instance of this class provides access to all the operations defined in IotConnectorsClient. */
public interface IotConnectorsClient {
    /**
     * Lists all IoT Connectors for the given workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of IoT Connectors as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IotConnectorInner> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Lists all IoT Connectors for the given workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of IoT Connectors as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IotConnectorInner> listByWorkspace(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets the properties of the specified IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified IoT Connector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotConnectorInner get(String resourceGroupName, String workspaceName, String iotConnectorName);

    /**
     * Gets the properties of the specified IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified IoT Connector along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IotConnectorInner> getWithResponse(
        String resourceGroupName, String workspaceName, String iotConnectorName, Context context);

    /**
     * Creates or updates an IoT Connector resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param iotConnector The parameters for creating or updating an IoT Connectors resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of ioT Connector definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IotConnectorInner>, IotConnectorInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, String iotConnectorName, IotConnectorInner iotConnector);

    /**
     * Creates or updates an IoT Connector resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param iotConnector The parameters for creating or updating an IoT Connectors resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of ioT Connector definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IotConnectorInner>, IotConnectorInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String iotConnectorName,
        IotConnectorInner iotConnector,
        Context context);

    /**
     * Creates or updates an IoT Connector resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param iotConnector The parameters for creating or updating an IoT Connectors resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Connector definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotConnectorInner createOrUpdate(
        String resourceGroupName, String workspaceName, String iotConnectorName, IotConnectorInner iotConnector);

    /**
     * Creates or updates an IoT Connector resource with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param iotConnector The parameters for creating or updating an IoT Connectors resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Connector definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotConnectorInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String iotConnectorName,
        IotConnectorInner iotConnector,
        Context context);

    /**
     * Patch an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorPatchResource The parameters for updating an IoT Connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of ioT Connector definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IotConnectorInner>, IotConnectorInner> beginUpdate(
        String resourceGroupName,
        String iotConnectorName,
        String workspaceName,
        IotConnectorPatchResource iotConnectorPatchResource);

    /**
     * Patch an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorPatchResource The parameters for updating an IoT Connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of ioT Connector definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IotConnectorInner>, IotConnectorInner> beginUpdate(
        String resourceGroupName,
        String iotConnectorName,
        String workspaceName,
        IotConnectorPatchResource iotConnectorPatchResource,
        Context context);

    /**
     * Patch an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorPatchResource The parameters for updating an IoT Connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Connector definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotConnectorInner update(
        String resourceGroupName,
        String iotConnectorName,
        String workspaceName,
        IotConnectorPatchResource iotConnectorPatchResource);

    /**
     * Patch an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorPatchResource The parameters for updating an IoT Connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Connector definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IotConnectorInner update(
        String resourceGroupName,
        String iotConnectorName,
        String workspaceName,
        IotConnectorPatchResource iotConnectorPatchResource,
        Context context);

    /**
     * Deletes an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String iotConnectorName, String workspaceName);

    /**
     * Deletes an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String iotConnectorName, String workspaceName, Context context);

    /**
     * Deletes an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String iotConnectorName, String workspaceName);

    /**
     * Deletes an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String iotConnectorName, String workspaceName, Context context);
}
