// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerHealthCheckConfig {
    /**
     * The number of consecutive health checks successes required before moving the container to the Healthy state. The default value is 2.
     * 
     */
    private final @Nullable Integer healthyThreshold;
    /**
     * The approximate interval, in seconds, between health checks of an individual container. You can specify between 5 and 300 seconds. The default value is 5.
     * 
     */
    private final @Nullable Integer intervalSeconds;
    /**
     * The path on the container on which to perform the health check. The default value is /.
     * 
     */
    private final @Nullable String path;
    /**
     * The HTTP codes to use when checking for a successful response from a container. You can specify values between 200 and 499. You can specify multiple values (for example, 200,202) or a range of values (for example, 200-299).
     * 
     */
    private final @Nullable String successCodes;
    /**
     * The amount of time, in seconds, during which no response means a failed health check. You can specify between 2 and 60 seconds. The default value is 2.
     * 
     */
    private final @Nullable Integer timeoutSeconds;
    /**
     * The number of consecutive health check failures required before moving the container to the Unhealthy state. The default value is 2.
     * 
     */
    private final @Nullable Integer unhealthyThreshold;

    @OutputCustomType.Constructor
    private ContainerHealthCheckConfig(
        @OutputCustomType.Parameter("healthyThreshold") @Nullable Integer healthyThreshold,
        @OutputCustomType.Parameter("intervalSeconds") @Nullable Integer intervalSeconds,
        @OutputCustomType.Parameter("path") @Nullable String path,
        @OutputCustomType.Parameter("successCodes") @Nullable String successCodes,
        @OutputCustomType.Parameter("timeoutSeconds") @Nullable Integer timeoutSeconds,
        @OutputCustomType.Parameter("unhealthyThreshold") @Nullable Integer unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.intervalSeconds = intervalSeconds;
        this.path = path;
        this.successCodes = successCodes;
        this.timeoutSeconds = timeoutSeconds;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * The number of consecutive health checks successes required before moving the container to the Healthy state. The default value is 2.
     * 
    */
    public Optional<Integer> getHealthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }
    /**
     * The approximate interval, in seconds, between health checks of an individual container. You can specify between 5 and 300 seconds. The default value is 5.
     * 
    */
    public Optional<Integer> getIntervalSeconds() {
        return Optional.ofNullable(this.intervalSeconds);
    }
    /**
     * The path on the container on which to perform the health check. The default value is /.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * The HTTP codes to use when checking for a successful response from a container. You can specify values between 200 and 499. You can specify multiple values (for example, 200,202) or a range of values (for example, 200-299).
     * 
    */
    public Optional<String> getSuccessCodes() {
        return Optional.ofNullable(this.successCodes);
    }
    /**
     * The amount of time, in seconds, during which no response means a failed health check. You can specify between 2 and 60 seconds. The default value is 2.
     * 
    */
    public Optional<Integer> getTimeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }
    /**
     * The number of consecutive health check failures required before moving the container to the Unhealthy state. The default value is 2.
     * 
    */
    public Optional<Integer> getUnhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerHealthCheckConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer healthyThreshold;
        private @Nullable Integer intervalSeconds;
        private @Nullable String path;
        private @Nullable String successCodes;
        private @Nullable Integer timeoutSeconds;
        private @Nullable Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerHealthCheckConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.intervalSeconds = defaults.intervalSeconds;
    	      this.path = defaults.path;
    	      this.successCodes = defaults.successCodes;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder intervalSeconds(@Nullable Integer intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder successCodes(@Nullable String successCodes) {
            this.successCodes = successCodes;
            return this;
        }

        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public ContainerHealthCheckConfig build() {
            return new ContainerHealthCheckConfig(healthyThreshold, intervalSeconds, path, successCodes, timeoutSeconds, unhealthyThreshold);
        }
    }
}
