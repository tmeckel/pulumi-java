// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Options for how to validate and process properties on a resource.
 * 
 */
public final class ValidationOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidationOptionsResponse Empty = new ValidationOptionsResponse();

    /**
     * Customize how deployment manager will validate the resource against schema errors.
     * 
     */
    @InputImport(name="schemaValidation", required=true)
    private final String schemaValidation;

    public String getSchemaValidation() {
        return this.schemaValidation;
    }

    /**
     * Specify what to do with extra properties when executing a request.
     * 
     */
    @InputImport(name="undeclaredProperties", required=true)
    private final String undeclaredProperties;

    public String getUndeclaredProperties() {
        return this.undeclaredProperties;
    }

    public ValidationOptionsResponse(
        String schemaValidation,
        String undeclaredProperties) {
        this.schemaValidation = Objects.requireNonNull(schemaValidation, "expected parameter 'schemaValidation' to be non-null");
        this.undeclaredProperties = Objects.requireNonNull(undeclaredProperties, "expected parameter 'undeclaredProperties' to be non-null");
    }

    private ValidationOptionsResponse() {
        this.schemaValidation = null;
        this.undeclaredProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schemaValidation;
        private String undeclaredProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schemaValidation = defaults.schemaValidation;
    	      this.undeclaredProperties = defaults.undeclaredProperties;
        }

        public Builder setSchemaValidation(String schemaValidation) {
            this.schemaValidation = Objects.requireNonNull(schemaValidation);
            return this;
        }

        public Builder setUndeclaredProperties(String undeclaredProperties) {
            this.undeclaredProperties = Objects.requireNonNull(undeclaredProperties);
            return this;
        }

        public ValidationOptionsResponse build() {
            return new ValidationOptionsResponse(schemaValidation, undeclaredProperties);
        }
    }
}
