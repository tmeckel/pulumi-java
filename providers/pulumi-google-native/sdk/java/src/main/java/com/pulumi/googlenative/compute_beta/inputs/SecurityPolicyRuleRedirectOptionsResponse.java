// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyRuleRedirectOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleRedirectOptionsResponse Empty = new SecurityPolicyRuleRedirectOptionsResponse();

    /**
     * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    @Import(name="target", required=true)
    private String target;

    /**
     * @return Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    public String target() {
        return this.target;
    }

    /**
     * Type of the redirect action.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of the redirect action.
     * 
     */
    public String type() {
        return this.type;
    }

    private SecurityPolicyRuleRedirectOptionsResponse() {}

    private SecurityPolicyRuleRedirectOptionsResponse(SecurityPolicyRuleRedirectOptionsResponse $) {
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleRedirectOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleRedirectOptionsResponse $;

        public Builder() {
            $ = new SecurityPolicyRuleRedirectOptionsResponse();
        }

        public Builder(SecurityPolicyRuleRedirectOptionsResponse defaults) {
            $ = new SecurityPolicyRuleRedirectOptionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param target Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            $.target = target;
            return this;
        }

        /**
         * @param type Type of the redirect action.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public SecurityPolicyRuleRedirectOptionsResponse build() {
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
