// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Monitors. */
public interface Monitors {
    /**
     * Gets the user account credentials for a Monitor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user account credentials for a Monitor.
     */
    AccountInfoSecure getAccountCredentials(String resourceGroupName, String monitorName);

    /**
     * Gets the user account credentials for a Monitor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the user account credentials for a Monitor along with {@link Response}.
     */
    Response<AccountInfoSecure> getAccountCredentialsWithResponse(
        String resourceGroupName, String monitorName, Context context);

    /**
     * List the resources currently being monitored by the Dynatrace monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the resources being monitored by Dynatrace monitor resource as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<MonitoredResource> listMonitoredResources(String resourceGroupName, String monitorName);

    /**
     * List the resources currently being monitored by the Dynatrace monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the resources being monitored by Dynatrace monitor resource as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<MonitoredResource> listMonitoredResources(
        String resourceGroupName, String monitorName, Context context);

    /**
     * Returns the payload that needs to be passed in the request body for installing Dynatrace agent on a VM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of payload to be passed while installing VM agent.
     */
    VMExtensionPayload getVMHostPayload(String resourceGroupName, String monitorName);

    /**
     * Returns the payload that needs to be passed in the request body for installing Dynatrace agent on a VM.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of payload to be passed while installing VM agent along with {@link Response}.
     */
    Response<VMExtensionPayload> getVMHostPayloadWithResponse(
        String resourceGroupName, String monitorName, Context context);

    /**
     * Get a MonitorResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MonitorResource.
     */
    MonitorResource getByResourceGroup(String resourceGroupName, String monitorName);

    /**
     * Get a MonitorResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MonitorResource along with {@link Response}.
     */
    Response<MonitorResource> getByResourceGroupWithResponse(
        String resourceGroupName, String monitorName, Context context);

    /**
     * Delete a MonitorResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String monitorName);

    /**
     * Delete a MonitorResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String monitorName, Context context);

    /**
     * List all MonitorResource by subscriptionId.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MonitorResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitorResource> list();

    /**
     * List all MonitorResource by subscriptionId.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MonitorResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitorResource> list(Context context);

    /**
     * List MonitorResource resources by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MonitorResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitorResource> listByResourceGroup(String resourceGroupName);

    /**
     * List MonitorResource resources by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MonitorResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MonitorResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List the compute resources currently being monitored by the Dynatrace resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list VM Host Operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VMInfo> listHosts(String resourceGroupName, String monitorName);

    /**
     * List the compute resources currently being monitored by the Dynatrace resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list VM Host Operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VMInfo> listHosts(String resourceGroupName, String monitorName, Context context);

    /**
     * Gets list of App Services with Dynatrace PaaS OneAgent enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of App Services with Dynatrace PaaS OneAgent enabled as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<AppServiceInfo> listAppServices(String resourceGroupName, String monitorName);

    /**
     * Gets list of App Services with Dynatrace PaaS OneAgent enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of App Services with Dynatrace PaaS OneAgent enabled as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<AppServiceInfo> listAppServices(String resourceGroupName, String monitorName, Context context);

    /**
     * Gets the SSO configuration details from the partner.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SSO configuration details from the partner.
     */
    SsoDetailsResponse getSsoDetails(String resourceGroupName, String monitorName);

    /**
     * Gets the SSO configuration details from the partner.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param request The details of the get sso details request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SSO configuration details from the partner along with {@link Response}.
     */
    Response<SsoDetailsResponse> getSsoDetailsWithResponse(
        String resourceGroupName, String monitorName, SsoDetailsRequest request, Context context);

    /**
     * Gets all the Dynatrace environments that a user can link a azure resource to.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param request The details of the linkable environment request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Dynatrace environments that a user can link a azure resource to as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<LinkableEnvironmentResponse> listLinkableEnvironments(
        String resourceGroupName, String monitorName, LinkableEnvironmentRequest request);

    /**
     * Gets all the Dynatrace environments that a user can link a azure resource to.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param request The details of the linkable environment request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Dynatrace environments that a user can link a azure resource to as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<LinkableEnvironmentResponse> listLinkableEnvironments(
        String resourceGroupName, String monitorName, LinkableEnvironmentRequest request, Context context);

    /**
     * Get a MonitorResource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MonitorResource along with {@link Response}.
     */
    MonitorResource getById(String id);

    /**
     * Get a MonitorResource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MonitorResource along with {@link Response}.
     */
    Response<MonitorResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete a MonitorResource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a MonitorResource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new MonitorResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new MonitorResource definition.
     */
    MonitorResource.DefinitionStages.Blank define(String name);
}