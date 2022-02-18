// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class QueryParameterValueResponse {
    /**
     * [Optional] The array values, if this is an array type.
     * 
     */
    private final List<QueryParameterValueResponse> arrayValues;
    /**
     * [Optional] The struct field values, in order of the struct type's declaration.
     * 
     */
    private final Map<String,String> structValues;
    /**
     * [Optional] The value of this value, if a simple scalar type.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"arrayValues","structValues","value"})
    private QueryParameterValueResponse(
        List<QueryParameterValueResponse> arrayValues,
        Map<String,String> structValues,
        String value) {
        this.arrayValues = Objects.requireNonNull(arrayValues);
        this.structValues = Objects.requireNonNull(structValues);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * [Optional] The array values, if this is an array type.
     * 
     */
    public List<QueryParameterValueResponse> getArrayValues() {
        return this.arrayValues;
    }
    /**
     * [Optional] The struct field values, in order of the struct type's declaration.
     * 
     */
    public Map<String,String> getStructValues() {
        return this.structValues;
    }
    /**
     * [Optional] The value of this value, if a simple scalar type.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<QueryParameterValueResponse> arrayValues;
        private Map<String,String> structValues;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayValues = defaults.arrayValues;
    	      this.structValues = defaults.structValues;
    	      this.value = defaults.value;
        }

        public Builder setArrayValues(List<QueryParameterValueResponse> arrayValues) {
            this.arrayValues = Objects.requireNonNull(arrayValues);
            return this;
        }

        public Builder setStructValues(Map<String,String> structValues) {
            this.structValues = Objects.requireNonNull(structValues);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public QueryParameterValueResponse build() {
            return new QueryParameterValueResponse(arrayValues, structValues, value);
        }
    }
}
