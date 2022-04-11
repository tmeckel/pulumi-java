// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudidentity_v1.inputs.ExpiryDetailArgs;
import io.pulumi.googlenative.cloudidentity_v1.inputs.RestrictionEvaluationsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A membership role within the Cloud Identity Groups API. A `MembershipRole` defines the privileges granted to a `Membership`.
 * 
 */
public final class MembershipRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipRoleArgs Empty = new MembershipRoleArgs();

    /**
     * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
     * 
     */
    @Import(name="expiryDetail")
      private final @Nullable Output<ExpiryDetailArgs> expiryDetail;

    public Output<ExpiryDetailArgs> getExpiryDetail() {
        return this.expiryDetail == null ? Codegen.empty() : this.expiryDetail;
    }

    /**
     * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Evaluations of restrictions applied to parent group on this membership.
     * 
     */
    @Import(name="restrictionEvaluations")
      private final @Nullable Output<RestrictionEvaluationsArgs> restrictionEvaluations;

    public Output<RestrictionEvaluationsArgs> getRestrictionEvaluations() {
        return this.restrictionEvaluations == null ? Codegen.empty() : this.restrictionEvaluations;
    }

    public MembershipRoleArgs(
        @Nullable Output<ExpiryDetailArgs> expiryDetail,
        @Nullable Output<String> name,
        @Nullable Output<RestrictionEvaluationsArgs> restrictionEvaluations) {
        this.expiryDetail = expiryDetail;
        this.name = name;
        this.restrictionEvaluations = restrictionEvaluations;
    }

    private MembershipRoleArgs() {
        this.expiryDetail = Codegen.empty();
        this.name = Codegen.empty();
        this.restrictionEvaluations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ExpiryDetailArgs> expiryDetail;
        private @Nullable Output<String> name;
        private @Nullable Output<RestrictionEvaluationsArgs> restrictionEvaluations;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryDetail = defaults.expiryDetail;
    	      this.name = defaults.name;
    	      this.restrictionEvaluations = defaults.restrictionEvaluations;
        }

        public Builder expiryDetail(@Nullable Output<ExpiryDetailArgs> expiryDetail) {
            this.expiryDetail = expiryDetail;
            return this;
        }
        public Builder expiryDetail(@Nullable ExpiryDetailArgs expiryDetail) {
            this.expiryDetail = Codegen.ofNullable(expiryDetail);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder restrictionEvaluations(@Nullable Output<RestrictionEvaluationsArgs> restrictionEvaluations) {
            this.restrictionEvaluations = restrictionEvaluations;
            return this;
        }
        public Builder restrictionEvaluations(@Nullable RestrictionEvaluationsArgs restrictionEvaluations) {
            this.restrictionEvaluations = Codegen.ofNullable(restrictionEvaluations);
            return this;
        }        public MembershipRoleArgs build() {
            return new MembershipRoleArgs(expiryDetail, name, restrictionEvaluations);
        }
    }
}
