// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ReportDatasetResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportTimePeriodResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportDefinitionResponse {
    /**
     * Has definition for data in this report.
     * 
     */
    private final @Nullable ReportDatasetResponse dataset;
    /**
     * Has time period for pulling data for the report.
     * 
     */
    private final @Nullable ReportTimePeriodResponse timePeriod;
    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    private final String timeframe;
    /**
     * The type of the report.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ReportDefinitionResponse(
        @OutputCustomType.Parameter("dataset") @Nullable ReportDatasetResponse dataset,
        @OutputCustomType.Parameter("timePeriod") @Nullable ReportTimePeriodResponse timePeriod,
        @OutputCustomType.Parameter("timeframe") String timeframe,
        @OutputCustomType.Parameter("type") String type) {
        this.dataset = dataset;
        this.timePeriod = timePeriod;
        this.timeframe = timeframe;
        this.type = type;
    }

    /**
     * Has definition for data in this report.
     * 
    */
    public Optional<ReportDatasetResponse> getDataset() {
        return Optional.ofNullable(this.dataset);
    }
    /**
     * Has time period for pulling data for the report.
     * 
    */
    public Optional<ReportTimePeriodResponse> getTimePeriod() {
        return Optional.ofNullable(this.timePeriod);
    }
    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
    */
    public String getTimeframe() {
        return this.timeframe;
    }
    /**
     * The type of the report.
     * 
    */
    public String getType() {
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
        }
        public ReportDefinitionResponse build() {
            return new ReportDefinitionResponse(dataset, timePeriod, timeframe, type);
        }
    }
}
