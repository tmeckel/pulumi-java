// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs(
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
