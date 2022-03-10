// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Compute node information related to a AmlCompute.
 * 
 */
public final class AmlComputeNodeInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AmlComputeNodeInformationResponse Empty = new AmlComputeNodeInformationResponse();

    /**
     * ID of the compute node.
     * 
     */
    @InputImport(name="nodeId", required=true)
      private final String nodeId;

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * State of the compute node. Values are idle, running, preparing, unusable, leaving and preempted.
     * 
     */
    @InputImport(name="nodeState", required=true)
      private final String nodeState;

    public String getNodeState() {
        return this.nodeState;
    }

    /**
     * SSH port number of the node.
     * 
     */
    @InputImport(name="port", required=true)
      private final Double port;

    public Double getPort() {
        return this.port;
    }

    /**
     * Private IP address of the compute node.
     * 
     */
    @InputImport(name="privateIpAddress", required=true)
      private final String privateIpAddress;

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Public IP address of the compute node.
     * 
     */
    @InputImport(name="publicIpAddress", required=true)
      private final String publicIpAddress;

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * ID of the Experiment running on the node, if any else null.
     * 
     */
    @InputImport(name="runId", required=true)
      private final String runId;

    public String getRunId() {
        return this.runId;
    }

    public AmlComputeNodeInformationResponse(
        String nodeId,
        String nodeState,
        Double port,
        String privateIpAddress,
        String publicIpAddress,
        String runId) {
        this.nodeId = Objects.requireNonNull(nodeId, "expected parameter 'nodeId' to be non-null");
        this.nodeState = Objects.requireNonNull(nodeState, "expected parameter 'nodeState' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
        this.publicIpAddress = Objects.requireNonNull(publicIpAddress, "expected parameter 'publicIpAddress' to be non-null");
        this.runId = Objects.requireNonNull(runId, "expected parameter 'runId' to be non-null");
    }

    private AmlComputeNodeInformationResponse() {
        this.nodeId = null;
        this.nodeState = null;
        this.port = null;
        this.privateIpAddress = null;
        this.publicIpAddress = null;
        this.runId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmlComputeNodeInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodeId;
        private String nodeState;
        private Double port;
        private String privateIpAddress;
        private String publicIpAddress;
        private String runId;

        public Builder() {
    	      // Empty
        }

        public Builder(AmlComputeNodeInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeId = defaults.nodeId;
    	      this.nodeState = defaults.nodeState;
    	      this.port = defaults.port;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.runId = defaults.runId;
        }

        public Builder nodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }

        public Builder nodeState(String nodeState) {
            this.nodeState = Objects.requireNonNull(nodeState);
            return this;
        }

        public Builder port(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }

        public Builder runId(String runId) {
            this.runId = Objects.requireNonNull(runId);
            return this;
        }
        public AmlComputeNodeInformationResponse build() {
            return new AmlComputeNodeInformationResponse(nodeId, nodeState, port, privateIpAddress, publicIpAddress, runId);
        }
    }
}
