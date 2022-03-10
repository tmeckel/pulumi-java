// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.inputs.PrivateEndpointConnectionPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an existing Private Endpoint connection to the Azure Cognitive Search service.
 * 
 */
public final class PrivateEndpointConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionResponse Empty = new PrivateEndpointConnectionResponse();

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The name of the resource
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Describes the properties of an existing Private Endpoint connection to the Azure Cognitive Search service.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable PrivateEndpointConnectionPropertiesResponse properties;

    public Optional<PrivateEndpointConnectionPropertiesResponse> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public PrivateEndpointConnectionResponse(
        String id,
        String name,
        @Nullable PrivateEndpointConnectionPropertiesResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = properties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PrivateEndpointConnectionResponse() {
        this.id = null;
        this.name = null;
        this.properties = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PrivateEndpointConnectionPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder properties(@Nullable PrivateEndpointConnectionPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PrivateEndpointConnectionResponse build() {
            return new PrivateEndpointConnectionResponse(id, name, properties, type);
        }
    }
}
