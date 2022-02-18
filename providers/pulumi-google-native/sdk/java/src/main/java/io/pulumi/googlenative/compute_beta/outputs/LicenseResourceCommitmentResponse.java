// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LicenseResourceCommitmentResponse {
    /**
     * The number of licenses purchased.
     * 
     */
    private final String amount;
    /**
     * Specifies the core range of the instance for which this license applies.
     * 
     */
    private final String coresPerLicense;
    /**
     * Any applicable license URI.
     * 
     */
    private final String license;

    @OutputCustomType.Constructor({"amount","coresPerLicense","license"})
    private LicenseResourceCommitmentResponse(
        String amount,
        String coresPerLicense,
        String license) {
        this.amount = Objects.requireNonNull(amount);
        this.coresPerLicense = Objects.requireNonNull(coresPerLicense);
        this.license = Objects.requireNonNull(license);
    }

    /**
     * The number of licenses purchased.
     * 
     */
    public String getAmount() {
        return this.amount;
    }
    /**
     * Specifies the core range of the instance for which this license applies.
     * 
     */
    public String getCoresPerLicense() {
        return this.coresPerLicense;
    }
    /**
     * Any applicable license URI.
     * 
     */
    public String getLicense() {
        return this.license;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResourceCommitmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String amount;
        private String coresPerLicense;
        private String license;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResourceCommitmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.coresPerLicense = defaults.coresPerLicense;
    	      this.license = defaults.license;
        }

        public Builder setAmount(String amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setCoresPerLicense(String coresPerLicense) {
            this.coresPerLicense = Objects.requireNonNull(coresPerLicense);
            return this;
        }

        public Builder setLicense(String license) {
            this.license = Objects.requireNonNull(license);
            return this;
        }

        public LicenseResourceCommitmentResponse build() {
            return new LicenseResourceCommitmentResponse(amount, coresPerLicense, license);
        }
    }
}
