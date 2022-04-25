// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDistributedAvailabilityGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDistributedAvailabilityGroupArgs Empty = new GetDistributedAvailabilityGroupArgs();

    /**
     * The distributed availability group name.
     * 
     */
    @Import(name="distributedAvailabilityGroupName", required=true)
    private String distributedAvailabilityGroupName;

    /**
     * @return The distributed availability group name.
     * 
     */
    public String distributedAvailabilityGroupName() {
        return this.distributedAvailabilityGroupName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
    private String managedInstanceName;

    /**
     * @return The name of the managed instance.
     * 
     */
    public String managedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDistributedAvailabilityGroupArgs() {}

    private GetDistributedAvailabilityGroupArgs(GetDistributedAvailabilityGroupArgs $) {
        this.distributedAvailabilityGroupName = $.distributedAvailabilityGroupName;
        this.managedInstanceName = $.managedInstanceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDistributedAvailabilityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDistributedAvailabilityGroupArgs $;

        public Builder() {
            $ = new GetDistributedAvailabilityGroupArgs();
        }

        public Builder(GetDistributedAvailabilityGroupArgs defaults) {
            $ = new GetDistributedAvailabilityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param distributedAvailabilityGroupName The distributed availability group name.
         * 
         * @return builder
         * 
         */
        public Builder distributedAvailabilityGroupName(String distributedAvailabilityGroupName) {
            $.distributedAvailabilityGroupName = distributedAvailabilityGroupName;
            return this;
        }

        /**
         * @param managedInstanceName The name of the managed instance.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(String managedInstanceName) {
            $.managedInstanceName = managedInstanceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDistributedAvailabilityGroupArgs build() {
            $.distributedAvailabilityGroupName = Objects.requireNonNull($.distributedAvailabilityGroupName, "expected parameter 'distributedAvailabilityGroupName' to be non-null");
            $.managedInstanceName = Objects.requireNonNull($.managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
