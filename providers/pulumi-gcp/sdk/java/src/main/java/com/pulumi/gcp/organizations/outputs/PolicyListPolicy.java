// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.organizations.outputs.PolicyListPolicyAllow;
import com.pulumi.gcp.organizations.outputs.PolicyListPolicyDeny;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyListPolicy {
    /**
     * @return or `deny` - (Optional) One or the other must be set.
     * 
     */
    private final @Nullable PolicyListPolicyAllow allow;
    private final @Nullable PolicyListPolicyDeny deny;
    /**
     * @return If set to true, the values from the effective Policy of the parent resource
     * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    private final @Nullable Boolean inheritFromParent;
    /**
     * @return The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    private final @Nullable String suggestedValue;

    @CustomType.Constructor
    private PolicyListPolicy(
        @CustomType.Parameter("allow") @Nullable PolicyListPolicyAllow allow,
        @CustomType.Parameter("deny") @Nullable PolicyListPolicyDeny deny,
        @CustomType.Parameter("inheritFromParent") @Nullable Boolean inheritFromParent,
        @CustomType.Parameter("suggestedValue") @Nullable String suggestedValue) {
        this.allow = allow;
        this.deny = deny;
        this.inheritFromParent = inheritFromParent;
        this.suggestedValue = suggestedValue;
    }

    /**
     * @return or `deny` - (Optional) One or the other must be set.
     * 
     */
    public Optional<PolicyListPolicyAllow> allow() {
        return Optional.ofNullable(this.allow);
    }
    public Optional<PolicyListPolicyDeny> deny() {
        return Optional.ofNullable(this.deny);
    }
    /**
     * @return If set to true, the values from the effective Policy of the parent resource
     * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    public Optional<Boolean> inheritFromParent() {
        return Optional.ofNullable(this.inheritFromParent);
    }
    /**
     * @return The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    public Optional<String> suggestedValue() {
        return Optional.ofNullable(this.suggestedValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyListPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PolicyListPolicyAllow allow;
        private @Nullable PolicyListPolicyDeny deny;
        private @Nullable Boolean inheritFromParent;
        private @Nullable String suggestedValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyListPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.suggestedValue = defaults.suggestedValue;
        }

        public Builder allow(@Nullable PolicyListPolicyAllow allow) {
            this.allow = allow;
            return this;
        }
        public Builder deny(@Nullable PolicyListPolicyDeny deny) {
            this.deny = deny;
            return this;
        }
        public Builder inheritFromParent(@Nullable Boolean inheritFromParent) {
            this.inheritFromParent = inheritFromParent;
            return this;
        }
        public Builder suggestedValue(@Nullable String suggestedValue) {
            this.suggestedValue = suggestedValue;
            return this;
        }        public PolicyListPolicy build() {
            return new PolicyListPolicy(allow, deny, inheritFromParent, suggestedValue);
        }
    }
}
