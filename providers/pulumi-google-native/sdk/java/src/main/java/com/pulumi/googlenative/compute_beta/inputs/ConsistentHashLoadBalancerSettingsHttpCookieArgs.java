// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.DurationArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The information about the HTTP Cookie on which the hash function is based for load balancing policies that use a consistent hash.
 * 
 */
public final class ConsistentHashLoadBalancerSettingsHttpCookieArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsistentHashLoadBalancerSettingsHttpCookieArgs Empty = new ConsistentHashLoadBalancerSettingsHttpCookieArgs();

    /**
     * Name of the cookie.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the cookie.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Path to set for the cookie.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path to set for the cookie.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Lifetime of the cookie.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<DurationArgs> ttl;

    /**
     * @return Lifetime of the cookie.
     * 
     */
    public Optional<Output<DurationArgs>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private ConsistentHashLoadBalancerSettingsHttpCookieArgs() {}

    private ConsistentHashLoadBalancerSettingsHttpCookieArgs(ConsistentHashLoadBalancerSettingsHttpCookieArgs $) {
        this.name = $.name;
        this.path = $.path;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsistentHashLoadBalancerSettingsHttpCookieArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsistentHashLoadBalancerSettingsHttpCookieArgs $;

        public Builder() {
            $ = new ConsistentHashLoadBalancerSettingsHttpCookieArgs();
        }

        public Builder(ConsistentHashLoadBalancerSettingsHttpCookieArgs defaults) {
            $ = new ConsistentHashLoadBalancerSettingsHttpCookieArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the cookie.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the cookie.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Path to set for the cookie.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to set for the cookie.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param ttl Lifetime of the cookie.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<DurationArgs> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Lifetime of the cookie.
         * 
         * @return builder
         * 
         */
        public Builder ttl(DurationArgs ttl) {
            return ttl(Output.of(ttl));
        }

        public ConsistentHashLoadBalancerSettingsHttpCookieArgs build() {
            return $;
        }
    }

}
