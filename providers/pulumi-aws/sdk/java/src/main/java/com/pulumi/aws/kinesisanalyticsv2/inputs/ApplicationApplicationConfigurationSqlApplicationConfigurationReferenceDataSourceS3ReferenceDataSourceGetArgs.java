// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs();

    /**
     * The ARN for the S3 bucket containing the application code.
     * 
     */
    @Import(name="bucketArn", required=true)
    private Output<String> bucketArn;

    /**
     * @return The ARN for the S3 bucket containing the application code.
     * 
     */
    public Output<String> bucketArn() {
        return this.bucketArn;
    }

    /**
     * The file key for the object containing the application code.
     * 
     */
    @Import(name="fileKey", required=true)
    private Output<String> fileKey;

    /**
     * @return The file key for the object containing the application code.
     * 
     */
    public Output<String> fileKey() {
        return this.fileKey;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs $) {
        this.bucketArn = $.bucketArn;
        this.fileKey = $.fileKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketArn The ARN for the S3 bucket containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder bucketArn(Output<String> bucketArn) {
            $.bucketArn = bucketArn;
            return this;
        }

        /**
         * @param bucketArn The ARN for the S3 bucket containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder bucketArn(String bucketArn) {
            return bucketArn(Output.of(bucketArn));
        }

        /**
         * @param fileKey The file key for the object containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder fileKey(Output<String> fileKey) {
            $.fileKey = fileKey;
            return this;
        }

        /**
         * @param fileKey The file key for the object containing the application code.
         * 
         * @return builder
         * 
         */
        public Builder fileKey(String fileKey) {
            return fileKey(Output.of(fileKey));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs build() {
            $.bucketArn = Objects.requireNonNull($.bucketArn, "expected parameter 'bucketArn' to be non-null");
            $.fileKey = Objects.requireNonNull($.fileKey, "expected parameter 'fileKey' to be non-null");
            return $;
        }
    }

}
