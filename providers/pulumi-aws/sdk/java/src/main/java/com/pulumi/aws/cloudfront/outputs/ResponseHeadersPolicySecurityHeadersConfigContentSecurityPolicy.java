// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy {
    /**
     * @return The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    private final String contentSecurityPolicy;
    /**
     * @return A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private final Boolean override;

    @CustomType.Constructor
    private ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy(
        @CustomType.Parameter("contentSecurityPolicy") String contentSecurityPolicy,
        @CustomType.Parameter("override") Boolean override) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.override = override;
    }

    /**
     * @return The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    public String contentSecurityPolicy() {
        return this.contentSecurityPolicy;
    }
    /**
     * @return A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Boolean override() {
        return this.override;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentSecurityPolicy;
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.override = defaults.override;
        }

        public Builder contentSecurityPolicy(String contentSecurityPolicy) {
            this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy);
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }        public ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy build() {
            return new ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy(contentSecurityPolicy, override);
        }
    }
}
