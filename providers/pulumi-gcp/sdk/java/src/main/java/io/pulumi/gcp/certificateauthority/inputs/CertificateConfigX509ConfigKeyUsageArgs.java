// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigKeyUsageArgs Empty = new CertificateConfigX509ConfigKeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="baseKeyUsage", required=true)
      private final Output<CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage;

    public Output<CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs> getBaseKeyUsage() {
        return this.baseKeyUsage;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="extendedKeyUsage", required=true)
      private final Output<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;

    public Output<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs> getExtendedKeyUsage() {
        return this.extendedKeyUsage;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    @Import(name="unknownExtendedKeyUsages")
      private final @Nullable Output<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

    public Output<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Codegen.empty() : this.unknownExtendedKeyUsages;
    }

    public CertificateConfigX509ConfigKeyUsageArgs(
        Output<CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage,
        Output<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage,
        @Nullable Output<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage, "expected parameter 'baseKeyUsage' to be non-null");
        this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage, "expected parameter 'extendedKeyUsage' to be non-null");
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private CertificateConfigX509ConfigKeyUsageArgs() {
        this.baseKeyUsage = Codegen.empty();
        this.extendedKeyUsage = Codegen.empty();
        this.unknownExtendedKeyUsages = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage;
        private Output<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;
        private @Nullable Output<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigX509ConfigKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder baseKeyUsage(Output<CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs> baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }
        public Builder baseKeyUsage(CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs baseKeyUsage) {
            this.baseKeyUsage = Output.of(Objects.requireNonNull(baseKeyUsage));
            return this;
        }
        public Builder extendedKeyUsage(Output<CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs> extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }
        public Builder extendedKeyUsage(CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs extendedKeyUsage) {
            this.extendedKeyUsage = Output.of(Objects.requireNonNull(extendedKeyUsage));
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable Output<List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable List<CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Codegen.ofNullable(unknownExtendedKeyUsages);
            return this;
        }
        public Builder unknownExtendedKeyUsages(CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }        public CertificateConfigX509ConfigKeyUsageArgs build() {
            return new CertificateConfigX509ConfigKeyUsageArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
