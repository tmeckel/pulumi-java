// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig Empty = new GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig();

    /**
     * Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    @InputImport(name="queryStringBehavior", required=true)
      private final String queryStringBehavior;

    public String getQueryStringBehavior() {
        return this.queryStringBehavior;
    }

    /**
     * Object that contains a list of query string names. See Items for more information.
     * 
     */
    @InputImport(name="queryStrings", required=true)
      private final List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings;

    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> getQueryStrings() {
        return this.queryStrings;
    }

    public GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig(
        String queryStringBehavior,
        List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings) {
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
        this.queryStrings = Objects.requireNonNull(queryStrings, "expected parameter 'queryStrings' to be non-null");
    }

    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig() {
        this.queryStringBehavior = null;
        this.queryStrings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryStringBehavior;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder queryStrings(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString> queryStrings) {
            this.queryStrings = Objects.requireNonNull(queryStrings);
            return this;
        }
        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}
