// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRateLimitOptionsThresholdResponse;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRedirectOptionsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyRuleRateLimitOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleRateLimitOptionsResponse Empty = new SecurityPolicyRuleRateLimitOptionsResponse();

    /**
     * Can only be specified if the action for the rule is "rate_based_ban". If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    @InputImport(name="banDurationSec", required=true)
    private final Integer banDurationSec;

    public Integer getBanDurationSec() {
        return this.banDurationSec;
    }

    /**
     * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also exceed this 'ban_threshold'.
     * 
     */
    @InputImport(name="banThreshold", required=true)
    private final SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold;

    public SecurityPolicyRuleRateLimitOptionsThresholdResponse getBanThreshold() {
        return this.banThreshold;
    }

    /**
     * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
     * 
     */
    @InputImport(name="conformAction", required=true)
    private final String conformAction;

    public String getConformAction() {
        return this.conformAction;
    }

    /**
     * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field 'enforce_on_key' is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under "enforce_on_key_name". The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key type defaults to ALL. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under "enforce_on_key_name". The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    @InputImport(name="enforceOnKey", required=true)
    private final String enforceOnKey;

    public String getEnforceOnKey() {
        return this.enforceOnKey;
    }

    /**
     * Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    @InputImport(name="enforceOnKeyName", required=true)
    private final String enforceOnKeyName;

    public String getEnforceOnKeyName() {
        return this.enforceOnKeyName;
    }

    /**
     * Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are "deny()" where valid values for status are 403, 404, 429, and 502, and "redirect" where the redirect parameters come from exceed_redirect_options below.
     * 
     */
    @InputImport(name="exceedAction", required=true)
    private final String exceedAction;

    public String getExceedAction() {
        return this.exceedAction;
    }

    /**
     * Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
     * 
     */
    @InputImport(name="exceedRedirectOptions", required=true)
    private final SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions;

    public SecurityPolicyRuleRedirectOptionsResponse getExceedRedirectOptions() {
        return this.exceedRedirectOptions;
    }

    /**
     * Threshold at which to begin ratelimiting.
     * 
     */
    @InputImport(name="rateLimitThreshold", required=true)
    private final SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold;

    public SecurityPolicyRuleRateLimitOptionsThresholdResponse getRateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    public SecurityPolicyRuleRateLimitOptionsResponse(
        Integer banDurationSec,
        SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold,
        String conformAction,
        String enforceOnKey,
        String enforceOnKeyName,
        String exceedAction,
        SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions,
        SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold) {
        this.banDurationSec = Objects.requireNonNull(banDurationSec, "expected parameter 'banDurationSec' to be non-null");
        this.banThreshold = Objects.requireNonNull(banThreshold, "expected parameter 'banThreshold' to be non-null");
        this.conformAction = Objects.requireNonNull(conformAction, "expected parameter 'conformAction' to be non-null");
        this.enforceOnKey = Objects.requireNonNull(enforceOnKey, "expected parameter 'enforceOnKey' to be non-null");
        this.enforceOnKeyName = Objects.requireNonNull(enforceOnKeyName, "expected parameter 'enforceOnKeyName' to be non-null");
        this.exceedAction = Objects.requireNonNull(exceedAction, "expected parameter 'exceedAction' to be non-null");
        this.exceedRedirectOptions = Objects.requireNonNull(exceedRedirectOptions, "expected parameter 'exceedRedirectOptions' to be non-null");
        this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold, "expected parameter 'rateLimitThreshold' to be non-null");
    }

    private SecurityPolicyRuleRateLimitOptionsResponse() {
        this.banDurationSec = null;
        this.banThreshold = null;
        this.conformAction = null;
        this.enforceOnKey = null;
        this.enforceOnKeyName = null;
        this.exceedAction = null;
        this.exceedRedirectOptions = null;
        this.rateLimitThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer banDurationSec;
        private SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold;
        private String conformAction;
        private String enforceOnKey;
        private String enforceOnKeyName;
        private String exceedAction;
        private SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions;
        private SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.banDurationSec = defaults.banDurationSec;
    	      this.banThreshold = defaults.banThreshold;
    	      this.conformAction = defaults.conformAction;
    	      this.enforceOnKey = defaults.enforceOnKey;
    	      this.enforceOnKeyName = defaults.enforceOnKeyName;
    	      this.exceedAction = defaults.exceedAction;
    	      this.exceedRedirectOptions = defaults.exceedRedirectOptions;
    	      this.rateLimitThreshold = defaults.rateLimitThreshold;
        }

        public Builder setBanDurationSec(Integer banDurationSec) {
            this.banDurationSec = Objects.requireNonNull(banDurationSec);
            return this;
        }

        public Builder setBanThreshold(SecurityPolicyRuleRateLimitOptionsThresholdResponse banThreshold) {
            this.banThreshold = Objects.requireNonNull(banThreshold);
            return this;
        }

        public Builder setConformAction(String conformAction) {
            this.conformAction = Objects.requireNonNull(conformAction);
            return this;
        }

        public Builder setEnforceOnKey(String enforceOnKey) {
            this.enforceOnKey = Objects.requireNonNull(enforceOnKey);
            return this;
        }

        public Builder setEnforceOnKeyName(String enforceOnKeyName) {
            this.enforceOnKeyName = Objects.requireNonNull(enforceOnKeyName);
            return this;
        }

        public Builder setExceedAction(String exceedAction) {
            this.exceedAction = Objects.requireNonNull(exceedAction);
            return this;
        }

        public Builder setExceedRedirectOptions(SecurityPolicyRuleRedirectOptionsResponse exceedRedirectOptions) {
            this.exceedRedirectOptions = Objects.requireNonNull(exceedRedirectOptions);
            return this;
        }

        public Builder setRateLimitThreshold(SecurityPolicyRuleRateLimitOptionsThresholdResponse rateLimitThreshold) {
            this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
            return this;
        }

        public SecurityPolicyRuleRateLimitOptionsResponse build() {
            return new SecurityPolicyRuleRateLimitOptionsResponse(banDurationSec, banThreshold, conformAction, enforceOnKey, enforceOnKeyName, exceedAction, exceedRedirectOptions, rateLimitThreshold);
        }
    }
}
