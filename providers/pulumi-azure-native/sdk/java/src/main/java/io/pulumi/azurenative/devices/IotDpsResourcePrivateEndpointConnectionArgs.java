// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.devices.inputs.PrivateEndpointConnectionPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IotDpsResourcePrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotDpsResourcePrivateEndpointConnectionArgs Empty = new IotDpsResourcePrivateEndpointConnectionArgs();

    /**
     * The name of the private endpoint connection
     * 
     */
    @Import(name="privateEndpointConnectionName")
      private final @Nullable Output<String> privateEndpointConnectionName;

    public Output<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Codegen.empty() : this.privateEndpointConnectionName;
    }

    /**
     * The properties of a private endpoint connection
     * 
     */
    @Import(name="properties", required=true)
      private final Output<PrivateEndpointConnectionPropertiesArgs> properties;

    public Output<PrivateEndpointConnectionPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group that contains the provisioning service.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the provisioning service.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName;
    }

    public IotDpsResourcePrivateEndpointConnectionArgs(
        @Nullable Output<String> privateEndpointConnectionName,
        Output<PrivateEndpointConnectionPropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> resourceName) {
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private IotDpsResourcePrivateEndpointConnectionArgs() {
        this.privateEndpointConnectionName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotDpsResourcePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> privateEndpointConnectionName;
        private Output<PrivateEndpointConnectionPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(IotDpsResourcePrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }
        public Builder privateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Codegen.ofNullable(privateEndpointConnectionName);
            return this;
        }
        public Builder properties(Output<PrivateEndpointConnectionPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(PrivateEndpointConnectionPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
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
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }        public IotDpsResourcePrivateEndpointConnectionArgs build() {
            return new IotDpsResourcePrivateEndpointConnectionArgs(privateEndpointConnectionName, properties, resourceGroupName, resourceName);
        }
    }
}
