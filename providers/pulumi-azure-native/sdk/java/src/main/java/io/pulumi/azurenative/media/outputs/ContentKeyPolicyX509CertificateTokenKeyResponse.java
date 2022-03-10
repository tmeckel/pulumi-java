// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContentKeyPolicyX509CertificateTokenKeyResponse {
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyX509CertificateTokenKey'.
     * 
     */
    private final String odataType;
    /**
     * The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET)
     * 
     */
    private final String rawBody;

    @OutputCustomType.Constructor
    private ContentKeyPolicyX509CertificateTokenKeyResponse(
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("rawBody") String rawBody) {
        this.odataType = odataType;
        this.rawBody = rawBody;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyX509CertificateTokenKey'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET)
     * 
    */
    public String getRawBody() {
        return this.rawBody;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyX509CertificateTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String rawBody;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyX509CertificateTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.rawBody = defaults.rawBody;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder rawBody(String rawBody) {
            this.rawBody = Objects.requireNonNull(rawBody);
            return this;
        }
        public ContentKeyPolicyX509CertificateTokenKeyResponse build() {
            return new ContentKeyPolicyX509CertificateTokenKeyResponse(odataType, rawBody);
        }
    }
}
