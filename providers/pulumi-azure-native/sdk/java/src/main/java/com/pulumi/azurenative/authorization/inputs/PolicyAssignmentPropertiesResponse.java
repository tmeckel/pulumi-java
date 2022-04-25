// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.azurenative.authorization.inputs.PolicyAssignmentPropertiesResponsePolicy;
import com.pulumi.azurenative.authorization.inputs.PolicyAssignmentPropertiesResponseRoleDefinition;
import com.pulumi.azurenative.authorization.inputs.PolicyAssignmentPropertiesResponseScope;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyAssignmentPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PolicyAssignmentPropertiesResponse Empty = new PolicyAssignmentPropertiesResponse();

    /**
     * Details of the policy
     * 
     */
    @Import(name="policy")
    private @Nullable PolicyAssignmentPropertiesResponsePolicy policy;

    /**
     * @return Details of the policy
     * 
     */
    public Optional<PolicyAssignmentPropertiesResponsePolicy> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Details of role definition
     * 
     */
    @Import(name="roleDefinition")
    private @Nullable PolicyAssignmentPropertiesResponseRoleDefinition roleDefinition;

    /**
     * @return Details of role definition
     * 
     */
    public Optional<PolicyAssignmentPropertiesResponseRoleDefinition> roleDefinition() {
        return Optional.ofNullable(this.roleDefinition);
    }

    /**
     * Details of the resource scope
     * 
     */
    @Import(name="scope")
    private @Nullable PolicyAssignmentPropertiesResponseScope scope;

    /**
     * @return Details of the resource scope
     * 
     */
    public Optional<PolicyAssignmentPropertiesResponseScope> scope() {
        return Optional.ofNullable(this.scope);
    }

    private PolicyAssignmentPropertiesResponse() {}

    private PolicyAssignmentPropertiesResponse(PolicyAssignmentPropertiesResponse $) {
        this.policy = $.policy;
        this.roleDefinition = $.roleDefinition;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyAssignmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyAssignmentPropertiesResponse $;

        public Builder() {
            $ = new PolicyAssignmentPropertiesResponse();
        }

        public Builder(PolicyAssignmentPropertiesResponse defaults) {
            $ = new PolicyAssignmentPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param policy Details of the policy
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable PolicyAssignmentPropertiesResponsePolicy policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param roleDefinition Details of role definition
         * 
         * @return builder
         * 
         */
        public Builder roleDefinition(@Nullable PolicyAssignmentPropertiesResponseRoleDefinition roleDefinition) {
            $.roleDefinition = roleDefinition;
            return this;
        }

        /**
         * @param scope Details of the resource scope
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable PolicyAssignmentPropertiesResponseScope scope) {
            $.scope = scope;
            return this;
        }

        public PolicyAssignmentPropertiesResponse build() {
            return $;
        }
    }

}
