// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The JIT authorization policies.
 * 
 */
public final class JitAuthorizationPoliciesResponse extends com.pulumi.resources.InvokeArgs {

    public static final JitAuthorizationPoliciesResponse Empty = new JitAuthorizationPoliciesResponse();

    /**
     * The the principal id that will be granted JIT access.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    /**
     * @return The the principal id that will be granted JIT access.
     * 
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * The role definition id that will be granted to the Principal.
     * 
     */
    @Import(name="roleDefinitionId", required=true)
    private String roleDefinitionId;

    /**
     * @return The role definition id that will be granted to the Principal.
     * 
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    private JitAuthorizationPoliciesResponse() {}

    private JitAuthorizationPoliciesResponse(JitAuthorizationPoliciesResponse $) {
        this.principalId = $.principalId;
        this.roleDefinitionId = $.roleDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JitAuthorizationPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JitAuthorizationPoliciesResponse $;

        public Builder() {
            $ = new JitAuthorizationPoliciesResponse();
        }

        public Builder(JitAuthorizationPoliciesResponse defaults) {
            $ = new JitAuthorizationPoliciesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The the principal id that will be granted JIT access.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param roleDefinitionId The role definition id that will be granted to the Principal.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(String roleDefinitionId) {
            $.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public JitAuthorizationPoliciesResponse build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.roleDefinitionId = Objects.requireNonNull($.roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
            return $;
        }
    }

}
