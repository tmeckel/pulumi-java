// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.streamanalytics.inputs.PrivateEndpointPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointArgs Empty = new PrivateEndpointArgs();

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @Import(name="privateEndpointName")
      private final @Nullable Output<String> privateEndpointName;

    public Output<String> getPrivateEndpointName() {
        return this.privateEndpointName == null ? Codegen.empty() : this.privateEndpointName;
    }

    /**
     * The properties associated with a private endpoint.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<PrivateEndpointPropertiesArgs> properties;

    public Output<PrivateEndpointPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointArgs(
        Output<String> clusterName,
        @Nullable Output<String> privateEndpointName,
        @Nullable Output<PrivateEndpointPropertiesArgs> properties,
        Output<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.privateEndpointName = privateEndpointName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointArgs() {
        this.clusterName = Codegen.empty();
        this.privateEndpointName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private @Nullable Output<String> privateEndpointName;
        private @Nullable Output<PrivateEndpointPropertiesArgs> properties;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder privateEndpointName(@Nullable Output<String> privateEndpointName) {
            this.privateEndpointName = privateEndpointName;
            return this;
        }
        public Builder privateEndpointName(@Nullable String privateEndpointName) {
            this.privateEndpointName = Codegen.ofNullable(privateEndpointName);
            return this;
        }
        public Builder properties(@Nullable Output<PrivateEndpointPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable PrivateEndpointPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public PrivateEndpointArgs build() {
            return new PrivateEndpointArgs(clusterName, privateEndpointName, properties, resourceGroupName);
        }
    }
}
