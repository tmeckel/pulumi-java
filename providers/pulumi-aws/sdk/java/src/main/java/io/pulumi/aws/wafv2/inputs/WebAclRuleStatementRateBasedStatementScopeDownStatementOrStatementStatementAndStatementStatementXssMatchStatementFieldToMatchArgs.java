// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Codegen.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Codegen.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Codegen.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Codegen.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Codegen.empty() : this.uriPath;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs() {
        this.allQueryArguments = Codegen.empty();
        this.body = Codegen.empty();
        this.method = Codegen.empty();
        this.queryString = Codegen.empty();
        this.singleHeader = Codegen.empty();
        this.singleQueryArgument = Codegen.empty();
        this.uriPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Codegen.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Codegen.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Codegen.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Codegen.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Codegen.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
