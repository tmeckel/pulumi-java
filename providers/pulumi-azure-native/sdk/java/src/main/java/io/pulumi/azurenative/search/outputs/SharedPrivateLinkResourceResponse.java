// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.outputs;

import io.pulumi.azurenative.search.outputs.SharedPrivateLinkResourcePropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SharedPrivateLinkResourceResponse {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Describes the properties of a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * 
     */
    private final @Nullable SharedPrivateLinkResourcePropertiesResponse properties;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private SharedPrivateLinkResourceResponse(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("properties") @Nullable SharedPrivateLinkResourcePropertiesResponse properties,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Describes the properties of a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * 
    */
    public Optional<SharedPrivateLinkResourcePropertiesResponse> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPrivateLinkResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable SharedPrivateLinkResourcePropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourceResponse defaults) {
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

        public Builder properties(@Nullable SharedPrivateLinkResourcePropertiesResponse properties) {
            this.properties = properties;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SharedPrivateLinkResourceResponse build() {
            return new SharedPrivateLinkResourceResponse(id, name, properties, type);
        }
    }
}
