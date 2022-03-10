// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.UserPoolSchemaNumberAttributeConstraintsGetArgs;
import io.pulumi.aws.cognito.inputs.UserPoolSchemaStringAttributeConstraintsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolSchemaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolSchemaGetArgs Empty = new UserPoolSchemaGetArgs();

    /**
     * Attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
     * 
     */
    @InputImport(name="attributeDataType", required=true)
      private final Input<String> attributeDataType;

    public Input<String> getAttributeDataType() {
        return this.attributeDataType;
    }

    /**
     * Whether the attribute type is developer only.
     * 
     */
    @InputImport(name="developerOnlyAttribute")
      private final @Nullable Input<Boolean> developerOnlyAttribute;

    public Input<Boolean> getDeveloperOnlyAttribute() {
        return this.developerOnlyAttribute == null ? Input.empty() : this.developerOnlyAttribute;
    }

    /**
     * Whether the attribute can be changed once it has been created.
     * 
     */
    @InputImport(name="mutable")
      private final @Nullable Input<Boolean> mutable;

    public Input<Boolean> getMutable() {
        return this.mutable == null ? Input.empty() : this.mutable;
    }

    /**
     * Name of the attribute.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Configuration block for the constraints for an attribute of the number type. Detailed below.
     * 
     */
    @InputImport(name="numberAttributeConstraints")
      private final @Nullable Input<UserPoolSchemaNumberAttributeConstraintsGetArgs> numberAttributeConstraints;

    public Input<UserPoolSchemaNumberAttributeConstraintsGetArgs> getNumberAttributeConstraints() {
        return this.numberAttributeConstraints == null ? Input.empty() : this.numberAttributeConstraints;
    }

    /**
     * Whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
     * 
     */
    @InputImport(name="required")
      private final @Nullable Input<Boolean> required;

    public Input<Boolean> getRequired() {
        return this.required == null ? Input.empty() : this.required;
    }

    /**
     * Constraints for an attribute of the string type. Detailed below.
     * 
     */
    @InputImport(name="stringAttributeConstraints")
      private final @Nullable Input<UserPoolSchemaStringAttributeConstraintsGetArgs> stringAttributeConstraints;

    public Input<UserPoolSchemaStringAttributeConstraintsGetArgs> getStringAttributeConstraints() {
        return this.stringAttributeConstraints == null ? Input.empty() : this.stringAttributeConstraints;
    }

    public UserPoolSchemaGetArgs(
        Input<String> attributeDataType,
        @Nullable Input<Boolean> developerOnlyAttribute,
        @Nullable Input<Boolean> mutable,
        Input<String> name,
        @Nullable Input<UserPoolSchemaNumberAttributeConstraintsGetArgs> numberAttributeConstraints,
        @Nullable Input<Boolean> required,
        @Nullable Input<UserPoolSchemaStringAttributeConstraintsGetArgs> stringAttributeConstraints) {
        this.attributeDataType = Objects.requireNonNull(attributeDataType, "expected parameter 'attributeDataType' to be non-null");
        this.developerOnlyAttribute = developerOnlyAttribute;
        this.mutable = mutable;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.numberAttributeConstraints = numberAttributeConstraints;
        this.required = required;
        this.stringAttributeConstraints = stringAttributeConstraints;
    }

    private UserPoolSchemaGetArgs() {
        this.attributeDataType = Input.empty();
        this.developerOnlyAttribute = Input.empty();
        this.mutable = Input.empty();
        this.name = Input.empty();
        this.numberAttributeConstraints = Input.empty();
        this.required = Input.empty();
        this.stringAttributeConstraints = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolSchemaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> attributeDataType;
        private @Nullable Input<Boolean> developerOnlyAttribute;
        private @Nullable Input<Boolean> mutable;
        private Input<String> name;
        private @Nullable Input<UserPoolSchemaNumberAttributeConstraintsGetArgs> numberAttributeConstraints;
        private @Nullable Input<Boolean> required;
        private @Nullable Input<UserPoolSchemaStringAttributeConstraintsGetArgs> stringAttributeConstraints;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolSchemaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeDataType = defaults.attributeDataType;
    	      this.developerOnlyAttribute = defaults.developerOnlyAttribute;
    	      this.mutable = defaults.mutable;
    	      this.name = defaults.name;
    	      this.numberAttributeConstraints = defaults.numberAttributeConstraints;
    	      this.required = defaults.required;
    	      this.stringAttributeConstraints = defaults.stringAttributeConstraints;
        }

        public Builder attributeDataType(Input<String> attributeDataType) {
            this.attributeDataType = Objects.requireNonNull(attributeDataType);
            return this;
        }

        public Builder attributeDataType(String attributeDataType) {
            this.attributeDataType = Input.of(Objects.requireNonNull(attributeDataType));
            return this;
        }

        public Builder developerOnlyAttribute(@Nullable Input<Boolean> developerOnlyAttribute) {
            this.developerOnlyAttribute = developerOnlyAttribute;
            return this;
        }

        public Builder developerOnlyAttribute(@Nullable Boolean developerOnlyAttribute) {
            this.developerOnlyAttribute = Input.ofNullable(developerOnlyAttribute);
            return this;
        }

        public Builder mutable(@Nullable Input<Boolean> mutable) {
            this.mutable = mutable;
            return this;
        }

        public Builder mutable(@Nullable Boolean mutable) {
            this.mutable = Input.ofNullable(mutable);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder numberAttributeConstraints(@Nullable Input<UserPoolSchemaNumberAttributeConstraintsGetArgs> numberAttributeConstraints) {
            this.numberAttributeConstraints = numberAttributeConstraints;
            return this;
        }

        public Builder numberAttributeConstraints(@Nullable UserPoolSchemaNumberAttributeConstraintsGetArgs numberAttributeConstraints) {
            this.numberAttributeConstraints = Input.ofNullable(numberAttributeConstraints);
            return this;
        }

        public Builder required(@Nullable Input<Boolean> required) {
            this.required = required;
            return this;
        }

        public Builder required(@Nullable Boolean required) {
            this.required = Input.ofNullable(required);
            return this;
        }

        public Builder stringAttributeConstraints(@Nullable Input<UserPoolSchemaStringAttributeConstraintsGetArgs> stringAttributeConstraints) {
            this.stringAttributeConstraints = stringAttributeConstraints;
            return this;
        }

        public Builder stringAttributeConstraints(@Nullable UserPoolSchemaStringAttributeConstraintsGetArgs stringAttributeConstraints) {
            this.stringAttributeConstraints = Input.ofNullable(stringAttributeConstraints);
            return this;
        }
        public UserPoolSchemaGetArgs build() {
            return new UserPoolSchemaGetArgs(attributeDataType, developerOnlyAttribute, mutable, name, numberAttributeConstraints, required, stringAttributeConstraints);
        }
    }
}
