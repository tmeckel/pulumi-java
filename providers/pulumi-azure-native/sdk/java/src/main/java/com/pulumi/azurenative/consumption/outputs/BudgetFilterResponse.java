// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.consumption.outputs;

import com.pulumi.azurenative.consumption.outputs.BudgetComparisonExpressionResponse;
import com.pulumi.azurenative.consumption.outputs.BudgetFilterPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetFilterResponse {
    /**
     * @return The logical &#34;AND&#34; expression. Must have at least 2 items.
     * 
     */
    private final @Nullable List<BudgetFilterPropertiesResponse> and;
    /**
     * @return Has comparison expression for a dimension
     * 
     */
    private final @Nullable BudgetComparisonExpressionResponse dimensions;
    /**
     * @return The logical &#34;NOT&#34; expression.
     * 
     */
    private final @Nullable BudgetFilterPropertiesResponse not;
    /**
     * @return Has comparison expression for a tag
     * 
     */
    private final @Nullable BudgetComparisonExpressionResponse tags;

    @CustomType.Constructor
    private BudgetFilterResponse(
        @CustomType.Parameter("and") @Nullable List<BudgetFilterPropertiesResponse> and,
        @CustomType.Parameter("dimensions") @Nullable BudgetComparisonExpressionResponse dimensions,
        @CustomType.Parameter("not") @Nullable BudgetFilterPropertiesResponse not,
        @CustomType.Parameter("tags") @Nullable BudgetComparisonExpressionResponse tags) {
        this.and = and;
        this.dimensions = dimensions;
        this.not = not;
        this.tags = tags;
    }

    /**
     * @return The logical &#34;AND&#34; expression. Must have at least 2 items.
     * 
     */
    public List<BudgetFilterPropertiesResponse> and() {
        return this.and == null ? List.of() : this.and;
    }
    /**
     * @return Has comparison expression for a dimension
     * 
     */
    public Optional<BudgetComparisonExpressionResponse> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }
    /**
     * @return The logical &#34;NOT&#34; expression.
     * 
     */
    public Optional<BudgetFilterPropertiesResponse> not() {
        return Optional.ofNullable(this.not);
    }
    /**
     * @return Has comparison expression for a tag
     * 
     */
    public Optional<BudgetComparisonExpressionResponse> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BudgetFilterPropertiesResponse> and;
        private @Nullable BudgetComparisonExpressionResponse dimensions;
        private @Nullable BudgetFilterPropertiesResponse not;
        private @Nullable BudgetComparisonExpressionResponse tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.dimensions = defaults.dimensions;
    	      this.not = defaults.not;
    	      this.tags = defaults.tags;
        }

        public Builder and(@Nullable List<BudgetFilterPropertiesResponse> and) {
            this.and = and;
            return this;
        }
        public Builder and(BudgetFilterPropertiesResponse... and) {
            return and(List.of(and));
        }
        public Builder dimensions(@Nullable BudgetComparisonExpressionResponse dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder not(@Nullable BudgetFilterPropertiesResponse not) {
            this.not = not;
            return this;
        }
        public Builder tags(@Nullable BudgetComparisonExpressionResponse tags) {
            this.tags = tags;
            return this;
        }        public BudgetFilterResponse build() {
            return new BudgetFilterResponse(and, dimensions, not, tags);
        }
    }
}
