// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.inputs.ManagementPolicySchemaArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyArgs Empty = new ManagementPolicyArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Storage Account Management Policy. It should always be 'default'
     * 
     */
    @Import(name="managementPolicyName")
      private final @Nullable Output<String> managementPolicyName;

    public Output<String> getManagementPolicyName() {
        return this.managementPolicyName == null ? Codegen.empty() : this.managementPolicyName;
    }

    /**
     * The Storage Account ManagementPolicy, in JSON format. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<ManagementPolicySchemaArgs> policy;

    public Output<ManagementPolicySchemaArgs> getPolicy() {
        return this.policy;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagementPolicyArgs(
        Output<String> accountName,
        @Nullable Output<String> managementPolicyName,
        Output<ManagementPolicySchemaArgs> policy,
        Output<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.managementPolicyName = managementPolicyName;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ManagementPolicyArgs() {
        this.accountName = Codegen.empty();
        this.managementPolicyName = Codegen.empty();
        this.policy = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> managementPolicyName;
        private Output<ManagementPolicySchemaArgs> policy;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.managementPolicyName = defaults.managementPolicyName;
    	      this.policy = defaults.policy;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder managementPolicyName(@Nullable Output<String> managementPolicyName) {
            this.managementPolicyName = managementPolicyName;
            return this;
        }
        public Builder managementPolicyName(@Nullable String managementPolicyName) {
            this.managementPolicyName = Codegen.ofNullable(managementPolicyName);
            return this;
        }
        public Builder policy(Output<ManagementPolicySchemaArgs> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(ManagementPolicySchemaArgs policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public ManagementPolicyArgs build() {
            return new ManagementPolicyArgs(accountName, managementPolicyName, policy, resourceGroupName);
        }
    }
}
