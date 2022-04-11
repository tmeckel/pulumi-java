// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs Empty = new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs();

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    @Import(name="critical")
      private final @Nullable Output<Boolean> critical;

    public Output<Boolean> getCritical() {
        return this.critical == null ? Codegen.empty() : this.critical;
    }

    @Import(name="obectIds")
      private final @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs>> obectIds;

    public Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs>> getObectIds() {
        return this.obectIds == null ? Codegen.empty() : this.obectIds;
    }

    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs(
        @Nullable Output<Boolean> critical,
        @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs>> obectIds,
        @Nullable Output<String> value) {
        this.critical = critical;
        this.obectIds = obectIds;
        this.value = value;
    }

    private CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs() {
        this.critical = Codegen.empty();
        this.obectIds = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> critical;
        private @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs>> obectIds;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.obectIds = defaults.obectIds;
    	      this.value = defaults.value;
        }

        public Builder critical(@Nullable Output<Boolean> critical) {
            this.critical = critical;
            return this;
        }
        public Builder critical(@Nullable Boolean critical) {
            this.critical = Codegen.ofNullable(critical);
            return this;
        }
        public Builder obectIds(@Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs>> obectIds) {
            this.obectIds = obectIds;
            return this;
        }
        public Builder obectIds(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs> obectIds) {
            this.obectIds = Codegen.ofNullable(obectIds);
            return this;
        }
        public Builder obectIds(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs... obectIds) {
            return obectIds(List.of(obectIds));
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs build() {
            return new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs(critical, obectIds, value);
        }
    }
}
