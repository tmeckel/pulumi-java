// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information for an IAM user identity in an access policy.
 * 
 */
public final class AccessPolicyIamUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyIamUserArgs Empty = new AccessPolicyIamUserArgs();

    /**
     * The ARN of the IAM user.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the IAM user.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    private AccessPolicyIamUserArgs() {}

    private AccessPolicyIamUserArgs(AccessPolicyIamUserArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyIamUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyIamUserArgs $;

        public Builder() {
            $ = new AccessPolicyIamUserArgs();
        }

        public Builder(AccessPolicyIamUserArgs defaults) {
            $ = new AccessPolicyIamUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the IAM user.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the IAM user.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public AccessPolicyIamUserArgs build() {
            return $;
        }
    }

}
