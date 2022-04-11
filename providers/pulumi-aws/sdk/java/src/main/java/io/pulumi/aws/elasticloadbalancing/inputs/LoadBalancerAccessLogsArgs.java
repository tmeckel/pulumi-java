// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerAccessLogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerAccessLogsArgs Empty = new LoadBalancerAccessLogsArgs();

    /**
     * The S3 bucket name to store the logs in.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
     */
    @Import(name="bucketPrefix")
      private final @Nullable Output<String> bucketPrefix;

    public Output<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Codegen.empty() : this.bucketPrefix;
    }

    /**
     * Boolean to enable / disable `access_logs`. Default is `true`
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The publishing interval in minutes. Default: 60 minutes.
     * 
     */
    @Import(name="interval")
      private final @Nullable Output<Integer> interval;

    public Output<Integer> getInterval() {
        return this.interval == null ? Codegen.empty() : this.interval;
    }

    public LoadBalancerAccessLogsArgs(
        Output<String> bucket,
        @Nullable Output<String> bucketPrefix,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Integer> interval) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.enabled = enabled;
        this.interval = interval;
    }

    private LoadBalancerAccessLogsArgs() {
        this.bucket = Codegen.empty();
        this.bucketPrefix = Codegen.empty();
        this.enabled = Codegen.empty();
        this.interval = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerAccessLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<String> bucketPrefix;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Integer> interval;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerAccessLogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.enabled = defaults.enabled;
    	      this.interval = defaults.interval;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Codegen.ofNullable(bucketPrefix);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder interval(@Nullable Output<Integer> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = Codegen.ofNullable(interval);
            return this;
        }        public LoadBalancerAccessLogsArgs build() {
            return new LoadBalancerAccessLogsArgs(bucket, bucketPrefix, enabled, interval);
        }
    }
}
