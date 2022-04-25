// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EdgeCluster contains information specific to Google Edge Clusters.
 * 
 */
public final class EdgeClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeClusterArgs Empty = new EdgeClusterArgs();

    /**
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * 
     */
    @Import(name="resourceLink")
    private @Nullable Output<String> resourceLink;

    /**
     * @return Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * 
     */
    public Optional<Output<String>> resourceLink() {
        return Optional.ofNullable(this.resourceLink);
    }

    private EdgeClusterArgs() {}

    private EdgeClusterArgs(EdgeClusterArgs $) {
        this.resourceLink = $.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeClusterArgs $;

        public Builder() {
            $ = new EdgeClusterArgs();
        }

        public Builder(EdgeClusterArgs defaults) {
            $ = new EdgeClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(@Nullable Output<String> resourceLink) {
            $.resourceLink = resourceLink;
            return this;
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(String resourceLink) {
            return resourceLink(Output.of(resourceLink));
        }

        public EdgeClusterArgs build() {
            return $;
        }
    }

}
