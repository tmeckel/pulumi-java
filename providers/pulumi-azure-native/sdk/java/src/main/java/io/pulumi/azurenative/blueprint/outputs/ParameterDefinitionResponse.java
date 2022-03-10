// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ParameterDefinitionResponse {
    /**
     * Array of allowed values for this parameter.
     * 
     */
    private final @Nullable List<Object> allowedValues;
    /**
     * Default Value for this parameter.
     * 
     */
    private final @Nullable Object defaultValue;
    /**
     * Description of this parameter/resourceGroup.
     * 
     */
    private final @Nullable String description;
    /**
     * DisplayName of this parameter/resourceGroup.
     * 
     */
    private final @Nullable String displayName;
    /**
     * StrongType for UI to render rich experience during blueprint assignment. Supported strong types are resourceType, principalId and location.
     * 
     */
    private final @Nullable String strongType;
    /**
     * Allowed data types for Resource Manager template parameters.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ParameterDefinitionResponse(
        @OutputCustomType.Parameter("allowedValues") @Nullable List<Object> allowedValues,
        @OutputCustomType.Parameter("defaultValue") @Nullable Object defaultValue,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("strongType") @Nullable String strongType,
        @OutputCustomType.Parameter("type") String type) {
        this.allowedValues = allowedValues;
        this.defaultValue = defaultValue;
        this.description = description;
        this.displayName = displayName;
        this.strongType = strongType;
        this.type = type;
    }

    /**
     * Array of allowed values for this parameter.
     * 
    */
    public List<Object> getAllowedValues() {
        return this.allowedValues == null ? List.of() : this.allowedValues;
    }
    /**
     * Default Value for this parameter.
     * 
    */
    public Optional<Object> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * Description of this parameter/resourceGroup.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * DisplayName of this parameter/resourceGroup.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * StrongType for UI to render rich experience during blueprint assignment. Supported strong types are resourceType, principalId and location.
     * 
    */
    public Optional<String> getStrongType() {
        return Optional.ofNullable(this.strongType);
    }
    /**
     * Allowed data types for Resource Manager template parameters.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> allowedValues;
        private @Nullable Object defaultValue;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String strongType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.strongType = defaults.strongType;
    	      this.type = defaults.type;
        }

        public Builder allowedValues(@Nullable List<Object> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder defaultValue(@Nullable Object defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder strongType(@Nullable String strongType) {
            this.strongType = strongType;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ParameterDefinitionResponse build() {
            return new ParameterDefinitionResponse(allowedValues, defaultValue, description, displayName, strongType, type);
        }
    }
}
