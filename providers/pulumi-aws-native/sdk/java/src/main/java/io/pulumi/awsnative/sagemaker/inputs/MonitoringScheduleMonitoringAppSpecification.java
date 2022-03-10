// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container image configuration object for the monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringAppSpecification extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleMonitoringAppSpecification Empty = new MonitoringScheduleMonitoringAppSpecification();

    /**
     * An array of arguments for the container used to run the monitoring job.
     * 
     */
    @InputImport(name="containerArguments")
      private final @Nullable List<String> containerArguments;

    public List<String> getContainerArguments() {
        return this.containerArguments == null ? List.of() : this.containerArguments;
    }

    /**
     * Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    @InputImport(name="containerEntrypoint")
      private final @Nullable List<String> containerEntrypoint;

    public List<String> getContainerEntrypoint() {
        return this.containerEntrypoint == null ? List.of() : this.containerEntrypoint;
    }

    /**
     * The container image to be run by the monitoring job.
     * 
     */
    @InputImport(name="imageUri", required=true)
      private final String imageUri;

    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    @InputImport(name="postAnalyticsProcessorSourceUri")
      private final @Nullable String postAnalyticsProcessorSourceUri;

    public Optional<String> getPostAnalyticsProcessorSourceUri() {
        return this.postAnalyticsProcessorSourceUri == null ? Optional.empty() : Optional.ofNullable(this.postAnalyticsProcessorSourceUri);
    }

    /**
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    @InputImport(name="recordPreprocessorSourceUri")
      private final @Nullable String recordPreprocessorSourceUri;

    public Optional<String> getRecordPreprocessorSourceUri() {
        return this.recordPreprocessorSourceUri == null ? Optional.empty() : Optional.ofNullable(this.recordPreprocessorSourceUri);
    }

    public MonitoringScheduleMonitoringAppSpecification(
        @Nullable List<String> containerArguments,
        @Nullable List<String> containerEntrypoint,
        String imageUri,
        @Nullable String postAnalyticsProcessorSourceUri,
        @Nullable String recordPreprocessorSourceUri) {
        this.containerArguments = containerArguments;
        this.containerEntrypoint = containerEntrypoint;
        this.imageUri = Objects.requireNonNull(imageUri, "expected parameter 'imageUri' to be non-null");
        this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
        this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
    }

    private MonitoringScheduleMonitoringAppSpecification() {
        this.containerArguments = List.of();
        this.containerEntrypoint = List.of();
        this.imageUri = null;
        this.postAnalyticsProcessorSourceUri = null;
        this.recordPreprocessorSourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringAppSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containerArguments;
        private @Nullable List<String> containerEntrypoint;
        private String imageUri;
        private @Nullable String postAnalyticsProcessorSourceUri;
        private @Nullable String recordPreprocessorSourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringAppSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerArguments = defaults.containerArguments;
    	      this.containerEntrypoint = defaults.containerEntrypoint;
    	      this.imageUri = defaults.imageUri;
    	      this.postAnalyticsProcessorSourceUri = defaults.postAnalyticsProcessorSourceUri;
    	      this.recordPreprocessorSourceUri = defaults.recordPreprocessorSourceUri;
        }

        public Builder containerArguments(@Nullable List<String> containerArguments) {
            this.containerArguments = containerArguments;
            return this;
        }

        public Builder containerEntrypoint(@Nullable List<String> containerEntrypoint) {
            this.containerEntrypoint = containerEntrypoint;
            return this;
        }

        public Builder imageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }

        public Builder postAnalyticsProcessorSourceUri(@Nullable String postAnalyticsProcessorSourceUri) {
            this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
            return this;
        }

        public Builder recordPreprocessorSourceUri(@Nullable String recordPreprocessorSourceUri) {
            this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
            return this;
        }
        public MonitoringScheduleMonitoringAppSpecification build() {
            return new MonitoringScheduleMonitoringAppSpecification(containerArguments, containerEntrypoint, imageUri, postAnalyticsProcessorSourceUri, recordPreprocessorSourceUri);
        }
    }
}
