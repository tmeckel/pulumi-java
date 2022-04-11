// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ReportConfigComparisonExpressionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The filter expression to be used in the report.
 * 
 */
public final class ReportConfigFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportConfigFilterArgs Empty = new ReportConfigFilterArgs();

    /**
     * The logical "AND" expression. Must have at least 2 items.
     * 
     */
    @Import(name="and")
      private final @Nullable Output<List<ReportConfigFilterArgs>> and;

    public Output<List<ReportConfigFilterArgs>> getAnd() {
        return this.and == null ? Codegen.empty() : this.and;
    }

    /**
     * Has comparison expression for a dimension
     * 
     */
    @Import(name="dimensions")
      private final @Nullable Output<ReportConfigComparisonExpressionArgs> dimensions;

    public Output<ReportConfigComparisonExpressionArgs> getDimensions() {
        return this.dimensions == null ? Codegen.empty() : this.dimensions;
    }

    /**
     * The logical "OR" expression. Must have at least 2 items.
     * 
     */
    @Import(name="or")
      private final @Nullable Output<List<ReportConfigFilterArgs>> or;

    public Output<List<ReportConfigFilterArgs>> getOr() {
        return this.or == null ? Codegen.empty() : this.or;
    }

    /**
     * Has comparison expression for a tag key
     * 
     */
    @Import(name="tagKey")
      private final @Nullable Output<ReportConfigComparisonExpressionArgs> tagKey;

    public Output<ReportConfigComparisonExpressionArgs> getTagKey() {
        return this.tagKey == null ? Codegen.empty() : this.tagKey;
    }

    /**
     * Has comparison expression for a tag value
     * 
     */
    @Import(name="tagValue")
      private final @Nullable Output<ReportConfigComparisonExpressionArgs> tagValue;

    public Output<ReportConfigComparisonExpressionArgs> getTagValue() {
        return this.tagValue == null ? Codegen.empty() : this.tagValue;
    }

    /**
     * Has comparison expression for a tag
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<ReportConfigComparisonExpressionArgs> tags;

    public Output<ReportConfigComparisonExpressionArgs> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ReportConfigFilterArgs(
        @Nullable Output<List<ReportConfigFilterArgs>> and,
        @Nullable Output<ReportConfigComparisonExpressionArgs> dimensions,
        @Nullable Output<List<ReportConfigFilterArgs>> or,
        @Nullable Output<ReportConfigComparisonExpressionArgs> tagKey,
        @Nullable Output<ReportConfigComparisonExpressionArgs> tagValue,
        @Nullable Output<ReportConfigComparisonExpressionArgs> tags) {
        this.and = and;
        this.dimensions = dimensions;
        this.or = or;
        this.tagKey = tagKey;
        this.tagValue = tagValue;
        this.tags = tags;
    }

    private ReportConfigFilterArgs() {
        this.and = Codegen.empty();
        this.dimensions = Codegen.empty();
        this.or = Codegen.empty();
        this.tagKey = Codegen.empty();
        this.tagValue = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ReportConfigFilterArgs>> and;
        private @Nullable Output<ReportConfigComparisonExpressionArgs> dimensions;
        private @Nullable Output<List<ReportConfigFilterArgs>> or;
        private @Nullable Output<ReportConfigComparisonExpressionArgs> tagKey;
        private @Nullable Output<ReportConfigComparisonExpressionArgs> tagValue;
        private @Nullable Output<ReportConfigComparisonExpressionArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.dimensions = defaults.dimensions;
    	      this.or = defaults.or;
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
    	      this.tags = defaults.tags;
        }

        public Builder and(@Nullable Output<List<ReportConfigFilterArgs>> and) {
            this.and = and;
            return this;
        }
        public Builder and(@Nullable List<ReportConfigFilterArgs> and) {
            this.and = Codegen.ofNullable(and);
            return this;
        }
        public Builder and(ReportConfigFilterArgs... and) {
            return and(List.of(and));
        }
        public Builder dimensions(@Nullable Output<ReportConfigComparisonExpressionArgs> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(@Nullable ReportConfigComparisonExpressionArgs dimensions) {
            this.dimensions = Codegen.ofNullable(dimensions);
            return this;
        }
        public Builder or(@Nullable Output<List<ReportConfigFilterArgs>> or) {
            this.or = or;
            return this;
        }
        public Builder or(@Nullable List<ReportConfigFilterArgs> or) {
            this.or = Codegen.ofNullable(or);
            return this;
        }
        public Builder or(ReportConfigFilterArgs... or) {
            return or(List.of(or));
        }
        public Builder tagKey(@Nullable Output<ReportConfigComparisonExpressionArgs> tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public Builder tagKey(@Nullable ReportConfigComparisonExpressionArgs tagKey) {
            this.tagKey = Codegen.ofNullable(tagKey);
            return this;
        }
        public Builder tagValue(@Nullable Output<ReportConfigComparisonExpressionArgs> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public Builder tagValue(@Nullable ReportConfigComparisonExpressionArgs tagValue) {
            this.tagValue = Codegen.ofNullable(tagValue);
            return this;
        }
        public Builder tags(@Nullable Output<ReportConfigComparisonExpressionArgs> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable ReportConfigComparisonExpressionArgs tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ReportConfigFilterArgs build() {
            return new ReportConfigFilterArgs(and, dimensions, or, tagKey, tagValue, tags);
        }
    }
}
