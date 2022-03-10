// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs Empty = new ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs();

    /**
     * The operator to use in a condition. Valid values are: `EQ`, `GT`, `GTE`, `LT`, `LTE`, `NE`, `CONTAINS`, `STARTS_WITH`
     * 
     */
    @InputImport(name="comparator")
      private final @Nullable Input<String> comparator;

    public Input<String> getComparator() {
        return this.comparator == null ? Input.empty() : this.comparator;
    }

    /**
     * The object property to use in the condition.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * An array that lists the values to use in the condition.
     * 
     */
    @InputImport(name="values")
      private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs(
        @Nullable Input<String> comparator,
        @Nullable Input<String> key,
        @Nullable Input<List<String>> values) {
        this.comparator = comparator;
        this.key = key;
        this.values = values;
    }

    private ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs() {
        this.comparator = Input.empty();
        this.key = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> comparator;
        private @Nullable Input<String> key;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparator = defaults.comparator;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder comparator(@Nullable Input<String> comparator) {
            this.comparator = comparator;
            return this;
        }

        public Builder comparator(@Nullable String comparator) {
            this.comparator = Input.ofNullable(comparator);
            return this;
        }

        public Builder key(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Input.ofNullable(key);
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
        public ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs build() {
            return new ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTermArgs(comparator, key, values);
        }
    }
}
