// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.QueryParameterTypeStructTypesItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueryParameterTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueryParameterTypeArgs Empty = new QueryParameterTypeArgs();

    /**
     * [Optional] The type of the array's elements, if this is an array.
     * 
     */
    @InputImport(name="arrayType")
    private final @Nullable Input<QueryParameterTypeArgs> arrayType;

    public Input<QueryParameterTypeArgs> getArrayType() {
        return this.arrayType == null ? Input.empty() : this.arrayType;
    }

    /**
     * [Optional] The types of the fields of this struct, in order, if this is a struct.
     * 
     */
    @InputImport(name="structTypes")
    private final @Nullable Input<List<QueryParameterTypeStructTypesItemArgs>> structTypes;

    public Input<List<QueryParameterTypeStructTypesItemArgs>> getStructTypes() {
        return this.structTypes == null ? Input.empty() : this.structTypes;
    }

    /**
     * [Required] The top level type of this field.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public QueryParameterTypeArgs(
        @Nullable Input<QueryParameterTypeArgs> arrayType,
        @Nullable Input<List<QueryParameterTypeStructTypesItemArgs>> structTypes,
        @Nullable Input<String> type) {
        this.arrayType = arrayType;
        this.structTypes = structTypes;
        this.type = type;
    }

    private QueryParameterTypeArgs() {
        this.arrayType = Input.empty();
        this.structTypes = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<QueryParameterTypeArgs> arrayType;
        private @Nullable Input<List<QueryParameterTypeStructTypesItemArgs>> structTypes;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayType = defaults.arrayType;
    	      this.structTypes = defaults.structTypes;
    	      this.type = defaults.type;
        }

        public Builder setArrayType(@Nullable Input<QueryParameterTypeArgs> arrayType) {
            this.arrayType = arrayType;
            return this;
        }

        public Builder setArrayType(@Nullable QueryParameterTypeArgs arrayType) {
            this.arrayType = Input.ofNullable(arrayType);
            return this;
        }

        public Builder setStructTypes(@Nullable Input<List<QueryParameterTypeStructTypesItemArgs>> structTypes) {
            this.structTypes = structTypes;
            return this;
        }

        public Builder setStructTypes(@Nullable List<QueryParameterTypeStructTypesItemArgs> structTypes) {
            this.structTypes = Input.ofNullable(structTypes);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public QueryParameterTypeArgs build() {
            return new QueryParameterTypeArgs(arrayType, structTypes, type);
        }
    }
}
