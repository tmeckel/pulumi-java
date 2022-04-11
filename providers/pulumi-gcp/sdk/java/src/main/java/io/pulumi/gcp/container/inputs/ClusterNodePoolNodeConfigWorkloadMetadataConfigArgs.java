// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs Empty = new ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs();

    /**
     * How to expose the node metadata to the workload running on the node.
     * Accepted values are:
     * * UNSPECIFIED: Not Set
     * * GCE_METADATA: Expose all Compute Engine metadata to pods.
     * * GKE_METADATA: Run the GKE Metadata Server on this node. The GKE Metadata Server exposes a metadata API to workloads that is compatible with the V1 Compute Metadata APIs exposed by the Compute Engine and App Engine Metadata Servers. This feature can only be enabled if [workload identity](https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity) is enabled at the cluster level.
     * 
     */
    @Import(name="mode", required=true)
      private final Output<String> mode;

    public Output<String> getMode() {
        return this.mode;
    }

    public ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs(Output<String> mode) {
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
    }

    private ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs() {
        this.mode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(Output<String> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Output.of(Objects.requireNonNull(mode));
            return this;
        }        public ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs build() {
            return new ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs(mode);
        }
    }
}
