// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Operation parameters details.
 * 
 */
public final class ParameterContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final ParameterContractResponse Empty = new ParameterContractResponse();

    /**
     * Default parameter value.
     * 
     */
    @InputImport(name="defaultValue")
      private final @Nullable String defaultValue;

    public Optional<String> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue);
    }

    /**
     * Parameter description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Parameter name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specifies whether parameter is required or not.
     * 
     */
    @InputImport(name="required")
      private final @Nullable Boolean required;

    public Optional<Boolean> getRequired() {
        return this.required == null ? Optional.empty() : Optional.ofNullable(this.required);
    }

    /**
     * Parameter type.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Parameter values.
     * 
     */
    @InputImport(name="values")
      private final @Nullable List<String> values;

    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public ParameterContractResponse(
        @Nullable String defaultValue,
        @Nullable String description,
        String name,
        @Nullable Boolean required,
        String type,
        @Nullable List<String> values) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.required = required;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
    }

    private ParameterContractResponse() {
        this.defaultValue = null;
        this.description = null;
        this.name = null;
        this.required = null;
        this.type = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable String description;
        private String name;
        private @Nullable Boolean required;
        private String type;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.required = defaults.required;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ParameterContractResponse build() {
            return new ParameterContractResponse(defaultValue, description, name, required, type, values);
        }
    }
}
