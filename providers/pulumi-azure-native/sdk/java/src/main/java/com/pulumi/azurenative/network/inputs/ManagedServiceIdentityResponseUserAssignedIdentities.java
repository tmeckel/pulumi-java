// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedServiceIdentityResponseUserAssignedIdentities extends com.pulumi.resources.InvokeArgs {

    public static final ManagedServiceIdentityResponseUserAssignedIdentities Empty = new ManagedServiceIdentityResponseUserAssignedIdentities();

    /**
     * The client id of user assigned identity.
     * 
     */
    @Import(name="clientId", required=true)
    private String clientId;

    /**
     * @return The client id of user assigned identity.
     * 
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    /**
     * @return The principal id of user assigned identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }

    private ManagedServiceIdentityResponseUserAssignedIdentities() {}

    private ManagedServiceIdentityResponseUserAssignedIdentities(ManagedServiceIdentityResponseUserAssignedIdentities $) {
        this.clientId = $.clientId;
        this.principalId = $.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedServiceIdentityResponseUserAssignedIdentities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedServiceIdentityResponseUserAssignedIdentities $;

        public Builder() {
            $ = new ManagedServiceIdentityResponseUserAssignedIdentities();
        }

        public Builder(ManagedServiceIdentityResponseUserAssignedIdentities defaults) {
            $ = new ManagedServiceIdentityResponseUserAssignedIdentities(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The client id of user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param principalId The principal id of user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        public ManagedServiceIdentityResponseUserAssignedIdentities build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            return $;
        }
    }

}
