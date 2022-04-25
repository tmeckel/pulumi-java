// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkehub_v1beta1.inputs.EdgeClusterResponse;
import com.pulumi.googlenative.gkehub_v1beta1.inputs.GkeClusterResponse;
import com.pulumi.googlenative.gkehub_v1beta1.inputs.KubernetesMetadataResponse;
import com.pulumi.googlenative.gkehub_v1beta1.inputs.KubernetesResourceResponse;
import com.pulumi.googlenative.gkehub_v1beta1.inputs.MultiCloudClusterResponse;
import com.pulumi.googlenative.gkehub_v1beta1.inputs.OnPremClusterResponse;
import java.util.Objects;


/**
 * MembershipEndpoint contains information needed to contact a Kubernetes API, endpoint and any additional Kubernetes metadata.
 * 
 */
public final class MembershipEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final MembershipEndpointResponse Empty = new MembershipEndpointResponse();

    /**
     * Optional. Specific information for a Google Edge cluster.
     * 
     */
    @Import(name="edgeCluster", required=true)
    private EdgeClusterResponse edgeCluster;

    /**
     * @return Optional. Specific information for a Google Edge cluster.
     * 
     */
    public EdgeClusterResponse edgeCluster() {
        return this.edgeCluster;
    }

    /**
     * Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    @Import(name="gkeCluster", required=true)
    private GkeClusterResponse gkeCluster;

    /**
     * @return Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    public GkeClusterResponse gkeCluster() {
        return this.gkeCluster;
    }

    /**
     * Useful Kubernetes-specific metadata.
     * 
     */
    @Import(name="kubernetesMetadata", required=true)
    private KubernetesMetadataResponse kubernetesMetadata;

    /**
     * @return Useful Kubernetes-specific metadata.
     * 
     */
    public KubernetesMetadataResponse kubernetesMetadata() {
        return this.kubernetesMetadata;
    }

    /**
     * Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    @Import(name="kubernetesResource", required=true)
    private KubernetesResourceResponse kubernetesResource;

    /**
     * @return Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    public KubernetesResourceResponse kubernetesResource() {
        return this.kubernetesResource;
    }

    /**
     * Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    @Import(name="multiCloudCluster", required=true)
    private MultiCloudClusterResponse multiCloudCluster;

    /**
     * @return Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    public MultiCloudClusterResponse multiCloudCluster() {
        return this.multiCloudCluster;
    }

    /**
     * Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil &#34;type&#34; instead.
     * 
     */
    @Import(name="onPremCluster", required=true)
    private OnPremClusterResponse onPremCluster;

    /**
     * @return Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil &#34;type&#34; instead.
     * 
     */
    public OnPremClusterResponse onPremCluster() {
        return this.onPremCluster;
    }

    private MembershipEndpointResponse() {}

    private MembershipEndpointResponse(MembershipEndpointResponse $) {
        this.edgeCluster = $.edgeCluster;
        this.gkeCluster = $.gkeCluster;
        this.kubernetesMetadata = $.kubernetesMetadata;
        this.kubernetesResource = $.kubernetesResource;
        this.multiCloudCluster = $.multiCloudCluster;
        this.onPremCluster = $.onPremCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipEndpointResponse $;

        public Builder() {
            $ = new MembershipEndpointResponse();
        }

        public Builder(MembershipEndpointResponse defaults) {
            $ = new MembershipEndpointResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param edgeCluster Optional. Specific information for a Google Edge cluster.
         * 
         * @return builder
         * 
         */
        public Builder edgeCluster(EdgeClusterResponse edgeCluster) {
            $.edgeCluster = edgeCluster;
            return this;
        }

        /**
         * @param gkeCluster Optional. Specific information for a GKE-on-GCP cluster.
         * 
         * @return builder
         * 
         */
        public Builder gkeCluster(GkeClusterResponse gkeCluster) {
            $.gkeCluster = gkeCluster;
            return this;
        }

        /**
         * @param kubernetesMetadata Useful Kubernetes-specific metadata.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesMetadata(KubernetesMetadataResponse kubernetesMetadata) {
            $.kubernetesMetadata = kubernetesMetadata;
            return this;
        }

        /**
         * @param kubernetesResource Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesResource(KubernetesResourceResponse kubernetesResource) {
            $.kubernetesResource = kubernetesResource;
            return this;
        }

        /**
         * @param multiCloudCluster Optional. Specific information for a GKE Multi-Cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder multiCloudCluster(MultiCloudClusterResponse multiCloudCluster) {
            $.multiCloudCluster = multiCloudCluster;
            return this;
        }

        /**
         * @param onPremCluster Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil &#34;type&#34; instead.
         * 
         * @return builder
         * 
         */
        public Builder onPremCluster(OnPremClusterResponse onPremCluster) {
            $.onPremCluster = onPremCluster;
            return this;
        }

        public MembershipEndpointResponse build() {
            $.edgeCluster = Objects.requireNonNull($.edgeCluster, "expected parameter 'edgeCluster' to be non-null");
            $.gkeCluster = Objects.requireNonNull($.gkeCluster, "expected parameter 'gkeCluster' to be non-null");
            $.kubernetesMetadata = Objects.requireNonNull($.kubernetesMetadata, "expected parameter 'kubernetesMetadata' to be non-null");
            $.kubernetesResource = Objects.requireNonNull($.kubernetesResource, "expected parameter 'kubernetesResource' to be non-null");
            $.multiCloudCluster = Objects.requireNonNull($.multiCloudCluster, "expected parameter 'multiCloudCluster' to be non-null");
            $.onPremCluster = Objects.requireNonNull($.onPremCluster, "expected parameter 'onPremCluster' to be non-null");
            return $;
        }
    }

}
