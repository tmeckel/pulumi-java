// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GeoMatchSetGeoMatchConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final GeoMatchSetGeoMatchConstraintArgs Empty = new GeoMatchSetGeoMatchConstraintArgs();

    /**
     * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The country that you want AWS WAF to search for.
     * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The country that you want AWS WAF to search for.
     * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private GeoMatchSetGeoMatchConstraintArgs() {}

    private GeoMatchSetGeoMatchConstraintArgs(GeoMatchSetGeoMatchConstraintArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GeoMatchSetGeoMatchConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GeoMatchSetGeoMatchConstraintArgs $;

        public Builder() {
            $ = new GeoMatchSetGeoMatchConstraintArgs();
        }

        public Builder(GeoMatchSetGeoMatchConstraintArgs defaults) {
            $ = new GeoMatchSetGeoMatchConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The country that you want AWS WAF to search for.
         * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
         * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The country that you want AWS WAF to search for.
         * This is the two-letter country code, e.g., `US`, `CA`, `RU`, `CN`, etc.
         * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GeoMatchSetGeoMatchConstraintArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
