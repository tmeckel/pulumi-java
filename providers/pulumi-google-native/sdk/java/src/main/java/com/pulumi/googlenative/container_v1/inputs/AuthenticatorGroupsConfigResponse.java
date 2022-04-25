// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for returning group information from authenticators.
 * 
 */
public final class AuthenticatorGroupsConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuthenticatorGroupsConfigResponse Empty = new AuthenticatorGroupsConfigResponse();

    /**
     * Whether this cluster should return group membership lookups during authentication using a group of security groups.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Whether this cluster should return group membership lookups during authentication using a group of security groups.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * The name of the security group-of-groups to be used. Only relevant if enabled = true.
     * 
     */
    @Import(name="securityGroup", required=true)
    private String securityGroup;

    /**
     * @return The name of the security group-of-groups to be used. Only relevant if enabled = true.
     * 
     */
    public String securityGroup() {
        return this.securityGroup;
    }

    private AuthenticatorGroupsConfigResponse() {}

    private AuthenticatorGroupsConfigResponse(AuthenticatorGroupsConfigResponse $) {
        this.enabled = $.enabled;
        this.securityGroup = $.securityGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticatorGroupsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticatorGroupsConfigResponse $;

        public Builder() {
            $ = new AuthenticatorGroupsConfigResponse();
        }

        public Builder(AuthenticatorGroupsConfigResponse defaults) {
            $ = new AuthenticatorGroupsConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether this cluster should return group membership lookups during authentication using a group of security groups.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param securityGroup The name of the security group-of-groups to be used. Only relevant if enabled = true.
         * 
         * @return builder
         * 
         */
        public Builder securityGroup(String securityGroup) {
            $.securityGroup = securityGroup;
            return this;
        }

        public AuthenticatorGroupsConfigResponse build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.securityGroup = Objects.requireNonNull($.securityGroup, "expected parameter 'securityGroup' to be non-null");
            return $;
        }
    }

}
