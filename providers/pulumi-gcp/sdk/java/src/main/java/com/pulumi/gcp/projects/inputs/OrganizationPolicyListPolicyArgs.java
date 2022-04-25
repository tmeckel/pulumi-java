// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyAllowArgs;
import com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyDenyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationPolicyListPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyListPolicyArgs Empty = new OrganizationPolicyListPolicyArgs();

    /**
     * or `deny` - (Optional) One or the other must be set.
     * 
     */
    @Import(name="allow")
    private @Nullable Output<OrganizationPolicyListPolicyAllowArgs> allow;

    /**
     * @return or `deny` - (Optional) One or the other must be set.
     * 
     */
    public Optional<Output<OrganizationPolicyListPolicyAllowArgs>> allow() {
        return Optional.ofNullable(this.allow);
    }

    @Import(name="deny")
    private @Nullable Output<OrganizationPolicyListPolicyDenyArgs> deny;

    public Optional<Output<OrganizationPolicyListPolicyDenyArgs>> deny() {
        return Optional.ofNullable(this.deny);
    }

    /**
     * If set to true, the values from the effective Policy of the parent resource
     * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    @Import(name="inheritFromParent")
    private @Nullable Output<Boolean> inheritFromParent;

    /**
     * @return If set to true, the values from the effective Policy of the parent resource
     * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    public Optional<Output<Boolean>> inheritFromParent() {
        return Optional.ofNullable(this.inheritFromParent);
    }

    /**
     * The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    @Import(name="suggestedValue")
    private @Nullable Output<String> suggestedValue;

    /**
     * @return The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    public Optional<Output<String>> suggestedValue() {
        return Optional.ofNullable(this.suggestedValue);
    }

    private OrganizationPolicyListPolicyArgs() {}

    private OrganizationPolicyListPolicyArgs(OrganizationPolicyListPolicyArgs $) {
        this.allow = $.allow;
        this.deny = $.deny;
        this.inheritFromParent = $.inheritFromParent;
        this.suggestedValue = $.suggestedValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationPolicyListPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationPolicyListPolicyArgs $;

        public Builder() {
            $ = new OrganizationPolicyListPolicyArgs();
        }

        public Builder(OrganizationPolicyListPolicyArgs defaults) {
            $ = new OrganizationPolicyListPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allow or `deny` - (Optional) One or the other must be set.
         * 
         * @return builder
         * 
         */
        public Builder allow(@Nullable Output<OrganizationPolicyListPolicyAllowArgs> allow) {
            $.allow = allow;
            return this;
        }

        /**
         * @param allow or `deny` - (Optional) One or the other must be set.
         * 
         * @return builder
         * 
         */
        public Builder allow(OrganizationPolicyListPolicyAllowArgs allow) {
            return allow(Output.of(allow));
        }

        public Builder deny(@Nullable Output<OrganizationPolicyListPolicyDenyArgs> deny) {
            $.deny = deny;
            return this;
        }

        public Builder deny(OrganizationPolicyListPolicyDenyArgs deny) {
            return deny(Output.of(deny));
        }

        /**
         * @param inheritFromParent If set to true, the values from the effective Policy of the parent resource
         * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromParent(@Nullable Output<Boolean> inheritFromParent) {
            $.inheritFromParent = inheritFromParent;
            return this;
        }

        /**
         * @param inheritFromParent If set to true, the values from the effective Policy of the parent resource
         * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromParent(Boolean inheritFromParent) {
            return inheritFromParent(Output.of(inheritFromParent));
        }

        /**
         * @param suggestedValue The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
         * 
         * @return builder
         * 
         */
        public Builder suggestedValue(@Nullable Output<String> suggestedValue) {
            $.suggestedValue = suggestedValue;
            return this;
        }

        /**
         * @param suggestedValue The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
         * 
         * @return builder
         * 
         */
        public Builder suggestedValue(String suggestedValue) {
            return suggestedValue(Output.of(suggestedValue));
        }

        public OrganizationPolicyListPolicyArgs build() {
            return $;
        }
    }

}
