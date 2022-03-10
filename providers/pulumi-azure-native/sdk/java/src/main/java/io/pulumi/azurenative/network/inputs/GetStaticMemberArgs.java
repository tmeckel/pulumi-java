// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStaticMemberArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStaticMemberArgs Empty = new GetStaticMemberArgs();

    /**
     * The name of the network group.
     * 
     */
    @InputImport(name="networkGroupName", required=true)
      private final String networkGroupName;

    public String getNetworkGroupName() {
        return this.networkGroupName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName", required=true)
      private final String networkManagerName;

    public String getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the static member.
     * 
     */
    @InputImport(name="staticMemberName", required=true)
      private final String staticMemberName;

    public String getStaticMemberName() {
        return this.staticMemberName;
    }

    public GetStaticMemberArgs(
        String networkGroupName,
        String networkManagerName,
        String resourceGroupName,
        String staticMemberName) {
        this.networkGroupName = Objects.requireNonNull(networkGroupName, "expected parameter 'networkGroupName' to be non-null");
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.staticMemberName = Objects.requireNonNull(staticMemberName, "expected parameter 'staticMemberName' to be non-null");
    }

    private GetStaticMemberArgs() {
        this.networkGroupName = null;
        this.networkManagerName = null;
        this.resourceGroupName = null;
        this.staticMemberName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkGroupName;
        private String networkManagerName;
        private String resourceGroupName;
        private String staticMemberName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStaticMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkGroupName = defaults.networkGroupName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.staticMemberName = defaults.staticMemberName;
        }

        public Builder networkGroupName(String networkGroupName) {
            this.networkGroupName = Objects.requireNonNull(networkGroupName);
            return this;
        }

        public Builder networkManagerName(String networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder staticMemberName(String staticMemberName) {
            this.staticMemberName = Objects.requireNonNull(staticMemberName);
            return this;
        }
        public GetStaticMemberArgs build() {
            return new GetStaticMemberArgs(networkGroupName, networkManagerName, resourceGroupName, staticMemberName);
        }
    }
}
