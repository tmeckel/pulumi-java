// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AnalyticsApplicationReferenceDataSourcesS3 {
    /**
     * @return The S3 Bucket ARN.
     * 
     */
    private final String bucketArn;
    /**
     * @return The File Key name containing reference data.
     * 
     */
    private final String fileKey;
    /**
     * @return The ARN of the IAM Role used to send application messages.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private AnalyticsApplicationReferenceDataSourcesS3(
        @CustomType.Parameter("bucketArn") String bucketArn,
        @CustomType.Parameter("fileKey") String fileKey,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.bucketArn = bucketArn;
        this.fileKey = fileKey;
        this.roleArn = roleArn;
    }

    /**
     * @return The S3 Bucket ARN.
     * 
     */
    public String bucketArn() {
        return this.bucketArn;
    }
    /**
     * @return The File Key name containing reference data.
     * 
     */
    public String fileKey() {
        return this.fileKey;
    }
    /**
     * @return The ARN of the IAM Role used to send application messages.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketArn;
        private String fileKey;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.fileKey = defaults.fileKey;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }
        public Builder fileKey(String fileKey) {
            this.fileKey = Objects.requireNonNull(fileKey);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public AnalyticsApplicationReferenceDataSourcesS3 build() {
            return new AnalyticsApplicationReferenceDataSourcesS3(bucketArn, fileKey, roleArn);
        }
    }
}
