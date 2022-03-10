// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides data to pass through to the worker harness.
 * 
 */
public final class WorkerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerSettingsArgs Empty = new WorkerSettingsArgs();

    /**
     * The base URL for accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified, it supplies the base URL to use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, "Relative Uniform Resource Locators". If not specified, the default value is "http://www.googleapis.com/"
     * 
     */
    @InputImport(name="baseUrl")
      private final @Nullable Input<String> baseUrl;

    public Input<String> getBaseUrl() {
        return this.baseUrl == null ? Input.empty() : this.baseUrl;
    }

    /**
     * Whether to send work progress updates to the service.
     * 
     */
    @InputImport(name="reportingEnabled")
      private final @Nullable Input<Boolean> reportingEnabled;

    public Input<Boolean> getReportingEnabled() {
        return this.reportingEnabled == null ? Input.empty() : this.reportingEnabled;
    }

    /**
     * The Cloud Dataflow service path relative to the root URL, for example, "dataflow/v1b3/projects".
     * 
     */
    @InputImport(name="servicePath")
      private final @Nullable Input<String> servicePath;

    public Input<String> getServicePath() {
        return this.servicePath == null ? Input.empty() : this.servicePath;
    }

    /**
     * The Shuffle service path relative to the root URL, for example, "shuffle/v1beta1".
     * 
     */
    @InputImport(name="shuffleServicePath")
      private final @Nullable Input<String> shuffleServicePath;

    public Input<String> getShuffleServicePath() {
        return this.shuffleServicePath == null ? Input.empty() : this.shuffleServicePath;
    }

    /**
     * The prefix of the resources the system should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
     * 
     */
    @InputImport(name="tempStoragePrefix")
      private final @Nullable Input<String> tempStoragePrefix;

    public Input<String> getTempStoragePrefix() {
        return this.tempStoragePrefix == null ? Input.empty() : this.tempStoragePrefix;
    }

    /**
     * The ID of the worker running this pipeline.
     * 
     */
    @InputImport(name="workerId")
      private final @Nullable Input<String> workerId;

    public Input<String> getWorkerId() {
        return this.workerId == null ? Input.empty() : this.workerId;
    }

    public WorkerSettingsArgs(
        @Nullable Input<String> baseUrl,
        @Nullable Input<Boolean> reportingEnabled,
        @Nullable Input<String> servicePath,
        @Nullable Input<String> shuffleServicePath,
        @Nullable Input<String> tempStoragePrefix,
        @Nullable Input<String> workerId) {
        this.baseUrl = baseUrl;
        this.reportingEnabled = reportingEnabled;
        this.servicePath = servicePath;
        this.shuffleServicePath = shuffleServicePath;
        this.tempStoragePrefix = tempStoragePrefix;
        this.workerId = workerId;
    }

    private WorkerSettingsArgs() {
        this.baseUrl = Input.empty();
        this.reportingEnabled = Input.empty();
        this.servicePath = Input.empty();
        this.shuffleServicePath = Input.empty();
        this.tempStoragePrefix = Input.empty();
        this.workerId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> baseUrl;
        private @Nullable Input<Boolean> reportingEnabled;
        private @Nullable Input<String> servicePath;
        private @Nullable Input<String> shuffleServicePath;
        private @Nullable Input<String> tempStoragePrefix;
        private @Nullable Input<String> workerId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.reportingEnabled = defaults.reportingEnabled;
    	      this.servicePath = defaults.servicePath;
    	      this.shuffleServicePath = defaults.shuffleServicePath;
    	      this.tempStoragePrefix = defaults.tempStoragePrefix;
    	      this.workerId = defaults.workerId;
        }

        public Builder baseUrl(@Nullable Input<String> baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder baseUrl(@Nullable String baseUrl) {
            this.baseUrl = Input.ofNullable(baseUrl);
            return this;
        }

        public Builder reportingEnabled(@Nullable Input<Boolean> reportingEnabled) {
            this.reportingEnabled = reportingEnabled;
            return this;
        }

        public Builder reportingEnabled(@Nullable Boolean reportingEnabled) {
            this.reportingEnabled = Input.ofNullable(reportingEnabled);
            return this;
        }

        public Builder servicePath(@Nullable Input<String> servicePath) {
            this.servicePath = servicePath;
            return this;
        }

        public Builder servicePath(@Nullable String servicePath) {
            this.servicePath = Input.ofNullable(servicePath);
            return this;
        }

        public Builder shuffleServicePath(@Nullable Input<String> shuffleServicePath) {
            this.shuffleServicePath = shuffleServicePath;
            return this;
        }

        public Builder shuffleServicePath(@Nullable String shuffleServicePath) {
            this.shuffleServicePath = Input.ofNullable(shuffleServicePath);
            return this;
        }

        public Builder tempStoragePrefix(@Nullable Input<String> tempStoragePrefix) {
            this.tempStoragePrefix = tempStoragePrefix;
            return this;
        }

        public Builder tempStoragePrefix(@Nullable String tempStoragePrefix) {
            this.tempStoragePrefix = Input.ofNullable(tempStoragePrefix);
            return this;
        }

        public Builder workerId(@Nullable Input<String> workerId) {
            this.workerId = workerId;
            return this;
        }

        public Builder workerId(@Nullable String workerId) {
            this.workerId = Input.ofNullable(workerId);
            return this;
        }
        public WorkerSettingsArgs build() {
            return new WorkerSettingsArgs(baseUrl, reportingEnabled, servicePath, shuffleServicePath, tempStoragePrefix, workerId);
        }
    }
}
