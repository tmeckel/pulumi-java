// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.ModelQualityJobDefinitionProblemType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container image configuration object for the monitoring job.
 * 
 */
public final class ModelQualityJobDefinitionModelQualityAppSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionModelQualityAppSpecificationArgs Empty = new ModelQualityJobDefinitionModelQualityAppSpecificationArgs();

    /**
     * An array of arguments for the container used to run the monitoring job.
     * 
     */
    @Import(name="containerArguments")
      private final @Nullable Output<List<String>> containerArguments;

    public Output<List<String>> getContainerArguments() {
        return this.containerArguments == null ? Codegen.empty() : this.containerArguments;
    }

    /**
     * Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    @Import(name="containerEntrypoint")
      private final @Nullable Output<List<String>> containerEntrypoint;

    public Output<List<String>> getContainerEntrypoint() {
        return this.containerEntrypoint == null ? Codegen.empty() : this.containerEntrypoint;
    }

    /**
     * Sets the environment variables in the Docker container
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<Object> environment;

    public Output<Object> getEnvironment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * The container image to be run by the monitoring job.
     * 
     */
    @Import(name="imageUri", required=true)
      private final Output<String> imageUri;

    public Output<String> getImageUri() {
        return this.imageUri;
    }

    /**
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    @Import(name="postAnalyticsProcessorSourceUri")
      private final @Nullable Output<String> postAnalyticsProcessorSourceUri;

    public Output<String> getPostAnalyticsProcessorSourceUri() {
        return this.postAnalyticsProcessorSourceUri == null ? Codegen.empty() : this.postAnalyticsProcessorSourceUri;
    }

    @Import(name="problemType", required=true)
      private final Output<ModelQualityJobDefinitionProblemType> problemType;

    public Output<ModelQualityJobDefinitionProblemType> getProblemType() {
        return this.problemType;
    }

    /**
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    @Import(name="recordPreprocessorSourceUri")
      private final @Nullable Output<String> recordPreprocessorSourceUri;

    public Output<String> getRecordPreprocessorSourceUri() {
        return this.recordPreprocessorSourceUri == null ? Codegen.empty() : this.recordPreprocessorSourceUri;
    }

    public ModelQualityJobDefinitionModelQualityAppSpecificationArgs(
        @Nullable Output<List<String>> containerArguments,
        @Nullable Output<List<String>> containerEntrypoint,
        @Nullable Output<Object> environment,
        Output<String> imageUri,
        @Nullable Output<String> postAnalyticsProcessorSourceUri,
        Output<ModelQualityJobDefinitionProblemType> problemType,
        @Nullable Output<String> recordPreprocessorSourceUri) {
        this.containerArguments = containerArguments;
        this.containerEntrypoint = containerEntrypoint;
        this.environment = environment;
        this.imageUri = Objects.requireNonNull(imageUri, "expected parameter 'imageUri' to be non-null");
        this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
        this.problemType = Objects.requireNonNull(problemType, "expected parameter 'problemType' to be non-null");
        this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
    }

    private ModelQualityJobDefinitionModelQualityAppSpecificationArgs() {
        this.containerArguments = Codegen.empty();
        this.containerEntrypoint = Codegen.empty();
        this.environment = Codegen.empty();
        this.imageUri = Codegen.empty();
        this.postAnalyticsProcessorSourceUri = Codegen.empty();
        this.problemType = Codegen.empty();
        this.recordPreprocessorSourceUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionModelQualityAppSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> containerArguments;
        private @Nullable Output<List<String>> containerEntrypoint;
        private @Nullable Output<Object> environment;
        private Output<String> imageUri;
        private @Nullable Output<String> postAnalyticsProcessorSourceUri;
        private Output<ModelQualityJobDefinitionProblemType> problemType;
        private @Nullable Output<String> recordPreprocessorSourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionModelQualityAppSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerArguments = defaults.containerArguments;
    	      this.containerEntrypoint = defaults.containerEntrypoint;
    	      this.environment = defaults.environment;
    	      this.imageUri = defaults.imageUri;
    	      this.postAnalyticsProcessorSourceUri = defaults.postAnalyticsProcessorSourceUri;
    	      this.problemType = defaults.problemType;
    	      this.recordPreprocessorSourceUri = defaults.recordPreprocessorSourceUri;
        }

        public Builder containerArguments(@Nullable Output<List<String>> containerArguments) {
            this.containerArguments = containerArguments;
            return this;
        }
        public Builder containerArguments(@Nullable List<String> containerArguments) {
            this.containerArguments = Codegen.ofNullable(containerArguments);
            return this;
        }
        public Builder containerArguments(String... containerArguments) {
            return containerArguments(List.of(containerArguments));
        }
        public Builder containerEntrypoint(@Nullable Output<List<String>> containerEntrypoint) {
            this.containerEntrypoint = containerEntrypoint;
            return this;
        }
        public Builder containerEntrypoint(@Nullable List<String> containerEntrypoint) {
            this.containerEntrypoint = Codegen.ofNullable(containerEntrypoint);
            return this;
        }
        public Builder containerEntrypoint(String... containerEntrypoint) {
            return containerEntrypoint(List.of(containerEntrypoint));
        }
        public Builder environment(@Nullable Output<Object> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable Object environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder imageUri(Output<String> imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Output.of(Objects.requireNonNull(imageUri));
            return this;
        }
        public Builder postAnalyticsProcessorSourceUri(@Nullable Output<String> postAnalyticsProcessorSourceUri) {
            this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
            return this;
        }
        public Builder postAnalyticsProcessorSourceUri(@Nullable String postAnalyticsProcessorSourceUri) {
            this.postAnalyticsProcessorSourceUri = Codegen.ofNullable(postAnalyticsProcessorSourceUri);
            return this;
        }
        public Builder problemType(Output<ModelQualityJobDefinitionProblemType> problemType) {
            this.problemType = Objects.requireNonNull(problemType);
            return this;
        }
        public Builder problemType(ModelQualityJobDefinitionProblemType problemType) {
            this.problemType = Output.of(Objects.requireNonNull(problemType));
            return this;
        }
        public Builder recordPreprocessorSourceUri(@Nullable Output<String> recordPreprocessorSourceUri) {
            this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
            return this;
        }
        public Builder recordPreprocessorSourceUri(@Nullable String recordPreprocessorSourceUri) {
            this.recordPreprocessorSourceUri = Codegen.ofNullable(recordPreprocessorSourceUri);
            return this;
        }        public ModelQualityJobDefinitionModelQualityAppSpecificationArgs build() {
            return new ModelQualityJobDefinitionModelQualityAppSpecificationArgs(containerArguments, containerEntrypoint, environment, imageUri, postAnalyticsProcessorSourceUri, problemType, recordPreprocessorSourceUri);
        }
    }
}
