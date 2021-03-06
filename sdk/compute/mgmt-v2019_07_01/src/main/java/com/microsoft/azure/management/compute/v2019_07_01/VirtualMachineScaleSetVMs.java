/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.VirtualMachineScaleSetVMsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualMachineScaleSetVMs.
 */
public interface VirtualMachineScaleSetVMs extends HasInner<VirtualMachineScaleSetVMsInner> {
    /**
     * Reimages (upgrade the operating system) a specific virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable reimageAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Allows you to re-image all the disks ( including data disks ) in the a VM scale set instance. This operation is only supported for managed disks.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable reimageAllAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Deallocates a specific virtual machine in a VM scale set. Shuts down the virtual machine and releases the compute resources it uses. You are not billed for the compute resources of this virtual machine once it is deallocated.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deallocateAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Gets the status of a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetVMInstanceView> getInstanceViewAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Power off (stop) a virtual machine in a VM scale set. Note that resources are still attached and you are getting charged for the resources. Instead, use deallocate to release resources and avoid charges.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable powerOffAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Restarts a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable restartAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Starts a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Shuts down the virtual machine in the virtual machine scale set, moves it to a new node, and powers it back on.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable redeployAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Performs maintenance on a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable performMaintenanceAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Run command on a virtual machine in a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @param parameters Parameters supplied to the Run command operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RunCommandResult> runCommandAsync(String resourceGroupName, String vmScaleSetName, String instanceId, RunCommandInput parameters);

    /**
     * Gets a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetVM> getAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

    /**
     * Gets a list of all virtual machines in a VM scale sets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineScaleSetVM> listAsync(final String resourceGroupName, final String virtualMachineScaleSetName);

    /**
     * Deletes a virtual machine from a VM scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param instanceId The instance ID of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String vmScaleSetName, String instanceId);

}
