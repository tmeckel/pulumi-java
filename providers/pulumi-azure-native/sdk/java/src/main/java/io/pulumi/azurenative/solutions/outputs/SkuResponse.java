// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SkuResponse {
    private final @Nullable Integer capacity;
    private final @Nullable String family;
    private final @Nullable String model;
    private final String name;
    private final @Nullable String size;
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"capacity","family","model","name","size","tier"})
    private SkuResponse(
        @Nullable Integer capacity,
        @Nullable String family,
        @Nullable String model,
        String name,
        @Nullable String size,
        @Nullable String tier) {
        this.capacity = capacity;
        this.family = family;
        this.model = model;
        this.name = Objects.requireNonNull(name);
        this.size = size;
        this.tier = tier;
    }

    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    public Optional<String> getFamily() {
        return Optional.ofNullable(this.family);
    }
    public Optional<String> getModel() {
        return Optional.ofNullable(this.model);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getSize() {
        return Optional.ofNullable(this.size);
    }
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String family;
        private @Nullable String model;
        private String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder setModel(@Nullable String model) {
            this.model = model;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }

        public SkuResponse build() {
            return new SkuResponse(capacity, family, model, name, size, tier);
        }
    }
}
