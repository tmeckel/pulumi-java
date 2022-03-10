// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetQueueServicePropertiesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetQueueServicePropertiesArgs Empty = new GetQueueServicePropertiesArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Queue Service within the specified storage account. Queue Service Name must be 'default'
     * 
     */
    @InputImport(name="queueServiceName", required=true)
      private final String queueServiceName;

    public String getQueueServiceName() {
        return this.queueServiceName;
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

    public GetQueueServicePropertiesArgs(
        String accountName,
        String queueServiceName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.queueServiceName = Objects.requireNonNull(queueServiceName, "expected parameter 'queueServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetQueueServicePropertiesArgs() {
        this.accountName = null;
        this.queueServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String queueServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueServicePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.queueServiceName = defaults.queueServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder queueServiceName(String queueServiceName) {
            this.queueServiceName = Objects.requireNonNull(queueServiceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetQueueServicePropertiesArgs build() {
            return new GetQueueServicePropertiesArgs(accountName, queueServiceName, resourceGroupName);
        }
    }
}
