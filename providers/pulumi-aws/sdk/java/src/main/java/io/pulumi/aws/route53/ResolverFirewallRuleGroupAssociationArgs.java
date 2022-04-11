// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverFirewallRuleGroupAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverFirewallRuleGroupAssociationArgs Empty = new ResolverFirewallRuleGroupAssociationArgs();

    /**
     * The unique identifier of the firewall rule group.
     * 
     */
    @Import(name="firewallRuleGroupId", required=true)
      private final Output<String> firewallRuleGroupId;

    public Output<String> getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    @Import(name="mutationProtection")
      private final @Nullable Output<String> mutationProtection;

    public Output<String> getMutationProtection() {
        return this.mutationProtection == null ? Codegen.empty() : this.mutationProtection;
    }

    /**
     * A name that lets you identify the rule group association, to manage and use it.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The setting that determines the processing order of the rule group among the rule groups that you associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The unique identifier of the VPC that you want to associate with the rule group.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public ResolverFirewallRuleGroupAssociationArgs(
        Output<String> firewallRuleGroupId,
        @Nullable Output<String> mutationProtection,
        @Nullable Output<String> name,
        Output<Integer> priority,
        @Nullable Output<Map<String,String>> tags,
        Output<String> vpcId) {
        this.firewallRuleGroupId = Objects.requireNonNull(firewallRuleGroupId, "expected parameter 'firewallRuleGroupId' to be non-null");
        this.mutationProtection = mutationProtection;
        this.name = name;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private ResolverFirewallRuleGroupAssociationArgs() {
        this.firewallRuleGroupId = Codegen.empty();
        this.mutationProtection = Codegen.empty();
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverFirewallRuleGroupAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> firewallRuleGroupId;
        private @Nullable Output<String> mutationProtection;
        private @Nullable Output<String> name;
        private Output<Integer> priority;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverFirewallRuleGroupAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallRuleGroupId = defaults.firewallRuleGroupId;
    	      this.mutationProtection = defaults.mutationProtection;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder firewallRuleGroupId(Output<String> firewallRuleGroupId) {
            this.firewallRuleGroupId = Objects.requireNonNull(firewallRuleGroupId);
            return this;
        }
        public Builder firewallRuleGroupId(String firewallRuleGroupId) {
            this.firewallRuleGroupId = Output.of(Objects.requireNonNull(firewallRuleGroupId));
            return this;
        }
        public Builder mutationProtection(@Nullable Output<String> mutationProtection) {
            this.mutationProtection = mutationProtection;
            return this;
        }
        public Builder mutationProtection(@Nullable String mutationProtection) {
            this.mutationProtection = Codegen.ofNullable(mutationProtection);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public ResolverFirewallRuleGroupAssociationArgs build() {
            return new ResolverFirewallRuleGroupAssociationArgs(firewallRuleGroupId, mutationProtection, name, priority, tags, vpcId);
        }
    }
}
