// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Steps taken to build the artifact. For a TaskRun, typically each container corresponds to one step in the recipe.
 * 
 */
public final class SlsaRecipeResponse extends io.pulumi.resources.InvokeArgs {

    public static final SlsaRecipeResponse Empty = new SlsaRecipeResponse();

    /**
     * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were "make", then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint. Depending on the recipe Type, the structure may be different.
     * 
     */
    @InputImport(name="arguments", required=true)
    private final Map<String,String> arguments;

    public Map<String,String> getArguments() {
        return this.arguments;
    }

    /**
     * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were "make", then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn't come from a material, as zero is default unset value for int64.
     * 
     */
    @InputImport(name="definedInMaterial", required=true)
    private final String definedInMaterial;

    public String getDefinedInMaterial() {
        return this.definedInMaterial;
    }

    /**
     * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were "make", then this would reference the directory in which to run make as well as which target to use.
     * 
     */
    @InputImport(name="entryPoint", required=true)
    private final String entryPoint;

    public String getEntryPoint() {
        return this.entryPoint;
    }

    /**
     * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Depending on the recipe Type, the structure may be different.
     * 
     */
    @InputImport(name="environment", required=true)
    private final Map<String,String> environment;

    public Map<String,String> getEnvironment() {
        return this.environment;
    }

    /**
     * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public SlsaRecipeResponse(
        Map<String,String> arguments,
        String definedInMaterial,
        String entryPoint,
        Map<String,String> environment,
        String type) {
        this.arguments = Objects.requireNonNull(arguments, "expected parameter 'arguments' to be non-null");
        this.definedInMaterial = Objects.requireNonNull(definedInMaterial, "expected parameter 'definedInMaterial' to be non-null");
        this.entryPoint = Objects.requireNonNull(entryPoint, "expected parameter 'entryPoint' to be non-null");
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SlsaRecipeResponse() {
        this.arguments = Map.of();
        this.definedInMaterial = null;
        this.entryPoint = null;
        this.environment = Map.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaRecipeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> arguments;
        private String definedInMaterial;
        private String entryPoint;
        private Map<String,String> environment;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaRecipeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.definedInMaterial = defaults.definedInMaterial;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environment = defaults.environment;
    	      this.type = defaults.type;
        }

        public Builder setArguments(Map<String,String> arguments) {
            this.arguments = Objects.requireNonNull(arguments);
            return this;
        }

        public Builder setDefinedInMaterial(String definedInMaterial) {
            this.definedInMaterial = Objects.requireNonNull(definedInMaterial);
            return this;
        }

        public Builder setEntryPoint(String entryPoint) {
            this.entryPoint = Objects.requireNonNull(entryPoint);
            return this;
        }

        public Builder setEnvironment(Map<String,String> environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public SlsaRecipeResponse build() {
            return new SlsaRecipeResponse(arguments, definedInMaterial, entryPoint, environment, type);
        }
    }
}
