// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;

/** Samples for ContentKeyPolicies List. */
public final class ContentKeyPoliciesListSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/content-key-policies-list-all.json
     */
    /**
     * Sample code: Lists all Content Key Policies.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsAllContentKeyPolicies(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.contentKeyPolicies().list("contoso", "contosomedia", null, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/content-key-policies-list-in-date-range.json
     */
    /**
     * Sample code: Lists Content Key Policies with created and last modified filters.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsContentKeyPoliciesWithCreatedAndLastModifiedFilters(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .contentKeyPolicies()
            .list(
                "contoso",
                "contosomedia",
                "properties/lastModified gt 2016-06-01 and properties/created lt 2013-07-01",
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/stable/2021-11-01/examples/content-key-policies-list-by-lastModified.json
     */
    /**
     * Sample code: Lists Content Key Policies ordered by last modified.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listsContentKeyPoliciesOrderedByLastModified(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .contentKeyPolicies()
            .list("contoso", "contosomedia", null, null, "properties/lastModified", Context.NONE);
    }
}