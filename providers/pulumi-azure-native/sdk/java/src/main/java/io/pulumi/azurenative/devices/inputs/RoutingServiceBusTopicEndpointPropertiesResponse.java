// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties related to service bus topic endpoint types.
 * 
 */
public final class RoutingServiceBusTopicEndpointPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final RoutingServiceBusTopicEndpointPropertiesResponse Empty = new RoutingServiceBusTopicEndpointPropertiesResponse();

    /**
     * Method used to authenticate against the service bus topic endpoint
     * 
     */
    @InputImport(name="authenticationType")
      private final @Nullable String authenticationType;

    public Optional<String> getAuthenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    /**
     * The connection string of the service bus topic endpoint.
     * 
     */
    @InputImport(name="connectionString")
      private final @Nullable String connectionString;

    public Optional<String> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    /**
     * The url of the service bus topic endpoint. It must include the protocol sb://
     * 
     */
    @InputImport(name="endpointUri")
      private final @Nullable String endpointUri;

    public Optional<String> getEndpointUri() {
        return this.endpointUri == null ? Optional.empty() : Optional.ofNullable(this.endpointUri);
    }

    /**
     * Queue name on the service bus topic
     * 
     */
    @InputImport(name="entityPath")
      private final @Nullable String entityPath;

    public Optional<String> getEntityPath() {
        return this.entityPath == null ? Optional.empty() : Optional.ofNullable(this.entityPath);
    }

    /**
     * Id of the service bus topic endpoint
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.  The name need not be the same as the actual topic name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The name of the resource group of the service bus topic endpoint.
     * 
     */
    @InputImport(name="resourceGroup")
      private final @Nullable String resourceGroup;

    public Optional<String> getResourceGroup() {
        return this.resourceGroup == null ? Optional.empty() : Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The subscription identifier of the service bus topic endpoint.
     * 
     */
    @InputImport(name="subscriptionId")
      private final @Nullable String subscriptionId;

    public Optional<String> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    public RoutingServiceBusTopicEndpointPropertiesResponse(
        @Nullable String authenticationType,
        @Nullable String connectionString,
        @Nullable String endpointUri,
        @Nullable String entityPath,
        @Nullable String id,
        String name,
        @Nullable String resourceGroup,
        @Nullable String subscriptionId) {
        this.authenticationType = authenticationType;
        this.connectionString = connectionString;
        this.endpointUri = endpointUri;
        this.entityPath = entityPath;
        this.id = id;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroup = resourceGroup;
        this.subscriptionId = subscriptionId;
    }

    private RoutingServiceBusTopicEndpointPropertiesResponse() {
        this.authenticationType = null;
        this.connectionString = null;
        this.endpointUri = null;
        this.entityPath = null;
        this.id = null;
        this.name = null;
        this.resourceGroup = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingServiceBusTopicEndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private @Nullable String connectionString;
        private @Nullable String endpointUri;
        private @Nullable String entityPath;
        private @Nullable String id;
        private String name;
        private @Nullable String resourceGroup;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingServiceBusTopicEndpointPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionString = defaults.connectionString;
    	      this.endpointUri = defaults.endpointUri;
    	      this.entityPath = defaults.entityPath;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }

        public Builder entityPath(@Nullable String entityPath) {
            this.entityPath = entityPath;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public RoutingServiceBusTopicEndpointPropertiesResponse build() {
            return new RoutingServiceBusTopicEndpointPropertiesResponse(authenticationType, connectionString, endpointUri, entityPath, id, name, resourceGroup, subscriptionId);
        }
    }
}
