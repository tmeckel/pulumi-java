// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AKSServiceResponseResponseLivenessProbeRequirements {
    private final @Nullable Integer failureThreshold;
    private final @Nullable Integer initialDelaySeconds;
    private final @Nullable Integer periodSeconds;
    private final @Nullable Integer successThreshold;
    private final @Nullable Integer timeoutSeconds;

    @OutputCustomType.Constructor({"failureThreshold","initialDelaySeconds","periodSeconds","successThreshold","timeoutSeconds"})
    private AKSServiceResponseResponseLivenessProbeRequirements(
        @Nullable Integer failureThreshold,
        @Nullable Integer initialDelaySeconds,
        @Nullable Integer periodSeconds,
        @Nullable Integer successThreshold,
        @Nullable Integer timeoutSeconds) {
        this.failureThreshold = failureThreshold;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.timeoutSeconds = timeoutSeconds;
    }

    public Optional<Integer> getFailureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    public Optional<Integer> getInitialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    public Optional<Integer> getPeriodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    public Optional<Integer> getSuccessThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    public Optional<Integer> getTimeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceResponseResponseLivenessProbeRequirements defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failureThreshold;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceResponseResponseLivenessProbeRequirements defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setInitialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        public Builder setPeriodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public AKSServiceResponseResponseLivenessProbeRequirements build() {
            return new AKSServiceResponseResponseLivenessProbeRequirements(failureThreshold, initialDelaySeconds, periodSeconds, successThreshold, timeoutSeconds);
        }
    }
}
