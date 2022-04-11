// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterNodeConfigEphemeralStorageConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigEphemeralStorageConfigGetArgs Empty = new ClusterNodeConfigEphemeralStorageConfigGetArgs();

    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    @Import(name="localSsdCount", required=true)
      private final Output<Integer> localSsdCount;

    public Output<Integer> getLocalSsdCount() {
        return this.localSsdCount;
    }

    public ClusterNodeConfigEphemeralStorageConfigGetArgs(Output<Integer> localSsdCount) {
        this.localSsdCount = Objects.requireNonNull(localSsdCount, "expected parameter 'localSsdCount' to be non-null");
    }

    private ClusterNodeConfigEphemeralStorageConfigGetArgs() {
        this.localSsdCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigEphemeralStorageConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> localSsdCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigEphemeralStorageConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        public Builder localSsdCount(Output<Integer> localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }
        public Builder localSsdCount(Integer localSsdCount) {
            this.localSsdCount = Output.of(Objects.requireNonNull(localSsdCount));
            return this;
        }        public ClusterNodeConfigEphemeralStorageConfigGetArgs build() {
            return new ClusterNodeConfigEphemeralStorageConfigGetArgs(localSsdCount);
        }
    }
}
