// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SaasPropertiesResponseTerm {
    /**
     * The end date of the current term
     * 
     */
    private final @Nullable String endDate;
    /**
     * The start date of the current term
     * 
     */
    private final @Nullable String startDate;
    /**
     * The unit indicating Monthly / Yearly
     * 
     */
    private final @Nullable String termUnit;

    @OutputCustomType.Constructor
    private SaasPropertiesResponseTerm(
        @OutputCustomType.Parameter("endDate") @Nullable String endDate,
        @OutputCustomType.Parameter("startDate") @Nullable String startDate,
        @OutputCustomType.Parameter("termUnit") @Nullable String termUnit) {
        this.endDate = endDate;
        this.startDate = startDate;
        this.termUnit = termUnit;
    }

    /**
     * The end date of the current term
     * 
    */
    public Optional<String> getEndDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * The start date of the current term
     * 
    */
    public Optional<String> getStartDate() {
        return Optional.ofNullable(this.startDate);
    }
    /**
     * The unit indicating Monthly / Yearly
     * 
    */
    public Optional<String> getTermUnit() {
        return Optional.ofNullable(this.termUnit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SaasPropertiesResponseTerm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endDate;
        private @Nullable String startDate;
        private @Nullable String termUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(SaasPropertiesResponseTerm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
    	      this.termUnit = defaults.termUnit;
        }

        public Builder endDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder startDate(@Nullable String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder termUnit(@Nullable String termUnit) {
            this.termUnit = termUnit;
            return this;
        }
        public SaasPropertiesResponseTerm build() {
            return new SaasPropertiesResponseTerm(endDate, startDate, termUnit);
        }
    }
}
