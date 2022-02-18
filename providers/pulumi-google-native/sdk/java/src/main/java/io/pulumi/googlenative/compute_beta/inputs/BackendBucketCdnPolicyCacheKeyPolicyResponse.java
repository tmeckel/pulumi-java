// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Message containing what to include in the cache key for a request for Cloud CDN.
 * 
 */
public final class BackendBucketCdnPolicyCacheKeyPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendBucketCdnPolicyCacheKeyPolicyResponse Empty = new BackendBucketCdnPolicyCacheKeyPolicyResponse();

    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    @InputImport(name="includeHttpHeaders", required=true)
    private final List<String> includeHttpHeaders;

    public List<String> getIncludeHttpHeaders() {
        return this.includeHttpHeaders;
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    @InputImport(name="queryStringWhitelist", required=true)
    private final List<String> queryStringWhitelist;

    public List<String> getQueryStringWhitelist() {
        return this.queryStringWhitelist;
    }

    public BackendBucketCdnPolicyCacheKeyPolicyResponse(
        List<String> includeHttpHeaders,
        List<String> queryStringWhitelist) {
        this.includeHttpHeaders = Objects.requireNonNull(includeHttpHeaders, "expected parameter 'includeHttpHeaders' to be non-null");
        this.queryStringWhitelist = Objects.requireNonNull(queryStringWhitelist, "expected parameter 'queryStringWhitelist' to be non-null");
    }

    private BackendBucketCdnPolicyCacheKeyPolicyResponse() {
        this.includeHttpHeaders = List.of();
        this.queryStringWhitelist = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyCacheKeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> includeHttpHeaders;
        private List<String> queryStringWhitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyCacheKeyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHttpHeaders = defaults.includeHttpHeaders;
    	      this.queryStringWhitelist = defaults.queryStringWhitelist;
        }

        public Builder setIncludeHttpHeaders(List<String> includeHttpHeaders) {
            this.includeHttpHeaders = Objects.requireNonNull(includeHttpHeaders);
            return this;
        }

        public Builder setQueryStringWhitelist(List<String> queryStringWhitelist) {
            this.queryStringWhitelist = Objects.requireNonNull(queryStringWhitelist);
            return this;
        }

        public BackendBucketCdnPolicyCacheKeyPolicyResponse build() {
            return new BackendBucketCdnPolicyCacheKeyPolicyResponse(includeHttpHeaders, queryStringWhitelist);
        }
    }
}
