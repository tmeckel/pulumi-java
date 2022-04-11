// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs Empty = new RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Codegen.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;

    public Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;

    public Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Codegen.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Codegen.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Codegen.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Codegen.empty() : this.uriPath;
    }

    public RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs(
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Codegen.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Codegen.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Codegen.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Codegen.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Codegen.ofNullable(uriPath);
            return this;
        }        public RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
