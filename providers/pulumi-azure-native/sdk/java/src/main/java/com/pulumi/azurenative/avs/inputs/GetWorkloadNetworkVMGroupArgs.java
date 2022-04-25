// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadNetworkVMGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadNetworkVMGroupArgs Empty = new GetWorkloadNetworkVMGroupArgs();

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private String privateCloudName;

    /**
     * @return Name of the private cloud
     * 
     */
    public String privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * NSX VM Group identifier. Generally the same as the VM Group&#39;s display name
     * 
     */
    @Import(name="vmGroupId", required=true)
    private String vmGroupId;

    /**
     * @return NSX VM Group identifier. Generally the same as the VM Group&#39;s display name
     * 
     */
    public String vmGroupId() {
        return this.vmGroupId;
    }

    private GetWorkloadNetworkVMGroupArgs() {}

    private GetWorkloadNetworkVMGroupArgs(GetWorkloadNetworkVMGroupArgs $) {
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
        this.vmGroupId = $.vmGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadNetworkVMGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadNetworkVMGroupArgs $;

        public Builder() {
            $ = new GetWorkloadNetworkVMGroupArgs();
        }

        public Builder(GetWorkloadNetworkVMGroupArgs defaults) {
            $ = new GetWorkloadNetworkVMGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vmGroupId NSX VM Group identifier. Generally the same as the VM Group&#39;s display name
         * 
         * @return builder
         * 
         */
        public Builder vmGroupId(String vmGroupId) {
            $.vmGroupId = vmGroupId;
            return this;
        }

        public GetWorkloadNetworkVMGroupArgs build() {
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmGroupId = Objects.requireNonNull($.vmGroupId, "expected parameter 'vmGroupId' to be non-null");
            return $;
        }
    }

}
