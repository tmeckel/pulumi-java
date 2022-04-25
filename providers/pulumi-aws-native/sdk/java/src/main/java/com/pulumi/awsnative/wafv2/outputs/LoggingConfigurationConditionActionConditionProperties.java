// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.enums.LoggingConfigurationConditionActionConditionPropertiesAction;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class LoggingConfigurationConditionActionConditionProperties {
    /**
     * @return Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
     * 
     */
    private final LoggingConfigurationConditionActionConditionPropertiesAction action;

    @CustomType.Constructor
    private LoggingConfigurationConditionActionConditionProperties(@CustomType.Parameter("action") LoggingConfigurationConditionActionConditionPropertiesAction action) {
        this.action = action;
    }

    /**
     * @return Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
     * 
     */
    public LoggingConfigurationConditionActionConditionPropertiesAction action() {
        return this.action;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationConditionActionConditionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationConditionActionConditionPropertiesAction action;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationConditionActionConditionProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
        }

        public Builder action(LoggingConfigurationConditionActionConditionPropertiesAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }        public LoggingConfigurationConditionActionConditionProperties build() {
            return new LoggingConfigurationConditionActionConditionProperties(action);
        }
    }
}
