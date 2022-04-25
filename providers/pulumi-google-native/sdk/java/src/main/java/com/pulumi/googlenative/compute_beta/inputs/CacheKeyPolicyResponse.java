// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Message containing what to include in the cache key for a request for Cloud CDN.
 * 
 */
public final class CacheKeyPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final CacheKeyPolicyResponse Empty = new CacheKeyPolicyResponse();

    /**
     * If true, requests to different hosts will be cached separately.
     * 
     */
    @Import(name="includeHost", required=true)
    private Boolean includeHost;

    /**
     * @return If true, requests to different hosts will be cached separately.
     * 
     */
    public Boolean includeHost() {
        return this.includeHost;
    }

    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    @Import(name="includeHttpHeaders", required=true)
    private List<String> includeHttpHeaders;

    /**
     * @return Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    public List<String> includeHttpHeaders() {
        return this.includeHttpHeaders;
    }

    /**
     * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
     * 
     */
    @Import(name="includeNamedCookies", required=true)
    private List<String> includeNamedCookies;

    /**
     * @return Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
     * 
     */
    public List<String> includeNamedCookies() {
        return this.includeNamedCookies;
    }

    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    @Import(name="includeProtocol", required=true)
    private Boolean includeProtocol;

    /**
     * @return If true, http and https requests will be cached separately.
     * 
     */
    public Boolean includeProtocol() {
        return this.includeProtocol;
    }

    /**
     * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
     * 
     */
    @Import(name="includeQueryString", required=true)
    private Boolean includeQueryString;

    /**
     * @return If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
     * 
     */
    public Boolean includeQueryString() {
        return this.includeQueryString;
    }

    /**
     * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="queryStringBlacklist", required=true)
    private List<String> queryStringBlacklist;

    /**
     * @return Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    public List<String> queryStringBlacklist() {
        return this.queryStringBlacklist;
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="queryStringWhitelist", required=true)
    private List<String> queryStringWhitelist;

    /**
     * @return Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    public List<String> queryStringWhitelist() {
        return this.queryStringWhitelist;
    }

    private CacheKeyPolicyResponse() {}

    private CacheKeyPolicyResponse(CacheKeyPolicyResponse $) {
        this.includeHost = $.includeHost;
        this.includeHttpHeaders = $.includeHttpHeaders;
        this.includeNamedCookies = $.includeNamedCookies;
        this.includeProtocol = $.includeProtocol;
        this.includeQueryString = $.includeQueryString;
        this.queryStringBlacklist = $.queryStringBlacklist;
        this.queryStringWhitelist = $.queryStringWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheKeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheKeyPolicyResponse $;

        public Builder() {
            $ = new CacheKeyPolicyResponse();
        }

        public Builder(CacheKeyPolicyResponse defaults) {
            $ = new CacheKeyPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeHost If true, requests to different hosts will be cached separately.
         * 
         * @return builder
         * 
         */
        public Builder includeHost(Boolean includeHost) {
            $.includeHost = includeHost;
            return this;
        }

        /**
         * @param includeHttpHeaders Allows HTTP request headers (by name) to be used in the cache key.
         * 
         * @return builder
         * 
         */
        public Builder includeHttpHeaders(List<String> includeHttpHeaders) {
            $.includeHttpHeaders = includeHttpHeaders;
            return this;
        }

        /**
         * @param includeHttpHeaders Allows HTTP request headers (by name) to be used in the cache key.
         * 
         * @return builder
         * 
         */
        public Builder includeHttpHeaders(String... includeHttpHeaders) {
            return includeHttpHeaders(List.of(includeHttpHeaders));
        }

        /**
         * @param includeNamedCookies Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
         * 
         * @return builder
         * 
         */
        public Builder includeNamedCookies(List<String> includeNamedCookies) {
            $.includeNamedCookies = includeNamedCookies;
            return this;
        }

        /**
         * @param includeNamedCookies Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
         * 
         * @return builder
         * 
         */
        public Builder includeNamedCookies(String... includeNamedCookies) {
            return includeNamedCookies(List.of(includeNamedCookies));
        }

        /**
         * @param includeProtocol If true, http and https requests will be cached separately.
         * 
         * @return builder
         * 
         */
        public Builder includeProtocol(Boolean includeProtocol) {
            $.includeProtocol = includeProtocol;
            return this;
        }

        /**
         * @param includeQueryString If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
         * 
         * @return builder
         * 
         */
        public Builder includeQueryString(Boolean includeQueryString) {
            $.includeQueryString = includeQueryString;
            return this;
        }

        /**
         * @param queryStringBlacklist Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringBlacklist(List<String> queryStringBlacklist) {
            $.queryStringBlacklist = queryStringBlacklist;
            return this;
        }

        /**
         * @param queryStringBlacklist Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringBlacklist(String... queryStringBlacklist) {
            return queryStringBlacklist(List.of(queryStringBlacklist));
        }

        /**
         * @param queryStringWhitelist Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringWhitelist(List<String> queryStringWhitelist) {
            $.queryStringWhitelist = queryStringWhitelist;
            return this;
        }

        /**
         * @param queryStringWhitelist Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringWhitelist(String... queryStringWhitelist) {
            return queryStringWhitelist(List.of(queryStringWhitelist));
        }

        public CacheKeyPolicyResponse build() {
            $.includeHost = Objects.requireNonNull($.includeHost, "expected parameter 'includeHost' to be non-null");
            $.includeHttpHeaders = Objects.requireNonNull($.includeHttpHeaders, "expected parameter 'includeHttpHeaders' to be non-null");
            $.includeNamedCookies = Objects.requireNonNull($.includeNamedCookies, "expected parameter 'includeNamedCookies' to be non-null");
            $.includeProtocol = Objects.requireNonNull($.includeProtocol, "expected parameter 'includeProtocol' to be non-null");
            $.includeQueryString = Objects.requireNonNull($.includeQueryString, "expected parameter 'includeQueryString' to be non-null");
            $.queryStringBlacklist = Objects.requireNonNull($.queryStringBlacklist, "expected parameter 'queryStringBlacklist' to be non-null");
            $.queryStringWhitelist = Objects.requireNonNull($.queryStringWhitelist, "expected parameter 'queryStringWhitelist' to be non-null");
            return $;
        }
    }

}
