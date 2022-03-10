// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message containing what to include in the cache key for a request for Cloud CDN.
 * 
 */
public final class CacheKeyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheKeyPolicyArgs Empty = new CacheKeyPolicyArgs();

    /**
     * If true, requests to different hosts will be cached separately.
     * 
     */
    @InputImport(name="includeHost")
      private final @Nullable Input<Boolean> includeHost;

    public Input<Boolean> getIncludeHost() {
        return this.includeHost == null ? Input.empty() : this.includeHost;
    }

    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    @InputImport(name="includeHttpHeaders")
      private final @Nullable Input<List<String>> includeHttpHeaders;

    public Input<List<String>> getIncludeHttpHeaders() {
        return this.includeHttpHeaders == null ? Input.empty() : this.includeHttpHeaders;
    }

    /**
     * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
     * 
     */
    @InputImport(name="includeNamedCookies")
      private final @Nullable Input<List<String>> includeNamedCookies;

    public Input<List<String>> getIncludeNamedCookies() {
        return this.includeNamedCookies == null ? Input.empty() : this.includeNamedCookies;
    }

    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    @InputImport(name="includeProtocol")
      private final @Nullable Input<Boolean> includeProtocol;

    public Input<Boolean> getIncludeProtocol() {
        return this.includeProtocol == null ? Input.empty() : this.includeProtocol;
    }

    /**
     * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
     * 
     */
    @InputImport(name="includeQueryString")
      private final @Nullable Input<Boolean> includeQueryString;

    public Input<Boolean> getIncludeQueryString() {
        return this.includeQueryString == null ? Input.empty() : this.includeQueryString;
    }

    /**
     * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    @InputImport(name="queryStringBlacklist")
      private final @Nullable Input<List<String>> queryStringBlacklist;

    public Input<List<String>> getQueryStringBlacklist() {
        return this.queryStringBlacklist == null ? Input.empty() : this.queryStringBlacklist;
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    @InputImport(name="queryStringWhitelist")
      private final @Nullable Input<List<String>> queryStringWhitelist;

    public Input<List<String>> getQueryStringWhitelist() {
        return this.queryStringWhitelist == null ? Input.empty() : this.queryStringWhitelist;
    }

    public CacheKeyPolicyArgs(
        @Nullable Input<Boolean> includeHost,
        @Nullable Input<List<String>> includeHttpHeaders,
        @Nullable Input<List<String>> includeNamedCookies,
        @Nullable Input<Boolean> includeProtocol,
        @Nullable Input<Boolean> includeQueryString,
        @Nullable Input<List<String>> queryStringBlacklist,
        @Nullable Input<List<String>> queryStringWhitelist) {
        this.includeHost = includeHost;
        this.includeHttpHeaders = includeHttpHeaders;
        this.includeNamedCookies = includeNamedCookies;
        this.includeProtocol = includeProtocol;
        this.includeQueryString = includeQueryString;
        this.queryStringBlacklist = queryStringBlacklist;
        this.queryStringWhitelist = queryStringWhitelist;
    }

    private CacheKeyPolicyArgs() {
        this.includeHost = Input.empty();
        this.includeHttpHeaders = Input.empty();
        this.includeNamedCookies = Input.empty();
        this.includeProtocol = Input.empty();
        this.includeQueryString = Input.empty();
        this.queryStringBlacklist = Input.empty();
        this.queryStringWhitelist = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> includeHost;
        private @Nullable Input<List<String>> includeHttpHeaders;
        private @Nullable Input<List<String>> includeNamedCookies;
        private @Nullable Input<Boolean> includeProtocol;
        private @Nullable Input<Boolean> includeQueryString;
        private @Nullable Input<List<String>> queryStringBlacklist;
        private @Nullable Input<List<String>> queryStringWhitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheKeyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHost = defaults.includeHost;
    	      this.includeHttpHeaders = defaults.includeHttpHeaders;
    	      this.includeNamedCookies = defaults.includeNamedCookies;
    	      this.includeProtocol = defaults.includeProtocol;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.queryStringBlacklist = defaults.queryStringBlacklist;
    	      this.queryStringWhitelist = defaults.queryStringWhitelist;
        }

        public Builder includeHost(@Nullable Input<Boolean> includeHost) {
            this.includeHost = includeHost;
            return this;
        }

        public Builder includeHost(@Nullable Boolean includeHost) {
            this.includeHost = Input.ofNullable(includeHost);
            return this;
        }

        public Builder includeHttpHeaders(@Nullable Input<List<String>> includeHttpHeaders) {
            this.includeHttpHeaders = includeHttpHeaders;
            return this;
        }

        public Builder includeHttpHeaders(@Nullable List<String> includeHttpHeaders) {
            this.includeHttpHeaders = Input.ofNullable(includeHttpHeaders);
            return this;
        }

        public Builder includeNamedCookies(@Nullable Input<List<String>> includeNamedCookies) {
            this.includeNamedCookies = includeNamedCookies;
            return this;
        }

        public Builder includeNamedCookies(@Nullable List<String> includeNamedCookies) {
            this.includeNamedCookies = Input.ofNullable(includeNamedCookies);
            return this;
        }

        public Builder includeProtocol(@Nullable Input<Boolean> includeProtocol) {
            this.includeProtocol = includeProtocol;
            return this;
        }

        public Builder includeProtocol(@Nullable Boolean includeProtocol) {
            this.includeProtocol = Input.ofNullable(includeProtocol);
            return this;
        }

        public Builder includeQueryString(@Nullable Input<Boolean> includeQueryString) {
            this.includeQueryString = includeQueryString;
            return this;
        }

        public Builder includeQueryString(@Nullable Boolean includeQueryString) {
            this.includeQueryString = Input.ofNullable(includeQueryString);
            return this;
        }

        public Builder queryStringBlacklist(@Nullable Input<List<String>> queryStringBlacklist) {
            this.queryStringBlacklist = queryStringBlacklist;
            return this;
        }

        public Builder queryStringBlacklist(@Nullable List<String> queryStringBlacklist) {
            this.queryStringBlacklist = Input.ofNullable(queryStringBlacklist);
            return this;
        }

        public Builder queryStringWhitelist(@Nullable Input<List<String>> queryStringWhitelist) {
            this.queryStringWhitelist = queryStringWhitelist;
            return this;
        }

        public Builder queryStringWhitelist(@Nullable List<String> queryStringWhitelist) {
            this.queryStringWhitelist = Input.ofNullable(queryStringWhitelist);
            return this;
        }
        public CacheKeyPolicyArgs build() {
            return new CacheKeyPolicyArgs(includeHost, includeHttpHeaders, includeNamedCookies, includeProtocol, includeQueryString, queryStringBlacklist, queryStringWhitelist);
        }
    }
}
