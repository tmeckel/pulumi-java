// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs();

    /**
     * - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    @Import(name="fallbackBehavior", required=true)
    private Output<String> fallbackBehavior;

    /**
     * @return - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    public Output<String> fallbackBehavior() {
        return this.fallbackBehavior;
    }

    /**
     * - The name of the HTTP header to use for the IP address.
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    /**
     * @return - The name of the HTTP header to use for the IP address.
     * 
     */
    public Output<String> headerName() {
        return this.headerName;
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs $) {
        this.fallbackBehavior = $.fallbackBehavior;
        this.headerName = $.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fallbackBehavior - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
         * 
         * @return builder
         * 
         */
        public Builder fallbackBehavior(Output<String> fallbackBehavior) {
            $.fallbackBehavior = fallbackBehavior;
            return this;
        }

        /**
         * @param fallbackBehavior - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
         * 
         * @return builder
         * 
         */
        public Builder fallbackBehavior(String fallbackBehavior) {
            return fallbackBehavior(Output.of(fallbackBehavior));
        }

        /**
         * @param headerName - The name of the HTTP header to use for the IP address.
         * 
         * @return builder
         * 
         */
        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName - The name of the HTTP header to use for the IP address.
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs build() {
            $.fallbackBehavior = Objects.requireNonNull($.fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            return $;
        }
    }

}
