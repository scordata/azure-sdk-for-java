// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class CollectionsListCollectionsTests extends PurviewAccountClientTestBase {
    @Test
    @Disabled
    public void testCollectionsListCollectionsTests() {
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = collectionsClient.listCollections(requestOptions);
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        Assertions.assertEquals(
                "Wed, 13 Sep 2017 18:04:32 GMT",
                response.iterableByPage().iterator().next().getHeaders().get("Date").getValue());
        Assertions.assertEquals(
                "nosniff",
                response.iterableByPage().iterator().next().getHeaders().get("X-Content-Type-Options").getValue());
        Assertions.assertEquals(
                "d5496da4-9c52-402f-b067-83cc9ddea888",
                response.iterableByPage().iterator().next().getHeaders().get("x-ms-request-id").getValue());
        Assertions.assertEquals(
                "25c78f97-0b0a-4fe9-ad39-883a482265cd",
                response.iterableByPage().iterator().next().getHeaders().get("x-ms-correlation-request-id").getValue());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"mycollection1\",\"collectionProvisioningState\":\"Succeeded\",\"friendlyName\":\"Finance\",\"parentCollection\":{\"type\":\"CollectionReference\",\"referenceName\":\"accountName\"}}")
                        .toObject(Object.class),
                response.iterator().next().toObject(Object.class));
    }
}