// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.GranularityType;
import com.pulumi.azurenative.costmanagement.inputs.ReportAggregationArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportDatasetConfigurationArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportFilterArgs;
import com.pulumi.azurenative.costmanagement.inputs.ReportGroupingArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of data present in the report.
 * 
 */
public final class ReportDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportDatasetArgs Empty = new ReportDatasetArgs();

    /**
     * Dictionary of aggregation expression to use in the report. The key of each item in the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
     * 
     */
    @Import(name="aggregation")
    private @Nullable Output<Map<String,ReportAggregationArgs>> aggregation;

    /**
     * @return Dictionary of aggregation expression to use in the report. The key of each item in the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
     * 
     */
    public Optional<Output<Map<String,ReportAggregationArgs>>> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }

    /**
     * Has configuration information for the data in the report. The configuration will be ignored if aggregation and grouping are provided.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<ReportDatasetConfigurationArgs> configuration;

    /**
     * @return Has configuration information for the data in the report. The configuration will be ignored if aggregation and grouping are provided.
     * 
     */
    public Optional<Output<ReportDatasetConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Has filter expression to use in the report.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<ReportFilterArgs> filter;

    /**
     * @return Has filter expression to use in the report.
     * 
     */
    public Optional<Output<ReportFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The granularity of rows in the report.
     * 
     */
    @Import(name="granularity")
    private @Nullable Output<Either<String,GranularityType>> granularity;

    /**
     * @return The granularity of rows in the report.
     * 
     */
    public Optional<Output<Either<String,GranularityType>>> granularity() {
        return Optional.ofNullable(this.granularity);
    }

    /**
     * Array of group by expression to use in the report. Report can have up to 2 group by clauses.
     * 
     */
    @Import(name="grouping")
    private @Nullable Output<List<ReportGroupingArgs>> grouping;

    /**
     * @return Array of group by expression to use in the report. Report can have up to 2 group by clauses.
     * 
     */
    public Optional<Output<List<ReportGroupingArgs>>> grouping() {
        return Optional.ofNullable(this.grouping);
    }

    private ReportDatasetArgs() {}

    private ReportDatasetArgs(ReportDatasetArgs $) {
        this.aggregation = $.aggregation;
        this.configuration = $.configuration;
        this.filter = $.filter;
        this.granularity = $.granularity;
        this.grouping = $.grouping;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDatasetArgs $;

        public Builder() {
            $ = new ReportDatasetArgs();
        }

        public Builder(ReportDatasetArgs defaults) {
            $ = new ReportDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregation Dictionary of aggregation expression to use in the report. The key of each item in the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(@Nullable Output<Map<String,ReportAggregationArgs>> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        /**
         * @param aggregation Dictionary of aggregation expression to use in the report. The key of each item in the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(Map<String,ReportAggregationArgs> aggregation) {
            return aggregation(Output.of(aggregation));
        }

        /**
         * @param configuration Has configuration information for the data in the report. The configuration will be ignored if aggregation and grouping are provided.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<ReportDatasetConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Has configuration information for the data in the report. The configuration will be ignored if aggregation and grouping are provided.
         * 
         * @return builder
         * 
         */
        public Builder configuration(ReportDatasetConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param filter Has filter expression to use in the report.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<ReportFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Has filter expression to use in the report.
         * 
         * @return builder
         * 
         */
        public Builder filter(ReportFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param granularity The granularity of rows in the report.
         * 
         * @return builder
         * 
         */
        public Builder granularity(@Nullable Output<Either<String,GranularityType>> granularity) {
            $.granularity = granularity;
            return this;
        }

        /**
         * @param granularity The granularity of rows in the report.
         * 
         * @return builder
         * 
         */
        public Builder granularity(Either<String,GranularityType> granularity) {
            return granularity(Output.of(granularity));
        }

        /**
         * @param granularity The granularity of rows in the report.
         * 
         * @return builder
         * 
         */
        public Builder granularity(String granularity) {
            return granularity(Either.ofLeft(granularity));
        }

        /**
         * @param granularity The granularity of rows in the report.
         * 
         * @return builder
         * 
         */
        public Builder granularity(GranularityType granularity) {
            return granularity(Either.ofRight(granularity));
        }

        /**
         * @param grouping Array of group by expression to use in the report. Report can have up to 2 group by clauses.
         * 
         * @return builder
         * 
         */
        public Builder grouping(@Nullable Output<List<ReportGroupingArgs>> grouping) {
            $.grouping = grouping;
            return this;
        }

        /**
         * @param grouping Array of group by expression to use in the report. Report can have up to 2 group by clauses.
         * 
         * @return builder
         * 
         */
        public Builder grouping(List<ReportGroupingArgs> grouping) {
            return grouping(Output.of(grouping));
        }

        /**
         * @param grouping Array of group by expression to use in the report. Report can have up to 2 group by clauses.
         * 
         * @return builder
         * 
         */
        public Builder grouping(ReportGroupingArgs... grouping) {
            return grouping(List.of(grouping));
        }

        public ReportDatasetArgs build() {
            return $;
        }
    }

}
