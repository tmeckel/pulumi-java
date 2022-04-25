// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The managed application provider authorization.
 * 
 */
public final class ApplicationAuthorizationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationAuthorizationResponse Empty = new ApplicationAuthorizationResponse();

    /**
     * The provider&#39;s principal identifier. This is the identity that the provider will use to call ARM to manage the managed application resources.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    /**
     * @return The provider&#39;s principal identifier. This is the identity that the provider will use to call ARM to manage the managed application resources.
     * 
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * The provider&#39;s role definition identifier. This role will define all the permissions that the provider must have on the managed application&#39;s container resource group. This role definition cannot have permission to delete the resource group.
     * 
     */
    @Import(name="roleDefinitionId", required=true)
    private String roleDefinitionId;

    /**
     * @return The provider&#39;s role definition identifier. This role will define all the permissions that the provider must have on the managed application&#39;s container resource group. This role definition cannot have permission to delete the resource group.
     * 
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    private ApplicationAuthorizationResponse() {}

    private ApplicationAuthorizationResponse(ApplicationAuthorizationResponse $) {
        this.principalId = $.principalId;
        this.roleDefinitionId = $.roleDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationAuthorizationResponse $;

        public Builder() {
            $ = new ApplicationAuthorizationResponse();
        }

        public Builder(ApplicationAuthorizationResponse defaults) {
            $ = new ApplicationAuthorizationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The provider&#39;s principal identifier. This is the identity that the provider will use to call ARM to manage the managed application resources.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param roleDefinitionId The provider&#39;s role definition identifier. This role will define all the permissions that the provider must have on the managed application&#39;s container resource group. This role definition cannot have permission to delete the resource group.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(String roleDefinitionId) {
            $.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public ApplicationAuthorizationResponse build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.roleDefinitionId = Objects.requireNonNull($.roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
            return $;
        }
    }

}
