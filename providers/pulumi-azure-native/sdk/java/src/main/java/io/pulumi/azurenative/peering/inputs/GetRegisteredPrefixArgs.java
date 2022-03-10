// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRegisteredPrefixArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegisteredPrefixArgs Empty = new GetRegisteredPrefixArgs();

    /**
     * The name of the peering.
     * 
     */
    @InputImport(name="peeringName", required=true)
      private final String peeringName;

    public String getPeeringName() {
        return this.peeringName;
    }

    /**
     * The name of the registered prefix.
     * 
     */
    @InputImport(name="registeredPrefixName", required=true)
      private final String registeredPrefixName;

    public String getRegisteredPrefixName() {
        return this.registeredPrefixName;
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

    public GetRegisteredPrefixArgs(
        String peeringName,
        String registeredPrefixName,
        String resourceGroupName) {
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.registeredPrefixName = Objects.requireNonNull(registeredPrefixName, "expected parameter 'registeredPrefixName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetRegisteredPrefixArgs() {
        this.peeringName = null;
        this.registeredPrefixName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegisteredPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String peeringName;
        private String registeredPrefixName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegisteredPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeringName = defaults.peeringName;
    	      this.registeredPrefixName = defaults.registeredPrefixName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder peeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }

        public Builder registeredPrefixName(String registeredPrefixName) {
            this.registeredPrefixName = Objects.requireNonNull(registeredPrefixName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetRegisteredPrefixArgs build() {
            return new GetRegisteredPrefixArgs(peeringName, registeredPrefixName, resourceGroupName);
        }
    }
}
