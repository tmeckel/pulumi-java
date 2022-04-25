// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Condition expressions applied to the step action
 * 
 */
public final class RecipeConditionExpression extends com.pulumi.resources.InvokeArgs {

    public static final RecipeConditionExpression Empty = new RecipeConditionExpression();

    /**
     * Input condition to be applied to the target column
     * 
     */
    @Import(name="condition", required=true)
    private String condition;

    /**
     * @return Input condition to be applied to the target column
     * 
     */
    public String condition() {
        return this.condition;
    }

    /**
     * Name of the target column
     * 
     */
    @Import(name="targetColumn", required=true)
    private String targetColumn;

    /**
     * @return Name of the target column
     * 
     */
    public String targetColumn() {
        return this.targetColumn;
    }

    /**
     * Value of the condition
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return Value of the condition
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private RecipeConditionExpression() {}

    private RecipeConditionExpression(RecipeConditionExpression $) {
        this.condition = $.condition;
        this.targetColumn = $.targetColumn;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecipeConditionExpression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecipeConditionExpression $;

        public Builder() {
            $ = new RecipeConditionExpression();
        }

        public Builder(RecipeConditionExpression defaults) {
            $ = new RecipeConditionExpression(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition Input condition to be applied to the target column
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param targetColumn Name of the target column
         * 
         * @return builder
         * 
         */
        public Builder targetColumn(String targetColumn) {
            $.targetColumn = targetColumn;
            return this;
        }

        /**
         * @param value Value of the condition
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public RecipeConditionExpression build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.targetColumn = Objects.requireNonNull($.targetColumn, "expected parameter 'targetColumn' to be non-null");
            return $;
        }
    }

}
