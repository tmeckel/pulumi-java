// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.SecurityPolicyRuleRedirectOptionsType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRedirectOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRedirectOptionsArgs Empty = new SecurityPolicyRuleRedirectOptionsArgs();

    /**
     * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    @InputImport(name="target")
    private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    /**
     * Type of the redirect action.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<SecurityPolicyRuleRedirectOptionsType> type;

    public Input<SecurityPolicyRuleRedirectOptionsType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public SecurityPolicyRuleRedirectOptionsArgs(
        @Nullable Input<String> target,
        @Nullable Input<SecurityPolicyRuleRedirectOptionsType> type) {
        this.target = target;
        this.type = type;
    }

    private SecurityPolicyRuleRedirectOptionsArgs() {
        this.target = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRedirectOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> target;
        private @Nullable Input<SecurityPolicyRuleRedirectOptionsType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRedirectOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder setType(@Nullable Input<SecurityPolicyRuleRedirectOptionsType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable SecurityPolicyRuleRedirectOptionsType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public SecurityPolicyRuleRedirectOptionsArgs build() {
            return new SecurityPolicyRuleRedirectOptionsArgs(target, type);
        }
    }
}
