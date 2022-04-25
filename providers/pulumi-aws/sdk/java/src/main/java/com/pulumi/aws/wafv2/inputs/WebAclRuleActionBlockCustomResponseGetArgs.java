// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleActionBlockCustomResponseGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionBlockCustomResponseGetArgs Empty = new WebAclRuleActionBlockCustomResponseGetArgs();

    /**
     * References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    @Import(name="customResponseBodyKey")
    private @Nullable Output<String> customResponseBodyKey;

    /**
     * @return References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    public Optional<Output<String>> customResponseBodyKey() {
        return Optional.ofNullable(this.customResponseBodyKey);
    }

    /**
     * The HTTP status code to return to the client.
     * 
     */
    @Import(name="responseCode", required=true)
    private Output<Integer> responseCode;

    /**
     * @return The HTTP status code to return to the client.
     * 
     */
    public Output<Integer> responseCode() {
        return this.responseCode;
    }

    /**
     * The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="responseHeaders")
    private @Nullable Output<List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders;

    /**
     * @return The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    public Optional<Output<List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs>>> responseHeaders() {
        return Optional.ofNullable(this.responseHeaders);
    }

    private WebAclRuleActionBlockCustomResponseGetArgs() {}

    private WebAclRuleActionBlockCustomResponseGetArgs(WebAclRuleActionBlockCustomResponseGetArgs $) {
        this.customResponseBodyKey = $.customResponseBodyKey;
        this.responseCode = $.responseCode;
        this.responseHeaders = $.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleActionBlockCustomResponseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleActionBlockCustomResponseGetArgs $;

        public Builder() {
            $ = new WebAclRuleActionBlockCustomResponseGetArgs();
        }

        public Builder(WebAclRuleActionBlockCustomResponseGetArgs defaults) {
            $ = new WebAclRuleActionBlockCustomResponseGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customResponseBodyKey References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
         * 
         * @return builder
         * 
         */
        public Builder customResponseBodyKey(@Nullable Output<String> customResponseBodyKey) {
            $.customResponseBodyKey = customResponseBodyKey;
            return this;
        }

        /**
         * @param customResponseBodyKey References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
         * 
         * @return builder
         * 
         */
        public Builder customResponseBodyKey(String customResponseBodyKey) {
            return customResponseBodyKey(Output.of(customResponseBodyKey));
        }

        /**
         * @param responseCode The HTTP status code to return to the client.
         * 
         * @return builder
         * 
         */
        public Builder responseCode(Output<Integer> responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        /**
         * @param responseCode The HTTP status code to return to the client.
         * 
         * @return builder
         * 
         */
        public Builder responseCode(Integer responseCode) {
            return responseCode(Output.of(responseCode));
        }

        /**
         * @param responseHeaders The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaders(@Nullable Output<List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders) {
            $.responseHeaders = responseHeaders;
            return this;
        }

        /**
         * @param responseHeaders The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaders(List<WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs> responseHeaders) {
            return responseHeaders(Output.of(responseHeaders));
        }

        /**
         * @param responseHeaders The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder responseHeaders(WebAclRuleActionBlockCustomResponseResponseHeaderGetArgs... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }

        public WebAclRuleActionBlockCustomResponseGetArgs build() {
            $.responseCode = Objects.requireNonNull($.responseCode, "expected parameter 'responseCode' to be non-null");
            return $;
        }
    }

}
