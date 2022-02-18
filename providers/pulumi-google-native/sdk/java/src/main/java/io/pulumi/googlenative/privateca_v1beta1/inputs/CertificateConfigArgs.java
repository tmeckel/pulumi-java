// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.PublicKeyArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigWrapperArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.SubjectConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CertificateConfig describes an X.509 certificate or CSR that is to be created, as an alternative to using ASN.1.
 * 
 */
public final class CertificateConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigArgs Empty = new CertificateConfigArgs();

    /**
     * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or CertificateAuthority CSR.
     * 
     */
    @InputImport(name="publicKey")
    private final @Nullable Input<PublicKeyArgs> publicKey;

    public Input<PublicKeyArgs> getPublicKey() {
        return this.publicKey == null ? Input.empty() : this.publicKey;
    }

    /**
     * Describes how some of the technical fields in a certificate should be populated.
     * 
     */
    @InputImport(name="reusableConfig", required=true)
    private final Input<ReusableConfigWrapperArgs> reusableConfig;

    public Input<ReusableConfigWrapperArgs> getReusableConfig() {
        return this.reusableConfig;
    }

    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * 
     */
    @InputImport(name="subjectConfig", required=true)
    private final Input<SubjectConfigArgs> subjectConfig;

    public Input<SubjectConfigArgs> getSubjectConfig() {
        return this.subjectConfig;
    }

    public CertificateConfigArgs(
        @Nullable Input<PublicKeyArgs> publicKey,
        Input<ReusableConfigWrapperArgs> reusableConfig,
        Input<SubjectConfigArgs> subjectConfig) {
        this.publicKey = publicKey;
        this.reusableConfig = Objects.requireNonNull(reusableConfig, "expected parameter 'reusableConfig' to be non-null");
        this.subjectConfig = Objects.requireNonNull(subjectConfig, "expected parameter 'subjectConfig' to be non-null");
    }

    private CertificateConfigArgs() {
        this.publicKey = Input.empty();
        this.reusableConfig = Input.empty();
        this.subjectConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PublicKeyArgs> publicKey;
        private Input<ReusableConfigWrapperArgs> reusableConfig;
        private Input<SubjectConfigArgs> subjectConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
    	      this.reusableConfig = defaults.reusableConfig;
    	      this.subjectConfig = defaults.subjectConfig;
        }

        public Builder setPublicKey(@Nullable Input<PublicKeyArgs> publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder setPublicKey(@Nullable PublicKeyArgs publicKey) {
            this.publicKey = Input.ofNullable(publicKey);
            return this;
        }

        public Builder setReusableConfig(Input<ReusableConfigWrapperArgs> reusableConfig) {
            this.reusableConfig = Objects.requireNonNull(reusableConfig);
            return this;
        }

        public Builder setReusableConfig(ReusableConfigWrapperArgs reusableConfig) {
            this.reusableConfig = Input.of(Objects.requireNonNull(reusableConfig));
            return this;
        }

        public Builder setSubjectConfig(Input<SubjectConfigArgs> subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }

        public Builder setSubjectConfig(SubjectConfigArgs subjectConfig) {
            this.subjectConfig = Input.of(Objects.requireNonNull(subjectConfig));
            return this;
        }

        public CertificateConfigArgs build() {
            return new CertificateConfigArgs(publicKey, reusableConfig, subjectConfig);
        }
    }
}
