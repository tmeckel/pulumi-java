// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceOutlierDetectionBaseEjectionTime;
import io.pulumi.gcp.compute.outputs.RegionBackendServiceOutlierDetectionInterval;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionBackendServiceOutlierDetection {
    /**
     * The base time that a host is ejected for. The real time is equal to the base
     * time multiplied by the number of times the host has been ejected. Defaults to
     * 30000ms or 30s.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionBackendServiceOutlierDetectionBaseEjectionTime baseEjectionTime;
    /**
     * Number of errors before a host is ejected from the connection pool. When the
     * backend host is accessed over HTTP, a 5xx return code qualifies as an error.
     * Defaults to 5.
     * 
     */
    private final @Nullable Integer consecutiveErrors;
    /**
     * The number of consecutive gateway failures (502, 503, 504 status or connection
     * errors that are mapped to one of those status codes) before a consecutive
     * gateway failure ejection occurs. Defaults to 5.
     * 
     */
    private final @Nullable Integer consecutiveGatewayFailure;
    /**
     * The percentage chance that a host will be actually ejected when an outlier
     * status is detected through consecutive 5xx. This setting can be used to disable
     * ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    private final @Nullable Integer enforcingConsecutiveErrors;
    /**
     * The percentage chance that a host will be actually ejected when an outlier
     * status is detected through consecutive gateway failures. This setting can be
     * used to disable ejection or to ramp it up slowly. Defaults to 0.
     * 
     */
    private final @Nullable Integer enforcingConsecutiveGatewayFailure;
    /**
     * The percentage chance that a host will be actually ejected when an outlier
     * status is detected through success rate statistics. This setting can be used to
     * disable ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    private final @Nullable Integer enforcingSuccessRate;
    /**
     * Time interval between ejection sweep analysis. This can result in both new
     * ejections as well as hosts being returned to service. Defaults to 10 seconds.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionBackendServiceOutlierDetectionInterval interval;
    /**
     * Maximum percentage of hosts in the load balancing pool for the backend service
     * that can be ejected. Defaults to 10%.
     * 
     */
    private final @Nullable Integer maxEjectionPercent;
    /**
     * The number of hosts in a cluster that must have enough request volume to detect
     * success rate outliers. If the number of hosts is less than this setting, outlier
     * detection via success rate statistics is not performed for any host in the
     * cluster. Defaults to 5.
     * 
     */
    private final @Nullable Integer successRateMinimumHosts;
    /**
     * The minimum number of total requests that must be collected in one interval (as
     * defined by the interval duration above) to include this host in success rate
     * based outlier detection. If the volume is lower than this setting, outlier
     * detection via success rate statistics is not performed for that host. Defaults
     * to 100.
     * 
     */
    private final @Nullable Integer successRateRequestVolume;
    /**
     * This factor is used to determine the ejection threshold for success rate outlier
     * ejection. The ejection threshold is the difference between the mean success
     * rate, and the product of this factor and the standard deviation of the mean
     * success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided
     * by a thousand to get a double. That is, if the desired factor is 1.9, the
     * runtime value should be 1900. Defaults to 1900.
     * 
     */
    private final @Nullable Integer successRateStdevFactor;

    @OutputCustomType.Constructor
    private RegionBackendServiceOutlierDetection(
        @OutputCustomType.Parameter("baseEjectionTime") @Nullable RegionBackendServiceOutlierDetectionBaseEjectionTime baseEjectionTime,
        @OutputCustomType.Parameter("consecutiveErrors") @Nullable Integer consecutiveErrors,
        @OutputCustomType.Parameter("consecutiveGatewayFailure") @Nullable Integer consecutiveGatewayFailure,
        @OutputCustomType.Parameter("enforcingConsecutiveErrors") @Nullable Integer enforcingConsecutiveErrors,
        @OutputCustomType.Parameter("enforcingConsecutiveGatewayFailure") @Nullable Integer enforcingConsecutiveGatewayFailure,
        @OutputCustomType.Parameter("enforcingSuccessRate") @Nullable Integer enforcingSuccessRate,
        @OutputCustomType.Parameter("interval") @Nullable RegionBackendServiceOutlierDetectionInterval interval,
        @OutputCustomType.Parameter("maxEjectionPercent") @Nullable Integer maxEjectionPercent,
        @OutputCustomType.Parameter("successRateMinimumHosts") @Nullable Integer successRateMinimumHosts,
        @OutputCustomType.Parameter("successRateRequestVolume") @Nullable Integer successRateRequestVolume,
        @OutputCustomType.Parameter("successRateStdevFactor") @Nullable Integer successRateStdevFactor) {
        this.baseEjectionTime = baseEjectionTime;
        this.consecutiveErrors = consecutiveErrors;
        this.consecutiveGatewayFailure = consecutiveGatewayFailure;
        this.enforcingConsecutiveErrors = enforcingConsecutiveErrors;
        this.enforcingConsecutiveGatewayFailure = enforcingConsecutiveGatewayFailure;
        this.enforcingSuccessRate = enforcingSuccessRate;
        this.interval = interval;
        this.maxEjectionPercent = maxEjectionPercent;
        this.successRateMinimumHosts = successRateMinimumHosts;
        this.successRateRequestVolume = successRateRequestVolume;
        this.successRateStdevFactor = successRateStdevFactor;
    }

    /**
     * The base time that a host is ejected for. The real time is equal to the base
     * time multiplied by the number of times the host has been ejected. Defaults to
     * 30000ms or 30s.
     * Structure is documented below.
     * 
    */
    public Optional<RegionBackendServiceOutlierDetectionBaseEjectionTime> getBaseEjectionTime() {
        return Optional.ofNullable(this.baseEjectionTime);
    }
    /**
     * Number of errors before a host is ejected from the connection pool. When the
     * backend host is accessed over HTTP, a 5xx return code qualifies as an error.
     * Defaults to 5.
     * 
    */
    public Optional<Integer> getConsecutiveErrors() {
        return Optional.ofNullable(this.consecutiveErrors);
    }
    /**
     * The number of consecutive gateway failures (502, 503, 504 status or connection
     * errors that are mapped to one of those status codes) before a consecutive
     * gateway failure ejection occurs. Defaults to 5.
     * 
    */
    public Optional<Integer> getConsecutiveGatewayFailure() {
        return Optional.ofNullable(this.consecutiveGatewayFailure);
    }
    /**
     * The percentage chance that a host will be actually ejected when an outlier
     * status is detected through consecutive 5xx. This setting can be used to disable
     * ejection or to ramp it up slowly. Defaults to 100.
     * 
    */
    public Optional<Integer> getEnforcingConsecutiveErrors() {
        return Optional.ofNullable(this.enforcingConsecutiveErrors);
    }
    /**
     * The percentage chance that a host will be actually ejected when an outlier
     * status is detected through consecutive gateway failures. This setting can be
     * used to disable ejection or to ramp it up slowly. Defaults to 0.
     * 
    */
    public Optional<Integer> getEnforcingConsecutiveGatewayFailure() {
        return Optional.ofNullable(this.enforcingConsecutiveGatewayFailure);
    }
    /**
     * The percentage chance that a host will be actually ejected when an outlier
     * status is detected through success rate statistics. This setting can be used to
     * disable ejection or to ramp it up slowly. Defaults to 100.
     * 
    */
    public Optional<Integer> getEnforcingSuccessRate() {
        return Optional.ofNullable(this.enforcingSuccessRate);
    }
    /**
     * Time interval between ejection sweep analysis. This can result in both new
     * ejections as well as hosts being returned to service. Defaults to 10 seconds.
     * Structure is documented below.
     * 
    */
    public Optional<RegionBackendServiceOutlierDetectionInterval> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * Maximum percentage of hosts in the load balancing pool for the backend service
     * that can be ejected. Defaults to 10%.
     * 
    */
    public Optional<Integer> getMaxEjectionPercent() {
        return Optional.ofNullable(this.maxEjectionPercent);
    }
    /**
     * The number of hosts in a cluster that must have enough request volume to detect
     * success rate outliers. If the number of hosts is less than this setting, outlier
     * detection via success rate statistics is not performed for any host in the
     * cluster. Defaults to 5.
     * 
    */
    public Optional<Integer> getSuccessRateMinimumHosts() {
        return Optional.ofNullable(this.successRateMinimumHosts);
    }
    /**
     * The minimum number of total requests that must be collected in one interval (as
     * defined by the interval duration above) to include this host in success rate
     * based outlier detection. If the volume is lower than this setting, outlier
     * detection via success rate statistics is not performed for that host. Defaults
     * to 100.
     * 
    */
    public Optional<Integer> getSuccessRateRequestVolume() {
        return Optional.ofNullable(this.successRateRequestVolume);
    }
    /**
     * This factor is used to determine the ejection threshold for success rate outlier
     * ejection. The ejection threshold is the difference between the mean success
     * rate, and the product of this factor and the standard deviation of the mean
     * success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided
     * by a thousand to get a double. That is, if the desired factor is 1.9, the
     * runtime value should be 1900. Defaults to 1900.
     * 
    */
    public Optional<Integer> getSuccessRateStdevFactor() {
        return Optional.ofNullable(this.successRateStdevFactor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceOutlierDetection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionBackendServiceOutlierDetectionBaseEjectionTime baseEjectionTime;
        private @Nullable Integer consecutiveErrors;
        private @Nullable Integer consecutiveGatewayFailure;
        private @Nullable Integer enforcingConsecutiveErrors;
        private @Nullable Integer enforcingConsecutiveGatewayFailure;
        private @Nullable Integer enforcingSuccessRate;
        private @Nullable RegionBackendServiceOutlierDetectionInterval interval;
        private @Nullable Integer maxEjectionPercent;
        private @Nullable Integer successRateMinimumHosts;
        private @Nullable Integer successRateRequestVolume;
        private @Nullable Integer successRateStdevFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceOutlierDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEjectionTime = defaults.baseEjectionTime;
    	      this.consecutiveErrors = defaults.consecutiveErrors;
    	      this.consecutiveGatewayFailure = defaults.consecutiveGatewayFailure;
    	      this.enforcingConsecutiveErrors = defaults.enforcingConsecutiveErrors;
    	      this.enforcingConsecutiveGatewayFailure = defaults.enforcingConsecutiveGatewayFailure;
    	      this.enforcingSuccessRate = defaults.enforcingSuccessRate;
    	      this.interval = defaults.interval;
    	      this.maxEjectionPercent = defaults.maxEjectionPercent;
    	      this.successRateMinimumHosts = defaults.successRateMinimumHosts;
    	      this.successRateRequestVolume = defaults.successRateRequestVolume;
    	      this.successRateStdevFactor = defaults.successRateStdevFactor;
        }

        public Builder baseEjectionTime(@Nullable RegionBackendServiceOutlierDetectionBaseEjectionTime baseEjectionTime) {
            this.baseEjectionTime = baseEjectionTime;
            return this;
        }

        public Builder consecutiveErrors(@Nullable Integer consecutiveErrors) {
            this.consecutiveErrors = consecutiveErrors;
            return this;
        }

        public Builder consecutiveGatewayFailure(@Nullable Integer consecutiveGatewayFailure) {
            this.consecutiveGatewayFailure = consecutiveGatewayFailure;
            return this;
        }

        public Builder enforcingConsecutiveErrors(@Nullable Integer enforcingConsecutiveErrors) {
            this.enforcingConsecutiveErrors = enforcingConsecutiveErrors;
            return this;
        }

        public Builder enforcingConsecutiveGatewayFailure(@Nullable Integer enforcingConsecutiveGatewayFailure) {
            this.enforcingConsecutiveGatewayFailure = enforcingConsecutiveGatewayFailure;
            return this;
        }

        public Builder enforcingSuccessRate(@Nullable Integer enforcingSuccessRate) {
            this.enforcingSuccessRate = enforcingSuccessRate;
            return this;
        }

        public Builder interval(@Nullable RegionBackendServiceOutlierDetectionInterval interval) {
            this.interval = interval;
            return this;
        }

        public Builder maxEjectionPercent(@Nullable Integer maxEjectionPercent) {
            this.maxEjectionPercent = maxEjectionPercent;
            return this;
        }

        public Builder successRateMinimumHosts(@Nullable Integer successRateMinimumHosts) {
            this.successRateMinimumHosts = successRateMinimumHosts;
            return this;
        }

        public Builder successRateRequestVolume(@Nullable Integer successRateRequestVolume) {
            this.successRateRequestVolume = successRateRequestVolume;
            return this;
        }

        public Builder successRateStdevFactor(@Nullable Integer successRateStdevFactor) {
            this.successRateStdevFactor = successRateStdevFactor;
            return this;
        }
        public RegionBackendServiceOutlierDetection build() {
            return new RegionBackendServiceOutlierDetection(baseEjectionTime, consecutiveErrors, consecutiveGatewayFailure, enforcingConsecutiveErrors, enforcingConsecutiveGatewayFailure, enforcingSuccessRate, interval, maxEjectionPercent, successRateMinimumHosts, successRateRequestVolume, successRateStdevFactor);
        }
    }
}
