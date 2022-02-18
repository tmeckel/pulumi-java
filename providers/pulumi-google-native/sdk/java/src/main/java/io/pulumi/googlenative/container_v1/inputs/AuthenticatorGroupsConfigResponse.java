// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for returning group information from authenticators.
 * 
 */
public final class AuthenticatorGroupsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthenticatorGroupsConfigResponse Empty = new AuthenticatorGroupsConfigResponse();

    /**
     * Whether this cluster should return group membership lookups during authentication using a group of security groups.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * The name of the security group-of-groups to be used. Only relevant if enabled = true.
     * 
     */
    @InputImport(name="securityGroup", required=true)
    private final String securityGroup;

    public String getSecurityGroup() {
        return this.securityGroup;
    }

    public AuthenticatorGroupsConfigResponse(
        Boolean enabled,
        String securityGroup) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.securityGroup = Objects.requireNonNull(securityGroup, "expected parameter 'securityGroup' to be non-null");
    }

    private AuthenticatorGroupsConfigResponse() {
        this.enabled = null;
        this.securityGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticatorGroupsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticatorGroupsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setSecurityGroup(String securityGroup) {
            this.securityGroup = Objects.requireNonNull(securityGroup);
            return this;
        }

        public AuthenticatorGroupsConfigResponse build() {
            return new AuthenticatorGroupsConfigResponse(enabled, securityGroup);
        }
    }
}
