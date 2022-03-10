// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewaySkuResponse {
    /**
     * Capacity (instance count) of an application gateway.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * Name of an application gateway SKU.
     * 
     */
    private final @Nullable String name;
    /**
     * Tier of an application gateway.
     * 
     */
    private final @Nullable String tier;

    @OutputCustomType.Constructor
    private ApplicationGatewaySkuResponse(
        @OutputCustomType.Parameter("capacity") @Nullable Integer capacity,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    /**
     * Capacity (instance count) of an application gateway.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Name of an application gateway SKU.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Tier of an application gateway.
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public ApplicationGatewaySkuResponse build() {
            return new ApplicationGatewaySkuResponse(capacity, name, tier);
        }
    }
}
