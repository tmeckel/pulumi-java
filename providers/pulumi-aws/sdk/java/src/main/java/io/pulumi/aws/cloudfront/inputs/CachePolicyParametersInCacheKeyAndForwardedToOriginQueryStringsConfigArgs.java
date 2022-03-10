// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs();

    /**
     * Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    @InputImport(name="queryStringBehavior", required=true)
      private final Input<String> queryStringBehavior;

    public Input<String> getQueryStringBehavior() {
        return this.queryStringBehavior;
    }

    /**
     * Object that contains a list of query string names. See Items for more information.
     * 
     */
    @InputImport(name="queryStrings")
      private final @Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs> queryStrings;

    public Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs> getQueryStrings() {
        return this.queryStrings == null ? Input.empty() : this.queryStrings;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs(
        Input<String> queryStringBehavior,
        @Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs> queryStrings) {
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
        this.queryStrings = queryStrings;
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs() {
        this.queryStringBehavior = Input.empty();
        this.queryStrings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> queryStringBehavior;
        private @Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder queryStringBehavior(Input<String> queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Input.of(Objects.requireNonNull(queryStringBehavior));
            return this;
        }

        public Builder queryStrings(@Nullable Input<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }

        public Builder queryStrings(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs queryStrings) {
            this.queryStrings = Input.ofNullable(queryStrings);
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs(queryStringBehavior, queryStrings);
        }
    }
}
