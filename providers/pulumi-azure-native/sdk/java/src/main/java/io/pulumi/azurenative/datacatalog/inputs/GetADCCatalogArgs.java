// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datacatalog.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetADCCatalogArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetADCCatalogArgs Empty = new GetADCCatalogArgs();

    /**
     * The name of the data catalog in the specified subscription and resource group.
     * 
     */
    @InputImport(name="catalogName", required=true)
      private final String catalogName;

    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetADCCatalogArgs(
        String catalogName,
        String resourceGroupName) {
        this.catalogName = Objects.requireNonNull(catalogName, "expected parameter 'catalogName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetADCCatalogArgs() {
        this.catalogName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetADCCatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetADCCatalogArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogName = defaults.catalogName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder catalogName(String catalogName) {
            this.catalogName = Objects.requireNonNull(catalogName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetADCCatalogArgs build() {
            return new GetADCCatalogArgs(catalogName, resourceGroupName);
        }
    }
}
