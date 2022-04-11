// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.enums.EncryptionAlgorithm;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represent the secrets intended for encryption with asymmetric key pair.
 * 
 */
public final class AsymmetricEncryptedSecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final AsymmetricEncryptedSecretArgs Empty = new AsymmetricEncryptedSecretArgs();

    /**
     * The algorithm used to encrypt "Value".
     * 
     */
    @Import(name="encryptionAlgorithm", required=true)
      private final Output<Either<String,EncryptionAlgorithm>> encryptionAlgorithm;

    public Output<Either<String,EncryptionAlgorithm>> getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * Thumbprint certificate used to encrypt \"Value\". If the value is unencrypted, it will be null.
     * 
     */
    @Import(name="encryptionCertThumbprint")
      private final @Nullable Output<String> encryptionCertThumbprint;

    public Output<String> getEncryptionCertThumbprint() {
        return this.encryptionCertThumbprint == null ? Codegen.empty() : this.encryptionCertThumbprint;
    }

    /**
     * The value of the secret.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public AsymmetricEncryptedSecretArgs(
        Output<Either<String,EncryptionAlgorithm>> encryptionAlgorithm,
        @Nullable Output<String> encryptionCertThumbprint,
        Output<String> value) {
        this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm, "expected parameter 'encryptionAlgorithm' to be non-null");
        this.encryptionCertThumbprint = encryptionCertThumbprint;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AsymmetricEncryptedSecretArgs() {
        this.encryptionAlgorithm = Codegen.empty();
        this.encryptionCertThumbprint = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AsymmetricEncryptedSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,EncryptionAlgorithm>> encryptionAlgorithm;
        private @Nullable Output<String> encryptionCertThumbprint;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(AsymmetricEncryptedSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionCertThumbprint = defaults.encryptionCertThumbprint;
    	      this.value = defaults.value;
        }

        public Builder encryptionAlgorithm(Output<Either<String,EncryptionAlgorithm>> encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }
        public Builder encryptionAlgorithm(Either<String,EncryptionAlgorithm> encryptionAlgorithm) {
            this.encryptionAlgorithm = Output.of(Objects.requireNonNull(encryptionAlgorithm));
            return this;
        }
        public Builder encryptionCertThumbprint(@Nullable Output<String> encryptionCertThumbprint) {
            this.encryptionCertThumbprint = encryptionCertThumbprint;
            return this;
        }
        public Builder encryptionCertThumbprint(@Nullable String encryptionCertThumbprint) {
            this.encryptionCertThumbprint = Codegen.ofNullable(encryptionCertThumbprint);
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public AsymmetricEncryptedSecretArgs build() {
            return new AsymmetricEncryptedSecretArgs(encryptionAlgorithm, encryptionCertThumbprint, value);
        }
    }
}
