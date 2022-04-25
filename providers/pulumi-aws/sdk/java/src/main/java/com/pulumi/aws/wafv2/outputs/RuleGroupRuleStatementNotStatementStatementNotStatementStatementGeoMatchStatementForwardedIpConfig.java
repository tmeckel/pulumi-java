// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig {
    /**
     * @return - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    private final String fallbackBehavior;
    /**
     * @return - The name of the HTTP header to use for the IP address.
     * 
     */
    private final String headerName;

    @CustomType.Constructor
    private RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig(
        @CustomType.Parameter("fallbackBehavior") String fallbackBehavior,
        @CustomType.Parameter("headerName") String headerName) {
        this.fallbackBehavior = fallbackBehavior;
        this.headerName = headerName;
    }

    /**
     * @return - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    public String fallbackBehavior() {
        return this.fallbackBehavior;
    }
    /**
     * @return - The name of the HTTP header to use for the IP address.
     * 
     */
    public String headerName() {
        return this.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fallbackBehavior;
        private String headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder fallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }        public RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig build() {
            return new RuleGroupRuleStatementNotStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig(fallbackBehavior, headerName);
        }
    }
}
