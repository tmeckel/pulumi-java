// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * KubernetesMetadata provides informational metadata for Memberships representing Kubernetes clusters.
 * 
 */
public final class KubernetesMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final KubernetesMetadataResponse Empty = new KubernetesMetadataResponse();

    /**
     * Kubernetes API server version string as reported by `/version`.
     * 
     */
    @Import(name="kubernetesApiServerVersion", required=true)
    private String kubernetesApiServerVersion;

    /**
     * @return Kubernetes API server version string as reported by `/version`.
     * 
     */
    public String kubernetesApiServerVersion() {
        return this.kubernetesApiServerVersion;
    }

    /**
     * The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
     * 
     */
    @Import(name="memoryMb", required=true)
    private Integer memoryMb;

    /**
     * @return The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
     * 
     */
    public Integer memoryMb() {
        return this.memoryMb;
    }

    /**
     * Node count as reported by Kubernetes nodes resources.
     * 
     */
    @Import(name="nodeCount", required=true)
    private Integer nodeCount;

    /**
     * @return Node count as reported by Kubernetes nodes resources.
     * 
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
     * 
     */
    @Import(name="nodeProviderId", required=true)
    private String nodeProviderId;

    /**
     * @return Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
     * 
     */
    public String nodeProviderId() {
        return this.nodeProviderId;
    }

    /**
     * The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
     * 
     */
    @Import(name="updateTime", required=true)
    private String updateTime;

    /**
     * @return The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    /**
     * vCPU count as reported by Kubernetes nodes resources.
     * 
     */
    @Import(name="vcpuCount", required=true)
    private Integer vcpuCount;

    /**
     * @return vCPU count as reported by Kubernetes nodes resources.
     * 
     */
    public Integer vcpuCount() {
        return this.vcpuCount;
    }

    private KubernetesMetadataResponse() {}

    private KubernetesMetadataResponse(KubernetesMetadataResponse $) {
        this.kubernetesApiServerVersion = $.kubernetesApiServerVersion;
        this.memoryMb = $.memoryMb;
        this.nodeCount = $.nodeCount;
        this.nodeProviderId = $.nodeProviderId;
        this.updateTime = $.updateTime;
        this.vcpuCount = $.vcpuCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesMetadataResponse $;

        public Builder() {
            $ = new KubernetesMetadataResponse();
        }

        public Builder(KubernetesMetadataResponse defaults) {
            $ = new KubernetesMetadataResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param kubernetesApiServerVersion Kubernetes API server version string as reported by `/version`.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesApiServerVersion(String kubernetesApiServerVersion) {
            $.kubernetesApiServerVersion = kubernetesApiServerVersion;
            return this;
        }

        /**
         * @param memoryMb The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
         * 
         * @return builder
         * 
         */
        public Builder memoryMb(Integer memoryMb) {
            $.memoryMb = memoryMb;
            return this;
        }

        /**
         * @param nodeCount Node count as reported by Kubernetes nodes resources.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeProviderId Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
         * 
         * @return builder
         * 
         */
        public Builder nodeProviderId(String nodeProviderId) {
            $.nodeProviderId = nodeProviderId;
            return this;
        }

        /**
         * @param updateTime The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param vcpuCount vCPU count as reported by Kubernetes nodes resources.
         * 
         * @return builder
         * 
         */
        public Builder vcpuCount(Integer vcpuCount) {
            $.vcpuCount = vcpuCount;
            return this;
        }

        public KubernetesMetadataResponse build() {
            $.kubernetesApiServerVersion = Objects.requireNonNull($.kubernetesApiServerVersion, "expected parameter 'kubernetesApiServerVersion' to be non-null");
            $.memoryMb = Objects.requireNonNull($.memoryMb, "expected parameter 'memoryMb' to be non-null");
            $.nodeCount = Objects.requireNonNull($.nodeCount, "expected parameter 'nodeCount' to be non-null");
            $.nodeProviderId = Objects.requireNonNull($.nodeProviderId, "expected parameter 'nodeProviderId' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            $.vcpuCount = Objects.requireNonNull($.vcpuCount, "expected parameter 'vcpuCount' to be non-null");
            return $;
        }
    }

}
