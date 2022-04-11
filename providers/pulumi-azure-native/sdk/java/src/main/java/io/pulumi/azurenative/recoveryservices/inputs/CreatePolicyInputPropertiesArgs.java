// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.A2APolicyCreationInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaAzurePolicyInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaBluePolicyInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaPolicyInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMageAzureV2PolicyInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMagePolicyInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmPolicyCreationInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.VMwareCbtPolicyCreationInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Policy creation properties.
 * 
 */
public final class CreatePolicyInputPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreatePolicyInputPropertiesArgs Empty = new CreatePolicyInputPropertiesArgs();

    /**
     * The ReplicationProviderSettings.
     * 
     */
    @Import(name="providerSpecificInput")
      private final @Nullable Output<Object> providerSpecificInput;

    public Output<Object> getProviderSpecificInput() {
        return this.providerSpecificInput == null ? Codegen.empty() : this.providerSpecificInput;
    }

    public CreatePolicyInputPropertiesArgs(@Nullable Output<Object> providerSpecificInput) {
        this.providerSpecificInput = providerSpecificInput;
    }

    private CreatePolicyInputPropertiesArgs() {
        this.providerSpecificInput = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreatePolicyInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> providerSpecificInput;

        public Builder() {
    	      // Empty
        }

        public Builder(CreatePolicyInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providerSpecificInput = defaults.providerSpecificInput;
        }

        public Builder providerSpecificInput(@Nullable Output<Object> providerSpecificInput) {
            this.providerSpecificInput = providerSpecificInput;
            return this;
        }
        public Builder providerSpecificInput(@Nullable Object providerSpecificInput) {
            this.providerSpecificInput = Codegen.ofNullable(providerSpecificInput);
            return this;
        }        public CreatePolicyInputPropertiesArgs build() {
            return new CreatePolicyInputPropertiesArgs(providerSpecificInput);
        }
    }
}
