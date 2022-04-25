// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * API call volume range and the percentage of revenue to share with the developer when the total number of API calls is within the range.
 * 
 */
public final class GoogleCloudApigeeV1RevenueShareRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1RevenueShareRangeResponse Empty = new GoogleCloudApigeeV1RevenueShareRangeResponse();

    /**
     * Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
     */
    @Import(name="end", required=true)
    private String end;

    /**
     * @return Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
     */
    public String end() {
        return this.end;
    }

    /**
     * Percentage of the revenue to be shared with the developer. For example, to share 21 percent of the total revenue with the developer, set this value to 21. Specify a decimal number with a maximum of two digits following the decimal point.
     * 
     */
    @Import(name="sharePercentage", required=true)
    private Double sharePercentage;

    /**
     * @return Percentage of the revenue to be shared with the developer. For example, to share 21 percent of the total revenue with the developer, set this value to 21. Specify a decimal number with a maximum of two digits following the decimal point.
     * 
     */
    public Double sharePercentage() {
        return this.sharePercentage;
    }

    /**
     * Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
     */
    @Import(name="start", required=true)
    private String start;

    /**
     * @return Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
     */
    public String start() {
        return this.start;
    }

    private GoogleCloudApigeeV1RevenueShareRangeResponse() {}

    private GoogleCloudApigeeV1RevenueShareRangeResponse(GoogleCloudApigeeV1RevenueShareRangeResponse $) {
        this.end = $.end;
        this.sharePercentage = $.sharePercentage;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1RevenueShareRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1RevenueShareRangeResponse $;

        public Builder() {
            $ = new GoogleCloudApigeeV1RevenueShareRangeResponse();
        }

        public Builder(GoogleCloudApigeeV1RevenueShareRangeResponse defaults) {
            $ = new GoogleCloudApigeeV1RevenueShareRangeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param end Ending value of the range. Set to 0 or `null` for the last range of values.
         * 
         * @return builder
         * 
         */
        public Builder end(String end) {
            $.end = end;
            return this;
        }

        /**
         * @param sharePercentage Percentage of the revenue to be shared with the developer. For example, to share 21 percent of the total revenue with the developer, set this value to 21. Specify a decimal number with a maximum of two digits following the decimal point.
         * 
         * @return builder
         * 
         */
        public Builder sharePercentage(Double sharePercentage) {
            $.sharePercentage = sharePercentage;
            return this;
        }

        /**
         * @param start Starting value of the range. Set to 0 or `null` for the initial range of values.
         * 
         * @return builder
         * 
         */
        public Builder start(String start) {
            $.start = start;
            return this;
        }

        public GoogleCloudApigeeV1RevenueShareRangeResponse build() {
            $.end = Objects.requireNonNull($.end, "expected parameter 'end' to be non-null");
            $.sharePercentage = Objects.requireNonNull($.sharePercentage, "expected parameter 'sharePercentage' to be non-null");
            $.start = Objects.requireNonNull($.start, "expected parameter 'start' to be non-null");
            return $;
        }
    }

}
