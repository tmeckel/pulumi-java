// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersTwitterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersTwitterGetArgs Empty = new DataSourceParametersTwitterGetArgs();

    /**
     * The maximum number of rows to query.
     * 
     */
    @Import(name="maxRows", required=true)
    private Output<Integer> maxRows;

    /**
     * @return The maximum number of rows to query.
     * 
     */
    public Output<Integer> maxRows() {
        return this.maxRows;
    }

    /**
     * The Twitter query to retrieve the data.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return The Twitter query to retrieve the data.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    private DataSourceParametersTwitterGetArgs() {}

    private DataSourceParametersTwitterGetArgs(DataSourceParametersTwitterGetArgs $) {
        this.maxRows = $.maxRows;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceParametersTwitterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceParametersTwitterGetArgs $;

        public Builder() {
            $ = new DataSourceParametersTwitterGetArgs();
        }

        public Builder(DataSourceParametersTwitterGetArgs defaults) {
            $ = new DataSourceParametersTwitterGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxRows The maximum number of rows to query.
         * 
         * @return builder
         * 
         */
        public Builder maxRows(Output<Integer> maxRows) {
            $.maxRows = maxRows;
            return this;
        }

        /**
         * @param maxRows The maximum number of rows to query.
         * 
         * @return builder
         * 
         */
        public Builder maxRows(Integer maxRows) {
            return maxRows(Output.of(maxRows));
        }

        /**
         * @param query The Twitter query to retrieve the data.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The Twitter query to retrieve the data.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        public DataSourceParametersTwitterGetArgs build() {
            $.maxRows = Objects.requireNonNull($.maxRows, "expected parameter 'maxRows' to be non-null");
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            return $;
        }
    }

}
