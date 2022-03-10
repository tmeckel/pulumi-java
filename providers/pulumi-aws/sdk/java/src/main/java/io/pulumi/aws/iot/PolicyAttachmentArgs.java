// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PolicyAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyAttachmentArgs Empty = new PolicyAttachmentArgs();

    /**
     * The name of the policy to attach.
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    /**
     * The identity to which the policy is attached.
     * 
     */
    @InputImport(name="target", required=true)
      private final Input<String> target;

    public Input<String> getTarget() {
        return this.target;
    }

    public PolicyAttachmentArgs(
        Input<String> policy,
        Input<String> target) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private PolicyAttachmentArgs() {
        this.policy = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policy;
        private Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.target = defaults.target;
        }

        public Builder policy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder target(Input<String> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder target(String target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }
        public PolicyAttachmentArgs build() {
            return new PolicyAttachmentArgs(policy, target);
        }
    }
}
