// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.AddRecoveryServicesProviderInputPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationRecoveryServicesProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationRecoveryServicesProviderArgs Empty = new ReplicationRecoveryServicesProviderArgs();

    /**
     * Fabric name.
     * 
     */
    @Import(name="fabricName", required=true)
      private final Output<String> fabricName;

    public Output<String> getFabricName() {
        return this.fabricName;
    }

    /**
     * The properties of an add provider request.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<AddRecoveryServicesProviderInputPropertiesArgs> properties;

    public Output<AddRecoveryServicesProviderInputPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * Recovery services provider name.
     * 
     */
    @Import(name="providerName")
      private final @Nullable Output<String> providerName;

    public Output<String> getProviderName() {
        return this.providerName == null ? Codegen.empty() : this.providerName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName;
    }

    public ReplicationRecoveryServicesProviderArgs(
        Output<String> fabricName,
        Output<AddRecoveryServicesProviderInputPropertiesArgs> properties,
        @Nullable Output<String> providerName,
        Output<String> resourceGroupName,
        Output<String> resourceName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.providerName = providerName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ReplicationRecoveryServicesProviderArgs() {
        this.fabricName = Codegen.empty();
        this.properties = Codegen.empty();
        this.providerName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationRecoveryServicesProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> fabricName;
        private Output<AddRecoveryServicesProviderInputPropertiesArgs> properties;
        private @Nullable Output<String> providerName;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationRecoveryServicesProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.properties = defaults.properties;
    	      this.providerName = defaults.providerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder fabricName(Output<String> fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }
        public Builder fabricName(String fabricName) {
            this.fabricName = Output.of(Objects.requireNonNull(fabricName));
            return this;
        }
        public Builder properties(Output<AddRecoveryServicesProviderInputPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(AddRecoveryServicesProviderInputPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder providerName(@Nullable Output<String> providerName) {
            this.providerName = providerName;
            return this;
        }
        public Builder providerName(@Nullable String providerName) {
            this.providerName = Codegen.ofNullable(providerName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }        public ReplicationRecoveryServicesProviderArgs build() {
            return new ReplicationRecoveryServicesProviderArgs(fabricName, properties, providerName, resourceGroupName, resourceName);
        }
    }
}
