// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.blockchain.inputs.FirewallRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransactionNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransactionNodeArgs Empty = new TransactionNodeArgs();

    /**
     * Blockchain member name.
     * 
     */
    @Import(name="blockchainMemberName", required=true)
      private final Output<String> blockchainMemberName;

    public Output<String> getBlockchainMemberName() {
        return this.blockchainMemberName;
    }

    /**
     * Gets or sets the firewall rules.
     * 
     */
    @Import(name="firewallRules")
      private final @Nullable Output<List<FirewallRuleArgs>> firewallRules;

    public Output<List<FirewallRuleArgs>> getFirewallRules() {
        return this.firewallRules == null ? Codegen.empty() : this.firewallRules;
    }

    /**
     * Gets or sets the transaction node location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Sets the transaction node dns endpoint basic auth password.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Transaction node name.
     * 
     */
    @Import(name="transactionNodeName")
      private final @Nullable Output<String> transactionNodeName;

    public Output<String> getTransactionNodeName() {
        return this.transactionNodeName == null ? Codegen.empty() : this.transactionNodeName;
    }

    public TransactionNodeArgs(
        Output<String> blockchainMemberName,
        @Nullable Output<List<FirewallRuleArgs>> firewallRules,
        @Nullable Output<String> location,
        @Nullable Output<String> password,
        Output<String> resourceGroupName,
        @Nullable Output<String> transactionNodeName) {
        this.blockchainMemberName = Objects.requireNonNull(blockchainMemberName, "expected parameter 'blockchainMemberName' to be non-null");
        this.firewallRules = firewallRules;
        this.location = location;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.transactionNodeName = transactionNodeName;
    }

    private TransactionNodeArgs() {
        this.blockchainMemberName = Codegen.empty();
        this.firewallRules = Codegen.empty();
        this.location = Codegen.empty();
        this.password = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.transactionNodeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransactionNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> blockchainMemberName;
        private @Nullable Output<List<FirewallRuleArgs>> firewallRules;
        private @Nullable Output<String> location;
        private @Nullable Output<String> password;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> transactionNodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(TransactionNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockchainMemberName = defaults.blockchainMemberName;
    	      this.firewallRules = defaults.firewallRules;
    	      this.location = defaults.location;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.transactionNodeName = defaults.transactionNodeName;
        }

        public Builder blockchainMemberName(Output<String> blockchainMemberName) {
            this.blockchainMemberName = Objects.requireNonNull(blockchainMemberName);
            return this;
        }
        public Builder blockchainMemberName(String blockchainMemberName) {
            this.blockchainMemberName = Output.of(Objects.requireNonNull(blockchainMemberName));
            return this;
        }
        public Builder firewallRules(@Nullable Output<List<FirewallRuleArgs>> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }
        public Builder firewallRules(@Nullable List<FirewallRuleArgs> firewallRules) {
            this.firewallRules = Codegen.ofNullable(firewallRules);
            return this;
        }
        public Builder firewallRules(FirewallRuleArgs... firewallRules) {
            return firewallRules(List.of(firewallRules));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
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
        public Builder transactionNodeName(@Nullable Output<String> transactionNodeName) {
            this.transactionNodeName = transactionNodeName;
            return this;
        }
        public Builder transactionNodeName(@Nullable String transactionNodeName) {
            this.transactionNodeName = Codegen.ofNullable(transactionNodeName);
            return this;
        }        public TransactionNodeArgs build() {
            return new TransactionNodeArgs(blockchainMemberName, firewallRules, location, password, resourceGroupName, transactionNodeName);
        }
    }
}
