// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dns_v1.outputs.PolicyAlternativeNameServerConfigResponse;
import com.pulumi.googlenative.dns_v1.outputs.PolicyNetworkResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyResult {
    /**
     * @return Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    private final PolicyAlternativeNameServerConfigResponse alternativeNameServerConfig;
    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the policy&#39;s function.
     * 
     */
    private final String description;
    /**
     * @return Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    private final Boolean enableInboundForwarding;
    /**
     * @return Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    private final Boolean enableLogging;
    private final String kind;
    /**
     * @return User-assigned name for this policy.
     * 
     */
    private final String name;
    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    private final List<PolicyNetworkResponse> networks;

    @CustomType.Constructor
    private GetPolicyResult(
        @CustomType.Parameter("alternativeNameServerConfig") PolicyAlternativeNameServerConfigResponse alternativeNameServerConfig,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enableInboundForwarding") Boolean enableInboundForwarding,
        @CustomType.Parameter("enableLogging") Boolean enableLogging,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networks") List<PolicyNetworkResponse> networks) {
        this.alternativeNameServerConfig = alternativeNameServerConfig;
        this.description = description;
        this.enableInboundForwarding = enableInboundForwarding;
        this.enableLogging = enableLogging;
        this.kind = kind;
        this.name = name;
        this.networks = networks;
    }

    /**
     * @return Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    public PolicyAlternativeNameServerConfigResponse alternativeNameServerConfig() {
        return this.alternativeNameServerConfig;
    }
    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the policy&#39;s function.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    public Boolean enableInboundForwarding() {
        return this.enableInboundForwarding;
    }
    /**
     * @return Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    public Boolean enableLogging() {
        return this.enableLogging;
    }
    public String kind() {
        return this.kind;
    }
    /**
     * @return User-assigned name for this policy.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    public List<PolicyNetworkResponse> networks() {
        return this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyAlternativeNameServerConfigResponse alternativeNameServerConfig;
        private String description;
        private Boolean enableInboundForwarding;
        private Boolean enableLogging;
        private String kind;
        private String name;
        private List<PolicyNetworkResponse> networks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeNameServerConfig = defaults.alternativeNameServerConfig;
    	      this.description = defaults.description;
    	      this.enableInboundForwarding = defaults.enableInboundForwarding;
    	      this.enableLogging = defaults.enableLogging;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
        }

        public Builder alternativeNameServerConfig(PolicyAlternativeNameServerConfigResponse alternativeNameServerConfig) {
            this.alternativeNameServerConfig = Objects.requireNonNull(alternativeNameServerConfig);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enableInboundForwarding(Boolean enableInboundForwarding) {
            this.enableInboundForwarding = Objects.requireNonNull(enableInboundForwarding);
            return this;
        }
        public Builder enableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networks(List<PolicyNetworkResponse> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(PolicyNetworkResponse... networks) {
            return networks(List.of(networks));
        }        public GetPolicyResult build() {
            return new GetPolicyResult(alternativeNameServerConfig, description, enableInboundForwarding, enableLogging, kind, name, networks);
        }
    }
}
