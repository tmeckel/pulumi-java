// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs();

    /**
     * A list of item names (cookies, headers, or query strings).
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<String>> items;

    /**
     * @return A list of item names (cookies, headers, or query strings).
     * 
     */
    public Optional<Output<List<String>>> items() {
        return Optional.ofNullable(this.items);
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs() {}

    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs $;

        public Builder() {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs();
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs defaults) {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items A list of item names (cookies, headers, or query strings).
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<String>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items A list of item names (cookies, headers, or query strings).
         * 
         * @return builder
         * 
         */
        public Builder items(List<String> items) {
            return items(Output.of(items));
        }

        /**
         * @param items A list of item names (cookies, headers, or query strings).
         * 
         * @return builder
         * 
         */
        public Builder items(String... items) {
            return items(List.of(items));
        }

        public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs build() {
            return $;
        }
    }

}
