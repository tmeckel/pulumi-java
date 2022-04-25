// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExperimentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExperimentArgs Empty = new GetExperimentArgs();

    /**
     * String that represents a Experiment resource name.
     * 
     */
    @Import(name="experimentName", required=true)
    private String experimentName;

    /**
     * @return String that represents a Experiment resource name.
     * 
     */
    public String experimentName() {
        return this.experimentName;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return String that represents an Azure resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetExperimentArgs() {}

    private GetExperimentArgs(GetExperimentArgs $) {
        this.experimentName = $.experimentName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExperimentArgs $;

        public Builder() {
            $ = new GetExperimentArgs();
        }

        public Builder(GetExperimentArgs defaults) {
            $ = new GetExperimentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param experimentName String that represents a Experiment resource name.
         * 
         * @return builder
         * 
         */
        public Builder experimentName(String experimentName) {
            $.experimentName = experimentName;
            return this;
        }

        /**
         * @param resourceGroupName String that represents an Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetExperimentArgs build() {
            $.experimentName = Objects.requireNonNull($.experimentName, "expected parameter 'experimentName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
