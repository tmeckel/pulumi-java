// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.memcache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.memcache.inputs.InstanceMemcacheNodeGetArgs;
import io.pulumi.gcp.memcache.inputs.InstanceMemcacheParametersGetArgs;
import io.pulumi.gcp.memcache.inputs.InstanceNodeConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The full name of the GCE network to connect the instance to.  If not provided,
     * 'default' will be used.
     * 
     */
    @InputImport(name="authorizedNetwork")
      private final @Nullable Input<String> authorizedNetwork;

    public Input<String> getAuthorizedNetwork() {
        return this.authorizedNetwork == null ? Input.empty() : this.authorizedNetwork;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Endpoint for Discovery API
     * 
     */
    @InputImport(name="discoveryEndpoint")
      private final @Nullable Input<String> discoveryEndpoint;

    public Input<String> getDiscoveryEndpoint() {
        return this.discoveryEndpoint == null ? Input.empty() : this.discoveryEndpoint;
    }

    /**
     * A user-visible name for the instance.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The full version of memcached server running on this instance.
     * 
     */
    @InputImport(name="memcacheFullVersion")
      private final @Nullable Input<String> memcacheFullVersion;

    public Input<String> getMemcacheFullVersion() {
        return this.memcacheFullVersion == null ? Input.empty() : this.memcacheFullVersion;
    }

    /**
     * Additional information about the instance state, if available.
     * 
     */
    @InputImport(name="memcacheNodes")
      private final @Nullable Input<List<InstanceMemcacheNodeGetArgs>> memcacheNodes;

    public Input<List<InstanceMemcacheNodeGetArgs>> getMemcacheNodes() {
        return this.memcacheNodes == null ? Input.empty() : this.memcacheNodes;
    }

    /**
     * User-specified parameters for this memcache instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="memcacheParameters")
      private final @Nullable Input<InstanceMemcacheParametersGetArgs> memcacheParameters;

    public Input<InstanceMemcacheParametersGetArgs> getMemcacheParameters() {
        return this.memcacheParameters == null ? Input.empty() : this.memcacheParameters;
    }

    /**
     * The major version of Memcached software. If not provided, latest supported version will be used.
     * Currently the latest supported major version is MEMCACHE_1_5. The minor version will be automatically
     * determined by our system based on the latest supported minor version.
     * Default value is `MEMCACHE_1_5`.
     * Possible values are `MEMCACHE_1_5`.
     * 
     */
    @InputImport(name="memcacheVersion")
      private final @Nullable Input<String> memcacheVersion;

    public Input<String> getMemcacheVersion() {
        return this.memcacheVersion == null ? Input.empty() : this.memcacheVersion;
    }

    /**
     * The resource name of the instance.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration for memcache nodes.
     * Structure is documented below.
     * 
     */
    @InputImport(name="nodeConfig")
      private final @Nullable Input<InstanceNodeConfigGetArgs> nodeConfig;

    public Input<InstanceNodeConfigGetArgs> getNodeConfig() {
        return this.nodeConfig == null ? Input.empty() : this.nodeConfig;
    }

    /**
     * Number of nodes in the memcache instance.
     * 
     */
    @InputImport(name="nodeCount")
      private final @Nullable Input<Integer> nodeCount;

    public Input<Integer> getNodeCount() {
        return this.nodeCount == null ? Input.empty() : this.nodeCount;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the Memcache instance. If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Zones where memcache nodes should be provisioned.  If not
     * provided, all zones will be used.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public InstanceState(
        @Nullable Input<String> authorizedNetwork,
        @Nullable Input<String> createTime,
        @Nullable Input<String> discoveryEndpoint,
        @Nullable Input<String> displayName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> memcacheFullVersion,
        @Nullable Input<List<InstanceMemcacheNodeGetArgs>> memcacheNodes,
        @Nullable Input<InstanceMemcacheParametersGetArgs> memcacheParameters,
        @Nullable Input<String> memcacheVersion,
        @Nullable Input<String> name,
        @Nullable Input<InstanceNodeConfigGetArgs> nodeConfig,
        @Nullable Input<Integer> nodeCount,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<List<String>> zones) {
        this.authorizedNetwork = authorizedNetwork;
        this.createTime = createTime;
        this.discoveryEndpoint = discoveryEndpoint;
        this.displayName = displayName;
        this.labels = labels;
        this.memcacheFullVersion = memcacheFullVersion;
        this.memcacheNodes = memcacheNodes;
        this.memcacheParameters = memcacheParameters;
        this.memcacheVersion = memcacheVersion;
        this.name = name;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.project = project;
        this.region = region;
        this.zones = zones;
    }

    private InstanceState() {
        this.authorizedNetwork = Input.empty();
        this.createTime = Input.empty();
        this.discoveryEndpoint = Input.empty();
        this.displayName = Input.empty();
        this.labels = Input.empty();
        this.memcacheFullVersion = Input.empty();
        this.memcacheNodes = Input.empty();
        this.memcacheParameters = Input.empty();
        this.memcacheVersion = Input.empty();
        this.name = Input.empty();
        this.nodeConfig = Input.empty();
        this.nodeCount = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizedNetwork;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> discoveryEndpoint;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> memcacheFullVersion;
        private @Nullable Input<List<InstanceMemcacheNodeGetArgs>> memcacheNodes;
        private @Nullable Input<InstanceMemcacheParametersGetArgs> memcacheParameters;
        private @Nullable Input<String> memcacheVersion;
        private @Nullable Input<String> name;
        private @Nullable Input<InstanceNodeConfigGetArgs> nodeConfig;
        private @Nullable Input<Integer> nodeCount;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.createTime = defaults.createTime;
    	      this.discoveryEndpoint = defaults.discoveryEndpoint;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.memcacheFullVersion = defaults.memcacheFullVersion;
    	      this.memcacheNodes = defaults.memcacheNodes;
    	      this.memcacheParameters = defaults.memcacheParameters;
    	      this.memcacheVersion = defaults.memcacheVersion;
    	      this.name = defaults.name;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.zones = defaults.zones;
        }

        public Builder authorizedNetwork(@Nullable Input<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }

        public Builder authorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Input.ofNullable(authorizedNetwork);
            return this;
        }

        public Builder createTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder discoveryEndpoint(@Nullable Input<String> discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }

        public Builder discoveryEndpoint(@Nullable String discoveryEndpoint) {
            this.discoveryEndpoint = Input.ofNullable(discoveryEndpoint);
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

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder memcacheFullVersion(@Nullable Input<String> memcacheFullVersion) {
            this.memcacheFullVersion = memcacheFullVersion;
            return this;
        }

        public Builder memcacheFullVersion(@Nullable String memcacheFullVersion) {
            this.memcacheFullVersion = Input.ofNullable(memcacheFullVersion);
            return this;
        }

        public Builder memcacheNodes(@Nullable Input<List<InstanceMemcacheNodeGetArgs>> memcacheNodes) {
            this.memcacheNodes = memcacheNodes;
            return this;
        }

        public Builder memcacheNodes(@Nullable List<InstanceMemcacheNodeGetArgs> memcacheNodes) {
            this.memcacheNodes = Input.ofNullable(memcacheNodes);
            return this;
        }

        public Builder memcacheParameters(@Nullable Input<InstanceMemcacheParametersGetArgs> memcacheParameters) {
            this.memcacheParameters = memcacheParameters;
            return this;
        }

        public Builder memcacheParameters(@Nullable InstanceMemcacheParametersGetArgs memcacheParameters) {
            this.memcacheParameters = Input.ofNullable(memcacheParameters);
            return this;
        }

        public Builder memcacheVersion(@Nullable Input<String> memcacheVersion) {
            this.memcacheVersion = memcacheVersion;
            return this;
        }

        public Builder memcacheVersion(@Nullable String memcacheVersion) {
            this.memcacheVersion = Input.ofNullable(memcacheVersion);
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

        public Builder nodeConfig(@Nullable Input<InstanceNodeConfigGetArgs> nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }

        public Builder nodeConfig(@Nullable InstanceNodeConfigGetArgs nodeConfig) {
            this.nodeConfig = Input.ofNullable(nodeConfig);
            return this;
        }

        public Builder nodeCount(@Nullable Input<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Input.ofNullable(nodeCount);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder zones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public InstanceState build() {
            return new InstanceState(authorizedNetwork, createTime, discoveryEndpoint, displayName, labels, memcacheFullVersion, memcacheNodes, memcacheParameters, memcacheVersion, name, nodeConfig, nodeCount, project, region, zones);
        }
    }
}
