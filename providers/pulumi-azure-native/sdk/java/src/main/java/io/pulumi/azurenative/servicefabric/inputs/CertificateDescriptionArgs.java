// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the certificate details.
 * 
 */
public final class CertificateDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateDescriptionArgs Empty = new CertificateDescriptionArgs();

    /**
     * Thumbprint of the primary certificate.
     * 
     */
    @InputImport(name="thumbprint", required=true)
      private final Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint;
    }

    /**
     * Thumbprint of the secondary certificate.
     * 
     */
    @InputImport(name="thumbprintSecondary")
      private final @Nullable Input<String> thumbprintSecondary;

    public Input<String> getThumbprintSecondary() {
        return this.thumbprintSecondary == null ? Input.empty() : this.thumbprintSecondary;
    }

    /**
     * The local certificate store location.
     * 
     */
    @InputImport(name="x509StoreName")
      private final @Nullable Input<String> x509StoreName;

    public Input<String> getX509StoreName() {
        return this.x509StoreName == null ? Input.empty() : this.x509StoreName;
    }

    public CertificateDescriptionArgs(
        Input<String> thumbprint,
        @Nullable Input<String> thumbprintSecondary,
        @Nullable Input<String> x509StoreName) {
        this.thumbprint = Objects.requireNonNull(thumbprint, "expected parameter 'thumbprint' to be non-null");
        this.thumbprintSecondary = thumbprintSecondary;
        this.x509StoreName = x509StoreName;
    }

    private CertificateDescriptionArgs() {
        this.thumbprint = Input.empty();
        this.thumbprintSecondary = Input.empty();
        this.x509StoreName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> thumbprint;
        private @Nullable Input<String> thumbprintSecondary;
        private @Nullable Input<String> x509StoreName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thumbprint = defaults.thumbprint;
    	      this.thumbprintSecondary = defaults.thumbprintSecondary;
    	      this.x509StoreName = defaults.x509StoreName;
        }

        public Builder thumbprint(Input<String> thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Input.of(Objects.requireNonNull(thumbprint));
            return this;
        }

        public Builder thumbprintSecondary(@Nullable Input<String> thumbprintSecondary) {
            this.thumbprintSecondary = thumbprintSecondary;
            return this;
        }

        public Builder thumbprintSecondary(@Nullable String thumbprintSecondary) {
            this.thumbprintSecondary = Input.ofNullable(thumbprintSecondary);
            return this;
        }

        public Builder x509StoreName(@Nullable Input<String> x509StoreName) {
            this.x509StoreName = x509StoreName;
            return this;
        }

        public Builder x509StoreName(@Nullable String x509StoreName) {
            this.x509StoreName = Input.ofNullable(x509StoreName);
            return this;
        }
        public CertificateDescriptionArgs build() {
            return new CertificateDescriptionArgs(thumbprint, thumbprintSecondary, x509StoreName);
        }
    }
}
