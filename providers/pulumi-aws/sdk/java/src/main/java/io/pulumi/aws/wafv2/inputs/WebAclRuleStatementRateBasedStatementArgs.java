// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementForwardedIpConfigArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementArgs Empty = new WebAclRuleStatementRateBasedStatementArgs();

    /**
     * Setting that indicates how to aggregate the request counts. Valid values include: `FORWARDED_IP` or `IP`. Default: `IP`.
     * 
     */
    @InputImport(name="aggregateKeyType")
      private final @Nullable Input<String> aggregateKeyType;

    public Input<String> getAggregateKeyType() {
        return this.aggregateKeyType == null ? Input.empty() : this.aggregateKeyType;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. If `aggregate_key_type` is set to `FORWARDED_IP`, this block is required. See Forwarded IP Config below for details.
     * 
     */
    @InputImport(name="forwardedIpConfig")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementForwardedIpConfigArgs> forwardedIpConfig;

    public Input<WebAclRuleStatementRateBasedStatementForwardedIpConfigArgs> getForwardedIpConfig() {
        return this.forwardedIpConfig == null ? Input.empty() : this.forwardedIpConfig;
    }

    /**
     * The limit on requests per 5-minute period for a single originating IP address.
     * 
     */
    @InputImport(name="limit", required=true)
      private final Input<Integer> limit;

    public Input<Integer> getLimit() {
        return this.limit;
    }

    /**
     * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details.
     * 
     */
    @InputImport(name="scopeDownStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementArgs> scopeDownStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementArgs> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Input.empty() : this.scopeDownStatement;
    }

    public WebAclRuleStatementRateBasedStatementArgs(
        @Nullable Input<String> aggregateKeyType,
        @Nullable Input<WebAclRuleStatementRateBasedStatementForwardedIpConfigArgs> forwardedIpConfig,
        Input<Integer> limit,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementArgs> scopeDownStatement) {
        this.aggregateKeyType = aggregateKeyType;
        this.forwardedIpConfig = forwardedIpConfig;
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
    }

    private WebAclRuleStatementRateBasedStatementArgs() {
        this.aggregateKeyType = Input.empty();
        this.forwardedIpConfig = Input.empty();
        this.limit = Input.empty();
        this.scopeDownStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aggregateKeyType;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementForwardedIpConfigArgs> forwardedIpConfig;
        private Input<Integer> limit;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementArgs> scopeDownStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateKeyType = defaults.aggregateKeyType;
    	      this.forwardedIpConfig = defaults.forwardedIpConfig;
    	      this.limit = defaults.limit;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
        }

        public Builder aggregateKeyType(@Nullable Input<String> aggregateKeyType) {
            this.aggregateKeyType = aggregateKeyType;
            return this;
        }

        public Builder aggregateKeyType(@Nullable String aggregateKeyType) {
            this.aggregateKeyType = Input.ofNullable(aggregateKeyType);
            return this;
        }

        public Builder forwardedIpConfig(@Nullable Input<WebAclRuleStatementRateBasedStatementForwardedIpConfigArgs> forwardedIpConfig) {
            this.forwardedIpConfig = forwardedIpConfig;
            return this;
        }

        public Builder forwardedIpConfig(@Nullable WebAclRuleStatementRateBasedStatementForwardedIpConfigArgs forwardedIpConfig) {
            this.forwardedIpConfig = Input.ofNullable(forwardedIpConfig);
            return this;
        }

        public Builder limit(Input<Integer> limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Input.of(Objects.requireNonNull(limit));
            return this;
        }

        public Builder scopeDownStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementArgs> scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }

        public Builder scopeDownStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementArgs scopeDownStatement) {
            this.scopeDownStatement = Input.ofNullable(scopeDownStatement);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementArgs build() {
            return new WebAclRuleStatementRateBasedStatementArgs(aggregateKeyType, forwardedIpConfig, limit, scopeDownStatement);
        }
    }
}
