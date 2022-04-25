// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReportGroupExportConfigS3DestinationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportGroupExportConfigS3DestinationGetArgs Empty = new ReportGroupExportConfigS3DestinationGetArgs();

    /**
     * The name of the S3 bucket where the raw data of a report are exported.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the S3 bucket where the raw data of a report are exported.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * A boolean value that specifies if the results of a report are encrypted.
     * **Note: the API does not currently allow setting encryption as disabled**
     * 
     */
    @Import(name="encryptionDisabled")
    private @Nullable Output<Boolean> encryptionDisabled;

    /**
     * @return A boolean value that specifies if the results of a report are encrypted.
     * **Note: the API does not currently allow setting encryption as disabled**
     * 
     */
    public Optional<Output<Boolean>> encryptionDisabled() {
        return Optional.ofNullable(this.encryptionDisabled);
    }

    /**
     * The encryption key for the report&#39;s encrypted raw data. The KMS key ARN.
     * 
     */
    @Import(name="encryptionKey", required=true)
    private Output<String> encryptionKey;

    /**
     * @return The encryption key for the report&#39;s encrypted raw data. The KMS key ARN.
     * 
     */
    public Output<String> encryptionKey() {
        return this.encryptionKey;
    }

    /**
     * The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
     * 
     */
    @Import(name="packaging")
    private @Nullable Output<String> packaging;

    /**
     * @return The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
     * 
     */
    public Optional<Output<String>> packaging() {
        return Optional.ofNullable(this.packaging);
    }

    /**
     * The path to the exported report&#39;s raw data results.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path to the exported report&#39;s raw data results.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private ReportGroupExportConfigS3DestinationGetArgs() {}

    private ReportGroupExportConfigS3DestinationGetArgs(ReportGroupExportConfigS3DestinationGetArgs $) {
        this.bucket = $.bucket;
        this.encryptionDisabled = $.encryptionDisabled;
        this.encryptionKey = $.encryptionKey;
        this.packaging = $.packaging;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportGroupExportConfigS3DestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportGroupExportConfigS3DestinationGetArgs $;

        public Builder() {
            $ = new ReportGroupExportConfigS3DestinationGetArgs();
        }

        public Builder(ReportGroupExportConfigS3DestinationGetArgs defaults) {
            $ = new ReportGroupExportConfigS3DestinationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the S3 bucket where the raw data of a report are exported.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the S3 bucket where the raw data of a report are exported.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param encryptionDisabled A boolean value that specifies if the results of a report are encrypted.
         * **Note: the API does not currently allow setting encryption as disabled**
         * 
         * @return builder
         * 
         */
        public Builder encryptionDisabled(@Nullable Output<Boolean> encryptionDisabled) {
            $.encryptionDisabled = encryptionDisabled;
            return this;
        }

        /**
         * @param encryptionDisabled A boolean value that specifies if the results of a report are encrypted.
         * **Note: the API does not currently allow setting encryption as disabled**
         * 
         * @return builder
         * 
         */
        public Builder encryptionDisabled(Boolean encryptionDisabled) {
            return encryptionDisabled(Output.of(encryptionDisabled));
        }

        /**
         * @param encryptionKey The encryption key for the report&#39;s encrypted raw data. The KMS key ARN.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(Output<String> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param encryptionKey The encryption key for the report&#39;s encrypted raw data. The KMS key ARN.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(String encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        /**
         * @param packaging The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
         * 
         * @return builder
         * 
         */
        public Builder packaging(@Nullable Output<String> packaging) {
            $.packaging = packaging;
            return this;
        }

        /**
         * @param packaging The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
         * 
         * @return builder
         * 
         */
        public Builder packaging(String packaging) {
            return packaging(Output.of(packaging));
        }

        /**
         * @param path The path to the exported report&#39;s raw data results.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to the exported report&#39;s raw data results.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public ReportGroupExportConfigS3DestinationGetArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.encryptionKey = Objects.requireNonNull($.encryptionKey, "expected parameter 'encryptionKey' to be non-null");
            return $;
        }
    }

}
