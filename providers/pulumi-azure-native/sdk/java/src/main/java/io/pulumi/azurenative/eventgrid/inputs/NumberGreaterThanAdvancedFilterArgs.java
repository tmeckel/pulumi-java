// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NumberGreaterThan Advanced Filter.
 * 
 */
public final class NumberGreaterThanAdvancedFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final NumberGreaterThanAdvancedFilterArgs Empty = new NumberGreaterThanAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'NumberGreaterThan'.
     * 
     */
    @Import(name="operatorType", required=true)
      private final Output<String> operatorType;

    public Output<String> getOperatorType() {
        return this.operatorType;
    }

    /**
     * The filter value.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Double> value;

    public Output<Double> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public NumberGreaterThanAdvancedFilterArgs(
        @Nullable Output<String> key,
        Output<String> operatorType,
        @Nullable Output<Double> value) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
        this.value = value;
    }

    private NumberGreaterThanAdvancedFilterArgs() {
        this.key = Codegen.empty();
        this.operatorType = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NumberGreaterThanAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private Output<String> operatorType;
        private @Nullable Output<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(NumberGreaterThanAdvancedFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder operatorType(Output<String> operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }
        public Builder operatorType(String operatorType) {
            this.operatorType = Output.of(Objects.requireNonNull(operatorType));
            return this;
        }
        public Builder value(@Nullable Output<Double> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Double value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public NumberGreaterThanAdvancedFilterArgs build() {
            return new NumberGreaterThanAdvancedFilterArgs(key, operatorType, value);
        }
    }
}
