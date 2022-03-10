// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.RecipeParameterMapArgs;
import io.pulumi.awsnative.databrew.inputs.RecipeParametersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecipeActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecipeActionArgs Empty = new RecipeActionArgs();

    /**
     * Step action operation
     * 
     */
    @InputImport(name="operation", required=true)
      private final Input<String> operation;

    public Input<String> getOperation() {
        return this.operation;
    }

    @InputImport(name="parameters")
      private final @Nullable Input<Either<RecipeParametersArgs,RecipeParameterMapArgs>> parameters;

    public Input<Either<RecipeParametersArgs,RecipeParameterMapArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public RecipeActionArgs(
        Input<String> operation,
        @Nullable Input<Either<RecipeParametersArgs,RecipeParameterMapArgs>> parameters) {
        this.operation = Objects.requireNonNull(operation, "expected parameter 'operation' to be non-null");
        this.parameters = parameters;
    }

    private RecipeActionArgs() {
        this.operation = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> operation;
        private @Nullable Input<Either<RecipeParametersArgs,RecipeParameterMapArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.parameters = defaults.parameters;
        }

        public Builder operation(Input<String> operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder operation(String operation) {
            this.operation = Input.of(Objects.requireNonNull(operation));
            return this;
        }

        public Builder parameters(@Nullable Input<Either<RecipeParametersArgs,RecipeParameterMapArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Either<RecipeParametersArgs,RecipeParameterMapArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }
        public RecipeActionArgs build() {
            return new RecipeActionArgs(operation, parameters);
        }
    }
}
