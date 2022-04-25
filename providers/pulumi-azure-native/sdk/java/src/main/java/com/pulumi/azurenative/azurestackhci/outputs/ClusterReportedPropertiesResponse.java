// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestackhci.outputs;

import com.pulumi.azurenative.azurestackhci.outputs.ClusterNodeResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClusterReportedPropertiesResponse {
    /**
     * @return Unique id generated by the on-prem cluster.
     * 
     */
    private final String clusterId;
    /**
     * @return Name of the on-prem cluster connected to this resource.
     * 
     */
    private final String clusterName;
    /**
     * @return Version of the cluster software.
     * 
     */
    private final String clusterVersion;
    /**
     * @return Last time the cluster reported the data.
     * 
     */
    private final String lastUpdated;
    /**
     * @return List of nodes reported by the cluster.
     * 
     */
    private final List<ClusterNodeResponse> nodes;

    @CustomType.Constructor
    private ClusterReportedPropertiesResponse(
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("clusterVersion") String clusterVersion,
        @CustomType.Parameter("lastUpdated") String lastUpdated,
        @CustomType.Parameter("nodes") List<ClusterNodeResponse> nodes) {
        this.clusterId = clusterId;
        this.clusterName = clusterName;
        this.clusterVersion = clusterVersion;
        this.lastUpdated = lastUpdated;
        this.nodes = nodes;
    }

    /**
     * @return Unique id generated by the on-prem cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return Name of the on-prem cluster connected to this resource.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return Version of the cluster software.
     * 
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }
    /**
     * @return Last time the cluster reported the data.
     * 
     */
    public String lastUpdated() {
        return this.lastUpdated;
    }
    /**
     * @return List of nodes reported by the cluster.
     * 
     */
    public List<ClusterNodeResponse> nodes() {
        return this.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterReportedPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private String clusterName;
        private String clusterVersion;
        private String lastUpdated;
        private List<ClusterNodeResponse> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterReportedPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.nodes = defaults.nodes;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }
        public Builder lastUpdated(String lastUpdated) {
            this.lastUpdated = Objects.requireNonNull(lastUpdated);
            return this;
        }
        public Builder nodes(List<ClusterNodeResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(ClusterNodeResponse... nodes) {
            return nodes(List.of(nodes));
        }        public ClusterReportedPropertiesResponse build() {
            return new ClusterReportedPropertiesResponse(clusterId, clusterName, clusterVersion, lastUpdated, nodes);
        }
    }
}
