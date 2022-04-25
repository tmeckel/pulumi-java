// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.WorkflowProvisioningState;
import com.pulumi.azurenative.logic.enums.WorkflowState;
import com.pulumi.azurenative.logic.inputs.FlowEndpointsConfigurationArgs;
import com.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmenEncryptionConfigurationArgs;
import com.pulumi.azurenative.logic.inputs.NetworkConfigurationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The integration service environment properties.
 * 
 */
public final class IntegrationServiceEnvironmentPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmentPropertiesArgs Empty = new IntegrationServiceEnvironmentPropertiesArgs();

    /**
     * The encryption configuration.
     * 
     */
    @Import(name="encryptionConfiguration")
    private @Nullable Output<IntegrationServiceEnvironmenEncryptionConfigurationArgs> encryptionConfiguration;

    /**
     * @return The encryption configuration.
     * 
     */
    public Optional<Output<IntegrationServiceEnvironmenEncryptionConfigurationArgs>> encryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }

    /**
     * The endpoints configuration.
     * 
     */
    @Import(name="endpointsConfiguration")
    private @Nullable Output<FlowEndpointsConfigurationArgs> endpointsConfiguration;

    /**
     * @return The endpoints configuration.
     * 
     */
    public Optional<Output<FlowEndpointsConfigurationArgs>> endpointsConfiguration() {
        return Optional.ofNullable(this.endpointsConfiguration);
    }

    /**
     * Gets the tracking id.
     * 
     */
    @Import(name="integrationServiceEnvironmentId")
    private @Nullable Output<String> integrationServiceEnvironmentId;

    /**
     * @return Gets the tracking id.
     * 
     */
    public Optional<Output<String>> integrationServiceEnvironmentId() {
        return Optional.ofNullable(this.integrationServiceEnvironmentId);
    }

    /**
     * The network configuration.
     * 
     */
    @Import(name="networkConfiguration")
    private @Nullable Output<NetworkConfigurationArgs> networkConfiguration;

    /**
     * @return The network configuration.
     * 
     */
    public Optional<Output<NetworkConfigurationArgs>> networkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }

    /**
     * The provisioning state.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,WorkflowProvisioningState>> provisioningState;

    /**
     * @return The provisioning state.
     * 
     */
    public Optional<Output<Either<String,WorkflowProvisioningState>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The integration service environment state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,WorkflowState>> state;

    /**
     * @return The integration service environment state.
     * 
     */
    public Optional<Output<Either<String,WorkflowState>>> state() {
        return Optional.ofNullable(this.state);
    }

    private IntegrationServiceEnvironmentPropertiesArgs() {}

    private IntegrationServiceEnvironmentPropertiesArgs(IntegrationServiceEnvironmentPropertiesArgs $) {
        this.encryptionConfiguration = $.encryptionConfiguration;
        this.endpointsConfiguration = $.endpointsConfiguration;
        this.integrationServiceEnvironmentId = $.integrationServiceEnvironmentId;
        this.networkConfiguration = $.networkConfiguration;
        this.provisioningState = $.provisioningState;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationServiceEnvironmentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationServiceEnvironmentPropertiesArgs $;

        public Builder() {
            $ = new IntegrationServiceEnvironmentPropertiesArgs();
        }

        public Builder(IntegrationServiceEnvironmentPropertiesArgs defaults) {
            $ = new IntegrationServiceEnvironmentPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionConfiguration The encryption configuration.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfiguration(@Nullable Output<IntegrationServiceEnvironmenEncryptionConfigurationArgs> encryptionConfiguration) {
            $.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        /**
         * @param encryptionConfiguration The encryption configuration.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfiguration(IntegrationServiceEnvironmenEncryptionConfigurationArgs encryptionConfiguration) {
            return encryptionConfiguration(Output.of(encryptionConfiguration));
        }

        /**
         * @param endpointsConfiguration The endpoints configuration.
         * 
         * @return builder
         * 
         */
        public Builder endpointsConfiguration(@Nullable Output<FlowEndpointsConfigurationArgs> endpointsConfiguration) {
            $.endpointsConfiguration = endpointsConfiguration;
            return this;
        }

        /**
         * @param endpointsConfiguration The endpoints configuration.
         * 
         * @return builder
         * 
         */
        public Builder endpointsConfiguration(FlowEndpointsConfigurationArgs endpointsConfiguration) {
            return endpointsConfiguration(Output.of(endpointsConfiguration));
        }

        /**
         * @param integrationServiceEnvironmentId Gets the tracking id.
         * 
         * @return builder
         * 
         */
        public Builder integrationServiceEnvironmentId(@Nullable Output<String> integrationServiceEnvironmentId) {
            $.integrationServiceEnvironmentId = integrationServiceEnvironmentId;
            return this;
        }

        /**
         * @param integrationServiceEnvironmentId Gets the tracking id.
         * 
         * @return builder
         * 
         */
        public Builder integrationServiceEnvironmentId(String integrationServiceEnvironmentId) {
            return integrationServiceEnvironmentId(Output.of(integrationServiceEnvironmentId));
        }

        /**
         * @param networkConfiguration The network configuration.
         * 
         * @return builder
         * 
         */
        public Builder networkConfiguration(@Nullable Output<NetworkConfigurationArgs> networkConfiguration) {
            $.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * @param networkConfiguration The network configuration.
         * 
         * @return builder
         * 
         */
        public Builder networkConfiguration(NetworkConfigurationArgs networkConfiguration) {
            return networkConfiguration(Output.of(networkConfiguration));
        }

        /**
         * @param provisioningState The provisioning state.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<Either<String,WorkflowProvisioningState>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState The provisioning state.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(Either<String,WorkflowProvisioningState> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param provisioningState The provisioning state.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Either.ofLeft(provisioningState));
        }

        /**
         * @param provisioningState The provisioning state.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(WorkflowProvisioningState provisioningState) {
            return provisioningState(Either.ofRight(provisioningState));
        }

        /**
         * @param state The integration service environment state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<Either<String,WorkflowState>> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The integration service environment state.
         * 
         * @return builder
         * 
         */
        public Builder state(Either<String,WorkflowState> state) {
            return state(Output.of(state));
        }

        /**
         * @param state The integration service environment state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        /**
         * @param state The integration service environment state.
         * 
         * @return builder
         * 
         */
        public Builder state(WorkflowState state) {
            return state(Either.ofRight(state));
        }

        public IntegrationServiceEnvironmentPropertiesArgs build() {
            return $;
        }
    }

}
