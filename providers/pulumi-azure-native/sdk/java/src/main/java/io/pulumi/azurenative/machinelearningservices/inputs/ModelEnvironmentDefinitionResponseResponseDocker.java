// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ModelDockerSectionResponseResponseBaseImageRegistry;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of a Docker container.
 * 
 */
public final class ModelEnvironmentDefinitionResponseResponseDocker extends io.pulumi.resources.InvokeArgs {

    public static final ModelEnvironmentDefinitionResponseResponseDocker Empty = new ModelEnvironmentDefinitionResponseResponseDocker();

    /**
     * Base Dockerfile used for Docker-based runs. Mutually exclusive with BaseImage.
     * 
     */
    @InputImport(name="baseDockerfile")
      private final @Nullable String baseDockerfile;

    public Optional<String> getBaseDockerfile() {
        return this.baseDockerfile == null ? Optional.empty() : Optional.ofNullable(this.baseDockerfile);
    }

    /**
     * Base image used for Docker-based runs. Mutually exclusive with BaseDockerfile.
     * 
     */
    @InputImport(name="baseImage")
      private final @Nullable String baseImage;

    public Optional<String> getBaseImage() {
        return this.baseImage == null ? Optional.empty() : Optional.ofNullable(this.baseImage);
    }

    /**
     * Image registry that contains the base image.
     * 
     */
    @InputImport(name="baseImageRegistry")
      private final @Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry;

    public Optional<ModelDockerSectionResponseResponseBaseImageRegistry> getBaseImageRegistry() {
        return this.baseImageRegistry == null ? Optional.empty() : Optional.ofNullable(this.baseImageRegistry);
    }

    public ModelEnvironmentDefinitionResponseResponseDocker(
        @Nullable String baseDockerfile,
        @Nullable String baseImage,
        @Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry) {
        this.baseDockerfile = baseDockerfile;
        this.baseImage = baseImage;
        this.baseImageRegistry = baseImageRegistry;
    }

    private ModelEnvironmentDefinitionResponseResponseDocker() {
        this.baseDockerfile = null;
        this.baseImage = null;
        this.baseImageRegistry = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionResponseResponseDocker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baseDockerfile;
        private @Nullable String baseImage;
        private @Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionResponseResponseDocker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseDockerfile = defaults.baseDockerfile;
    	      this.baseImage = defaults.baseImage;
    	      this.baseImageRegistry = defaults.baseImageRegistry;
        }

        public Builder baseDockerfile(@Nullable String baseDockerfile) {
            this.baseDockerfile = baseDockerfile;
            return this;
        }

        public Builder baseImage(@Nullable String baseImage) {
            this.baseImage = baseImage;
            return this;
        }

        public Builder baseImageRegistry(@Nullable ModelDockerSectionResponseResponseBaseImageRegistry baseImageRegistry) {
            this.baseImageRegistry = baseImageRegistry;
            return this;
        }
        public ModelEnvironmentDefinitionResponseResponseDocker build() {
            return new ModelEnvironmentDefinitionResponseResponseDocker(baseDockerfile, baseImage, baseImageRegistry);
        }
    }
}
