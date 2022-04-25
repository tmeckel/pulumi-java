// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.azurenative.blueprint.inputs.UserAssignedIdentityResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed identity generic object.
 * 
 */
public final class ManagedServiceIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedServiceIdentityResponse Empty = new ManagedServiceIdentityResponse();

    /**
     * Azure Active Directory principal ID associated with this Identity.
     * 
     */
    @Import(name="principalId")
    private @Nullable String principalId;

    /**
     * @return Azure Active Directory principal ID associated with this Identity.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * ID of the Azure Active Directory.
     * 
     */
    @Import(name="tenantId")
    private @Nullable String tenantId;

    /**
     * @return ID of the Azure Active Directory.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Type of the managed identity.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of the managed identity.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * The list of user-assigned managed identities associated with the resource. Key is the Azure resource Id of the managed identity.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

    /**
     * @return The list of user-assigned managed identities associated with the resource. Key is the Azure resource Id of the managed identity.
     * 
     */
    public Optional<Map<String,UserAssignedIdentityResponse>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private ManagedServiceIdentityResponse() {}

    private ManagedServiceIdentityResponse(ManagedServiceIdentityResponse $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedServiceIdentityResponse $;

        public Builder() {
            $ = new ManagedServiceIdentityResponse();
        }

        public Builder(ManagedServiceIdentityResponse defaults) {
            $ = new ManagedServiceIdentityResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId Azure Active Directory principal ID associated with this Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable String principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param tenantId ID of the Azure Active Directory.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param type Type of the managed identity.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param userAssignedIdentities The list of user-assigned managed identities associated with the resource. Key is the Azure resource Id of the managed identity.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(@Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public ManagedServiceIdentityResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
