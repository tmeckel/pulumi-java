// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1.inputs.AvroFileFormatArgs;
import io.pulumi.googlenative.datastream_v1.inputs.JsonFileFormatArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Google Cloud Storage destination configuration
 * 
 */
public final class GcsDestinationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcsDestinationConfigArgs Empty = new GcsDestinationConfigArgs();

    /**
     * AVRO file format configuration.
     * 
     */
    @InputImport(name="avroFileFormat")
    private final @Nullable Input<AvroFileFormatArgs> avroFileFormat;

    public Input<AvroFileFormatArgs> getAvroFileFormat() {
        return this.avroFileFormat == null ? Input.empty() : this.avroFileFormat;
    }

    /**
     * The maximum duration for which new events are added before a file is closed and a new file is created.
     * 
     */
    @InputImport(name="fileRotationInterval")
    private final @Nullable Input<String> fileRotationInterval;

    public Input<String> getFileRotationInterval() {
        return this.fileRotationInterval == null ? Input.empty() : this.fileRotationInterval;
    }

    /**
     * The maximum file size to be saved in the bucket.
     * 
     */
    @InputImport(name="fileRotationMb")
    private final @Nullable Input<Integer> fileRotationMb;

    public Input<Integer> getFileRotationMb() {
        return this.fileRotationMb == null ? Input.empty() : this.fileRotationMb;
    }

    /**
     * JSON file format configuration.
     * 
     */
    @InputImport(name="jsonFileFormat")
    private final @Nullable Input<JsonFileFormatArgs> jsonFileFormat;

    public Input<JsonFileFormatArgs> getJsonFileFormat() {
        return this.jsonFileFormat == null ? Input.empty() : this.jsonFileFormat;
    }

    /**
     * Path inside the Cloud Storage bucket to write data to.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public GcsDestinationConfigArgs(
        @Nullable Input<AvroFileFormatArgs> avroFileFormat,
        @Nullable Input<String> fileRotationInterval,
        @Nullable Input<Integer> fileRotationMb,
        @Nullable Input<JsonFileFormatArgs> jsonFileFormat,
        @Nullable Input<String> path) {
        this.avroFileFormat = avroFileFormat;
        this.fileRotationInterval = fileRotationInterval;
        this.fileRotationMb = fileRotationMb;
        this.jsonFileFormat = jsonFileFormat;
        this.path = path;
    }

    private GcsDestinationConfigArgs() {
        this.avroFileFormat = Input.empty();
        this.fileRotationInterval = Input.empty();
        this.fileRotationMb = Input.empty();
        this.jsonFileFormat = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AvroFileFormatArgs> avroFileFormat;
        private @Nullable Input<String> fileRotationInterval;
        private @Nullable Input<Integer> fileRotationMb;
        private @Nullable Input<JsonFileFormatArgs> jsonFileFormat;
        private @Nullable Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsDestinationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avroFileFormat = defaults.avroFileFormat;
    	      this.fileRotationInterval = defaults.fileRotationInterval;
    	      this.fileRotationMb = defaults.fileRotationMb;
    	      this.jsonFileFormat = defaults.jsonFileFormat;
    	      this.path = defaults.path;
        }

        public Builder setAvroFileFormat(@Nullable Input<AvroFileFormatArgs> avroFileFormat) {
            this.avroFileFormat = avroFileFormat;
            return this;
        }

        public Builder setAvroFileFormat(@Nullable AvroFileFormatArgs avroFileFormat) {
            this.avroFileFormat = Input.ofNullable(avroFileFormat);
            return this;
        }

        public Builder setFileRotationInterval(@Nullable Input<String> fileRotationInterval) {
            this.fileRotationInterval = fileRotationInterval;
            return this;
        }

        public Builder setFileRotationInterval(@Nullable String fileRotationInterval) {
            this.fileRotationInterval = Input.ofNullable(fileRotationInterval);
            return this;
        }

        public Builder setFileRotationMb(@Nullable Input<Integer> fileRotationMb) {
            this.fileRotationMb = fileRotationMb;
            return this;
        }

        public Builder setFileRotationMb(@Nullable Integer fileRotationMb) {
            this.fileRotationMb = Input.ofNullable(fileRotationMb);
            return this;
        }

        public Builder setJsonFileFormat(@Nullable Input<JsonFileFormatArgs> jsonFileFormat) {
            this.jsonFileFormat = jsonFileFormat;
            return this;
        }

        public Builder setJsonFileFormat(@Nullable JsonFileFormatArgs jsonFileFormat) {
            this.jsonFileFormat = Input.ofNullable(jsonFileFormat);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public GcsDestinationConfigArgs build() {
            return new GcsDestinationConfigArgs(avroFileFormat, fileRotationInterval, fileRotationMb, jsonFileFormat, path);
        }
    }
}
