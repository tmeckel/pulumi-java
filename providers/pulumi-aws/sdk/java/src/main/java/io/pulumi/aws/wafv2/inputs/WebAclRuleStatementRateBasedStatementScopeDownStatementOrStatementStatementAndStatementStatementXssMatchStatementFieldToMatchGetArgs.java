// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs(
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs() {
        this.allQueryArguments = Input.empty();
        this.body = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.singleQueryArgument = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
