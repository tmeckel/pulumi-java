// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationLoggingFilterFilterConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationLoggingFilterFilterConditionArgs Empty = new WebAclLoggingConfigurationLoggingFilterFilterConditionArgs();

    /**
     * A single action condition. See Action Condition below for more details.
     * 
     */
    @Import(name="actionCondition")
      private final @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> actionCondition;

    public Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> getActionCondition() {
        return this.actionCondition == null ? Codegen.empty() : this.actionCondition;
    }

    /**
     * A single label name condition. See Label Name Condition below for more details.
     * 
     */
    @Import(name="labelNameCondition")
      private final @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> labelNameCondition;

    public Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> getLabelNameCondition() {
        return this.labelNameCondition == null ? Codegen.empty() : this.labelNameCondition;
    }

    public WebAclLoggingConfigurationLoggingFilterFilterConditionArgs(
        @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> actionCondition,
        @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> labelNameCondition) {
        this.actionCondition = actionCondition;
        this.labelNameCondition = labelNameCondition;
    }

    private WebAclLoggingConfigurationLoggingFilterFilterConditionArgs() {
        this.actionCondition = Codegen.empty();
        this.labelNameCondition = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilterConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> actionCondition;
        private @Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> labelNameCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilterConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionCondition = defaults.actionCondition;
    	      this.labelNameCondition = defaults.labelNameCondition;
        }

        public Builder actionCondition(@Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs> actionCondition) {
            this.actionCondition = actionCondition;
            return this;
        }
        public Builder actionCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs actionCondition) {
            this.actionCondition = Codegen.ofNullable(actionCondition);
            return this;
        }
        public Builder labelNameCondition(@Nullable Output<WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs> labelNameCondition) {
            this.labelNameCondition = labelNameCondition;
            return this;
        }
        public Builder labelNameCondition(@Nullable WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs labelNameCondition) {
            this.labelNameCondition = Codegen.ofNullable(labelNameCondition);
            return this;
        }        public WebAclLoggingConfigurationLoggingFilterFilterConditionArgs build() {
            return new WebAclLoggingConfigurationLoggingFilterFilterConditionArgs(actionCondition, labelNameCondition);
        }
    }
}
