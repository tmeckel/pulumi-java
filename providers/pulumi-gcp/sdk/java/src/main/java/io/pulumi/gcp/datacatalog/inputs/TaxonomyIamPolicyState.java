// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaxonomyIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final TaxonomyIamPolicyState Empty = new TaxonomyIamPolicyState();

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
      private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="taxonomy")
      private final @Nullable Input<String> taxonomy;

    public Input<String> getTaxonomy() {
        return this.taxonomy == null ? Input.empty() : this.taxonomy;
    }

    public TaxonomyIamPolicyState(
        @Nullable Input<String> etag,
        @Nullable Input<String> policyData,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> taxonomy) {
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
        this.region = region;
        this.taxonomy = taxonomy;
    }

    private TaxonomyIamPolicyState() {
        this.etag = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.taxonomy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaxonomyIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> etag;
        private @Nullable Input<String> policyData;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> taxonomy;

        public Builder() {
    	      // Empty
        }

        public Builder(TaxonomyIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.taxonomy = defaults.taxonomy;
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

        public Builder taxonomy(@Nullable Input<String> taxonomy) {
            this.taxonomy = taxonomy;
            return this;
        }

        public Builder taxonomy(@Nullable String taxonomy) {
            this.taxonomy = Input.ofNullable(taxonomy);
            return this;
        }
        public TaxonomyIamPolicyState build() {
            return new TaxonomyIamPolicyState(etag, policyData, project, region, taxonomy);
        }
    }
}
