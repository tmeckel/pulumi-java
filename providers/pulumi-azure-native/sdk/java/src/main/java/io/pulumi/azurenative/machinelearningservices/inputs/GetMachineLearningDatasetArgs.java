// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMachineLearningDatasetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMachineLearningDatasetArgs Empty = new GetMachineLearningDatasetArgs();

    /**
     * The Dataset name.
     * 
     */
    @InputImport(name="datasetName", required=true)
      private final String datasetName;

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetMachineLearningDatasetArgs(
        String datasetName,
        String resourceGroupName,
        String workspaceName) {
        this.datasetName = Objects.requireNonNull(datasetName, "expected parameter 'datasetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetMachineLearningDatasetArgs() {
        this.datasetName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineLearningDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineLearningDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetName = defaults.datasetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder datasetName(String datasetName) {
            this.datasetName = Objects.requireNonNull(datasetName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public GetMachineLearningDatasetArgs build() {
            return new GetMachineLearningDatasetArgs(datasetName, resourceGroupName, workspaceName);
        }
    }
}
