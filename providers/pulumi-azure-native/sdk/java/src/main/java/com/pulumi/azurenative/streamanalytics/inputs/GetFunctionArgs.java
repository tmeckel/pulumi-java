// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionArgs Empty = new GetFunctionArgs();

    /**
     * The name of the function.
     * 
     */
    @Import(name="functionName", required=true)
    private String functionName;

    /**
     * @return The name of the function.
     * 
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * The name of the streaming job.
     * 
     */
    @Import(name="jobName", required=true)
    private String jobName;

    /**
     * @return The name of the streaming job.
     * 
     */
    public String jobName() {
        return this.jobName;
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

    private GetFunctionArgs() {}

    private GetFunctionArgs(GetFunctionArgs $) {
        this.functionName = $.functionName;
        this.jobName = $.jobName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionArgs $;

        public Builder() {
            $ = new GetFunctionArgs();
        }

        public Builder(GetFunctionArgs defaults) {
            $ = new GetFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param functionName The name of the function.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param jobName The name of the streaming job.
         * 
         * @return builder
         * 
         */
        public Builder jobName(String jobName) {
            $.jobName = jobName;
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

        public GetFunctionArgs build() {
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            $.jobName = Objects.requireNonNull($.jobName, "expected parameter 'jobName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
