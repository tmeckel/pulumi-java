// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EdgeCluster contains information specific to Google Edge Clusters.
 * 
 */
public final class EdgeClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeClusterArgs Empty = new EdgeClusterArgs();

    /**
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * 
     */
    @InputImport(name="resourceLink")
    private final @Nullable Input<String> resourceLink;

    public Input<String> getResourceLink() {
        return this.resourceLink == null ? Input.empty() : this.resourceLink;
    }

    public EdgeClusterArgs(@Nullable Input<String> resourceLink) {
        this.resourceLink = resourceLink;
    }

    private EdgeClusterArgs() {
        this.resourceLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder setResourceLink(@Nullable Input<String> resourceLink) {
            this.resourceLink = resourceLink;
            return this;
        }

        public Builder setResourceLink(@Nullable String resourceLink) {
            this.resourceLink = Input.ofNullable(resourceLink);
            return this;
        }

        public EdgeClusterArgs build() {
            return new EdgeClusterArgs(resourceLink);
        }
    }
}
