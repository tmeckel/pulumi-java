// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.FirewallPolicyRuleConditionApplicationProtocolArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule condition of type application.
 * 
 */
public final class ApplicationRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationRuleConditionArgs Empty = new ApplicationRuleConditionArgs();

    /**
     * Description of the rule condition.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the rule condition.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable Output<List<String>> destinationAddresses;

    /**
     * @return List of destination IP addresses or Service Tags.
     * 
     */
    public Optional<Output<List<String>>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * List of FQDN Tags for this rule condition.
     * 
     */
    @Import(name="fqdnTags")
    private @Nullable Output<List<String>> fqdnTags;

    /**
     * @return List of FQDN Tags for this rule condition.
     * 
     */
    public Optional<Output<List<String>>> fqdnTags() {
        return Optional.ofNullable(this.fqdnTags);
    }

    /**
     * Name of the rule condition.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the rule condition.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Array of Application Protocols.
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<FirewallPolicyRuleConditionApplicationProtocolArgs>> protocols;

    /**
     * @return Array of Application Protocols.
     * 
     */
    public Optional<Output<List<FirewallPolicyRuleConditionApplicationProtocolArgs>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * Rule Condition Type.
     * Expected value is &#39;ApplicationRuleCondition&#39;.
     * 
     */
    @Import(name="ruleConditionType", required=true)
    private Output<String> ruleConditionType;

    /**
     * @return Rule Condition Type.
     * Expected value is &#39;ApplicationRuleCondition&#39;.
     * 
     */
    public Output<String> ruleConditionType() {
        return this.ruleConditionType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable Output<List<String>> sourceAddresses;

    /**
     * @return List of source IP addresses for this rule.
     * 
     */
    public Optional<Output<List<String>>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
    private @Nullable Output<List<String>> sourceIpGroups;

    /**
     * @return List of source IpGroups for this rule.
     * 
     */
    public Optional<Output<List<String>>> sourceIpGroups() {
        return Optional.ofNullable(this.sourceIpGroups);
    }

    /**
     * List of FQDNs for this rule condition.
     * 
     */
    @Import(name="targetFqdns")
    private @Nullable Output<List<String>> targetFqdns;

    /**
     * @return List of FQDNs for this rule condition.
     * 
     */
    public Optional<Output<List<String>>> targetFqdns() {
        return Optional.ofNullable(this.targetFqdns);
    }

    private ApplicationRuleConditionArgs() {}

    private ApplicationRuleConditionArgs(ApplicationRuleConditionArgs $) {
        this.description = $.description;
        this.destinationAddresses = $.destinationAddresses;
        this.fqdnTags = $.fqdnTags;
        this.name = $.name;
        this.protocols = $.protocols;
        this.ruleConditionType = $.ruleConditionType;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
        this.targetFqdns = $.targetFqdns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationRuleConditionArgs $;

        public Builder() {
            $ = new ApplicationRuleConditionArgs();
        }

        public Builder(ApplicationRuleConditionArgs defaults) {
            $ = new ApplicationRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationAddresses List of destination IP addresses or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        /**
         * @param destinationAddresses List of destination IP addresses or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(List<String> destinationAddresses) {
            return destinationAddresses(Output.of(destinationAddresses));
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
         * @param fqdnTags List of FQDN Tags for this rule condition.
         * 
         * @return builder
         * 
         */
        public Builder fqdnTags(@Nullable Output<List<String>> fqdnTags) {
            $.fqdnTags = fqdnTags;
            return this;
        }

        /**
         * @param fqdnTags List of FQDN Tags for this rule condition.
         * 
         * @return builder
         * 
         */
        public Builder fqdnTags(List<String> fqdnTags) {
            return fqdnTags(Output.of(fqdnTags));
        }

        /**
         * @param fqdnTags List of FQDN Tags for this rule condition.
         * 
         * @return builder
         * 
         */
        public Builder fqdnTags(String... fqdnTags) {
            return fqdnTags(List.of(fqdnTags));
        }

        /**
         * @param name Name of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocols Array of Application Protocols.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable Output<List<FirewallPolicyRuleConditionApplicationProtocolArgs>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols Array of Application Protocols.
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<FirewallPolicyRuleConditionApplicationProtocolArgs> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols Array of Application Protocols.
         * 
         * @return builder
         * 
         */
        public Builder protocols(FirewallPolicyRuleConditionApplicationProtocolArgs... protocols) {
            return protocols(List.of(protocols));
        }

        /**
         * @param ruleConditionType Rule Condition Type.
         * Expected value is &#39;ApplicationRuleCondition&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleConditionType(Output<String> ruleConditionType) {
            $.ruleConditionType = ruleConditionType;
            return this;
        }

        /**
         * @param ruleConditionType Rule Condition Type.
         * Expected value is &#39;ApplicationRuleCondition&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleConditionType(String ruleConditionType) {
            return ruleConditionType(Output.of(ruleConditionType));
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(List<String> sourceAddresses) {
            return sourceAddresses(Output.of(sourceAddresses));
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
        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            $.sourceIpGroups = sourceIpGroups;
            return this;
        }

        /**
         * @param sourceIpGroups List of source IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(List<String> sourceIpGroups) {
            return sourceIpGroups(Output.of(sourceIpGroups));
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

        /**
         * @param targetFqdns List of FQDNs for this rule condition.
         * 
         * @return builder
         * 
         */
        public Builder targetFqdns(@Nullable Output<List<String>> targetFqdns) {
            $.targetFqdns = targetFqdns;
            return this;
        }

        /**
         * @param targetFqdns List of FQDNs for this rule condition.
         * 
         * @return builder
         * 
         */
        public Builder targetFqdns(List<String> targetFqdns) {
            return targetFqdns(Output.of(targetFqdns));
        }

        /**
         * @param targetFqdns List of FQDNs for this rule condition.
         * 
         * @return builder
         * 
         */
        public Builder targetFqdns(String... targetFqdns) {
            return targetFqdns(List.of(targetFqdns));
        }

        public ApplicationRuleConditionArgs build() {
            $.ruleConditionType = Codegen.stringProp("ruleConditionType").output().arg($.ruleConditionType).require();
            return $;
        }
    }

}
