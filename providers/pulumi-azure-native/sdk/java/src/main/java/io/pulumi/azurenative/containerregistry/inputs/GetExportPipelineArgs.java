// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetExportPipelineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExportPipelineArgs Empty = new GetExportPipelineArgs();

    /**
     * The name of the export pipeline.
     * 
     */
    @InputImport(name="exportPipelineName", required=true)
      private final String exportPipelineName;

    public String getExportPipelineName() {
        return this.exportPipelineName;
    }

    /**
     * The name of the container registry.
     * 
     */
    @InputImport(name="registryName", required=true)
      private final String registryName;

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetExportPipelineArgs(
        String exportPipelineName,
        String registryName,
        String resourceGroupName) {
        this.exportPipelineName = Objects.requireNonNull(exportPipelineName, "expected parameter 'exportPipelineName' to be non-null");
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExportPipelineArgs() {
        this.exportPipelineName = null;
        this.registryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exportPipelineName;
        private String registryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExportPipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exportPipelineName = defaults.exportPipelineName;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder exportPipelineName(String exportPipelineName) {
            this.exportPipelineName = Objects.requireNonNull(exportPipelineName);
            return this;
        }

        public Builder registryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetExportPipelineArgs build() {
            return new GetExportPipelineArgs(exportPipelineName, registryName, resourceGroupName);
        }
    }
}
