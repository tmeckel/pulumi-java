// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.AutoScaleSettingsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.CodeConfigurationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ContainerResourceRequirementsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.DataPathAssetReferenceArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.IdAssetReferenceArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ManualScaleSettingsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.OnlineRequestSettingsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.OutputPathAssetReferenceArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ProbeSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class K8sOnlineDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final K8sOnlineDeploymentArgs Empty = new K8sOnlineDeploymentArgs();

    /**
     * If true, enables Application Insights logging.
     * 
     */
    @Import(name="appInsightsEnabled")
      private final @Nullable Output<Boolean> appInsightsEnabled;

    public Output<Boolean> getAppInsightsEnabled() {
        return this.appInsightsEnabled == null ? Codegen.empty() : this.appInsightsEnabled;
    }

    /**
     * Code configuration for the endpoint deployment.
     * 
     */
    @Import(name="codeConfiguration")
      private final @Nullable Output<CodeConfigurationArgs> codeConfiguration;

    public Output<CodeConfigurationArgs> getCodeConfiguration() {
        return this.codeConfiguration == null ? Codegen.empty() : this.codeConfiguration;
    }

    /**
     * Resource requirements for each container instance within an online deployment.
     * 
     */
    @Import(name="containerResourceRequirements")
      private final @Nullable Output<ContainerResourceRequirementsArgs> containerResourceRequirements;

    public Output<ContainerResourceRequirementsArgs> getContainerResourceRequirements() {
        return this.containerResourceRequirements == null ? Codegen.empty() : this.containerResourceRequirements;
    }

    /**
     * Description of the endpoint deployment.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Enum to determine endpoint compute type.
     * Expected value is 'K8S'.
     * 
     */
    @Import(name="endpointComputeType", required=true)
      private final Output<String> endpointComputeType;

    public Output<String> getEndpointComputeType() {
        return this.endpointComputeType;
    }

    /**
     * ARM resource ID of the environment specification for the endpoint deployment.
     * 
     */
    @Import(name="environmentId")
      private final @Nullable Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId == null ? Codegen.empty() : this.environmentId;
    }

    /**
     * Environment variables configuration for the deployment.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<Map<String,String>> environmentVariables;

    public Output<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Codegen.empty() : this.environmentVariables;
    }

    /**
     * Deployment container liveness/readiness probe configuration.
     * 
     */
    @Import(name="livenessProbe")
      private final @Nullable Output<ProbeSettingsArgs> livenessProbe;

    public Output<ProbeSettingsArgs> getLivenessProbe() {
        return this.livenessProbe == null ? Codegen.empty() : this.livenessProbe;
    }

    /**
     * Reference to the model asset for the endpoint deployment.
     * 
     */
    @Import(name="model")
      private final @Nullable Output<Object> model;

    public Output<Object> getModel() {
        return this.model == null ? Codegen.empty() : this.model;
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Online deployment scoring requests configuration.
     * 
     */
    @Import(name="requestSettings")
      private final @Nullable Output<OnlineRequestSettingsArgs> requestSettings;

    public Output<OnlineRequestSettingsArgs> getRequestSettings() {
        return this.requestSettings == null ? Codegen.empty() : this.requestSettings;
    }

    /**
     * Online deployment scaling configuration.
     * 
     */
    @Import(name="scaleSettings")
      private final @Nullable Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> scaleSettings;

    public Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> getScaleSettings() {
        return this.scaleSettings == null ? Codegen.empty() : this.scaleSettings;
    }

    public K8sOnlineDeploymentArgs(
        @Nullable Output<Boolean> appInsightsEnabled,
        @Nullable Output<CodeConfigurationArgs> codeConfiguration,
        @Nullable Output<ContainerResourceRequirementsArgs> containerResourceRequirements,
        @Nullable Output<String> description,
        Output<String> endpointComputeType,
        @Nullable Output<String> environmentId,
        @Nullable Output<Map<String,String>> environmentVariables,
        @Nullable Output<ProbeSettingsArgs> livenessProbe,
        @Nullable Output<Object> model,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<OnlineRequestSettingsArgs> requestSettings,
        @Nullable Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> scaleSettings) {
        this.appInsightsEnabled = appInsightsEnabled;
        this.codeConfiguration = codeConfiguration;
        this.containerResourceRequirements = containerResourceRequirements;
        this.description = description;
        this.endpointComputeType = Objects.requireNonNull(endpointComputeType, "expected parameter 'endpointComputeType' to be non-null");
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.livenessProbe = livenessProbe;
        this.model = model;
        this.properties = properties;
        this.requestSettings = requestSettings;
        this.scaleSettings = scaleSettings;
    }

    private K8sOnlineDeploymentArgs() {
        this.appInsightsEnabled = Codegen.empty();
        this.codeConfiguration = Codegen.empty();
        this.containerResourceRequirements = Codegen.empty();
        this.description = Codegen.empty();
        this.endpointComputeType = Codegen.empty();
        this.environmentId = Codegen.empty();
        this.environmentVariables = Codegen.empty();
        this.livenessProbe = Codegen.empty();
        this.model = Codegen.empty();
        this.properties = Codegen.empty();
        this.requestSettings = Codegen.empty();
        this.scaleSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(K8sOnlineDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> appInsightsEnabled;
        private @Nullable Output<CodeConfigurationArgs> codeConfiguration;
        private @Nullable Output<ContainerResourceRequirementsArgs> containerResourceRequirements;
        private @Nullable Output<String> description;
        private Output<String> endpointComputeType;
        private @Nullable Output<String> environmentId;
        private @Nullable Output<Map<String,String>> environmentVariables;
        private @Nullable Output<ProbeSettingsArgs> livenessProbe;
        private @Nullable Output<Object> model;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<OnlineRequestSettingsArgs> requestSettings;
        private @Nullable Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> scaleSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(K8sOnlineDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appInsightsEnabled = defaults.appInsightsEnabled;
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.containerResourceRequirements = defaults.containerResourceRequirements;
    	      this.description = defaults.description;
    	      this.endpointComputeType = defaults.endpointComputeType;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.model = defaults.model;
    	      this.properties = defaults.properties;
    	      this.requestSettings = defaults.requestSettings;
    	      this.scaleSettings = defaults.scaleSettings;
        }

        public Builder appInsightsEnabled(@Nullable Output<Boolean> appInsightsEnabled) {
            this.appInsightsEnabled = appInsightsEnabled;
            return this;
        }
        public Builder appInsightsEnabled(@Nullable Boolean appInsightsEnabled) {
            this.appInsightsEnabled = Codegen.ofNullable(appInsightsEnabled);
            return this;
        }
        public Builder codeConfiguration(@Nullable Output<CodeConfigurationArgs> codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public Builder codeConfiguration(@Nullable CodeConfigurationArgs codeConfiguration) {
            this.codeConfiguration = Codegen.ofNullable(codeConfiguration);
            return this;
        }
        public Builder containerResourceRequirements(@Nullable Output<ContainerResourceRequirementsArgs> containerResourceRequirements) {
            this.containerResourceRequirements = containerResourceRequirements;
            return this;
        }
        public Builder containerResourceRequirements(@Nullable ContainerResourceRequirementsArgs containerResourceRequirements) {
            this.containerResourceRequirements = Codegen.ofNullable(containerResourceRequirements);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder endpointComputeType(Output<String> endpointComputeType) {
            this.endpointComputeType = Objects.requireNonNull(endpointComputeType);
            return this;
        }
        public Builder endpointComputeType(String endpointComputeType) {
            this.endpointComputeType = Output.of(Objects.requireNonNull(endpointComputeType));
            return this;
        }
        public Builder environmentId(@Nullable Output<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Codegen.ofNullable(environmentId);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Codegen.ofNullable(environmentVariables);
            return this;
        }
        public Builder livenessProbe(@Nullable Output<ProbeSettingsArgs> livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public Builder livenessProbe(@Nullable ProbeSettingsArgs livenessProbe) {
            this.livenessProbe = Codegen.ofNullable(livenessProbe);
            return this;
        }
        public Builder model(@Nullable Output<Object> model) {
            this.model = model;
            return this;
        }
        public Builder model(@Nullable Object model) {
            this.model = Codegen.ofNullable(model);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder requestSettings(@Nullable Output<OnlineRequestSettingsArgs> requestSettings) {
            this.requestSettings = requestSettings;
            return this;
        }
        public Builder requestSettings(@Nullable OnlineRequestSettingsArgs requestSettings) {
            this.requestSettings = Codegen.ofNullable(requestSettings);
            return this;
        }
        public Builder scaleSettings(@Nullable Output<Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs>> scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }
        public Builder scaleSettings(@Nullable Either<AutoScaleSettingsArgs,ManualScaleSettingsArgs> scaleSettings) {
            this.scaleSettings = Codegen.ofNullable(scaleSettings);
            return this;
        }        public K8sOnlineDeploymentArgs build() {
            return new K8sOnlineDeploymentArgs(appInsightsEnabled, codeConfiguration, containerResourceRequirements, description, endpointComputeType, environmentId, environmentVariables, livenessProbe, model, properties, requestSettings, scaleSettings);
        }
    }
}
