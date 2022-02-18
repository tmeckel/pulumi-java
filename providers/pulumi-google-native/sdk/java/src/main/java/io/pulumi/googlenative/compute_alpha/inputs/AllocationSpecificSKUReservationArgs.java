// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.AllocationSpecificSKUAllocationReservedInstancePropertiesArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This reservation type allows to pre allocate specific instance configuration. Next ID: 5
 * 
 */
public final class AllocationSpecificSKUReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllocationSpecificSKUReservationArgs Empty = new AllocationSpecificSKUReservationArgs();

    /**
     * Specifies the number of resources that are allocated.
     * 
     */
    @InputImport(name="count")
    private final @Nullable Input<String> count;

    public Input<String> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * The instance properties for the reservation.
     * 
     */
    @InputImport(name="instanceProperties")
    private final @Nullable Input<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties;

    public Input<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> getInstanceProperties() {
        return this.instanceProperties == null ? Input.empty() : this.instanceProperties;
    }

    public AllocationSpecificSKUReservationArgs(
        @Nullable Input<String> count,
        @Nullable Input<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties) {
        this.count = count;
        this.instanceProperties = instanceProperties;
    }

    private AllocationSpecificSKUReservationArgs() {
        this.count = Input.empty();
        this.instanceProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> count;
        private @Nullable Input<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.instanceProperties = defaults.instanceProperties;
        }

        public Builder setCount(@Nullable Input<String> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable String count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setInstanceProperties(@Nullable Input<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties) {
            this.instanceProperties = instanceProperties;
            return this;
        }

        public Builder setInstanceProperties(@Nullable AllocationSpecificSKUAllocationReservedInstancePropertiesArgs instanceProperties) {
            this.instanceProperties = Input.ofNullable(instanceProperties);
            return this;
        }

        public AllocationSpecificSKUReservationArgs build() {
            return new AllocationSpecificSKUReservationArgs(count, instanceProperties);
        }
    }
}
