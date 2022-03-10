// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration detail for datastore
 * 
 */
public final class GoogleCloudApigeeV1DatastoreConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1DatastoreConfigArgs Empty = new GoogleCloudApigeeV1DatastoreConfigArgs();

    /**
     * Name of the Cloud Storage bucket. Required for `gcs` target_type.
     * 
     */
    @InputImport(name="bucketName")
      private final @Nullable Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName == null ? Input.empty() : this.bucketName;
    }

    /**
     * BigQuery dataset name Required for `bigquery` target_type.
     * 
     */
    @InputImport(name="datasetName")
      private final @Nullable Input<String> datasetName;

    public Input<String> getDatasetName() {
        return this.datasetName == null ? Input.empty() : this.datasetName;
    }

    /**
     * Path of Cloud Storage bucket Required for `gcs` target_type.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * GCP project in which the datastore exists
     * 
     */
    @InputImport(name="project", required=true)
      private final Input<String> project;

    public Input<String> getProject() {
        return this.project;
    }

    /**
     * Prefix of BigQuery table Required for `bigquery` target_type.
     * 
     */
    @InputImport(name="tablePrefix")
      private final @Nullable Input<String> tablePrefix;

    public Input<String> getTablePrefix() {
        return this.tablePrefix == null ? Input.empty() : this.tablePrefix;
    }

    public GoogleCloudApigeeV1DatastoreConfigArgs(
        @Nullable Input<String> bucketName,
        @Nullable Input<String> datasetName,
        @Nullable Input<String> path,
        Input<String> project,
        @Nullable Input<String> tablePrefix) {
        this.bucketName = bucketName;
        this.datasetName = datasetName;
        this.path = path;
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.tablePrefix = tablePrefix;
    }

    private GoogleCloudApigeeV1DatastoreConfigArgs() {
        this.bucketName = Input.empty();
        this.datasetName = Input.empty();
        this.path = Input.empty();
        this.project = Input.empty();
        this.tablePrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1DatastoreConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketName;
        private @Nullable Input<String> datasetName;
        private @Nullable Input<String> path;
        private Input<String> project;
        private @Nullable Input<String> tablePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1DatastoreConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.datasetName = defaults.datasetName;
    	      this.path = defaults.path;
    	      this.project = defaults.project;
    	      this.tablePrefix = defaults.tablePrefix;
        }

        public Builder bucketName(@Nullable Input<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Input.ofNullable(bucketName);
            return this;
        }

        public Builder datasetName(@Nullable Input<String> datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        public Builder datasetName(@Nullable String datasetName) {
            this.datasetName = Input.ofNullable(datasetName);
            return this;
        }

        public Builder path(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder project(Input<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder project(String project) {
            this.project = Input.of(Objects.requireNonNull(project));
            return this;
        }

        public Builder tablePrefix(@Nullable Input<String> tablePrefix) {
            this.tablePrefix = tablePrefix;
            return this;
        }

        public Builder tablePrefix(@Nullable String tablePrefix) {
            this.tablePrefix = Input.ofNullable(tablePrefix);
            return this;
        }
        public GoogleCloudApigeeV1DatastoreConfigArgs build() {
            return new GoogleCloudApigeeV1DatastoreConfigArgs(bucketName, datasetName, path, project, tablePrefix);
        }
    }
}
