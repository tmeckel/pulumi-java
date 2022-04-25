// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerSkuResponse {
    /**
     * @return Name of a load balancer SKU.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Tier of a load balancer SKU.
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private LoadBalancerSkuResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.name = name;
        this.tier = tier;
    }

    /**
     * @return Name of a load balancer SKU.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Tier of a load balancer SKU.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public LoadBalancerSkuResponse build() {
            return new LoadBalancerSkuResponse(name, tier);
        }
    }
}
