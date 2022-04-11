// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.MetricCriteriaArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the metric alert criteria for a single resource that has multiple metric criteria.
 * 
 */
public final class MetricAlertSingleResourceMultipleMetricCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricAlertSingleResourceMultipleMetricCriteriaArgs Empty = new MetricAlertSingleResourceMultipleMetricCriteriaArgs();

    /**
     * The list of metric criteria for this 'all of' operation.
     * 
     */
    @Import(name="allOf")
      private final @Nullable Output<List<MetricCriteriaArgs>> allOf;

    public Output<List<MetricCriteriaArgs>> getAllOf() {
        return this.allOf == null ? Codegen.empty() : this.allOf;
    }

    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    public MetricAlertSingleResourceMultipleMetricCriteriaArgs(
        @Nullable Output<List<MetricCriteriaArgs>> allOf,
        Output<String> odataType) {
        this.allOf = allOf;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private MetricAlertSingleResourceMultipleMetricCriteriaArgs() {
        this.allOf = Codegen.empty();
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertSingleResourceMultipleMetricCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<MetricCriteriaArgs>> allOf;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertSingleResourceMultipleMetricCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
    	      this.odataType = defaults.odataType;
        }

        public Builder allOf(@Nullable Output<List<MetricCriteriaArgs>> allOf) {
            this.allOf = allOf;
            return this;
        }
        public Builder allOf(@Nullable List<MetricCriteriaArgs> allOf) {
            this.allOf = Codegen.ofNullable(allOf);
            return this;
        }
        public Builder allOf(MetricCriteriaArgs... allOf) {
            return allOf(List.of(allOf));
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public MetricAlertSingleResourceMultipleMetricCriteriaArgs build() {
            return new MetricAlertSingleResourceMultipleMetricCriteriaArgs(allOf, odataType);
        }
    }
}
