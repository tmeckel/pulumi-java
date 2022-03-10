// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserRuleCollectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserRuleCollectionArgs Empty = new GetUserRuleCollectionArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @InputImport(name="configurationName", required=true)
      private final String configurationName;

    public String getConfigurationName() {
        return this.configurationName;
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
     * The name of the network manager security Configuration rule collection.
     * 
     */
    @InputImport(name="ruleCollectionName", required=true)
      private final String ruleCollectionName;

    public String getRuleCollectionName() {
        return this.ruleCollectionName;
    }

    public GetUserRuleCollectionArgs(
        String configurationName,
        String networkManagerName,
        String resourceGroupName,
        String ruleCollectionName) {
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName, "expected parameter 'ruleCollectionName' to be non-null");
    }

    private GetUserRuleCollectionArgs() {
        this.configurationName = null;
        this.networkManagerName = null;
        this.resourceGroupName = null;
        this.ruleCollectionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserRuleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationName;
        private String networkManagerName;
        private String resourceGroupName;
        private String ruleCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserRuleCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionName = defaults.ruleCollectionName;
        }

        public Builder configurationName(String configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
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

        public Builder ruleCollectionName(String ruleCollectionName) {
            this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName);
            return this;
        }
        public GetUserRuleCollectionArgs build() {
            return new GetUserRuleCollectionArgs(configurationName, networkManagerName, resourceGroupName, ruleCollectionName);
        }
    }
}
