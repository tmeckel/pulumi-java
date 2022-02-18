// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleHttpHeaderActionArgs;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleMatcherArgs;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRateLimitOptionsArgs;
import io.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleRedirectOptionsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a rule that describes one or more match conditions along with the action to be taken when traffic matches this condition (allow or deny).
 * 
 */
public final class SecurityPolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleArgs Empty = new SecurityPolicyRuleArgs();

    /**
     * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
     */
    @InputImport(name="action")
    private final @Nullable Input<String> action;

    public Input<String> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional, additional actions that are performed on headers.
     * 
     */
    @InputImport(name="headerAction")
    private final @Nullable Input<SecurityPolicyRuleHttpHeaderActionArgs> headerAction;

    public Input<SecurityPolicyRuleHttpHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
     * 
     */
    @InputImport(name="match")
    private final @Nullable Input<SecurityPolicyRuleMatcherArgs> match;

    public Input<SecurityPolicyRuleMatcherArgs> getMatch() {
        return this.match == null ? Input.empty() : this.match;
    }

    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    @InputImport(name="preview")
    private final @Nullable Input<Boolean> preview;

    public Input<Boolean> getPreview() {
        return this.preview == null ? Input.empty() : this.preview;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * Must be specified if the action is "rate_based_ban" or "throttle". Cannot be specified for any other actions.
     * 
     */
    @InputImport(name="rateLimitOptions")
    private final @Nullable Input<SecurityPolicyRuleRateLimitOptionsArgs> rateLimitOptions;

    public Input<SecurityPolicyRuleRateLimitOptionsArgs> getRateLimitOptions() {
        return this.rateLimitOptions == null ? Input.empty() : this.rateLimitOptions;
    }

    /**
     * Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
     */
    @InputImport(name="redirectOptions")
    private final @Nullable Input<SecurityPolicyRuleRedirectOptionsArgs> redirectOptions;

    public Input<SecurityPolicyRuleRedirectOptionsArgs> getRedirectOptions() {
        return this.redirectOptions == null ? Input.empty() : this.redirectOptions;
    }

    public SecurityPolicyRuleArgs(
        @Nullable Input<String> action,
        @Nullable Input<String> description,
        @Nullable Input<SecurityPolicyRuleHttpHeaderActionArgs> headerAction,
        @Nullable Input<SecurityPolicyRuleMatcherArgs> match,
        @Nullable Input<Boolean> preview,
        @Nullable Input<Integer> priority,
        @Nullable Input<SecurityPolicyRuleRateLimitOptionsArgs> rateLimitOptions,
        @Nullable Input<SecurityPolicyRuleRedirectOptionsArgs> redirectOptions) {
        this.action = action;
        this.description = description;
        this.headerAction = headerAction;
        this.match = match;
        this.preview = preview;
        this.priority = priority;
        this.rateLimitOptions = rateLimitOptions;
        this.redirectOptions = redirectOptions;
    }

    private SecurityPolicyRuleArgs() {
        this.action = Input.empty();
        this.description = Input.empty();
        this.headerAction = Input.empty();
        this.match = Input.empty();
        this.preview = Input.empty();
        this.priority = Input.empty();
        this.rateLimitOptions = Input.empty();
        this.redirectOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> action;
        private @Nullable Input<String> description;
        private @Nullable Input<SecurityPolicyRuleHttpHeaderActionArgs> headerAction;
        private @Nullable Input<SecurityPolicyRuleMatcherArgs> match;
        private @Nullable Input<Boolean> preview;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<SecurityPolicyRuleRateLimitOptionsArgs> rateLimitOptions;
        private @Nullable Input<SecurityPolicyRuleRedirectOptionsArgs> redirectOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.match = defaults.match;
    	      this.preview = defaults.preview;
    	      this.priority = defaults.priority;
    	      this.rateLimitOptions = defaults.rateLimitOptions;
    	      this.redirectOptions = defaults.redirectOptions;
        }

        public Builder setAction(@Nullable Input<String> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable String action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHeaderAction(@Nullable Input<SecurityPolicyRuleHttpHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable SecurityPolicyRuleHttpHeaderActionArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder setMatch(@Nullable Input<SecurityPolicyRuleMatcherArgs> match) {
            this.match = match;
            return this;
        }

        public Builder setMatch(@Nullable SecurityPolicyRuleMatcherArgs match) {
            this.match = Input.ofNullable(match);
            return this;
        }

        public Builder setPreview(@Nullable Input<Boolean> preview) {
            this.preview = preview;
            return this;
        }

        public Builder setPreview(@Nullable Boolean preview) {
            this.preview = Input.ofNullable(preview);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setRateLimitOptions(@Nullable Input<SecurityPolicyRuleRateLimitOptionsArgs> rateLimitOptions) {
            this.rateLimitOptions = rateLimitOptions;
            return this;
        }

        public Builder setRateLimitOptions(@Nullable SecurityPolicyRuleRateLimitOptionsArgs rateLimitOptions) {
            this.rateLimitOptions = Input.ofNullable(rateLimitOptions);
            return this;
        }

        public Builder setRedirectOptions(@Nullable Input<SecurityPolicyRuleRedirectOptionsArgs> redirectOptions) {
            this.redirectOptions = redirectOptions;
            return this;
        }

        public Builder setRedirectOptions(@Nullable SecurityPolicyRuleRedirectOptionsArgs redirectOptions) {
            this.redirectOptions = Input.ofNullable(redirectOptions);
            return this;
        }

        public SecurityPolicyRuleArgs build() {
            return new SecurityPolicyRuleArgs(action, description, headerAction, match, preview, priority, rateLimitOptions, redirectOptions);
        }
    }
}
