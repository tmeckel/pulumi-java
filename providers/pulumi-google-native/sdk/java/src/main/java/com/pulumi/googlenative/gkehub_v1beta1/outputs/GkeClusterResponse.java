// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GkeClusterResponse {
    /**
     * @return If cluster_missing is set then it denotes that the GKE cluster no longer exists in the GKE Control Plane.
     * 
     */
    private final Boolean clusterMissing;
    /**
     * @return Immutable. Self-link of the GCP resource for the GKE cluster. For example: //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster Zonal clusters are also supported.
     * 
     */
    private final String resourceLink;

    @CustomType.Constructor
    private GkeClusterResponse(
        @CustomType.Parameter("clusterMissing") Boolean clusterMissing,
        @CustomType.Parameter("resourceLink") String resourceLink) {
        this.clusterMissing = clusterMissing;
        this.resourceLink = resourceLink;
    }

    /**
     * @return If cluster_missing is set then it denotes that the GKE cluster no longer exists in the GKE Control Plane.
     * 
     */
    public Boolean clusterMissing() {
        return this.clusterMissing;
    }
    /**
     * @return Immutable. Self-link of the GCP resource for the GKE cluster. For example: //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster Zonal clusters are also supported.
     * 
     */
    public String resourceLink() {
        return this.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean clusterMissing;
        private String resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterMissing = defaults.clusterMissing;
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder clusterMissing(Boolean clusterMissing) {
            this.clusterMissing = Objects.requireNonNull(clusterMissing);
            return this;
        }
        public Builder resourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }        public GkeClusterResponse build() {
            return new GkeClusterResponse(clusterMissing, resourceLink);
        }
    }
}
