// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.scvmm.fluent.models.VirtualMachineInner;
import com.azure.resourcemanager.scvmm.models.StopVirtualMachineOptions;
import com.azure.resourcemanager.scvmm.models.VirtualMachineCreateCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachineDeleteCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachineRestoreCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachineUpdate;

/** An instance of this class provides access to all the operations defined in VirtualMachinesClient. */
public interface VirtualMachinesClient {
    /**
     * Implements VirtualMachine GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner getByResourceGroup(String resourceGroupName, String virtualMachineName);

    /**
     * Implements VirtualMachine GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineInner> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Creates Or Updates virtual machines deployed on scvmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the VirtualMachines resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInner>, VirtualMachineInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualMachineName, VirtualMachineInner body);

    /**
     * Creates Or Updates virtual machines deployed on scvmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the VirtualMachines resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInner>, VirtualMachineInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualMachineName, VirtualMachineInner body, Context context);

    /**
     * Creates Or Updates virtual machines deployed on scvmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner createOrUpdate(String resourceGroupName, String virtualMachineName, VirtualMachineInner body);

    /**
     * Creates Or Updates virtual machines deployed on scvmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner createOrUpdate(
        String resourceGroupName, String virtualMachineName, VirtualMachineInner body, Context context);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualMachineName, Boolean retain, Boolean force);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualMachineName, Boolean retain, Boolean force, Context context);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineName, Boolean retain, Boolean force);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineName);

    /**
     * Deletes a VirtualMachine deployed on ScVmm fabric.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineName, Boolean retain, Boolean force, Context context);

    /**
     * Updates the VirtualMachines resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body VirtualMachines patch payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the VirtualMachines resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInner>, VirtualMachineInner> beginUpdate(
        String resourceGroupName, String virtualMachineName, VirtualMachineUpdate body);

    /**
     * Updates the VirtualMachines resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body VirtualMachines patch payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the VirtualMachines resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInner>, VirtualMachineInner> beginUpdate(
        String resourceGroupName, String virtualMachineName, VirtualMachineUpdate body, Context context);

    /**
     * Updates the VirtualMachines resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body VirtualMachines patch payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner update(String resourceGroupName, String virtualMachineName, VirtualMachineUpdate body);

    /**
     * Updates the VirtualMachines resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body VirtualMachines patch payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachines resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner update(
        String resourceGroupName, String virtualMachineName, VirtualMachineUpdate body, Context context);

    /**
     * Stop virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine stop action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body);

    /**
     * Stop virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine stop action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body, Context context);

    /**
     * Stop virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine stop action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body);

    /**
     * Stop virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String virtualMachineName);

    /**
     * Stop virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine stop action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body, Context context);

    /**
     * Start virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String virtualMachineName);

    /**
     * Start virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Start virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String virtualMachineName);

    /**
     * Start virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Restart virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String virtualMachineName);

    /**
     * Restart virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(
        String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Restart virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String virtualMachineName);

    /**
     * Restart virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Creates a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine create checkpoint action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCreateCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineCreateCheckpoint body);

    /**
     * Creates a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine create checkpoint action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginCreateCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineCreateCheckpoint body, Context context);

    /**
     * Creates a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine create checkpoint action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createCheckpoint(String resourceGroupName, String virtualMachineName, VirtualMachineCreateCheckpoint body);

    /**
     * Creates a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createCheckpoint(String resourceGroupName, String virtualMachineName);

    /**
     * Creates a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine create checkpoint action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineCreateCheckpoint body, Context context);

    /**
     * Deletes a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine delete checkpoint action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineDeleteCheckpoint body);

    /**
     * Deletes a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine delete checkpoint action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineDeleteCheckpoint body, Context context);

    /**
     * Deletes a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine delete checkpoint action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteCheckpoint(String resourceGroupName, String virtualMachineName, VirtualMachineDeleteCheckpoint body);

    /**
     * Deletes a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteCheckpoint(String resourceGroupName, String virtualMachineName);

    /**
     * Deletes a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine delete checkpoint action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineDeleteCheckpoint body, Context context);

    /**
     * Restores to a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine restore checkpoint action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestoreCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineRestoreCheckpoint body);

    /**
     * Restores to a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine restore checkpoint action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestoreCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineRestoreCheckpoint body, Context context);

    /**
     * Restores to a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine restore checkpoint action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restoreCheckpoint(String resourceGroupName, String virtualMachineName, VirtualMachineRestoreCheckpoint body);

    /**
     * Restores to a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restoreCheckpoint(String resourceGroupName, String virtualMachineName);

    /**
     * Restores to a checkpoint in virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineName Name of the VirtualMachine.
     * @param body Virtualmachine restore checkpoint action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restoreCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineRestoreCheckpoint body, Context context);

    /**
     * List of VirtualMachines in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInner> listByResourceGroup(String resourceGroupName);

    /**
     * List of VirtualMachines in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List of VirtualMachines in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInner> list();

    /**
     * List of VirtualMachines in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInner> list(Context context);
}