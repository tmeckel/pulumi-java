// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Steps taken to build the artifact. For a TaskRun, typically each container corresponds to one step in the recipe.
 * 
 */
public final class SlsaRecipeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SlsaRecipeArgs Empty = new SlsaRecipeArgs();

    /**
     * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were "make", then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint. Depending on the recipe Type, the structure may be different.
     * 
     */
    @InputImport(name="arguments")
    private final @Nullable Input<Map<String,String>> arguments;

    public Input<Map<String,String>> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were "make", then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn't come from a material, as zero is default unset value for int64.
     * 
     */
    @InputImport(name="definedInMaterial")
    private final @Nullable Input<String> definedInMaterial;

    public Input<String> getDefinedInMaterial() {
        return this.definedInMaterial == null ? Input.empty() : this.definedInMaterial;
    }

    /**
     * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were "make", then this would reference the directory in which to run make as well as which target to use.
     * 
     */
    @InputImport(name="entryPoint")
    private final @Nullable Input<String> entryPoint;

    public Input<String> getEntryPoint() {
        return this.entryPoint == null ? Input.empty() : this.entryPoint;
    }

    /**
     * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Depending on the recipe Type, the structure may be different.
     * 
     */
    @InputImport(name="environment")
    private final @Nullable Input<Map<String,String>> environment;

    public Input<Map<String,String>> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public SlsaRecipeArgs(
        @Nullable Input<Map<String,String>> arguments,
        @Nullable Input<String> definedInMaterial,
        @Nullable Input<String> entryPoint,
        @Nullable Input<Map<String,String>> environment,
        @Nullable Input<String> type) {
        this.arguments = arguments;
        this.definedInMaterial = definedInMaterial;
        this.entryPoint = entryPoint;
        this.environment = environment;
        this.type = type;
    }

    private SlsaRecipeArgs() {
        this.arguments = Input.empty();
        this.definedInMaterial = Input.empty();
        this.entryPoint = Input.empty();
        this.environment = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> arguments;
        private @Nullable Input<String> definedInMaterial;
        private @Nullable Input<String> entryPoint;
        private @Nullable Input<Map<String,String>> environment;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaRecipeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.definedInMaterial = defaults.definedInMaterial;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environment = defaults.environment;
    	      this.type = defaults.type;
        }

        public Builder setArguments(@Nullable Input<Map<String,String>> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setArguments(@Nullable Map<String,String> arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder setDefinedInMaterial(@Nullable Input<String> definedInMaterial) {
            this.definedInMaterial = definedInMaterial;
            return this;
        }

        public Builder setDefinedInMaterial(@Nullable String definedInMaterial) {
            this.definedInMaterial = Input.ofNullable(definedInMaterial);
            return this;
        }

        public Builder setEntryPoint(@Nullable Input<String> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder setEntryPoint(@Nullable String entryPoint) {
            this.entryPoint = Input.ofNullable(entryPoint);
            return this;
        }

        public Builder setEnvironment(@Nullable Input<Map<String,String>> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setEnvironment(@Nullable Map<String,String> environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public SlsaRecipeArgs build() {
            return new SlsaRecipeArgs(arguments, definedInMaterial, entryPoint, environment, type);
        }
    }
}
