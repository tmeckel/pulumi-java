// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch(
        @OutputCustomType.Parameter("allQueryArguments") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments,
        @OutputCustomType.Parameter("body") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body,
        @OutputCustomType.Parameter("method") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method,
        @OutputCustomType.Parameter("queryString") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString,
        @OutputCustomType.Parameter("singleHeader") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader,
        @OutputCustomType.Parameter("singleQueryArgument") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @OutputCustomType.Parameter("uriPath") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * Inspect all query arguments.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder body(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder method(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder queryString(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder singleHeader(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder uriPath(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch build() {
            return new RuleGroupRuleStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
