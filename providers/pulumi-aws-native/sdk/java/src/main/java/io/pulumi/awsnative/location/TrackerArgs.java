// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location;

import io.pulumi.awsnative.location.enums.TrackerPositionFiltering;
import io.pulumi.awsnative.location.enums.TrackerPricingPlan;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrackerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrackerArgs Empty = new TrackerArgs();

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    @InputImport(name="positionFiltering")
      private final @Nullable Input<TrackerPositionFiltering> positionFiltering;

    public Input<TrackerPositionFiltering> getPositionFiltering() {
        return this.positionFiltering == null ? Input.empty() : this.positionFiltering;
    }

    @InputImport(name="pricingPlan")
      private final @Nullable Input<TrackerPricingPlan> pricingPlan;

    public Input<TrackerPricingPlan> getPricingPlan() {
        return this.pricingPlan == null ? Input.empty() : this.pricingPlan;
    }

    @InputImport(name="pricingPlanDataSource")
      private final @Nullable Input<String> pricingPlanDataSource;

    public Input<String> getPricingPlanDataSource() {
        return this.pricingPlanDataSource == null ? Input.empty() : this.pricingPlanDataSource;
    }

    @InputImport(name="trackerName")
      private final @Nullable Input<String> trackerName;

    public Input<String> getTrackerName() {
        return this.trackerName == null ? Input.empty() : this.trackerName;
    }

    public TrackerArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<TrackerPositionFiltering> positionFiltering,
        @Nullable Input<TrackerPricingPlan> pricingPlan,
        @Nullable Input<String> pricingPlanDataSource,
        @Nullable Input<String> trackerName) {
        this.description = description;
        this.kmsKeyId = kmsKeyId;
        this.positionFiltering = positionFiltering;
        this.pricingPlan = pricingPlan;
        this.pricingPlanDataSource = pricingPlanDataSource;
        this.trackerName = trackerName;
    }

    private TrackerArgs() {
        this.description = Input.empty();
        this.kmsKeyId = Input.empty();
        this.positionFiltering = Input.empty();
        this.pricingPlan = Input.empty();
        this.pricingPlanDataSource = Input.empty();
        this.trackerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrackerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<TrackerPositionFiltering> positionFiltering;
        private @Nullable Input<TrackerPricingPlan> pricingPlan;
        private @Nullable Input<String> pricingPlanDataSource;
        private @Nullable Input<String> trackerName;

        public Builder() {
    	      // Empty
        }

        public Builder(TrackerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.positionFiltering = defaults.positionFiltering;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.pricingPlanDataSource = defaults.pricingPlanDataSource;
    	      this.trackerName = defaults.trackerName;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder kmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder positionFiltering(@Nullable Input<TrackerPositionFiltering> positionFiltering) {
            this.positionFiltering = positionFiltering;
            return this;
        }

        public Builder positionFiltering(@Nullable TrackerPositionFiltering positionFiltering) {
            this.positionFiltering = Input.ofNullable(positionFiltering);
            return this;
        }

        public Builder pricingPlan(@Nullable Input<TrackerPricingPlan> pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }

        public Builder pricingPlan(@Nullable TrackerPricingPlan pricingPlan) {
            this.pricingPlan = Input.ofNullable(pricingPlan);
            return this;
        }

        public Builder pricingPlanDataSource(@Nullable Input<String> pricingPlanDataSource) {
            this.pricingPlanDataSource = pricingPlanDataSource;
            return this;
        }

        public Builder pricingPlanDataSource(@Nullable String pricingPlanDataSource) {
            this.pricingPlanDataSource = Input.ofNullable(pricingPlanDataSource);
            return this;
        }

        public Builder trackerName(@Nullable Input<String> trackerName) {
            this.trackerName = trackerName;
            return this;
        }

        public Builder trackerName(@Nullable String trackerName) {
            this.trackerName = Input.ofNullable(trackerName);
            return this;
        }
        public TrackerArgs build() {
            return new TrackerArgs(description, kmsKeyId, positionFiltering, pricingPlan, pricingPlanDataSource, trackerName);
        }
    }
}
