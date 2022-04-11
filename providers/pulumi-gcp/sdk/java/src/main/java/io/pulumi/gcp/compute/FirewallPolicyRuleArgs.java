// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleArgs Empty = new FirewallPolicyRuleArgs();

    /**
     * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
     * 
     */
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> getAction() {
        return this.action;
    }

    /**
     * An optional description for this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The direction in which this rule applies. Possible values: INGRESS, EGRESS
     * 
     */
    @Import(name="direction", required=true)
      private final Output<String> direction;

    public Output<String> getDirection() {
        return this.direction;
    }

    /**
     * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
     * 
     */
    @Import(name="enableLogging")
      private final @Nullable Output<Boolean> enableLogging;

    public Output<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Codegen.empty() : this.enableLogging;
    }

    /**
     * The firewall policy of the resource.
     * 
     */
    @Import(name="firewallPolicy", required=true)
      private final Output<String> firewallPolicy;

    public Output<String> getFirewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced. Structure is documented below.
     * 
     */
    @Import(name="match", required=true)
      private final Output<FirewallPolicyRuleMatchArgs> match;

    public Output<FirewallPolicyRuleMatchArgs> getMatch() {
        return this.match;
    }

    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    /**
     * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
     * 
     */
    @Import(name="targetResources")
      private final @Nullable Output<List<String>> targetResources;

    public Output<List<String>> getTargetResources() {
        return this.targetResources == null ? Codegen.empty() : this.targetResources;
    }

    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    @Import(name="targetServiceAccounts")
      private final @Nullable Output<List<String>> targetServiceAccounts;

    public Output<List<String>> getTargetServiceAccounts() {
        return this.targetServiceAccounts == null ? Codegen.empty() : this.targetServiceAccounts;
    }

    public FirewallPolicyRuleArgs(
        Output<String> action,
        @Nullable Output<String> description,
        Output<String> direction,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<Boolean> enableLogging,
        Output<String> firewallPolicy,
        Output<FirewallPolicyRuleMatchArgs> match,
        Output<Integer> priority,
        @Nullable Output<List<String>> targetResources,
        @Nullable Output<List<String>> targetServiceAccounts) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.description = description;
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.disabled = disabled;
        this.enableLogging = enableLogging;
        this.firewallPolicy = Objects.requireNonNull(firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.targetResources = targetResources;
        this.targetServiceAccounts = targetServiceAccounts;
    }

    private FirewallPolicyRuleArgs() {
        this.action = Codegen.empty();
        this.description = Codegen.empty();
        this.direction = Codegen.empty();
        this.disabled = Codegen.empty();
        this.enableLogging = Codegen.empty();
        this.firewallPolicy = Codegen.empty();
        this.match = Codegen.empty();
        this.priority = Codegen.empty();
        this.targetResources = Codegen.empty();
        this.targetServiceAccounts = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private @Nullable Output<String> description;
        private Output<String> direction;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<Boolean> enableLogging;
        private Output<String> firewallPolicy;
        private Output<FirewallPolicyRuleMatchArgs> match;
        private Output<Integer> priority;
        private @Nullable Output<List<String>> targetResources;
        private @Nullable Output<List<String>> targetServiceAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.enableLogging = defaults.enableLogging;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.match = defaults.match;
    	      this.priority = defaults.priority;
    	      this.targetResources = defaults.targetResources;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
        }

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder direction(Output<String> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder direction(String direction) {
            this.direction = Output.of(Objects.requireNonNull(direction));
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }
        public Builder enableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Codegen.ofNullable(enableLogging);
            return this;
        }
        public Builder firewallPolicy(Output<String> firewallPolicy) {
            this.firewallPolicy = Objects.requireNonNull(firewallPolicy);
            return this;
        }
        public Builder firewallPolicy(String firewallPolicy) {
            this.firewallPolicy = Output.of(Objects.requireNonNull(firewallPolicy));
            return this;
        }
        public Builder match(Output<FirewallPolicyRuleMatchArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder match(FirewallPolicyRuleMatchArgs match) {
            this.match = Output.of(Objects.requireNonNull(match));
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder targetResources(@Nullable Output<List<String>> targetResources) {
            this.targetResources = targetResources;
            return this;
        }
        public Builder targetResources(@Nullable List<String> targetResources) {
            this.targetResources = Codegen.ofNullable(targetResources);
            return this;
        }
        public Builder targetResources(String... targetResources) {
            return targetResources(List.of(targetResources));
        }
        public Builder targetServiceAccounts(@Nullable Output<List<String>> targetServiceAccounts) {
            this.targetServiceAccounts = targetServiceAccounts;
            return this;
        }
        public Builder targetServiceAccounts(@Nullable List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Codegen.ofNullable(targetServiceAccounts);
            return this;
        }
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }        public FirewallPolicyRuleArgs build() {
            return new FirewallPolicyRuleArgs(action, description, direction, disabled, enableLogging, firewallPolicy, match, priority, targetResources, targetServiceAccounts);
        }
    }
}
