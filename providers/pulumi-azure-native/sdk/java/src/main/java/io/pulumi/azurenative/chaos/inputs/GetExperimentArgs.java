// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetExperimentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExperimentArgs Empty = new GetExperimentArgs();

    /**
     * String that represents a Experiment resource name.
     * 
     */
    @InputImport(name="experimentName", required=true)
      private final String experimentName;

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetExperimentArgs(
        String experimentName,
        String resourceGroupName) {
        this.experimentName = Objects.requireNonNull(experimentName, "expected parameter 'experimentName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExperimentArgs() {
        this.experimentName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String experimentName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperimentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.experimentName = defaults.experimentName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder experimentName(String experimentName) {
            this.experimentName = Objects.requireNonNull(experimentName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetExperimentArgs build() {
            return new GetExperimentArgs(experimentName, resourceGroupName);
        }
    }
}
