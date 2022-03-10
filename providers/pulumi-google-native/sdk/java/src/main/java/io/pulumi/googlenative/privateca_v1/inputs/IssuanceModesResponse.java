// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * IssuanceModes specifies the allowed ways in which Certificates may be requested from this CaPool.
 * 
 */
public final class IssuanceModesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IssuanceModesResponse Empty = new IssuanceModesResponse();

    /**
     * Optional. When true, allows callers to create Certificates by specifying a CertificateConfig.
     * 
     */
    @InputImport(name="allowConfigBasedIssuance", required=true)
      private final Boolean allowConfigBasedIssuance;

    public Boolean getAllowConfigBasedIssuance() {
        return this.allowConfigBasedIssuance;
    }

    /**
     * Optional. When true, allows callers to create Certificates by specifying a CSR.
     * 
     */
    @InputImport(name="allowCsrBasedIssuance", required=true)
      private final Boolean allowCsrBasedIssuance;

    public Boolean getAllowCsrBasedIssuance() {
        return this.allowCsrBasedIssuance;
    }

    public IssuanceModesResponse(
        Boolean allowConfigBasedIssuance,
        Boolean allowCsrBasedIssuance) {
        this.allowConfigBasedIssuance = Objects.requireNonNull(allowConfigBasedIssuance, "expected parameter 'allowConfigBasedIssuance' to be non-null");
        this.allowCsrBasedIssuance = Objects.requireNonNull(allowCsrBasedIssuance, "expected parameter 'allowCsrBasedIssuance' to be non-null");
    }

    private IssuanceModesResponse() {
        this.allowConfigBasedIssuance = null;
        this.allowCsrBasedIssuance = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IssuanceModesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowConfigBasedIssuance;
        private Boolean allowCsrBasedIssuance;

        public Builder() {
    	      // Empty
        }

        public Builder(IssuanceModesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowConfigBasedIssuance = defaults.allowConfigBasedIssuance;
    	      this.allowCsrBasedIssuance = defaults.allowCsrBasedIssuance;
        }

        public Builder allowConfigBasedIssuance(Boolean allowConfigBasedIssuance) {
            this.allowConfigBasedIssuance = Objects.requireNonNull(allowConfigBasedIssuance);
            return this;
        }

        public Builder allowCsrBasedIssuance(Boolean allowCsrBasedIssuance) {
            this.allowCsrBasedIssuance = Objects.requireNonNull(allowCsrBasedIssuance);
            return this;
        }
        public IssuanceModesResponse build() {
            return new IssuanceModesResponse(allowConfigBasedIssuance, allowCsrBasedIssuance);
        }
    }
}
