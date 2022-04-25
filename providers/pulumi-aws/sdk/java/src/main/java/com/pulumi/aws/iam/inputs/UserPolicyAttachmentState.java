// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPolicyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final UserPolicyAttachmentState Empty = new UserPolicyAttachmentState();

    /**
     * The ARN of the policy you want to apply
     * 
     */
    @Import(name="policyArn")
    private @Nullable Output<String> policyArn;

    /**
     * @return The ARN of the policy you want to apply
     * 
     */
    public Optional<Output<String>> policyArn() {
        return Optional.ofNullable(this.policyArn);
    }

    /**
     * The user the policy should be applied to
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return The user the policy should be applied to
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private UserPolicyAttachmentState() {}

    private UserPolicyAttachmentState(UserPolicyAttachmentState $) {
        this.policyArn = $.policyArn;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPolicyAttachmentState $;

        public Builder() {
            $ = new UserPolicyAttachmentState();
        }

        public Builder(UserPolicyAttachmentState defaults) {
            $ = new UserPolicyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyArn The ARN of the policy you want to apply
         * 
         * @return builder
         * 
         */
        public Builder policyArn(@Nullable Output<String> policyArn) {
            $.policyArn = policyArn;
            return this;
        }

        /**
         * @param policyArn The ARN of the policy you want to apply
         * 
         * @return builder
         * 
         */
        public Builder policyArn(String policyArn) {
            return policyArn(Output.of(policyArn));
        }

        /**
         * @param user The user the policy should be applied to
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The user the policy should be applied to
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public UserPolicyAttachmentState build() {
            return $;
        }
    }

}
