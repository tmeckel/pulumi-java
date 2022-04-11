// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.ResourceCommitmentType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Commitment for a particular resource (a Commitment is composed of one or more of these).
 * 
 */
public final class ResourceCommitmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceCommitmentArgs Empty = new ResourceCommitmentArgs();

    /**
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * 
     */
    @Import(name="acceleratorType")
      private final @Nullable Output<String> acceleratorType;

    public Output<String> getAcceleratorType() {
        return this.acceleratorType == null ? Codegen.empty() : this.acceleratorType;
    }

    /**
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * 
     */
    @Import(name="amount")
      private final @Nullable Output<String> amount;

    public Output<String> getAmount() {
        return this.amount == null ? Codegen.empty() : this.amount;
    }

    /**
     * Type of resource for which this commitment applies. Possible values are VCPU and MEMORY
     * 
     */
    @Import(name="type")
      private final @Nullable Output<ResourceCommitmentType> type;

    public Output<ResourceCommitmentType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ResourceCommitmentArgs(
        @Nullable Output<String> acceleratorType,
        @Nullable Output<String> amount,
        @Nullable Output<ResourceCommitmentType> type) {
        this.acceleratorType = acceleratorType;
        this.amount = amount;
        this.type = type;
    }

    private ResourceCommitmentArgs() {
        this.acceleratorType = Codegen.empty();
        this.amount = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acceleratorType;
        private @Nullable Output<String> amount;
        private @Nullable Output<ResourceCommitmentType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCommitmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.amount = defaults.amount;
    	      this.type = defaults.type;
        }

        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public Builder acceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = Codegen.ofNullable(acceleratorType);
            return this;
        }
        public Builder amount(@Nullable Output<String> amount) {
            this.amount = amount;
            return this;
        }
        public Builder amount(@Nullable String amount) {
            this.amount = Codegen.ofNullable(amount);
            return this;
        }
        public Builder type(@Nullable Output<ResourceCommitmentType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable ResourceCommitmentType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ResourceCommitmentArgs build() {
            return new ResourceCommitmentArgs(acceleratorType, amount, type);
        }
    }
}
