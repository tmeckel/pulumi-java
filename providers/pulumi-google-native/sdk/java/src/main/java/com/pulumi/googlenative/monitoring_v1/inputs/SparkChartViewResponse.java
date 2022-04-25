// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A sparkChart is a small chart suitable for inclusion in a table-cell or inline in text. This message contains the configuration for a sparkChart to show up on a Scorecard, showing recent trends of the scorecard&#39;s timeseries.
 * 
 */
public final class SparkChartViewResponse extends com.pulumi.resources.InvokeArgs {

    public static final SparkChartViewResponse Empty = new SparkChartViewResponse();

    /**
     * The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
     * 
     */
    @Import(name="minAlignmentPeriod", required=true)
    private String minAlignmentPeriod;

    /**
     * @return The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
     * 
     */
    public String minAlignmentPeriod() {
        return this.minAlignmentPeriod;
    }

    /**
     * The type of sparkchart to show in this chartView.
     * 
     */
    @Import(name="sparkChartType", required=true)
    private String sparkChartType;

    /**
     * @return The type of sparkchart to show in this chartView.
     * 
     */
    public String sparkChartType() {
        return this.sparkChartType;
    }

    private SparkChartViewResponse() {}

    private SparkChartViewResponse(SparkChartViewResponse $) {
        this.minAlignmentPeriod = $.minAlignmentPeriod;
        this.sparkChartType = $.sparkChartType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkChartViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkChartViewResponse $;

        public Builder() {
            $ = new SparkChartViewResponse();
        }

        public Builder(SparkChartViewResponse defaults) {
            $ = new SparkChartViewResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param minAlignmentPeriod The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
         * 
         * @return builder
         * 
         */
        public Builder minAlignmentPeriod(String minAlignmentPeriod) {
            $.minAlignmentPeriod = minAlignmentPeriod;
            return this;
        }

        /**
         * @param sparkChartType The type of sparkchart to show in this chartView.
         * 
         * @return builder
         * 
         */
        public Builder sparkChartType(String sparkChartType) {
            $.sparkChartType = sparkChartType;
            return this;
        }

        public SparkChartViewResponse build() {
            $.minAlignmentPeriod = Objects.requireNonNull($.minAlignmentPeriod, "expected parameter 'minAlignmentPeriod' to be non-null");
            $.sparkChartType = Objects.requireNonNull($.sparkChartType, "expected parameter 'sparkChartType' to be non-null");
            return $;
        }
    }

}
