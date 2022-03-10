// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs Empty = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs();

    /**
     * The ARN for the S3 bucket containing the application code.
     * 
     */
    @InputImport(name="bucketArn", required=true)
      private final Input<String> bucketArn;

    public Input<String> getBucketArn() {
        return this.bucketArn;
    }

    /**
     * The file key for the object containing the application code.
     * 
     */
    @InputImport(name="fileKey", required=true)
      private final Input<String> fileKey;

    public Input<String> getFileKey() {
        return this.fileKey;
    }

    /**
     * The version of the object containing the application code.
     * 
     */
    @InputImport(name="objectVersion")
      private final @Nullable Input<String> objectVersion;

    public Input<String> getObjectVersion() {
        return this.objectVersion == null ? Input.empty() : this.objectVersion;
    }

    public ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs(
        Input<String> bucketArn,
        Input<String> fileKey,
        @Nullable Input<String> objectVersion) {
        this.bucketArn = Objects.requireNonNull(bucketArn, "expected parameter 'bucketArn' to be non-null");
        this.fileKey = Objects.requireNonNull(fileKey, "expected parameter 'fileKey' to be non-null");
        this.objectVersion = objectVersion;
    }

    private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs() {
        this.bucketArn = Input.empty();
        this.fileKey = Input.empty();
        this.objectVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketArn;
        private Input<String> fileKey;
        private @Nullable Input<String> objectVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.fileKey = defaults.fileKey;
    	      this.objectVersion = defaults.objectVersion;
        }

        public Builder bucketArn(Input<String> bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }

        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Input.of(Objects.requireNonNull(bucketArn));
            return this;
        }

        public Builder fileKey(Input<String> fileKey) {
            this.fileKey = Objects.requireNonNull(fileKey);
            return this;
        }

        public Builder fileKey(String fileKey) {
            this.fileKey = Input.of(Objects.requireNonNull(fileKey));
            return this;
        }

        public Builder objectVersion(@Nullable Input<String> objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }

        public Builder objectVersion(@Nullable String objectVersion) {
            this.objectVersion = Input.ofNullable(objectVersion);
            return this;
        }
        public ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs build() {
            return new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs(bucketArn, fileKey, objectVersion);
        }
    }
}
