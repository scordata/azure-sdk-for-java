// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/stable/2021-11-30/examples/PaymentHsm_OperationsList.json
     */
    /**
     * Sample code: Get a list of Payment HSM operations.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void getAListOfPaymentHSMOperations(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager.operations().list(Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/stable/2021-11-30/examples/DedicatedHsm_OperationsList.json
     */
    /**
     * Sample code: Get a list of Dedicated HSM operations.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void getAListOfDedicatedHSMOperations(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager.operations().list(Context.NONE);
    }
}