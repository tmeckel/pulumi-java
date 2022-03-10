// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class CaPoolPublishingOptions {
    /**
     * When true, publishes each CertificateAuthority's CA certificate and includes its URL in the "Authority Information Access"
     * X.509 extension in all issued Certificates. If this is false, the CA certificate will not be published and the corresponding
     * X.509 extension will not be written in issued certificates.
     * 
     */
    private final Boolean publishCaCert;
    /**
     * When true, publishes each CertificateAuthority's CRL and includes its URL in the "CRL Distribution Points" X.509 extension
     * in all issued Certificates. If this is false, CRLs will not be published and the corresponding X.509 extension will not
     * be written in issued certificates. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are
     * also rebuilt shortly after a certificate is revoked.
     * 
     */
    private final Boolean publishCrl;

    @OutputCustomType.Constructor
    private CaPoolPublishingOptions(
        @OutputCustomType.Parameter("publishCaCert") Boolean publishCaCert,
        @OutputCustomType.Parameter("publishCrl") Boolean publishCrl) {
        this.publishCaCert = publishCaCert;
        this.publishCrl = publishCrl;
    }

    /**
     * When true, publishes each CertificateAuthority's CA certificate and includes its URL in the "Authority Information Access"
     * X.509 extension in all issued Certificates. If this is false, the CA certificate will not be published and the corresponding
     * X.509 extension will not be written in issued certificates.
     * 
    */
    public Boolean getPublishCaCert() {
        return this.publishCaCert;
    }
    /**
     * When true, publishes each CertificateAuthority's CRL and includes its URL in the "CRL Distribution Points" X.509 extension
     * in all issued Certificates. If this is false, CRLs will not be published and the corresponding X.509 extension will not
     * be written in issued certificates. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are
     * also rebuilt shortly after a certificate is revoked.
     * 
    */
    public Boolean getPublishCrl() {
        return this.publishCrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolPublishingOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean publishCaCert;
        private Boolean publishCrl;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolPublishingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishCaCert = defaults.publishCaCert;
    	      this.publishCrl = defaults.publishCrl;
        }

        public Builder publishCaCert(Boolean publishCaCert) {
            this.publishCaCert = Objects.requireNonNull(publishCaCert);
            return this;
        }

        public Builder publishCrl(Boolean publishCrl) {
            this.publishCrl = Objects.requireNonNull(publishCrl);
            return this;
        }
        public CaPoolPublishingOptions build() {
            return new CaPoolPublishingOptions(publishCaCert, publishCrl);
        }
    }
}
