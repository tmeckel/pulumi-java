// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsGetArgs Empty = new SecurityPolicyRuleRateLimitOptionsGetArgs();

    /**
     * Can only be specified if the `action` for the rule is "rate_based_ban".
     * If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    @InputImport(name="banDurationSec")
      private final @Nullable Input<Integer> banDurationSec;

    public Input<Integer> getBanDurationSec() {
        return this.banDurationSec == null ? Input.empty() : this.banDurationSec;
    }

    /**
     * Can only be specified if the `action` for the rule is "rate_based_ban".
     * If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also
     * exceed this 'ban_threshold'. Structure is documented below.
     * 
     */
    @InputImport(name="banThreshold")
      private final @Nullable Input<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> banThreshold;

    public Input<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> getBanThreshold() {
        return this.banThreshold == null ? Input.empty() : this.banThreshold;
    }

    /**
     * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
     * 
     */
    @InputImport(name="conformAction", required=true)
      private final Input<String> conformAction;

    public Input<String> getConformAction() {
        return this.conformAction;
    }

    /**
     * Determines the key to enforce the rate_limit_threshold on.
     * Possible values incude "ALL", "ALL_IPS", "HTTP_HEADER", "IP", "XFF_IP". If not specified, defaults to "ALL".
     * 
     */
    @InputImport(name="enforceOnKey")
      private final @Nullable Input<String> enforceOnKey;

    public Input<String> getEnforceOnKey() {
        return this.enforceOnKey == null ? Input.empty() : this.enforceOnKey;
    }

    /**
     * Rate limit key name applicable only for HTTP_HEADER key types. Name of the HTTP header whose value is taken as the key value.
     * 
     */
    @InputImport(name="enforceOnKeyName")
      private final @Nullable Input<String> enforceOnKeyName;

    public Input<String> getEnforceOnKeyName() {
        return this.enforceOnKeyName == null ? Input.empty() : this.enforceOnKeyName;
    }

    /**
     * When a request is denied, returns the HTTP response code specified.
     * Valid options are "deny()" where valid values for status are 403, 404, 429, and 502.
     * 
     */
    @InputImport(name="exceedAction", required=true)
      private final Input<String> exceedAction;

    public Input<String> getExceedAction() {
        return this.exceedAction;
    }

    @InputImport(name="exceedRedirectOptions")
      private final @Nullable Input<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> exceedRedirectOptions;

    public Input<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> getExceedRedirectOptions() {
        return this.exceedRedirectOptions == null ? Input.empty() : this.exceedRedirectOptions;
    }

    /**
     * Threshold at which to begin ratelimiting. Structure is documented below.
     * 
     */
    @InputImport(name="rateLimitThreshold", required=true)
      private final Input<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> rateLimitThreshold;

    public Input<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> getRateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    public SecurityPolicyRuleRateLimitOptionsGetArgs(
        @Nullable Input<Integer> banDurationSec,
        @Nullable Input<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> banThreshold,
        Input<String> conformAction,
        @Nullable Input<String> enforceOnKey,
        @Nullable Input<String> enforceOnKeyName,
        Input<String> exceedAction,
        @Nullable Input<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> exceedRedirectOptions,
        Input<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> rateLimitThreshold) {
        this.banDurationSec = banDurationSec;
        this.banThreshold = banThreshold;
        this.conformAction = Objects.requireNonNull(conformAction, "expected parameter 'conformAction' to be non-null");
        this.enforceOnKey = enforceOnKey;
        this.enforceOnKeyName = enforceOnKeyName;
        this.exceedAction = Objects.requireNonNull(exceedAction, "expected parameter 'exceedAction' to be non-null");
        this.exceedRedirectOptions = exceedRedirectOptions;
        this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold, "expected parameter 'rateLimitThreshold' to be non-null");
    }

    private SecurityPolicyRuleRateLimitOptionsGetArgs() {
        this.banDurationSec = Input.empty();
        this.banThreshold = Input.empty();
        this.conformAction = Input.empty();
        this.enforceOnKey = Input.empty();
        this.enforceOnKeyName = Input.empty();
        this.exceedAction = Input.empty();
        this.exceedRedirectOptions = Input.empty();
        this.rateLimitThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> banDurationSec;
        private @Nullable Input<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> banThreshold;
        private Input<String> conformAction;
        private @Nullable Input<String> enforceOnKey;
        private @Nullable Input<String> enforceOnKeyName;
        private Input<String> exceedAction;
        private @Nullable Input<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> exceedRedirectOptions;
        private Input<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> rateLimitThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsGetArgs defaults) {
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

        public Builder banDurationSec(@Nullable Input<Integer> banDurationSec) {
            this.banDurationSec = banDurationSec;
            return this;
        }

        public Builder banDurationSec(@Nullable Integer banDurationSec) {
            this.banDurationSec = Input.ofNullable(banDurationSec);
            return this;
        }

        public Builder banThreshold(@Nullable Input<SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs> banThreshold) {
            this.banThreshold = banThreshold;
            return this;
        }

        public Builder banThreshold(@Nullable SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs banThreshold) {
            this.banThreshold = Input.ofNullable(banThreshold);
            return this;
        }

        public Builder conformAction(Input<String> conformAction) {
            this.conformAction = Objects.requireNonNull(conformAction);
            return this;
        }

        public Builder conformAction(String conformAction) {
            this.conformAction = Input.of(Objects.requireNonNull(conformAction));
            return this;
        }

        public Builder enforceOnKey(@Nullable Input<String> enforceOnKey) {
            this.enforceOnKey = enforceOnKey;
            return this;
        }

        public Builder enforceOnKey(@Nullable String enforceOnKey) {
            this.enforceOnKey = Input.ofNullable(enforceOnKey);
            return this;
        }

        public Builder enforceOnKeyName(@Nullable Input<String> enforceOnKeyName) {
            this.enforceOnKeyName = enforceOnKeyName;
            return this;
        }

        public Builder enforceOnKeyName(@Nullable String enforceOnKeyName) {
            this.enforceOnKeyName = Input.ofNullable(enforceOnKeyName);
            return this;
        }

        public Builder exceedAction(Input<String> exceedAction) {
            this.exceedAction = Objects.requireNonNull(exceedAction);
            return this;
        }

        public Builder exceedAction(String exceedAction) {
            this.exceedAction = Input.of(Objects.requireNonNull(exceedAction));
            return this;
        }

        public Builder exceedRedirectOptions(@Nullable Input<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs> exceedRedirectOptions) {
            this.exceedRedirectOptions = exceedRedirectOptions;
            return this;
        }

        public Builder exceedRedirectOptions(@Nullable SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs exceedRedirectOptions) {
            this.exceedRedirectOptions = Input.ofNullable(exceedRedirectOptions);
            return this;
        }

        public Builder rateLimitThreshold(Input<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs> rateLimitThreshold) {
            this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
            return this;
        }

        public Builder rateLimitThreshold(SecurityPolicyRuleRateLimitOptionsRateLimitThresholdGetArgs rateLimitThreshold) {
            this.rateLimitThreshold = Input.of(Objects.requireNonNull(rateLimitThreshold));
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsGetArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsGetArgs(banDurationSec, banThreshold, conformAction, enforceOnKey, enforceOnKeyName, exceedAction, exceedRedirectOptions, rateLimitThreshold);
        }
    }
}
