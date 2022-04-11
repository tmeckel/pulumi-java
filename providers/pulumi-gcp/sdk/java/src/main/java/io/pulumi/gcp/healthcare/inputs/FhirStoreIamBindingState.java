// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreIamBindingState Empty = new FhirStoreIamBindingState();

    @Import(name="condition")
      private final @Nullable Output<FhirStoreIamBindingConditionGetArgs> condition;

    public Output<FhirStoreIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the FHIR store's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="fhirStoreId")
      private final @Nullable Output<String> fhirStoreId;

    public Output<String> getFhirStoreId() {
        return this.fhirStoreId == null ? Codegen.empty() : this.fhirStoreId;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Codegen.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public FhirStoreIamBindingState(
        @Nullable Output<FhirStoreIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> fhirStoreId,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.fhirStoreId = fhirStoreId;
        this.members = members;
        this.role = role;
    }

    private FhirStoreIamBindingState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.fhirStoreId = Codegen.empty();
        this.members = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FhirStoreIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> fhirStoreId;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<FhirStoreIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable FhirStoreIamBindingConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder fhirStoreId(@Nullable Output<String> fhirStoreId) {
            this.fhirStoreId = fhirStoreId;
            return this;
        }
        public Builder fhirStoreId(@Nullable String fhirStoreId) {
            this.fhirStoreId = Codegen.ofNullable(fhirStoreId);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Codegen.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public FhirStoreIamBindingState build() {
            return new FhirStoreIamBindingState(condition, etag, fhirStoreId, members, role);
        }
    }
}
