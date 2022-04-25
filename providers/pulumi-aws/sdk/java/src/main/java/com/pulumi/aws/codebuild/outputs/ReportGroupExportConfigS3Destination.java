// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReportGroupExportConfigS3Destination {
    /**
     * @return The name of the S3 bucket where the raw data of a report are exported.
     * 
     */
    private final String bucket;
    /**
     * @return A boolean value that specifies if the results of a report are encrypted.
     * **Note: the API does not currently allow setting encryption as disabled**
     * 
     */
    private final @Nullable Boolean encryptionDisabled;
    /**
     * @return The encryption key for the report&#39;s encrypted raw data. The KMS key ARN.
     * 
     */
    private final String encryptionKey;
    /**
     * @return The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
     * 
     */
    private final @Nullable String packaging;
    /**
     * @return The path to the exported report&#39;s raw data results.
     * 
     */
    private final @Nullable String path;

    @CustomType.Constructor
    private ReportGroupExportConfigS3Destination(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("encryptionDisabled") @Nullable Boolean encryptionDisabled,
        @CustomType.Parameter("encryptionKey") String encryptionKey,
        @CustomType.Parameter("packaging") @Nullable String packaging,
        @CustomType.Parameter("path") @Nullable String path) {
        this.bucket = bucket;
        this.encryptionDisabled = encryptionDisabled;
        this.encryptionKey = encryptionKey;
        this.packaging = packaging;
        this.path = path;
    }

    /**
     * @return The name of the S3 bucket where the raw data of a report are exported.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return A boolean value that specifies if the results of a report are encrypted.
     * **Note: the API does not currently allow setting encryption as disabled**
     * 
     */
    public Optional<Boolean> encryptionDisabled() {
        return Optional.ofNullable(this.encryptionDisabled);
    }
    /**
     * @return The encryption key for the report&#39;s encrypted raw data. The KMS key ARN.
     * 
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }
    /**
     * @return The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
     * 
     */
    public Optional<String> packaging() {
        return Optional.ofNullable(this.packaging);
    }
    /**
     * @return The path to the exported report&#39;s raw data results.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportGroupExportConfigS3Destination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable Boolean encryptionDisabled;
        private String encryptionKey;
        private @Nullable String packaging;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportGroupExportConfigS3Destination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.encryptionDisabled = defaults.encryptionDisabled;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.packaging = defaults.packaging;
    	      this.path = defaults.path;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder encryptionDisabled(@Nullable Boolean encryptionDisabled) {
            this.encryptionDisabled = encryptionDisabled;
            return this;
        }
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }
        public Builder packaging(@Nullable String packaging) {
            this.packaging = packaging;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }        public ReportGroupExportConfigS3Destination build() {
            return new ReportGroupExportConfigS3Destination(bucket, encryptionDisabled, encryptionKey, packaging, path);
        }
    }
}
