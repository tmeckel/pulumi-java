// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.azurenative.costmanagement.outputs.ReportDatasetResponse;
import com.pulumi.azurenative.costmanagement.outputs.ReportTimePeriodResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReportDefinitionResponse {
    /**
     * @return Has definition for data in this report.
     * 
     */
    private final @Nullable ReportDatasetResponse dataset;
    /**
     * @return Has time period for pulling data for the report.
     * 
     */
    private final @Nullable ReportTimePeriodResponse timePeriod;
    /**
     * @return The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    private final String timeframe;
    /**
     * @return The type of the report.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ReportDefinitionResponse(
        @CustomType.Parameter("dataset") @Nullable ReportDatasetResponse dataset,
        @CustomType.Parameter("timePeriod") @Nullable ReportTimePeriodResponse timePeriod,
        @CustomType.Parameter("timeframe") String timeframe,
        @CustomType.Parameter("type") String type) {
        this.dataset = dataset;
        this.timePeriod = timePeriod;
        this.timeframe = timeframe;
        this.type = type;
    }

    /**
     * @return Has definition for data in this report.
     * 
     */
    public Optional<ReportDatasetResponse> dataset() {
        return Optional.ofNullable(this.dataset);
    }
    /**
     * @return Has time period for pulling data for the report.
     * 
     */
    public Optional<ReportTimePeriodResponse> timePeriod() {
        return Optional.ofNullable(this.timePeriod);
    }
    /**
     * @return The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    public String timeframe() {
        return this.timeframe;
    }
    /**
     * @return The type of the report.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ReportDatasetResponse dataset;
        private @Nullable ReportTimePeriodResponse timePeriod;
        private String timeframe;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.timePeriod = defaults.timePeriod;
    	      this.timeframe = defaults.timeframe;
    	      this.type = defaults.type;
        }

        public Builder dataset(@Nullable ReportDatasetResponse dataset) {
            this.dataset = dataset;
            return this;
        }
        public Builder timePeriod(@Nullable ReportTimePeriodResponse timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }
        public Builder timeframe(String timeframe) {
            this.timeframe = Objects.requireNonNull(timeframe);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ReportDefinitionResponse build() {
            return new ReportDefinitionResponse(dataset, timePeriod, timeframe, type);
        }
    }
}
