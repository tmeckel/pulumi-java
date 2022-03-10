// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.awsnative.timestream.outputs.ScheduledQueryS3Configuration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ScheduledQueryErrorReportConfiguration {
    private final ScheduledQueryS3Configuration s3Configuration;

    @OutputCustomType.Constructor
    private ScheduledQueryErrorReportConfiguration(@OutputCustomType.Parameter("s3Configuration") ScheduledQueryS3Configuration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    public ScheduledQueryS3Configuration getS3Configuration() {
        return this.s3Configuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryErrorReportConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledQueryS3Configuration s3Configuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledQueryErrorReportConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Configuration = defaults.s3Configuration;
        }

        public Builder s3Configuration(ScheduledQueryS3Configuration s3Configuration) {
            this.s3Configuration = Objects.requireNonNull(s3Configuration);
            return this;
        }
        public ScheduledQueryErrorReportConfiguration build() {
            return new ScheduledQueryErrorReportConfiguration(s3Configuration);
        }
    }
}
