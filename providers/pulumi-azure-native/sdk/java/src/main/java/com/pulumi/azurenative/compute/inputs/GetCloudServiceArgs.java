// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCloudServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudServiceArgs Empty = new GetCloudServiceArgs();

    /**
     * Name of the cloud service.
     * 
     */
    @Import(name="cloudServiceName", required=true)
    private String cloudServiceName;

    /**
     * @return Name of the cloud service.
     * 
     */
    public String cloudServiceName() {
        return this.cloudServiceName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCloudServiceArgs() {}

    private GetCloudServiceArgs(GetCloudServiceArgs $) {
        this.cloudServiceName = $.cloudServiceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudServiceArgs $;

        public Builder() {
            $ = new GetCloudServiceArgs();
        }

        public Builder(GetCloudServiceArgs defaults) {
            $ = new GetCloudServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudServiceName Name of the cloud service.
         * 
         * @return builder
         * 
         */
        public Builder cloudServiceName(String cloudServiceName) {
            $.cloudServiceName = cloudServiceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetCloudServiceArgs build() {
            $.cloudServiceName = Objects.requireNonNull($.cloudServiceName, "expected parameter 'cloudServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
