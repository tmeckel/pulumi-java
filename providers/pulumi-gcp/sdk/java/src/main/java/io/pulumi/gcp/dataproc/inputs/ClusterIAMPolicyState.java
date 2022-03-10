// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterIAMPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterIAMPolicyState Empty = new ClusterIAMPolicyState();

    /**
     * The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    @InputImport(name="cluster")
      private final @Nullable Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster == null ? Input.empty() : this.cluster;
    }

    /**
     * (Computed) The etag of the clusters's IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
      private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    /**
     * The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public ClusterIAMPolicyState(
        @Nullable Input<String> cluster,
        @Nullable Input<String> etag,
        @Nullable Input<String> policyData,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.cluster = cluster;
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
        this.region = region;
    }

    private ClusterIAMPolicyState() {
        this.cluster = Input.empty();
        this.etag = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cluster;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> policyData;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIAMPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder cluster(@Nullable Input<String> cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder cluster(@Nullable String cluster) {
            this.cluster = Input.ofNullable(cluster);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder policyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder policyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }
        public ClusterIAMPolicyState build() {
            return new ClusterIAMPolicyState(cluster, etag, policyData, project, region);
        }
    }
}
