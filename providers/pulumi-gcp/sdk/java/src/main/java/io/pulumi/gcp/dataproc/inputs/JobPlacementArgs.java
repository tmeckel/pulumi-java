// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPlacementArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPlacementArgs Empty = new JobPlacementArgs();

    @InputImport(name="clusterName", required=true)
      private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    @InputImport(name="clusterUuid")
      private final @Nullable Input<String> clusterUuid;

    public Input<String> getClusterUuid() {
        return this.clusterUuid == null ? Input.empty() : this.clusterUuid;
    }

    public JobPlacementArgs(
        Input<String> clusterName,
        @Nullable Input<String> clusterUuid) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterUuid = clusterUuid;
    }

    private JobPlacementArgs() {
        this.clusterName = Input.empty();
        this.clusterUuid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private @Nullable Input<String> clusterUuid;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPlacementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterUuid = defaults.clusterUuid;
        }

        public Builder clusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder clusterUuid(@Nullable Input<String> clusterUuid) {
            this.clusterUuid = clusterUuid;
            return this;
        }

        public Builder clusterUuid(@Nullable String clusterUuid) {
            this.clusterUuid = Input.ofNullable(clusterUuid);
            return this;
        }
        public JobPlacementArgs build() {
            return new JobPlacementArgs(clusterName, clusterUuid);
        }
    }
}
