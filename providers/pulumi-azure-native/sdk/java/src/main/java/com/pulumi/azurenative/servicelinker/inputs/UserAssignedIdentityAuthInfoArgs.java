// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicelinker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is userAssignedIdentity
 * 
 */
public final class UserAssignedIdentityAuthInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserAssignedIdentityAuthInfoArgs Empty = new UserAssignedIdentityAuthInfoArgs();

    /**
     * The authentication type.
     * Expected value is &#39;userAssignedIdentity&#39;.
     * 
     */
    @Import(name="authType", required=true)
    private Output<String> authType;

    /**
     * @return The authentication type.
     * Expected value is &#39;userAssignedIdentity&#39;.
     * 
     */
    public Output<String> authType() {
        return this.authType;
    }

    /**
     * Client Id for userAssignedIdentity.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return Client Id for userAssignedIdentity.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Subscription id for userAssignedIdentity.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return Subscription id for userAssignedIdentity.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private UserAssignedIdentityAuthInfoArgs() {}

    private UserAssignedIdentityAuthInfoArgs(UserAssignedIdentityAuthInfoArgs $) {
        this.authType = $.authType;
        this.clientId = $.clientId;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAssignedIdentityAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAssignedIdentityAuthInfoArgs $;

        public Builder() {
            $ = new UserAssignedIdentityAuthInfoArgs();
        }

        public Builder(UserAssignedIdentityAuthInfoArgs defaults) {
            $ = new UserAssignedIdentityAuthInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authType The authentication type.
         * Expected value is &#39;userAssignedIdentity&#39;.
         * 
         * @return builder
         * 
         */
        public Builder authType(Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType The authentication type.
         * Expected value is &#39;userAssignedIdentity&#39;.
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param clientId Client Id for userAssignedIdentity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client Id for userAssignedIdentity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param subscriptionId Subscription id for userAssignedIdentity.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subscription id for userAssignedIdentity.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public UserAssignedIdentityAuthInfoArgs build() {
            $.authType = Codegen.stringProp("authType").output().arg($.authType).require();
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
