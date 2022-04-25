// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendTlsPropertiesResponse {
    /**
     * @return Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
     * 
     */
    private final @Nullable Boolean validateCertificateChain;
    /**
     * @return Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
     * 
     */
    private final @Nullable Boolean validateCertificateName;

    @CustomType.Constructor
    private BackendTlsPropertiesResponse(
        @CustomType.Parameter("validateCertificateChain") @Nullable Boolean validateCertificateChain,
        @CustomType.Parameter("validateCertificateName") @Nullable Boolean validateCertificateName) {
        this.validateCertificateChain = validateCertificateChain;
        this.validateCertificateName = validateCertificateName;
    }

    /**
     * @return Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
     * 
     */
    public Optional<Boolean> validateCertificateChain() {
        return Optional.ofNullable(this.validateCertificateChain);
    }
    /**
     * @return Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
     * 
     */
    public Optional<Boolean> validateCertificateName() {
        return Optional.ofNullable(this.validateCertificateName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendTlsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean validateCertificateChain;
        private @Nullable Boolean validateCertificateName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendTlsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.validateCertificateChain = defaults.validateCertificateChain;
    	      this.validateCertificateName = defaults.validateCertificateName;
        }

        public Builder validateCertificateChain(@Nullable Boolean validateCertificateChain) {
            this.validateCertificateChain = validateCertificateChain;
            return this;
        }
        public Builder validateCertificateName(@Nullable Boolean validateCertificateName) {
            this.validateCertificateName = validateCertificateName;
            return this;
        }        public BackendTlsPropertiesResponse build() {
            return new BackendTlsPropertiesResponse(validateCertificateChain, validateCertificateName);
        }
    }
}
