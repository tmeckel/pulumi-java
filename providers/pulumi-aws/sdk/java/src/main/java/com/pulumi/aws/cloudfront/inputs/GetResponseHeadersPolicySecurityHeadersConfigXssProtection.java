// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetResponseHeadersPolicySecurityHeadersConfigXssProtection extends com.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicySecurityHeadersConfigXssProtection Empty = new GetResponseHeadersPolicySecurityHeadersConfigXssProtection();

    /**
     * A Boolean value that determines whether CloudFront includes the mode=block directive in the X-XSS-Protection header.
     * 
     */
    @Import(name="modeBlock", required=true)
    private Boolean modeBlock;

    /**
     * @return A Boolean value that determines whether CloudFront includes the mode=block directive in the X-XSS-Protection header.
     * 
     */
    public Boolean modeBlock() {
        return this.modeBlock;
    }

    /**
     * A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
    private Boolean override;

    /**
     * @return A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Boolean override() {
        return this.override;
    }

    /**
     * A Boolean value that determines the value of the X-XSS-Protection HTTP response header. When this setting is true, the value of the X-XSS-Protection header is 1. When this setting is false, the value of the X-XSS-Protection header is 0.
     * 
     */
    @Import(name="protection", required=true)
    private Boolean protection;

    /**
     * @return A Boolean value that determines the value of the X-XSS-Protection HTTP response header. When this setting is true, the value of the X-XSS-Protection header is 1. When this setting is false, the value of the X-XSS-Protection header is 0.
     * 
     */
    public Boolean protection() {
        return this.protection;
    }

    /**
     * A Boolean value that determines whether CloudFront sets a reporting URI in the X-XSS-Protection header.
     * 
     */
    @Import(name="reportUri", required=true)
    private String reportUri;

    /**
     * @return A Boolean value that determines whether CloudFront sets a reporting URI in the X-XSS-Protection header.
     * 
     */
    public String reportUri() {
        return this.reportUri;
    }

    private GetResponseHeadersPolicySecurityHeadersConfigXssProtection() {}

    private GetResponseHeadersPolicySecurityHeadersConfigXssProtection(GetResponseHeadersPolicySecurityHeadersConfigXssProtection $) {
        this.modeBlock = $.modeBlock;
        this.override = $.override;
        this.protection = $.protection;
        this.reportUri = $.reportUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigXssProtection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResponseHeadersPolicySecurityHeadersConfigXssProtection $;

        public Builder() {
            $ = new GetResponseHeadersPolicySecurityHeadersConfigXssProtection();
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfigXssProtection defaults) {
            $ = new GetResponseHeadersPolicySecurityHeadersConfigXssProtection(Objects.requireNonNull(defaults));
        }

        /**
         * @param modeBlock A Boolean value that determines whether CloudFront includes the mode=block directive in the X-XSS-Protection header.
         * 
         * @return builder
         * 
         */
        public Builder modeBlock(Boolean modeBlock) {
            $.modeBlock = modeBlock;
            return this;
        }

        /**
         * @param override A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder override(Boolean override) {
            $.override = override;
            return this;
        }

        /**
         * @param protection A Boolean value that determines the value of the X-XSS-Protection HTTP response header. When this setting is true, the value of the X-XSS-Protection header is 1. When this setting is false, the value of the X-XSS-Protection header is 0.
         * 
         * @return builder
         * 
         */
        public Builder protection(Boolean protection) {
            $.protection = protection;
            return this;
        }

        /**
         * @param reportUri A Boolean value that determines whether CloudFront sets a reporting URI in the X-XSS-Protection header.
         * 
         * @return builder
         * 
         */
        public Builder reportUri(String reportUri) {
            $.reportUri = reportUri;
            return this;
        }

        public GetResponseHeadersPolicySecurityHeadersConfigXssProtection build() {
            $.modeBlock = Objects.requireNonNull($.modeBlock, "expected parameter 'modeBlock' to be non-null");
            $.override = Objects.requireNonNull($.override, "expected parameter 'override' to be non-null");
            $.protection = Objects.requireNonNull($.protection, "expected parameter 'protection' to be non-null");
            $.reportUri = Objects.requireNonNull($.reportUri, "expected parameter 'reportUri' to be non-null");
            return $;
        }
    }

}
