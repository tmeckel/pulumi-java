// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointPolicyState Empty = new AccessPointPolicyState();

    /**
     * The ARN of the access point that you want to associate with the specified policy.
     * 
     */
    @Import(name="accessPointArn")
    private @Nullable Output<String> accessPointArn;

    /**
     * @return The ARN of the access point that you want to associate with the specified policy.
     * 
     */
    public Optional<Output<String>> accessPointArn() {
        return Optional.ofNullable(this.accessPointArn);
    }

    /**
     * Indicates whether this access point currently has a policy that allows public access.
     * 
     */
    @Import(name="hasPublicAccessPolicy")
    private @Nullable Output<Boolean> hasPublicAccessPolicy;

    /**
     * @return Indicates whether this access point currently has a policy that allows public access.
     * 
     */
    public Optional<Output<Boolean>> hasPublicAccessPolicy() {
        return Optional.ofNullable(this.hasPublicAccessPolicy);
    }

    /**
     * The policy that you want to apply to the specified access point.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return The policy that you want to apply to the specified access point.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private AccessPointPolicyState() {}

    private AccessPointPolicyState(AccessPointPolicyState $) {
        this.accessPointArn = $.accessPointArn;
        this.hasPublicAccessPolicy = $.hasPublicAccessPolicy;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointPolicyState $;

        public Builder() {
            $ = new AccessPointPolicyState();
        }

        public Builder(AccessPointPolicyState defaults) {
            $ = new AccessPointPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPointArn The ARN of the access point that you want to associate with the specified policy.
         * 
         * @return builder
         * 
         */
        public Builder accessPointArn(@Nullable Output<String> accessPointArn) {
            $.accessPointArn = accessPointArn;
            return this;
        }

        /**
         * @param accessPointArn The ARN of the access point that you want to associate with the specified policy.
         * 
         * @return builder
         * 
         */
        public Builder accessPointArn(String accessPointArn) {
            return accessPointArn(Output.of(accessPointArn));
        }

        /**
         * @param hasPublicAccessPolicy Indicates whether this access point currently has a policy that allows public access.
         * 
         * @return builder
         * 
         */
        public Builder hasPublicAccessPolicy(@Nullable Output<Boolean> hasPublicAccessPolicy) {
            $.hasPublicAccessPolicy = hasPublicAccessPolicy;
            return this;
        }

        /**
         * @param hasPublicAccessPolicy Indicates whether this access point currently has a policy that allows public access.
         * 
         * @return builder
         * 
         */
        public Builder hasPublicAccessPolicy(Boolean hasPublicAccessPolicy) {
            return hasPublicAccessPolicy(Output.of(hasPublicAccessPolicy));
        }

        /**
         * @param policy The policy that you want to apply to the specified access point.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The policy that you want to apply to the specified access point.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public AccessPointPolicyState build() {
            return $;
        }
    }

}
