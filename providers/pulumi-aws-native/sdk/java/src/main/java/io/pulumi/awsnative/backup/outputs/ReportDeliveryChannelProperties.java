// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportDeliveryChannelProperties {
    /**
     * A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
     */
    private final @Nullable List<String> formats;
    /**
     * The unique name of the S3 bucket that receives your reports.
     * 
     */
    private final String s3BucketName;
    /**
     * The prefix for where AWS Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
     */
    private final @Nullable String s3KeyPrefix;

    @OutputCustomType.Constructor
    private ReportDeliveryChannelProperties(
        @OutputCustomType.Parameter("formats") @Nullable List<String> formats,
        @OutputCustomType.Parameter("s3BucketName") String s3BucketName,
        @OutputCustomType.Parameter("s3KeyPrefix") @Nullable String s3KeyPrefix) {
        this.formats = formats;
        this.s3BucketName = s3BucketName;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
    */
    public List<String> getFormats() {
        return this.formats == null ? List.of() : this.formats;
    }
    /**
     * The unique name of the S3 bucket that receives your reports.
     * 
    */
    public String getS3BucketName() {
        return this.s3BucketName;
    }
    /**
     * The prefix for where AWS Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
    */
    public Optional<String> getS3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryChannelProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> formats;
        private String s3BucketName;
        private @Nullable String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryChannelProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.formats = defaults.formats;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder formats(@Nullable List<String> formats) {
            this.formats = formats;
            return this;
        }

        public Builder s3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }

        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public ReportDeliveryChannelProperties build() {
            return new ReportDeliveryChannelProperties(formats, s3BucketName, s3KeyPrefix);
        }
    }
}
