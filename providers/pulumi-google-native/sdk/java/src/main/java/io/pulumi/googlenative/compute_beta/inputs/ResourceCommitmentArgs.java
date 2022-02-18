// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.ResourceCommitmentType;
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
    @InputImport(name="acceleratorType")
    private final @Nullable Input<String> acceleratorType;

    public Input<String> getAcceleratorType() {
        return this.acceleratorType == null ? Input.empty() : this.acceleratorType;
    }

    /**
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * 
     */
    @InputImport(name="amount")
    private final @Nullable Input<String> amount;

    public Input<String> getAmount() {
        return this.amount == null ? Input.empty() : this.amount;
    }

    /**
     * Type of resource for which this commitment applies. Possible values are VCPU and MEMORY
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<ResourceCommitmentType> type;

    public Input<ResourceCommitmentType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ResourceCommitmentArgs(
        @Nullable Input<String> acceleratorType,
        @Nullable Input<String> amount,
        @Nullable Input<ResourceCommitmentType> type) {
        this.acceleratorType = acceleratorType;
        this.amount = amount;
        this.type = type;
    }

    private ResourceCommitmentArgs() {
        this.acceleratorType = Input.empty();
        this.amount = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceleratorType;
        private @Nullable Input<String> amount;
        private @Nullable Input<ResourceCommitmentType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCommitmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.amount = defaults.amount;
    	      this.type = defaults.type;
        }

        public Builder setAcceleratorType(@Nullable Input<String> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        public Builder setAcceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = Input.ofNullable(acceleratorType);
            return this;
        }

        public Builder setAmount(@Nullable Input<String> amount) {
            this.amount = amount;
            return this;
        }

        public Builder setAmount(@Nullable String amount) {
            this.amount = Input.ofNullable(amount);
            return this;
        }

        public Builder setType(@Nullable Input<ResourceCommitmentType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ResourceCommitmentType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ResourceCommitmentArgs build() {
            return new ResourceCommitmentArgs(acceleratorType, amount, type);
        }
    }
}
