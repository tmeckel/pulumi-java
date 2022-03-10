// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationServiceEnvironmentSkuResponse {
    /**
     * The sku capacity.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * The sku name.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor
    private IntegrationServiceEnvironmentSkuResponse(
        @OutputCustomType.Parameter("capacity") @Nullable Integer capacity,
        @OutputCustomType.Parameter("name") @Nullable String name) {
        this.capacity = capacity;
        this.name = name;
    }

    /**
     * The sku capacity.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * The sku name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmentSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmentSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public IntegrationServiceEnvironmentSkuResponse build() {
            return new IntegrationServiceEnvironmentSkuResponse(capacity, name);
        }
    }
}
