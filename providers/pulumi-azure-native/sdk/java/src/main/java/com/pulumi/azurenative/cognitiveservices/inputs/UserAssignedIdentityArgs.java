// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User-assigned managed identity.
 * 
 */
public final class UserAssignedIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserAssignedIdentityArgs Empty = new UserAssignedIdentityArgs();

    /**
     * Client App Id associated with this identity.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return Client App Id associated with this identity.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Azure Active Directory principal ID associated with this Identity.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return Azure Active Directory principal ID associated with this Identity.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    private UserAssignedIdentityArgs() {}

    private UserAssignedIdentityArgs(UserAssignedIdentityArgs $) {
        this.clientId = $.clientId;
        this.principalId = $.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAssignedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAssignedIdentityArgs $;

        public Builder() {
            $ = new UserAssignedIdentityArgs();
        }

        public Builder(UserAssignedIdentityArgs defaults) {
            $ = new UserAssignedIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId Client App Id associated with this identity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client App Id associated with this identity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param principalId Azure Active Directory principal ID associated with this Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId Azure Active Directory principal ID associated with this Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        public UserAssignedIdentityArgs build() {
            return $;
        }
    }

}
