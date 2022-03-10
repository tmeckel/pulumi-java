// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterExecuteCommandLogConfiguration {
    private final @Nullable Boolean cloudWatchEncryptionEnabled;
    private final @Nullable String cloudWatchLogGroupName;
    private final @Nullable String s3BucketName;
    private final @Nullable Boolean s3EncryptionEnabled;
    private final @Nullable String s3KeyPrefix;

    @OutputCustomType.Constructor
    private ClusterExecuteCommandLogConfiguration(
        @OutputCustomType.Parameter("cloudWatchEncryptionEnabled") @Nullable Boolean cloudWatchEncryptionEnabled,
        @OutputCustomType.Parameter("cloudWatchLogGroupName") @Nullable String cloudWatchLogGroupName,
        @OutputCustomType.Parameter("s3BucketName") @Nullable String s3BucketName,
        @OutputCustomType.Parameter("s3EncryptionEnabled") @Nullable Boolean s3EncryptionEnabled,
        @OutputCustomType.Parameter("s3KeyPrefix") @Nullable String s3KeyPrefix) {
        this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
        this.s3BucketName = s3BucketName;
        this.s3EncryptionEnabled = s3EncryptionEnabled;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    public Optional<Boolean> getCloudWatchEncryptionEnabled() {
        return Optional.ofNullable(this.cloudWatchEncryptionEnabled);
    }
    public Optional<String> getCloudWatchLogGroupName() {
        return Optional.ofNullable(this.cloudWatchLogGroupName);
    }
    public Optional<String> getS3BucketName() {
        return Optional.ofNullable(this.s3BucketName);
    }
    public Optional<Boolean> getS3EncryptionEnabled() {
        return Optional.ofNullable(this.s3EncryptionEnabled);
    }
    public Optional<String> getS3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
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
