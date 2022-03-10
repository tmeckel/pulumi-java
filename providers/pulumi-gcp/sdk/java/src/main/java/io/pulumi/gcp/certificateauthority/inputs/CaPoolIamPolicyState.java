// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIamPolicyState Empty = new CaPoolIamPolicyState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="caPool")
      private final @Nullable Input<String> caPool;

    public Input<String> getCaPool() {
        return this.caPool == null ? Input.empty() : this.caPool;
    }

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
     * Location of the CaPool. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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

    public CaPoolIamPolicyState(
        @Nullable Input<String> caPool,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<String> policyData,
        @Nullable Input<String> project) {
        this.caPool = caPool;
        this.etag = etag;
        this.location = location;
        this.policyData = policyData;
        this.project = project;
    }

    private CaPoolIamPolicyState() {
        this.caPool = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> caPool;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<String> policyData;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caPool = defaults.caPool;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder caPool(@Nullable Input<String> caPool) {
            this.caPool = caPool;
            return this;
        }

        public Builder caPool(@Nullable String caPool) {
            this.caPool = Input.ofNullable(caPool);
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

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
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
        public CaPoolIamPolicyState build() {
            return new CaPoolIamPolicyState(caPool, etag, location, policyData, project);
        }
    }
}
