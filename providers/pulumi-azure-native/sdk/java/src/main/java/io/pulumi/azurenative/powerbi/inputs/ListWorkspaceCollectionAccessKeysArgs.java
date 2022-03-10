// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListWorkspaceCollectionAccessKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWorkspaceCollectionAccessKeysArgs Empty = new ListWorkspaceCollectionAccessKeysArgs();

    /**
     * Azure resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Power BI Embedded Workspace Collection name
     * 
     */
    @InputImport(name="workspaceCollectionName", required=true)
      private final String workspaceCollectionName;

    public String getWorkspaceCollectionName() {
        return this.workspaceCollectionName;
    }

    public ListWorkspaceCollectionAccessKeysArgs(
        String resourceGroupName,
        String workspaceCollectionName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceCollectionName = Objects.requireNonNull(workspaceCollectionName, "expected parameter 'workspaceCollectionName' to be non-null");
    }

    private ListWorkspaceCollectionAccessKeysArgs() {
        this.resourceGroupName = null;
        this.workspaceCollectionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkspaceCollectionAccessKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String workspaceCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkspaceCollectionAccessKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceCollectionName = defaults.workspaceCollectionName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder workspaceCollectionName(String workspaceCollectionName) {
            this.workspaceCollectionName = Objects.requireNonNull(workspaceCollectionName);
            return this;
        }
        public ListWorkspaceCollectionAccessKeysArgs build() {
            return new ListWorkspaceCollectionAccessKeysArgs(resourceGroupName, workspaceCollectionName);
        }
    }
}
