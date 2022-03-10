// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The SKU of the Maps Account.
 * 
 */
public final class SkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * The name of the SKU, in standard format (such as S0).
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Gets the sku tier. This is based on the SKU name.
     * 
     */
    @InputImport(name="tier", required=true)
      private final String tier;

    public String getTier() {
        return this.tier;
    }

    public SkuResponse(
        String name,
        String tier) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private SkuResponse() {
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public SkuResponse build() {
            return new SkuResponse(name, tier);
        }
    }
}
