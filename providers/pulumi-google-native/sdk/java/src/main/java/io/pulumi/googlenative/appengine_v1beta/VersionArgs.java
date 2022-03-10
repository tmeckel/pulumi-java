// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1beta.enums.VersionInboundServicesItem;
import io.pulumi.googlenative.appengine_v1beta.enums.VersionServingStatus;
import io.pulumi.googlenative.appengine_v1beta.inputs.ApiConfigHandlerArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.AutomaticScalingArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.BasicScalingArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.DeploymentArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.EndpointsApiServiceArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.EntrypointArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.ErrorHandlerArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.HealthCheckArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.LibraryArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.LivenessCheckArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.ManualScalingArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.NetworkArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.ReadinessCheckArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.ResourcesArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.UrlMapArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.VpcAccessConnectorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VersionArgs Empty = new VersionArgs();

    /**
     * Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="apiConfig")
      private final @Nullable Input<ApiConfigHandlerArgs> apiConfig;

    public Input<ApiConfigHandlerArgs> getApiConfig() {
        return this.apiConfig == null ? Input.empty() : this.apiConfig;
    }

    /**
     * app_engine_apis allows second generation runtimes to access the App Engine APIs.
     * 
     */
    @InputImport(name="appEngineApis")
      private final @Nullable Input<Boolean> appEngineApis;

    public Input<Boolean> getAppEngineApis() {
        return this.appEngineApis == null ? Input.empty() : this.appEngineApis;
    }

    @InputImport(name="appId", required=true)
      private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * Automatic scaling is based on request rate, response latencies, and other application metrics. Instances are dynamically created and destroyed as needed in order to handle traffic.
     * 
     */
    @InputImport(name="automaticScaling")
      private final @Nullable Input<AutomaticScalingArgs> automaticScaling;

    public Input<AutomaticScalingArgs> getAutomaticScaling() {
        return this.automaticScaling == null ? Input.empty() : this.automaticScaling;
    }

    /**
     * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     * 
     */
    @InputImport(name="basicScaling")
      private final @Nullable Input<BasicScalingArgs> basicScaling;

    public Input<BasicScalingArgs> getBasicScaling() {
        return this.basicScaling == null ? Input.empty() : this.basicScaling;
    }

    /**
     * Metadata settings that are supplied to this version to enable beta runtime features.
     * 
     */
    @InputImport(name="betaSettings")
      private final @Nullable Input<Map<String,String>> betaSettings;

    public Input<Map<String,String>> getBetaSettings() {
        return this.betaSettings == null ? Input.empty() : this.betaSettings;
    }

    /**
     * Environment variables available to the build environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="buildEnvVariables")
      private final @Nullable Input<Map<String,String>> buildEnvVariables;

    public Input<Map<String,String>> getBuildEnvVariables() {
        return this.buildEnvVariables == null ? Input.empty() : this.buildEnvVariables;
    }

    /**
     * Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="defaultExpiration")
      private final @Nullable Input<String> defaultExpiration;

    public Input<String> getDefaultExpiration() {
        return this.defaultExpiration == null ? Input.empty() : this.defaultExpiration;
    }

    /**
     * Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="deployment")
      private final @Nullable Input<DeploymentArgs> deployment;

    public Input<DeploymentArgs> getDeployment() {
        return this.deployment == null ? Input.empty() : this.deployment;
    }

    /**
     * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app.
     * 
     */
    @InputImport(name="endpointsApiService")
      private final @Nullable Input<EndpointsApiServiceArgs> endpointsApiService;

    public Input<EndpointsApiServiceArgs> getEndpointsApiService() {
        return this.endpointsApiService == null ? Input.empty() : this.endpointsApiService;
    }

    /**
     * The entrypoint for the application.
     * 
     */
    @InputImport(name="entrypoint")
      private final @Nullable Input<EntrypointArgs> entrypoint;

    public Input<EntrypointArgs> getEntrypoint() {
        return this.entrypoint == null ? Input.empty() : this.entrypoint;
    }

    /**
     * App Engine execution environment for this version.Defaults to standard.
     * 
     */
    @InputImport(name="env")
      private final @Nullable Input<String> env;

    public Input<String> getEnv() {
        return this.env == null ? Input.empty() : this.env;
    }

    /**
     * Environment variables available to the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="envVariables")
      private final @Nullable Input<Map<String,String>> envVariables;

    public Input<Map<String,String>> getEnvVariables() {
        return this.envVariables == null ? Input.empty() : this.envVariables;
    }

    /**
     * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="errorHandlers")
      private final @Nullable Input<List<ErrorHandlerArgs>> errorHandlers;

    public Input<List<ErrorHandlerArgs>> getErrorHandlers() {
        return this.errorHandlers == null ? Input.empty() : this.errorHandlers;
    }

    /**
     * An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="handlers")
      private final @Nullable Input<List<UrlMapArgs>> handlers;

    public Input<List<UrlMapArgs>> getHandlers() {
        return this.handlers == null ? Input.empty() : this.handlers;
    }

    /**
     * Configures health checking for instances. Unhealthy instances are stopped and replaced with new instances. Only applicable in the App Engine flexible environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="healthCheck")
      private final @Nullable Input<HealthCheckArgs> healthCheck;

    public Input<HealthCheckArgs> getHealthCheck() {
        return this.healthCheck == null ? Input.empty() : this.healthCheck;
    }

    /**
     * Relative name of the version within the service. Example: v1. Version names can contain only lowercase letters, numbers, or hyphens. Reserved names: "default", "latest", and any name with the prefix "ah-".
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Before an application can receive email or XMPP messages, the application must be configured to enable the service.
     * 
     */
    @InputImport(name="inboundServices")
      private final @Nullable Input<List<VersionInboundServicesItem>> inboundServices;

    public Input<List<VersionInboundServicesItem>> getInboundServices() {
        return this.inboundServices == null ? Input.empty() : this.inboundServices;
    }

    /**
     * Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
     * 
     */
    @InputImport(name="instanceClass")
      private final @Nullable Input<String> instanceClass;

    public Input<String> getInstanceClass() {
        return this.instanceClass == null ? Input.empty() : this.instanceClass;
    }

    /**
     * Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="libraries")
      private final @Nullable Input<List<LibraryArgs>> libraries;

    public Input<List<LibraryArgs>> getLibraries() {
        return this.libraries == null ? Input.empty() : this.libraries;
    }

    /**
     * Configures liveness health checking for instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="livenessCheck")
      private final @Nullable Input<LivenessCheckArgs> livenessCheck;

    public Input<LivenessCheckArgs> getLivenessCheck() {
        return this.livenessCheck == null ? Input.empty() : this.livenessCheck;
    }

    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. Manually scaled versions are sometimes referred to as "backends".
     * 
     */
    @InputImport(name="manualScaling")
      private final @Nullable Input<ManualScalingArgs> manualScaling;

    public Input<ManualScalingArgs> getManualScaling() {
        return this.manualScaling == null ? Input.empty() : this.manualScaling;
    }

    /**
     * Extra network settings. Only applicable in the App Engine flexible environment.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<NetworkArgs> network;

    public Input<NetworkArgs> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="nobuildFilesRegex")
      private final @Nullable Input<String> nobuildFilesRegex;

    public Input<String> getNobuildFilesRegex() {
        return this.nobuildFilesRegex == null ? Input.empty() : this.nobuildFilesRegex;
    }

    /**
     * Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set.
     * 
     */
    @InputImport(name="readinessCheck")
      private final @Nullable Input<ReadinessCheckArgs> readinessCheck;

    public Input<ReadinessCheckArgs> getReadinessCheck() {
        return this.readinessCheck == null ? Input.empty() : this.readinessCheck;
    }

    /**
     * Machine resources for this version. Only applicable in the App Engine flexible environment.
     * 
     */
    @InputImport(name="resources")
      private final @Nullable Input<ResourcesArgs> resources;

    public Input<ResourcesArgs> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    /**
     * Desired runtime. Example: python27.
     * 
     */
    @InputImport(name="runtime")
      private final @Nullable Input<String> runtime;

    public Input<String> getRuntime() {
        return this.runtime == null ? Input.empty() : this.runtime;
    }

    /**
     * The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard//config/appref
     * 
     */
    @InputImport(name="runtimeApiVersion")
      private final @Nullable Input<String> runtimeApiVersion;

    public Input<String> getRuntimeApiVersion() {
        return this.runtimeApiVersion == null ? Input.empty() : this.runtimeApiVersion;
    }

    /**
     * The channel of the runtime to use. Only available for some runtimes. Defaults to the default channel.
     * 
     */
    @InputImport(name="runtimeChannel")
      private final @Nullable Input<String> runtimeChannel;

    public Input<String> getRuntimeChannel() {
        return this.runtimeChannel == null ? Input.empty() : this.runtimeChannel;
    }

    /**
     * The path or name of the app's main executable.
     * 
     */
    @InputImport(name="runtimeMainExecutablePath")
      private final @Nullable Input<String> runtimeMainExecutablePath;

    public Input<String> getRuntimeMainExecutablePath() {
        return this.runtimeMainExecutablePath == null ? Input.empty() : this.runtimeMainExecutablePath;
    }

    /**
     * The identity that the deployed version will run as. Admin API will use the App Engine Appspot service account as default if this field is neither provided in app.yaml file nor through CLI flag.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    @InputImport(name="serviceId", required=true)
      private final Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId;
    }

    /**
     * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
     * 
     */
    @InputImport(name="servingStatus")
      private final @Nullable Input<VersionServingStatus> servingStatus;

    public Input<VersionServingStatus> getServingStatus() {
        return this.servingStatus == null ? Input.empty() : this.servingStatus;
    }

    /**
     * Whether multiple requests can be dispatched to this version at once.
     * 
     */
    @InputImport(name="threadsafe")
      private final @Nullable Input<Boolean> threadsafe;

    public Input<Boolean> getThreadsafe() {
        return this.threadsafe == null ? Input.empty() : this.threadsafe;
    }

    /**
     * Whether to deploy this version in a container on a virtual machine.
     * 
     */
    @InputImport(name="vm")
      private final @Nullable Input<Boolean> vm;

    public Input<Boolean> getVm() {
        return this.vm == null ? Input.empty() : this.vm;
    }

    /**
     * Enables VPC connectivity for standard apps.
     * 
     */
    @InputImport(name="vpcAccessConnector")
      private final @Nullable Input<VpcAccessConnectorArgs> vpcAccessConnector;

    public Input<VpcAccessConnectorArgs> getVpcAccessConnector() {
        return this.vpcAccessConnector == null ? Input.empty() : this.vpcAccessConnector;
    }

    public VersionArgs(
        @Nullable Input<ApiConfigHandlerArgs> apiConfig,
        @Nullable Input<Boolean> appEngineApis,
        Input<String> appId,
        @Nullable Input<AutomaticScalingArgs> automaticScaling,
        @Nullable Input<BasicScalingArgs> basicScaling,
        @Nullable Input<Map<String,String>> betaSettings,
        @Nullable Input<Map<String,String>> buildEnvVariables,
        @Nullable Input<String> defaultExpiration,
        @Nullable Input<DeploymentArgs> deployment,
        @Nullable Input<EndpointsApiServiceArgs> endpointsApiService,
        @Nullable Input<EntrypointArgs> entrypoint,
        @Nullable Input<String> env,
        @Nullable Input<Map<String,String>> envVariables,
        @Nullable Input<List<ErrorHandlerArgs>> errorHandlers,
        @Nullable Input<List<UrlMapArgs>> handlers,
        @Nullable Input<HealthCheckArgs> healthCheck,
        @Nullable Input<String> id,
        @Nullable Input<List<VersionInboundServicesItem>> inboundServices,
        @Nullable Input<String> instanceClass,
        @Nullable Input<List<LibraryArgs>> libraries,
        @Nullable Input<LivenessCheckArgs> livenessCheck,
        @Nullable Input<ManualScalingArgs> manualScaling,
        @Nullable Input<NetworkArgs> network,
        @Nullable Input<String> nobuildFilesRegex,
        @Nullable Input<ReadinessCheckArgs> readinessCheck,
        @Nullable Input<ResourcesArgs> resources,
        @Nullable Input<String> runtime,
        @Nullable Input<String> runtimeApiVersion,
        @Nullable Input<String> runtimeChannel,
        @Nullable Input<String> runtimeMainExecutablePath,
        @Nullable Input<String> serviceAccount,
        Input<String> serviceId,
        @Nullable Input<VersionServingStatus> servingStatus,
        @Nullable Input<Boolean> threadsafe,
        @Nullable Input<Boolean> vm,
        @Nullable Input<VpcAccessConnectorArgs> vpcAccessConnector) {
        this.apiConfig = apiConfig;
        this.appEngineApis = appEngineApis;
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.automaticScaling = automaticScaling;
        this.basicScaling = basicScaling;
        this.betaSettings = betaSettings;
        this.buildEnvVariables = buildEnvVariables;
        this.defaultExpiration = defaultExpiration;
        this.deployment = deployment;
        this.endpointsApiService = endpointsApiService;
        this.entrypoint = entrypoint;
        this.env = env;
        this.envVariables = envVariables;
        this.errorHandlers = errorHandlers;
        this.handlers = handlers;
        this.healthCheck = healthCheck;
        this.id = id;
        this.inboundServices = inboundServices;
        this.instanceClass = instanceClass;
        this.libraries = libraries;
        this.livenessCheck = livenessCheck;
        this.manualScaling = manualScaling;
        this.network = network;
        this.nobuildFilesRegex = nobuildFilesRegex;
        this.readinessCheck = readinessCheck;
        this.resources = resources;
        this.runtime = runtime;
        this.runtimeApiVersion = runtimeApiVersion;
        this.runtimeChannel = runtimeChannel;
        this.runtimeMainExecutablePath = runtimeMainExecutablePath;
        this.serviceAccount = serviceAccount;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.servingStatus = servingStatus;
        this.threadsafe = threadsafe;
        this.vm = vm;
        this.vpcAccessConnector = vpcAccessConnector;
    }

    private VersionArgs() {
        this.apiConfig = Input.empty();
        this.appEngineApis = Input.empty();
        this.appId = Input.empty();
        this.automaticScaling = Input.empty();
        this.basicScaling = Input.empty();
        this.betaSettings = Input.empty();
        this.buildEnvVariables = Input.empty();
        this.defaultExpiration = Input.empty();
        this.deployment = Input.empty();
        this.endpointsApiService = Input.empty();
        this.entrypoint = Input.empty();
        this.env = Input.empty();
        this.envVariables = Input.empty();
        this.errorHandlers = Input.empty();
        this.handlers = Input.empty();
        this.healthCheck = Input.empty();
        this.id = Input.empty();
        this.inboundServices = Input.empty();
        this.instanceClass = Input.empty();
        this.libraries = Input.empty();
        this.livenessCheck = Input.empty();
        this.manualScaling = Input.empty();
        this.network = Input.empty();
        this.nobuildFilesRegex = Input.empty();
        this.readinessCheck = Input.empty();
        this.resources = Input.empty();
        this.runtime = Input.empty();
        this.runtimeApiVersion = Input.empty();
        this.runtimeChannel = Input.empty();
        this.runtimeMainExecutablePath = Input.empty();
        this.serviceAccount = Input.empty();
        this.serviceId = Input.empty();
        this.servingStatus = Input.empty();
        this.threadsafe = Input.empty();
        this.vm = Input.empty();
        this.vpcAccessConnector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApiConfigHandlerArgs> apiConfig;
        private @Nullable Input<Boolean> appEngineApis;
        private Input<String> appId;
        private @Nullable Input<AutomaticScalingArgs> automaticScaling;
        private @Nullable Input<BasicScalingArgs> basicScaling;
        private @Nullable Input<Map<String,String>> betaSettings;
        private @Nullable Input<Map<String,String>> buildEnvVariables;
        private @Nullable Input<String> defaultExpiration;
        private @Nullable Input<DeploymentArgs> deployment;
        private @Nullable Input<EndpointsApiServiceArgs> endpointsApiService;
        private @Nullable Input<EntrypointArgs> entrypoint;
        private @Nullable Input<String> env;
        private @Nullable Input<Map<String,String>> envVariables;
        private @Nullable Input<List<ErrorHandlerArgs>> errorHandlers;
        private @Nullable Input<List<UrlMapArgs>> handlers;
        private @Nullable Input<HealthCheckArgs> healthCheck;
        private @Nullable Input<String> id;
        private @Nullable Input<List<VersionInboundServicesItem>> inboundServices;
        private @Nullable Input<String> instanceClass;
        private @Nullable Input<List<LibraryArgs>> libraries;
        private @Nullable Input<LivenessCheckArgs> livenessCheck;
        private @Nullable Input<ManualScalingArgs> manualScaling;
        private @Nullable Input<NetworkArgs> network;
        private @Nullable Input<String> nobuildFilesRegex;
        private @Nullable Input<ReadinessCheckArgs> readinessCheck;
        private @Nullable Input<ResourcesArgs> resources;
        private @Nullable Input<String> runtime;
        private @Nullable Input<String> runtimeApiVersion;
        private @Nullable Input<String> runtimeChannel;
        private @Nullable Input<String> runtimeMainExecutablePath;
        private @Nullable Input<String> serviceAccount;
        private Input<String> serviceId;
        private @Nullable Input<VersionServingStatus> servingStatus;
        private @Nullable Input<Boolean> threadsafe;
        private @Nullable Input<Boolean> vm;
        private @Nullable Input<VpcAccessConnectorArgs> vpcAccessConnector;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfig = defaults.apiConfig;
    	      this.appEngineApis = defaults.appEngineApis;
    	      this.appId = defaults.appId;
    	      this.automaticScaling = defaults.automaticScaling;
    	      this.basicScaling = defaults.basicScaling;
    	      this.betaSettings = defaults.betaSettings;
    	      this.buildEnvVariables = defaults.buildEnvVariables;
    	      this.defaultExpiration = defaults.defaultExpiration;
    	      this.deployment = defaults.deployment;
    	      this.endpointsApiService = defaults.endpointsApiService;
    	      this.entrypoint = defaults.entrypoint;
    	      this.env = defaults.env;
    	      this.envVariables = defaults.envVariables;
    	      this.errorHandlers = defaults.errorHandlers;
    	      this.handlers = defaults.handlers;
    	      this.healthCheck = defaults.healthCheck;
    	      this.id = defaults.id;
    	      this.inboundServices = defaults.inboundServices;
    	      this.instanceClass = defaults.instanceClass;
    	      this.libraries = defaults.libraries;
    	      this.livenessCheck = defaults.livenessCheck;
    	      this.manualScaling = defaults.manualScaling;
    	      this.network = defaults.network;
    	      this.nobuildFilesRegex = defaults.nobuildFilesRegex;
    	      this.readinessCheck = defaults.readinessCheck;
    	      this.resources = defaults.resources;
    	      this.runtime = defaults.runtime;
    	      this.runtimeApiVersion = defaults.runtimeApiVersion;
    	      this.runtimeChannel = defaults.runtimeChannel;
    	      this.runtimeMainExecutablePath = defaults.runtimeMainExecutablePath;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceId = defaults.serviceId;
    	      this.servingStatus = defaults.servingStatus;
    	      this.threadsafe = defaults.threadsafe;
    	      this.vm = defaults.vm;
    	      this.vpcAccessConnector = defaults.vpcAccessConnector;
        }

        public Builder apiConfig(@Nullable Input<ApiConfigHandlerArgs> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }

        public Builder apiConfig(@Nullable ApiConfigHandlerArgs apiConfig) {
            this.apiConfig = Input.ofNullable(apiConfig);
            return this;
        }

        public Builder appEngineApis(@Nullable Input<Boolean> appEngineApis) {
            this.appEngineApis = appEngineApis;
            return this;
        }

        public Builder appEngineApis(@Nullable Boolean appEngineApis) {
            this.appEngineApis = Input.ofNullable(appEngineApis);
            return this;
        }

        public Builder appId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder appId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder automaticScaling(@Nullable Input<AutomaticScalingArgs> automaticScaling) {
            this.automaticScaling = automaticScaling;
            return this;
        }

        public Builder automaticScaling(@Nullable AutomaticScalingArgs automaticScaling) {
            this.automaticScaling = Input.ofNullable(automaticScaling);
            return this;
        }

        public Builder basicScaling(@Nullable Input<BasicScalingArgs> basicScaling) {
            this.basicScaling = basicScaling;
            return this;
        }

        public Builder basicScaling(@Nullable BasicScalingArgs basicScaling) {
            this.basicScaling = Input.ofNullable(basicScaling);
            return this;
        }

        public Builder betaSettings(@Nullable Input<Map<String,String>> betaSettings) {
            this.betaSettings = betaSettings;
            return this;
        }

        public Builder betaSettings(@Nullable Map<String,String> betaSettings) {
            this.betaSettings = Input.ofNullable(betaSettings);
            return this;
        }

        public Builder buildEnvVariables(@Nullable Input<Map<String,String>> buildEnvVariables) {
            this.buildEnvVariables = buildEnvVariables;
            return this;
        }

        public Builder buildEnvVariables(@Nullable Map<String,String> buildEnvVariables) {
            this.buildEnvVariables = Input.ofNullable(buildEnvVariables);
            return this;
        }

        public Builder defaultExpiration(@Nullable Input<String> defaultExpiration) {
            this.defaultExpiration = defaultExpiration;
            return this;
        }

        public Builder defaultExpiration(@Nullable String defaultExpiration) {
            this.defaultExpiration = Input.ofNullable(defaultExpiration);
            return this;
        }

        public Builder deployment(@Nullable Input<DeploymentArgs> deployment) {
            this.deployment = deployment;
            return this;
        }

        public Builder deployment(@Nullable DeploymentArgs deployment) {
            this.deployment = Input.ofNullable(deployment);
            return this;
        }

        public Builder endpointsApiService(@Nullable Input<EndpointsApiServiceArgs> endpointsApiService) {
            this.endpointsApiService = endpointsApiService;
            return this;
        }

        public Builder endpointsApiService(@Nullable EndpointsApiServiceArgs endpointsApiService) {
            this.endpointsApiService = Input.ofNullable(endpointsApiService);
            return this;
        }

        public Builder entrypoint(@Nullable Input<EntrypointArgs> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        public Builder entrypoint(@Nullable EntrypointArgs entrypoint) {
            this.entrypoint = Input.ofNullable(entrypoint);
            return this;
        }

        public Builder env(@Nullable Input<String> env) {
            this.env = env;
            return this;
        }

        public Builder env(@Nullable String env) {
            this.env = Input.ofNullable(env);
            return this;
        }

        public Builder envVariables(@Nullable Input<Map<String,String>> envVariables) {
            this.envVariables = envVariables;
            return this;
        }

        public Builder envVariables(@Nullable Map<String,String> envVariables) {
            this.envVariables = Input.ofNullable(envVariables);
            return this;
        }

        public Builder errorHandlers(@Nullable Input<List<ErrorHandlerArgs>> errorHandlers) {
            this.errorHandlers = errorHandlers;
            return this;
        }

        public Builder errorHandlers(@Nullable List<ErrorHandlerArgs> errorHandlers) {
            this.errorHandlers = Input.ofNullable(errorHandlers);
            return this;
        }

        public Builder handlers(@Nullable Input<List<UrlMapArgs>> handlers) {
            this.handlers = handlers;
            return this;
        }

        public Builder handlers(@Nullable List<UrlMapArgs> handlers) {
            this.handlers = Input.ofNullable(handlers);
            return this;
        }

        public Builder healthCheck(@Nullable Input<HealthCheckArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        public Builder healthCheck(@Nullable HealthCheckArgs healthCheck) {
            this.healthCheck = Input.ofNullable(healthCheck);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder inboundServices(@Nullable Input<List<VersionInboundServicesItem>> inboundServices) {
            this.inboundServices = inboundServices;
            return this;
        }

        public Builder inboundServices(@Nullable List<VersionInboundServicesItem> inboundServices) {
            this.inboundServices = Input.ofNullable(inboundServices);
            return this;
        }

        public Builder instanceClass(@Nullable Input<String> instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }

        public Builder instanceClass(@Nullable String instanceClass) {
            this.instanceClass = Input.ofNullable(instanceClass);
            return this;
        }

        public Builder libraries(@Nullable Input<List<LibraryArgs>> libraries) {
            this.libraries = libraries;
            return this;
        }

        public Builder libraries(@Nullable List<LibraryArgs> libraries) {
            this.libraries = Input.ofNullable(libraries);
            return this;
        }

        public Builder livenessCheck(@Nullable Input<LivenessCheckArgs> livenessCheck) {
            this.livenessCheck = livenessCheck;
            return this;
        }

        public Builder livenessCheck(@Nullable LivenessCheckArgs livenessCheck) {
            this.livenessCheck = Input.ofNullable(livenessCheck);
            return this;
        }

        public Builder manualScaling(@Nullable Input<ManualScalingArgs> manualScaling) {
            this.manualScaling = manualScaling;
            return this;
        }

        public Builder manualScaling(@Nullable ManualScalingArgs manualScaling) {
            this.manualScaling = Input.ofNullable(manualScaling);
            return this;
        }

        public Builder network(@Nullable Input<NetworkArgs> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable NetworkArgs network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder nobuildFilesRegex(@Nullable Input<String> nobuildFilesRegex) {
            this.nobuildFilesRegex = nobuildFilesRegex;
            return this;
        }

        public Builder nobuildFilesRegex(@Nullable String nobuildFilesRegex) {
            this.nobuildFilesRegex = Input.ofNullable(nobuildFilesRegex);
            return this;
        }

        public Builder readinessCheck(@Nullable Input<ReadinessCheckArgs> readinessCheck) {
            this.readinessCheck = readinessCheck;
            return this;
        }

        public Builder readinessCheck(@Nullable ReadinessCheckArgs readinessCheck) {
            this.readinessCheck = Input.ofNullable(readinessCheck);
            return this;
        }

        public Builder resources(@Nullable Input<ResourcesArgs> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable ResourcesArgs resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder runtime(@Nullable Input<String> runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder runtime(@Nullable String runtime) {
            this.runtime = Input.ofNullable(runtime);
            return this;
        }

        public Builder runtimeApiVersion(@Nullable Input<String> runtimeApiVersion) {
            this.runtimeApiVersion = runtimeApiVersion;
            return this;
        }

        public Builder runtimeApiVersion(@Nullable String runtimeApiVersion) {
            this.runtimeApiVersion = Input.ofNullable(runtimeApiVersion);
            return this;
        }

        public Builder runtimeChannel(@Nullable Input<String> runtimeChannel) {
            this.runtimeChannel = runtimeChannel;
            return this;
        }

        public Builder runtimeChannel(@Nullable String runtimeChannel) {
            this.runtimeChannel = Input.ofNullable(runtimeChannel);
            return this;
        }

        public Builder runtimeMainExecutablePath(@Nullable Input<String> runtimeMainExecutablePath) {
            this.runtimeMainExecutablePath = runtimeMainExecutablePath;
            return this;
        }

        public Builder runtimeMainExecutablePath(@Nullable String runtimeMainExecutablePath) {
            this.runtimeMainExecutablePath = Input.ofNullable(runtimeMainExecutablePath);
            return this;
        }

        public Builder serviceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder serviceId(Input<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder serviceId(String serviceId) {
            this.serviceId = Input.of(Objects.requireNonNull(serviceId));
            return this;
        }

        public Builder servingStatus(@Nullable Input<VersionServingStatus> servingStatus) {
            this.servingStatus = servingStatus;
            return this;
        }

        public Builder servingStatus(@Nullable VersionServingStatus servingStatus) {
            this.servingStatus = Input.ofNullable(servingStatus);
            return this;
        }

        public Builder threadsafe(@Nullable Input<Boolean> threadsafe) {
            this.threadsafe = threadsafe;
            return this;
        }

        public Builder threadsafe(@Nullable Boolean threadsafe) {
            this.threadsafe = Input.ofNullable(threadsafe);
            return this;
        }

        public Builder vm(@Nullable Input<Boolean> vm) {
            this.vm = vm;
            return this;
        }

        public Builder vm(@Nullable Boolean vm) {
            this.vm = Input.ofNullable(vm);
            return this;
        }

        public Builder vpcAccessConnector(@Nullable Input<VpcAccessConnectorArgs> vpcAccessConnector) {
            this.vpcAccessConnector = vpcAccessConnector;
            return this;
        }

        public Builder vpcAccessConnector(@Nullable VpcAccessConnectorArgs vpcAccessConnector) {
            this.vpcAccessConnector = Input.ofNullable(vpcAccessConnector);
            return this;
        }
        public VersionArgs build() {
            return new VersionArgs(apiConfig, appEngineApis, appId, automaticScaling, basicScaling, betaSettings, buildEnvVariables, defaultExpiration, deployment, endpointsApiService, entrypoint, env, envVariables, errorHandlers, handlers, healthCheck, id, inboundServices, instanceClass, libraries, livenessCheck, manualScaling, network, nobuildFilesRegex, readinessCheck, resources, runtime, runtimeApiVersion, runtimeChannel, runtimeMainExecutablePath, serviceAccount, serviceId, servingStatus, threadsafe, vm, vpcAccessConnector);
        }
    }
}
