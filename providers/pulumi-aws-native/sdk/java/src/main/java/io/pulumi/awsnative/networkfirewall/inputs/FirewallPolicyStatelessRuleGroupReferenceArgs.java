// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyStatelessRuleGroupReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyStatelessRuleGroupReferenceArgs Empty = new FirewallPolicyStatelessRuleGroupReferenceArgs();

    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    @InputImport(name="resourceArn", required=true)
      private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    public FirewallPolicyStatelessRuleGroupReferenceArgs(
        Input<Integer> priority,
        Input<String> resourceArn) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private FirewallPolicyStatelessRuleGroupReferenceArgs() {
        this.priority = Input.empty();
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyStatelessRuleGroupReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> priority;
        private Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyStatelessRuleGroupReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder priority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder resourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public FirewallPolicyStatelessRuleGroupReferenceArgs build() {
            return new FirewallPolicyStatelessRuleGroupReferenceArgs(priority, resourceArn);
        }
    }
}
