// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule condition of type nat.
 * 
 */
public final class NatRuleConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final NatRuleConditionResponse Empty = new NatRuleConditionResponse();

    /**
     * Description of the rule condition.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Description of the rule condition.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable List<String> destinationAddresses;

    /**
     * @return List of destination IP addresses or Service Tags.
     * 
     */
    public Optional<List<String>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
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
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
     */
    @Import(name="ipProtocols")
    private @Nullable List<String> ipProtocols;

    /**
     * @return Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
     */
    public Optional<List<String>> ipProtocols() {
        return Optional.ofNullable(this.ipProtocols);
    }

    /**
     * Name of the rule condition.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the rule condition.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Rule Condition Type.
     * Expected value is &#39;NatRuleCondition&#39;.
     * 
     */
    @Import(name="ruleConditionType", required=true)
    private String ruleConditionType;

    /**
     * @return Rule Condition Type.
     * Expected value is &#39;NatRuleCondition&#39;.
     * 
     */
    public String ruleConditionType() {
        return this.ruleConditionType;
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

    private NatRuleConditionResponse() {}

    private NatRuleConditionResponse(NatRuleConditionResponse $) {
        this.description = $.description;
        this.destinationAddresses = $.destinationAddresses;
        this.destinationPorts = $.destinationPorts;
        this.ipProtocols = $.ipProtocols;
        this.name = $.name;
        this.ruleConditionType = $.ruleConditionType;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NatRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NatRuleConditionResponse $;

        public Builder() {
            $ = new NatRuleConditionResponse();
        }

        public Builder(NatRuleConditionResponse defaults) {
            $ = new NatRuleConditionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param destinationAddresses List of destination IP addresses or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        /**
         * @param destinationAddresses List of destination IP addresses or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
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
         * @param ipProtocols Array of FirewallPolicyRuleConditionNetworkProtocols.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocols(@Nullable List<String> ipProtocols) {
            $.ipProtocols = ipProtocols;
            return this;
        }

        /**
         * @param ipProtocols Array of FirewallPolicyRuleConditionNetworkProtocols.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocols(String... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }

        /**
         * @param name Name of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param ruleConditionType Rule Condition Type.
         * Expected value is &#39;NatRuleCondition&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleConditionType(String ruleConditionType) {
            $.ruleConditionType = ruleConditionType;
            return this;
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

        public NatRuleConditionResponse build() {
            $.ruleConditionType = Codegen.stringProp("ruleConditionType").arg($.ruleConditionType).require();
            return $;
        }
    }

}
