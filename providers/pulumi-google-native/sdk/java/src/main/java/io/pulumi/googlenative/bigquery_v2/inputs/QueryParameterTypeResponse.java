// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.QueryParameterTypeStructTypesItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class QueryParameterTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueryParameterTypeResponse Empty = new QueryParameterTypeResponse();

    /**
     * [Optional] The type of the array's elements, if this is an array.
     * 
     */
    @InputImport(name="arrayType", required=true)
    private final QueryParameterTypeResponse arrayType;

    public QueryParameterTypeResponse getArrayType() {
        return this.arrayType;
    }

    /**
     * [Optional] The types of the fields of this struct, in order, if this is a struct.
     * 
     */
    @InputImport(name="structTypes", required=true)
    private final List<QueryParameterTypeStructTypesItemResponse> structTypes;

    public List<QueryParameterTypeStructTypesItemResponse> getStructTypes() {
        return this.structTypes;
    }

    /**
     * [Required] The top level type of this field.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public QueryParameterTypeResponse(
        QueryParameterTypeResponse arrayType,
        List<QueryParameterTypeStructTypesItemResponse> structTypes,
        String type) {
        this.arrayType = Objects.requireNonNull(arrayType, "expected parameter 'arrayType' to be non-null");
        this.structTypes = Objects.requireNonNull(structTypes, "expected parameter 'structTypes' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private QueryParameterTypeResponse() {
        this.arrayType = null;
        this.structTypes = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryParameterTypeResponse arrayType;
        private List<QueryParameterTypeStructTypesItemResponse> structTypes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayType = defaults.arrayType;
    	      this.structTypes = defaults.structTypes;
    	      this.type = defaults.type;
        }

        public Builder setArrayType(QueryParameterTypeResponse arrayType) {
            this.arrayType = Objects.requireNonNull(arrayType);
            return this;
        }

        public Builder setStructTypes(List<QueryParameterTypeStructTypesItemResponse> structTypes) {
            this.structTypes = Objects.requireNonNull(structTypes);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public QueryParameterTypeResponse build() {
            return new QueryParameterTypeResponse(arrayType, structTypes, type);
        }
    }
}
