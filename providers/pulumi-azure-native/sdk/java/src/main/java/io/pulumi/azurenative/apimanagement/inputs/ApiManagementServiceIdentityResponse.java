// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.UserIdentityPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity properties of the Api Management service resource.
 * 
 */
public final class ApiManagementServiceIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiManagementServiceIdentityResponse Empty = new ApiManagementServiceIdentityResponse();

    /**
     * The principal id of the identity.
     * 
     */
    @InputImport(name="principalId", required=true)
      private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The client tenant id of the identity.
     * 
     */
    @InputImport(name="tenantId", required=true)
      private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * The type of identity used for the resource. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the service.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The list of user identities associated with the resource. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     *     providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @InputImport(name="userAssignedIdentities")
      private final @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

    public Map<String,UserIdentityPropertiesResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public ApiManagementServiceIdentityResponse(
        String principalId,
        String tenantId,
        String type,
        @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ApiManagementServiceIdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiManagementServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;
        private @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiManagementServiceIdentityResponse defaults) {
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

        public Builder userAssignedIdentities(@Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public ApiManagementServiceIdentityResponse build() {
            return new ApiManagementServiceIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
