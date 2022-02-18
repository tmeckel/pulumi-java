// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2beta.enums.ValidationOptionsSchemaValidation;
import io.pulumi.googlenative.deploymentmanager_v2beta.enums.ValidationOptionsUndeclaredProperties;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options for how to validate and process properties on a resource.
 * 
 */
public final class ValidationOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidationOptionsArgs Empty = new ValidationOptionsArgs();

    /**
     * Customize how deployment manager will validate the resource against schema errors.
     * 
     */
    @InputImport(name="schemaValidation")
    private final @Nullable Input<ValidationOptionsSchemaValidation> schemaValidation;

    public Input<ValidationOptionsSchemaValidation> getSchemaValidation() {
        return this.schemaValidation == null ? Input.empty() : this.schemaValidation;
    }

    /**
     * Specify what to do with extra properties when executing a request.
     * 
     */
    @InputImport(name="undeclaredProperties")
    private final @Nullable Input<ValidationOptionsUndeclaredProperties> undeclaredProperties;

    public Input<ValidationOptionsUndeclaredProperties> getUndeclaredProperties() {
        return this.undeclaredProperties == null ? Input.empty() : this.undeclaredProperties;
    }

    public ValidationOptionsArgs(
        @Nullable Input<ValidationOptionsSchemaValidation> schemaValidation,
        @Nullable Input<ValidationOptionsUndeclaredProperties> undeclaredProperties) {
        this.schemaValidation = schemaValidation;
        this.undeclaredProperties = undeclaredProperties;
    }

    private ValidationOptionsArgs() {
        this.schemaValidation = Input.empty();
        this.undeclaredProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ValidationOptionsSchemaValidation> schemaValidation;
        private @Nullable Input<ValidationOptionsUndeclaredProperties> undeclaredProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schemaValidation = defaults.schemaValidation;
    	      this.undeclaredProperties = defaults.undeclaredProperties;
        }

        public Builder setSchemaValidation(@Nullable Input<ValidationOptionsSchemaValidation> schemaValidation) {
            this.schemaValidation = schemaValidation;
            return this;
        }

        public Builder setSchemaValidation(@Nullable ValidationOptionsSchemaValidation schemaValidation) {
            this.schemaValidation = Input.ofNullable(schemaValidation);
            return this;
        }

        public Builder setUndeclaredProperties(@Nullable Input<ValidationOptionsUndeclaredProperties> undeclaredProperties) {
            this.undeclaredProperties = undeclaredProperties;
            return this;
        }

        public Builder setUndeclaredProperties(@Nullable ValidationOptionsUndeclaredProperties undeclaredProperties) {
            this.undeclaredProperties = Input.ofNullable(undeclaredProperties);
            return this;
        }

        public ValidationOptionsArgs build() {
            return new ValidationOptionsArgs(schemaValidation, undeclaredProperties);
        }
    }
}
