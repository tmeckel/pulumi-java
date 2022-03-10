// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.AppEngineArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.CloudEndpointsArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.ClusterIstioArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.CustomArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.IstioCanonicalServiceArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.MeshIstioArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.TelemetryArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Type used for App Engine services.
     * 
     */
    @InputImport(name="appEngine")
      private final @Nullable Input<AppEngineArgs> appEngine;

    public Input<AppEngineArgs> getAppEngine() {
        return this.appEngine == null ? Input.empty() : this.appEngine;
    }

    /**
     * Type used for Cloud Endpoints services.
     * 
     */
    @InputImport(name="cloudEndpoints")
      private final @Nullable Input<CloudEndpointsArgs> cloudEndpoints;

    public Input<CloudEndpointsArgs> getCloudEndpoints() {
        return this.cloudEndpoints == null ? Input.empty() : this.cloudEndpoints;
    }

    /**
     * Type used for Istio services that live in a Kubernetes cluster.
     * 
     */
    @InputImport(name="clusterIstio")
      private final @Nullable Input<ClusterIstioArgs> clusterIstio;

    public Input<ClusterIstioArgs> getClusterIstio() {
        return this.clusterIstio == null ? Input.empty() : this.clusterIstio;
    }

    /**
     * Custom service type.
     * 
     */
    @InputImport(name="custom")
      private final @Nullable Input<CustomArgs> custom;

    public Input<CustomArgs> getCustom() {
        return this.custom == null ? Input.empty() : this.custom;
    }

    /**
     * Name used for UI elements listing this Service.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Type used for canonical services scoped to an Istio mesh. Metrics for Istio are documented here (https://istio.io/latest/docs/reference/config/metrics/)
     * 
     */
    @InputImport(name="istioCanonicalService")
      private final @Nullable Input<IstioCanonicalServiceArgs> istioCanonicalService;

    public Input<IstioCanonicalServiceArgs> getIstioCanonicalService() {
        return this.istioCanonicalService == null ? Input.empty() : this.istioCanonicalService;
    }

    /**
     * Type used for Istio services scoped to an Istio mesh.
     * 
     */
    @InputImport(name="meshIstio")
      private final @Nullable Input<MeshIstioArgs> meshIstio;

    public Input<MeshIstioArgs> getMeshIstio() {
        return this.meshIstio == null ? Input.empty() : this.meshIstio;
    }

    /**
     * Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="serviceId")
      private final @Nullable Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId == null ? Input.empty() : this.serviceId;
    }

    /**
     * Configuration for how to query telemetry on a Service.
     * 
     */
    @InputImport(name="telemetry")
      private final @Nullable Input<TelemetryArgs> telemetry;

    public Input<TelemetryArgs> getTelemetry() {
        return this.telemetry == null ? Input.empty() : this.telemetry;
    }

    /**
     * Labels which have been used to annotate the service. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes. Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic value, the empty string may be supplied for the label value.
     * 
     */
    @InputImport(name="userLabels")
      private final @Nullable Input<Map<String,String>> userLabels;

    public Input<Map<String,String>> getUserLabels() {
        return this.userLabels == null ? Input.empty() : this.userLabels;
    }

    @InputImport(name="v3Id", required=true)
      private final Input<String> v3Id;

    public Input<String> getV3Id() {
        return this.v3Id;
    }

    @InputImport(name="v3Id1", required=true)
      private final Input<String> v3Id1;

    public Input<String> getV3Id1() {
        return this.v3Id1;
    }

    public ServiceArgs(
        @Nullable Input<AppEngineArgs> appEngine,
        @Nullable Input<CloudEndpointsArgs> cloudEndpoints,
        @Nullable Input<ClusterIstioArgs> clusterIstio,
        @Nullable Input<CustomArgs> custom,
        @Nullable Input<String> displayName,
        @Nullable Input<IstioCanonicalServiceArgs> istioCanonicalService,
        @Nullable Input<MeshIstioArgs> meshIstio,
        @Nullable Input<String> name,
        @Nullable Input<String> serviceId,
        @Nullable Input<TelemetryArgs> telemetry,
        @Nullable Input<Map<String,String>> userLabels,
        Input<String> v3Id,
        Input<String> v3Id1) {
        this.appEngine = appEngine;
        this.cloudEndpoints = cloudEndpoints;
        this.clusterIstio = clusterIstio;
        this.custom = custom;
        this.displayName = displayName;
        this.istioCanonicalService = istioCanonicalService;
        this.meshIstio = meshIstio;
        this.name = name;
        this.serviceId = serviceId;
        this.telemetry = telemetry;
        this.userLabels = userLabels;
        this.v3Id = Objects.requireNonNull(v3Id, "expected parameter 'v3Id' to be non-null");
        this.v3Id1 = Objects.requireNonNull(v3Id1, "expected parameter 'v3Id1' to be non-null");
    }

    private ServiceArgs() {
        this.appEngine = Input.empty();
        this.cloudEndpoints = Input.empty();
        this.clusterIstio = Input.empty();
        this.custom = Input.empty();
        this.displayName = Input.empty();
        this.istioCanonicalService = Input.empty();
        this.meshIstio = Input.empty();
        this.name = Input.empty();
        this.serviceId = Input.empty();
        this.telemetry = Input.empty();
        this.userLabels = Input.empty();
        this.v3Id = Input.empty();
        this.v3Id1 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppEngineArgs> appEngine;
        private @Nullable Input<CloudEndpointsArgs> cloudEndpoints;
        private @Nullable Input<ClusterIstioArgs> clusterIstio;
        private @Nullable Input<CustomArgs> custom;
        private @Nullable Input<String> displayName;
        private @Nullable Input<IstioCanonicalServiceArgs> istioCanonicalService;
        private @Nullable Input<MeshIstioArgs> meshIstio;
        private @Nullable Input<String> name;
        private @Nullable Input<String> serviceId;
        private @Nullable Input<TelemetryArgs> telemetry;
        private @Nullable Input<Map<String,String>> userLabels;
        private Input<String> v3Id;
        private Input<String> v3Id1;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngine = defaults.appEngine;
    	      this.cloudEndpoints = defaults.cloudEndpoints;
    	      this.clusterIstio = defaults.clusterIstio;
    	      this.custom = defaults.custom;
    	      this.displayName = defaults.displayName;
    	      this.istioCanonicalService = defaults.istioCanonicalService;
    	      this.meshIstio = defaults.meshIstio;
    	      this.name = defaults.name;
    	      this.serviceId = defaults.serviceId;
    	      this.telemetry = defaults.telemetry;
    	      this.userLabels = defaults.userLabels;
    	      this.v3Id = defaults.v3Id;
    	      this.v3Id1 = defaults.v3Id1;
        }

        public Builder appEngine(@Nullable Input<AppEngineArgs> appEngine) {
            this.appEngine = appEngine;
            return this;
        }

        public Builder appEngine(@Nullable AppEngineArgs appEngine) {
            this.appEngine = Input.ofNullable(appEngine);
            return this;
        }

        public Builder cloudEndpoints(@Nullable Input<CloudEndpointsArgs> cloudEndpoints) {
            this.cloudEndpoints = cloudEndpoints;
            return this;
        }

        public Builder cloudEndpoints(@Nullable CloudEndpointsArgs cloudEndpoints) {
            this.cloudEndpoints = Input.ofNullable(cloudEndpoints);
            return this;
        }

        public Builder clusterIstio(@Nullable Input<ClusterIstioArgs> clusterIstio) {
            this.clusterIstio = clusterIstio;
            return this;
        }

        public Builder clusterIstio(@Nullable ClusterIstioArgs clusterIstio) {
            this.clusterIstio = Input.ofNullable(clusterIstio);
            return this;
        }

        public Builder custom(@Nullable Input<CustomArgs> custom) {
            this.custom = custom;
            return this;
        }

        public Builder custom(@Nullable CustomArgs custom) {
            this.custom = Input.ofNullable(custom);
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder istioCanonicalService(@Nullable Input<IstioCanonicalServiceArgs> istioCanonicalService) {
            this.istioCanonicalService = istioCanonicalService;
            return this;
        }

        public Builder istioCanonicalService(@Nullable IstioCanonicalServiceArgs istioCanonicalService) {
            this.istioCanonicalService = Input.ofNullable(istioCanonicalService);
            return this;
        }

        public Builder meshIstio(@Nullable Input<MeshIstioArgs> meshIstio) {
            this.meshIstio = meshIstio;
            return this;
        }

        public Builder meshIstio(@Nullable MeshIstioArgs meshIstio) {
            this.meshIstio = Input.ofNullable(meshIstio);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder serviceId(@Nullable Input<String> serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = Input.ofNullable(serviceId);
            return this;
        }

        public Builder telemetry(@Nullable Input<TelemetryArgs> telemetry) {
            this.telemetry = telemetry;
            return this;
        }

        public Builder telemetry(@Nullable TelemetryArgs telemetry) {
            this.telemetry = Input.ofNullable(telemetry);
            return this;
        }

        public Builder userLabels(@Nullable Input<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public Builder userLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Input.ofNullable(userLabels);
            return this;
        }

        public Builder v3Id(Input<String> v3Id) {
            this.v3Id = Objects.requireNonNull(v3Id);
            return this;
        }

        public Builder v3Id(String v3Id) {
            this.v3Id = Input.of(Objects.requireNonNull(v3Id));
            return this;
        }

        public Builder v3Id1(Input<String> v3Id1) {
            this.v3Id1 = Objects.requireNonNull(v3Id1);
            return this;
        }

        public Builder v3Id1(String v3Id1) {
            this.v3Id1 = Input.of(Objects.requireNonNull(v3Id1));
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(appEngine, cloudEndpoints, clusterIstio, custom, displayName, istioCanonicalService, meshIstio, name, serviceId, telemetry, userLabels, v3Id, v3Id1);
        }
    }
}
