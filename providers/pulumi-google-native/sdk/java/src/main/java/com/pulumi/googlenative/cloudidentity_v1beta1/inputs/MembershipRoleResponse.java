// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudidentity_v1beta1.inputs.ExpiryDetailResponse;
import com.pulumi.googlenative.cloudidentity_v1beta1.inputs.RestrictionEvaluationsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A membership role within the Cloud Identity Groups API. A `MembershipRole` defines the privileges granted to a `Membership`.
 * 
 */
public final class MembershipRoleResponse extends com.pulumi.resources.InvokeArgs {

    public static final MembershipRoleResponse Empty = new MembershipRoleResponse();

    /**
     * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
     * 
     */
    @Import(name="expiryDetail", required=true)
    private ExpiryDetailResponse expiryDetail;

    /**
     * @return The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
     * 
     */
    public ExpiryDetailResponse expiryDetail() {
        return this.expiryDetail;
    }

    /**
     * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Evaluations of restrictions applied to parent group on this membership.
     * 
     */
    @Import(name="restrictionEvaluations", required=true)
    private RestrictionEvaluationsResponse restrictionEvaluations;

    /**
     * @return Evaluations of restrictions applied to parent group on this membership.
     * 
     */
    public RestrictionEvaluationsResponse restrictionEvaluations() {
        return this.restrictionEvaluations;
    }

    private MembershipRoleResponse() {}

    private MembershipRoleResponse(MembershipRoleResponse $) {
        this.expiryDetail = $.expiryDetail;
        this.name = $.name;
        this.restrictionEvaluations = $.restrictionEvaluations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipRoleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipRoleResponse $;

        public Builder() {
            $ = new MembershipRoleResponse();
        }

        public Builder(MembershipRoleResponse defaults) {
            $ = new MembershipRoleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiryDetail The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
         * 
         * @return builder
         * 
         */
        public Builder expiryDetail(ExpiryDetailResponse expiryDetail) {
            $.expiryDetail = expiryDetail;
            return this;
        }

        /**
         * @param name The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param restrictionEvaluations Evaluations of restrictions applied to parent group on this membership.
         * 
         * @return builder
         * 
         */
        public Builder restrictionEvaluations(RestrictionEvaluationsResponse restrictionEvaluations) {
            $.restrictionEvaluations = restrictionEvaluations;
            return this;
        }

        public MembershipRoleResponse build() {
            $.expiryDetail = Objects.requireNonNull($.expiryDetail, "expected parameter 'expiryDetail' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.restrictionEvaluations = Objects.requireNonNull($.restrictionEvaluations, "expected parameter 'restrictionEvaluations' to be non-null");
            return $;
        }
    }

}
