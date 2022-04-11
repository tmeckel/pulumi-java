// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies options for controlling advanced machine features. Options that would traditionally be configured in a BIOS belong here. Features that require operating system support may have corresponding entries in the GuestOsFeatures of an Image (e.g., whether or not the OS in the Image supports nested virtualization being enabled or disabled).
 * 
 */
public final class AdvancedMachineFeaturesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdvancedMachineFeaturesArgs Empty = new AdvancedMachineFeaturesArgs();

    /**
     * Whether to enable nested virtualization or not (default is false).
     * 
     */
    @Import(name="enableNestedVirtualization")
      private final @Nullable Output<Boolean> enableNestedVirtualization;

    public Output<Boolean> getEnableNestedVirtualization() {
        return this.enableNestedVirtualization == null ? Codegen.empty() : this.enableNestedVirtualization;
    }

    /**
     * Whether to enable UEFI networking for instance creation.
     * 
     */
    @Import(name="enableUefiNetworking")
      private final @Nullable Output<Boolean> enableUefiNetworking;

    public Output<Boolean> getEnableUefiNetworking() {
        return this.enableUefiNetworking == null ? Codegen.empty() : this.enableUefiNetworking;
    }

    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    @Import(name="threadsPerCore")
      private final @Nullable Output<Integer> threadsPerCore;

    public Output<Integer> getThreadsPerCore() {
        return this.threadsPerCore == null ? Codegen.empty() : this.threadsPerCore;
    }

    public AdvancedMachineFeaturesArgs(
        @Nullable Output<Boolean> enableNestedVirtualization,
        @Nullable Output<Boolean> enableUefiNetworking,
        @Nullable Output<Integer> threadsPerCore) {
        this.enableNestedVirtualization = enableNestedVirtualization;
        this.enableUefiNetworking = enableUefiNetworking;
        this.threadsPerCore = threadsPerCore;
    }

    private AdvancedMachineFeaturesArgs() {
        this.enableNestedVirtualization = Codegen.empty();
        this.enableUefiNetworking = Codegen.empty();
        this.threadsPerCore = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedMachineFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableNestedVirtualization;
        private @Nullable Output<Boolean> enableUefiNetworking;
        private @Nullable Output<Integer> threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedMachineFeaturesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.enableUefiNetworking = defaults.enableUefiNetworking;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder enableNestedVirtualization(@Nullable Output<Boolean> enableNestedVirtualization) {
            this.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }
        public Builder enableNestedVirtualization(@Nullable Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Codegen.ofNullable(enableNestedVirtualization);
            return this;
        }
        public Builder enableUefiNetworking(@Nullable Output<Boolean> enableUefiNetworking) {
            this.enableUefiNetworking = enableUefiNetworking;
            return this;
        }
        public Builder enableUefiNetworking(@Nullable Boolean enableUefiNetworking) {
            this.enableUefiNetworking = Codegen.ofNullable(enableUefiNetworking);
            return this;
        }
        public Builder threadsPerCore(@Nullable Output<Integer> threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Builder threadsPerCore(@Nullable Integer threadsPerCore) {
            this.threadsPerCore = Codegen.ofNullable(threadsPerCore);
            return this;
        }        public AdvancedMachineFeaturesArgs build() {
            return new AdvancedMachineFeaturesArgs(enableNestedVirtualization, enableUefiNetworking, threadsPerCore);
        }
    }
}
