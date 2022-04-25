// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class QueryParameterValueResponse extends com.pulumi.resources.InvokeArgs {

    public static final QueryParameterValueResponse Empty = new QueryParameterValueResponse();

    /**
     * [Optional] The array values, if this is an array type.
     * 
     */
    @Import(name="arrayValues", required=true)
    private List<QueryParameterValueResponse> arrayValues;

    /**
     * @return [Optional] The array values, if this is an array type.
     * 
     */
    public List<QueryParameterValueResponse> arrayValues() {
        return this.arrayValues;
    }

    /**
     * [Optional] The struct field values, in order of the struct type&#39;s declaration.
     * 
     */
    @Import(name="structValues", required=true)
    private Map<String,String> structValues;

    /**
     * @return [Optional] The struct field values, in order of the struct type&#39;s declaration.
     * 
     */
    public Map<String,String> structValues() {
        return this.structValues;
    }

    /**
     * [Optional] The value of this value, if a simple scalar type.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return [Optional] The value of this value, if a simple scalar type.
     * 
     */
    public String value() {
        return this.value;
    }

    private QueryParameterValueResponse() {}

    private QueryParameterValueResponse(QueryParameterValueResponse $) {
        this.arrayValues = $.arrayValues;
        this.structValues = $.structValues;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryParameterValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryParameterValueResponse $;

        public Builder() {
            $ = new QueryParameterValueResponse();
        }

        public Builder(QueryParameterValueResponse defaults) {
            $ = new QueryParameterValueResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param arrayValues [Optional] The array values, if this is an array type.
         * 
         * @return builder
         * 
         */
        public Builder arrayValues(List<QueryParameterValueResponse> arrayValues) {
            $.arrayValues = arrayValues;
            return this;
        }

        /**
         * @param arrayValues [Optional] The array values, if this is an array type.
         * 
         * @return builder
         * 
         */
        public Builder arrayValues(QueryParameterValueResponse... arrayValues) {
            return arrayValues(List.of(arrayValues));
        }

        /**
         * @param structValues [Optional] The struct field values, in order of the struct type&#39;s declaration.
         * 
         * @return builder
         * 
         */
        public Builder structValues(Map<String,String> structValues) {
            $.structValues = structValues;
            return this;
        }

        /**
         * @param value [Optional] The value of this value, if a simple scalar type.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public QueryParameterValueResponse build() {
            $.arrayValues = Objects.requireNonNull($.arrayValues, "expected parameter 'arrayValues' to be non-null");
            $.structValues = Objects.requireNonNull($.structValues, "expected parameter 'structValues' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
