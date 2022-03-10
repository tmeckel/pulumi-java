// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The session logging configuration for ExecuteCommand.
 * 
 */
public final class ClusterExecuteCommandLogConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ClusterExecuteCommandLogConfiguration Empty = new ClusterExecuteCommandLogConfiguration();

    @InputImport(name="cloudWatchEncryptionEnabled")
      private final @Nullable Boolean cloudWatchEncryptionEnabled;

    public Optional<Boolean> getCloudWatchEncryptionEnabled() {
        return this.cloudWatchEncryptionEnabled == null ? Optional.empty() : Optional.ofNullable(this.cloudWatchEncryptionEnabled);
    }

    @InputImport(name="cloudWatchLogGroupName")
      private final @Nullable String cloudWatchLogGroupName;

    public Optional<String> getCloudWatchLogGroupName() {
        return this.cloudWatchLogGroupName == null ? Optional.empty() : Optional.ofNullable(this.cloudWatchLogGroupName);
    }

    @InputImport(name="s3BucketName")
      private final @Nullable String s3BucketName;

    public Optional<String> getS3BucketName() {
        return this.s3BucketName == null ? Optional.empty() : Optional.ofNullable(this.s3BucketName);
    }

    @InputImport(name="s3EncryptionEnabled")
      private final @Nullable Boolean s3EncryptionEnabled;

    public Optional<Boolean> getS3EncryptionEnabled() {
        return this.s3EncryptionEnabled == null ? Optional.empty() : Optional.ofNullable(this.s3EncryptionEnabled);
    }

    @InputImport(name="s3KeyPrefix")
      private final @Nullable String s3KeyPrefix;

    public Optional<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Optional.empty() : Optional.ofNullable(this.s3KeyPrefix);
    }

    public ClusterExecuteCommandLogConfiguration(
        @Nullable Boolean cloudWatchEncryptionEnabled,
        @Nullable String cloudWatchLogGroupName,
        @Nullable String s3BucketName,
        @Nullable Boolean s3EncryptionEnabled,
        @Nullable String s3KeyPrefix) {
        this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
        this.s3BucketName = s3BucketName;
        this.s3EncryptionEnabled = s3EncryptionEnabled;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ClusterExecuteCommandLogConfiguration() {
        this.cloudWatchEncryptionEnabled = null;
        this.cloudWatchLogGroupName = null;
        this.s3BucketName = null;
        this.s3EncryptionEnabled = null;
        this.s3KeyPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterExecuteCommandLogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean cloudWatchEncryptionEnabled;
        private @Nullable String cloudWatchLogGroupName;
        private @Nullable String s3BucketName;
        private @Nullable Boolean s3EncryptionEnabled;
        private @Nullable String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterExecuteCommandLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchEncryptionEnabled = defaults.cloudWatchEncryptionEnabled;
    	      this.cloudWatchLogGroupName = defaults.cloudWatchLogGroupName;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3EncryptionEnabled = defaults.s3EncryptionEnabled;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder cloudWatchEncryptionEnabled(@Nullable Boolean cloudWatchEncryptionEnabled) {
            this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
            return this;
        }

        public Builder cloudWatchLogGroupName(@Nullable String cloudWatchLogGroupName) {
            this.cloudWatchLogGroupName = cloudWatchLogGroupName;
            return this;
        }

        public Builder s3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        public Builder s3EncryptionEnabled(@Nullable Boolean s3EncryptionEnabled) {
            this.s3EncryptionEnabled = s3EncryptionEnabled;
            return this;
        }

        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public ClusterExecuteCommandLogConfiguration build() {
            return new ClusterExecuteCommandLogConfiguration(cloudWatchEncryptionEnabled, cloudWatchLogGroupName, s3BucketName, s3EncryptionEnabled, s3KeyPrefix);
        }
    }
}
