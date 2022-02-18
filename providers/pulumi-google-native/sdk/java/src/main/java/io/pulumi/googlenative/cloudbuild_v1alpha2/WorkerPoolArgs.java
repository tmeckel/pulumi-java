// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1alpha2.inputs.NetworkConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1alpha2.inputs.WorkerConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkerPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerPoolArgs Empty = new WorkerPoolArgs();

    /**
     * Network configuration for the `WorkerPool`.
     * 
     */
    @InputImport(name="networkConfig")
    private final @Nullable Input<NetworkConfigArgs> networkConfig;

    public Input<NetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Immutable. The region where the `WorkerPool` runs. Only "us-central1" is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
     * 
     */
    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    /**
     * Worker configuration for the `WorkerPool`.
     * 
     */
    @InputImport(name="workerConfig")
    private final @Nullable Input<WorkerConfigArgs> workerConfig;

    public Input<WorkerConfigArgs> getWorkerConfig() {
        return this.workerConfig == null ? Input.empty() : this.workerConfig;
    }

    @InputImport(name="workerPoolId", required=true)
    private final Input<String> workerPoolId;

    public Input<String> getWorkerPoolId() {
        return this.workerPoolId;
    }

    public WorkerPoolArgs(
        @Nullable Input<NetworkConfigArgs> networkConfig,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<WorkerConfigArgs> workerConfig,
        Input<String> workerPoolId) {
        this.networkConfig = networkConfig;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.workerConfig = workerConfig;
        this.workerPoolId = Objects.requireNonNull(workerPoolId, "expected parameter 'workerPoolId' to be non-null");
    }

    private WorkerPoolArgs() {
        this.networkConfig = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.workerConfig = Input.empty();
        this.workerPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NetworkConfigArgs> networkConfig;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<WorkerConfigArgs> workerConfig;
        private Input<String> workerPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkConfig = defaults.networkConfig;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.workerConfig = defaults.workerConfig;
    	      this.workerPoolId = defaults.workerPoolId;
        }

        public Builder setNetworkConfig(@Nullable Input<NetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable NetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
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

        public Builder setWorkerConfig(@Nullable Input<WorkerConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }

        public Builder setWorkerConfig(@Nullable WorkerConfigArgs workerConfig) {
            this.workerConfig = Input.ofNullable(workerConfig);
            return this;
        }

        public Builder setWorkerPoolId(Input<String> workerPoolId) {
            this.workerPoolId = Objects.requireNonNull(workerPoolId);
            return this;
        }

        public Builder setWorkerPoolId(String workerPoolId) {
            this.workerPoolId = Input.of(Objects.requireNonNull(workerPoolId));
            return this;
        }

        public WorkerPoolArgs build() {
            return new WorkerPoolArgs(networkConfig, project, region, workerConfig, workerPoolId);
        }
    }
}
