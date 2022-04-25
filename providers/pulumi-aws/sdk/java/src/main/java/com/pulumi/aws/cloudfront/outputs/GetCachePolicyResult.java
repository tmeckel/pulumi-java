// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOrigin;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCachePolicyResult {
    /**
     * @return A comment to describe the cache policy.
     * 
     */
    private final String comment;
    /**
     * @return The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    private final Integer defaultTtl;
    /**
     * @return The current version of the cache policy.
     * 
     */
    private final String etag;
    private final @Nullable String id;
    /**
     * @return The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    private final Integer maxTtl;
    /**
     * @return The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    private final Integer minTtl;
    private final @Nullable String name;
    /**
     * @return The HTTP headers, cookies, and URL query strings to include in the cache key. See Parameters In Cache Key And Forwarded To Origin for more information.
     * 
     */
    private final List<GetCachePolicyParametersInCacheKeyAndForwardedToOrigin> parametersInCacheKeyAndForwardedToOrigins;

    @CustomType.Constructor
    private GetCachePolicyResult(
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("defaultTtl") Integer defaultTtl,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("maxTtl") Integer maxTtl,
        @CustomType.Parameter("minTtl") Integer minTtl,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("parametersInCacheKeyAndForwardedToOrigins") List<GetCachePolicyParametersInCacheKeyAndForwardedToOrigin> parametersInCacheKeyAndForwardedToOrigins) {
        this.comment = comment;
        this.defaultTtl = defaultTtl;
        this.etag = etag;
        this.id = id;
        this.maxTtl = maxTtl;
        this.minTtl = minTtl;
        this.name = name;
        this.parametersInCacheKeyAndForwardedToOrigins = parametersInCacheKeyAndForwardedToOrigins;
    }

    /**
     * @return A comment to describe the cache policy.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return The default amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    public Integer defaultTtl() {
        return this.defaultTtl;
    }
    /**
     * @return The current version of the cache policy.
     * 
     */
    public String etag() {
        return this.etag;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The maximum amount of time, in seconds, that objects stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    public Integer maxTtl() {
        return this.maxTtl;
    }
    /**
     * @return The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache before CloudFront sends another request to the origin to see if the object has been updated.
     * 
     */
    public Integer minTtl() {
        return this.minTtl;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The HTTP headers, cookies, and URL query strings to include in the cache key. See Parameters In Cache Key And Forwarded To Origin for more information.
     * 
     */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOrigin> parametersInCacheKeyAndForwardedToOrigins() {
        return this.parametersInCacheKeyAndForwardedToOrigins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;
        private Integer defaultTtl;
        private String etag;
        private @Nullable String id;
        private Integer maxTtl;
        private Integer minTtl;
        private @Nullable String name;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOrigin> parametersInCacheKeyAndForwardedToOrigins;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.maxTtl = defaults.maxTtl;
    	      this.minTtl = defaults.minTtl;
    	      this.name = defaults.name;
    	      this.parametersInCacheKeyAndForwardedToOrigins = defaults.parametersInCacheKeyAndForwardedToOrigins;
        }

        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder defaultTtl(Integer defaultTtl) {
            this.defaultTtl = Objects.requireNonNull(defaultTtl);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder maxTtl(Integer maxTtl) {
            this.maxTtl = Objects.requireNonNull(maxTtl);
            return this;
        }
        public Builder minTtl(Integer minTtl) {
            this.minTtl = Objects.requireNonNull(minTtl);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder parametersInCacheKeyAndForwardedToOrigins(List<GetCachePolicyParametersInCacheKeyAndForwardedToOrigin> parametersInCacheKeyAndForwardedToOrigins) {
            this.parametersInCacheKeyAndForwardedToOrigins = Objects.requireNonNull(parametersInCacheKeyAndForwardedToOrigins);
            return this;
        }
        public Builder parametersInCacheKeyAndForwardedToOrigins(GetCachePolicyParametersInCacheKeyAndForwardedToOrigin... parametersInCacheKeyAndForwardedToOrigins) {
            return parametersInCacheKeyAndForwardedToOrigins(List.of(parametersInCacheKeyAndForwardedToOrigins));
        }        public GetCachePolicyResult build() {
            return new GetCachePolicyResult(comment, defaultTtl, etag, id, maxTtl, minTtl, name, parametersInCacheKeyAndForwardedToOrigins);
        }
    }
}
