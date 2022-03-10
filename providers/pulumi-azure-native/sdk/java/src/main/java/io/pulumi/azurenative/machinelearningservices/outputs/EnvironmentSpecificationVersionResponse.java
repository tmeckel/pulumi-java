// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.DockerBuildResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.DockerImageResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.InferenceContainerPropertiesResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentSpecificationVersionResponse {
    /**
     * Standard configuration file used by Conda that lets you install any kind of package, including Python, R, and C/C++ packages.
     * <see href="https://repo2docker.readthedocs.io/en/latest/config_files.html#environment-yml-install-a-conda-environment" />
     * 
     */
    private final @Nullable String condaFile;
    /**
     * The asset description text.
     * 
     */
    private final @Nullable String description;
    /**
     * Configuration settings for Docker.
     * 
     */
    private final @Nullable Either<DockerBuildResponse,DockerImageResponse> docker;
    /**
     * Environment specification is either user managed or curated by the Azure ML service
     * <see href="https://docs.microsoft.com/en-us/azure/machine-learning/resource-curated-environments" />
     * 
     */
    private final String environmentSpecificationType;
    /**
     * Defines configuration specific to inference.
     * 
     */
    private final @Nullable InferenceContainerPropertiesResponse inferenceContainerProperties;
    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    private final @Nullable Boolean isAnonymous;
    /**
     * The asset property dictionary.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @OutputCustomType.Constructor
    private EnvironmentSpecificationVersionResponse(
        @OutputCustomType.Parameter("condaFile") @Nullable String condaFile,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("docker") @Nullable Either<DockerBuildResponse,DockerImageResponse> docker,
        @OutputCustomType.Parameter("environmentSpecificationType") String environmentSpecificationType,
        @OutputCustomType.Parameter("inferenceContainerProperties") @Nullable InferenceContainerPropertiesResponse inferenceContainerProperties,
        @OutputCustomType.Parameter("isAnonymous") @Nullable Boolean isAnonymous,
        @OutputCustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.condaFile = condaFile;
        this.description = description;
        this.docker = docker;
        this.environmentSpecificationType = environmentSpecificationType;
        this.inferenceContainerProperties = inferenceContainerProperties;
        this.isAnonymous = isAnonymous;
        this.properties = properties;
        this.tags = tags;
    }

    /**
     * Standard configuration file used by Conda that lets you install any kind of package, including Python, R, and C/C++ packages.
     * <see href="https://repo2docker.readthedocs.io/en/latest/config_files.html#environment-yml-install-a-conda-environment" />
     * 
    */
    public Optional<String> getCondaFile() {
        return Optional.ofNullable(this.condaFile);
    }
    /**
     * The asset description text.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Configuration settings for Docker.
     * 
    */
    public Optional<Either<DockerBuildResponse,DockerImageResponse>> getDocker() {
        return Optional.ofNullable(this.docker);
    }
    /**
     * Environment specification is either user managed or curated by the Azure ML service
     * <see href="https://docs.microsoft.com/en-us/azure/machine-learning/resource-curated-environments" />
     * 
    */
    public String getEnvironmentSpecificationType() {
        return this.environmentSpecificationType;
    }
    /**
     * Defines configuration specific to inference.
     * 
    */
    public Optional<InferenceContainerPropertiesResponse> getInferenceContainerProperties() {
        return Optional.ofNullable(this.inferenceContainerProperties);
    }
    /**
     * If the name version are system generated (anonymous registration).
     * 
    */
    public Optional<Boolean> getIsAnonymous() {
        return Optional.ofNullable(this.isAnonymous);
    }
    /**
     * The asset property dictionary.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentSpecificationVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condaFile;
        private @Nullable String description;
        private @Nullable Either<DockerBuildResponse,DockerImageResponse> docker;
        private String environmentSpecificationType;
        private @Nullable InferenceContainerPropertiesResponse inferenceContainerProperties;
        private @Nullable Boolean isAnonymous;
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentSpecificationVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condaFile = defaults.condaFile;
    	      this.description = defaults.description;
    	      this.docker = defaults.docker;
    	      this.environmentSpecificationType = defaults.environmentSpecificationType;
    	      this.inferenceContainerProperties = defaults.inferenceContainerProperties;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder condaFile(@Nullable String condaFile) {
            this.condaFile = condaFile;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder docker(@Nullable Either<DockerBuildResponse,DockerImageResponse> docker) {
            this.docker = docker;
            return this;
        }

        public Builder environmentSpecificationType(String environmentSpecificationType) {
            this.environmentSpecificationType = Objects.requireNonNull(environmentSpecificationType);
            return this;
        }

        public Builder inferenceContainerProperties(@Nullable InferenceContainerPropertiesResponse inferenceContainerProperties) {
            this.inferenceContainerProperties = inferenceContainerProperties;
            return this;
        }

        public Builder isAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public EnvironmentSpecificationVersionResponse build() {
            return new EnvironmentSpecificationVersionResponse(condaFile, description, docker, environmentSpecificationType, inferenceContainerProperties, isAnonymous, properties, tags);
        }
    }
}
