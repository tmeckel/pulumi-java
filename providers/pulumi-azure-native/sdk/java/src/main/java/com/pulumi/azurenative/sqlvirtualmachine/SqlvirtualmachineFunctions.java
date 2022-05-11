// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sqlvirtualmachine.inputs.GetAvailabilityGroupListenerArgs;
import com.pulumi.azurenative.sqlvirtualmachine.inputs.GetSqlVirtualMachineArgs;
import com.pulumi.azurenative.sqlvirtualmachine.inputs.GetSqlVirtualMachineGroupArgs;
import com.pulumi.azurenative.sqlvirtualmachine.outputs.GetAvailabilityGroupListenerResult;
import com.pulumi.azurenative.sqlvirtualmachine.outputs.GetSqlVirtualMachineGroupResult;
import com.pulumi.azurenative.sqlvirtualmachine.outputs.GetSqlVirtualMachineResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SqlvirtualmachineFunctions {
    /**
     * A SQL Server availability group listener.
     * API Version: 2017-03-01-preview.
     * 
     */
    public static CompletableFuture<GetAvailabilityGroupListenerResult> getAvailabilityGroupListener(GetAvailabilityGroupListenerArgs args) {
        return getAvailabilityGroupListener(args, InvokeOptions.Empty);
    }
    /**
     * A SQL Server availability group listener.
     * API Version: 2017-03-01-preview.
     * 
     */
    public static CompletableFuture<GetAvailabilityGroupListenerResult> getAvailabilityGroupListener(GetAvailabilityGroupListenerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sqlvirtualmachine:getAvailabilityGroupListener", TypeShape.of(GetAvailabilityGroupListenerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A SQL virtual machine.
     * API Version: 2017-03-01-preview.
     * 
     */
    public static CompletableFuture<GetSqlVirtualMachineResult> getSqlVirtualMachine(GetSqlVirtualMachineArgs args) {
        return getSqlVirtualMachine(args, InvokeOptions.Empty);
    }
    /**
     * A SQL virtual machine.
     * API Version: 2017-03-01-preview.
     * 
     */
    public static CompletableFuture<GetSqlVirtualMachineResult> getSqlVirtualMachine(GetSqlVirtualMachineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sqlvirtualmachine:getSqlVirtualMachine", TypeShape.of(GetSqlVirtualMachineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A SQL virtual machine group.
     * API Version: 2017-03-01-preview.
     * 
     */
    public static CompletableFuture<GetSqlVirtualMachineGroupResult> getSqlVirtualMachineGroup(GetSqlVirtualMachineGroupArgs args) {
        return getSqlVirtualMachineGroup(args, InvokeOptions.Empty);
    }
    /**
     * A SQL virtual machine group.
     * API Version: 2017-03-01-preview.
     * 
     */
    public static CompletableFuture<GetSqlVirtualMachineGroupResult> getSqlVirtualMachineGroup(GetSqlVirtualMachineGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sqlvirtualmachine:getSqlVirtualMachineGroup", TypeShape.of(GetSqlVirtualMachineGroupResult.class), args, Utilities.withVersion(options));
    }
}
