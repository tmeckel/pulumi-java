// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListClusterLanguageExtensionsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListClusterLanguageExtensionsArgs Empty = new ListClusterLanguageExtensionsArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListClusterLanguageExtensionsArgs(
        String clusterName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListClusterLanguageExtensionsArgs() {
        this.clusterName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListClusterLanguageExtensionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListClusterLanguageExtensionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListClusterLanguageExtensionsArgs build() {
            return new ListClusterLanguageExtensionsArgs(clusterName, resourceGroupName);
        }
    }
}
