// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.websecurityscanner_v1alpha.inputs.CustomAccountResponse;
import com.pulumi.googlenative.websecurityscanner_v1alpha.inputs.GoogleAccountResponse;
import java.util.Objects;


/**
 * Scan authentication configuration.
 * 
 */
public final class AuthenticationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuthenticationResponse Empty = new AuthenticationResponse();

    /**
     * Authentication using a custom account.
     * 
     */
    @Import(name="customAccount", required=true)
    private CustomAccountResponse customAccount;

    /**
     * @return Authentication using a custom account.
     * 
     */
    public CustomAccountResponse customAccount() {
        return this.customAccount;
    }

    /**
     * Authentication using a Google account.
     * 
     */
    @Import(name="googleAccount", required=true)
    private GoogleAccountResponse googleAccount;

    /**
     * @return Authentication using a Google account.
     * 
     */
    public GoogleAccountResponse googleAccount() {
        return this.googleAccount;
    }

    private AuthenticationResponse() {}

    private AuthenticationResponse(AuthenticationResponse $) {
        this.customAccount = $.customAccount;
        this.googleAccount = $.googleAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationResponse $;

        public Builder() {
            $ = new AuthenticationResponse();
        }

        public Builder(AuthenticationResponse defaults) {
            $ = new AuthenticationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param customAccount Authentication using a custom account.
         * 
         * @return builder
         * 
         */
        public Builder customAccount(CustomAccountResponse customAccount) {
            $.customAccount = customAccount;
            return this;
        }

        /**
         * @param googleAccount Authentication using a Google account.
         * 
         * @return builder
         * 
         */
        public Builder googleAccount(GoogleAccountResponse googleAccount) {
            $.googleAccount = googleAccount;
            return this;
        }

        public AuthenticationResponse build() {
            $.customAccount = Objects.requireNonNull($.customAccount, "expected parameter 'customAccount' to be non-null");
            $.googleAccount = Objects.requireNonNull($.googleAccount, "expected parameter 'googleAccount' to be non-null");
            return $;
        }
    }

}
