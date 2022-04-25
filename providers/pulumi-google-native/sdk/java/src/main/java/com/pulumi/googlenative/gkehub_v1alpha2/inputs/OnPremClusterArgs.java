// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OnPremCluster contains information specific to GKE On-Prem clusters.
 * 
 */
public final class OnPremClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnPremClusterArgs Empty = new OnPremClusterArgs();

    /**
     * Immutable. Whether the cluster is an admin cluster.
     * 
     */
    @Import(name="adminCluster")
    private @Nullable Output<Boolean> adminCluster;

    /**
     * @return Immutable. Whether the cluster is an admin cluster.
     * 
     */
    public Optional<Output<Boolean>> adminCluster() {
        return Optional.ofNullable(this.adminCluster);
    }

    /**
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For example: //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * 
     */
    @Import(name="resourceLink")
    private @Nullable Output<String> resourceLink;

    /**
     * @return Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For example: //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * 
     */
    public Optional<Output<String>> resourceLink() {
        return Optional.ofNullable(this.resourceLink);
    }

    private OnPremClusterArgs() {}

    private OnPremClusterArgs(OnPremClusterArgs $) {
        this.adminCluster = $.adminCluster;
        this.resourceLink = $.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnPremClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnPremClusterArgs $;

        public Builder() {
            $ = new OnPremClusterArgs();
        }

        public Builder(OnPremClusterArgs defaults) {
            $ = new OnPremClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminCluster Immutable. Whether the cluster is an admin cluster.
         * 
         * @return builder
         * 
         */
        public Builder adminCluster(@Nullable Output<Boolean> adminCluster) {
            $.adminCluster = adminCluster;
            return this;
        }

        /**
         * @param adminCluster Immutable. Whether the cluster is an admin cluster.
         * 
         * @return builder
         * 
         */
        public Builder adminCluster(Boolean adminCluster) {
            return adminCluster(Output.of(adminCluster));
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For example: //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(@Nullable Output<String> resourceLink) {
            $.resourceLink = resourceLink;
            return this;
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For example: //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(String resourceLink) {
            return resourceLink(Output.of(resourceLink));
        }

        public OnPremClusterArgs build() {
            return $;
        }
    }

}
