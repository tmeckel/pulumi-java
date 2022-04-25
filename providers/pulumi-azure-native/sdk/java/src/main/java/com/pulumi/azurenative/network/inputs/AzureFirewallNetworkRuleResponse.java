// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the network rule.
 * 
 */
public final class AzureFirewallNetworkRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFirewallNetworkRuleResponse Empty = new AzureFirewallNetworkRuleResponse();

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Description of the rule.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable List<String> destinationAddresses;

    /**
     * @return List of destination IP addresses.
     * 
     */
    public Optional<List<String>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * List of destination FQDNs.
     * 
     */
    @Import(name="destinationFqdns")
    private @Nullable List<String> destinationFqdns;

    /**
     * @return List of destination FQDNs.
     * 
     */
    public Optional<List<String>> destinationFqdns() {
        return Optional.ofNullable(this.destinationFqdns);
    }

    /**
     * List of destination IpGroups for this rule.
     * 
     */
    @Import(name="destinationIpGroups")
    private @Nullable List<String> destinationIpGroups;

    /**
     * @return List of destination IpGroups for this rule.
     * 
     */
    public Optional<List<String>> destinationIpGroups() {
        return Optional.ofNullable(this.destinationIpGroups);
    }

    /**
     * List of destination ports.
     * 
     */
    @Import(name="destinationPorts")
    private @Nullable List<String> destinationPorts;

    /**
     * @return List of destination ports.
     * 
     */
    public Optional<List<String>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    /**
     * Name of the network rule.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the network rule.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Array of AzureFirewallNetworkRuleProtocols.
     * 
     */
    @Import(name="protocols")
    private @Nullable List<String> protocols;

    /**
     * @return Array of AzureFirewallNetworkRuleProtocols.
     * 
     */
    public Optional<List<String>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable List<String> sourceAddresses;

    /**
     * @return List of source IP addresses for this rule.
     * 
     */
    public Optional<List<String>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
    private @Nullable List<String> sourceIpGroups;

    /**
     * @return List of source IpGroups for this rule.
     * 
     */
    public Optional<List<String>> sourceIpGroups() {
        return Optional.ofNullable(this.sourceIpGroups);
    }

    private AzureFirewallNetworkRuleResponse() {}

    private AzureFirewallNetworkRuleResponse(AzureFirewallNetworkRuleResponse $) {
        this.description = $.description;
        this.destinationAddresses = $.destinationAddresses;
        this.destinationFqdns = $.destinationFqdns;
        this.destinationIpGroups = $.destinationIpGroups;
        this.destinationPorts = $.destinationPorts;
        this.name = $.name;
        this.protocols = $.protocols;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallNetworkRuleResponse $;

        public Builder() {
            $ = new AzureFirewallNetworkRuleResponse();
        }

        public Builder(AzureFirewallNetworkRuleResponse defaults) {
            $ = new AzureFirewallNetworkRuleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param destinationAddresses List of destination IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        /**
         * @param destinationAddresses List of destination IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }

        /**
         * @param destinationFqdns List of destination FQDNs.
         * 
         * @return builder
         * 
         */
        public Builder destinationFqdns(@Nullable List<String> destinationFqdns) {
            $.destinationFqdns = destinationFqdns;
            return this;
        }

        /**
         * @param destinationFqdns List of destination FQDNs.
         * 
         * @return builder
         * 
         */
        public Builder destinationFqdns(String... destinationFqdns) {
            return destinationFqdns(List.of(destinationFqdns));
        }

        /**
         * @param destinationIpGroups List of destination IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder destinationIpGroups(@Nullable List<String> destinationIpGroups) {
            $.destinationIpGroups = destinationIpGroups;
            return this;
        }

        /**
         * @param destinationIpGroups List of destination IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
        }

        /**
         * @param destinationPorts List of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        /**
         * @param destinationPorts List of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }

        /**
         * @param name Name of the network rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param protocols Array of AzureFirewallNetworkRuleProtocols.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable List<String> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols Array of AzureFirewallNetworkRuleProtocols.
         * 
         * @return builder
         * 
         */
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }

        /**
         * @param sourceIpGroups List of source IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            $.sourceIpGroups = sourceIpGroups;
            return this;
        }

        /**
         * @param sourceIpGroups List of source IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }

        public AzureFirewallNetworkRuleResponse build() {
            return $;
        }
    }

}
