// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.NetworkConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.WorkerConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class PrivatePoolV1ConfigResponse {
    /**
     * Network configuration for the pool.
     * 
     */
    private final NetworkConfigResponse networkConfig;
    /**
     * Machine configuration for the workers in the pool.
     * 
     */
    private final WorkerConfigResponse workerConfig;

    @OutputCustomType.Constructor({"networkConfig","workerConfig"})
    private PrivatePoolV1ConfigResponse(
        NetworkConfigResponse networkConfig,
        WorkerConfigResponse workerConfig) {
        this.networkConfig = Objects.requireNonNull(networkConfig);
        this.workerConfig = Objects.requireNonNull(workerConfig);
    }

    /**
     * Network configuration for the pool.
     * 
     */
    public NetworkConfigResponse getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * Machine configuration for the workers in the pool.
     * 
     */
    public WorkerConfigResponse getWorkerConfig() {
        return this.workerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivatePoolV1ConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkConfigResponse networkConfig;
        private WorkerConfigResponse workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivatePoolV1ConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkConfig = defaults.networkConfig;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder setNetworkConfig(NetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }

        public Builder setWorkerConfig(WorkerConfigResponse workerConfig) {
            this.workerConfig = Objects.requireNonNull(workerConfig);
            return this;
        }

        public PrivatePoolV1ConfigResponse build() {
            return new PrivatePoolV1ConfigResponse(networkConfig, workerConfig);
        }
    }
}
