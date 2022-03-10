// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy;
import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicySecurityHeadersConfigContentTypeOptions;
import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicySecurityHeadersConfigFrameOptions;
import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy;
import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity;
import io.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicySecurityHeadersConfigXssProtection;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResponseHeadersPolicySecurityHeadersConfig {
    /**
     * The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    private final @Nullable ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy contentSecurityPolicy;
    /**
     * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
     * 
     */
    private final @Nullable ResponseHeadersPolicySecurityHeadersConfigContentTypeOptions contentTypeOptions;
    /**
     * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
     * 
     */
    private final @Nullable ResponseHeadersPolicySecurityHeadersConfigFrameOptions frameOptions;
    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    private final @Nullable ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy referrerPolicy;
    /**
     * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
     * 
     */
    private final @Nullable ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity strictTransportSecurity;
    /**
     * Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
     * 
     */
    private final @Nullable ResponseHeadersPolicySecurityHeadersConfigXssProtection xssProtection;

    @OutputCustomType.Constructor
    private ResponseHeadersPolicySecurityHeadersConfig(
        @OutputCustomType.Parameter("contentSecurityPolicy") @Nullable ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy contentSecurityPolicy,
        @OutputCustomType.Parameter("contentTypeOptions") @Nullable ResponseHeadersPolicySecurityHeadersConfigContentTypeOptions contentTypeOptions,
        @OutputCustomType.Parameter("frameOptions") @Nullable ResponseHeadersPolicySecurityHeadersConfigFrameOptions frameOptions,
        @OutputCustomType.Parameter("referrerPolicy") @Nullable ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy referrerPolicy,
        @OutputCustomType.Parameter("strictTransportSecurity") @Nullable ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity strictTransportSecurity,
        @OutputCustomType.Parameter("xssProtection") @Nullable ResponseHeadersPolicySecurityHeadersConfigXssProtection xssProtection) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.contentTypeOptions = contentTypeOptions;
        this.frameOptions = frameOptions;
        this.referrerPolicy = referrerPolicy;
        this.strictTransportSecurity = strictTransportSecurity;
        this.xssProtection = xssProtection;
    }

    /**
     * The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
    */
    public Optional<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy> getContentSecurityPolicy() {
        return Optional.ofNullable(this.contentSecurityPolicy);
    }
    /**
     * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
     * 
    */
    public Optional<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptions> getContentTypeOptions() {
        return Optional.ofNullable(this.contentTypeOptions);
    }
    /**
     * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
     * 
    */
    public Optional<ResponseHeadersPolicySecurityHeadersConfigFrameOptions> getFrameOptions() {
        return Optional.ofNullable(this.frameOptions);
    }
    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
    */
    public Optional<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy> getReferrerPolicy() {
        return Optional.ofNullable(this.referrerPolicy);
    }
    /**
     * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
     * 
    */
    public Optional<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity> getStrictTransportSecurity() {
        return Optional.ofNullable(this.strictTransportSecurity);
    }
    /**
     * Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
     * 
    */
    public Optional<ResponseHeadersPolicySecurityHeadersConfigXssProtection> getXssProtection() {
        return Optional.ofNullable(this.xssProtection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy contentSecurityPolicy;
        private @Nullable ResponseHeadersPolicySecurityHeadersConfigContentTypeOptions contentTypeOptions;
        private @Nullable ResponseHeadersPolicySecurityHeadersConfigFrameOptions frameOptions;
        private @Nullable ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy referrerPolicy;
        private @Nullable ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity strictTransportSecurity;
        private @Nullable ResponseHeadersPolicySecurityHeadersConfigXssProtection xssProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.contentTypeOptions = defaults.contentTypeOptions;
    	      this.frameOptions = defaults.frameOptions;
    	      this.referrerPolicy = defaults.referrerPolicy;
    	      this.strictTransportSecurity = defaults.strictTransportSecurity;
    	      this.xssProtection = defaults.xssProtection;
        }

        public Builder contentSecurityPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy contentSecurityPolicy) {
            this.contentSecurityPolicy = contentSecurityPolicy;
            return this;
        }

        public Builder contentTypeOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentTypeOptions contentTypeOptions) {
            this.contentTypeOptions = contentTypeOptions;
            return this;
        }

        public Builder frameOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigFrameOptions frameOptions) {
            this.frameOptions = frameOptions;
            return this;
        }

        public Builder referrerPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigReferrerPolicy referrerPolicy) {
            this.referrerPolicy = referrerPolicy;
            return this;
        }

        public Builder strictTransportSecurity(@Nullable ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity strictTransportSecurity) {
            this.strictTransportSecurity = strictTransportSecurity;
            return this;
        }

        public Builder xssProtection(@Nullable ResponseHeadersPolicySecurityHeadersConfigXssProtection xssProtection) {
            this.xssProtection = xssProtection;
            return this;
        }
        public ResponseHeadersPolicySecurityHeadersConfig build() {
            return new ResponseHeadersPolicySecurityHeadersConfig(contentSecurityPolicy, contentTypeOptions, frameOptions, referrerPolicy, strictTransportSecurity, xssProtection);
        }
    }
}
