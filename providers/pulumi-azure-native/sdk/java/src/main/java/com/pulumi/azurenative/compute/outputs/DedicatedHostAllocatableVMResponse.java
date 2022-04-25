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
public final class DedicatedHostAllocatableVMResponse {
    /**
     * @return Maximum number of VMs of size vmSize that can fit in the dedicated host&#39;s remaining capacity.
     * 
     */
    private final @Nullable Double count;
    /**
     * @return VM size in terms of which the unutilized capacity is represented.
     * 
     */
    private final @Nullable String vmSize;

    @CustomType.Constructor
    private DedicatedHostAllocatableVMResponse(
        @CustomType.Parameter("count") @Nullable Double count,
        @CustomType.Parameter("vmSize") @Nullable String vmSize) {
        this.count = count;
        this.vmSize = vmSize;
    }

    /**
     * @return Maximum number of VMs of size vmSize that can fit in the dedicated host&#39;s remaining capacity.
     * 
     */
    public Optional<Double> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return VM size in terms of which the unutilized capacity is represented.
     * 
     */
    public Optional<String> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostAllocatableVMResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double count;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostAllocatableVMResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder count(@Nullable Double count) {
            this.count = count;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }        public DedicatedHostAllocatableVMResponse build() {
            return new DedicatedHostAllocatableVMResponse(count, vmSize);
        }
    }
}
