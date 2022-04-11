// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.RuleMetricDataSourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule condition based on a certain number of locations failing.
 * 
 */
public final class LocationThresholdRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationThresholdRuleConditionArgs Empty = new LocationThresholdRuleConditionArgs();

    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    @Import(name="dataSource")
      private final @Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;

    public Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> getDataSource() {
        return this.dataSource == null ? Codegen.empty() : this.dataSource;
    }

    /**
     * the number of locations that must fail to activate the alert.
     * 
     */
    @Import(name="failedLocationCount", required=true)
      private final Output<Integer> failedLocationCount;

    public Output<Integer> getFailedLocationCount() {
        return this.failedLocationCount;
    }

    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.LocationThresholdRuleCondition'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    @Import(name="windowSize")
      private final @Nullable Output<String> windowSize;

    public Output<String> getWindowSize() {
        return this.windowSize == null ? Codegen.empty() : this.windowSize;
    }

    public LocationThresholdRuleConditionArgs(
        @Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource,
        Output<Integer> failedLocationCount,
        Output<String> odataType,
        @Nullable Output<String> windowSize) {
        this.dataSource = dataSource;
        this.failedLocationCount = Objects.requireNonNull(failedLocationCount, "expected parameter 'failedLocationCount' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.windowSize = windowSize;
    }

    private LocationThresholdRuleConditionArgs() {
        this.dataSource = Codegen.empty();
        this.failedLocationCount = Codegen.empty();
        this.odataType = Codegen.empty();
        this.windowSize = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationThresholdRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;
        private Output<Integer> failedLocationCount;
        private Output<String> odataType;
        private @Nullable Output<String> windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationThresholdRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSource = defaults.dataSource;
    	      this.failedLocationCount = defaults.failedLocationCount;
    	      this.odataType = defaults.odataType;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder dataSource(@Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public Builder dataSource(@Nullable Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs> dataSource) {
            this.dataSource = Codegen.ofNullable(dataSource);
            return this;
        }
        public Builder failedLocationCount(Output<Integer> failedLocationCount) {
            this.failedLocationCount = Objects.requireNonNull(failedLocationCount);
            return this;
        }
        public Builder failedLocationCount(Integer failedLocationCount) {
            this.failedLocationCount = Output.of(Objects.requireNonNull(failedLocationCount));
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder windowSize(@Nullable Output<String> windowSize) {
            this.windowSize = windowSize;
            return this;
        }
        public Builder windowSize(@Nullable String windowSize) {
            this.windowSize = Codegen.ofNullable(windowSize);
            return this;
        }        public LocationThresholdRuleConditionArgs build() {
            return new LocationThresholdRuleConditionArgs(dataSource, failedLocationCount, odataType, windowSize);
        }
    }
}
