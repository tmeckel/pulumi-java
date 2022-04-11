// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.inputs;

import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupFirewallRuleAction;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupFirewallRuleBlockOverrideDnsType;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupFirewallRuleBlockResponse;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Firewall Rule associating the Rule Group to a Domain List
 * 
 */
public final class FirewallRuleGroupFirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleGroupFirewallRuleArgs Empty = new FirewallRuleGroupFirewallRuleArgs();

    /**
     * Rule Action
     * 
     */
    @Import(name="action", required=true)
      private final Output<FirewallRuleGroupFirewallRuleAction> action;

    public Output<FirewallRuleGroupFirewallRuleAction> getAction() {
        return this.action;
    }

    /**
     * BlockOverrideDnsType
     * 
     */
    @Import(name="blockOverrideDnsType")
      private final @Nullable Output<FirewallRuleGroupFirewallRuleBlockOverrideDnsType> blockOverrideDnsType;

    public Output<FirewallRuleGroupFirewallRuleBlockOverrideDnsType> getBlockOverrideDnsType() {
        return this.blockOverrideDnsType == null ? Codegen.empty() : this.blockOverrideDnsType;
    }

    /**
     * BlockOverrideDomain
     * 
     */
    @Import(name="blockOverrideDomain")
      private final @Nullable Output<String> blockOverrideDomain;

    public Output<String> getBlockOverrideDomain() {
        return this.blockOverrideDomain == null ? Codegen.empty() : this.blockOverrideDomain;
    }

    /**
     * BlockOverrideTtl
     * 
     */
    @Import(name="blockOverrideTtl")
      private final @Nullable Output<Integer> blockOverrideTtl;

    public Output<Integer> getBlockOverrideTtl() {
        return this.blockOverrideTtl == null ? Codegen.empty() : this.blockOverrideTtl;
    }

    /**
     * BlockResponse
     * 
     */
    @Import(name="blockResponse")
      private final @Nullable Output<FirewallRuleGroupFirewallRuleBlockResponse> blockResponse;

    public Output<FirewallRuleGroupFirewallRuleBlockResponse> getBlockResponse() {
        return this.blockResponse == null ? Codegen.empty() : this.blockResponse;
    }

    /**
     * ResourceId
     * 
     */
    @Import(name="firewallDomainListId", required=true)
      private final Output<String> firewallDomainListId;

    public Output<String> getFirewallDomainListId() {
        return this.firewallDomainListId;
    }

    /**
     * Rule Priority
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    public FirewallRuleGroupFirewallRuleArgs(
        Output<FirewallRuleGroupFirewallRuleAction> action,
        @Nullable Output<FirewallRuleGroupFirewallRuleBlockOverrideDnsType> blockOverrideDnsType,
        @Nullable Output<String> blockOverrideDomain,
        @Nullable Output<Integer> blockOverrideTtl,
        @Nullable Output<FirewallRuleGroupFirewallRuleBlockResponse> blockResponse,
        Output<String> firewallDomainListId,
        Output<Integer> priority) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.blockOverrideDnsType = blockOverrideDnsType;
        this.blockOverrideDomain = blockOverrideDomain;
        this.blockOverrideTtl = blockOverrideTtl;
        this.blockResponse = blockResponse;
        this.firewallDomainListId = Objects.requireNonNull(firewallDomainListId, "expected parameter 'firewallDomainListId' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private FirewallRuleGroupFirewallRuleArgs() {
        this.action = Codegen.empty();
        this.blockOverrideDnsType = Codegen.empty();
        this.blockOverrideDomain = Codegen.empty();
        this.blockOverrideTtl = Codegen.empty();
        this.blockResponse = Codegen.empty();
        this.firewallDomainListId = Codegen.empty();
        this.priority = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleGroupFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FirewallRuleGroupFirewallRuleAction> action;
        private @Nullable Output<FirewallRuleGroupFirewallRuleBlockOverrideDnsType> blockOverrideDnsType;
        private @Nullable Output<String> blockOverrideDomain;
        private @Nullable Output<Integer> blockOverrideTtl;
        private @Nullable Output<FirewallRuleGroupFirewallRuleBlockResponse> blockResponse;
        private Output<String> firewallDomainListId;
        private Output<Integer> priority;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleGroupFirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.blockOverrideDnsType = defaults.blockOverrideDnsType;
    	      this.blockOverrideDomain = defaults.blockOverrideDomain;
    	      this.blockOverrideTtl = defaults.blockOverrideTtl;
    	      this.blockResponse = defaults.blockResponse;
    	      this.firewallDomainListId = defaults.firewallDomainListId;
    	      this.priority = defaults.priority;
        }

        public Builder action(Output<FirewallRuleGroupFirewallRuleAction> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(FirewallRuleGroupFirewallRuleAction action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder blockOverrideDnsType(@Nullable Output<FirewallRuleGroupFirewallRuleBlockOverrideDnsType> blockOverrideDnsType) {
            this.blockOverrideDnsType = blockOverrideDnsType;
            return this;
        }
        public Builder blockOverrideDnsType(@Nullable FirewallRuleGroupFirewallRuleBlockOverrideDnsType blockOverrideDnsType) {
            this.blockOverrideDnsType = Codegen.ofNullable(blockOverrideDnsType);
            return this;
        }
        public Builder blockOverrideDomain(@Nullable Output<String> blockOverrideDomain) {
            this.blockOverrideDomain = blockOverrideDomain;
            return this;
        }
        public Builder blockOverrideDomain(@Nullable String blockOverrideDomain) {
            this.blockOverrideDomain = Codegen.ofNullable(blockOverrideDomain);
            return this;
        }
        public Builder blockOverrideTtl(@Nullable Output<Integer> blockOverrideTtl) {
            this.blockOverrideTtl = blockOverrideTtl;
            return this;
        }
        public Builder blockOverrideTtl(@Nullable Integer blockOverrideTtl) {
            this.blockOverrideTtl = Codegen.ofNullable(blockOverrideTtl);
            return this;
        }
        public Builder blockResponse(@Nullable Output<FirewallRuleGroupFirewallRuleBlockResponse> blockResponse) {
            this.blockResponse = blockResponse;
            return this;
        }
        public Builder blockResponse(@Nullable FirewallRuleGroupFirewallRuleBlockResponse blockResponse) {
            this.blockResponse = Codegen.ofNullable(blockResponse);
            return this;
        }
        public Builder firewallDomainListId(Output<String> firewallDomainListId) {
            this.firewallDomainListId = Objects.requireNonNull(firewallDomainListId);
            return this;
        }
        public Builder firewallDomainListId(String firewallDomainListId) {
            this.firewallDomainListId = Output.of(Objects.requireNonNull(firewallDomainListId));
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }        public FirewallRuleGroupFirewallRuleArgs build() {
            return new FirewallRuleGroupFirewallRuleArgs(action, blockOverrideDnsType, blockOverrideDomain, blockOverrideTtl, blockResponse, firewallDomainListId, priority);
        }
    }
}
