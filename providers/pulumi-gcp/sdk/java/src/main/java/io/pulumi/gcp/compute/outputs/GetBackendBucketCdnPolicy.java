// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetBackendBucketCdnPolicyNegativeCachingPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBackendBucketCdnPolicy {
    private final String cacheMode;
    private final Integer clientTtl;
    private final Integer defaultTtl;
    private final Integer maxTtl;
    private final Boolean negativeCaching;
    private final List<GetBackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;
    private final Integer serveWhileStale;
    private final Integer signedUrlCacheMaxAgeSec;

    @OutputCustomType.Constructor
    private GetBackendBucketCdnPolicy(
        @OutputCustomType.Parameter("cacheMode") String cacheMode,
        @OutputCustomType.Parameter("clientTtl") Integer clientTtl,
        @OutputCustomType.Parameter("defaultTtl") Integer defaultTtl,
        @OutputCustomType.Parameter("maxTtl") Integer maxTtl,
        @OutputCustomType.Parameter("negativeCaching") Boolean negativeCaching,
        @OutputCustomType.Parameter("negativeCachingPolicies") List<GetBackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies,
        @OutputCustomType.Parameter("serveWhileStale") Integer serveWhileStale,
        @OutputCustomType.Parameter("signedUrlCacheMaxAgeSec") Integer signedUrlCacheMaxAgeSec) {
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicies = negativeCachingPolicies;
        this.serveWhileStale = serveWhileStale;
        this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    }

    public String getCacheMode() {
        return this.cacheMode;
    }
    public Integer getClientTtl() {
        return this.clientTtl;
    }
    public Integer getDefaultTtl() {
        return this.defaultTtl;
    }
    public Integer getMaxTtl() {
        return this.maxTtl;
    }
    public Boolean getNegativeCaching() {
        return this.negativeCaching;
    }
    public List<GetBackendBucketCdnPolicyNegativeCachingPolicy> getNegativeCachingPolicies() {
        return this.negativeCachingPolicies;
    }
    public Integer getServeWhileStale() {
        return this.serveWhileStale;
    }
    public Integer getSignedUrlCacheMaxAgeSec() {
        return this.signedUrlCacheMaxAgeSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendBucketCdnPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cacheMode;
        private Integer clientTtl;
        private Integer defaultTtl;
        private Integer maxTtl;
        private Boolean negativeCaching;
        private List<GetBackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;
        private Integer serveWhileStale;
        private Integer signedUrlCacheMaxAgeSec;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendBucketCdnPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicies = defaults.negativeCachingPolicies;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
        }

        public Builder cacheMode(String cacheMode) {
            this.cacheMode = Objects.requireNonNull(cacheMode);
            return this;
        }

        public Builder clientTtl(Integer clientTtl) {
            this.clientTtl = Objects.requireNonNull(clientTtl);
            return this;
        }

        public Builder defaultTtl(Integer defaultTtl) {
            this.defaultTtl = Objects.requireNonNull(defaultTtl);
            return this;
        }

        public Builder maxTtl(Integer maxTtl) {
            this.maxTtl = Objects.requireNonNull(maxTtl);
            return this;
        }

        public Builder negativeCaching(Boolean negativeCaching) {
            this.negativeCaching = Objects.requireNonNull(negativeCaching);
            return this;
        }

        public Builder negativeCachingPolicies(List<GetBackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies) {
            this.negativeCachingPolicies = Objects.requireNonNull(negativeCachingPolicies);
            return this;
        }

        public Builder serveWhileStale(Integer serveWhileStale) {
            this.serveWhileStale = Objects.requireNonNull(serveWhileStale);
            return this;
        }

        public Builder signedUrlCacheMaxAgeSec(Integer signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = Objects.requireNonNull(signedUrlCacheMaxAgeSec);
            return this;
        }
        public GetBackendBucketCdnPolicy build() {
            return new GetBackendBucketCdnPolicy(cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicies, serveWhileStale, signedUrlCacheMaxAgeSec);
        }
    }
}
