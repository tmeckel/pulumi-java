// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    @Import(name="policy", required=true)
    private Output<String> policy;

    public Output<String> policy() {
        return this.policy;
    }

    /**
     * The Amazon Resource Name (ARN) of the rule group or firewall policy.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the rule group or firewall policy.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    private ResourcePolicyArgs() {}

    private ResourcePolicyArgs(ResourcePolicyArgs $) {
        this.policy = $.policy;
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyArgs $;

        public Builder() {
            $ = new ResourcePolicyArgs();
        }

        public Builder(ResourcePolicyArgs defaults) {
            $ = new ResourcePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the rule group or firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the rule group or firewall policy.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public ResourcePolicyArgs build() {
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            return $;
        }
    }

}
