// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs();

    /**
     * Set of flags to look for in a packet. This setting can only specify values that are also specified in `masks`.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
     */
    @Import(name="flags", required=true)
    private Output<List<String>> flags;

    /**
     * @return Set of flags to look for in a packet. This setting can only specify values that are also specified in `masks`.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
     */
    public Output<List<String>> flags() {
        return this.flags;
    }

    /**
     * Set of flags to consider in the inspection. To inspect all flags, leave this empty.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
     */
    @Import(name="masks")
    private @Nullable Output<List<String>> masks;

    /**
     * @return Set of flags to consider in the inspection. To inspect all flags, leave this empty.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
     */
    public Optional<Output<List<String>>> masks() {
        return Optional.ofNullable(this.masks);
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs() {}

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs $) {
        this.flags = $.flags;
        this.masks = $.masks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs();
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs defaults) {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param flags Set of flags to look for in a packet. This setting can only specify values that are also specified in `masks`.
         * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
         * 
         * @return builder
         * 
         */
        public Builder flags(Output<List<String>> flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param flags Set of flags to look for in a packet. This setting can only specify values that are also specified in `masks`.
         * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
         * 
         * @return builder
         * 
         */
        public Builder flags(List<String> flags) {
            return flags(Output.of(flags));
        }

        /**
         * @param flags Set of flags to look for in a packet. This setting can only specify values that are also specified in `masks`.
         * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
         * 
         * @return builder
         * 
         */
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }

        /**
         * @param masks Set of flags to consider in the inspection. To inspect all flags, leave this empty.
         * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
         * 
         * @return builder
         * 
         */
        public Builder masks(@Nullable Output<List<String>> masks) {
            $.masks = masks;
            return this;
        }

        /**
         * @param masks Set of flags to consider in the inspection. To inspect all flags, leave this empty.
         * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
         * 
         * @return builder
         * 
         */
        public Builder masks(List<String> masks) {
            return masks(Output.of(masks));
        }

        /**
         * @param masks Set of flags to consider in the inspection. To inspect all flags, leave this empty.
         * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
         * 
         * @return builder
         * 
         */
        public Builder masks(String... masks) {
            return masks(List.of(masks));
        }

        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs build() {
            $.flags = Objects.requireNonNull($.flags, "expected parameter 'flags' to be non-null");
            return $;
        }
    }

}
