// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * Range of numerical values within min and max.
 * 
 */
public final class GoogleMonitoringV3RangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleMonitoringV3RangeResponse Empty = new GoogleMonitoringV3RangeResponse();

    /**
     * Range maximum.
     * 
     */
    @Import(name="max", required=true)
    private Double max;

    /**
     * @return Range maximum.
     * 
     */
    public Double max() {
        return this.max;
    }

    /**
     * Range minimum.
     * 
     */
    @Import(name="min", required=true)
    private Double min;

    /**
     * @return Range minimum.
     * 
     */
    public Double min() {
        return this.min;
    }

    private GoogleMonitoringV3RangeResponse() {}

    private GoogleMonitoringV3RangeResponse(GoogleMonitoringV3RangeResponse $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleMonitoringV3RangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleMonitoringV3RangeResponse $;

        public Builder() {
            $ = new GoogleMonitoringV3RangeResponse();
        }

        public Builder(GoogleMonitoringV3RangeResponse defaults) {
            $ = new GoogleMonitoringV3RangeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param max Range maximum.
         * 
         * @return builder
         * 
         */
        public Builder max(Double max) {
            $.max = max;
            return this;
        }

        /**
         * @param min Range minimum.
         * 
         * @return builder
         * 
         */
        public Builder min(Double min) {
            $.min = min;
            return this;
        }

        public GoogleMonitoringV3RangeResponse build() {
            $.max = Objects.requireNonNull($.max, "expected parameter 'max' to be non-null");
            $.min = Objects.requireNonNull($.min, "expected parameter 'min' to be non-null");
            return $;
        }
    }

}
