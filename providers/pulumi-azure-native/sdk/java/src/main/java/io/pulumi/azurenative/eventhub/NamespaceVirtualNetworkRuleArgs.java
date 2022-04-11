// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceVirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceVirtualNetworkRuleArgs Empty = new NamespaceVirtualNetworkRuleArgs();

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Virtual Network Rule name.
     * 
     */
    @Import(name="virtualNetworkRuleName")
      private final @Nullable Output<String> virtualNetworkRuleName;

    public Output<String> getVirtualNetworkRuleName() {
        return this.virtualNetworkRuleName == null ? Codegen.empty() : this.virtualNetworkRuleName;
    }

    /**
     * ARM ID of Virtual Network Subnet
     * 
     */
    @Import(name="virtualNetworkSubnetId")
      private final @Nullable Output<String> virtualNetworkSubnetId;

    public Output<String> getVirtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId == null ? Codegen.empty() : this.virtualNetworkSubnetId;
    }

    public NamespaceVirtualNetworkRuleArgs(
        Output<String> namespaceName,
        Output<String> resourceGroupName,
        @Nullable Output<String> virtualNetworkRuleName,
        @Nullable Output<String> virtualNetworkSubnetId) {
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkRuleName = virtualNetworkRuleName;
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    private NamespaceVirtualNetworkRuleArgs() {
        this.namespaceName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.virtualNetworkRuleName = Codegen.empty();
        this.virtualNetworkSubnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceVirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> namespaceName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> virtualNetworkRuleName;
        private @Nullable Output<String> virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceVirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkRuleName = defaults.virtualNetworkRuleName;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder virtualNetworkRuleName(@Nullable Output<String> virtualNetworkRuleName) {
            this.virtualNetworkRuleName = virtualNetworkRuleName;
            return this;
        }
        public Builder virtualNetworkRuleName(@Nullable String virtualNetworkRuleName) {
            this.virtualNetworkRuleName = Codegen.ofNullable(virtualNetworkRuleName);
            return this;
        }
        public Builder virtualNetworkSubnetId(@Nullable Output<String> virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }
        public Builder virtualNetworkSubnetId(@Nullable String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Codegen.ofNullable(virtualNetworkSubnetId);
            return this;
        }        public NamespaceVirtualNetworkRuleArgs build() {
            return new NamespaceVirtualNetworkRuleArgs(namespaceName, resourceGroupName, virtualNetworkRuleName, virtualNetworkSubnetId);
        }
    }
}
