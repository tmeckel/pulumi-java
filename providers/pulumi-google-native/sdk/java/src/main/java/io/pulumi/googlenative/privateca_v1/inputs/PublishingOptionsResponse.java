// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Options relating to the publication of each CertificateAuthority's CA certificate and CRLs and their inclusion as extensions in issued Certificates. The options set here apply to certificates issued by any CertificateAuthority in the CaPool.
 * 
 */
public final class PublishingOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final PublishingOptionsResponse Empty = new PublishingOptionsResponse();

    /**
     * Optional. When true, publishes each CertificateAuthority's CA certificate and includes its URL in the "Authority Information Access" X.509 extension in all issued Certificates. If this is false, the CA certificate will not be published and the corresponding X.509 extension will not be written in issued certificates.
     * 
     */
    @InputImport(name="publishCaCert", required=true)
    private final Boolean publishCaCert;

    public Boolean getPublishCaCert() {
        return this.publishCaCert;
    }

    /**
     * Optional. When true, publishes each CertificateAuthority's CRL and includes its URL in the "CRL Distribution Points" X.509 extension in all issued Certificates. If this is false, CRLs will not be published and the corresponding X.509 extension will not be written in issued certificates. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
     * 
     */
    @InputImport(name="publishCrl", required=true)
    private final Boolean publishCrl;

    public Boolean getPublishCrl() {
        return this.publishCrl;
    }

    public PublishingOptionsResponse(
        Boolean publishCaCert,
        Boolean publishCrl) {
        this.publishCaCert = Objects.requireNonNull(publishCaCert, "expected parameter 'publishCaCert' to be non-null");
        this.publishCrl = Objects.requireNonNull(publishCrl, "expected parameter 'publishCrl' to be non-null");
    }

    private PublishingOptionsResponse() {
        this.publishCaCert = null;
        this.publishCrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublishingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean publishCaCert;
        private Boolean publishCrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PublishingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishCaCert = defaults.publishCaCert;
    	      this.publishCrl = defaults.publishCrl;
        }

        public Builder setPublishCaCert(Boolean publishCaCert) {
            this.publishCaCert = Objects.requireNonNull(publishCaCert);
            return this;
        }

        public Builder setPublishCrl(Boolean publishCrl) {
            this.publishCrl = Objects.requireNonNull(publishCrl);
            return this;
        }

        public PublishingOptionsResponse build() {
            return new PublishingOptionsResponse(publishCaCert, publishCrl);
        }
    }
}
