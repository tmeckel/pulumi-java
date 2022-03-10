// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.TimelineAggregationResponse;
import io.pulumi.azurenative.securityinsights.inputs.TimelineErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Expansion result metadata.
 * 
 */
public final class TimelineResultsMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimelineResultsMetadataResponse Empty = new TimelineResultsMetadataResponse();

    /**
     * timeline aggregation per kind
     * 
     */
    @InputImport(name="aggregations", required=true)
      private final List<TimelineAggregationResponse> aggregations;

    public List<TimelineAggregationResponse> getAggregations() {
        return this.aggregations;
    }

    /**
     * information about the failure queries
     * 
     */
    @InputImport(name="errors")
      private final @Nullable List<TimelineErrorResponse> errors;

    public List<TimelineErrorResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }

    /**
     * the total items found for the timeline request
     * 
     */
    @InputImport(name="totalCount", required=true)
      private final Integer totalCount;

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public TimelineResultsMetadataResponse(
        List<TimelineAggregationResponse> aggregations,
        @Nullable List<TimelineErrorResponse> errors,
        Integer totalCount) {
        this.aggregations = Objects.requireNonNull(aggregations, "expected parameter 'aggregations' to be non-null");
        this.errors = errors;
        this.totalCount = Objects.requireNonNull(totalCount, "expected parameter 'totalCount' to be non-null");
    }

    private TimelineResultsMetadataResponse() {
        this.aggregations = List.of();
        this.errors = List.of();
        this.totalCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimelineResultsMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TimelineAggregationResponse> aggregations;
        private @Nullable List<TimelineErrorResponse> errors;
        private Integer totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(TimelineResultsMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.errors = defaults.errors;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder aggregations(List<TimelineAggregationResponse> aggregations) {
            this.aggregations = Objects.requireNonNull(aggregations);
            return this;
        }

        public Builder errors(@Nullable List<TimelineErrorResponse> errors) {
            this.errors = errors;
            return this;
        }

        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }
        public TimelineResultsMetadataResponse build() {
            return new TimelineResultsMetadataResponse(aggregations, errors, totalCount);
        }
    }
}
