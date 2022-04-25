// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.DynamicMetricCriteriaResponse;
import com.pulumi.azurenative.insights.outputs.MetricCriteriaResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class MetricAlertMultipleResourceMultipleMetricCriteriaResponse {
    /**
     * @return the list of multiple metric criteria for this &#39;all of&#39; operation.
     * 
     */
    private final @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf;
    /**
     * @return specifies the type of the alert criteria.
     * Expected value is &#39;Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria&#39;.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private MetricAlertMultipleResourceMultipleMetricCriteriaResponse(
        @CustomType.Parameter("allOf") @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf,
        @CustomType.Parameter("odataType") String odataType) {
        this.allOf = allOf;
        this.odataType = odataType;
    }

    /**
     * @return the list of multiple metric criteria for this &#39;all of&#39; operation.
     * 
     */
    public List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf() {
        return this.allOf == null ? List.of() : this.allOf;
    }
    /**
     * @return specifies the type of the alert criteria.
     * Expected value is &#39;Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertMultipleResourceMultipleMetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertMultipleResourceMultipleMetricCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
    	      this.odataType = defaults.odataType;
        }

        public Builder allOf(@Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf) {
            this.allOf = allOf;
            return this;
        }
        public Builder allOf(Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>... allOf) {
            return allOf(List.of(allOf));
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public MetricAlertMultipleResourceMultipleMetricCriteriaResponse build() {
            return new MetricAlertMultipleResourceMultipleMetricCriteriaResponse(allOf, odataType);
        }
    }
}
