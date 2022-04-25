// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.jobs_v3.inputs.MoneyResponse;
import java.util.Objects;


/**
 * Compensation range.
 * 
 */
public final class CompensationRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final CompensationRangeResponse Empty = new CompensationRangeResponse();

    /**
     * Optional. The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
     * 
     */
    @Import(name="maxCompensation", required=true)
    private MoneyResponse maxCompensation;

    /**
     * @return Optional. The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
     * 
     */
    public MoneyResponse maxCompensation() {
        return this.maxCompensation;
    }

    /**
     * Optional. The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
     * 
     */
    @Import(name="minCompensation", required=true)
    private MoneyResponse minCompensation;

    /**
     * @return Optional. The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
     * 
     */
    public MoneyResponse minCompensation() {
        return this.minCompensation;
    }

    private CompensationRangeResponse() {}

    private CompensationRangeResponse(CompensationRangeResponse $) {
        this.maxCompensation = $.maxCompensation;
        this.minCompensation = $.minCompensation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompensationRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompensationRangeResponse $;

        public Builder() {
            $ = new CompensationRangeResponse();
        }

        public Builder(CompensationRangeResponse defaults) {
            $ = new CompensationRangeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxCompensation Optional. The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
         * 
         * @return builder
         * 
         */
        public Builder maxCompensation(MoneyResponse maxCompensation) {
            $.maxCompensation = maxCompensation;
            return this;
        }

        /**
         * @param minCompensation Optional. The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
         * 
         * @return builder
         * 
         */
        public Builder minCompensation(MoneyResponse minCompensation) {
            $.minCompensation = minCompensation;
            return this;
        }

        public CompensationRangeResponse build() {
            $.maxCompensation = Objects.requireNonNull($.maxCompensation, "expected parameter 'maxCompensation' to be non-null");
            $.minCompensation = Objects.requireNonNull($.minCompensation, "expected parameter 'minCompensation' to be non-null");
            return $;
        }
    }

}
