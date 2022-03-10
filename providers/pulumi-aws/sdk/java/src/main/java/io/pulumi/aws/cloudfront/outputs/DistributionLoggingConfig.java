// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionLoggingConfig {
    /**
     * The Amazon S3 bucket to store the access logs in, for
     * example, `myawslogbucket.s3.amazonaws.com`.
     * 
     */
    private final String bucket;
    /**
     * Specifies whether you want CloudFront to
     * include cookies in access logs (default: `false`).
     * 
     */
    private final @Nullable Boolean includeCookies;
    /**
     * An optional string that you want CloudFront to prefix
     * to the access log filenames for this distribution, for example, `myprefix/`.
     * 
     */
    private final @Nullable String prefix;

    @OutputCustomType.Constructor
    private DistributionLoggingConfig(
        @OutputCustomType.Parameter("bucket") String bucket,
        @OutputCustomType.Parameter("includeCookies") @Nullable Boolean includeCookies,
        @OutputCustomType.Parameter("prefix") @Nullable String prefix) {
        this.bucket = bucket;
        this.includeCookies = includeCookies;
        this.prefix = prefix;
    }

    /**
     * The Amazon S3 bucket to store the access logs in, for
     * example, `myawslogbucket.s3.amazonaws.com`.
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * Specifies whether you want CloudFront to
     * include cookies in access logs (default: `false`).
     * 
    */
    public Optional<Boolean> getIncludeCookies() {
        return Optional.ofNullable(this.includeCookies);
    }
    /**
     * An optional string that you want CloudFront to prefix
     * to the access log filenames for this distribution, for example, `myprefix/`.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable Boolean includeCookies;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.includeCookies = defaults.includeCookies;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder includeCookies(@Nullable Boolean includeCookies) {
            this.includeCookies = includeCookies;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public DistributionLoggingConfig build() {
            return new DistributionLoggingConfig(bucket, includeCookies, prefix);
        }
    }
}
