// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.A2AContainerMappingInputArgs;
import com.pulumi.azurenative.recoveryservices.inputs.VMwareCbtContainerMappingInputArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configure pairing input properties.
 * 
 */
public final class CreateProtectionContainerMappingInputPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CreateProtectionContainerMappingInputPropertiesArgs Empty = new CreateProtectionContainerMappingInputPropertiesArgs();

    /**
     * Applicable policy.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return Applicable policy.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * Provider specific input for pairing.
     * 
     */
    @Import(name="providerSpecificInput")
    private @Nullable Output<Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs>> providerSpecificInput;

    /**
     * @return Provider specific input for pairing.
     * 
     */
    public Optional<Output<Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs>>> providerSpecificInput() {
        return Optional.ofNullable(this.providerSpecificInput);
    }

    /**
     * The target unique protection container name.
     * 
     */
    @Import(name="targetProtectionContainerId")
    private @Nullable Output<String> targetProtectionContainerId;

    /**
     * @return The target unique protection container name.
     * 
     */
    public Optional<Output<String>> targetProtectionContainerId() {
        return Optional.ofNullable(this.targetProtectionContainerId);
    }

    private CreateProtectionContainerMappingInputPropertiesArgs() {}

    private CreateProtectionContainerMappingInputPropertiesArgs(CreateProtectionContainerMappingInputPropertiesArgs $) {
        this.policyId = $.policyId;
        this.providerSpecificInput = $.providerSpecificInput;
        this.targetProtectionContainerId = $.targetProtectionContainerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreateProtectionContainerMappingInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreateProtectionContainerMappingInputPropertiesArgs $;

        public Builder() {
            $ = new CreateProtectionContainerMappingInputPropertiesArgs();
        }

        public Builder(CreateProtectionContainerMappingInputPropertiesArgs defaults) {
            $ = new CreateProtectionContainerMappingInputPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyId Applicable policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId Applicable policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param providerSpecificInput Provider specific input for pairing.
         * 
         * @return builder
         * 
         */
        public Builder providerSpecificInput(@Nullable Output<Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs>> providerSpecificInput) {
            $.providerSpecificInput = providerSpecificInput;
            return this;
        }

        /**
         * @param providerSpecificInput Provider specific input for pairing.
         * 
         * @return builder
         * 
         */
        public Builder providerSpecificInput(Either<A2AContainerMappingInputArgs,VMwareCbtContainerMappingInputArgs> providerSpecificInput) {
            return providerSpecificInput(Output.of(providerSpecificInput));
        }

        /**
         * @param providerSpecificInput Provider specific input for pairing.
         * 
         * @return builder
         * 
         */
        public Builder providerSpecificInput(A2AContainerMappingInputArgs providerSpecificInput) {
            return providerSpecificInput(Either.ofLeft(providerSpecificInput));
        }

        /**
         * @param providerSpecificInput Provider specific input for pairing.
         * 
         * @return builder
         * 
         */
        public Builder providerSpecificInput(VMwareCbtContainerMappingInputArgs providerSpecificInput) {
            return providerSpecificInput(Either.ofRight(providerSpecificInput));
        }

        /**
         * @param targetProtectionContainerId The target unique protection container name.
         * 
         * @return builder
         * 
         */
        public Builder targetProtectionContainerId(@Nullable Output<String> targetProtectionContainerId) {
            $.targetProtectionContainerId = targetProtectionContainerId;
            return this;
        }

        /**
         * @param targetProtectionContainerId The target unique protection container name.
         * 
         * @return builder
         * 
         */
        public Builder targetProtectionContainerId(String targetProtectionContainerId) {
            return targetProtectionContainerId(Output.of(targetProtectionContainerId));
        }

        public CreateProtectionContainerMappingInputPropertiesArgs build() {
            return $;
        }
    }

}
