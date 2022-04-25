// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupInstanceRefreshPreferences {
    /**
     * @return The number of seconds to wait after a checkpoint. Defaults to `3600`.
     * 
     */
    private final @Nullable String checkpointDelay;
    /**
     * @return List of percentages for each checkpoint. Values must be unique and in ascending order. To replace all instances, the final number must be `100`.
     * 
     */
    private final @Nullable List<Integer> checkpointPercentages;
    /**
     * @return The number of seconds until a newly launched instance is configured and ready to use. Default behavior is to use the Auto Scaling Group&#39;s health check grace period.
     * 
     */
    private final @Nullable String instanceWarmup;
    /**
     * @return The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group. Defaults to `90`.
     * 
     */
    private final @Nullable Integer minHealthyPercentage;

    @CustomType.Constructor
    private GroupInstanceRefreshPreferences(
        @CustomType.Parameter("checkpointDelay") @Nullable String checkpointDelay,
        @CustomType.Parameter("checkpointPercentages") @Nullable List<Integer> checkpointPercentages,
        @CustomType.Parameter("instanceWarmup") @Nullable String instanceWarmup,
        @CustomType.Parameter("minHealthyPercentage") @Nullable Integer minHealthyPercentage) {
        this.checkpointDelay = checkpointDelay;
        this.checkpointPercentages = checkpointPercentages;
        this.instanceWarmup = instanceWarmup;
        this.minHealthyPercentage = minHealthyPercentage;
    }

    /**
     * @return The number of seconds to wait after a checkpoint. Defaults to `3600`.
     * 
     */
    public Optional<String> checkpointDelay() {
        return Optional.ofNullable(this.checkpointDelay);
    }
    /**
     * @return List of percentages for each checkpoint. Values must be unique and in ascending order. To replace all instances, the final number must be `100`.
     * 
     */
    public List<Integer> checkpointPercentages() {
        return this.checkpointPercentages == null ? List.of() : this.checkpointPercentages;
    }
    /**
     * @return The number of seconds until a newly launched instance is configured and ready to use. Default behavior is to use the Auto Scaling Group&#39;s health check grace period.
     * 
     */
    public Optional<String> instanceWarmup() {
        return Optional.ofNullable(this.instanceWarmup);
    }
    /**
     * @return The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group. Defaults to `90`.
     * 
     */
    public Optional<Integer> minHealthyPercentage() {
        return Optional.ofNullable(this.minHealthyPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInstanceRefreshPreferences defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String checkpointDelay;
        private @Nullable List<Integer> checkpointPercentages;
        private @Nullable String instanceWarmup;
        private @Nullable Integer minHealthyPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupInstanceRefreshPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointDelay = defaults.checkpointDelay;
    	      this.checkpointPercentages = defaults.checkpointPercentages;
    	      this.instanceWarmup = defaults.instanceWarmup;
    	      this.minHealthyPercentage = defaults.minHealthyPercentage;
        }

        public Builder checkpointDelay(@Nullable String checkpointDelay) {
            this.checkpointDelay = checkpointDelay;
            return this;
        }
        public Builder checkpointPercentages(@Nullable List<Integer> checkpointPercentages) {
            this.checkpointPercentages = checkpointPercentages;
            return this;
        }
        public Builder checkpointPercentages(Integer... checkpointPercentages) {
            return checkpointPercentages(List.of(checkpointPercentages));
        }
        public Builder instanceWarmup(@Nullable String instanceWarmup) {
            this.instanceWarmup = instanceWarmup;
            return this;
        }
        public Builder minHealthyPercentage(@Nullable Integer minHealthyPercentage) {
            this.minHealthyPercentage = minHealthyPercentage;
            return this;
        }        public GroupInstanceRefreshPreferences build() {
            return new GroupInstanceRefreshPreferences(checkpointDelay, checkpointPercentages, instanceWarmup, minHealthyPercentage);
        }
    }
}
