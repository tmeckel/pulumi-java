// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.outputs.SecurityPolicyWebApplicationFirewallAssociationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityPolicyWebApplicationFirewallParametersResponse {
    /**
     * Waf associations
     * 
     */
    private final @Nullable List<SecurityPolicyWebApplicationFirewallAssociationResponse> associations;
    /**
     * The type of the Security policy to create.
     * Expected value is 'WebApplicationFirewall'.
     * 
     */
    private final String type;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable ResourceReferenceResponse wafPolicy;

    @OutputCustomType.Constructor
    private SecurityPolicyWebApplicationFirewallParametersResponse(
        @OutputCustomType.Parameter("associations") @Nullable List<SecurityPolicyWebApplicationFirewallAssociationResponse> associations,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("wafPolicy") @Nullable ResourceReferenceResponse wafPolicy) {
        this.associations = associations;
        this.type = type;
        this.wafPolicy = wafPolicy;
    }

    /**
     * Waf associations
     * 
    */
    public List<SecurityPolicyWebApplicationFirewallAssociationResponse> getAssociations() {
        return this.associations == null ? List.of() : this.associations;
    }
    /**
     * The type of the Security policy to create.
     * Expected value is 'WebApplicationFirewall'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<ResourceReferenceResponse> getWafPolicy() {
        return Optional.ofNullable(this.wafPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyWebApplicationFirewallParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SecurityPolicyWebApplicationFirewallAssociationResponse> associations;
        private String type;
        private @Nullable ResourceReferenceResponse wafPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyWebApplicationFirewallParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associations = defaults.associations;
    	      this.type = defaults.type;
    	      this.wafPolicy = defaults.wafPolicy;
        }

        public Builder associations(@Nullable List<SecurityPolicyWebApplicationFirewallAssociationResponse> associations) {
            this.associations = associations;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder wafPolicy(@Nullable ResourceReferenceResponse wafPolicy) {
            this.wafPolicy = wafPolicy;
            return this;
        }
        public SecurityPolicyWebApplicationFirewallParametersResponse build() {
            return new SecurityPolicyWebApplicationFirewallParametersResponse(associations, type, wafPolicy);
        }
    }
}
