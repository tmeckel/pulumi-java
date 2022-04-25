// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class LicenseResourceRequirementsResponse {
    /**
     * @return Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    private final Integer minGuestCpuCount;
    /**
     * @return Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    private final Integer minMemoryMb;

    @CustomType.Constructor
    private LicenseResourceRequirementsResponse(
        @CustomType.Parameter("minGuestCpuCount") Integer minGuestCpuCount,
        @CustomType.Parameter("minMemoryMb") Integer minMemoryMb) {
        this.minGuestCpuCount = minGuestCpuCount;
        this.minMemoryMb = minMemoryMb;
    }

    /**
     * @return Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    public Integer minGuestCpuCount() {
        return this.minGuestCpuCount;
    }
    /**
     * @return Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    public Integer minMemoryMb() {
        return this.minMemoryMb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minGuestCpuCount;
        private Integer minMemoryMb;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minGuestCpuCount = defaults.minGuestCpuCount;
    	      this.minMemoryMb = defaults.minMemoryMb;
        }

        public Builder minGuestCpuCount(Integer minGuestCpuCount) {
            this.minGuestCpuCount = Objects.requireNonNull(minGuestCpuCount);
            return this;
        }
        public Builder minMemoryMb(Integer minMemoryMb) {
            this.minMemoryMb = Objects.requireNonNull(minMemoryMb);
            return this;
        }        public LicenseResourceRequirementsResponse build() {
            return new LicenseResourceRequirementsResponse(minGuestCpuCount, minMemoryMb);
        }
    }
}
