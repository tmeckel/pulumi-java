// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.websecurityscanner_v1beta.inputs.CustomAccountResponse;
import io.pulumi.googlenative.websecurityscanner_v1beta.inputs.GoogleAccountResponse;
import io.pulumi.googlenative.websecurityscanner_v1beta.inputs.IapCredentialResponse;
import java.util.Objects;


/**
 * Scan authentication configuration.
 * 
 */
public final class AuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthenticationResponse Empty = new AuthenticationResponse();

    /**
     * Authentication using a custom account.
     * 
     */
    @InputImport(name="customAccount", required=true)
    private final CustomAccountResponse customAccount;

    public CustomAccountResponse getCustomAccount() {
        return this.customAccount;
    }

    /**
     * Authentication using a Google account.
     * 
     */
    @InputImport(name="googleAccount", required=true)
    private final GoogleAccountResponse googleAccount;

    public GoogleAccountResponse getGoogleAccount() {
        return this.googleAccount;
    }

    /**
     * Authentication using Identity-Aware-Proxy (IAP).
     * 
     */
    @InputImport(name="iapCredential", required=true)
    private final IapCredentialResponse iapCredential;

    public IapCredentialResponse getIapCredential() {
        return this.iapCredential;
    }

    public AuthenticationResponse(
        CustomAccountResponse customAccount,
        GoogleAccountResponse googleAccount,
        IapCredentialResponse iapCredential) {
        this.customAccount = Objects.requireNonNull(customAccount, "expected parameter 'customAccount' to be non-null");
        this.googleAccount = Objects.requireNonNull(googleAccount, "expected parameter 'googleAccount' to be non-null");
        this.iapCredential = Objects.requireNonNull(iapCredential, "expected parameter 'iapCredential' to be non-null");
    }

    private AuthenticationResponse() {
        this.customAccount = null;
        this.googleAccount = null;
        this.iapCredential = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomAccountResponse customAccount;
        private GoogleAccountResponse googleAccount;
        private IapCredentialResponse iapCredential;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customAccount = defaults.customAccount;
    	      this.googleAccount = defaults.googleAccount;
    	      this.iapCredential = defaults.iapCredential;
        }

        public Builder setCustomAccount(CustomAccountResponse customAccount) {
            this.customAccount = Objects.requireNonNull(customAccount);
            return this;
        }

        public Builder setGoogleAccount(GoogleAccountResponse googleAccount) {
            this.googleAccount = Objects.requireNonNull(googleAccount);
            return this;
        }

        public Builder setIapCredential(IapCredentialResponse iapCredential) {
            this.iapCredential = Objects.requireNonNull(iapCredential);
            return this;
        }

        public AuthenticationResponse build() {
            return new AuthenticationResponse(customAccount, googleAccount, iapCredential);
        }
    }
}
