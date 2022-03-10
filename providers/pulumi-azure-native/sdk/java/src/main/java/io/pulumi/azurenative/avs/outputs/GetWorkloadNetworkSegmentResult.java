// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.azurenative.avs.outputs.WorkloadNetworkSegmentPortVifResponse;
import io.pulumi.azurenative.avs.outputs.WorkloadNetworkSegmentSubnetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadNetworkSegmentResult {
    /**
     * Gateway which to connect segment to.
     * 
     */
    private final @Nullable String connectedGateway;
    /**
     * Display name of the segment.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Port Vif which segment is associated with.
     * 
     */
    private final List<WorkloadNetworkSegmentPortVifResponse> portVif;
    /**
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * NSX revision number.
     * 
     */
    private final @Nullable Double revision;
    /**
     * Segment status.
     * 
     */
    private final String status;
    /**
     * Subnet which to connect segment to.
     * 
     */
    private final @Nullable WorkloadNetworkSegmentSubnetResponse subnet;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetWorkloadNetworkSegmentResult(
        @OutputCustomType.Parameter("connectedGateway") @Nullable String connectedGateway,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("portVif") List<WorkloadNetworkSegmentPortVifResponse> portVif,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("revision") @Nullable Double revision,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("subnet") @Nullable WorkloadNetworkSegmentSubnetResponse subnet,
        @OutputCustomType.Parameter("type") String type) {
        this.connectedGateway = connectedGateway;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.portVif = portVif;
        this.provisioningState = provisioningState;
        this.revision = revision;
        this.status = status;
        this.subnet = subnet;
        this.type = type;
    }

    /**
     * Gateway which to connect segment to.
     * 
    */
    public Optional<String> getConnectedGateway() {
        return Optional.ofNullable(this.connectedGateway);
    }
    /**
     * Display name of the segment.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Port Vif which segment is associated with.
     * 
    */
    public List<WorkloadNetworkSegmentPortVifResponse> getPortVif() {
        return this.portVif;
    }
    /**
     * The provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * NSX revision number.
     * 
    */
    public Optional<Double> getRevision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * Segment status.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Subnet which to connect segment to.
     * 
    */
    public Optional<WorkloadNetworkSegmentSubnetResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkSegmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectedGateway;
        private @Nullable String displayName;
        private String id;
        private String name;
        private List<WorkloadNetworkSegmentPortVifResponse> portVif;
        private String provisioningState;
        private @Nullable Double revision;
        private String status;
        private @Nullable WorkloadNetworkSegmentSubnetResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkSegmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectedGateway = defaults.connectedGateway;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.portVif = defaults.portVif;
    	      this.provisioningState = defaults.provisioningState;
    	      this.revision = defaults.revision;
    	      this.status = defaults.status;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder connectedGateway(@Nullable String connectedGateway) {
            this.connectedGateway = connectedGateway;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder portVif(List<WorkloadNetworkSegmentPortVifResponse> portVif) {
            this.portVif = Objects.requireNonNull(portVif);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder revision(@Nullable Double revision) {
            this.revision = revision;
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder subnet(@Nullable WorkloadNetworkSegmentSubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWorkloadNetworkSegmentResult build() {
            return new GetWorkloadNetworkSegmentResult(connectedGateway, displayName, id, name, portVif, provisioningState, revision, status, subnet, type);
        }
    }
}
