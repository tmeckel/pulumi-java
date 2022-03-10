// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicySecurityHeadersConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigArgs();

    /**
     * The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    @InputImport(name="contentSecurityPolicy")
      private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy;

    public Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> getContentSecurityPolicy() {
        return this.contentSecurityPolicy == null ? Input.empty() : this.contentSecurityPolicy;
    }

    /**
     * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
     * 
     */
    @InputImport(name="contentTypeOptions")
      private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions;

    public Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> getContentTypeOptions() {
        return this.contentTypeOptions == null ? Input.empty() : this.contentTypeOptions;
    }

    /**
     * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
     * 
     */
    @InputImport(name="frameOptions")
      private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions;

    public Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> getFrameOptions() {
        return this.frameOptions == null ? Input.empty() : this.frameOptions;
    }

    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    @InputImport(name="referrerPolicy")
      private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy;

    public Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> getReferrerPolicy() {
        return this.referrerPolicy == null ? Input.empty() : this.referrerPolicy;
    }

    /**
     * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
     * 
     */
    @InputImport(name="strictTransportSecurity")
      private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity;

    public Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> getStrictTransportSecurity() {
        return this.strictTransportSecurity == null ? Input.empty() : this.strictTransportSecurity;
    }

    /**
     * Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
     * 
     */
    @InputImport(name="xssProtection")
      private final @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection;

    public Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> getXssProtection() {
        return this.xssProtection == null ? Input.empty() : this.xssProtection;
    }

    public ResponseHeadersPolicySecurityHeadersConfigArgs(
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity,
        @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.contentTypeOptions = contentTypeOptions;
        this.frameOptions = frameOptions;
        this.referrerPolicy = referrerPolicy;
        this.strictTransportSecurity = strictTransportSecurity;
        this.xssProtection = xssProtection;
    }

    private ResponseHeadersPolicySecurityHeadersConfigArgs() {
        this.contentSecurityPolicy = Input.empty();
        this.contentTypeOptions = Input.empty();
        this.frameOptions = Input.empty();
        this.referrerPolicy = Input.empty();
        this.strictTransportSecurity = Input.empty();
        this.xssProtection = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity;
        private @Nullable Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.contentTypeOptions = defaults.contentTypeOptions;
    	      this.frameOptions = defaults.frameOptions;
    	      this.referrerPolicy = defaults.referrerPolicy;
    	      this.strictTransportSecurity = defaults.strictTransportSecurity;
    	      this.xssProtection = defaults.xssProtection;
        }

        public Builder contentSecurityPolicy(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs> contentSecurityPolicy) {
            this.contentSecurityPolicy = contentSecurityPolicy;
            return this;
        }

        public Builder contentSecurityPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs contentSecurityPolicy) {
            this.contentSecurityPolicy = Input.ofNullable(contentSecurityPolicy);
            return this;
        }

        public Builder contentTypeOptions(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs> contentTypeOptions) {
            this.contentTypeOptions = contentTypeOptions;
            return this;
        }

        public Builder contentTypeOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs contentTypeOptions) {
            this.contentTypeOptions = Input.ofNullable(contentTypeOptions);
            return this;
        }

        public Builder frameOptions(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs> frameOptions) {
            this.frameOptions = frameOptions;
            return this;
        }

        public Builder frameOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs frameOptions) {
            this.frameOptions = Input.ofNullable(frameOptions);
            return this;
        }

        public Builder referrerPolicy(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs> referrerPolicy) {
            this.referrerPolicy = referrerPolicy;
            return this;
        }

        public Builder referrerPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs referrerPolicy) {
            this.referrerPolicy = Input.ofNullable(referrerPolicy);
            return this;
        }

        public Builder strictTransportSecurity(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs> strictTransportSecurity) {
            this.strictTransportSecurity = strictTransportSecurity;
            return this;
        }

        public Builder strictTransportSecurity(@Nullable ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs strictTransportSecurity) {
            this.strictTransportSecurity = Input.ofNullable(strictTransportSecurity);
            return this;
        }

        public Builder xssProtection(@Nullable Input<ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs> xssProtection) {
            this.xssProtection = xssProtection;
            return this;
        }

        public Builder xssProtection(@Nullable ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs xssProtection) {
            this.xssProtection = Input.ofNullable(xssProtection);
            return this;
        }
        public ResponseHeadersPolicySecurityHeadersConfigArgs build() {
            return new ResponseHeadersPolicySecurityHeadersConfigArgs(contentSecurityPolicy, contentTypeOptions, frameOptions, referrerPolicy, strictTransportSecurity, xssProtection);
        }
    }
}
