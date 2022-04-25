// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.ExprResponse;
import com.pulumi.googlenative.compute_v1.inputs.SecurityPolicyRuleMatcherConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class SecurityPolicyRuleMatcherResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleMatcherResponse Empty = new SecurityPolicyRuleMatcherResponse();

    /**
     * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
     */
    @Import(name="config", required=true)
    private SecurityPolicyRuleMatcherConfigResponse config;

    /**
     * @return The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
     */
    public SecurityPolicyRuleMatcherConfigResponse config() {
        return this.config;
    }

    /**
     * User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
     */
    @Import(name="expr", required=true)
    private ExprResponse expr;

    /**
     * @return User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
     */
    public ExprResponse expr() {
        return this.expr;
    }

    /**
     * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    @Import(name="versionedExpr", required=true)
    private String versionedExpr;

    /**
     * @return Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    public String versionedExpr() {
        return this.versionedExpr;
    }

    private SecurityPolicyRuleMatcherResponse() {}

    private SecurityPolicyRuleMatcherResponse(SecurityPolicyRuleMatcherResponse $) {
        this.config = $.config;
        this.expr = $.expr;
        this.versionedExpr = $.versionedExpr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleMatcherResponse $;

        public Builder() {
            $ = new SecurityPolicyRuleMatcherResponse();
        }

        public Builder(SecurityPolicyRuleMatcherResponse defaults) {
            $ = new SecurityPolicyRuleMatcherResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
         * 
         * @return builder
         * 
         */
        public Builder config(SecurityPolicyRuleMatcherConfigResponse config) {
            $.config = config;
            return this;
        }

        /**
         * @param expr User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
         * 
         * @return builder
         * 
         */
        public Builder expr(ExprResponse expr) {
            $.expr = expr;
            return this;
        }

        /**
         * @param versionedExpr Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
         * 
         * @return builder
         * 
         */
        public Builder versionedExpr(String versionedExpr) {
            $.versionedExpr = versionedExpr;
            return this;
        }

        public SecurityPolicyRuleMatcherResponse build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.expr = Objects.requireNonNull($.expr, "expected parameter 'expr' to be non-null");
            $.versionedExpr = Objects.requireNonNull($.versionedExpr, "expected parameter 'versionedExpr' to be non-null");
            return $;
        }
    }

}
