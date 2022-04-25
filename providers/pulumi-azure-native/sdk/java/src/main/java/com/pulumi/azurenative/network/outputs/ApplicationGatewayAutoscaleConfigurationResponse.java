// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayAutoscaleConfigurationResponse {
    /**
     * @return Upper bound on number of Application Gateway capacity.
     * 
     */
    private final @Nullable Integer maxCapacity;
    /**
     * @return Lower bound on number of Application Gateway capacity.
     * 
     */
    private final Integer minCapacity;

    @CustomType.Constructor
    private ApplicationGatewayAutoscaleConfigurationResponse(
        @CustomType.Parameter("maxCapacity") @Nullable Integer maxCapacity,
        @CustomType.Parameter("minCapacity") Integer minCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
    }

    /**
     * @return Upper bound on number of Application Gateway capacity.
     * 
     */
    public Optional<Integer> maxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }
    /**
     * @return Lower bound on number of Application Gateway capacity.
     * 
     */
    public Integer minCapacity() {
        return this.minCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayAutoscaleConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxCapacity;
        private Integer minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayAutoscaleConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder maxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Builder minCapacity(Integer minCapacity) {
            this.minCapacity = Objects.requireNonNull(minCapacity);
            return this;
        }        public ApplicationGatewayAutoscaleConfigurationResponse build() {
            return new ApplicationGatewayAutoscaleConfigurationResponse(maxCapacity, minCapacity);
        }
    }
}
