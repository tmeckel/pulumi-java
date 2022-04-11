// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.ManagedCassandraProvisioningState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a managed Cassandra data center.
 * 
 */
public final class DataCenterResourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCenterResourcePropertiesArgs Empty = new DataCenterResourcePropertiesArgs();

    /**
     * A fragment of a cassandra.yaml configuration file to be included in the cassandra.yaml for all nodes in this data center. The fragment should be Base64 encoded, and only a subset of keys are allowed.
     * 
     */
    @Import(name="base64EncodedCassandraYamlFragment")
      private final @Nullable Output<String> base64EncodedCassandraYamlFragment;

    public Output<String> getBase64EncodedCassandraYamlFragment() {
        return this.base64EncodedCassandraYamlFragment == null ? Codegen.empty() : this.base64EncodedCassandraYamlFragment;
    }

    /**
     * The region this data center should be created in.
     * 
     */
    @Import(name="dataCenterLocation")
      private final @Nullable Output<String> dataCenterLocation;

    public Output<String> getDataCenterLocation() {
        return this.dataCenterLocation == null ? Codegen.empty() : this.dataCenterLocation;
    }

    /**
     * Resource id of a subnet the nodes in this data center should have their network interfaces connected to. The subnet must be in the same region specified in 'dataCenterLocation' and must be able to route to the subnet specified in the cluster's 'delegatedManagementSubnetId' property. This resource id will be of the form '/subscriptions/<subscription id>/resourceGroups/<resource group>/providers/Microsoft.Network/virtualNetworks/<virtual network>/subnets/<subnet>'.
     * 
     */
    @Import(name="delegatedSubnetId")
      private final @Nullable Output<String> delegatedSubnetId;

    public Output<String> getDelegatedSubnetId() {
        return this.delegatedSubnetId == null ? Codegen.empty() : this.delegatedSubnetId;
    }

    /**
     * The number of nodes the data center should have. This is the desired number. After it is set, it may take some time for the data center to be scaled to match. To monitor the number of nodes and their status, use the fetchNodeStatus method on the cluster.
     * 
     */
    @Import(name="nodeCount")
      private final @Nullable Output<Integer> nodeCount;

    public Output<Integer> getNodeCount() {
        return this.nodeCount == null ? Codegen.empty() : this.nodeCount;
    }

    /**
     * The status of the resource at the time the operation was called.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,ManagedCassandraProvisioningState>> provisioningState;

    public Output<Either<String,ManagedCassandraProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
    }

    public DataCenterResourcePropertiesArgs(
        @Nullable Output<String> base64EncodedCassandraYamlFragment,
        @Nullable Output<String> dataCenterLocation,
        @Nullable Output<String> delegatedSubnetId,
        @Nullable Output<Integer> nodeCount,
        @Nullable Output<Either<String,ManagedCassandraProvisioningState>> provisioningState) {
        this.base64EncodedCassandraYamlFragment = base64EncodedCassandraYamlFragment;
        this.dataCenterLocation = dataCenterLocation;
        this.delegatedSubnetId = delegatedSubnetId;
        this.nodeCount = nodeCount;
        this.provisioningState = provisioningState;
    }

    private DataCenterResourcePropertiesArgs() {
        this.base64EncodedCassandraYamlFragment = Codegen.empty();
        this.dataCenterLocation = Codegen.empty();
        this.delegatedSubnetId = Codegen.empty();
        this.nodeCount = Codegen.empty();
        this.provisioningState = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCenterResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> base64EncodedCassandraYamlFragment;
        private @Nullable Output<String> dataCenterLocation;
        private @Nullable Output<String> delegatedSubnetId;
        private @Nullable Output<Integer> nodeCount;
        private @Nullable Output<Either<String,ManagedCassandraProvisioningState>> provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCenterResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base64EncodedCassandraYamlFragment = defaults.base64EncodedCassandraYamlFragment;
    	      this.dataCenterLocation = defaults.dataCenterLocation;
    	      this.delegatedSubnetId = defaults.delegatedSubnetId;
    	      this.nodeCount = defaults.nodeCount;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder base64EncodedCassandraYamlFragment(@Nullable Output<String> base64EncodedCassandraYamlFragment) {
            this.base64EncodedCassandraYamlFragment = base64EncodedCassandraYamlFragment;
            return this;
        }
        public Builder base64EncodedCassandraYamlFragment(@Nullable String base64EncodedCassandraYamlFragment) {
            this.base64EncodedCassandraYamlFragment = Codegen.ofNullable(base64EncodedCassandraYamlFragment);
            return this;
        }
        public Builder dataCenterLocation(@Nullable Output<String> dataCenterLocation) {
            this.dataCenterLocation = dataCenterLocation;
            return this;
        }
        public Builder dataCenterLocation(@Nullable String dataCenterLocation) {
            this.dataCenterLocation = Codegen.ofNullable(dataCenterLocation);
            return this;
        }
        public Builder delegatedSubnetId(@Nullable Output<String> delegatedSubnetId) {
            this.delegatedSubnetId = delegatedSubnetId;
            return this;
        }
        public Builder delegatedSubnetId(@Nullable String delegatedSubnetId) {
            this.delegatedSubnetId = Codegen.ofNullable(delegatedSubnetId);
            return this;
        }
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Codegen.ofNullable(nodeCount);
            return this;
        }
        public Builder provisioningState(@Nullable Output<Either<String,ManagedCassandraProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,ManagedCassandraProvisioningState> provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
            return this;
        }        public DataCenterResourcePropertiesArgs build() {
            return new DataCenterResourcePropertiesArgs(base64EncodedCassandraYamlFragment, dataCenterLocation, delegatedSubnetId, nodeCount, provisioningState);
        }
    }
}
