// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudiot_v1.inputs.PublicKeyCertificateArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A server-stored registry credential used to validate device credentials.
 * 
 */
public final class RegistryCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryCredentialArgs Empty = new RegistryCredentialArgs();

    /**
     * A public key certificate used to verify the device credentials.
     * 
     */
    @InputImport(name="publicKeyCertificate")
      private final @Nullable Input<PublicKeyCertificateArgs> publicKeyCertificate;

    public Input<PublicKeyCertificateArgs> getPublicKeyCertificate() {
        return this.publicKeyCertificate == null ? Input.empty() : this.publicKeyCertificate;
    }

    public RegistryCredentialArgs(@Nullable Input<PublicKeyCertificateArgs> publicKeyCertificate) {
        this.publicKeyCertificate = publicKeyCertificate;
    }

    private RegistryCredentialArgs() {
        this.publicKeyCertificate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PublicKeyCertificateArgs> publicKeyCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyCertificate = defaults.publicKeyCertificate;
        }

        public Builder publicKeyCertificate(@Nullable Input<PublicKeyCertificateArgs> publicKeyCertificate) {
            this.publicKeyCertificate = publicKeyCertificate;
            return this;
        }

        public Builder publicKeyCertificate(@Nullable PublicKeyCertificateArgs publicKeyCertificate) {
            this.publicKeyCertificate = Input.ofNullable(publicKeyCertificate);
            return this;
        }
        public RegistryCredentialArgs build() {
            return new RegistryCredentialArgs(publicKeyCertificate);
        }
    }
}
