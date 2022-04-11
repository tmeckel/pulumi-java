// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolSchemaNumberAttributeConstraintsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolSchemaNumberAttributeConstraintsGetArgs Empty = new UserPoolSchemaNumberAttributeConstraintsGetArgs();

    /**
     * Maximum value of an attribute that is of the number data type.
     * 
     */
    @Import(name="maxValue")
      private final @Nullable Output<String> maxValue;

    public Output<String> getMaxValue() {
        return this.maxValue == null ? Codegen.empty() : this.maxValue;
    }

    /**
     * Minimum value of an attribute that is of the number data type.
     * 
     */
    @Import(name="minValue")
      private final @Nullable Output<String> minValue;

    public Output<String> getMinValue() {
        return this.minValue == null ? Codegen.empty() : this.minValue;
    }

    public UserPoolSchemaNumberAttributeConstraintsGetArgs(
        @Nullable Output<String> maxValue,
        @Nullable Output<String> minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    private UserPoolSchemaNumberAttributeConstraintsGetArgs() {
        this.maxValue = Codegen.empty();
        this.minValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolSchemaNumberAttributeConstraintsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> maxValue;
        private @Nullable Output<String> minValue;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolSchemaNumberAttributeConstraintsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
        }

        public Builder maxValue(@Nullable Output<String> maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Builder maxValue(@Nullable String maxValue) {
            this.maxValue = Codegen.ofNullable(maxValue);
            return this;
        }
        public Builder minValue(@Nullable Output<String> minValue) {
            this.minValue = minValue;
            return this;
        }
        public Builder minValue(@Nullable String minValue) {
            this.minValue = Codegen.ofNullable(minValue);
            return this;
        }        public UserPoolSchemaNumberAttributeConstraintsGetArgs build() {
            return new UserPoolSchemaNumberAttributeConstraintsGetArgs(maxValue, minValue);
        }
    }
}
