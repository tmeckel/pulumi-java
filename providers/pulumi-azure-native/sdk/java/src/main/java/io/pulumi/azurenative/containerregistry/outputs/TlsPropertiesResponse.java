// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.TlsCertificatePropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TlsPropertiesResponse {
    private final TlsCertificatePropertiesResponse certificate;
    private final String status;

    @OutputCustomType.Constructor({"certificate","status"})
    private TlsPropertiesResponse(
        TlsCertificatePropertiesResponse certificate,
        String status) {
        this.certificate = Objects.requireNonNull(certificate);
        this.status = Objects.requireNonNull(status);
    }

    public TlsCertificatePropertiesResponse getCertificate() {
        return this.certificate;
    }
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsCertificatePropertiesResponse certificate;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.status = defaults.status;
        }

        public Builder setCertificate(TlsCertificatePropertiesResponse certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public TlsPropertiesResponse build() {
            return new TlsPropertiesResponse(certificate, status);
        }
    }
}
