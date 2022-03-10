// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage {
    private final @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds;

    @OutputCustomType.Constructor
    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage(@OutputCustomType.Parameter("obectIds") @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds) {
        this.obectIds = obectIds;
    }

    public List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> getObectIds() {
        return this.obectIds == null ? List.of() : this.obectIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obectIds = defaults.obectIds;
        }

        public Builder obectIds(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds) {
            this.obectIds = obectIds;
            return this;
        }
        public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage(obectIds);
        }
    }
}
