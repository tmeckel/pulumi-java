// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PeeringSkuResponse {
    private final @Nullable String family;
    private final @Nullable String name;
    private final @Nullable String size;
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"family","name","size","tier"})
    private PeeringSkuResponse(
        @Nullable String family,
        @Nullable String name,
        @Nullable String size,
        @Nullable String tier) {
        this.family = family;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    public Optional<String> getFamily() {
        return Optional.ofNullable(this.family);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
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

    public static Builder builder(PeeringSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String family;
        private @Nullable String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
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

        public PeeringSkuResponse build() {
            return new PeeringSkuResponse(family, name, size, tier);
        }
    }
}
