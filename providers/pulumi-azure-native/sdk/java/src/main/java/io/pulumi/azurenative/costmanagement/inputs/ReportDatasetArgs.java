// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.GranularityType;
import io.pulumi.azurenative.costmanagement.inputs.ReportAggregationArgs;
import io.pulumi.azurenative.costmanagement.inputs.ReportDatasetConfigurationArgs;
import io.pulumi.azurenative.costmanagement.inputs.ReportFilterArgs;
import io.pulumi.azurenative.costmanagement.inputs.ReportGroupingArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The definition of data present in the report.
 * 
 */
public final class ReportDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportDatasetArgs Empty = new ReportDatasetArgs();

    /**
     * Dictionary of aggregation expression to use in the report. The key of each item in the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
     * 
     */
    @Import(name="aggregation")
      private final @Nullable Output<Map<String,ReportAggregationArgs>> aggregation;

    public Output<Map<String,ReportAggregationArgs>> getAggregation() {
        return this.aggregation == null ? Codegen.empty() : this.aggregation;
    }

    /**
     * Has configuration information for the data in the report. The configuration will be ignored if aggregation and grouping are provided.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<ReportDatasetConfigurationArgs> configuration;

    public Output<ReportDatasetConfigurationArgs> getConfiguration() {
        return this.configuration == null ? Codegen.empty() : this.configuration;
    }

    /**
     * Has filter expression to use in the report.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<ReportFilterArgs> filter;

    public Output<ReportFilterArgs> getFilter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * The granularity of rows in the report.
     * 
     */
    @Import(name="granularity")
      private final @Nullable Output<Either<String,GranularityType>> granularity;

    public Output<Either<String,GranularityType>> getGranularity() {
        return this.granularity == null ? Codegen.empty() : this.granularity;
    }

    /**
     * Array of group by expression to use in the report. Report can have up to 2 group by clauses.
     * 
     */
    @Import(name="grouping")
      private final @Nullable Output<List<ReportGroupingArgs>> grouping;

    public Output<List<ReportGroupingArgs>> getGrouping() {
        return this.grouping == null ? Codegen.empty() : this.grouping;
    }

    public ReportDatasetArgs(
        @Nullable Output<Map<String,ReportAggregationArgs>> aggregation,
        @Nullable Output<ReportDatasetConfigurationArgs> configuration,
        @Nullable Output<ReportFilterArgs> filter,
        @Nullable Output<Either<String,GranularityType>> granularity,
        @Nullable Output<List<ReportGroupingArgs>> grouping) {
        this.aggregation = aggregation;
        this.configuration = configuration;
        this.filter = filter;
        this.granularity = granularity;
        this.grouping = grouping;
    }

    private ReportDatasetArgs() {
        this.aggregation = Codegen.empty();
        this.configuration = Codegen.empty();
        this.filter = Codegen.empty();
        this.granularity = Codegen.empty();
        this.grouping = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,ReportAggregationArgs>> aggregation;
        private @Nullable Output<ReportDatasetConfigurationArgs> configuration;
        private @Nullable Output<ReportFilterArgs> filter;
        private @Nullable Output<Either<String,GranularityType>> granularity;
        private @Nullable Output<List<ReportGroupingArgs>> grouping;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.configuration = defaults.configuration;
    	      this.filter = defaults.filter;
    	      this.granularity = defaults.granularity;
    	      this.grouping = defaults.grouping;
        }

        public Builder aggregation(@Nullable Output<Map<String,ReportAggregationArgs>> aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        public Builder aggregation(@Nullable Map<String,ReportAggregationArgs> aggregation) {
            this.aggregation = Codegen.ofNullable(aggregation);
            return this;
        }
        public Builder configuration(@Nullable Output<ReportDatasetConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable ReportDatasetConfigurationArgs configuration) {
            this.configuration = Codegen.ofNullable(configuration);
            return this;
        }
        public Builder filter(@Nullable Output<ReportFilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable ReportFilterArgs filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder granularity(@Nullable Output<Either<String,GranularityType>> granularity) {
            this.granularity = granularity;
            return this;
        }
        public Builder granularity(@Nullable Either<String,GranularityType> granularity) {
            this.granularity = Codegen.ofNullable(granularity);
            return this;
        }
        public Builder grouping(@Nullable Output<List<ReportGroupingArgs>> grouping) {
            this.grouping = grouping;
            return this;
        }
        public Builder grouping(@Nullable List<ReportGroupingArgs> grouping) {
            this.grouping = Codegen.ofNullable(grouping);
            return this;
        }
        public Builder grouping(ReportGroupingArgs... grouping) {
            return grouping(List.of(grouping));
        }        public ReportDatasetArgs build() {
            return new ReportDatasetArgs(aggregation, configuration, filter, granularity, grouping);
        }
    }
}
