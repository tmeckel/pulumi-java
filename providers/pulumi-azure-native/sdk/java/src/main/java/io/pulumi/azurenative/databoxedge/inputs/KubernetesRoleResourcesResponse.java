// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.KubernetesRoleComputeResponse;
import io.pulumi.azurenative.databoxedge.inputs.KubernetesRoleNetworkResponse;
import io.pulumi.azurenative.databoxedge.inputs.KubernetesRoleStorageResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubernetes role resources
 * 
 */
public final class KubernetesRoleResourcesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KubernetesRoleResourcesResponse Empty = new KubernetesRoleResourcesResponse();

    /**
     * Kubernetes role compute resource
     * 
     */
    @InputImport(name="compute", required=true)
      private final KubernetesRoleComputeResponse compute;

    public KubernetesRoleComputeResponse getCompute() {
        return this.compute;
    }

    /**
     * Kubernetes role network resource
     * 
     */
    @InputImport(name="network", required=true)
      private final KubernetesRoleNetworkResponse network;

    public KubernetesRoleNetworkResponse getNetwork() {
        return this.network;
    }

    /**
     * Kubernetes role storage resource
     * 
     */
    @InputImport(name="storage")
      private final @Nullable KubernetesRoleStorageResponse storage;

    public Optional<KubernetesRoleStorageResponse> getStorage() {
        return this.storage == null ? Optional.empty() : Optional.ofNullable(this.storage);
    }

    public KubernetesRoleResourcesResponse(
        KubernetesRoleComputeResponse compute,
        KubernetesRoleNetworkResponse network,
        @Nullable KubernetesRoleStorageResponse storage) {
        this.compute = Objects.requireNonNull(compute, "expected parameter 'compute' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.storage = storage;
    }

    private KubernetesRoleResourcesResponse() {
        this.compute = null;
        this.network = null;
        this.storage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesRoleComputeResponse compute;
        private KubernetesRoleNetworkResponse network;
        private @Nullable KubernetesRoleStorageResponse storage;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compute = defaults.compute;
    	      this.network = defaults.network;
    	      this.storage = defaults.storage;
        }

        public Builder compute(KubernetesRoleComputeResponse compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }

        public Builder network(KubernetesRoleNetworkResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder storage(@Nullable KubernetesRoleStorageResponse storage) {
            this.storage = storage;
            return this;
        }
        public KubernetesRoleResourcesResponse build() {
            return new KubernetesRoleResourcesResponse(compute, network, storage);
        }
    }
}
