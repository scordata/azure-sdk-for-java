// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.CustomCertificateInner;

/** An immutable client-side representation of CustomCertificate. */
public interface CustomCertificate {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the keyVaultBaseUri property: Base uri of the KeyVault that stores certificate.
     *
     * @return the keyVaultBaseUri value.
     */
    String keyVaultBaseUri();

    /**
     * Gets the keyVaultSecretName property: Certificate secret name.
     *
     * @return the keyVaultSecretName value.
     */
    String keyVaultSecretName();

    /**
     * Gets the keyVaultSecretVersion property: Certificate secret version.
     *
     * @return the keyVaultSecretVersion value.
     */
    String keyVaultSecretVersion();

    /**
     * Gets the inner com.azure.resourcemanager.signalr.fluent.models.CustomCertificateInner object.
     *
     * @return the inner object.
     */
    CustomCertificateInner innerModel();

    /** The entirety of the CustomCertificate definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithKeyVaultBaseUri,
            DefinitionStages.WithKeyVaultSecretName,
            DefinitionStages.WithCreate {
    }
    /** The CustomCertificate definition stages. */
    interface DefinitionStages {
        /** The first stage of the CustomCertificate definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CustomCertificate definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param resourceName The name of the resource.
             * @return the next definition stage.
             */
            WithKeyVaultBaseUri withExistingSignalR(String resourceGroupName, String resourceName);
        }
        /** The stage of the CustomCertificate definition allowing to specify keyVaultBaseUri. */
        interface WithKeyVaultBaseUri {
            /**
             * Specifies the keyVaultBaseUri property: Base uri of the KeyVault that stores certificate..
             *
             * @param keyVaultBaseUri Base uri of the KeyVault that stores certificate.
             * @return the next definition stage.
             */
            WithKeyVaultSecretName withKeyVaultBaseUri(String keyVaultBaseUri);
        }
        /** The stage of the CustomCertificate definition allowing to specify keyVaultSecretName. */
        interface WithKeyVaultSecretName {
            /**
             * Specifies the keyVaultSecretName property: Certificate secret name..
             *
             * @param keyVaultSecretName Certificate secret name.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultSecretName(String keyVaultSecretName);
        }
        /**
         * The stage of the CustomCertificate definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithKeyVaultSecretVersion {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CustomCertificate create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CustomCertificate create(Context context);
        }
        /** The stage of the CustomCertificate definition allowing to specify keyVaultSecretVersion. */
        interface WithKeyVaultSecretVersion {
            /**
             * Specifies the keyVaultSecretVersion property: Certificate secret version..
             *
             * @param keyVaultSecretVersion Certificate secret version.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultSecretVersion(String keyVaultSecretVersion);
        }
    }
    /**
     * Begins update for the CustomCertificate resource.
     *
     * @return the stage of resource update.
     */
    CustomCertificate.Update update();

    /** The template for CustomCertificate update. */
    interface Update {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CustomCertificate apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CustomCertificate apply(Context context);
    }
    /** The CustomCertificate update stages. */
    interface UpdateStages {
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CustomCertificate refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CustomCertificate refresh(Context context);
}