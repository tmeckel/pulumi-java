// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class CompletenessResponse {
    /**
     * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
     * 
     */
    private final Boolean arguments;
    /**
     * If true, the builder claims that recipe.environment is claimed to be complete.
     * 
     */
    private final Boolean environment;
    /**
     * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called "hermetic".
     * 
     */
    private final Boolean materials;

    @OutputCustomType.Constructor({"arguments","environment","materials"})
    private CompletenessResponse(
        Boolean arguments,
        Boolean environment,
        Boolean materials) {
        this.arguments = Objects.requireNonNull(arguments);
        this.environment = Objects.requireNonNull(environment);
        this.materials = Objects.requireNonNull(materials);
    }

    /**
     * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
     * 
     */
    public Boolean getArguments() {
        return this.arguments;
    }
    /**
     * If true, the builder claims that recipe.environment is claimed to be complete.
     * 
     */
    public Boolean getEnvironment() {
        return this.environment;
    }
    /**
     * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called "hermetic".
     * 
     */
    public Boolean getMaterials() {
        return this.materials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompletenessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean arguments;
        private Boolean environment;
        private Boolean materials;

        public Builder() {
    	      // Empty
        }

        public Builder(CompletenessResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
        }

        public Builder setArguments(Boolean arguments) {
            this.arguments = Objects.requireNonNull(arguments);
            return this;
        }

        public Builder setEnvironment(Boolean environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setMaterials(Boolean materials) {
            this.materials = Objects.requireNonNull(materials);
            return this;
        }

        public CompletenessResponse build() {
            return new CompletenessResponse(arguments, environment, materials);
        }
    }
}
