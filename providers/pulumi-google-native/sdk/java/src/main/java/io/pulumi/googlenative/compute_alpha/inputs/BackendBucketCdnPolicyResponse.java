// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse;
import io.pulumi.googlenative.compute_alpha.inputs.BackendBucketCdnPolicyCacheKeyPolicyResponse;
import io.pulumi.googlenative.compute_alpha.inputs.BackendBucketCdnPolicyNegativeCachingPolicyResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Message containing Cloud CDN configuration for a backend bucket.
 * 
 */
public final class BackendBucketCdnPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendBucketCdnPolicyResponse Empty = new BackendBucketCdnPolicyResponse();

    /**
     * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
     * 
     */
    @InputImport(name="bypassCacheOnRequestHeaders", required=true)
    private final List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse> bypassCacheOnRequestHeaders;

    public List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse> getBypassCacheOnRequestHeaders() {
        return this.bypassCacheOnRequestHeaders;
    }

    /**
     * The CacheKeyPolicy for this CdnPolicy.
     * 
     */
    @InputImport(name="cacheKeyPolicy", required=true)
    private final BackendBucketCdnPolicyCacheKeyPolicyResponse cacheKeyPolicy;

    public BackendBucketCdnPolicyCacheKeyPolicyResponse getCacheKeyPolicy() {
        return this.cacheKeyPolicy;
    }

    /**
     * Specifies the cache setting for all responses from this backend. The possible values are: USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google's edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server. FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content. CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
     * 
     */
    @InputImport(name="cacheMode", required=true)
    private final String cacheMode;

    public String getCacheMode() {
        return this.cacheMode;
    }

    /**
     * Specifies a separate client (e.g. browser client) maximum TTL. This is used to clamp the max-age (or Expires) value sent to the client. With FORCE_CACHE_ALL, the lesser of client_ttl and default_ttl is used for the response max-age directive, along with a "public" directive. For cacheable content in CACHE_ALL_STATIC mode, client_ttl clamps the max-age from the origin (if specified), or else sets the response max-age directive to the lesser of the client_ttl and default_ttl, and also ensures a "public" cache-control directive is present. If a client TTL is not specified, a default value (1 hour) will be used. The maximum allowed value is 31,622,400s (1 year).
     * 
     */
    @InputImport(name="clientTtl", required=true)
    private final Integer clientTtl;

    public Integer getClientTtl() {
        return this.clientTtl;
    }

    /**
     * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age). Setting a TTL of "0" means "always revalidate". The value of defaultTTL cannot be set to a value greater than that of maxTTL, but can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @InputImport(name="defaultTtl", required=true)
    private final Integer defaultTtl;

    public Integer getDefaultTtl() {
        return this.defaultTtl;
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin. Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a TTL of "0" means "always revalidate". The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @InputImport(name="maxTtl", required=true)
    private final Integer maxTtl;

    public Integer getMaxTtl() {
        return this.maxTtl;
    }

    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency. When the cache mode is set to CACHE_ALL_STATIC or USE_ORIGIN_HEADERS, negative caching applies to responses with the specified response code that lack any Cache-Control, Expires, or Pragma: no-cache directives. When the cache mode is set to FORCE_CACHE_ALL, negative caching applies to all responses with the specified response code, and override any caching headers. By default, Cloud CDN will apply the following default TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s. These defaults can be overridden in negative_caching_policy.
     * 
     */
    @InputImport(name="negativeCaching", required=true)
    private final Boolean negativeCaching;

    public Boolean getNegativeCaching() {
        return this.negativeCaching;
    }

    /**
     * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN's default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
     * 
     */
    @InputImport(name="negativeCachingPolicy", required=true)
    private final List<BackendBucketCdnPolicyNegativeCachingPolicyResponse> negativeCachingPolicy;

    public List<BackendBucketCdnPolicyNegativeCachingPolicyResponse> getNegativeCachingPolicy() {
        return this.negativeCachingPolicy;
    }

    /**
     * If true then Cloud CDN will combine multiple concurrent cache fill requests into a small number of requests to the origin.
     * 
     */
    @InputImport(name="requestCoalescing", required=true)
    private final Boolean requestCoalescing;

    public Boolean getRequestCoalescing() {
        return this.requestCoalescing;
    }

    /**
     * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache. This setting defines the default "max-stale" duration for any cached responses that do not specify a max-stale directive. Stale responses that exceed the TTL configured here will not be served. The default limit (max-stale) is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this to zero (0) to disable serve-while-stale.
     * 
     */
    @InputImport(name="serveWhileStale", required=true)
    private final Integer serveWhileStale;

    public Integer getServeWhileStale() {
        return this.serveWhileStale;
    }

    /**
     * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
     * 
     */
    @InputImport(name="signedUrlCacheMaxAgeSec", required=true)
    private final String signedUrlCacheMaxAgeSec;

    public String getSignedUrlCacheMaxAgeSec() {
        return this.signedUrlCacheMaxAgeSec;
    }

    /**
     * Names of the keys for signing request URLs.
     * 
     */
    @InputImport(name="signedUrlKeyNames", required=true)
    private final List<String> signedUrlKeyNames;

    public List<String> getSignedUrlKeyNames() {
        return this.signedUrlKeyNames;
    }

    public BackendBucketCdnPolicyResponse(
        List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse> bypassCacheOnRequestHeaders,
        BackendBucketCdnPolicyCacheKeyPolicyResponse cacheKeyPolicy,
        String cacheMode,
        Integer clientTtl,
        Integer defaultTtl,
        Integer maxTtl,
        Boolean negativeCaching,
        List<BackendBucketCdnPolicyNegativeCachingPolicyResponse> negativeCachingPolicy,
        Boolean requestCoalescing,
        Integer serveWhileStale,
        String signedUrlCacheMaxAgeSec,
        List<String> signedUrlKeyNames) {
        this.bypassCacheOnRequestHeaders = Objects.requireNonNull(bypassCacheOnRequestHeaders, "expected parameter 'bypassCacheOnRequestHeaders' to be non-null");
        this.cacheKeyPolicy = Objects.requireNonNull(cacheKeyPolicy, "expected parameter 'cacheKeyPolicy' to be non-null");
        this.cacheMode = Objects.requireNonNull(cacheMode, "expected parameter 'cacheMode' to be non-null");
        this.clientTtl = Objects.requireNonNull(clientTtl, "expected parameter 'clientTtl' to be non-null");
        this.defaultTtl = Objects.requireNonNull(defaultTtl, "expected parameter 'defaultTtl' to be non-null");
        this.maxTtl = Objects.requireNonNull(maxTtl, "expected parameter 'maxTtl' to be non-null");
        this.negativeCaching = Objects.requireNonNull(negativeCaching, "expected parameter 'negativeCaching' to be non-null");
        this.negativeCachingPolicy = Objects.requireNonNull(negativeCachingPolicy, "expected parameter 'negativeCachingPolicy' to be non-null");
        this.requestCoalescing = Objects.requireNonNull(requestCoalescing, "expected parameter 'requestCoalescing' to be non-null");
        this.serveWhileStale = Objects.requireNonNull(serveWhileStale, "expected parameter 'serveWhileStale' to be non-null");
        this.signedUrlCacheMaxAgeSec = Objects.requireNonNull(signedUrlCacheMaxAgeSec, "expected parameter 'signedUrlCacheMaxAgeSec' to be non-null");
        this.signedUrlKeyNames = Objects.requireNonNull(signedUrlKeyNames, "expected parameter 'signedUrlKeyNames' to be non-null");
    }

    private BackendBucketCdnPolicyResponse() {
        this.bypassCacheOnRequestHeaders = List.of();
        this.cacheKeyPolicy = null;
        this.cacheMode = null;
        this.clientTtl = null;
        this.defaultTtl = null;
        this.maxTtl = null;
        this.negativeCaching = null;
        this.negativeCachingPolicy = List.of();
        this.requestCoalescing = null;
        this.serveWhileStale = null;
        this.signedUrlCacheMaxAgeSec = null;
        this.signedUrlKeyNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse> bypassCacheOnRequestHeaders;
        private BackendBucketCdnPolicyCacheKeyPolicyResponse cacheKeyPolicy;
        private String cacheMode;
        private Integer clientTtl;
        private Integer defaultTtl;
        private Integer maxTtl;
        private Boolean negativeCaching;
        private List<BackendBucketCdnPolicyNegativeCachingPolicyResponse> negativeCachingPolicy;
        private Boolean requestCoalescing;
        private Integer serveWhileStale;
        private String signedUrlCacheMaxAgeSec;
        private List<String> signedUrlKeyNames;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyResponse defaults) {
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
    	      this.signedUrlKeyNames = defaults.signedUrlKeyNames;
        }

        public Builder setBypassCacheOnRequestHeaders(List<BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse> bypassCacheOnRequestHeaders) {
            this.bypassCacheOnRequestHeaders = Objects.requireNonNull(bypassCacheOnRequestHeaders);
            return this;
        }

        public Builder setCacheKeyPolicy(BackendBucketCdnPolicyCacheKeyPolicyResponse cacheKeyPolicy) {
            this.cacheKeyPolicy = Objects.requireNonNull(cacheKeyPolicy);
            return this;
        }

        public Builder setCacheMode(String cacheMode) {
            this.cacheMode = Objects.requireNonNull(cacheMode);
            return this;
        }

        public Builder setClientTtl(Integer clientTtl) {
            this.clientTtl = Objects.requireNonNull(clientTtl);
            return this;
        }

        public Builder setDefaultTtl(Integer defaultTtl) {
            this.defaultTtl = Objects.requireNonNull(defaultTtl);
            return this;
        }

        public Builder setMaxTtl(Integer maxTtl) {
            this.maxTtl = Objects.requireNonNull(maxTtl);
            return this;
        }

        public Builder setNegativeCaching(Boolean negativeCaching) {
            this.negativeCaching = Objects.requireNonNull(negativeCaching);
            return this;
        }

        public Builder setNegativeCachingPolicy(List<BackendBucketCdnPolicyNegativeCachingPolicyResponse> negativeCachingPolicy) {
            this.negativeCachingPolicy = Objects.requireNonNull(negativeCachingPolicy);
            return this;
        }

        public Builder setRequestCoalescing(Boolean requestCoalescing) {
            this.requestCoalescing = Objects.requireNonNull(requestCoalescing);
            return this;
        }

        public Builder setServeWhileStale(Integer serveWhileStale) {
            this.serveWhileStale = Objects.requireNonNull(serveWhileStale);
            return this;
        }

        public Builder setSignedUrlCacheMaxAgeSec(String signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = Objects.requireNonNull(signedUrlCacheMaxAgeSec);
            return this;
        }

        public Builder setSignedUrlKeyNames(List<String> signedUrlKeyNames) {
            this.signedUrlKeyNames = Objects.requireNonNull(signedUrlKeyNames);
            return this;
        }

        public BackendBucketCdnPolicyResponse build() {
            return new BackendBucketCdnPolicyResponse(bypassCacheOnRequestHeaders, cacheKeyPolicy, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicy, requestCoalescing, serveWhileStale, signedUrlCacheMaxAgeSec, signedUrlKeyNames);
        }
    }
}
