// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs.
 * 
 */
public final class BucketLoggingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLoggingArgs Empty = new BucketLoggingArgs();

    /**
     * The destination bucket where the current bucket's logs should be placed.
     * 
     */
    @Import(name="logBucket")
      private final @Nullable Output<String> logBucket;

    public Output<String> getLogBucket() {
        return this.logBucket == null ? Codegen.empty() : this.logBucket;
    }

    /**
     * A prefix for log object names.
     * 
     */
    @Import(name="logObjectPrefix")
      private final @Nullable Output<String> logObjectPrefix;

    public Output<String> getLogObjectPrefix() {
        return this.logObjectPrefix == null ? Codegen.empty() : this.logObjectPrefix;
    }

    public BucketLoggingArgs(
        @Nullable Output<String> logBucket,
        @Nullable Output<String> logObjectPrefix) {
        this.logBucket = logBucket;
        this.logObjectPrefix = logObjectPrefix;
    }

    private BucketLoggingArgs() {
        this.logBucket = Codegen.empty();
        this.logObjectPrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> logBucket;
        private @Nullable Output<String> logObjectPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logBucket = defaults.logBucket;
    	      this.logObjectPrefix = defaults.logObjectPrefix;
        }

        public Builder logBucket(@Nullable Output<String> logBucket) {
            this.logBucket = logBucket;
            return this;
        }
        public Builder logBucket(@Nullable String logBucket) {
            this.logBucket = Codegen.ofNullable(logBucket);
            return this;
        }
        public Builder logObjectPrefix(@Nullable Output<String> logObjectPrefix) {
            this.logObjectPrefix = logObjectPrefix;
            return this;
        }
        public Builder logObjectPrefix(@Nullable String logObjectPrefix) {
            this.logObjectPrefix = Codegen.ofNullable(logObjectPrefix);
            return this;
        }        public BucketLoggingArgs build() {
            return new BucketLoggingArgs(logBucket, logObjectPrefix);
        }
    }
}
