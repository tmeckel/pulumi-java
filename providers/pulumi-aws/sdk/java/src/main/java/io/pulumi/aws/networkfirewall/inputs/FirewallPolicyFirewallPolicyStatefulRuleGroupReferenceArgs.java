// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs Empty = new FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs();

    /**
     * An integer setting that indicates the order in which to apply the stateful rule groups in a single policy. This argument must be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. AWS Network Firewall applies each stateful rule group to a packet starting with the group that has the lowest priority setting.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * The Amazon Resource Name (ARN) of the stateful rule group.
     * 
     */
    @Import(name="resourceArn", required=true)
      private final Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn;
    }

    public FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs(
        @Nullable Output<Integer> priority,
        Output<String> resourceArn) {
        this.priority = priority;
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs() {
        this.priority = Codegen.empty();
        this.resourceArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> priority;
        private Output<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder resourceArn(Output<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Output.of(Objects.requireNonNull(resourceArn));
            return this;
        }        public FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs build() {
            return new FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceArgs(priority, resourceArn);
        }
    }
}
