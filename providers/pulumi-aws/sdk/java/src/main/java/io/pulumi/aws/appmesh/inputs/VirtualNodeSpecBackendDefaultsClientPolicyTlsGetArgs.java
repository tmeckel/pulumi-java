// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs();

    /**
     * The listener's TLS certificate.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate;

    public Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * Whether the policy is enforced. Default is `true`.
     * 
     */
    @InputImport(name="enforce")
      private final @Nullable Input<Boolean> enforce;

    public Input<Boolean> getEnforce() {
        return this.enforce == null ? Input.empty() : this.enforce;
    }

    /**
     * One or more ports that the policy is enforced for.
     * 
     */
    @InputImport(name="ports")
      private final @Nullable Input<List<Integer>> ports;

    public Input<List<Integer>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    @InputImport(name="validation", required=true)
      private final Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation;

    public Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> getValidation() {
        return this.validation;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs(
        @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate,
        @Nullable Input<Boolean> enforce,
        @Nullable Input<List<Integer>> ports,
        Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation) {
        this.certificate = certificate;
        this.enforce = enforce;
        this.ports = ports;
        this.validation = Objects.requireNonNull(validation, "expected parameter 'validation' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs() {
        this.certificate = Input.empty();
        this.enforce = Input.empty();
        this.ports = Input.empty();
        this.validation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate;
        private @Nullable Input<Boolean> enforce;
        private @Nullable Input<List<Integer>> ports;
        private Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.enforce = defaults.enforce;
    	      this.ports = defaults.ports;
    	      this.validation = defaults.validation;
        }

        public Builder certificate(@Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder enforce(@Nullable Input<Boolean> enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder enforce(@Nullable Boolean enforce) {
            this.enforce = Input.ofNullable(enforce);
            return this;
        }

        public Builder ports(@Nullable Input<List<Integer>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder ports(@Nullable List<Integer> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder validation(Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs> validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }

        public Builder validation(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationGetArgs validation) {
            this.validation = Input.of(Objects.requireNonNull(validation));
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs(certificate, enforce, ports, validation);
        }
    }
}
