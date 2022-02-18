// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.BackendBucketCdnPolicyCacheMode;
import io.pulumi.googlenative.compute_alpha.inputs.BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs;
import io.pulumi.googlenative.compute_alpha.inputs.BackendBucketCdnPolicyCacheKeyPolicyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.BackendBucketCdnPolicyNegativeCachingPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message containing Cloud CDN configuration for a backend bucket.
 * 
 */
public final class BackendBucketCdnPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendBucketCdnPolicyArgs Empty = new BackendBucketCdnPolicyArgs();

    /**
     * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
     * 
     */
    @InputImport(name="bypassCacheOnRequestHeaders")
    private final @Nullable Input<List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs>> bypassCacheOnRequestHeaders;

    public Input<List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs>> getBypassCacheOnRequestHeaders() {
        return this.bypassCacheOnRequestHeaders == null ? Input.empty() : this.bypassCacheOnRequestHeaders;
    }

    /**
     * The CacheKeyPolicy for this CdnPolicy.
     * 
     */
    @InputImport(name="cacheKeyPolicy")
    private final @Nullable Input<BackendBucketCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy;

    public Input<BackendBucketCdnPolicyCacheKeyPolicyArgs> getCacheKeyPolicy() {
        return this.cacheKeyPolicy == null ? Input.empty() : this.cacheKeyPolicy;
    }

    /**
     * Specifies the cache setting for all responses from this backend. The possible values are: USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google's edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server. FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content. CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
     * 
     */
    @InputImport(name="cacheMode")
    private final @Nullable Input<BackendBucketCdnPolicyCacheMode> cacheMode;

    public Input<BackendBucketCdnPolicyCacheMode> getCacheMode() {
        return this.cacheMode == null ? Input.empty() : this.cacheMode;
    }

    /**
     * Specifies a separate client (e.g. browser client) maximum TTL. This is used to clamp the max-age (or Expires) value sent to the client. With FORCE_CACHE_ALL, the lesser of client_ttl and default_ttl is used for the response max-age directive, along with a "public" directive. For cacheable content in CACHE_ALL_STATIC mode, client_ttl clamps the max-age from the origin (if specified), or else sets the response max-age directive to the lesser of the client_ttl and default_ttl, and also ensures a "public" cache-control directive is present. If a client TTL is not specified, a default value (1 hour) will be used. The maximum allowed value is 31,622,400s (1 year).
     * 
     */
    @InputImport(name="clientTtl")
    private final @Nullable Input<Integer> clientTtl;

    public Input<Integer> getClientTtl() {
        return this.clientTtl == null ? Input.empty() : this.clientTtl;
    }

    /**
     * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age). Setting a TTL of "0" means "always revalidate". The value of defaultTTL cannot be set to a value greater than that of maxTTL, but can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @InputImport(name="defaultTtl")
    private final @Nullable Input<Integer> defaultTtl;

    public Input<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Input.empty() : this.defaultTtl;
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin. Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a TTL of "0" means "always revalidate". The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @InputImport(name="maxTtl")
    private final @Nullable Input<Integer> maxTtl;

    public Input<Integer> getMaxTtl() {
        return this.maxTtl == null ? Input.empty() : this.maxTtl;
    }

    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency. When the cache mode is set to CACHE_ALL_STATIC or USE_ORIGIN_HEADERS, negative caching applies to responses with the specified response code that lack any Cache-Control, Expires, or Pragma: no-cache directives. When the cache mode is set to FORCE_CACHE_ALL, negative caching applies to all responses with the specified response code, and override any caching headers. By default, Cloud CDN will apply the following default TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s. These defaults can be overridden in negative_caching_policy.
     * 
     */
    @InputImport(name="negativeCaching")
    private final @Nullable Input<Boolean> negativeCaching;

    public Input<Boolean> getNegativeCaching() {
        return this.negativeCaching == null ? Input.empty() : this.negativeCaching;
    }

    /**
     * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN's default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
     * 
     */
    @InputImport(name="negativeCachingPolicy")
    private final @Nullable Input<List<BackendBucketCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicy;

    public Input<List<BackendBucketCdnPolicyNegativeCachingPolicyArgs>> getNegativeCachingPolicy() {
        return this.negativeCachingPolicy == null ? Input.empty() : this.negativeCachingPolicy;
    }

    /**
     * If true then Cloud CDN will combine multiple concurrent cache fill requests into a small number of requests to the origin.
     * 
     */
    @InputImport(name="requestCoalescing")
    private final @Nullable Input<Boolean> requestCoalescing;

    public Input<Boolean> getRequestCoalescing() {
        return this.requestCoalescing == null ? Input.empty() : this.requestCoalescing;
    }

    /**
     * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache. This setting defines the default "max-stale" duration for any cached responses that do not specify a max-stale directive. Stale responses that exceed the TTL configured here will not be served. The default limit (max-stale) is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this to zero (0) to disable serve-while-stale.
     * 
     */
    @InputImport(name="serveWhileStale")
    private final @Nullable Input<Integer> serveWhileStale;

    public Input<Integer> getServeWhileStale() {
        return this.serveWhileStale == null ? Input.empty() : this.serveWhileStale;
    }

    /**
     * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
     * 
     */
    @InputImport(name="signedUrlCacheMaxAgeSec")
    private final @Nullable Input<String> signedUrlCacheMaxAgeSec;

    public Input<String> getSignedUrlCacheMaxAgeSec() {
        return this.signedUrlCacheMaxAgeSec == null ? Input.empty() : this.signedUrlCacheMaxAgeSec;
    }

    public BackendBucketCdnPolicyArgs(
        @Nullable Input<List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs>> bypassCacheOnRequestHeaders,
        @Nullable Input<BackendBucketCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy,
        @Nullable Input<BackendBucketCdnPolicyCacheMode> cacheMode,
        @Nullable Input<Integer> clientTtl,
        @Nullable Input<Integer> defaultTtl,
        @Nullable Input<Integer> maxTtl,
        @Nullable Input<Boolean> negativeCaching,
        @Nullable Input<List<BackendBucketCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicy,
        @Nullable Input<Boolean> requestCoalescing,
        @Nullable Input<Integer> serveWhileStale,
        @Nullable Input<String> signedUrlCacheMaxAgeSec) {
        this.bypassCacheOnRequestHeaders = bypassCacheOnRequestHeaders;
        this.cacheKeyPolicy = cacheKeyPolicy;
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicy = negativeCachingPolicy;
        this.requestCoalescing = requestCoalescing;
        this.serveWhileStale = serveWhileStale;
        this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    }

    private BackendBucketCdnPolicyArgs() {
        this.bypassCacheOnRequestHeaders = Input.empty();
        this.cacheKeyPolicy = Input.empty();
        this.cacheMode = Input.empty();
        this.clientTtl = Input.empty();
        this.defaultTtl = Input.empty();
        this.maxTtl = Input.empty();
        this.negativeCaching = Input.empty();
        this.negativeCachingPolicy = Input.empty();
        this.requestCoalescing = Input.empty();
        this.serveWhileStale = Input.empty();
        this.signedUrlCacheMaxAgeSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs>> bypassCacheOnRequestHeaders;
        private @Nullable Input<BackendBucketCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy;
        private @Nullable Input<BackendBucketCdnPolicyCacheMode> cacheMode;
        private @Nullable Input<Integer> clientTtl;
        private @Nullable Input<Integer> defaultTtl;
        private @Nullable Input<Integer> maxTtl;
        private @Nullable Input<Boolean> negativeCaching;
        private @Nullable Input<List<BackendBucketCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicy;
        private @Nullable Input<Boolean> requestCoalescing;
        private @Nullable Input<Integer> serveWhileStale;
        private @Nullable Input<String> signedUrlCacheMaxAgeSec;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypassCacheOnRequestHeaders = defaults.bypassCacheOnRequestHeaders;
    	      this.cacheKeyPolicy = defaults.cacheKeyPolicy;
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicy = defaults.negativeCachingPolicy;
    	      this.requestCoalescing = defaults.requestCoalescing;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
        }

        public Builder setBypassCacheOnRequestHeaders(@Nullable Input<List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs>> bypassCacheOnRequestHeaders) {
            this.bypassCacheOnRequestHeaders = bypassCacheOnRequestHeaders;
            return this;
        }

        public Builder setBypassCacheOnRequestHeaders(@Nullable List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs> bypassCacheOnRequestHeaders) {
            this.bypassCacheOnRequestHeaders = Input.ofNullable(bypassCacheOnRequestHeaders);
            return this;
        }

        public Builder setCacheKeyPolicy(@Nullable Input<BackendBucketCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy) {
            this.cacheKeyPolicy = cacheKeyPolicy;
            return this;
        }

        public Builder setCacheKeyPolicy(@Nullable BackendBucketCdnPolicyCacheKeyPolicyArgs cacheKeyPolicy) {
            this.cacheKeyPolicy = Input.ofNullable(cacheKeyPolicy);
            return this;
        }

        public Builder setCacheMode(@Nullable Input<BackendBucketCdnPolicyCacheMode> cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }

        public Builder setCacheMode(@Nullable BackendBucketCdnPolicyCacheMode cacheMode) {
            this.cacheMode = Input.ofNullable(cacheMode);
            return this;
        }

        public Builder setClientTtl(@Nullable Input<Integer> clientTtl) {
            this.clientTtl = clientTtl;
            return this;
        }

        public Builder setClientTtl(@Nullable Integer clientTtl) {
            this.clientTtl = Input.ofNullable(clientTtl);
            return this;
        }

        public Builder setDefaultTtl(@Nullable Input<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder setDefaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Input.ofNullable(defaultTtl);
            return this;
        }

        public Builder setMaxTtl(@Nullable Input<Integer> maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        public Builder setMaxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = Input.ofNullable(maxTtl);
            return this;
        }

        public Builder setNegativeCaching(@Nullable Input<Boolean> negativeCaching) {
            this.negativeCaching = negativeCaching;
            return this;
        }

        public Builder setNegativeCaching(@Nullable Boolean negativeCaching) {
            this.negativeCaching = Input.ofNullable(negativeCaching);
            return this;
        }

        public Builder setNegativeCachingPolicy(@Nullable Input<List<BackendBucketCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicy) {
            this.negativeCachingPolicy = negativeCachingPolicy;
            return this;
        }

        public Builder setNegativeCachingPolicy(@Nullable List<BackendBucketCdnPolicyNegativeCachingPolicyArgs> negativeCachingPolicy) {
            this.negativeCachingPolicy = Input.ofNullable(negativeCachingPolicy);
            return this;
        }

        public Builder setRequestCoalescing(@Nullable Input<Boolean> requestCoalescing) {
            this.requestCoalescing = requestCoalescing;
            return this;
        }

        public Builder setRequestCoalescing(@Nullable Boolean requestCoalescing) {
            this.requestCoalescing = Input.ofNullable(requestCoalescing);
            return this;
        }

        public Builder setServeWhileStale(@Nullable Input<Integer> serveWhileStale) {
            this.serveWhileStale = serveWhileStale;
            return this;
        }

        public Builder setServeWhileStale(@Nullable Integer serveWhileStale) {
            this.serveWhileStale = Input.ofNullable(serveWhileStale);
            return this;
        }

        public Builder setSignedUrlCacheMaxAgeSec(@Nullable Input<String> signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
            return this;
        }

        public Builder setSignedUrlCacheMaxAgeSec(@Nullable String signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = Input.ofNullable(signedUrlCacheMaxAgeSec);
            return this;
        }

        public BackendBucketCdnPolicyArgs build() {
            return new BackendBucketCdnPolicyArgs(bypassCacheOnRequestHeaders, cacheKeyPolicy, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicy, requestCoalescing, serveWhileStale, signedUrlCacheMaxAgeSec);
        }
    }
}
