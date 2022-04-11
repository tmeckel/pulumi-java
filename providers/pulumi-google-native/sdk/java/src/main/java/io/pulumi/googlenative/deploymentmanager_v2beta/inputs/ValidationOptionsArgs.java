// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="schemaValidation")
      private final @Nullable Output<ValidationOptionsSchemaValidation> schemaValidation;

    public Output<ValidationOptionsSchemaValidation> getSchemaValidation() {
        return this.schemaValidation == null ? Codegen.empty() : this.schemaValidation;
    }

    /**
     * Specify what to do with extra properties when executing a request.
     * 
     */
    @Import(name="undeclaredProperties")
      private final @Nullable Output<ValidationOptionsUndeclaredProperties> undeclaredProperties;

    public Output<ValidationOptionsUndeclaredProperties> getUndeclaredProperties() {
        return this.undeclaredProperties == null ? Codegen.empty() : this.undeclaredProperties;
    }

    public ValidationOptionsArgs(
        @Nullable Output<ValidationOptionsSchemaValidation> schemaValidation,
        @Nullable Output<ValidationOptionsUndeclaredProperties> undeclaredProperties) {
        this.schemaValidation = schemaValidation;
        this.undeclaredProperties = undeclaredProperties;
    }

    private ValidationOptionsArgs() {
        this.schemaValidation = Codegen.empty();
        this.undeclaredProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ValidationOptionsSchemaValidation> schemaValidation;
        private @Nullable Output<ValidationOptionsUndeclaredProperties> undeclaredProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schemaValidation = defaults.schemaValidation;
    	      this.undeclaredProperties = defaults.undeclaredProperties;
        }

        public Builder schemaValidation(@Nullable Output<ValidationOptionsSchemaValidation> schemaValidation) {
            this.schemaValidation = schemaValidation;
            return this;
        }
        public Builder schemaValidation(@Nullable ValidationOptionsSchemaValidation schemaValidation) {
            this.schemaValidation = Codegen.ofNullable(schemaValidation);
            return this;
        }
        public Builder undeclaredProperties(@Nullable Output<ValidationOptionsUndeclaredProperties> undeclaredProperties) {
            this.undeclaredProperties = undeclaredProperties;
            return this;
        }
        public Builder undeclaredProperties(@Nullable ValidationOptionsUndeclaredProperties undeclaredProperties) {
            this.undeclaredProperties = Codegen.ofNullable(undeclaredProperties);
            return this;
        }        public ValidationOptionsArgs build() {
            return new ValidationOptionsArgs(schemaValidation, undeclaredProperties);
        }
    }
}
