// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RollingUpgradePolicyResponse {
    /**
     * @return Allow VMSS to ignore AZ boundaries when constructing upgrade batches. Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size.
     * 
     */
    private final @Nullable Boolean enableCrossZoneUpgrade;
    /**
     * @return The maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher reliability. The default value for this parameter is 20%.
     * 
     */
    private final @Nullable Integer maxBatchInstancePercent;
    /**
     * @return The maximum percentage of the total virtual machine instances in the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch. The default value for this parameter is 20%.
     * 
     */
    private final @Nullable Integer maxUnhealthyInstancePercent;
    /**
     * @return The maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts. The default value for this parameter is 20%.
     * 
     */
    private final @Nullable Integer maxUnhealthyUpgradedInstancePercent;
    /**
     * @return The wait time between completing the update for all virtual machines in one batch and starting the next batch. The time duration should be specified in ISO 8601 format. The default value is 0 seconds (PT0S).
     * 
     */
    private final @Nullable String pauseTimeBetweenBatches;
    /**
     * @return Upgrade all unhealthy instances in a scale set before any healthy instances.
     * 
     */
    private final @Nullable Boolean prioritizeUnhealthyInstances;

    @CustomType.Constructor
    private RollingUpgradePolicyResponse(
        @CustomType.Parameter("enableCrossZoneUpgrade") @Nullable Boolean enableCrossZoneUpgrade,
        @CustomType.Parameter("maxBatchInstancePercent") @Nullable Integer maxBatchInstancePercent,
        @CustomType.Parameter("maxUnhealthyInstancePercent") @Nullable Integer maxUnhealthyInstancePercent,
        @CustomType.Parameter("maxUnhealthyUpgradedInstancePercent") @Nullable Integer maxUnhealthyUpgradedInstancePercent,
        @CustomType.Parameter("pauseTimeBetweenBatches") @Nullable String pauseTimeBetweenBatches,
        @CustomType.Parameter("prioritizeUnhealthyInstances") @Nullable Boolean prioritizeUnhealthyInstances) {
        this.enableCrossZoneUpgrade = enableCrossZoneUpgrade;
        this.maxBatchInstancePercent = maxBatchInstancePercent;
        this.maxUnhealthyInstancePercent = maxUnhealthyInstancePercent;
        this.maxUnhealthyUpgradedInstancePercent = maxUnhealthyUpgradedInstancePercent;
        this.pauseTimeBetweenBatches = pauseTimeBetweenBatches;
        this.prioritizeUnhealthyInstances = prioritizeUnhealthyInstances;
    }

    /**
     * @return Allow VMSS to ignore AZ boundaries when constructing upgrade batches. Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size.
     * 
     */
    public Optional<Boolean> enableCrossZoneUpgrade() {
        return Optional.ofNullable(this.enableCrossZoneUpgrade);
    }
    /**
     * @return The maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher reliability. The default value for this parameter is 20%.
     * 
     */
    public Optional<Integer> maxBatchInstancePercent() {
        return Optional.ofNullable(this.maxBatchInstancePercent);
    }
    /**
     * @return The maximum percentage of the total virtual machine instances in the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch. The default value for this parameter is 20%.
     * 
     */
    public Optional<Integer> maxUnhealthyInstancePercent() {
        return Optional.ofNullable(this.maxUnhealthyInstancePercent);
    }
    /**
     * @return The maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts. The default value for this parameter is 20%.
     * 
     */
    public Optional<Integer> maxUnhealthyUpgradedInstancePercent() {
        return Optional.ofNullable(this.maxUnhealthyUpgradedInstancePercent);
    }
    /**
     * @return The wait time between completing the update for all virtual machines in one batch and starting the next batch. The time duration should be specified in ISO 8601 format. The default value is 0 seconds (PT0S).
     * 
     */
    public Optional<String> pauseTimeBetweenBatches() {
        return Optional.ofNullable(this.pauseTimeBetweenBatches);
    }
    /**
     * @return Upgrade all unhealthy instances in a scale set before any healthy instances.
     * 
     */
    public Optional<Boolean> prioritizeUnhealthyInstances() {
        return Optional.ofNullable(this.prioritizeUnhealthyInstances);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableCrossZoneUpgrade;
        private @Nullable Integer maxBatchInstancePercent;
        private @Nullable Integer maxUnhealthyInstancePercent;
        private @Nullable Integer maxUnhealthyUpgradedInstancePercent;
        private @Nullable String pauseTimeBetweenBatches;
        private @Nullable Boolean prioritizeUnhealthyInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpgradePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCrossZoneUpgrade = defaults.enableCrossZoneUpgrade;
    	      this.maxBatchInstancePercent = defaults.maxBatchInstancePercent;
    	      this.maxUnhealthyInstancePercent = defaults.maxUnhealthyInstancePercent;
    	      this.maxUnhealthyUpgradedInstancePercent = defaults.maxUnhealthyUpgradedInstancePercent;
    	      this.pauseTimeBetweenBatches = defaults.pauseTimeBetweenBatches;
    	      this.prioritizeUnhealthyInstances = defaults.prioritizeUnhealthyInstances;
        }

        public Builder enableCrossZoneUpgrade(@Nullable Boolean enableCrossZoneUpgrade) {
            this.enableCrossZoneUpgrade = enableCrossZoneUpgrade;
            return this;
        }
        public Builder maxBatchInstancePercent(@Nullable Integer maxBatchInstancePercent) {
            this.maxBatchInstancePercent = maxBatchInstancePercent;
            return this;
        }
        public Builder maxUnhealthyInstancePercent(@Nullable Integer maxUnhealthyInstancePercent) {
            this.maxUnhealthyInstancePercent = maxUnhealthyInstancePercent;
            return this;
        }
        public Builder maxUnhealthyUpgradedInstancePercent(@Nullable Integer maxUnhealthyUpgradedInstancePercent) {
            this.maxUnhealthyUpgradedInstancePercent = maxUnhealthyUpgradedInstancePercent;
            return this;
        }
        public Builder pauseTimeBetweenBatches(@Nullable String pauseTimeBetweenBatches) {
            this.pauseTimeBetweenBatches = pauseTimeBetweenBatches;
            return this;
        }
        public Builder prioritizeUnhealthyInstances(@Nullable Boolean prioritizeUnhealthyInstances) {
            this.prioritizeUnhealthyInstances = prioritizeUnhealthyInstances;
            return this;
        }        public RollingUpgradePolicyResponse build() {
            return new RollingUpgradePolicyResponse(enableCrossZoneUpgrade, maxBatchInstancePercent, maxUnhealthyInstancePercent, maxUnhealthyUpgradedInstancePercent, pauseTimeBetweenBatches, prioritizeUnhealthyInstances);
        }
    }
}
