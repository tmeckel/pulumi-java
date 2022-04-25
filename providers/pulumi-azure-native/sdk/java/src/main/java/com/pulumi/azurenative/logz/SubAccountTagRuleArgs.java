// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz;

import com.pulumi.azurenative.logz.inputs.MonitoringTagRulesPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubAccountTagRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubAccountTagRuleArgs Empty = new SubAccountTagRuleArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private Output<String> monitorName;

    /**
     * @return Monitor resource name
     * 
     */
    public Output<String> monitorName() {
        return this.monitorName;
    }

    /**
     * Definition of the properties for a TagRules resource.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<MonitoringTagRulesPropertiesArgs> properties;

    /**
     * @return Definition of the properties for a TagRules resource.
     * 
     */
    public Optional<Output<MonitoringTagRulesPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="ruleSetName")
    private @Nullable Output<String> ruleSetName;

    public Optional<Output<String>> ruleSetName() {
        return Optional.ofNullable(this.ruleSetName);
    }

    /**
     * Sub Account resource name
     * 
     */
    @Import(name="subAccountName", required=true)
    private Output<String> subAccountName;

    /**
     * @return Sub Account resource name
     * 
     */
    public Output<String> subAccountName() {
        return this.subAccountName;
    }

    private SubAccountTagRuleArgs() {}

    private SubAccountTagRuleArgs(SubAccountTagRuleArgs $) {
        this.monitorName = $.monitorName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleSetName = $.ruleSetName;
        this.subAccountName = $.subAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubAccountTagRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubAccountTagRuleArgs $;

        public Builder() {
            $ = new SubAccountTagRuleArgs();
        }

        public Builder(SubAccountTagRuleArgs defaults) {
            $ = new SubAccountTagRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(Output<String> monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(String monitorName) {
            return monitorName(Output.of(monitorName));
        }

        /**
         * @param properties Definition of the properties for a TagRules resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<MonitoringTagRulesPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Definition of the properties for a TagRules resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(MonitoringTagRulesPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder ruleSetName(@Nullable Output<String> ruleSetName) {
            $.ruleSetName = ruleSetName;
            return this;
        }

        public Builder ruleSetName(String ruleSetName) {
            return ruleSetName(Output.of(ruleSetName));
        }

        /**
         * @param subAccountName Sub Account resource name
         * 
         * @return builder
         * 
         */
        public Builder subAccountName(Output<String> subAccountName) {
            $.subAccountName = subAccountName;
            return this;
        }

        /**
         * @param subAccountName Sub Account resource name
         * 
         * @return builder
         * 
         */
        public Builder subAccountName(String subAccountName) {
            return subAccountName(Output.of(subAccountName));
        }

        public SubAccountTagRuleArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.subAccountName = Objects.requireNonNull($.subAccountName, "expected parameter 'subAccountName' to be non-null");
            return $;
        }
    }

}
