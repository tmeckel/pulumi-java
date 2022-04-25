// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBody body;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
