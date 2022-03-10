// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig {
    /**
     * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    private final String fallbackBehavior;
    /**
     * - The name of the HTTP header to use for the IP address.
     * 
     */
    private final String headerName;
    /**
     * - The position in the header to search for the IP address. Valid values include: `FIRST`, `LAST`, or `ANY`. If `ANY` is specified and the header contains more than 10 IP addresses, AWS WAFv2 inspects the last 10.
     * 
     */
    private final String position;

    @OutputCustomType.Constructor
    private WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig(
        @OutputCustomType.Parameter("fallbackBehavior") String fallbackBehavior,
        @OutputCustomType.Parameter("headerName") String headerName,
        @OutputCustomType.Parameter("position") String position) {
        this.fallbackBehavior = fallbackBehavior;
        this.headerName = headerName;
        this.position = position;
    }

    /**
     * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
    */
    public String getFallbackBehavior() {
        return this.fallbackBehavior;
    }
    /**
     * - The name of the HTTP header to use for the IP address.
     * 
    */
    public String getHeaderName() {
        return this.headerName;
    }
    /**
     * - The position in the header to search for the IP address. Valid values include: `FIRST`, `LAST`, or `ANY`. If `ANY` is specified and the header contains more than 10 IP addresses, AWS WAFv2 inspects the last 10.
     * 
    */
    public String getPosition() {
        return this.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fallbackBehavior;
        private String headerName;
        private String position;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
    	      this.position = defaults.position;
        }

        public Builder fallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }

        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder position(String position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig build() {
            return new WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig(fallbackBehavior, headerName, position);
        }
    }
}
