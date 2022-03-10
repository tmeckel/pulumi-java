// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionOrderedCacheBehaviorForwardedValuesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOrderedCacheBehaviorForwardedValuesArgs Empty = new DistributionOrderedCacheBehaviorForwardedValuesArgs();

    /**
     * The forwarded values cookies
     * that specifies how CloudFront handles cookies (maximum one).
     * 
     */
    @InputImport(name="cookies", required=true)
      private final Input<DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs> cookies;

    public Input<DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs> getCookies() {
        return this.cookies;
    }

    /**
     * Specifies the Headers, if any, that you want
     * CloudFront to vary upon for this cache behavior. Specify `*` to include all
     * headers.
     * 
     */
    @InputImport(name="headers")
      private final @Nullable Input<List<String>> headers;

    public Input<List<String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Indicates whether you want CloudFront to forward
     * query strings to the origin that is associated with this cache behavior.
     * 
     */
    @InputImport(name="queryString", required=true)
      private final Input<Boolean> queryString;

    public Input<Boolean> getQueryString() {
        return this.queryString;
    }

    /**
     * When specified, along with a value of
     * `true` for `query_string`, all query strings are forwarded, however only the
     * query string keys listed in this argument are cached. When omitted with a
     * value of `true` for `query_string`, all query string keys are cached.
     * 
     */
    @InputImport(name="queryStringCacheKeys")
      private final @Nullable Input<List<String>> queryStringCacheKeys;

    public Input<List<String>> getQueryStringCacheKeys() {
        return this.queryStringCacheKeys == null ? Input.empty() : this.queryStringCacheKeys;
    }

    public DistributionOrderedCacheBehaviorForwardedValuesArgs(
        Input<DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs> cookies,
        @Nullable Input<List<String>> headers,
        Input<Boolean> queryString,
        @Nullable Input<List<String>> queryStringCacheKeys) {
        this.cookies = Objects.requireNonNull(cookies, "expected parameter 'cookies' to be non-null");
        this.headers = headers;
        this.queryString = Objects.requireNonNull(queryString, "expected parameter 'queryString' to be non-null");
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    private DistributionOrderedCacheBehaviorForwardedValuesArgs() {
        this.cookies = Input.empty();
        this.headers = Input.empty();
        this.queryString = Input.empty();
        this.queryStringCacheKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrderedCacheBehaviorForwardedValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs> cookies;
        private @Nullable Input<List<String>> headers;
        private Input<Boolean> queryString;
        private @Nullable Input<List<String>> queryStringCacheKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOrderedCacheBehaviorForwardedValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.queryString = defaults.queryString;
    	      this.queryStringCacheKeys = defaults.queryStringCacheKeys;
        }

        public Builder cookies(Input<DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs> cookies) {
            this.cookies = Objects.requireNonNull(cookies);
            return this;
        }

        public Builder cookies(DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs cookies) {
            this.cookies = Input.of(Objects.requireNonNull(cookies));
            return this;
        }

        public Builder headers(@Nullable Input<List<String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder headers(@Nullable List<String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder queryString(Input<Boolean> queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }

        public Builder queryString(Boolean queryString) {
            this.queryString = Input.of(Objects.requireNonNull(queryString));
            return this;
        }

        public Builder queryStringCacheKeys(@Nullable Input<List<String>> queryStringCacheKeys) {
            this.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }

        public Builder queryStringCacheKeys(@Nullable List<String> queryStringCacheKeys) {
            this.queryStringCacheKeys = Input.ofNullable(queryStringCacheKeys);
            return this;
        }
        public DistributionOrderedCacheBehaviorForwardedValuesArgs build() {
            return new DistributionOrderedCacheBehaviorForwardedValuesArgs(cookies, headers, queryString, queryStringCacheKeys);
        }
    }
}
