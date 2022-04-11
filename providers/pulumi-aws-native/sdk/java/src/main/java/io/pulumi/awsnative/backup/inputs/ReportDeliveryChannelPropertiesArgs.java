// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
 * 
 */
public final class ReportDeliveryChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportDeliveryChannelPropertiesArgs Empty = new ReportDeliveryChannelPropertiesArgs();

    /**
     * A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
     */
    @Import(name="formats")
      private final @Nullable Output<List<String>> formats;

    public Output<List<String>> getFormats() {
        return this.formats == null ? Codegen.empty() : this.formats;
    }

    /**
     * The unique name of the S3 bucket that receives your reports.
     * 
     */
    @Import(name="s3BucketName", required=true)
      private final Output<String> s3BucketName;

    public Output<String> getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * The prefix for where AWS Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
     */
    @Import(name="s3KeyPrefix")
      private final @Nullable Output<String> s3KeyPrefix;

    public Output<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Codegen.empty() : this.s3KeyPrefix;
    }

    public ReportDeliveryChannelPropertiesArgs(
        @Nullable Output<List<String>> formats,
        Output<String> s3BucketName,
        @Nullable Output<String> s3KeyPrefix) {
        this.formats = formats;
        this.s3BucketName = Objects.requireNonNull(s3BucketName, "expected parameter 's3BucketName' to be non-null");
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ReportDeliveryChannelPropertiesArgs() {
        this.formats = Codegen.empty();
        this.s3BucketName = Codegen.empty();
        this.s3KeyPrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> formats;
        private Output<String> s3BucketName;
        private @Nullable Output<String> s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.formats = defaults.formats;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder formats(@Nullable Output<List<String>> formats) {
            this.formats = formats;
            return this;
        }
        public Builder formats(@Nullable List<String> formats) {
            this.formats = Codegen.ofNullable(formats);
            return this;
        }
        public Builder formats(String... formats) {
            return formats(List.of(formats));
        }
        public Builder s3BucketName(Output<String> s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }
        public Builder s3BucketName(String s3BucketName) {
            this.s3BucketName = Output.of(Objects.requireNonNull(s3BucketName));
            return this;
        }
        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Codegen.ofNullable(s3KeyPrefix);
            return this;
        }        public ReportDeliveryChannelPropertiesArgs build() {
            return new ReportDeliveryChannelPropertiesArgs(formats, s3BucketName, s3KeyPrefix);
        }
    }
}
