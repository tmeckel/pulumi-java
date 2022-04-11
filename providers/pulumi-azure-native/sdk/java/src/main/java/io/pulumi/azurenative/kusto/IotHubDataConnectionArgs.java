// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.IotHubDataFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IotHubDataConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotHubDataConnectionArgs Empty = new IotHubDataConnectionArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The iot hub consumer group.
     * 
     */
    @Import(name="consumerGroup", required=true)
      private final Output<String> consumerGroup;

    public Output<String> getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * The name of the data connection.
     * 
     */
    @Import(name="dataConnectionName")
      private final @Nullable Output<String> dataConnectionName;

    public Output<String> getDataConnectionName() {
        return this.dataConnectionName == null ? Codegen.empty() : this.dataConnectionName;
    }

    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @Import(name="dataFormat")
      private final @Nullable Output<Either<String,IotHubDataFormat>> dataFormat;

    public Output<Either<String,IotHubDataFormat>> getDataFormat() {
        return this.dataFormat == null ? Codegen.empty() : this.dataFormat;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * System properties of the iot hub
     * 
     */
    @Import(name="eventSystemProperties")
      private final @Nullable Output<List<String>> eventSystemProperties;

    public Output<List<String>> getEventSystemProperties() {
        return this.eventSystemProperties == null ? Codegen.empty() : this.eventSystemProperties;
    }

    /**
     * The resource ID of the Iot hub to be used to create a data connection.
     * 
     */
    @Import(name="iotHubResourceId", required=true)
      private final Output<String> iotHubResourceId;

    public Output<String> getIotHubResourceId() {
        return this.iotHubResourceId;
    }

    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'IotHub'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @Import(name="mappingRuleName")
      private final @Nullable Output<String> mappingRuleName;

    public Output<String> getMappingRuleName() {
        return this.mappingRuleName == null ? Codegen.empty() : this.mappingRuleName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share access policy
     * 
     */
    @Import(name="sharedAccessPolicyName", required=true)
      private final Output<String> sharedAccessPolicyName;

    public Output<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }

    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @Import(name="tableName")
      private final @Nullable Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName == null ? Codegen.empty() : this.tableName;
    }

    public IotHubDataConnectionArgs(
        Output<String> clusterName,
        Output<String> consumerGroup,
        @Nullable Output<String> dataConnectionName,
        @Nullable Output<Either<String,IotHubDataFormat>> dataFormat,
        Output<String> databaseName,
        @Nullable Output<List<String>> eventSystemProperties,
        Output<String> iotHubResourceId,
        Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<String> mappingRuleName,
        Output<String> resourceGroupName,
        Output<String> sharedAccessPolicyName,
        @Nullable Output<String> tableName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.consumerGroup = Objects.requireNonNull(consumerGroup, "expected parameter 'consumerGroup' to be non-null");
        this.dataConnectionName = dataConnectionName;
        this.dataFormat = dataFormat;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.eventSystemProperties = eventSystemProperties;
        this.iotHubResourceId = Objects.requireNonNull(iotHubResourceId, "expected parameter 'iotHubResourceId' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.mappingRuleName = mappingRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sharedAccessPolicyName = Objects.requireNonNull(sharedAccessPolicyName, "expected parameter 'sharedAccessPolicyName' to be non-null");
        this.tableName = tableName;
    }

    private IotHubDataConnectionArgs() {
        this.clusterName = Codegen.empty();
        this.consumerGroup = Codegen.empty();
        this.dataConnectionName = Codegen.empty();
        this.dataFormat = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.eventSystemProperties = Codegen.empty();
        this.iotHubResourceId = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.mappingRuleName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sharedAccessPolicyName = Codegen.empty();
        this.tableName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private Output<String> consumerGroup;
        private @Nullable Output<String> dataConnectionName;
        private @Nullable Output<Either<String,IotHubDataFormat>> dataFormat;
        private Output<String> databaseName;
        private @Nullable Output<List<String>> eventSystemProperties;
        private Output<String> iotHubResourceId;
        private Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<String> mappingRuleName;
        private Output<String> resourceGroupName;
        private Output<String> sharedAccessPolicyName;
        private @Nullable Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubDataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.dataFormat = defaults.dataFormat;
    	      this.databaseName = defaults.databaseName;
    	      this.eventSystemProperties = defaults.eventSystemProperties;
    	      this.iotHubResourceId = defaults.iotHubResourceId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.tableName = defaults.tableName;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder consumerGroup(Output<String> consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }
        public Builder consumerGroup(String consumerGroup) {
            this.consumerGroup = Output.of(Objects.requireNonNull(consumerGroup));
            return this;
        }
        public Builder dataConnectionName(@Nullable Output<String> dataConnectionName) {
            this.dataConnectionName = dataConnectionName;
            return this;
        }
        public Builder dataConnectionName(@Nullable String dataConnectionName) {
            this.dataConnectionName = Codegen.ofNullable(dataConnectionName);
            return this;
        }
        public Builder dataFormat(@Nullable Output<Either<String,IotHubDataFormat>> dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Builder dataFormat(@Nullable Either<String,IotHubDataFormat> dataFormat) {
            this.dataFormat = Codegen.ofNullable(dataFormat);
            return this;
        }
        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder eventSystemProperties(@Nullable Output<List<String>> eventSystemProperties) {
            this.eventSystemProperties = eventSystemProperties;
            return this;
        }
        public Builder eventSystemProperties(@Nullable List<String> eventSystemProperties) {
            this.eventSystemProperties = Codegen.ofNullable(eventSystemProperties);
            return this;
        }
        public Builder eventSystemProperties(String... eventSystemProperties) {
            return eventSystemProperties(List.of(eventSystemProperties));
        }
        public Builder iotHubResourceId(Output<String> iotHubResourceId) {
            this.iotHubResourceId = Objects.requireNonNull(iotHubResourceId);
            return this;
        }
        public Builder iotHubResourceId(String iotHubResourceId) {
            this.iotHubResourceId = Output.of(Objects.requireNonNull(iotHubResourceId));
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder mappingRuleName(@Nullable Output<String> mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }
        public Builder mappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = Codegen.ofNullable(mappingRuleName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sharedAccessPolicyName(Output<String> sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Objects.requireNonNull(sharedAccessPolicyName);
            return this;
        }
        public Builder sharedAccessPolicyName(String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Output.of(Objects.requireNonNull(sharedAccessPolicyName));
            return this;
        }
        public Builder tableName(@Nullable Output<String> tableName) {
            this.tableName = tableName;
            return this;
        }
        public Builder tableName(@Nullable String tableName) {
            this.tableName = Codegen.ofNullable(tableName);
            return this;
        }        public IotHubDataConnectionArgs build() {
            return new IotHubDataConnectionArgs(clusterName, consumerGroup, dataConnectionName, dataFormat, databaseName, eventSystemProperties, iotHubResourceId, kind, location, mappingRuleName, resourceGroupName, sharedAccessPolicyName, tableName);
        }
    }
}
