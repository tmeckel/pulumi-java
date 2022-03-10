// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigConfigurationGetArgs;
import io.pulumi.aws.emr.inputs.InstanceFleetInstanceTypeConfigEbsConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFleetInstanceTypeConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFleetInstanceTypeConfigGetArgs Empty = new InstanceFleetInstanceTypeConfigGetArgs();

    /**
     * The bid price for each EC2 Spot instance type as defined by `instance_type`. Expressed in USD. If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    @InputImport(name="bidPrice")
      private final @Nullable Input<String> bidPrice;

    public Input<String> getBidPrice() {
        return this.bidPrice == null ? Input.empty() : this.bidPrice;
    }

    /**
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by `instance_type`. Expressed as a number (for example, 20 specifies 20%). If neither `bid_price` nor `bid_price_as_percentage_of_on_demand_price` is provided, `bid_price_as_percentage_of_on_demand_price` defaults to 100%.
     * 
     */
    @InputImport(name="bidPriceAsPercentageOfOnDemandPrice")
      private final @Nullable Input<Double> bidPriceAsPercentageOfOnDemandPrice;

    public Input<Double> getBidPriceAsPercentageOfOnDemandPrice() {
        return this.bidPriceAsPercentageOfOnDemandPrice == null ? Input.empty() : this.bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    @InputImport(name="configurations")
      private final @Nullable Input<List<InstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations;

    public Input<List<InstanceFleetInstanceTypeConfigConfigurationGetArgs>> getConfigurations() {
        return this.configurations == null ? Input.empty() : this.configurations;
    }

    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    @InputImport(name="ebsConfigs")
      private final @Nullable Input<List<InstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs;

    public Input<List<InstanceFleetInstanceTypeConfigEbsConfigGetArgs>> getEbsConfigs() {
        return this.ebsConfigs == null ? Input.empty() : this.ebsConfigs;
    }

    /**
     * An EC2 instance type, such as m4.xlarge.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in `aws.emr.InstanceFleet`.
     * 
     */
    @InputImport(name="weightedCapacity")
      private final @Nullable Input<Integer> weightedCapacity;

    public Input<Integer> getWeightedCapacity() {
        return this.weightedCapacity == null ? Input.empty() : this.weightedCapacity;
    }

    public InstanceFleetInstanceTypeConfigGetArgs(
        @Nullable Input<String> bidPrice,
        @Nullable Input<Double> bidPriceAsPercentageOfOnDemandPrice,
        @Nullable Input<List<InstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations,
        @Nullable Input<List<InstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs,
        Input<String> instanceType,
        @Nullable Input<Integer> weightedCapacity) {
        this.bidPrice = bidPrice;
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
        this.configurations = configurations;
        this.ebsConfigs = ebsConfigs;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.weightedCapacity = weightedCapacity;
    }

    private InstanceFleetInstanceTypeConfigGetArgs() {
        this.bidPrice = Input.empty();
        this.bidPriceAsPercentageOfOnDemandPrice = Input.empty();
        this.configurations = Input.empty();
        this.ebsConfigs = Input.empty();
        this.instanceType = Input.empty();
        this.weightedCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetInstanceTypeConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bidPrice;
        private @Nullable Input<Double> bidPriceAsPercentageOfOnDemandPrice;
        private @Nullable Input<List<InstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations;
        private @Nullable Input<List<InstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs;
        private Input<String> instanceType;
        private @Nullable Input<Integer> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetInstanceTypeConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bidPrice = defaults.bidPrice;
    	      this.bidPriceAsPercentageOfOnDemandPrice = defaults.bidPriceAsPercentageOfOnDemandPrice;
    	      this.configurations = defaults.configurations;
    	      this.ebsConfigs = defaults.ebsConfigs;
    	      this.instanceType = defaults.instanceType;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder bidPrice(@Nullable Input<String> bidPrice) {
            this.bidPrice = bidPrice;
            return this;
        }

        public Builder bidPrice(@Nullable String bidPrice) {
            this.bidPrice = Input.ofNullable(bidPrice);
            return this;
        }

        public Builder bidPriceAsPercentageOfOnDemandPrice(@Nullable Input<Double> bidPriceAsPercentageOfOnDemandPrice) {
            this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
            return this;
        }

        public Builder bidPriceAsPercentageOfOnDemandPrice(@Nullable Double bidPriceAsPercentageOfOnDemandPrice) {
            this.bidPriceAsPercentageOfOnDemandPrice = Input.ofNullable(bidPriceAsPercentageOfOnDemandPrice);
            return this;
        }

        public Builder configurations(@Nullable Input<List<InstanceFleetInstanceTypeConfigConfigurationGetArgs>> configurations) {
            this.configurations = configurations;
            return this;
        }

        public Builder configurations(@Nullable List<InstanceFleetInstanceTypeConfigConfigurationGetArgs> configurations) {
            this.configurations = Input.ofNullable(configurations);
            return this;
        }

        public Builder ebsConfigs(@Nullable Input<List<InstanceFleetInstanceTypeConfigEbsConfigGetArgs>> ebsConfigs) {
            this.ebsConfigs = ebsConfigs;
            return this;
        }

        public Builder ebsConfigs(@Nullable List<InstanceFleetInstanceTypeConfigEbsConfigGetArgs> ebsConfigs) {
            this.ebsConfigs = Input.ofNullable(ebsConfigs);
            return this;
        }

        public Builder instanceType(Input<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Input.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder weightedCapacity(@Nullable Input<Integer> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(@Nullable Integer weightedCapacity) {
            this.weightedCapacity = Input.ofNullable(weightedCapacity);
            return this;
        }
        public InstanceFleetInstanceTypeConfigGetArgs build() {
            return new InstanceFleetInstanceTypeConfigGetArgs(bidPrice, bidPriceAsPercentageOfOnDemandPrice, configurations, ebsConfigs, instanceType, weightedCapacity);
        }
    }
}
