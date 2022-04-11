// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FilterFindingCriteriaCriterionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterFindingCriteriaCriterionArgs Empty = new FilterFindingCriteriaCriterionArgs();

    /**
     * List of string values to be evaluated.
     * 
     */
    @Import(name="equals")
      private final @Nullable Output<List<String>> equals;

    public Output<List<String>> getEquals() {
        return this.equals == null ? Codegen.empty() : this.equals;
    }

    /**
     * The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
     * 
     */
    @Import(name="field", required=true)
      private final Output<String> field;

    public Output<String> getField() {
        return this.field;
    }

    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="greaterThan")
      private final @Nullable Output<String> greaterThan;

    public Output<String> getGreaterThan() {
        return this.greaterThan == null ? Codegen.empty() : this.greaterThan;
    }

    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="greaterThanOrEqual")
      private final @Nullable Output<String> greaterThanOrEqual;

    public Output<String> getGreaterThanOrEqual() {
        return this.greaterThanOrEqual == null ? Codegen.empty() : this.greaterThanOrEqual;
    }

    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="lessThan")
      private final @Nullable Output<String> lessThan;

    public Output<String> getLessThan() {
        return this.lessThan == null ? Codegen.empty() : this.lessThan;
    }

    /**
     * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="lessThanOrEqual")
      private final @Nullable Output<String> lessThanOrEqual;

    public Output<String> getLessThanOrEqual() {
        return this.lessThanOrEqual == null ? Codegen.empty() : this.lessThanOrEqual;
    }

    /**
     * List of string values to be evaluated.
     * 
     */
    @Import(name="notEquals")
      private final @Nullable Output<List<String>> notEquals;

    public Output<List<String>> getNotEquals() {
        return this.notEquals == null ? Codegen.empty() : this.notEquals;
    }

    public FilterFindingCriteriaCriterionArgs(
        @Nullable Output<List<String>> equals,
        Output<String> field,
        @Nullable Output<String> greaterThan,
        @Nullable Output<String> greaterThanOrEqual,
        @Nullable Output<String> lessThan,
        @Nullable Output<String> lessThanOrEqual,
        @Nullable Output<List<String>> notEquals) {
        this.equals = equals;
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.greaterThan = greaterThan;
        this.greaterThanOrEqual = greaterThanOrEqual;
        this.lessThan = lessThan;
        this.lessThanOrEqual = lessThanOrEqual;
        this.notEquals = notEquals;
    }

    private FilterFindingCriteriaCriterionArgs() {
        this.equals = Codegen.empty();
        this.field = Codegen.empty();
        this.greaterThan = Codegen.empty();
        this.greaterThanOrEqual = Codegen.empty();
        this.lessThan = Codegen.empty();
        this.lessThanOrEqual = Codegen.empty();
        this.notEquals = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFindingCriteriaCriterionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> equals;
        private Output<String> field;
        private @Nullable Output<String> greaterThan;
        private @Nullable Output<String> greaterThanOrEqual;
        private @Nullable Output<String> lessThan;
        private @Nullable Output<String> lessThanOrEqual;
        private @Nullable Output<List<String>> notEquals;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFindingCriteriaCriterionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
    	      this.greaterThan = defaults.greaterThan;
    	      this.greaterThanOrEqual = defaults.greaterThanOrEqual;
    	      this.lessThan = defaults.lessThan;
    	      this.lessThanOrEqual = defaults.lessThanOrEqual;
    	      this.notEquals = defaults.notEquals;
        }

        public Builder equals(@Nullable Output<List<String>> equals) {
            this.equals = equals;
            return this;
        }
        public Builder equals(@Nullable List<String> equals) {
            this.equals = Codegen.ofNullable(equals);
            return this;
        }
        public Builder equals(String... equals) {
            return equals(List.of(equals));
        }
        public Builder field(Output<String> field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder field(String field) {
            this.field = Output.of(Objects.requireNonNull(field));
            return this;
        }
        public Builder greaterThan(@Nullable Output<String> greaterThan) {
            this.greaterThan = greaterThan;
            return this;
        }
        public Builder greaterThan(@Nullable String greaterThan) {
            this.greaterThan = Codegen.ofNullable(greaterThan);
            return this;
        }
        public Builder greaterThanOrEqual(@Nullable Output<String> greaterThanOrEqual) {
            this.greaterThanOrEqual = greaterThanOrEqual;
            return this;
        }
        public Builder greaterThanOrEqual(@Nullable String greaterThanOrEqual) {
            this.greaterThanOrEqual = Codegen.ofNullable(greaterThanOrEqual);
            return this;
        }
        public Builder lessThan(@Nullable Output<String> lessThan) {
            this.lessThan = lessThan;
            return this;
        }
        public Builder lessThan(@Nullable String lessThan) {
            this.lessThan = Codegen.ofNullable(lessThan);
            return this;
        }
        public Builder lessThanOrEqual(@Nullable Output<String> lessThanOrEqual) {
            this.lessThanOrEqual = lessThanOrEqual;
            return this;
        }
        public Builder lessThanOrEqual(@Nullable String lessThanOrEqual) {
            this.lessThanOrEqual = Codegen.ofNullable(lessThanOrEqual);
            return this;
        }
        public Builder notEquals(@Nullable Output<List<String>> notEquals) {
            this.notEquals = notEquals;
            return this;
        }
        public Builder notEquals(@Nullable List<String> notEquals) {
            this.notEquals = Codegen.ofNullable(notEquals);
            return this;
        }
        public Builder notEquals(String... notEquals) {
            return notEquals(List.of(notEquals));
        }        public FilterFindingCriteriaCriterionArgs build() {
            return new FilterFindingCriteriaCriterionArgs(equals, field, greaterThan, greaterThanOrEqual, lessThan, lessThanOrEqual, notEquals);
        }
    }
}
