// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the cloud service role sku.
 * 
 */
public final class CloudServiceRoleSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceRoleSkuArgs Empty = new CloudServiceRoleSkuArgs();

    /**
     * Specifies the number of role instances in the cloud service.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Double> capacity;

    public Output<Double> getCapacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need to delete and recreate the cloud service or move back to the old sku.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specifies the tier of the cloud service. Possible Values are <br /><br /> **Standard** <br /><br /> **Basic**
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Codegen.empty() : this.tier;
    }

    public CloudServiceRoleSkuArgs(
        @Nullable Output<Double> capacity,
        @Nullable Output<String> name,
        @Nullable Output<String> tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    private CloudServiceRoleSkuArgs() {
        this.capacity = Codegen.empty();
        this.name = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceRoleSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> capacity;
        private @Nullable Output<String> name;
        private @Nullable Output<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceRoleSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Output<Double> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable Double capacity) {
            this.capacity = Codegen.ofNullable(capacity);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tier(@Nullable Output<String> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = Codegen.ofNullable(tier);
            return this;
        }        public CloudServiceRoleSkuArgs build() {
            return new CloudServiceRoleSkuArgs(capacity, name, tier);
        }
    }
}
