// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.customerinsights.enums.ConnectorTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorArgs Empty = new ConnectorArgs();

    /**
     * Name of the connector.
     * 
     */
    @InputImport(name="connectorName")
      private final @Nullable Input<String> connectorName;

    public Input<String> getConnectorName() {
        return this.connectorName == null ? Input.empty() : this.connectorName;
    }

    /**
     * The connector properties.
     * 
     */
    @InputImport(name="connectorProperties", required=true)
      private final Input<Map<String,Object>> connectorProperties;

    public Input<Map<String,Object>> getConnectorProperties() {
        return this.connectorProperties;
    }

    /**
     * Type of connector.
     * 
     */
    @InputImport(name="connectorType", required=true)
      private final Input<Either<String,ConnectorTypes>> connectorType;

    public Input<Either<String,ConnectorTypes>> getConnectorType() {
        return this.connectorType;
    }

    /**
     * Description of the connector.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Display name of the connector.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The name of the hub.
     * 
     */
    @InputImport(name="hubName", required=true)
      private final Input<String> hubName;

    public Input<String> getHubName() {
        return this.hubName;
    }

    /**
     * If this is an internal connector.
     * 
     */
    @InputImport(name="isInternal")
      private final @Nullable Input<Boolean> isInternal;

    public Input<Boolean> getIsInternal() {
        return this.isInternal == null ? Input.empty() : this.isInternal;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ConnectorArgs(
        @Nullable Input<String> connectorName,
        Input<Map<String,Object>> connectorProperties,
        Input<Either<String,ConnectorTypes>> connectorType,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<String> hubName,
        @Nullable Input<Boolean> isInternal,
        Input<String> resourceGroupName) {
        this.connectorName = connectorName;
        this.connectorProperties = Objects.requireNonNull(connectorProperties, "expected parameter 'connectorProperties' to be non-null");
        this.connectorType = Objects.requireNonNull(connectorType, "expected parameter 'connectorType' to be non-null");
        this.description = description;
        this.displayName = displayName;
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.isInternal = isInternal;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ConnectorArgs() {
        this.connectorName = Input.empty();
        this.connectorProperties = Input.empty();
        this.connectorType = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.hubName = Input.empty();
        this.isInternal = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectorName;
        private Input<Map<String,Object>> connectorProperties;
        private Input<Either<String,ConnectorTypes>> connectorType;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<String> hubName;
        private @Nullable Input<Boolean> isInternal;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorName = defaults.connectorName;
    	      this.connectorProperties = defaults.connectorProperties;
    	      this.connectorType = defaults.connectorType;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.hubName = defaults.hubName;
    	      this.isInternal = defaults.isInternal;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder connectorName(@Nullable Input<String> connectorName) {
            this.connectorName = connectorName;
            return this;
        }

        public Builder connectorName(@Nullable String connectorName) {
            this.connectorName = Input.ofNullable(connectorName);
            return this;
        }

        public Builder connectorProperties(Input<Map<String,Object>> connectorProperties) {
            this.connectorProperties = Objects.requireNonNull(connectorProperties);
            return this;
        }

        public Builder connectorProperties(Map<String,Object> connectorProperties) {
            this.connectorProperties = Input.of(Objects.requireNonNull(connectorProperties));
            return this;
        }

        public Builder connectorType(Input<Either<String,ConnectorTypes>> connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }

        public Builder connectorType(Either<String,ConnectorTypes> connectorType) {
            this.connectorType = Input.of(Objects.requireNonNull(connectorType));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder hubName(Input<String> hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder hubName(String hubName) {
            this.hubName = Input.of(Objects.requireNonNull(hubName));
            return this;
        }

        public Builder isInternal(@Nullable Input<Boolean> isInternal) {
            this.isInternal = isInternal;
            return this;
        }

        public Builder isInternal(@Nullable Boolean isInternal) {
            this.isInternal = Input.ofNullable(isInternal);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public ConnectorArgs build() {
            return new ConnectorArgs(connectorName, connectorProperties, connectorType, description, displayName, hubName, isInternal, resourceGroupName);
        }
    }
}
