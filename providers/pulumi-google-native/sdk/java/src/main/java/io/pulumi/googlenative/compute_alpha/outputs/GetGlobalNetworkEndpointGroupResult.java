// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupAppEngineResponse;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupCloudFunctionResponse;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupCloudRunResponse;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkEndpointGroupServerlessDeploymentResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetGlobalNetworkEndpointGroupResult {
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
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
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
     * Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
     */
    private final String type;
    /**
     * The URL of the zone where the network endpoint group is located.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor
    private GetGlobalNetworkEndpointGroupResult(
        @OutputCustomType.Parameter("annotations") Map<String,String> annotations,
        @OutputCustomType.Parameter("appEngine") NetworkEndpointGroupAppEngineResponse appEngine,
        @OutputCustomType.Parameter("cloudFunction") NetworkEndpointGroupCloudFunctionResponse cloudFunction,
        @OutputCustomType.Parameter("cloudRun") NetworkEndpointGroupCloudRunResponse cloudRun,
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("defaultPort") Integer defaultPort,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("network") String network,
        @OutputCustomType.Parameter("networkEndpointType") String networkEndpointType,
        @OutputCustomType.Parameter("pscTargetService") String pscTargetService,
        @OutputCustomType.Parameter("region") String region,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @OutputCustomType.Parameter("serverlessDeployment") NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment,
        @OutputCustomType.Parameter("size") Integer size,
        @OutputCustomType.Parameter("subnetwork") String subnetwork,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("zone") String zone) {
        this.annotations = annotations;
        this.appEngine = appEngine;
        this.cloudFunction = cloudFunction;
        this.cloudRun = cloudRun;
        this.creationTimestamp = creationTimestamp;
        this.defaultPort = defaultPort;
        this.description = description;
        this.kind = kind;
        this.name = name;
        this.network = network;
        this.networkEndpointType = networkEndpointType;
        this.pscTargetService = pscTargetService;
        this.region = region;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.serverlessDeployment = serverlessDeployment;
        this.size = size;
        this.subnetwork = subnetwork;
        this.type = type;
        this.zone = zone;
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
     * Server-defined URL for this resource with the resource id.
     * 
    */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
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
     * Specify the type of this network endpoint group. Only LOAD_BALANCING is valid for now.
     * 
    */
    public String getType() {
        return this.type;
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

    public static Builder builder(GetGlobalNetworkEndpointGroupResult defaults) {
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
        private String selfLinkWithId;
        private NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment;
        private Integer size;
        private String subnetwork;
        private String type;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalNetworkEndpointGroupResult defaults) {
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
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.serverlessDeployment = defaults.serverlessDeployment;
    	      this.size = defaults.size;
    	      this.subnetwork = defaults.subnetwork;
    	      this.type = defaults.type;
    	      this.zone = defaults.zone;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder appEngine(NetworkEndpointGroupAppEngineResponse appEngine) {
            this.appEngine = Objects.requireNonNull(appEngine);
            return this;
        }

        public Builder cloudFunction(NetworkEndpointGroupCloudFunctionResponse cloudFunction) {
            this.cloudFunction = Objects.requireNonNull(cloudFunction);
            return this;
        }

        public Builder cloudRun(NetworkEndpointGroupCloudRunResponse cloudRun) {
            this.cloudRun = Objects.requireNonNull(cloudRun);
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder defaultPort(Integer defaultPort) {
            this.defaultPort = Objects.requireNonNull(defaultPort);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder networkEndpointType(String networkEndpointType) {
            this.networkEndpointType = Objects.requireNonNull(networkEndpointType);
            return this;
        }

        public Builder pscTargetService(String pscTargetService) {
            this.pscTargetService = Objects.requireNonNull(pscTargetService);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder serverlessDeployment(NetworkEndpointGroupServerlessDeploymentResponse serverlessDeployment) {
            this.serverlessDeployment = Objects.requireNonNull(serverlessDeployment);
            return this;
        }

        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetGlobalNetworkEndpointGroupResult build() {
            return new GetGlobalNetworkEndpointGroupResult(annotations, appEngine, cloudFunction, cloudRun, creationTimestamp, defaultPort, description, kind, name, network, networkEndpointType, pscTargetService, region, selfLink, selfLinkWithId, serverlessDeployment, size, subnetwork, type, zone);
        }
    }
}
