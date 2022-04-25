// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A single label name condition.
 * 
 */
public final class LoggingConfigurationConditionLabelNameConditionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationConditionLabelNameConditionPropertiesArgs Empty = new LoggingConfigurationConditionLabelNameConditionPropertiesArgs();

    /**
     * The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label.
     * 
     */
    @Import(name="labelName", required=true)
    private Output<String> labelName;

    /**
     * @return The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label.
     * 
     */
    public Output<String> labelName() {
        return this.labelName;
    }

    private LoggingConfigurationConditionLabelNameConditionPropertiesArgs() {}

    private LoggingConfigurationConditionLabelNameConditionPropertiesArgs(LoggingConfigurationConditionLabelNameConditionPropertiesArgs $) {
        this.labelName = $.labelName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationConditionLabelNameConditionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationConditionLabelNameConditionPropertiesArgs $;

        public Builder() {
            $ = new LoggingConfigurationConditionLabelNameConditionPropertiesArgs();
        }

        public Builder(LoggingConfigurationConditionLabelNameConditionPropertiesArgs defaults) {
            $ = new LoggingConfigurationConditionLabelNameConditionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labelName The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label.
         * 
         * @return builder
         * 
         */
        public Builder labelName(Output<String> labelName) {
            $.labelName = labelName;
            return this;
        }

        /**
         * @param labelName The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label.
         * 
         * @return builder
         * 
         */
        public Builder labelName(String labelName) {
            return labelName(Output.of(labelName));
        }

        public LoggingConfigurationConditionLabelNameConditionPropertiesArgs build() {
            $.labelName = Objects.requireNonNull($.labelName, "expected parameter 'labelName' to be non-null");
            return $;
        }
    }

}
