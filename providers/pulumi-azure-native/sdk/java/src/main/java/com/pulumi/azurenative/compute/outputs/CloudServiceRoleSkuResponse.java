// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudServiceRoleSkuResponse {
    /**
     * @return Specifies the number of role instances in the cloud service.
     * 
     */
    private final @Nullable Double capacity;
    /**
     * @return The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need to delete and recreate the cloud service or move back to the old sku.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Specifies the tier of the cloud service. Possible Values are &lt;br /&gt;&lt;br /&gt; **Standard** &lt;br /&gt;&lt;br /&gt; **Basic**
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private CloudServiceRoleSkuResponse(
        @CustomType.Parameter("capacity") @Nullable Double capacity,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    /**
     * @return Specifies the number of role instances in the cloud service.
     * 
     */
    public Optional<Double> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need to delete and recreate the cloud service or move back to the old sku.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Specifies the tier of the cloud service. Possible Values are &lt;br /&gt;&lt;br /&gt; **Standard** &lt;br /&gt;&lt;br /&gt; **Basic**
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceRoleSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacity;
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceRoleSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Double capacity) {
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
        }        public CloudServiceRoleSkuResponse build() {
            return new CloudServiceRoleSkuResponse(capacity, name, tier);
        }
    }
}
