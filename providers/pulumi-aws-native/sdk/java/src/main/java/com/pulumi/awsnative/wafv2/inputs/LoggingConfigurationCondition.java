// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.LoggingConfigurationConditionActionConditionProperties;
import com.pulumi.awsnative.wafv2.inputs.LoggingConfigurationConditionLabelNameConditionProperties;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoggingConfigurationCondition extends com.pulumi.resources.InvokeArgs {

    public static final LoggingConfigurationCondition Empty = new LoggingConfigurationCondition();

    /**
     * A single action condition.
     * 
     */
    @Import(name="actionCondition")
    private @Nullable LoggingConfigurationConditionActionConditionProperties actionCondition;

    /**
     * @return A single action condition.
     * 
     */
    public Optional<LoggingConfigurationConditionActionConditionProperties> actionCondition() {
        return Optional.ofNullable(this.actionCondition);
    }

    /**
     * A single label name condition.
     * 
     */
    @Import(name="labelNameCondition")
    private @Nullable LoggingConfigurationConditionLabelNameConditionProperties labelNameCondition;

    /**
     * @return A single label name condition.
     * 
     */
    public Optional<LoggingConfigurationConditionLabelNameConditionProperties> labelNameCondition() {
        return Optional.ofNullable(this.labelNameCondition);
    }

    private LoggingConfigurationCondition() {}

    private LoggingConfigurationCondition(LoggingConfigurationCondition $) {
        this.actionCondition = $.actionCondition;
        this.labelNameCondition = $.labelNameCondition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationCondition $;

        public Builder() {
            $ = new LoggingConfigurationCondition();
        }

        public Builder(LoggingConfigurationCondition defaults) {
            $ = new LoggingConfigurationCondition(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionCondition A single action condition.
         * 
         * @return builder
         * 
         */
        public Builder actionCondition(@Nullable LoggingConfigurationConditionActionConditionProperties actionCondition) {
            $.actionCondition = actionCondition;
            return this;
        }

        /**
         * @param labelNameCondition A single label name condition.
         * 
         * @return builder
         * 
         */
        public Builder labelNameCondition(@Nullable LoggingConfigurationConditionLabelNameConditionProperties labelNameCondition) {
            $.labelNameCondition = labelNameCondition;
            return this;
        }

        public LoggingConfigurationCondition build() {
            return $;
        }
    }

}
