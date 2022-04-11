// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Codegen.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Codegen.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Codegen.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Codegen.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Codegen.empty() : this.uriPath;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs(
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs() {
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

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Codegen.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Codegen.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Codegen.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Codegen.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Codegen.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
