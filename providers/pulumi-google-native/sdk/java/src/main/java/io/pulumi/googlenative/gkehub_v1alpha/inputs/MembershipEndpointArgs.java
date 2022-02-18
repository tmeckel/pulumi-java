// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.EdgeClusterArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.GkeClusterArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.KubernetesResourceArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.MultiCloudClusterArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.OnPremClusterArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MembershipEndpoint contains information needed to contact a Kubernetes API, endpoint and any additional Kubernetes metadata.
 * 
 */
public final class MembershipEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipEndpointArgs Empty = new MembershipEndpointArgs();

    /**
     * Optional. Specific information for a Google Edge cluster.
     * 
     */
    @InputImport(name="edgeCluster")
    private final @Nullable Input<EdgeClusterArgs> edgeCluster;

    public Input<EdgeClusterArgs> getEdgeCluster() {
        return this.edgeCluster == null ? Input.empty() : this.edgeCluster;
    }

    /**
     * Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    @InputImport(name="gkeCluster")
    private final @Nullable Input<GkeClusterArgs> gkeCluster;

    public Input<GkeClusterArgs> getGkeCluster() {
        return this.gkeCluster == null ? Input.empty() : this.gkeCluster;
    }

    /**
     * Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    @InputImport(name="kubernetesResource")
    private final @Nullable Input<KubernetesResourceArgs> kubernetesResource;

    public Input<KubernetesResourceArgs> getKubernetesResource() {
        return this.kubernetesResource == null ? Input.empty() : this.kubernetesResource;
    }

    /**
     * Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    @InputImport(name="multiCloudCluster")
    private final @Nullable Input<MultiCloudClusterArgs> multiCloudCluster;

    public Input<MultiCloudClusterArgs> getMultiCloudCluster() {
        return this.multiCloudCluster == null ? Input.empty() : this.multiCloudCluster;
    }

    /**
     * Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil "type" instead.
     * 
     */
    @InputImport(name="onPremCluster")
    private final @Nullable Input<OnPremClusterArgs> onPremCluster;

    public Input<OnPremClusterArgs> getOnPremCluster() {
        return this.onPremCluster == null ? Input.empty() : this.onPremCluster;
    }

    public MembershipEndpointArgs(
        @Nullable Input<EdgeClusterArgs> edgeCluster,
        @Nullable Input<GkeClusterArgs> gkeCluster,
        @Nullable Input<KubernetesResourceArgs> kubernetesResource,
        @Nullable Input<MultiCloudClusterArgs> multiCloudCluster,
        @Nullable Input<OnPremClusterArgs> onPremCluster) {
        this.edgeCluster = edgeCluster;
        this.gkeCluster = gkeCluster;
        this.kubernetesResource = kubernetesResource;
        this.multiCloudCluster = multiCloudCluster;
        this.onPremCluster = onPremCluster;
    }

    private MembershipEndpointArgs() {
        this.edgeCluster = Input.empty();
        this.gkeCluster = Input.empty();
        this.kubernetesResource = Input.empty();
        this.multiCloudCluster = Input.empty();
        this.onPremCluster = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EdgeClusterArgs> edgeCluster;
        private @Nullable Input<GkeClusterArgs> gkeCluster;
        private @Nullable Input<KubernetesResourceArgs> kubernetesResource;
        private @Nullable Input<MultiCloudClusterArgs> multiCloudCluster;
        private @Nullable Input<OnPremClusterArgs> onPremCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edgeCluster = defaults.edgeCluster;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.kubernetesResource = defaults.kubernetesResource;
    	      this.multiCloudCluster = defaults.multiCloudCluster;
    	      this.onPremCluster = defaults.onPremCluster;
        }

        public Builder setEdgeCluster(@Nullable Input<EdgeClusterArgs> edgeCluster) {
            this.edgeCluster = edgeCluster;
            return this;
        }

        public Builder setEdgeCluster(@Nullable EdgeClusterArgs edgeCluster) {
            this.edgeCluster = Input.ofNullable(edgeCluster);
            return this;
        }

        public Builder setGkeCluster(@Nullable Input<GkeClusterArgs> gkeCluster) {
            this.gkeCluster = gkeCluster;
            return this;
        }

        public Builder setGkeCluster(@Nullable GkeClusterArgs gkeCluster) {
            this.gkeCluster = Input.ofNullable(gkeCluster);
            return this;
        }

        public Builder setKubernetesResource(@Nullable Input<KubernetesResourceArgs> kubernetesResource) {
            this.kubernetesResource = kubernetesResource;
            return this;
        }

        public Builder setKubernetesResource(@Nullable KubernetesResourceArgs kubernetesResource) {
            this.kubernetesResource = Input.ofNullable(kubernetesResource);
            return this;
        }

        public Builder setMultiCloudCluster(@Nullable Input<MultiCloudClusterArgs> multiCloudCluster) {
            this.multiCloudCluster = multiCloudCluster;
            return this;
        }

        public Builder setMultiCloudCluster(@Nullable MultiCloudClusterArgs multiCloudCluster) {
            this.multiCloudCluster = Input.ofNullable(multiCloudCluster);
            return this;
        }

        public Builder setOnPremCluster(@Nullable Input<OnPremClusterArgs> onPremCluster) {
            this.onPremCluster = onPremCluster;
            return this;
        }

        public Builder setOnPremCluster(@Nullable OnPremClusterArgs onPremCluster) {
            this.onPremCluster = Input.ofNullable(onPremCluster);
            return this;
        }

        public MembershipEndpointArgs build() {
            return new MembershipEndpointArgs(edgeCluster, gkeCluster, kubernetesResource, multiCloudCluster, onPremCluster);
        }
    }
}
