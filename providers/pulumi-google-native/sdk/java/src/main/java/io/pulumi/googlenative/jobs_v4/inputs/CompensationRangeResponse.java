// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.jobs_v4.inputs.MoneyResponse;
import java.util.Objects;


/**
 * Compensation range.
 * 
 */
public final class CompensationRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final CompensationRangeResponse Empty = new CompensationRangeResponse();

    /**
     * The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
     * 
     */
    @InputImport(name="maxCompensation", required=true)
    private final MoneyResponse maxCompensation;

    public MoneyResponse getMaxCompensation() {
        return this.maxCompensation;
    }

    /**
     * The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
     * 
     */
    @InputImport(name="minCompensation", required=true)
    private final MoneyResponse minCompensation;

    public MoneyResponse getMinCompensation() {
        return this.minCompensation;
    }

    public CompensationRangeResponse(
        MoneyResponse maxCompensation,
        MoneyResponse minCompensation) {
        this.maxCompensation = Objects.requireNonNull(maxCompensation, "expected parameter 'maxCompensation' to be non-null");
        this.minCompensation = Objects.requireNonNull(minCompensation, "expected parameter 'minCompensation' to be non-null");
    }

    private CompensationRangeResponse() {
        this.maxCompensation = null;
        this.minCompensation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoneyResponse maxCompensation;
        private MoneyResponse minCompensation;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCompensation = defaults.maxCompensation;
    	      this.minCompensation = defaults.minCompensation;
        }

        public Builder setMaxCompensation(MoneyResponse maxCompensation) {
            this.maxCompensation = Objects.requireNonNull(maxCompensation);
            return this;
        }

        public Builder setMinCompensation(MoneyResponse minCompensation) {
            this.minCompensation = Objects.requireNonNull(minCompensation);
            return this;
        }

        public CompensationRangeResponse build() {
            return new CompensationRangeResponse(maxCompensation, minCompensation);
        }
    }
}
