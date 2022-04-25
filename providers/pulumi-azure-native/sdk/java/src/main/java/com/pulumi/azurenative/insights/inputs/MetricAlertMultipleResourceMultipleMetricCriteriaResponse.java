// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.DynamicMetricCriteriaResponse;
import com.pulumi.azurenative.insights.inputs.MetricCriteriaResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the metric alert criteria for multiple resource that has multiple metric criteria.
 * 
 */
public final class MetricAlertMultipleResourceMultipleMetricCriteriaResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetricAlertMultipleResourceMultipleMetricCriteriaResponse Empty = new MetricAlertMultipleResourceMultipleMetricCriteriaResponse();

    /**
     * the list of multiple metric criteria for this &#39;all of&#39; operation.
     * 
     */
    @Import(name="allOf")
    private @Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf;

    /**
     * @return the list of multiple metric criteria for this &#39;all of&#39; operation.
     * 
     */
    public Optional<List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>>> allOf() {
        return Optional.ofNullable(this.allOf);
    }

    /**
     * specifies the type of the alert criteria.
     * Expected value is &#39;Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return specifies the type of the alert criteria.
     * Expected value is &#39;Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    private MetricAlertMultipleResourceMultipleMetricCriteriaResponse() {}

    private MetricAlertMultipleResourceMultipleMetricCriteriaResponse(MetricAlertMultipleResourceMultipleMetricCriteriaResponse $) {
        this.allOf = $.allOf;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricAlertMultipleResourceMultipleMetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAlertMultipleResourceMultipleMetricCriteriaResponse $;

        public Builder() {
            $ = new MetricAlertMultipleResourceMultipleMetricCriteriaResponse();
        }

        public Builder(MetricAlertMultipleResourceMultipleMetricCriteriaResponse defaults) {
            $ = new MetricAlertMultipleResourceMultipleMetricCriteriaResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allOf the list of multiple metric criteria for this &#39;all of&#39; operation.
         * 
         * @return builder
         * 
         */
        public Builder allOf(@Nullable List<Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>> allOf) {
            $.allOf = allOf;
            return this;
        }

        /**
         * @param allOf the list of multiple metric criteria for this &#39;all of&#39; operation.
         * 
         * @return builder
         * 
         */
        public Builder allOf(Either<DynamicMetricCriteriaResponse,MetricCriteriaResponse>... allOf) {
            return allOf(List.of(allOf));
        }

        /**
         * @param odataType specifies the type of the alert criteria.
         * Expected value is &#39;Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public MetricAlertMultipleResourceMultipleMetricCriteriaResponse build() {
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
