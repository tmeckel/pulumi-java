// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.AutoScaleSettingsResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.CodeConfigurationResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.ContainerResourceRequirementsResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.DataPathAssetReferenceResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.IdAssetReferenceResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.ManualScaleSettingsResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.OnlineRequestSettingsResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.OutputPathAssetReferenceResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.ProbeSettingsResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class K8sOnlineDeploymentResponse extends com.pulumi.resources.InvokeArgs {

    public static final K8sOnlineDeploymentResponse Empty = new K8sOnlineDeploymentResponse();

    /**
     * If true, enables Application Insights logging.
     * 
     */
    @Import(name="appInsightsEnabled")
    private @Nullable Boolean appInsightsEnabled;

    /**
     * @return If true, enables Application Insights logging.
     * 
     */
    public Optional<Boolean> appInsightsEnabled() {
        return Optional.ofNullable(this.appInsightsEnabled);
    }

    /**
     * Code configuration for the endpoint deployment.
     * 
     */
    @Import(name="codeConfiguration")
    private @Nullable CodeConfigurationResponse codeConfiguration;

    /**
     * @return Code configuration for the endpoint deployment.
     * 
     */
    public Optional<CodeConfigurationResponse> codeConfiguration() {
        return Optional.ofNullable(this.codeConfiguration);
    }

    /**
     * Resource requirements for each container instance within an online deployment.
     * 
     */
    @Import(name="containerResourceRequirements")
    private @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;

    /**
     * @return Resource requirements for each container instance within an online deployment.
     * 
     */
    public Optional<ContainerResourceRequirementsResponse> containerResourceRequirements() {
        return Optional.ofNullable(this.containerResourceRequirements);
    }

    /**
     * Description of the endpoint deployment.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Description of the endpoint deployment.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enum to determine endpoint compute type.
     * Expected value is &#39;K8S&#39;.
     * 
     */
    @Import(name="endpointComputeType", required=true)
    private String endpointComputeType;

    /**
     * @return Enum to determine endpoint compute type.
     * Expected value is &#39;K8S&#39;.
     * 
     */
    public String endpointComputeType() {
        return this.endpointComputeType;
    }

    /**
     * ARM resource ID of the environment specification for the endpoint deployment.
     * 
     */
    @Import(name="environmentId")
    private @Nullable String environmentId;

    /**
     * @return ARM resource ID of the environment specification for the endpoint deployment.
     * 
     */
    public Optional<String> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * Environment variables configuration for the deployment.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Map<String,String> environmentVariables;

    /**
     * @return Environment variables configuration for the deployment.
     * 
     */
    public Optional<Map<String,String>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * Deployment container liveness/readiness probe configuration.
     * 
     */
    @Import(name="livenessProbe")
    private @Nullable ProbeSettingsResponse livenessProbe;

    /**
     * @return Deployment container liveness/readiness probe configuration.
     * 
     */
    public Optional<ProbeSettingsResponse> livenessProbe() {
        return Optional.ofNullable(this.livenessProbe);
    }

    /**
     * Reference to the model asset for the endpoint deployment.
     * 
     */
    @Import(name="model")
    private @Nullable Object model;

    /**
     * @return Reference to the model asset for the endpoint deployment.
     * 
     */
    public Optional<Object> model() {
        return Optional.ofNullable(this.model);
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @Import(name="properties")
    private @Nullable Map<String,String> properties;

    /**
     * @return Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    public Optional<Map<String,String>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Provisioning state for the endpoint deployment.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return Provisioning state for the endpoint deployment.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Online deployment scoring requests configuration.
     * 
     */
    @Import(name="requestSettings")
    private @Nullable OnlineRequestSettingsResponse requestSettings;

    /**
     * @return Online deployment scoring requests configuration.
     * 
     */
    public Optional<OnlineRequestSettingsResponse> requestSettings() {
        return Optional.ofNullable(this.requestSettings);
    }

    /**
     * Online deployment scaling configuration.
     * 
     */
    @Import(name="scaleSettings")
    private @Nullable Either<AutoScaleSettingsResponse,ManualScaleSettingsResponse> scaleSettings;

    /**
     * @return Online deployment scaling configuration.
     * 
     */
    public Optional<Either<AutoScaleSettingsResponse,ManualScaleSettingsResponse>> scaleSettings() {
        return Optional.ofNullable(this.scaleSettings);
    }

    private K8sOnlineDeploymentResponse() {}

    private K8sOnlineDeploymentResponse(K8sOnlineDeploymentResponse $) {
        this.appInsightsEnabled = $.appInsightsEnabled;
        this.codeConfiguration = $.codeConfiguration;
        this.containerResourceRequirements = $.containerResourceRequirements;
        this.description = $.description;
        this.endpointComputeType = $.endpointComputeType;
        this.environmentId = $.environmentId;
        this.environmentVariables = $.environmentVariables;
        this.livenessProbe = $.livenessProbe;
        this.model = $.model;
        this.properties = $.properties;
        this.provisioningState = $.provisioningState;
        this.requestSettings = $.requestSettings;
        this.scaleSettings = $.scaleSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(K8sOnlineDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private K8sOnlineDeploymentResponse $;

        public Builder() {
            $ = new K8sOnlineDeploymentResponse();
        }

        public Builder(K8sOnlineDeploymentResponse defaults) {
            $ = new K8sOnlineDeploymentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param appInsightsEnabled If true, enables Application Insights logging.
         * 
         * @return builder
         * 
         */
        public Builder appInsightsEnabled(@Nullable Boolean appInsightsEnabled) {
            $.appInsightsEnabled = appInsightsEnabled;
            return this;
        }

        /**
         * @param codeConfiguration Code configuration for the endpoint deployment.
         * 
         * @return builder
         * 
         */
        public Builder codeConfiguration(@Nullable CodeConfigurationResponse codeConfiguration) {
            $.codeConfiguration = codeConfiguration;
            return this;
        }

        /**
         * @param containerResourceRequirements Resource requirements for each container instance within an online deployment.
         * 
         * @return builder
         * 
         */
        public Builder containerResourceRequirements(@Nullable ContainerResourceRequirementsResponse containerResourceRequirements) {
            $.containerResourceRequirements = containerResourceRequirements;
            return this;
        }

        /**
         * @param description Description of the endpoint deployment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param endpointComputeType Enum to determine endpoint compute type.
         * Expected value is &#39;K8S&#39;.
         * 
         * @return builder
         * 
         */
        public Builder endpointComputeType(String endpointComputeType) {
            $.endpointComputeType = endpointComputeType;
            return this;
        }

        /**
         * @param environmentId ARM resource ID of the environment specification for the endpoint deployment.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable String environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentVariables Environment variables configuration for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param livenessProbe Deployment container liveness/readiness probe configuration.
         * 
         * @return builder
         * 
         */
        public Builder livenessProbe(@Nullable ProbeSettingsResponse livenessProbe) {
            $.livenessProbe = livenessProbe;
            return this;
        }

        /**
         * @param model Reference to the model asset for the endpoint deployment.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Object model) {
            $.model = model;
            return this;
        }

        /**
         * @param properties Property dictionary. Properties can be added, but not removed or altered.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Map<String,String> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param provisioningState Provisioning state for the endpoint deployment.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param requestSettings Online deployment scoring requests configuration.
         * 
         * @return builder
         * 
         */
        public Builder requestSettings(@Nullable OnlineRequestSettingsResponse requestSettings) {
            $.requestSettings = requestSettings;
            return this;
        }

        /**
         * @param scaleSettings Online deployment scaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder scaleSettings(@Nullable Either<AutoScaleSettingsResponse,ManualScaleSettingsResponse> scaleSettings) {
            $.scaleSettings = scaleSettings;
            return this;
        }

        /**
         * @param scaleSettings Online deployment scaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder scaleSettings(AutoScaleSettingsResponse scaleSettings) {
            return scaleSettings(Either.ofLeft(scaleSettings));
        }

        /**
         * @param scaleSettings Online deployment scaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder scaleSettings(ManualScaleSettingsResponse scaleSettings) {
            return scaleSettings(Either.ofRight(scaleSettings));
        }

        public K8sOnlineDeploymentResponse build() {
            $.endpointComputeType = Codegen.stringProp("endpointComputeType").arg($.endpointComputeType).require();
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
