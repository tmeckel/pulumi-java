// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FieldDefinitionResponse {
    /**
     * Gets or sets the isEncrypted flag of the connection field definition.
     * 
     */
    private final @Nullable Boolean isEncrypted;
    /**
     * Gets or sets the isOptional flag of the connection field definition.
     * 
     */
    private final @Nullable Boolean isOptional;
    /**
     * Gets or sets the type of the connection field definition.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private FieldDefinitionResponse(
        @OutputCustomType.Parameter("isEncrypted") @Nullable Boolean isEncrypted,
        @OutputCustomType.Parameter("isOptional") @Nullable Boolean isOptional,
        @OutputCustomType.Parameter("type") String type) {
        this.isEncrypted = isEncrypted;
        this.isOptional = isOptional;
        this.type = type;
    }

    /**
     * Gets or sets the isEncrypted flag of the connection field definition.
     * 
    */
    public Optional<Boolean> getIsEncrypted() {
        return Optional.ofNullable(this.isEncrypted);
    }
    /**
     * Gets or sets the isOptional flag of the connection field definition.
     * 
    */
    public Optional<Boolean> getIsOptional() {
        return Optional.ofNullable(this.isOptional);
    }
    /**
     * Gets or sets the type of the connection field definition.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isEncrypted;
        private @Nullable Boolean isOptional;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEncrypted = defaults.isEncrypted;
    	      this.isOptional = defaults.isOptional;
    	      this.type = defaults.type;
        }

        public Builder isEncrypted(@Nullable Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }

        public Builder isOptional(@Nullable Boolean isOptional) {
            this.isOptional = isOptional;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FieldDefinitionResponse build() {
            return new FieldDefinitionResponse(isEncrypted, isOptional, type);
        }
    }
}
