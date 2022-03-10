// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.certificates.k8s.io_v1beta1.inputs.CertificateSigningRequestConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateSigningRequestStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateSigningRequestStatusArgs Empty = new CertificateSigningRequestStatusArgs();

    /**
     * If request was approved, the controller will place the issued certificate here.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * Conditions applied to the request, such as approval or denial.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Input<List<CertificateSigningRequestConditionArgs>> conditions;

    public Input<List<CertificateSigningRequestConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    public CertificateSigningRequestStatusArgs(
        @Nullable Input<String> certificate,
        @Nullable Input<List<CertificateSigningRequestConditionArgs>> conditions) {
        this.certificate = certificate;
        this.conditions = conditions;
    }

    private CertificateSigningRequestStatusArgs() {
        this.certificate = Input.empty();
        this.conditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificate;
        private @Nullable Input<List<CertificateSigningRequestConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.conditions = defaults.conditions;
        }

        public Builder certificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder conditions(@Nullable Input<List<CertificateSigningRequestConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder conditions(@Nullable List<CertificateSigningRequestConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }
        public CertificateSigningRequestStatusArgs build() {
            return new CertificateSigningRequestStatusArgs(certificate, conditions);
        }
    }
}
