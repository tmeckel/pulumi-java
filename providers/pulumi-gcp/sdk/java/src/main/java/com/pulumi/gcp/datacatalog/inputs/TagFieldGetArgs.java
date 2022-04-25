// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagFieldGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagFieldGetArgs Empty = new TagFieldGetArgs();

    /**
     * Holds the value for a tag field with boolean type.
     * 
     */
    @Import(name="boolValue")
    private @Nullable Output<Boolean> boolValue;

    /**
     * @return Holds the value for a tag field with boolean type.
     * 
     */
    public Optional<Output<Boolean>> boolValue() {
        return Optional.ofNullable(this.boolValue);
    }

    /**
     * - 
     * The display name of this field
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return -
     * The display name of this field
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Holds the value for a tag field with double type.
     * 
     */
    @Import(name="doubleValue")
    private @Nullable Output<Double> doubleValue;

    /**
     * @return Holds the value for a tag field with double type.
     * 
     */
    public Optional<Output<Double>> doubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }

    /**
     * Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum.
     * Structure is documented below.
     * 
     */
    @Import(name="enumValue")
    private @Nullable Output<String> enumValue;

    /**
     * @return Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum.
     * Structure is documented below.
     * 
     */
    public Optional<Output<String>> enumValue() {
        return Optional.ofNullable(this.enumValue);
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="fieldName", required=true)
    private Output<String> fieldName;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> fieldName() {
        return this.fieldName;
    }

    /**
     * - 
     * The order of this field with respect to other fields in this tag. For example, a higher value can indicate
     * a more important field. The value can be negative. Multiple fields can have the same order, and field orders
     * within a tag do not have to be sequential.
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return -
     * The order of this field with respect to other fields in this tag. For example, a higher value can indicate
     * a more important field. The value can be negative. Multiple fields can have the same order, and field orders
     * within a tag do not have to be sequential.
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Holds the value for a tag field with string type.
     * 
     */
    @Import(name="stringValue")
    private @Nullable Output<String> stringValue;

    /**
     * @return Holds the value for a tag field with string type.
     * 
     */
    public Optional<Output<String>> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    /**
     * Holds the value for a tag field with timestamp type.
     * 
     */
    @Import(name="timestampValue")
    private @Nullable Output<String> timestampValue;

    /**
     * @return Holds the value for a tag field with timestamp type.
     * 
     */
    public Optional<Output<String>> timestampValue() {
        return Optional.ofNullable(this.timestampValue);
    }

    private TagFieldGetArgs() {}

    private TagFieldGetArgs(TagFieldGetArgs $) {
        this.boolValue = $.boolValue;
        this.displayName = $.displayName;
        this.doubleValue = $.doubleValue;
        this.enumValue = $.enumValue;
        this.fieldName = $.fieldName;
        this.order = $.order;
        this.stringValue = $.stringValue;
        this.timestampValue = $.timestampValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagFieldGetArgs $;

        public Builder() {
            $ = new TagFieldGetArgs();
        }

        public Builder(TagFieldGetArgs defaults) {
            $ = new TagFieldGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param boolValue Holds the value for a tag field with boolean type.
         * 
         * @return builder
         * 
         */
        public Builder boolValue(@Nullable Output<Boolean> boolValue) {
            $.boolValue = boolValue;
            return this;
        }

        /**
         * @param boolValue Holds the value for a tag field with boolean type.
         * 
         * @return builder
         * 
         */
        public Builder boolValue(Boolean boolValue) {
            return boolValue(Output.of(boolValue));
        }

        /**
         * @param displayName -
         * The display name of this field
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName -
         * The display name of this field
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param doubleValue Holds the value for a tag field with double type.
         * 
         * @return builder
         * 
         */
        public Builder doubleValue(@Nullable Output<Double> doubleValue) {
            $.doubleValue = doubleValue;
            return this;
        }

        /**
         * @param doubleValue Holds the value for a tag field with double type.
         * 
         * @return builder
         * 
         */
        public Builder doubleValue(Double doubleValue) {
            return doubleValue(Output.of(doubleValue));
        }

        /**
         * @param enumValue Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder enumValue(@Nullable Output<String> enumValue) {
            $.enumValue = enumValue;
            return this;
        }

        /**
         * @param enumValue Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder enumValue(String enumValue) {
            return enumValue(Output.of(enumValue));
        }

        /**
         * @param fieldName The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(Output<String> fieldName) {
            $.fieldName = fieldName;
            return this;
        }

        /**
         * @param fieldName The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(String fieldName) {
            return fieldName(Output.of(fieldName));
        }

        /**
         * @param order -
         * The order of this field with respect to other fields in this tag. For example, a higher value can indicate
         * a more important field. The value can be negative. Multiple fields can have the same order, and field orders
         * within a tag do not have to be sequential.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order -
         * The order of this field with respect to other fields in this tag. For example, a higher value can indicate
         * a more important field. The value can be negative. Multiple fields can have the same order, and field orders
         * within a tag do not have to be sequential.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        /**
         * @param stringValue Holds the value for a tag field with string type.
         * 
         * @return builder
         * 
         */
        public Builder stringValue(@Nullable Output<String> stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        /**
         * @param stringValue Holds the value for a tag field with string type.
         * 
         * @return builder
         * 
         */
        public Builder stringValue(String stringValue) {
            return stringValue(Output.of(stringValue));
        }

        /**
         * @param timestampValue Holds the value for a tag field with timestamp type.
         * 
         * @return builder
         * 
         */
        public Builder timestampValue(@Nullable Output<String> timestampValue) {
            $.timestampValue = timestampValue;
            return this;
        }

        /**
         * @param timestampValue Holds the value for a tag field with timestamp type.
         * 
         * @return builder
         * 
         */
        public Builder timestampValue(String timestampValue) {
            return timestampValue(Output.of(timestampValue));
        }

        public TagFieldGetArgs build() {
            $.fieldName = Objects.requireNonNull($.fieldName, "expected parameter 'fieldName' to be non-null");
            return $;
        }
    }

}
