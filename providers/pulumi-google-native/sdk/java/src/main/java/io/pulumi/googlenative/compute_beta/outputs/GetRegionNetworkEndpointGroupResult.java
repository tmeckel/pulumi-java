// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.NetworkEndpointGroupAppEngineResponse;
import io.pulumi.googlenative.compute_beta.outputs.NetworkEndpointGroupCloudFunctionResponse;
import io.pulumi.googlenative.compute_beta.outputs.NetworkEndpointGroupCloudRunResponse;
import io.pulumi.googlenative.compute_beta.outputs.NetworkEndpointGroupServerlessDeploymentResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRegionNetworkEndpointGroupResult {
    /**
     * Metadata defined as annotations on the network endpoint group.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    private final NetworkEndpointGroupAppEngineResponse appEngine;
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    private final NetworkEndpointGroupCloudFunctionResponse cloudFunction;
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    private final NetworkEndpointGroupCloudRunResponse cloudRun;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * The default port used if the port number is not specified in the network endpoint.
     * 
     */
    private final Integer defaultPort;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
     * 
     */
    private final String kind;
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project network if unspecified.
     * 
     */
    private final String network;
    /**
     * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    private final String networkEndpointType;
    /**
     * The target service url used to set up private service connection to a Google API. An example value is: "asia-northeast3-cloudkms.googleapis.com"
     * 
     */
    private final String pscTargetService;
    /**
     * The URL of the region where the network endpoint group is located.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    private final NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment;
    /**
     * [Output only] Number of network endpoints in the network endpoint group.
     * 
     */
    private final Integer size;
    /**
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    private final String subnetwork;
    /**
     * The URL of the zone where the network endpoint group is located.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor({"annotations","appEngine","cloudFunction","cloudRun","creationTimestamp","defaultPort","description","kind","name","network","networkEndpointType","pscTargetService","region","selfLink","serverlessDeployment","size","subnetwork","zone"})
    private GetRegionNetworkEndpointGroupResult(
        Map<String,String> annotations,
        NetworkEndpointGroupAppEngineResponse appEngine,
        NetworkEndpointGroupCloudFunctionResponse cloudFunction,
        NetworkEndpointGroupCloudRunResponse cloudRun,
        String creationTimestamp,
        Integer defaultPort,
        String description,
        String kind,
        String name,
        String network,
        String networkEndpointType,
        String pscTargetService,
        String region,
        String selfLink,
        NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment,
        Integer size,
        String subnetwork,
        String zone) {
        this.annotations = Objects.requireNonNull(annotations);
        this.appEngine = Objects.requireNonNull(appEngine);
        this.cloudFunction = Objects.requireNonNull(cloudFunction);
        this.cloudRun = Objects.requireNonNull(cloudRun);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.defaultPort = Objects.requireNonNull(defaultPort);
        this.description = Objects.requireNonNull(description);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.networkEndpointType = Objects.requireNonNull(networkEndpointType);
        this.pscTargetService = Objects.requireNonNull(pscTargetService);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.serverlessDeployment = Objects.requireNonNull(serverlessDeployment);
        this.size = Objects.requireNonNull(size);
        this.subnetwork = Objects.requireNonNull(subnetwork);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * Metadata defined as annotations on the network endpoint group.
     * 
     */
    public Map<String,String> getAnnotations() {
        return this.annotations;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public NetworkEndpointGroupAppEngineResponse getAppEngine() {
        return this.appEngine;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public NetworkEndpointGroupCloudFunctionResponse getCloudFunction() {
        return this.cloudFunction;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine or cloudFunction may be set.
     * 
     */
    public NetworkEndpointGroupCloudRunResponse getCloudRun() {
        return this.cloudRun;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * The default port used if the port number is not specified in the network endpoint.
     * 
     */
    public Integer getDefaultPort() {
        return this.defaultPort;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Type of the resource. Always compute#networkEndpointGroup for network endpoint group.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project network if unspecified.
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Type of network endpoints in this network endpoint group. Can be one of GCE_VM_IP_PORT, NON_GCP_PRIVATE_IP_PORT, INTERNET_FQDN_PORT, INTERNET_IP_PORT, SERVERLESS, PRIVATE_SERVICE_CONNECT.
     * 
     */
    public String getNetworkEndpointType() {
        return this.networkEndpointType;
    }
    /**
     * The target service url used to set up private service connection to a Google API. An example value is: "asia-northeast3-cloudkms.googleapis.com"
     * 
     */
    public String getPscTargetService() {
        return this.pscTargetService;
    }
    /**
     * The URL of the region where the network endpoint group is located.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Only valid when networkEndpointType is "SERVERLESS". Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * 
     */
    public NetworkEndpointGroupServerlessDeploymentResponse getServerlessDeployment() {
        return this.serverlessDeployment;
    }
    /**
     * [Output only] Number of network endpoints in the network endpoint group.
     * 
     */
    public Integer getSize() {
        return this.size;
    }
    /**
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    public String getSubnetwork() {
        return this.subnetwork;
    }
    /**
     * The URL of the zone where the network endpoint group is located.
     * 
     */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionNetworkEndpointGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private NetworkEndpointGroupAppEngineResponse appEngine;
        private NetworkEndpointGroupCloudFunctionResponse cloudFunction;
        private NetworkEndpointGroupCloudRunResponse cloudRun;
        private String creationTimestamp;
        private Integer defaultPort;
        private String description;
        private String kind;
        private String name;
        private String network;
        private String networkEndpointType;
        private String pscTargetService;
        private String region;
        private String selfLink;
        private NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment;
        private Integer size;
        private String subnetwork;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionNetworkEndpointGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.appEngine = defaults.appEngine;
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRun = defaults.cloudRun;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.defaultPort = defaults.defaultPort;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.pscTargetService = defaults.pscTargetService;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.serverlessDeployment = defaults.serverlessDeployment;
    	      this.size = defaults.size;
    	      this.subnetwork = defaults.subnetwork;
    	      this.zone = defaults.zone;
        }

        public Builder setAnnotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder setAppEngine(NetworkEndpointGroupAppEngineResponse appEngine) {
            this.appEngine = Objects.requireNonNull(appEngine);
            return this;
        }

        public Builder setCloudFunction(NetworkEndpointGroupCloudFunctionResponse cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }

        public Builder setCloudRun(NetworkEndpointGroupCloudRunResponse cloudRun) {
            this.cloudRun = Objects.requireNonNull(cloudRun);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDefaultPort(Integer defaultPort) {
            this.defaultPort = Objects.requireNonNull(defaultPort);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetworkEndpointType(String networkEndpointType) {
            this.networkEndpointType = Objects.requireNonNull(networkEndpointType);
            return this;
        }

        public Builder setPscTargetService(String pscTargetService) {
            this.pscTargetService = Objects.requireNonNull(pscTargetService);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setServerlessDeployment(NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment) {
            this.serverlessDeployment = Objects.requireNonNull(serverlessDeployment);
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetRegionNetworkEndpointGroupResult build() {
            return new GetRegionNetworkEndpointGroupResult(annotations, appEngine, cloudFunction, cloudRun, creationTimestamp, defaultPort, description, kind, name, network, networkEndpointType, pscTargetService, region, selfLink, serverlessDeployment, size, subnetwork, zone);
        }
    }
}
