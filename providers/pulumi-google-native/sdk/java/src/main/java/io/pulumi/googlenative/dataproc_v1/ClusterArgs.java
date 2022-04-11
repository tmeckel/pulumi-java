// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dataproc_v1.inputs.ClusterConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    @Import(name="actionOnFailedPrimaryWorkers")
      private final @Nullable Output<String> actionOnFailedPrimaryWorkers;

    public Output<String> getActionOnFailedPrimaryWorkers() {
        return this.actionOnFailedPrimaryWorkers == null ? Codegen.empty() : this.actionOnFailedPrimaryWorkers;
    }

    /**
     * The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Optional. The cluster config for a cluster of Compute Engine Instances. Note that Dataproc may set default values, and values may change when clusters are updated.
     * 
     */
    @Import(name="config")
      private final @Nullable Output<ClusterConfigArgs> config;

    public Output<ClusterConfigArgs> getConfig() {
        return this.config == null ? Codegen.empty() : this.config;
    }

    /**
     * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The Google Cloud Platform project ID that the cluster belongs to.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    public ClusterArgs(
        @Nullable Output<String> actionOnFailedPrimaryWorkers,
        Output<String> clusterName,
        @Nullable Output<ClusterConfigArgs> config,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId) {
        this.actionOnFailedPrimaryWorkers = actionOnFailedPrimaryWorkers;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.config = config;
        this.labels = labels;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
    }

    private ClusterArgs() {
        this.actionOnFailedPrimaryWorkers = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.config = Codegen.empty();
        this.labels = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionOnFailedPrimaryWorkers;
        private Output<String> clusterName;
        private @Nullable Output<ClusterConfigArgs> config;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionOnFailedPrimaryWorkers = defaults.actionOnFailedPrimaryWorkers;
    	      this.clusterName = defaults.clusterName;
    	      this.config = defaults.config;
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
        }

        public Builder actionOnFailedPrimaryWorkers(@Nullable Output<String> actionOnFailedPrimaryWorkers) {
            this.actionOnFailedPrimaryWorkers = actionOnFailedPrimaryWorkers;
            return this;
        }
        public Builder actionOnFailedPrimaryWorkers(@Nullable String actionOnFailedPrimaryWorkers) {
            this.actionOnFailedPrimaryWorkers = Codegen.ofNullable(actionOnFailedPrimaryWorkers);
            return this;
        }
        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder config(@Nullable Output<ClusterConfigArgs> config) {
            this.config = config;
            return this;
        }
        public Builder config(@Nullable ClusterConfigArgs config) {
            this.config = Codegen.ofNullable(config);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }        public ClusterArgs build() {
            return new ClusterArgs(actionOnFailedPrimaryWorkers, clusterName, config, labels, project, region, requestId);
        }
    }
}
