// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBucketLogging {
    private final String logBucket;
    private final String logObjectPrefix;

    @OutputCustomType.Constructor
    private GetBucketLogging(
        @OutputCustomType.Parameter("logBucket") String logBucket,
        @OutputCustomType.Parameter("logObjectPrefix") String logObjectPrefix) {
        this.logBucket = logBucket;
        this.logObjectPrefix = logObjectPrefix;
    }

    public String getLogBucket() {
        return this.logBucket;
    }
    public String getLogObjectPrefix() {
        return this.logObjectPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logBucket;
        private String logObjectPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logBucket = defaults.logBucket;
    	      this.logObjectPrefix = defaults.logObjectPrefix;
        }

        public Builder logBucket(String logBucket) {
            this.logBucket = Objects.requireNonNull(logBucket);
            return this;
        }

        public Builder logObjectPrefix(String logObjectPrefix) {
            this.logObjectPrefix = Objects.requireNonNull(logObjectPrefix);
            return this;
        }
        public GetBucketLogging build() {
            return new GetBucketLogging(logBucket, logObjectPrefix);
        }
    }
}
