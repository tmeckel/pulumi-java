// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.QueryParameterTypeArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueryParameterTypeStructTypesItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueryParameterTypeStructTypesItemArgs Empty = new QueryParameterTypeStructTypesItemArgs();

    /**
     * [Optional] Human-oriented description of the field.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * [Optional] The name of this field.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * [Required] The type of this field.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<QueryParameterTypeArgs> type;

    public Input<QueryParameterTypeArgs> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public QueryParameterTypeStructTypesItemArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<QueryParameterTypeArgs> type) {
        this.description = description;
        this.name = name;
        this.type = type;
    }

    private QueryParameterTypeStructTypesItemArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterTypeStructTypesItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<QueryParameterTypeArgs> type;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterTypeStructTypesItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setType(@Nullable Input<QueryParameterTypeArgs> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable QueryParameterTypeArgs type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public QueryParameterTypeStructTypesItemArgs build() {
            return new QueryParameterTypeStructTypesItemArgs(description, name, type);
        }
    }
}
