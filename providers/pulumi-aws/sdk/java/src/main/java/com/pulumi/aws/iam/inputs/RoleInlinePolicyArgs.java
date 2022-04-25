// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleInlinePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleInlinePolicyArgs Empty = new RoleInlinePolicyArgs();

    /**
     * Name of the role policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the role policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Policy document as a JSON formatted string.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Policy document as a JSON formatted string.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private RoleInlinePolicyArgs() {}

    private RoleInlinePolicyArgs(RoleInlinePolicyArgs $) {
        this.name = $.name;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleInlinePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleInlinePolicyArgs $;

        public Builder() {
            $ = new RoleInlinePolicyArgs();
        }

        public Builder(RoleInlinePolicyArgs defaults) {
            $ = new RoleInlinePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the role policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the role policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy Policy document as a JSON formatted string.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Policy document as a JSON formatted string.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public RoleInlinePolicyArgs build() {
            return $;
        }
    }

}
