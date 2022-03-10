// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality.inputs;

import io.pulumi.azurenative.mixedreality.enums.SkuTier;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The resource model definition representing SKU
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    @InputImport(name="family")
      private final @Nullable Input<String> family;

    public Input<String> getFamily() {
        return this.family == null ? Input.empty() : this.family;
    }

    /**
     * The name of the SKU. Ex - P3. It is typically a letter+number code
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
     * 
     */
    @InputImport(name="size")
      private final @Nullable Input<String> size;

    public Input<String> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * This field is required to be implemented by the Resource Provider if the service has more than one tier, but is not required on a PUT.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Input<SkuTier> tier;

    public Input<SkuTier> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public SkuArgs(
        @Nullable Input<Integer> capacity,
        @Nullable Input<String> family,
        Input<String> name,
        @Nullable Input<String> size,
        @Nullable Input<SkuTier> tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.size = size;
        this.tier = tier;
    }

    private SkuArgs() {
        this.capacity = Input.empty();
        this.family = Input.empty();
        this.name = Input.empty();
        this.size = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacity;
        private @Nullable Input<String> family;
        private Input<String> name;
        private @Nullable Input<String> size;
        private @Nullable Input<SkuTier> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Input<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder family(@Nullable Input<String> family) {
            this.family = family;
            return this;
        }

        public Builder family(@Nullable String family) {
            this.family = Input.ofNullable(family);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder size(@Nullable Input<String> size) {
            this.size = size;
            return this;
        }

        public Builder size(@Nullable String size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder tier(@Nullable Input<SkuTier> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable SkuTier tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public SkuArgs build() {
            return new SkuArgs(capacity, family, name, size, tier);
        }
    }
}
