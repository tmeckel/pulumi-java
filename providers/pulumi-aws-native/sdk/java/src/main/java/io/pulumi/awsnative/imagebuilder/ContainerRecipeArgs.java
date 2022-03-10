// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.imagebuilder.enums.ContainerRecipeContainerType;
import io.pulumi.awsnative.imagebuilder.enums.ContainerRecipePlatformOverride;
import io.pulumi.awsnative.imagebuilder.inputs.ContainerRecipeComponentConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.inputs.ContainerRecipeInstanceConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.inputs.ContainerRecipeTargetContainerRepositoryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerRecipeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeArgs Empty = new ContainerRecipeArgs();

    /**
     * Components for build and test that are included in the container recipe.
     * 
     */
    @InputImport(name="components")
      private final @Nullable Input<List<ContainerRecipeComponentConfigurationArgs>> components;

    public Input<List<ContainerRecipeComponentConfigurationArgs>> getComponents() {
        return this.components == null ? Input.empty() : this.components;
    }

    /**
     * Specifies the type of container, such as Docker.
     * 
     */
    @InputImport(name="containerType")
      private final @Nullable Input<ContainerRecipeContainerType> containerType;

    public Input<ContainerRecipeContainerType> getContainerType() {
        return this.containerType == null ? Input.empty() : this.containerType;
    }

    /**
     * The description of the container recipe.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all of the elements required by the application running inside. The template data consists of contextual variables where Image Builder places build information or scripts, based on your container image recipe.
     * 
     */
    @InputImport(name="dockerfileTemplateData")
      private final @Nullable Input<String> dockerfileTemplateData;

    public Input<String> getDockerfileTemplateData() {
        return this.dockerfileTemplateData == null ? Input.empty() : this.dockerfileTemplateData;
    }

    /**
     * The S3 URI for the Dockerfile that will be used to build your container image.
     * 
     */
    @InputImport(name="dockerfileTemplateUri")
      private final @Nullable Input<String> dockerfileTemplateUri;

    public Input<String> getDockerfileTemplateUri() {
        return this.dockerfileTemplateUri == null ? Input.empty() : this.dockerfileTemplateUri;
    }

    /**
     * Specifies the operating system version for the source image.
     * 
     */
    @InputImport(name="imageOsVersionOverride")
      private final @Nullable Input<String> imageOsVersionOverride;

    public Input<String> getImageOsVersionOverride() {
        return this.imageOsVersionOverride == null ? Input.empty() : this.imageOsVersionOverride;
    }

    /**
     * A group of options that can be used to configure an instance for building and testing container images.
     * 
     */
    @InputImport(name="instanceConfiguration")
      private final @Nullable Input<ContainerRecipeInstanceConfigurationArgs> instanceConfiguration;

    public Input<ContainerRecipeInstanceConfigurationArgs> getInstanceConfiguration() {
        return this.instanceConfiguration == null ? Input.empty() : this.instanceConfiguration;
    }

    /**
     * Identifies which KMS key is used to encrypt the container image.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The name of the container recipe.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The source image for the container recipe.
     * 
     */
    @InputImport(name="parentImage")
      private final @Nullable Input<String> parentImage;

    public Input<String> getParentImage() {
        return this.parentImage == null ? Input.empty() : this.parentImage;
    }

    /**
     * Specifies the operating system platform when you use a custom source image.
     * 
     */
    @InputImport(name="platformOverride")
      private final @Nullable Input<ContainerRecipePlatformOverride> platformOverride;

    public Input<ContainerRecipePlatformOverride> getPlatformOverride() {
        return this.platformOverride == null ? Input.empty() : this.platformOverride;
    }

    /**
     * Tags that are attached to the container recipe.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Object> tags;

    public Input<Object> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The destination repository for the container image.
     * 
     */
    @InputImport(name="targetRepository")
      private final @Nullable Input<ContainerRecipeTargetContainerRepositoryArgs> targetRepository;

    public Input<ContainerRecipeTargetContainerRepositoryArgs> getTargetRepository() {
        return this.targetRepository == null ? Input.empty() : this.targetRepository;
    }

    /**
     * The semantic version of the container recipe (<major>.<minor>.<patch>).
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * The working directory to be used during build and test workflows.
     * 
     */
    @InputImport(name="workingDirectory")
      private final @Nullable Input<String> workingDirectory;

    public Input<String> getWorkingDirectory() {
        return this.workingDirectory == null ? Input.empty() : this.workingDirectory;
    }

    public ContainerRecipeArgs(
        @Nullable Input<List<ContainerRecipeComponentConfigurationArgs>> components,
        @Nullable Input<ContainerRecipeContainerType> containerType,
        @Nullable Input<String> description,
        @Nullable Input<String> dockerfileTemplateData,
        @Nullable Input<String> dockerfileTemplateUri,
        @Nullable Input<String> imageOsVersionOverride,
        @Nullable Input<ContainerRecipeInstanceConfigurationArgs> instanceConfiguration,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> name,
        @Nullable Input<String> parentImage,
        @Nullable Input<ContainerRecipePlatformOverride> platformOverride,
        @Nullable Input<Object> tags,
        @Nullable Input<ContainerRecipeTargetContainerRepositoryArgs> targetRepository,
        @Nullable Input<String> version,
        @Nullable Input<String> workingDirectory) {
        this.components = components;
        this.containerType = containerType;
        this.description = description;
        this.dockerfileTemplateData = dockerfileTemplateData;
        this.dockerfileTemplateUri = dockerfileTemplateUri;
        this.imageOsVersionOverride = imageOsVersionOverride;
        this.instanceConfiguration = instanceConfiguration;
        this.kmsKeyId = kmsKeyId;
        this.name = name;
        this.parentImage = parentImage;
        this.platformOverride = platformOverride;
        this.tags = tags;
        this.targetRepository = targetRepository;
        this.version = version;
        this.workingDirectory = workingDirectory;
    }

    private ContainerRecipeArgs() {
        this.components = Input.empty();
        this.containerType = Input.empty();
        this.description = Input.empty();
        this.dockerfileTemplateData = Input.empty();
        this.dockerfileTemplateUri = Input.empty();
        this.imageOsVersionOverride = Input.empty();
        this.instanceConfiguration = Input.empty();
        this.kmsKeyId = Input.empty();
        this.name = Input.empty();
        this.parentImage = Input.empty();
        this.platformOverride = Input.empty();
        this.tags = Input.empty();
        this.targetRepository = Input.empty();
        this.version = Input.empty();
        this.workingDirectory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ContainerRecipeComponentConfigurationArgs>> components;
        private @Nullable Input<ContainerRecipeContainerType> containerType;
        private @Nullable Input<String> description;
        private @Nullable Input<String> dockerfileTemplateData;
        private @Nullable Input<String> dockerfileTemplateUri;
        private @Nullable Input<String> imageOsVersionOverride;
        private @Nullable Input<ContainerRecipeInstanceConfigurationArgs> instanceConfiguration;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parentImage;
        private @Nullable Input<ContainerRecipePlatformOverride> platformOverride;
        private @Nullable Input<Object> tags;
        private @Nullable Input<ContainerRecipeTargetContainerRepositoryArgs> targetRepository;
        private @Nullable Input<String> version;
        private @Nullable Input<String> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.components = defaults.components;
    	      this.containerType = defaults.containerType;
    	      this.description = defaults.description;
    	      this.dockerfileTemplateData = defaults.dockerfileTemplateData;
    	      this.dockerfileTemplateUri = defaults.dockerfileTemplateUri;
    	      this.imageOsVersionOverride = defaults.imageOsVersionOverride;
    	      this.instanceConfiguration = defaults.instanceConfiguration;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.name = defaults.name;
    	      this.parentImage = defaults.parentImage;
    	      this.platformOverride = defaults.platformOverride;
    	      this.tags = defaults.tags;
    	      this.targetRepository = defaults.targetRepository;
    	      this.version = defaults.version;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder components(@Nullable Input<List<ContainerRecipeComponentConfigurationArgs>> components) {
            this.components = components;
            return this;
        }

        public Builder components(@Nullable List<ContainerRecipeComponentConfigurationArgs> components) {
            this.components = Input.ofNullable(components);
            return this;
        }

        public Builder containerType(@Nullable Input<ContainerRecipeContainerType> containerType) {
            this.containerType = containerType;
            return this;
        }

        public Builder containerType(@Nullable ContainerRecipeContainerType containerType) {
            this.containerType = Input.ofNullable(containerType);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder dockerfileTemplateData(@Nullable Input<String> dockerfileTemplateData) {
            this.dockerfileTemplateData = dockerfileTemplateData;
            return this;
        }

        public Builder dockerfileTemplateData(@Nullable String dockerfileTemplateData) {
            this.dockerfileTemplateData = Input.ofNullable(dockerfileTemplateData);
            return this;
        }

        public Builder dockerfileTemplateUri(@Nullable Input<String> dockerfileTemplateUri) {
            this.dockerfileTemplateUri = dockerfileTemplateUri;
            return this;
        }

        public Builder dockerfileTemplateUri(@Nullable String dockerfileTemplateUri) {
            this.dockerfileTemplateUri = Input.ofNullable(dockerfileTemplateUri);
            return this;
        }

        public Builder imageOsVersionOverride(@Nullable Input<String> imageOsVersionOverride) {
            this.imageOsVersionOverride = imageOsVersionOverride;
            return this;
        }

        public Builder imageOsVersionOverride(@Nullable String imageOsVersionOverride) {
            this.imageOsVersionOverride = Input.ofNullable(imageOsVersionOverride);
            return this;
        }

        public Builder instanceConfiguration(@Nullable Input<ContainerRecipeInstanceConfigurationArgs> instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            return this;
        }

        public Builder instanceConfiguration(@Nullable ContainerRecipeInstanceConfigurationArgs instanceConfiguration) {
            this.instanceConfiguration = Input.ofNullable(instanceConfiguration);
            return this;
        }

        public Builder kmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder parentImage(@Nullable Input<String> parentImage) {
            this.parentImage = parentImage;
            return this;
        }

        public Builder parentImage(@Nullable String parentImage) {
            this.parentImage = Input.ofNullable(parentImage);
            return this;
        }

        public Builder platformOverride(@Nullable Input<ContainerRecipePlatformOverride> platformOverride) {
            this.platformOverride = platformOverride;
            return this;
        }

        public Builder platformOverride(@Nullable ContainerRecipePlatformOverride platformOverride) {
            this.platformOverride = Input.ofNullable(platformOverride);
            return this;
        }

        public Builder tags(@Nullable Input<Object> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Object tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder targetRepository(@Nullable Input<ContainerRecipeTargetContainerRepositoryArgs> targetRepository) {
            this.targetRepository = targetRepository;
            return this;
        }

        public Builder targetRepository(@Nullable ContainerRecipeTargetContainerRepositoryArgs targetRepository) {
            this.targetRepository = Input.ofNullable(targetRepository);
            return this;
        }

        public Builder version(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder workingDirectory(@Nullable Input<String> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        public Builder workingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = Input.ofNullable(workingDirectory);
            return this;
        }
        public ContainerRecipeArgs build() {
            return new ContainerRecipeArgs(components, containerType, description, dockerfileTemplateData, dockerfileTemplateUri, imageOsVersionOverride, instanceConfiguration, kmsKeyId, name, parentImage, platformOverride, tags, targetRepository, version, workingDirectory);
        }
    }
}
