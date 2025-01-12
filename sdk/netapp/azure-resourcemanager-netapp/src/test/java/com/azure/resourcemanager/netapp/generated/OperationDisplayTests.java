// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"cndvkaozwyiftyhx\",\"resource\":\"rokft\",\"operation\":\"olniwpwcukjf\",\"description\":\"iawxklry\"}")
                .toObject(OperationDisplay.class);
        Assertions.assertEquals("cndvkaozwyiftyhx", model.provider());
        Assertions.assertEquals("rokft", model.resource());
        Assertions.assertEquals("olniwpwcukjf", model.operation());
        Assertions.assertEquals("iawxklry", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model =
            new OperationDisplay()
                .withProvider("cndvkaozwyiftyhx")
                .withResource("rokft")
                .withOperation("olniwpwcukjf")
                .withDescription("iawxklry");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("cndvkaozwyiftyhx", model.provider());
        Assertions.assertEquals("rokft", model.resource());
        Assertions.assertEquals("olniwpwcukjf", model.operation());
        Assertions.assertEquals("iawxklry", model.description());
    }
}
