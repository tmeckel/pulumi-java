// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines top-level WebApplicationFirewallPolicy configuration settings.
 * 
 */
public final class FrontDoorPolicySettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final FrontDoorPolicySettingsResponse Empty = new FrontDoorPolicySettingsResponse();

    /**
     * If the action type is block, customer can override the response body. The body must be specified in base64 encoding.
     * 
     */
    @Import(name="customBlockResponseBody")
    private @Nullable String customBlockResponseBody;

    /**
     * @return If the action type is block, customer can override the response body. The body must be specified in base64 encoding.
     * 
     */
    public Optional<String> customBlockResponseBody() {
        return Optional.ofNullable(this.customBlockResponseBody);
    }

    /**
     * If the action type is block, customer can override the response status code.
     * 
     */
    @Import(name="customBlockResponseStatusCode")
    private @Nullable Integer customBlockResponseStatusCode;

    /**
     * @return If the action type is block, customer can override the response status code.
     * 
     */
    public Optional<Integer> customBlockResponseStatusCode() {
        return Optional.ofNullable(this.customBlockResponseStatusCode);
    }

    /**
     * Describes if the policy is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    @Import(name="enabledState")
    private @Nullable String enabledState;

    /**
     * @return Describes if the policy is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    public Optional<String> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }

    /**
     * Describes if it is in detection mode or prevention mode at policy level.
     * 
     */
    @Import(name="mode")
    private @Nullable String mode;

    /**
     * @return Describes if it is in detection mode or prevention mode at policy level.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * If action type is redirect, this field represents redirect URL for the client.
     * 
     */
    @Import(name="redirectUrl")
    private @Nullable String redirectUrl;

    /**
     * @return If action type is redirect, this field represents redirect URL for the client.
     * 
     */
    public Optional<String> redirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }

    /**
     * Describes if policy managed rules will inspect the request body content.
     * 
     */
    @Import(name="requestBodyCheck")
    private @Nullable String requestBodyCheck;

    /**
     * @return Describes if policy managed rules will inspect the request body content.
     * 
     */
    public Optional<String> requestBodyCheck() {
        return Optional.ofNullable(this.requestBodyCheck);
    }

    private FrontDoorPolicySettingsResponse() {}

    private FrontDoorPolicySettingsResponse(FrontDoorPolicySettingsResponse $) {
        this.customBlockResponseBody = $.customBlockResponseBody;
        this.customBlockResponseStatusCode = $.customBlockResponseStatusCode;
        this.enabledState = $.enabledState;
        this.mode = $.mode;
        this.redirectUrl = $.redirectUrl;
        this.requestBodyCheck = $.requestBodyCheck;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontDoorPolicySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontDoorPolicySettingsResponse $;

        public Builder() {
            $ = new FrontDoorPolicySettingsResponse();
        }

        public Builder(FrontDoorPolicySettingsResponse defaults) {
            $ = new FrontDoorPolicySettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param customBlockResponseBody If the action type is block, customer can override the response body. The body must be specified in base64 encoding.
         * 
         * @return builder
         * 
         */
        public Builder customBlockResponseBody(@Nullable String customBlockResponseBody) {
            $.customBlockResponseBody = customBlockResponseBody;
            return this;
        }

        /**
         * @param customBlockResponseStatusCode If the action type is block, customer can override the response status code.
         * 
         * @return builder
         * 
         */
        public Builder customBlockResponseStatusCode(@Nullable Integer customBlockResponseStatusCode) {
            $.customBlockResponseStatusCode = customBlockResponseStatusCode;
            return this;
        }

        /**
         * @param enabledState Describes if the policy is in enabled or disabled state. Defaults to Enabled if not specified.
         * 
         * @return builder
         * 
         */
        public Builder enabledState(@Nullable String enabledState) {
            $.enabledState = enabledState;
            return this;
        }

        /**
         * @param mode Describes if it is in detection mode or prevention mode at policy level.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable String mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param redirectUrl If action type is redirect, this field represents redirect URL for the client.
         * 
         * @return builder
         * 
         */
        public Builder redirectUrl(@Nullable String redirectUrl) {
            $.redirectUrl = redirectUrl;
            return this;
        }

        /**
         * @param requestBodyCheck Describes if policy managed rules will inspect the request body content.
         * 
         * @return builder
         * 
         */
        public Builder requestBodyCheck(@Nullable String requestBodyCheck) {
            $.requestBodyCheck = requestBodyCheck;
            return this;
        }

        public FrontDoorPolicySettingsResponse build() {
            return $;
        }
    }

}
