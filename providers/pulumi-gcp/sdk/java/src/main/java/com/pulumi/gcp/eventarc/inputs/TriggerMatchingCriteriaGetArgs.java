// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TriggerMatchingCriteriaGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerMatchingCriteriaGetArgs Empty = new TriggerMatchingCriteriaGetArgs();

    /**
     * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the &#39;type&#39; attribute.
     * 
     */
    @Import(name="attribute", required=true)
    private Output<String> attribute;

    /**
     * @return Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the &#39;type&#39; attribute.
     * 
     */
    public Output<String> attribute() {
        return this.attribute;
    }

    /**
     * Required. The value for the attribute.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Required. The value for the attribute.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private TriggerMatchingCriteriaGetArgs() {}

    private TriggerMatchingCriteriaGetArgs(TriggerMatchingCriteriaGetArgs $) {
        this.attribute = $.attribute;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerMatchingCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerMatchingCriteriaGetArgs $;

        public Builder() {
            $ = new TriggerMatchingCriteriaGetArgs();
        }

        public Builder(TriggerMatchingCriteriaGetArgs defaults) {
            $ = new TriggerMatchingCriteriaGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attribute Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the &#39;type&#39; attribute.
         * 
         * @return builder
         * 
         */
        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        /**
         * @param attribute Required. The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the &#39;type&#39; attribute.
         * 
         * @return builder
         * 
         */
        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        /**
         * @param value Required. The value for the attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Required. The value for the attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TriggerMatchingCriteriaGetArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
