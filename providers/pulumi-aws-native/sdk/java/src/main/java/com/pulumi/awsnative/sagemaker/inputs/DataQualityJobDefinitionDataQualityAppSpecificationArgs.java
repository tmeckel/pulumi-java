// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container image configuration object for the monitoring job.
 * 
 */
public final class DataQualityJobDefinitionDataQualityAppSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionDataQualityAppSpecificationArgs Empty = new DataQualityJobDefinitionDataQualityAppSpecificationArgs();

    /**
     * An array of arguments for the container used to run the monitoring job.
     * 
     */
    @Import(name="containerArguments")
    private @Nullable Output<List<String>> containerArguments;

    /**
     * @return An array of arguments for the container used to run the monitoring job.
     * 
     */
    public Optional<Output<List<String>>> containerArguments() {
        return Optional.ofNullable(this.containerArguments);
    }

    /**
     * Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    @Import(name="containerEntrypoint")
    private @Nullable Output<List<String>> containerEntrypoint;

    /**
     * @return Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    public Optional<Output<List<String>>> containerEntrypoint() {
        return Optional.ofNullable(this.containerEntrypoint);
    }

    /**
     * Sets the environment variables in the Docker container
     * 
     */
    @Import(name="environment")
    private @Nullable Output<Object> environment;

    /**
     * @return Sets the environment variables in the Docker container
     * 
     */
    public Optional<Output<Object>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The container image to be run by the monitoring job.
     * 
     */
    @Import(name="imageUri", required=true)
    private Output<String> imageUri;

    /**
     * @return The container image to be run by the monitoring job.
     * 
     */
    public Output<String> imageUri() {
        return this.imageUri;
    }

    /**
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    @Import(name="postAnalyticsProcessorSourceUri")
    private @Nullable Output<String> postAnalyticsProcessorSourceUri;

    /**
     * @return An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    public Optional<Output<String>> postAnalyticsProcessorSourceUri() {
        return Optional.ofNullable(this.postAnalyticsProcessorSourceUri);
    }

    /**
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    @Import(name="recordPreprocessorSourceUri")
    private @Nullable Output<String> recordPreprocessorSourceUri;

    /**
     * @return An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    public Optional<Output<String>> recordPreprocessorSourceUri() {
        return Optional.ofNullable(this.recordPreprocessorSourceUri);
    }

    private DataQualityJobDefinitionDataQualityAppSpecificationArgs() {}

    private DataQualityJobDefinitionDataQualityAppSpecificationArgs(DataQualityJobDefinitionDataQualityAppSpecificationArgs $) {
        this.containerArguments = $.containerArguments;
        this.containerEntrypoint = $.containerEntrypoint;
        this.environment = $.environment;
        this.imageUri = $.imageUri;
        this.postAnalyticsProcessorSourceUri = $.postAnalyticsProcessorSourceUri;
        this.recordPreprocessorSourceUri = $.recordPreprocessorSourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataQualityJobDefinitionDataQualityAppSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataQualityJobDefinitionDataQualityAppSpecificationArgs $;

        public Builder() {
            $ = new DataQualityJobDefinitionDataQualityAppSpecificationArgs();
        }

        public Builder(DataQualityJobDefinitionDataQualityAppSpecificationArgs defaults) {
            $ = new DataQualityJobDefinitionDataQualityAppSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerArguments An array of arguments for the container used to run the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder containerArguments(@Nullable Output<List<String>> containerArguments) {
            $.containerArguments = containerArguments;
            return this;
        }

        /**
         * @param containerArguments An array of arguments for the container used to run the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder containerArguments(List<String> containerArguments) {
            return containerArguments(Output.of(containerArguments));
        }

        /**
         * @param containerArguments An array of arguments for the container used to run the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder containerArguments(String... containerArguments) {
            return containerArguments(List.of(containerArguments));
        }

        /**
         * @param containerEntrypoint Specifies the entrypoint for a container used to run the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder containerEntrypoint(@Nullable Output<List<String>> containerEntrypoint) {
            $.containerEntrypoint = containerEntrypoint;
            return this;
        }

        /**
         * @param containerEntrypoint Specifies the entrypoint for a container used to run the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder containerEntrypoint(List<String> containerEntrypoint) {
            return containerEntrypoint(Output.of(containerEntrypoint));
        }

        /**
         * @param containerEntrypoint Specifies the entrypoint for a container used to run the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder containerEntrypoint(String... containerEntrypoint) {
            return containerEntrypoint(List.of(containerEntrypoint));
        }

        /**
         * @param environment Sets the environment variables in the Docker container
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<Object> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Sets the environment variables in the Docker container
         * 
         * @return builder
         * 
         */
        public Builder environment(Object environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param imageUri The container image to be run by the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder imageUri(Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        /**
         * @param imageUri The container image to be run by the monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        /**
         * @param postAnalyticsProcessorSourceUri An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
         * 
         * @return builder
         * 
         */
        public Builder postAnalyticsProcessorSourceUri(@Nullable Output<String> postAnalyticsProcessorSourceUri) {
            $.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
            return this;
        }

        /**
         * @param postAnalyticsProcessorSourceUri An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
         * 
         * @return builder
         * 
         */
        public Builder postAnalyticsProcessorSourceUri(String postAnalyticsProcessorSourceUri) {
            return postAnalyticsProcessorSourceUri(Output.of(postAnalyticsProcessorSourceUri));
        }

        /**
         * @param recordPreprocessorSourceUri An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
         * 
         * @return builder
         * 
         */
        public Builder recordPreprocessorSourceUri(@Nullable Output<String> recordPreprocessorSourceUri) {
            $.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
            return this;
        }

        /**
         * @param recordPreprocessorSourceUri An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
         * 
         * @return builder
         * 
         */
        public Builder recordPreprocessorSourceUri(String recordPreprocessorSourceUri) {
            return recordPreprocessorSourceUri(Output.of(recordPreprocessorSourceUri));
        }

        public DataQualityJobDefinitionDataQualityAppSpecificationArgs build() {
            $.imageUri = Objects.requireNonNull($.imageUri, "expected parameter 'imageUri' to be non-null");
            return $;
        }
    }

}
