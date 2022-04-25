// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SelectedCertificateInputResponse {
    /**
     * @return Name of certificate to be exported.
     * 
     */
    private final String certificateName;
    /**
     * @return Password to use for encrypting the exported certificate.
     * 
     */
    private final String password;

    @CustomType.Constructor
    private SelectedCertificateInputResponse(
        @CustomType.Parameter("certificateName") String certificateName,
        @CustomType.Parameter("password") String password) {
        this.certificateName = certificateName;
        this.password = password;
    }

    /**
     * @return Name of certificate to be exported.
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }
    /**
     * @return Password to use for encrypting the exported certificate.
     * 
     */
    public String password() {
        return this.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectedCertificateInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateName;
        private String password;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectedCertificateInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.password = defaults.password;
        }

        public Builder certificateName(String certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }        public SelectedCertificateInputResponse build() {
            return new SelectedCertificateInputResponse(certificateName, password);
        }
    }
}
