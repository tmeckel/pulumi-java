// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableTargetTrackingScalingPolicyConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final GlobalTableTargetTrackingScalingPolicyConfiguration Empty = new GlobalTableTargetTrackingScalingPolicyConfiguration();

    @InputImport(name="disableScaleIn")
      private final @Nullable Boolean disableScaleIn;

    public Optional<Boolean> getDisableScaleIn() {
        return this.disableScaleIn == null ? Optional.empty() : Optional.ofNullable(this.disableScaleIn);
    }

    @InputImport(name="scaleInCooldown")
      private final @Nullable Integer scaleInCooldown;

    public Optional<Integer> getScaleInCooldown() {
        return this.scaleInCooldown == null ? Optional.empty() : Optional.ofNullable(this.scaleInCooldown);
    }

    @InputImport(name="scaleOutCooldown")
      private final @Nullable Integer scaleOutCooldown;

    public Optional<Integer> getScaleOutCooldown() {
        return this.scaleOutCooldown == null ? Optional.empty() : Optional.ofNullable(this.scaleOutCooldown);
    }

    @InputImport(name="targetValue", required=true)
      private final Double targetValue;

    public Double getTargetValue() {
        return this.targetValue;
    }

    public GlobalTableTargetTrackingScalingPolicyConfiguration(
        @Nullable Boolean disableScaleIn,
        @Nullable Integer scaleInCooldown,
        @Nullable Integer scaleOutCooldown,
        Double targetValue) {
        this.disableScaleIn = disableScaleIn;
        this.scaleInCooldown = scaleInCooldown;
        this.scaleOutCooldown = scaleOutCooldown;
        this.targetValue = Objects.requireNonNull(targetValue, "expected parameter 'targetValue' to be non-null");
    }

    private GlobalTableTargetTrackingScalingPolicyConfiguration() {
        this.disableScaleIn = null;
        this.scaleInCooldown = null;
        this.scaleOutCooldown = null;
        this.targetValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableTargetTrackingScalingPolicyConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableScaleIn;
        private @Nullable Integer scaleInCooldown;
        private @Nullable Integer scaleOutCooldown;
        private Double targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableTargetTrackingScalingPolicyConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableScaleIn = defaults.disableScaleIn;
    	      this.scaleInCooldown = defaults.scaleInCooldown;
    	      this.scaleOutCooldown = defaults.scaleOutCooldown;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder disableScaleIn(@Nullable Boolean disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }

        public Builder scaleInCooldown(@Nullable Integer scaleInCooldown) {
            this.scaleInCooldown = scaleInCooldown;
            return this;
        }

        public Builder scaleOutCooldown(@Nullable Integer scaleOutCooldown) {
            this.scaleOutCooldown = scaleOutCooldown;
            return this;
        }

        public Builder targetValue(Double targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }
        public GlobalTableTargetTrackingScalingPolicyConfiguration build() {
            return new GlobalTableTargetTrackingScalingPolicyConfiguration(disableScaleIn, scaleInCooldown, scaleOutCooldown, targetValue);
        }
    }
}
