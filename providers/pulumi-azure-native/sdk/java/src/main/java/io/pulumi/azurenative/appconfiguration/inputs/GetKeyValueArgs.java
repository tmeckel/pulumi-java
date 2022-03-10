// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetKeyValueArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKeyValueArgs Empty = new GetKeyValueArgs();

    /**
     * The name of the configuration store.
     * 
     */
    @InputImport(name="configStoreName", required=true)
      private final String configStoreName;

    public String getConfigStoreName() {
        return this.configStoreName;
    }

    /**
     * Identifier of key and label combination. Key and label are joined by $ character. Label is optional.
     * 
     */
    @InputImport(name="keyValueName", required=true)
      private final String keyValueName;

    public String getKeyValueName() {
        return this.keyValueName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetKeyValueArgs(
        String configStoreName,
        String keyValueName,
        String resourceGroupName) {
        this.configStoreName = Objects.requireNonNull(configStoreName, "expected parameter 'configStoreName' to be non-null");
        this.keyValueName = Objects.requireNonNull(keyValueName, "expected parameter 'keyValueName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetKeyValueArgs() {
        this.configStoreName = null;
        this.keyValueName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configStoreName;
        private String keyValueName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configStoreName = defaults.configStoreName;
    	      this.keyValueName = defaults.keyValueName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder configStoreName(String configStoreName) {
            this.configStoreName = Objects.requireNonNull(configStoreName);
            return this;
        }

        public Builder keyValueName(String keyValueName) {
            this.keyValueName = Objects.requireNonNull(keyValueName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetKeyValueArgs build() {
            return new GetKeyValueArgs(configStoreName, keyValueName, resourceGroupName);
        }
    }
}
