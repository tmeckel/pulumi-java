// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.inputs;

import com.pulumi.aws.ebs.inputs.SnapshotImportDiskContainerUserBucketArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotImportDiskContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotImportDiskContainerArgs Empty = new SnapshotImportDiskContainerArgs();

    /**
     * The description of the disk image being imported.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the disk image being imported.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The format of the disk image being imported. One of `VHD` or `VMDK`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return The format of the disk image being imported. One of `VHD` or `VMDK`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
     * 
     */
    @Import(name="userBucket")
    private @Nullable Output<SnapshotImportDiskContainerUserBucketArgs> userBucket;

    /**
     * @return The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
     * 
     */
    public Optional<Output<SnapshotImportDiskContainerUserBucketArgs>> userBucket() {
        return Optional.ofNullable(this.userBucket);
    }

    private SnapshotImportDiskContainerArgs() {}

    private SnapshotImportDiskContainerArgs(SnapshotImportDiskContainerArgs $) {
        this.description = $.description;
        this.format = $.format;
        this.url = $.url;
        this.userBucket = $.userBucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotImportDiskContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotImportDiskContainerArgs $;

        public Builder() {
            $ = new SnapshotImportDiskContainerArgs();
        }

        public Builder(SnapshotImportDiskContainerArgs defaults) {
            $ = new SnapshotImportDiskContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the disk image being imported.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the disk image being imported.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param format The format of the disk image being imported. One of `VHD` or `VMDK`.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of the disk image being imported. One of `VHD` or `VMDK`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param url The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param userBucket The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder userBucket(@Nullable Output<SnapshotImportDiskContainerUserBucketArgs> userBucket) {
            $.userBucket = userBucket;
            return this;
        }

        /**
         * @param userBucket The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder userBucket(SnapshotImportDiskContainerUserBucketArgs userBucket) {
            return userBucket(Output.of(userBucket));
        }

        public SnapshotImportDiskContainerArgs build() {
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}
