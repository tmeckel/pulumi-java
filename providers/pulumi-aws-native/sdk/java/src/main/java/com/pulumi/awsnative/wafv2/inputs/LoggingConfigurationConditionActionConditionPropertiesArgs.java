// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.LoggingConfigurationConditionActionConditionPropertiesAction;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * A single action condition.
 * 
 */
public final class LoggingConfigurationConditionActionConditionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationConditionActionConditionPropertiesArgs Empty = new LoggingConfigurationConditionActionConditionPropertiesArgs();

    /**
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
     * 
     */
    @Import(name="action", required=true)
    private Output<LoggingConfigurationConditionActionConditionPropertiesAction> action;

    /**
     * @return Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
     * 
     */
    public Output<LoggingConfigurationConditionActionConditionPropertiesAction> action() {
        return this.action;
    }

    private LoggingConfigurationConditionActionConditionPropertiesArgs() {}

    private LoggingConfigurationConditionActionConditionPropertiesArgs(LoggingConfigurationConditionActionConditionPropertiesArgs $) {
        this.action = $.action;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationConditionActionConditionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationConditionActionConditionPropertiesArgs $;

        public Builder() {
            $ = new LoggingConfigurationConditionActionConditionPropertiesArgs();
        }

        public Builder(LoggingConfigurationConditionActionConditionPropertiesArgs defaults) {
            $ = new LoggingConfigurationConditionActionConditionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<LoggingConfigurationConditionActionConditionPropertiesAction> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
         * 
         * @return builder
         * 
         */
        public Builder action(LoggingConfigurationConditionActionConditionPropertiesAction action) {
            return action(Output.of(action));
        }

        public LoggingConfigurationConditionActionConditionPropertiesArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            return $;
        }
    }

}
