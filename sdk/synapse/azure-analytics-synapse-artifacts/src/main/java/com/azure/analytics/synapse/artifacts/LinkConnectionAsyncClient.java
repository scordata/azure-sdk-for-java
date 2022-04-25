// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.LinkConnectionsImpl;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.EditTablesRequest;
import com.azure.analytics.synapse.artifacts.models.LinkConnectionDetailedStatus;
import com.azure.analytics.synapse.artifacts.models.LinkConnectionQueryTableStatus;
import com.azure.analytics.synapse.artifacts.models.LinkConnectionResource;
import com.azure.analytics.synapse.artifacts.models.LinkTableListResponse;
import com.azure.analytics.synapse.artifacts.models.QueryTableStatusRequest;
import com.azure.analytics.synapse.artifacts.models.UpdateLandingZoneCredential;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class LinkConnectionAsyncClient {
    @Generated private final LinkConnectionsImpl serviceClient;

    /**
     * Initializes an instance of LinkConnectionAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    LinkConnectionAsyncClient(LinkConnectionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List link connections.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LinkConnectionResource> listLinkConnectionsByWorkspace() {
        return this.serviceClient.listLinkConnectionsByWorkspaceAsync();
    }

    /**
     * Creates or updates a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param linkConnection Link connection resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LinkConnectionResource>> createOrUpdateLinkConnectionWithResponse(
            String linkConnectionName, LinkConnectionResource linkConnection) {
        return this.serviceClient.createOrUpdateLinkConnectionWithResponseAsync(linkConnectionName, linkConnection);
    }

    /**
     * Creates or updates a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param linkConnection Link connection resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinkConnectionResource> createOrUpdateLinkConnection(
            String linkConnectionName, LinkConnectionResource linkConnection) {
        return this.serviceClient.createOrUpdateLinkConnectionAsync(linkConnectionName, linkConnection);
    }

    /**
     * Get a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a link connection along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LinkConnectionResource>> getLinkConnectionWithResponse(String linkConnectionName) {
        return this.serviceClient.getLinkConnectionWithResponseAsync(linkConnectionName);
    }

    /**
     * Get a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a link connection on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinkConnectionResource> getLinkConnection(String linkConnectionName) {
        return this.serviceClient.getLinkConnectionAsync(linkConnectionName);
    }

    /**
     * Delete a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteLinkConnectionWithResponse(String linkConnectionName) {
        return this.serviceClient.deleteLinkConnectionWithResponseAsync(linkConnectionName);
    }

    /**
     * Delete a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteLinkConnection(String linkConnectionName) {
        return this.serviceClient.deleteLinkConnectionAsync(linkConnectionName);
    }

    /**
     * Edit tables for a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param editTablesRequest Edit tables request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> editTablesWithResponse(String linkConnectionName, EditTablesRequest editTablesRequest) {
        return this.serviceClient.editTablesWithResponseAsync(linkConnectionName, editTablesRequest);
    }

    /**
     * Edit tables for a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param editTablesRequest Edit tables request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> editTables(String linkConnectionName, EditTablesRequest editTablesRequest) {
        return this.serviceClient.editTablesAsync(linkConnectionName, editTablesRequest);
    }

    /**
     * Start a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> startWithResponse(String linkConnectionName) {
        return this.serviceClient.startWithResponseAsync(linkConnectionName);
    }

    /**
     * Start a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> start(String linkConnectionName) {
        return this.serviceClient.startAsync(linkConnectionName);
    }

    /**
     * Stop a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stopWithResponse(String linkConnectionName) {
        return this.serviceClient.stopWithResponseAsync(linkConnectionName);
    }

    /**
     * Stop a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> stop(String linkConnectionName) {
        return this.serviceClient.stopAsync(linkConnectionName);
    }

    /**
     * Get the detailed status of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed status of a link connection along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LinkConnectionDetailedStatus>> getDetailedStatusWithResponse(String linkConnectionName) {
        return this.serviceClient.getDetailedStatusWithResponseAsync(linkConnectionName);
    }

    /**
     * Get the detailed status of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed status of a link connection on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinkConnectionDetailedStatus> getDetailedStatus(String linkConnectionName) {
        return this.serviceClient.getDetailedStatusAsync(linkConnectionName);
    }

    /**
     * List the link tables of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LinkTableListResponse>> listLinkTablesWithResponse(String linkConnectionName) {
        return this.serviceClient.listLinkTablesWithResponseAsync(linkConnectionName);
    }

    /**
     * List the link tables of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinkTableListResponse> listLinkTables(String linkConnectionName) {
        return this.serviceClient.listLinkTablesAsync(linkConnectionName);
    }

    /**
     * Query the link table status of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param queryTableStatusRequest Query table status request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LinkConnectionQueryTableStatus>> queryTableStatusWithResponse(
            String linkConnectionName, QueryTableStatusRequest queryTableStatusRequest) {
        return this.serviceClient.queryTableStatusWithResponseAsync(linkConnectionName, queryTableStatusRequest);
    }

    /**
     * Query the link table status of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param queryTableStatusRequest Query table status request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinkConnectionQueryTableStatus> queryTableStatus(
            String linkConnectionName, QueryTableStatusRequest queryTableStatusRequest) {
        return this.serviceClient.queryTableStatusAsync(linkConnectionName, queryTableStatusRequest);
    }

    /**
     * Update landing zone credential of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param updateLandingZoneCredentialRequest update landing zone credential request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateLandingZoneCredentialWithResponse(
            String linkConnectionName, UpdateLandingZoneCredential updateLandingZoneCredentialRequest) {
        return this.serviceClient.updateLandingZoneCredentialWithResponseAsync(
                linkConnectionName, updateLandingZoneCredentialRequest);
    }

    /**
     * Update landing zone credential of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param updateLandingZoneCredentialRequest update landing zone credential request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateLandingZoneCredential(
            String linkConnectionName, UpdateLandingZoneCredential updateLandingZoneCredentialRequest) {
        return this.serviceClient.updateLandingZoneCredentialAsync(
                linkConnectionName, updateLandingZoneCredentialRequest);
    }
}