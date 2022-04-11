// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
 * 
 */
public final class VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs Empty = new VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs();

    /**
     * The Id of the databricks virtual network.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    public VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs(@Nullable Output<String> id) {
        this.id = id;
    }

    private VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs() {
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }        public VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs build() {
            return new VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs(id);
        }
    }
}
