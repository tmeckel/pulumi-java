// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.UserIdentityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentityDataResponse {
    /**
     * The principal ID of resource identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant ID of resource.
     * 
     */
    private final String tenantId;
    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identities.
     * 
     */
    private final String type;
    /**
     * The list of user-assigned identities associated with the resource. The user-assigned identity dictionary keys will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    private final @Nullable Map<String,UserIdentityResponse> userAssignedIdentities;

    @OutputCustomType.Constructor
    private IdentityDataResponse(
        @OutputCustomType.Parameter("principalId") String principalId,
        @OutputCustomType.Parameter("tenantId") String tenantId,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userAssignedIdentities") @Nullable Map<String,UserIdentityResponse> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * The principal ID of resource identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant ID of resource.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identities.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The list of user-assigned identities associated with the resource. The user-assigned identity dictionary keys will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
    */
    public Map<String,UserIdentityResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;
        private @Nullable Map<String,UserIdentityResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Map<String,UserIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public IdentityDataResponse build() {
            return new IdentityDataResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
