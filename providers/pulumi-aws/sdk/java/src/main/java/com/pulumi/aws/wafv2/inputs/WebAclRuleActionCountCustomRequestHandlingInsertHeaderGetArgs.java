// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs Empty = new WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs();

    /**
     * The label string.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The label string.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the custom header.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of the custom header.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs() {}

    private WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs(WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs $;

        public Builder() {
            $ = new WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs();
        }

        public Builder(WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs defaults) {
            $ = new WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The label string.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The label string.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the custom header.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the custom header.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public WebAclRuleActionCountCustomRequestHandlingInsertHeaderGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
