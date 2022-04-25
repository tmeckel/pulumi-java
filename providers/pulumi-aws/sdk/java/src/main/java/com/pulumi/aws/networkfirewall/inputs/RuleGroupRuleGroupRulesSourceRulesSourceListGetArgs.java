// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs Empty = new RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs();

    /**
     * String value to specify whether domains in the target list are allowed or denied access. Valid values: `ALLOWLIST`, `DENYLIST`.
     * 
     */
    @Import(name="generatedRulesType", required=true)
    private Output<String> generatedRulesType;

    /**
     * @return String value to specify whether domains in the target list are allowed or denied access. Valid values: `ALLOWLIST`, `DENYLIST`.
     * 
     */
    public Output<String> generatedRulesType() {
        return this.generatedRulesType;
    }

    /**
     * Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
     * 
     */
    @Import(name="targetTypes", required=true)
    private Output<List<String>> targetTypes;

    /**
     * @return Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
     * 
     */
    public Output<List<String>> targetTypes() {
        return this.targetTypes;
    }

    /**
     * Set of domains that you want to inspect for in your traffic flows.
     * 
     */
    @Import(name="targets", required=true)
    private Output<List<String>> targets;

    /**
     * @return Set of domains that you want to inspect for in your traffic flows.
     * 
     */
    public Output<List<String>> targets() {
        return this.targets;
    }

    private RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs() {}

    private RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs(RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs $) {
        this.generatedRulesType = $.generatedRulesType;
        this.targetTypes = $.targetTypes;
        this.targets = $.targets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs();
        }

        public Builder(RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs defaults) {
            $ = new RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param generatedRulesType String value to specify whether domains in the target list are allowed or denied access. Valid values: `ALLOWLIST`, `DENYLIST`.
         * 
         * @return builder
         * 
         */
        public Builder generatedRulesType(Output<String> generatedRulesType) {
            $.generatedRulesType = generatedRulesType;
            return this;
        }

        /**
         * @param generatedRulesType String value to specify whether domains in the target list are allowed or denied access. Valid values: `ALLOWLIST`, `DENYLIST`.
         * 
         * @return builder
         * 
         */
        public Builder generatedRulesType(String generatedRulesType) {
            return generatedRulesType(Output.of(generatedRulesType));
        }

        /**
         * @param targetTypes Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
         * 
         * @return builder
         * 
         */
        public Builder targetTypes(Output<List<String>> targetTypes) {
            $.targetTypes = targetTypes;
            return this;
        }

        /**
         * @param targetTypes Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
         * 
         * @return builder
         * 
         */
        public Builder targetTypes(List<String> targetTypes) {
            return targetTypes(Output.of(targetTypes));
        }

        /**
         * @param targetTypes Set of types of domain specifications that are provided in the `targets` argument. Valid values: `HTTP_HOST`, `TLS_SNI`.
         * 
         * @return builder
         * 
         */
        public Builder targetTypes(String... targetTypes) {
            return targetTypes(List.of(targetTypes));
        }

        /**
         * @param targets Set of domains that you want to inspect for in your traffic flows.
         * 
         * @return builder
         * 
         */
        public Builder targets(Output<List<String>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets Set of domains that you want to inspect for in your traffic flows.
         * 
         * @return builder
         * 
         */
        public Builder targets(List<String> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param targets Set of domains that you want to inspect for in your traffic flows.
         * 
         * @return builder
         * 
         */
        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }

        public RuleGroupRuleGroupRulesSourceRulesSourceListGetArgs build() {
            $.generatedRulesType = Objects.requireNonNull($.generatedRulesType, "expected parameter 'generatedRulesType' to be non-null");
            $.targetTypes = Objects.requireNonNull($.targetTypes, "expected parameter 'targetTypes' to be non-null");
            $.targets = Objects.requireNonNull($.targets, "expected parameter 'targets' to be non-null");
            return $;
        }
    }

}
