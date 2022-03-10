// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a filter which is a composition of an expression and an action that is executed in the pub/sub pipeline.
 * 
 */
public final class SqlFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlFilterArgs Empty = new SqlFilterArgs();

    /**
     * This property is reserved for future use. An integer value showing the compatibility level, currently hard-coded to 20.
     * 
     */
    @InputImport(name="compatibilityLevel")
      private final @Nullable Input<Integer> compatibilityLevel;

    public Input<Integer> getCompatibilityLevel() {
        return this.compatibilityLevel == null ? Input.empty() : this.compatibilityLevel;
    }

    /**
     * Value that indicates whether the rule action requires preprocessing.
     * 
     */
    @InputImport(name="requiresPreprocessing")
      private final @Nullable Input<Boolean> requiresPreprocessing;

    public Input<Boolean> getRequiresPreprocessing() {
        return this.requiresPreprocessing == null ? Input.empty() : this.requiresPreprocessing;
    }

    /**
     * The SQL expression. e.g. MyProperty='ABC'
     * 
     */
    @InputImport(name="sqlExpression")
      private final @Nullable Input<String> sqlExpression;

    public Input<String> getSqlExpression() {
        return this.sqlExpression == null ? Input.empty() : this.sqlExpression;
    }

    public SqlFilterArgs(
        @Nullable Input<Integer> compatibilityLevel,
        @Nullable Input<Boolean> requiresPreprocessing,
        @Nullable Input<String> sqlExpression) {
        this.compatibilityLevel = compatibilityLevel == null ? Input.ofNullable(20) : compatibilityLevel;
        this.requiresPreprocessing = requiresPreprocessing == null ? Input.ofNullable(true) : requiresPreprocessing;
        this.sqlExpression = sqlExpression;
    }

    private SqlFilterArgs() {
        this.compatibilityLevel = Input.empty();
        this.requiresPreprocessing = Input.empty();
        this.sqlExpression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> compatibilityLevel;
        private @Nullable Input<Boolean> requiresPreprocessing;
        private @Nullable Input<String> sqlExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.requiresPreprocessing = defaults.requiresPreprocessing;
    	      this.sqlExpression = defaults.sqlExpression;
        }

        public Builder compatibilityLevel(@Nullable Input<Integer> compatibilityLevel) {
            this.compatibilityLevel = compatibilityLevel;
            return this;
        }

        public Builder compatibilityLevel(@Nullable Integer compatibilityLevel) {
            this.compatibilityLevel = Input.ofNullable(compatibilityLevel);
            return this;
        }

        public Builder requiresPreprocessing(@Nullable Input<Boolean> requiresPreprocessing) {
            this.requiresPreprocessing = requiresPreprocessing;
            return this;
        }

        public Builder requiresPreprocessing(@Nullable Boolean requiresPreprocessing) {
            this.requiresPreprocessing = Input.ofNullable(requiresPreprocessing);
            return this;
        }

        public Builder sqlExpression(@Nullable Input<String> sqlExpression) {
            this.sqlExpression = sqlExpression;
            return this;
        }

        public Builder sqlExpression(@Nullable String sqlExpression) {
            this.sqlExpression = Input.ofNullable(sqlExpression);
            return this;
        }
        public SqlFilterArgs build() {
            return new SqlFilterArgs(compatibilityLevel, requiresPreprocessing, sqlExpression);
        }
    }
}
