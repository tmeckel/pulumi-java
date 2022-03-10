// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserPoolSchemaNumberAttributeConstraints {
    /**
     * Maximum value of an attribute that is of the number data type.
     * 
     */
    private final @Nullable String maxValue;
    /**
     * Minimum value of an attribute that is of the number data type.
     * 
     */
    private final @Nullable String minValue;

    @OutputCustomType.Constructor
    private UserPoolSchemaNumberAttributeConstraints(
        @OutputCustomType.Parameter("maxValue") @Nullable String maxValue,
        @OutputCustomType.Parameter("minValue") @Nullable String minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    /**
     * Maximum value of an attribute that is of the number data type.
     * 
    */
    public Optional<String> getMaxValue() {
        return Optional.ofNullable(this.maxValue);
    }
    /**
     * Minimum value of an attribute that is of the number data type.
     * 
    */
    public Optional<String> getMinValue() {
        return Optional.ofNullable(this.minValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolSchemaNumberAttributeConstraints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String maxValue;
        private @Nullable String minValue;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolSchemaNumberAttributeConstraints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
        }

        public Builder maxValue(@Nullable String maxValue) {
            this.maxValue = maxValue;
            return this;
        }

        public Builder minValue(@Nullable String minValue) {
            this.minValue = minValue;
            return this;
        }
        public UserPoolSchemaNumberAttributeConstraints build() {
            return new UserPoolSchemaNumberAttributeConstraints(maxValue, minValue);
        }
    }
}
