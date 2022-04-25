// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs();

    /**
     * The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs() {}

    private WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs $) {
        this.priority = $.priority;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param priority The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param type The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs build() {
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
