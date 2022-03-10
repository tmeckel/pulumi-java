// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.A2APolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaAzurePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaBasePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaBluePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaPolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.InMageAzureV2PolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.InMageBasePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.InMagePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmPolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.RcmAzureMigrationPolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VmwareCbtPolicyDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Protection profile custom data details.
 * 
 */
public final class PolicyPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PolicyPropertiesResponse Empty = new PolicyPropertiesResponse();

    /**
     * The FriendlyName.
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * The ReplicationChannelSetting.
     * 
     */
    @InputImport(name="providerSpecificDetails")
      private final @Nullable Object providerSpecificDetails;

    public Object getProviderSpecificDetails() {
        return this.providerSpecificDetails == null ? null : this.providerSpecificDetails;
    }

    public PolicyPropertiesResponse(
        @Nullable String friendlyName,
        @Nullable Object providerSpecificDetails) {
        this.friendlyName = friendlyName;
        this.providerSpecificDetails = providerSpecificDetails;
    }

    private PolicyPropertiesResponse() {
        this.friendlyName = null;
        this.providerSpecificDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String friendlyName;
        private @Nullable Object providerSpecificDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.friendlyName = defaults.friendlyName;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder providerSpecificDetails(@Nullable Object providerSpecificDetails) {
            this.providerSpecificDetails = providerSpecificDetails;
            return this;
        }
        public PolicyPropertiesResponse build() {
            return new PolicyPropertiesResponse(friendlyName, providerSpecificDetails);
        }
    }
}
