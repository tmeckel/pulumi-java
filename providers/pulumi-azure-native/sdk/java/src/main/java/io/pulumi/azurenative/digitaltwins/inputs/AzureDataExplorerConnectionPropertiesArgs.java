// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a time series database connection to Azure Data Explorer with data being sent via an EventHub.
 * 
 */
public final class AzureDataExplorerConnectionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDataExplorerConnectionPropertiesArgs Empty = new AzureDataExplorerConnectionPropertiesArgs();

    /**
     * The name of the Azure Data Explorer database.
     * 
     */
    @InputImport(name="adxDatabaseName", required=true)
      private final Input<String> adxDatabaseName;

    public Input<String> getAdxDatabaseName() {
        return this.adxDatabaseName;
    }

    /**
     * The URI of the Azure Data Explorer endpoint.
     * 
     */
    @InputImport(name="adxEndpointUri", required=true)
      private final Input<String> adxEndpointUri;

    public Input<String> getAdxEndpointUri() {
        return this.adxEndpointUri;
    }

    /**
     * The resource ID of the Azure Data Explorer cluster.
     * 
     */
    @InputImport(name="adxResourceId", required=true)
      private final Input<String> adxResourceId;

    public Input<String> getAdxResourceId() {
        return this.adxResourceId;
    }

    /**
     * The name of the Azure Data Explorer table.
     * 
     */
    @InputImport(name="adxTableName")
      private final @Nullable Input<String> adxTableName;

    public Input<String> getAdxTableName() {
        return this.adxTableName == null ? Input.empty() : this.adxTableName;
    }

    /**
     * The type of time series connection resource.
     * Expected value is 'AzureDataExplorer'.
     * 
     */
    @InputImport(name="connectionType", required=true)
      private final Input<String> connectionType;

    public Input<String> getConnectionType() {
        return this.connectionType;
    }

    /**
     * The EventHub consumer group to use when ADX reads from EventHub. Defaults to $Default.
     * 
     */
    @InputImport(name="eventHubConsumerGroup")
      private final @Nullable Input<String> eventHubConsumerGroup;

    public Input<String> getEventHubConsumerGroup() {
        return this.eventHubConsumerGroup == null ? Input.empty() : this.eventHubConsumerGroup;
    }

    /**
     * The URL of the EventHub namespace for identity-based authentication. It must include the protocol sb://
     * 
     */
    @InputImport(name="eventHubEndpointUri", required=true)
      private final Input<String> eventHubEndpointUri;

    public Input<String> getEventHubEndpointUri() {
        return this.eventHubEndpointUri;
    }

    /**
     * The EventHub name in the EventHub namespace for identity-based authentication.
     * 
     */
    @InputImport(name="eventHubEntityPath", required=true)
      private final Input<String> eventHubEntityPath;

    public Input<String> getEventHubEntityPath() {
        return this.eventHubEntityPath;
    }

    /**
     * The resource ID of the EventHub namespace.
     * 
     */
    @InputImport(name="eventHubNamespaceResourceId", required=true)
      private final Input<String> eventHubNamespaceResourceId;

    public Input<String> getEventHubNamespaceResourceId() {
        return this.eventHubNamespaceResourceId;
    }

    public AzureDataExplorerConnectionPropertiesArgs(
        Input<String> adxDatabaseName,
        Input<String> adxEndpointUri,
        Input<String> adxResourceId,
        @Nullable Input<String> adxTableName,
        Input<String> connectionType,
        @Nullable Input<String> eventHubConsumerGroup,
        Input<String> eventHubEndpointUri,
        Input<String> eventHubEntityPath,
        Input<String> eventHubNamespaceResourceId) {
        this.adxDatabaseName = Objects.requireNonNull(adxDatabaseName, "expected parameter 'adxDatabaseName' to be non-null");
        this.adxEndpointUri = Objects.requireNonNull(adxEndpointUri, "expected parameter 'adxEndpointUri' to be non-null");
        this.adxResourceId = Objects.requireNonNull(adxResourceId, "expected parameter 'adxResourceId' to be non-null");
        this.adxTableName = adxTableName;
        this.connectionType = Objects.requireNonNull(connectionType, "expected parameter 'connectionType' to be non-null");
        this.eventHubConsumerGroup = eventHubConsumerGroup;
        this.eventHubEndpointUri = Objects.requireNonNull(eventHubEndpointUri, "expected parameter 'eventHubEndpointUri' to be non-null");
        this.eventHubEntityPath = Objects.requireNonNull(eventHubEntityPath, "expected parameter 'eventHubEntityPath' to be non-null");
        this.eventHubNamespaceResourceId = Objects.requireNonNull(eventHubNamespaceResourceId, "expected parameter 'eventHubNamespaceResourceId' to be non-null");
    }

    private AzureDataExplorerConnectionPropertiesArgs() {
        this.adxDatabaseName = Input.empty();
        this.adxEndpointUri = Input.empty();
        this.adxResourceId = Input.empty();
        this.adxTableName = Input.empty();
        this.connectionType = Input.empty();
        this.eventHubConsumerGroup = Input.empty();
        this.eventHubEndpointUri = Input.empty();
        this.eventHubEntityPath = Input.empty();
        this.eventHubNamespaceResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerConnectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> adxDatabaseName;
        private Input<String> adxEndpointUri;
        private Input<String> adxResourceId;
        private @Nullable Input<String> adxTableName;
        private Input<String> connectionType;
        private @Nullable Input<String> eventHubConsumerGroup;
        private Input<String> eventHubEndpointUri;
        private Input<String> eventHubEntityPath;
        private Input<String> eventHubNamespaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerConnectionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adxDatabaseName = defaults.adxDatabaseName;
    	      this.adxEndpointUri = defaults.adxEndpointUri;
    	      this.adxResourceId = defaults.adxResourceId;
    	      this.adxTableName = defaults.adxTableName;
    	      this.connectionType = defaults.connectionType;
    	      this.eventHubConsumerGroup = defaults.eventHubConsumerGroup;
    	      this.eventHubEndpointUri = defaults.eventHubEndpointUri;
    	      this.eventHubEntityPath = defaults.eventHubEntityPath;
    	      this.eventHubNamespaceResourceId = defaults.eventHubNamespaceResourceId;
        }

        public Builder adxDatabaseName(Input<String> adxDatabaseName) {
            this.adxDatabaseName = Objects.requireNonNull(adxDatabaseName);
            return this;
        }

        public Builder adxDatabaseName(String adxDatabaseName) {
            this.adxDatabaseName = Input.of(Objects.requireNonNull(adxDatabaseName));
            return this;
        }

        public Builder adxEndpointUri(Input<String> adxEndpointUri) {
            this.adxEndpointUri = Objects.requireNonNull(adxEndpointUri);
            return this;
        }

        public Builder adxEndpointUri(String adxEndpointUri) {
            this.adxEndpointUri = Input.of(Objects.requireNonNull(adxEndpointUri));
            return this;
        }

        public Builder adxResourceId(Input<String> adxResourceId) {
            this.adxResourceId = Objects.requireNonNull(adxResourceId);
            return this;
        }

        public Builder adxResourceId(String adxResourceId) {
            this.adxResourceId = Input.of(Objects.requireNonNull(adxResourceId));
            return this;
        }

        public Builder adxTableName(@Nullable Input<String> adxTableName) {
            this.adxTableName = adxTableName;
            return this;
        }

        public Builder adxTableName(@Nullable String adxTableName) {
            this.adxTableName = Input.ofNullable(adxTableName);
            return this;
        }

        public Builder connectionType(Input<String> connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }

        public Builder connectionType(String connectionType) {
            this.connectionType = Input.of(Objects.requireNonNull(connectionType));
            return this;
        }

        public Builder eventHubConsumerGroup(@Nullable Input<String> eventHubConsumerGroup) {
            this.eventHubConsumerGroup = eventHubConsumerGroup;
            return this;
        }

        public Builder eventHubConsumerGroup(@Nullable String eventHubConsumerGroup) {
            this.eventHubConsumerGroup = Input.ofNullable(eventHubConsumerGroup);
            return this;
        }

        public Builder eventHubEndpointUri(Input<String> eventHubEndpointUri) {
            this.eventHubEndpointUri = Objects.requireNonNull(eventHubEndpointUri);
            return this;
        }

        public Builder eventHubEndpointUri(String eventHubEndpointUri) {
            this.eventHubEndpointUri = Input.of(Objects.requireNonNull(eventHubEndpointUri));
            return this;
        }

        public Builder eventHubEntityPath(Input<String> eventHubEntityPath) {
            this.eventHubEntityPath = Objects.requireNonNull(eventHubEntityPath);
            return this;
        }

        public Builder eventHubEntityPath(String eventHubEntityPath) {
            this.eventHubEntityPath = Input.of(Objects.requireNonNull(eventHubEntityPath));
            return this;
        }

        public Builder eventHubNamespaceResourceId(Input<String> eventHubNamespaceResourceId) {
            this.eventHubNamespaceResourceId = Objects.requireNonNull(eventHubNamespaceResourceId);
            return this;
        }

        public Builder eventHubNamespaceResourceId(String eventHubNamespaceResourceId) {
            this.eventHubNamespaceResourceId = Input.of(Objects.requireNonNull(eventHubNamespaceResourceId));
            return this;
        }
        public AzureDataExplorerConnectionPropertiesArgs build() {
            return new AzureDataExplorerConnectionPropertiesArgs(adxDatabaseName, adxEndpointUri, adxResourceId, adxTableName, connectionType, eventHubConsumerGroup, eventHubEndpointUri, eventHubEntityPath, eventHubNamespaceResourceId);
        }
    }
}
