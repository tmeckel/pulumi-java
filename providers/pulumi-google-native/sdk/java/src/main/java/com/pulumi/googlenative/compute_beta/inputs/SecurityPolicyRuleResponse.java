// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleHttpHeaderActionResponse;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleMatcherResponse;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleRateLimitOptionsResponse;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleRedirectOptionsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a rule that describes one or more match conditions along with the action to be taken when traffic matches this condition (allow or deny).
 * 
 */
public final class SecurityPolicyRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleResponse Empty = new SecurityPolicyRuleResponse();

    /**
     * The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
     */
    @Import(name="action", required=true)
    private String action;

    /**
     * @return The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
     * 
     */
    public String action() {
        return this.action;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * The direction in which this rule applies. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="direction", required=true)
    private String direction;

    /**
     * @return The direction in which this rule applies. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    public String direction() {
        return this.direction;
    }

    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules. This field may only be specified when the versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="enableLogging", required=true)
    private Boolean enableLogging;

    /**
     * @return Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules. This field may only be specified when the versioned_expr is set to FIREWALL.
     * 
     */
    public Boolean enableLogging() {
        return this.enableLogging;
    }

    /**
     * Optional, additional actions that are performed on headers.
     * 
     */
    @Import(name="headerAction", required=true)
    private SecurityPolicyRuleHttpHeaderActionResponse headerAction;

    /**
     * @return Optional, additional actions that are performed on headers.
     * 
     */
    public SecurityPolicyRuleHttpHeaderActionResponse headerAction() {
        return this.headerAction;
    }

    /**
     * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * 
     */
    @Import(name="match", required=true)
    private SecurityPolicyRuleMatcherResponse match;

    /**
     * @return A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * 
     */
    public SecurityPolicyRuleMatcherResponse match() {
        return this.match;
    }

    /**
     * If set to true, the specified action is not enforced.
     * 
     */
    @Import(name="preview", required=true)
    private Boolean preview;

    /**
     * @return If set to true, the specified action is not enforced.
     * 
     */
    public Boolean preview() {
        return this.preview;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
     */
    @Import(name="priority", required=true)
    private Integer priority;

    /**
     * @return An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
     * 
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Must be specified if the action is &#34;rate_based_ban&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * 
     */
    @Import(name="rateLimitOptions", required=true)
    private SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions;

    /**
     * @return Must be specified if the action is &#34;rate_based_ban&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
     * 
     */
    public SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions() {
        return this.rateLimitOptions;
    }

    /**
     * Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
     */
    @Import(name="redirectOptions", required=true)
    private SecurityPolicyRuleRedirectOptionsResponse redirectOptions;

    /**
     * @return Parameters defining the redirect action. Cannot be specified for any other actions.
     * 
     */
    public SecurityPolicyRuleRedirectOptionsResponse redirectOptions() {
        return this.redirectOptions;
    }

    /**
     * Identifier for the rule. This is only unique within the given security policy. This can only be set during rule creation, if rule number is not specified it will be generated by the server.
     * 
     */
    @Import(name="ruleNumber", required=true)
    private String ruleNumber;

    /**
     * @return Identifier for the rule. This is only unique within the given security policy. This can only be set during rule creation, if rule number is not specified it will be generated by the server.
     * 
     */
    public String ruleNumber() {
        return this.ruleNumber;
    }

    /**
     * Calculation of the complexity of a single firewall security policy rule.
     * 
     */
    @Import(name="ruleTupleCount", required=true)
    private Integer ruleTupleCount;

    /**
     * @return Calculation of the complexity of a single firewall security policy rule.
     * 
     */
    public Integer ruleTupleCount() {
        return this.ruleTupleCount;
    }

    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network&#39;s VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="targetResources", required=true)
    private List<String> targetResources;

    /**
     * @return A list of network resource URLs to which this rule applies. This field allows you to control which network&#39;s VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    public List<String> targetResources() {
        return this.targetResources;
    }

    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    @Import(name="targetServiceAccounts", required=true)
    private List<String> targetServiceAccounts;

    /**
     * @return A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    public List<String> targetServiceAccounts() {
        return this.targetServiceAccounts;
    }

    private SecurityPolicyRuleResponse() {}

    private SecurityPolicyRuleResponse(SecurityPolicyRuleResponse $) {
        this.action = $.action;
        this.description = $.description;
        this.direction = $.direction;
        this.enableLogging = $.enableLogging;
        this.headerAction = $.headerAction;
        this.kind = $.kind;
        this.match = $.match;
        this.preview = $.preview;
        this.priority = $.priority;
        this.rateLimitOptions = $.rateLimitOptions;
        this.redirectOptions = $.redirectOptions;
        this.ruleNumber = $.ruleNumber;
        this.ruleTupleCount = $.ruleTupleCount;
        this.targetResources = $.targetResources;
        this.targetServiceAccounts = $.targetServiceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleResponse $;

        public Builder() {
            $ = new SecurityPolicyRuleResponse();
        }

        public Builder(SecurityPolicyRuleResponse defaults) {
            $ = new SecurityPolicyRuleResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The Action to perform when the rule is matched. The following are the valid actions: - allow: allow access to target. - deny(): deny access to target, returns the HTTP response code specified (valid values are 403, 404, and 502). - rate_based_ban: limit client traffic to the configured threshold and ban the client if the traffic exceeds the threshold. Configure parameters for this action in RateLimitOptions. Requires rate_limit_options to be set. - redirect: redirect to a different target. This can either be an internal reCAPTCHA redirect, or an external URL-based redirect via a 302 response. Parameters for this action can be configured via redirectOptions. - throttle: limit client traffic to the configured threshold. Configure parameters for this action in rateLimitOptions. Requires rate_limit_options to be set for this.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            $.action = action;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param direction The direction in which this rule applies. This field may only be specified when versioned_expr is set to FIREWALL.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param enableLogging Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules. This field may only be specified when the versioned_expr is set to FIREWALL.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(Boolean enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        /**
         * @param headerAction Optional, additional actions that are performed on headers.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(SecurityPolicyRuleHttpHeaderActionResponse headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        /**
         * @param kind [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param match A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
         * 
         * @return builder
         * 
         */
        public Builder match(SecurityPolicyRuleMatcherResponse match) {
            $.match = match;
            return this;
        }

        /**
         * @param preview If set to true, the specified action is not enforced.
         * 
         * @return builder
         * 
         */
        public Builder preview(Boolean preview) {
            $.preview = preview;
            return this;
        }

        /**
         * @param priority An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest priority.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param rateLimitOptions Must be specified if the action is &#34;rate_based_ban&#34; or &#34;throttle&#34;. Cannot be specified for any other actions.
         * 
         * @return builder
         * 
         */
        public Builder rateLimitOptions(SecurityPolicyRuleRateLimitOptionsResponse rateLimitOptions) {
            $.rateLimitOptions = rateLimitOptions;
            return this;
        }

        /**
         * @param redirectOptions Parameters defining the redirect action. Cannot be specified for any other actions.
         * 
         * @return builder
         * 
         */
        public Builder redirectOptions(SecurityPolicyRuleRedirectOptionsResponse redirectOptions) {
            $.redirectOptions = redirectOptions;
            return this;
        }

        /**
         * @param ruleNumber Identifier for the rule. This is only unique within the given security policy. This can only be set during rule creation, if rule number is not specified it will be generated by the server.
         * 
         * @return builder
         * 
         */
        public Builder ruleNumber(String ruleNumber) {
            $.ruleNumber = ruleNumber;
            return this;
        }

        /**
         * @param ruleTupleCount Calculation of the complexity of a single firewall security policy rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleTupleCount(Integer ruleTupleCount) {
            $.ruleTupleCount = ruleTupleCount;
            return this;
        }

        /**
         * @param targetResources A list of network resource URLs to which this rule applies. This field allows you to control which network&#39;s VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
         * 
         * @return builder
         * 
         */
        public Builder targetResources(List<String> targetResources) {
            $.targetResources = targetResources;
            return this;
        }

        /**
         * @param targetResources A list of network resource URLs to which this rule applies. This field allows you to control which network&#39;s VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule. This field may only be specified when versioned_expr is set to FIREWALL.
         * 
         * @return builder
         * 
         */
        public Builder targetResources(String... targetResources) {
            return targetResources(List.of(targetResources));
        }

        /**
         * @param targetServiceAccounts A list of service accounts indicating the sets of instances that are applied with this rule.
         * 
         * @return builder
         * 
         */
        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            $.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        /**
         * @param targetServiceAccounts A list of service accounts indicating the sets of instances that are applied with this rule.
         * 
         * @return builder
         * 
         */
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }

        public SecurityPolicyRuleResponse build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.direction = Objects.requireNonNull($.direction, "expected parameter 'direction' to be non-null");
            $.enableLogging = Objects.requireNonNull($.enableLogging, "expected parameter 'enableLogging' to be non-null");
            $.headerAction = Objects.requireNonNull($.headerAction, "expected parameter 'headerAction' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.match = Objects.requireNonNull($.match, "expected parameter 'match' to be non-null");
            $.preview = Objects.requireNonNull($.preview, "expected parameter 'preview' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.rateLimitOptions = Objects.requireNonNull($.rateLimitOptions, "expected parameter 'rateLimitOptions' to be non-null");
            $.redirectOptions = Objects.requireNonNull($.redirectOptions, "expected parameter 'redirectOptions' to be non-null");
            $.ruleNumber = Objects.requireNonNull($.ruleNumber, "expected parameter 'ruleNumber' to be non-null");
            $.ruleTupleCount = Objects.requireNonNull($.ruleTupleCount, "expected parameter 'ruleTupleCount' to be non-null");
            $.targetResources = Objects.requireNonNull($.targetResources, "expected parameter 'targetResources' to be non-null");
            $.targetServiceAccounts = Objects.requireNonNull($.targetServiceAccounts, "expected parameter 'targetServiceAccounts' to be non-null");
            return $;
        }
    }

}
