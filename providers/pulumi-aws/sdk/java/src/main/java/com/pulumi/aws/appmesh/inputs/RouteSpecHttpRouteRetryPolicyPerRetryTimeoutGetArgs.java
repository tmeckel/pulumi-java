// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs Empty = new RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs();

    /**
     * Retry unit. Valid values: `ms`, `s`.
     * 
     */
    @Import(name="unit", required=true)
    private Output<String> unit;

    /**
     * @return Retry unit. Valid values: `ms`, `s`.
     * 
     */
    public Output<String> unit() {
        return this.unit;
    }

    /**
     * Retry value.
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    /**
     * @return Retry value.
     * 
     */
    public Output<Integer> value() {
        return this.value;
    }

    private RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs() {}

    private RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs(RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs $;

        public Builder() {
            $ = new RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs();
        }

        public Builder(RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs defaults) {
            $ = new RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param unit Retry unit. Valid values: `ms`, `s`.
         * 
         * @return builder
         * 
         */
        public Builder unit(Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit Retry unit. Valid values: `ms`, `s`.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        /**
         * @param value Retry value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Retry value.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public RouteSpecHttpRouteRetryPolicyPerRetryTimeoutGetArgs build() {
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
