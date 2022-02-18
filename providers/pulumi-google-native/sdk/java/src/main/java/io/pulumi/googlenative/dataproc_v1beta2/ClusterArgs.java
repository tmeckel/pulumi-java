// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.ClusterConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The cluster config. Note that Dataproc may set default values, and values may change when clusters are updated.
     * 
     */
    @InputImport(name="config", required=true)
    private final Input<ClusterConfigArgs> config;

    public Input<ClusterConfigArgs> getConfig() {
        return this.config;
    }

    /**
     * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The Google Cloud Platform project ID that the cluster belongs to.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    public ClusterArgs(
        Input<String> clusterName,
        Input<ClusterConfigArgs> config,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.labels = labels;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
    }

    private ClusterArgs() {
        this.clusterName = Input.empty();
        this.config = Input.empty();
        this.labels = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private Input<ClusterConfigArgs> config;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.config = defaults.config;
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setConfig(Input<ClusterConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfig(ClusterConfigArgs config) {
            this.config = Input.of(Objects.requireNonNull(config));
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public ClusterArgs build() {
            return new ClusterArgs(clusterName, config, labels, project, region, requestId);
        }
    }
}
