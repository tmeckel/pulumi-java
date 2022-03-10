// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLoggingGetArgs Empty = new BucketLoggingGetArgs();

    /**
     * The bucket that will receive log objects.
     * 
     */
    @InputImport(name="logBucket", required=true)
      private final Input<String> logBucket;

    public Input<String> getLogBucket() {
        return this.logBucket;
    }

    /**
     * The object prefix for log objects. If it's not provided,
     * by default GCS sets this to this bucket's name.
     * 
     */
    @InputImport(name="logObjectPrefix")
      private final @Nullable Input<String> logObjectPrefix;

    public Input<String> getLogObjectPrefix() {
        return this.logObjectPrefix == null ? Input.empty() : this.logObjectPrefix;
    }

    public BucketLoggingGetArgs(
        Input<String> logBucket,
        @Nullable Input<String> logObjectPrefix) {
        this.logBucket = Objects.requireNonNull(logBucket, "expected parameter 'logBucket' to be non-null");
        this.logObjectPrefix = logObjectPrefix;
    }

    private BucketLoggingGetArgs() {
        this.logBucket = Input.empty();
        this.logObjectPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> logBucket;
        private @Nullable Input<String> logObjectPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logBucket = defaults.logBucket;
    	      this.logObjectPrefix = defaults.logObjectPrefix;
        }

        public Builder logBucket(Input<String> logBucket) {
            this.logBucket = Objects.requireNonNull(logBucket);
            return this;
        }

        public Builder logBucket(String logBucket) {
            this.logBucket = Input.of(Objects.requireNonNull(logBucket));
            return this;
        }

        public Builder logObjectPrefix(@Nullable Input<String> logObjectPrefix) {
            this.logObjectPrefix = logObjectPrefix;
            return this;
        }

        public Builder logObjectPrefix(@Nullable String logObjectPrefix) {
            this.logObjectPrefix = Input.ofNullable(logObjectPrefix);
            return this;
        }
        public BucketLoggingGetArgs build() {
            return new BucketLoggingGetArgs(logBucket, logObjectPrefix);
        }
    }
}
