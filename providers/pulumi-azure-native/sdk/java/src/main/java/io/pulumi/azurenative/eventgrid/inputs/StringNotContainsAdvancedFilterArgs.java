// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StringNotContains Advanced Filter.
 * 
 */
public final class StringNotContainsAdvancedFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final StringNotContainsAdvancedFilterArgs Empty = new StringNotContainsAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'StringNotContains'.
     * 
     */
    @InputImport(name="operatorType", required=true)
      private final Input<String> operatorType;

    public Input<String> getOperatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @InputImport(name="values")
      private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public StringNotContainsAdvancedFilterArgs(
        @Nullable Input<String> key,
        Input<String> operatorType,
        @Nullable Input<List<String>> values) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
        this.values = values;
    }

    private StringNotContainsAdvancedFilterArgs() {
        this.key = Input.empty();
        this.operatorType = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StringNotContainsAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private Input<String> operatorType;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(StringNotContainsAdvancedFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder operatorType(Input<String> operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder operatorType(String operatorType) {
            this.operatorType = Input.of(Objects.requireNonNull(operatorType));
            return this;
        }

        public Builder values(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }
        public StringNotContainsAdvancedFilterArgs build() {
            return new StringNotContainsAdvancedFilterArgs(key, operatorType, values);
        }
    }
}
