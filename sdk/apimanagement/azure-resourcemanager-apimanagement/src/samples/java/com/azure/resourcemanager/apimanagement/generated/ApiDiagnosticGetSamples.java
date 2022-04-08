// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;

/** Samples for ApiDiagnostic Get. */
public final class ApiDiagnosticGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementGetApiDiagnostic.json
     */
    /**
     * Sample code: ApiManagementGetApiDiagnostic.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetApiDiagnostic(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiDiagnostics()
            .getWithResponse("rg1", "apimService1", "57d1f7558aa04f15146d9d8a", "applicationinsights", Context.NONE);
    }
}