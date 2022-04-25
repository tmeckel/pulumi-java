// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings {
    /**
     * @return A list of item names (cookies, headers, or query strings).
     * 
     */
    private final @Nullable List<String> items;

    @CustomType.Constructor
    private CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings(@CustomType.Parameter("items") @Nullable List<String> items) {
        this.items = items;
    }

    /**
     * @return A list of item names (cookies, headers, or query strings).
     * 
     */
    public List<String> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable List<String> items) {
            this.items = items;
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings(items);
        }
    }
}
