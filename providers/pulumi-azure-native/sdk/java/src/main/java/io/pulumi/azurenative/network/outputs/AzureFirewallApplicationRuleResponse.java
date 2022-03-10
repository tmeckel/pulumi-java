// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AzureFirewallApplicationRuleProtocolResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFirewallApplicationRuleResponse {
    /**
     * Description of the rule.
     * 
     */
    private final @Nullable String description;
    /**
     * List of FQDN Tags for this rule.
     * 
     */
    private final @Nullable List<String> fqdnTags;
    /**
     * Name of the application rule.
     * 
     */
    private final @Nullable String name;
    /**
     * Array of ApplicationRuleProtocols.
     * 
     */
    private final @Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols;
    /**
     * List of source IP addresses for this rule.
     * 
     */
    private final @Nullable List<String> sourceAddresses;
    /**
     * List of source IpGroups for this rule.
     * 
     */
    private final @Nullable List<String> sourceIpGroups;
    /**
     * List of FQDNs for this rule.
     * 
     */
    private final @Nullable List<String> targetFqdns;

    @OutputCustomType.Constructor
    private AzureFirewallApplicationRuleResponse(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("fqdnTags") @Nullable List<String> fqdnTags,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("protocols") @Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols,
        @OutputCustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @OutputCustomType.Parameter("sourceIpGroups") @Nullable List<String> sourceIpGroups,
        @OutputCustomType.Parameter("targetFqdns") @Nullable List<String> targetFqdns) {
        this.description = description;
        this.fqdnTags = fqdnTags;
        this.name = name;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.targetFqdns = targetFqdns;
    }

    /**
     * Description of the rule.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * List of FQDN Tags for this rule.
     * 
    */
    public List<String> getFqdnTags() {
        return this.fqdnTags == null ? List.of() : this.fqdnTags;
    }
    /**
     * Name of the application rule.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Array of ApplicationRuleProtocols.
     * 
    */
    public List<AzureFirewallApplicationRuleProtocolResponse> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }
    /**
     * List of source IP addresses for this rule.
     * 
    */
    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    /**
     * List of source IpGroups for this rule.
     * 
    */
    public List<String> getSourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }
    /**
     * List of FQDNs for this rule.
     * 
    */
    public List<String> getTargetFqdns() {
        return this.targetFqdns == null ? List.of() : this.targetFqdns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallApplicationRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> fqdnTags;
        private @Nullable String name;
        private @Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;
        private @Nullable List<String> targetFqdns;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallApplicationRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fqdnTags = defaults.fqdnTags;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.targetFqdns = defaults.targetFqdns;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder fqdnTags(@Nullable List<String> fqdnTags) {
            this.fqdnTags = fqdnTags;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder protocols(@Nullable List<AzureFirewallApplicationRuleProtocolResponse> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public Builder targetFqdns(@Nullable List<String> targetFqdns) {
            this.targetFqdns = targetFqdns;
            return this;
        }
        public AzureFirewallApplicationRuleResponse build() {
            return new AzureFirewallApplicationRuleResponse(description, fqdnTags, name, protocols, sourceAddresses, sourceIpGroups, targetFqdns);
        }
    }
}
