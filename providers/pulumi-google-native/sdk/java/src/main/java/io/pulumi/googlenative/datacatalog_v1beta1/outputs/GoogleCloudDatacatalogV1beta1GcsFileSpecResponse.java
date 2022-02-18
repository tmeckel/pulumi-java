// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1SystemTimestampsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1beta1GcsFileSpecResponse {
    /**
     * The full file path. Example: `gs://bucket_name/a/b.txt`.
     * 
     */
    private final String filePath;
    /**
     * Timestamps about the Cloud Storage file.
     * 
     */
    private final GoogleCloudDatacatalogV1beta1SystemTimestampsResponse gcsTimestamps;
    /**
     * The size of the file, in bytes.
     * 
     */
    private final String sizeBytes;

    @OutputCustomType.Constructor({"filePath","gcsTimestamps","sizeBytes"})
    private GoogleCloudDatacatalogV1beta1GcsFileSpecResponse(
        String filePath,
        GoogleCloudDatacatalogV1beta1SystemTimestampsResponse gcsTimestamps,
        String sizeBytes) {
        this.filePath = Objects.requireNonNull(filePath);
        this.gcsTimestamps = Objects.requireNonNull(gcsTimestamps);
        this.sizeBytes = Objects.requireNonNull(sizeBytes);
    }

    /**
     * The full file path. Example: `gs://bucket_name/a/b.txt`.
     * 
     */
    public String getFilePath() {
        return this.filePath;
    }
    /**
     * Timestamps about the Cloud Storage file.
     * 
     */
    public GoogleCloudDatacatalogV1beta1SystemTimestampsResponse getGcsTimestamps() {
        return this.gcsTimestamps;
    }
    /**
     * The size of the file, in bytes.
     * 
     */
    public String getSizeBytes() {
        return this.sizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1GcsFileSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filePath;
        private GoogleCloudDatacatalogV1beta1SystemTimestampsResponse gcsTimestamps;
        private String sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1GcsFileSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePath = defaults.filePath;
    	      this.gcsTimestamps = defaults.gcsTimestamps;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder setFilePath(String filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }

        public Builder setGcsTimestamps(GoogleCloudDatacatalogV1beta1SystemTimestampsResponse gcsTimestamps) {
            this.gcsTimestamps = Objects.requireNonNull(gcsTimestamps);
            return this;
        }

        public Builder setSizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
            return this;
        }

        public GoogleCloudDatacatalogV1beta1GcsFileSpecResponse build() {
            return new GoogleCloudDatacatalogV1beta1GcsFileSpecResponse(filePath, gcsTimestamps, sizeBytes);
        }
    }
}
