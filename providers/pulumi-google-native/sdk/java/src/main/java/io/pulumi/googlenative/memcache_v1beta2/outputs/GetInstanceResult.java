// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.memcache_v1beta2.outputs.InstanceMessageResponse;
import io.pulumi.googlenative.memcache_v1beta2.outputs.MemcacheParametersResponse;
import io.pulumi.googlenative.memcache_v1beta2.outputs.NodeConfigResponse;
import io.pulumi.googlenative.memcache_v1beta2.outputs.NodeResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceResult {
    /**
     * The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    private final String authorizedNetwork;
    /**
     * The time the instance was created.
     * 
     */
    private final String createTime;
    /**
     * Endpoint for the Discovery API.
     * 
     */
    private final String discoveryEndpoint;
    /**
     * User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
     * 
     */
    private final String displayName;
    /**
     * List of messages that describe the current state of the Memcached instance.
     * 
     */
    private final List<InstanceMessageResponse> instanceMessages;
    /**
     * Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    private final Map<String,String> labels;
    /**
     * The full version of memcached server running on this instance. System automatically determines the full memcached version for an instance based on the input MemcacheVersion. The full version format will be "memcached-1.5.16".
     * 
     */
    private final String memcacheFullVersion;
    /**
     * List of Memcached nodes. Refer to Node message for more details.
     * 
     */
    private final List<NodeResponse> memcacheNodes;
    /**
     * The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
     */
    private final String memcacheVersion;
    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
     * 
     */
    private final String name;
    /**
     * Configuration for Memcached nodes.
     * 
     */
    private final NodeConfigResponse nodeConfig;
    /**
     * Number of nodes in the Memcached instance.
     * 
     */
    private final Integer nodeCount;
    /**
     * User defined parameters to apply to the memcached process on each node.
     * 
     */
    private final MemcacheParametersResponse parameters;
    /**
     * The state of this Memcached instance.
     * 
     */
    private final String state;
    /**
     * Returns true if there is an update waiting to be applied
     * 
     */
    private final Boolean updateAvailable;
    /**
     * The time the instance was updated.
     * 
     */
    private final String updateTime;
    /**
     * Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
     * 
     */
    private final List<String> zones;

    @OutputCustomType.Constructor
    private GetInstanceResult(
        @OutputCustomType.Parameter("authorizedNetwork") String authorizedNetwork,
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("discoveryEndpoint") String discoveryEndpoint,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("instanceMessages") List<InstanceMessageResponse> instanceMessages,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("memcacheFullVersion") String memcacheFullVersion,
        @OutputCustomType.Parameter("memcacheNodes") List<NodeResponse> memcacheNodes,
        @OutputCustomType.Parameter("memcacheVersion") String memcacheVersion,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("nodeConfig") NodeConfigResponse nodeConfig,
        @OutputCustomType.Parameter("nodeCount") Integer nodeCount,
        @OutputCustomType.Parameter("parameters") MemcacheParametersResponse parameters,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("updateAvailable") Boolean updateAvailable,
        @OutputCustomType.Parameter("updateTime") String updateTime,
        @OutputCustomType.Parameter("zones") List<String> zones) {
        this.authorizedNetwork = authorizedNetwork;
        this.createTime = createTime;
        this.discoveryEndpoint = discoveryEndpoint;
        this.displayName = displayName;
        this.instanceMessages = instanceMessages;
        this.labels = labels;
        this.memcacheFullVersion = memcacheFullVersion;
        this.memcacheNodes = memcacheNodes;
        this.memcacheVersion = memcacheVersion;
        this.name = name;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.parameters = parameters;
        this.state = state;
        this.updateAvailable = updateAvailable;
        this.updateTime = updateTime;
        this.zones = zones;
    }

    /**
     * The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
    */
    public String getAuthorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * The time the instance was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Endpoint for the Discovery API.
     * 
    */
    public String getDiscoveryEndpoint() {
        return this.discoveryEndpoint;
    }
    /**
     * User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * List of messages that describe the current state of the Memcached instance.
     * 
    */
    public List<InstanceMessageResponse> getInstanceMessages() {
        return this.instanceMessages;
    }
    /**
     * Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The full version of memcached server running on this instance. System automatically determines the full memcached version for an instance based on the input MemcacheVersion. The full version format will be "memcached-1.5.16".
     * 
    */
    public String getMemcacheFullVersion() {
        return this.memcacheFullVersion;
    }
    /**
     * List of Memcached nodes. Refer to Node message for more details.
     * 
    */
    public List<NodeResponse> getMemcacheNodes() {
        return this.memcacheNodes;
    }
    /**
     * The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
    */
    public String getMemcacheVersion() {
        return this.memcacheVersion;
    }
    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Configuration for Memcached nodes.
     * 
    */
    public NodeConfigResponse getNodeConfig() {
        return this.nodeConfig;
    }
    /**
     * Number of nodes in the Memcached instance.
     * 
    */
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    /**
     * User defined parameters to apply to the memcached process on each node.
     * 
    */
    public MemcacheParametersResponse getParameters() {
        return this.parameters;
    }
    /**
     * The state of this Memcached instance.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Returns true if there is an update waiting to be applied
     * 
    */
    public Boolean getUpdateAvailable() {
        return this.updateAvailable;
    }
    /**
     * The time the instance was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
     * 
    */
    public List<String> getZones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizedNetwork;
        private String createTime;
        private String discoveryEndpoint;
        private String displayName;
        private List<InstanceMessageResponse> instanceMessages;
        private Map<String,String> labels;
        private String memcacheFullVersion;
        private List<NodeResponse> memcacheNodes;
        private String memcacheVersion;
        private String name;
        private NodeConfigResponse nodeConfig;
        private Integer nodeCount;
        private MemcacheParametersResponse parameters;
        private String state;
        private Boolean updateAvailable;
        private String updateTime;
        private List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.createTime = defaults.createTime;
    	      this.discoveryEndpoint = defaults.discoveryEndpoint;
    	      this.displayName = defaults.displayName;
    	      this.instanceMessages = defaults.instanceMessages;
    	      this.labels = defaults.labels;
    	      this.memcacheFullVersion = defaults.memcacheFullVersion;
    	      this.memcacheNodes = defaults.memcacheNodes;
    	      this.memcacheVersion = defaults.memcacheVersion;
    	      this.name = defaults.name;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.parameters = defaults.parameters;
    	      this.state = defaults.state;
    	      this.updateAvailable = defaults.updateAvailable;
    	      this.updateTime = defaults.updateTime;
    	      this.zones = defaults.zones;
        }

        public Builder authorizedNetwork(String authorizedNetwork) {
            this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder discoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = Objects.requireNonNull(discoveryEndpoint);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder instanceMessages(List<InstanceMessageResponse> instanceMessages) {
            this.instanceMessages = Objects.requireNonNull(instanceMessages);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder memcacheFullVersion(String memcacheFullVersion) {
            this.memcacheFullVersion = Objects.requireNonNull(memcacheFullVersion);
            return this;
        }

        public Builder memcacheNodes(List<NodeResponse> memcacheNodes) {
            this.memcacheNodes = Objects.requireNonNull(memcacheNodes);
            return this;
        }

        public Builder memcacheVersion(String memcacheVersion) {
            this.memcacheVersion = Objects.requireNonNull(memcacheVersion);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder nodeConfig(NodeConfigResponse nodeConfig) {
            this.nodeConfig = Objects.requireNonNull(nodeConfig);
            return this;
        }

        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }

        public Builder parameters(MemcacheParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder updateAvailable(Boolean updateAvailable) {
            this.updateAvailable = Objects.requireNonNull(updateAvailable);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder zones(List<String> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public GetInstanceResult build() {
            return new GetInstanceResult(authorizedNetwork, createTime, discoveryEndpoint, displayName, instanceMessages, labels, memcacheFullVersion, memcacheNodes, memcacheVersion, name, nodeConfig, nodeCount, parameters, state, updateAvailable, updateTime, zones);
        }
    }
}
