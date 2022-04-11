// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs Empty = new ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs();

    /**
     * The operator to use in a condition. Valid values are: `EQ`, `GT`, `GTE`, `LT`, `LTE`, `NE`, `CONTAINS`, `STARTS_WITH`
     * 
     */
    @Import(name="comparator")
      private final @Nullable Output<String> comparator;

    public Output<String> getComparator() {
        return this.comparator == null ? Codegen.empty() : this.comparator;
    }

    /**
     * The object property to use in the condition.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * An array that lists the values to use in the condition.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs(
        @Nullable Output<String> comparator,
        @Nullable Output<String> key,
        @Nullable Output<List<String>> values) {
        this.comparator = comparator;
        this.key = key;
        this.values = values;
    }

    private ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs() {
        this.comparator = Codegen.empty();
        this.key = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comparator;
        private @Nullable Output<String> key;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparator = defaults.comparator;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder comparator(@Nullable Output<String> comparator) {
            this.comparator = comparator;
            return this;
        }
        public Builder comparator(@Nullable String comparator) {
            this.comparator = Codegen.ofNullable(comparator);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs build() {
            return new ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermGetArgs(comparator, key, values);
        }
    }
}
