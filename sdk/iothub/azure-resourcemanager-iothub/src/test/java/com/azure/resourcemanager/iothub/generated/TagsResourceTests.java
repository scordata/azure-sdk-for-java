// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.TagsResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TagsResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagsResource model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"nyyazttbtwwrqpue\":\"ucoc\",\"xibxujwbhqwalm\":\"ckzywbiexzfeyue\",\"ux\":\"zyoxaepdkzjan\",\"zt\":\"hdwbavxbniwdjs\"}}")
                .toObject(TagsResource.class);
        Assertions.assertEquals("ucoc", model.tags().get("nyyazttbtwwrqpue"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagsResource model =
            new TagsResource()
                .withTags(
                    mapOf(
                        "nyyazttbtwwrqpue",
                        "ucoc",
                        "xibxujwbhqwalm",
                        "ckzywbiexzfeyue",
                        "ux",
                        "zyoxaepdkzjan",
                        "zt",
                        "hdwbavxbniwdjs"));
        model = BinaryData.fromObject(model).toObject(TagsResource.class);
        Assertions.assertEquals("ucoc", model.tags().get("nyyazttbtwwrqpue"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
