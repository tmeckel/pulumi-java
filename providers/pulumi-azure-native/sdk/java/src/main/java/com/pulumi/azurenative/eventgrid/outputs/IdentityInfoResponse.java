// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.azurenative.eventgrid.outputs.UserIdentityPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IdentityInfoResponse {
    /**
     * @return The principal ID of resource identity.
     * 
     */
    private final @Nullable String principalId;
    /**
     * @return The tenant ID of resource.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * @return The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
     * 
     */
    private final @Nullable String type;
    /**
     * @return The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form:
     * &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * This property is currently not used and reserved for future usage.
     * 
     */
    private final @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

    @CustomType.Constructor
    private IdentityInfoResponse(
        @CustomType.Parameter("principalId") @Nullable String principalId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userAssignedIdentities") @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * @return The principal ID of resource identity.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return The tenant ID of resource.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form:
     * &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * This property is currently not used and reserved for future usage.
     * 
     */
    public Map<String,UserIdentityPropertiesResponse> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public IdentityInfoResponse build() {
            return new IdentityInfoResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
