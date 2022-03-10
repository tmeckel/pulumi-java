// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.ObjectReplicationPolicyRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetObjectReplicationPolicyResult {
    /**
     * Required. Destination account name.
     * 
     */
    private final String destinationAccount;
    /**
     * Indicates when the policy is enabled on the source account.
     * 
     */
    private final String enabledTime;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * A unique id for object replication policy.
     * 
     */
    private final String policyId;
    /**
     * The storage account object replication rules.
     * 
     */
    private final @Nullable List<ObjectReplicationPolicyRuleResponse> rules;
    /**
     * Required. Source account name.
     * 
     */
    private final String sourceAccount;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetObjectReplicationPolicyResult(
        @OutputCustomType.Parameter("destinationAccount") String destinationAccount,
        @OutputCustomType.Parameter("enabledTime") String enabledTime,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("policyId") String policyId,
        @OutputCustomType.Parameter("rules") @Nullable List<ObjectReplicationPolicyRuleResponse> rules,
        @OutputCustomType.Parameter("sourceAccount") String sourceAccount,
        @OutputCustomType.Parameter("type") String type) {
        this.destinationAccount = destinationAccount;
        this.enabledTime = enabledTime;
        this.id = id;
        this.name = name;
        this.policyId = policyId;
        this.rules = rules;
        this.sourceAccount = sourceAccount;
        this.type = type;
    }

    /**
     * Required. Destination account name.
     * 
    */
    public String getDestinationAccount() {
        return this.destinationAccount;
    }
    /**
     * Indicates when the policy is enabled on the source account.
     * 
    */
    public String getEnabledTime() {
        return this.enabledTime;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A unique id for object replication policy.
     * 
    */
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * The storage account object replication rules.
     * 
    */
    public List<ObjectReplicationPolicyRuleResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * Required. Source account name.
     * 
    */
    public String getSourceAccount() {
        return this.sourceAccount;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectReplicationPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationAccount;
        private String enabledTime;
        private String id;
        private String name;
        private String policyId;
        private @Nullable List<ObjectReplicationPolicyRuleResponse> rules;
        private String sourceAccount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectReplicationPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAccount = defaults.destinationAccount;
    	      this.enabledTime = defaults.enabledTime;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.policyId = defaults.policyId;
    	      this.rules = defaults.rules;
    	      this.sourceAccount = defaults.sourceAccount;
    	      this.type = defaults.type;
        }

        public Builder destinationAccount(String destinationAccount) {
            this.destinationAccount = Objects.requireNonNull(destinationAccount);
            return this;
        }

        public Builder enabledTime(String enabledTime) {
            this.enabledTime = Objects.requireNonNull(enabledTime);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder rules(@Nullable List<ObjectReplicationPolicyRuleResponse> rules) {
            this.rules = rules;
            return this;
        }

        public Builder sourceAccount(String sourceAccount) {
            this.sourceAccount = Objects.requireNonNull(sourceAccount);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetObjectReplicationPolicyResult build() {
            return new GetObjectReplicationPolicyResult(destinationAccount, enabledTime, id, name, policyId, rules, sourceAccount, type);
        }
    }
}
