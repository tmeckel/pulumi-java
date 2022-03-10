// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudiot_v1.enums.PublicKeyCertificateFormat;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A public key certificate format and data.
 * 
 */
public final class PublicKeyCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicKeyCertificateArgs Empty = new PublicKeyCertificateArgs();

    /**
     * The certificate data.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * The certificate format.
     * 
     */
    @InputImport(name="format")
      private final @Nullable Input<PublicKeyCertificateFormat> format;

    public Input<PublicKeyCertificateFormat> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    public PublicKeyCertificateArgs(
        @Nullable Input<String> certificate,
        @Nullable Input<PublicKeyCertificateFormat> format) {
        this.certificate = certificate;
        this.format = format;
    }

    private PublicKeyCertificateArgs() {
        this.certificate = Input.empty();
        this.format = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificate;
        private @Nullable Input<PublicKeyCertificateFormat> format;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.format = defaults.format;
        }

        public Builder certificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder format(@Nullable Input<PublicKeyCertificateFormat> format) {
            this.format = format;
            return this;
        }

        public Builder format(@Nullable PublicKeyCertificateFormat format) {
            this.format = Input.ofNullable(format);
            return this;
        }
        public PublicKeyCertificateArgs build() {
            return new PublicKeyCertificateArgs(certificate, format);
        }
    }
}
