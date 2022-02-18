// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A reference to a GKE cluster.
 * 
 */
public final class GkeClusterReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GkeClusterReferenceResponse Empty = new GkeClusterReferenceResponse();

    /**
     * The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{location}/clusters/{cluster}` * `locations/{location}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate the full name of the GKE cluster.
     * 
     */
    @InputImport(name="cluster", required=true)
    private final String cluster;

    public String getCluster() {
        return this.cluster;
    }

    public GkeClusterReferenceResponse(String cluster) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
    }

    private GkeClusterReferenceResponse() {
        this.cluster = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
        }

        public Builder setCluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public GkeClusterReferenceResponse build() {
            return new GkeClusterReferenceResponse(cluster);
        }
    }
}
