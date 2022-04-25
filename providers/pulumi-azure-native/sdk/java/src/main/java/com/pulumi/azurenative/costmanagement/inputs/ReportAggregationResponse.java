// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The aggregation expression to be used in the report.
 * 
 */
public final class ReportAggregationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReportAggregationResponse Empty = new ReportAggregationResponse();

    /**
     * The name of the aggregation function to use.
     * 
     */
    @Import(name="function", required=true)
    private String function;

    /**
     * @return The name of the aggregation function to use.
     * 
     */
    public String function() {
        return this.function;
    }

    /**
     * The name of the column to aggregate.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the column to aggregate.
     * 
     */
    public String name() {
        return this.name;
    }

    private ReportAggregationResponse() {}

    private ReportAggregationResponse(ReportAggregationResponse $) {
        this.function = $.function;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportAggregationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportAggregationResponse $;

        public Builder() {
            $ = new ReportAggregationResponse();
        }

        public Builder(ReportAggregationResponse defaults) {
            $ = new ReportAggregationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param function The name of the aggregation function to use.
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            $.function = function;
            return this;
        }

        /**
         * @param name The name of the column to aggregate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public ReportAggregationResponse build() {
            $.function = Objects.requireNonNull($.function, "expected parameter 'function' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
