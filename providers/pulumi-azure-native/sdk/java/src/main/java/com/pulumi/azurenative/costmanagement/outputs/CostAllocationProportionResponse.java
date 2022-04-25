// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CostAllocationProportionResponse {
    /**
     * @return Target resource for cost allocation
     * 
     */
    private final String name;
    /**
     * @return Percentage of source cost to allocate to this resource. This value can be specified to two decimal places and the total percentage of all resources in this rule must sum to 100.00.
     * 
     */
    private final Double percentage;

    @CustomType.Constructor
    private CostAllocationProportionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("percentage") Double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    /**
     * @return Target resource for cost allocation
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Percentage of source cost to allocate to this resource. This value can be specified to two decimal places and the total percentage of all resources in this rule must sum to 100.00.
     * 
     */
    public Double percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostAllocationProportionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(CostAllocationProportionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.percentage = defaults.percentage;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder percentage(Double percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }        public CostAllocationProportionResponse build() {
            return new CostAllocationProportionResponse(name, percentage);
        }
    }
}
