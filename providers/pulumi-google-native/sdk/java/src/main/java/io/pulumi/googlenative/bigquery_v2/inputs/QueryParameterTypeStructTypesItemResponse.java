// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.QueryParameterTypeResponse;
import java.lang.String;
import java.util.Objects;


public final class QueryParameterTypeStructTypesItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueryParameterTypeStructTypesItemResponse Empty = new QueryParameterTypeStructTypesItemResponse();

    /**
     * [Optional] Human-oriented description of the field.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * [Optional] The name of this field.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * [Required] The type of this field.
     * 
     */
    @InputImport(name="type", required=true)
    private final QueryParameterTypeResponse type;

    public QueryParameterTypeResponse getType() {
        return this.type;
    }

    public QueryParameterTypeStructTypesItemResponse(
        String description,
        String name,
        QueryParameterTypeResponse type) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private QueryParameterTypeStructTypesItemResponse() {
        this.description = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterTypeStructTypesItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String name;
        private QueryParameterTypeResponse type;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterTypeStructTypesItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(QueryParameterTypeResponse type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public QueryParameterTypeStructTypesItemResponse build() {
            return new QueryParameterTypeStructTypesItemResponse(description, name, type);
        }
    }
}
