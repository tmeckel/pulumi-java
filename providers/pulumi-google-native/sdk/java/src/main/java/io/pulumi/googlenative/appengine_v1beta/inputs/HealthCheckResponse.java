// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances. Only applicable for instances in App Engine flexible environment.
 * 
 */
public final class HealthCheckResponse extends io.pulumi.resources.InvokeArgs {

    public static final HealthCheckResponse Empty = new HealthCheckResponse();

    /**
     * Interval between health checks.
     * 
     */
    @InputImport(name="checkInterval", required=true)
    private final String checkInterval;

    public String getCheckInterval() {
        return this.checkInterval;
    }

    /**
     * Whether to explicitly disable health checks for this instance.
     * 
     */
    @InputImport(name="disableHealthCheck", required=true)
    private final Boolean disableHealthCheck;

    public Boolean getDisableHealthCheck() {
        return this.disableHealthCheck;
    }

    /**
     * Number of consecutive successful health checks required before receiving traffic.
     * 
     */
    @InputImport(name="healthyThreshold", required=true)
    private final Integer healthyThreshold;

    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * Host header to send when performing an HTTP health check. Example: "myapp.appspot.com"
     * 
     */
    @InputImport(name="host", required=true)
    private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * Number of consecutive failed health checks required before an instance is restarted.
     * 
     */
    @InputImport(name="restartThreshold", required=true)
    private final Integer restartThreshold;

    public Integer getRestartThreshold() {
        return this.restartThreshold;
    }

    /**
     * Time before the health check is considered failed.
     * 
     */
    @InputImport(name="timeout", required=true)
    private final String timeout;

    public String getTimeout() {
        return this.timeout;
    }

    /**
     * Number of consecutive failed health checks required before removing traffic.
     * 
     */
    @InputImport(name="unhealthyThreshold", required=true)
    private final Integer unhealthyThreshold;

    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public HealthCheckResponse(
        String checkInterval,
        Boolean disableHealthCheck,
        Integer healthyThreshold,
        String host,
        Integer restartThreshold,
        String timeout,
        Integer unhealthyThreshold) {
        this.checkInterval = Objects.requireNonNull(checkInterval, "expected parameter 'checkInterval' to be non-null");
        this.disableHealthCheck = Objects.requireNonNull(disableHealthCheck, "expected parameter 'disableHealthCheck' to be non-null");
        this.healthyThreshold = Objects.requireNonNull(healthyThreshold, "expected parameter 'healthyThreshold' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.restartThreshold = Objects.requireNonNull(restartThreshold, "expected parameter 'restartThreshold' to be non-null");
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
        this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold, "expected parameter 'unhealthyThreshold' to be non-null");
    }

    private HealthCheckResponse() {
        this.checkInterval = null;
        this.disableHealthCheck = null;
        this.healthyThreshold = null;
        this.host = null;
        this.restartThreshold = null;
        this.timeout = null;
        this.unhealthyThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checkInterval;
        private Boolean disableHealthCheck;
        private Integer healthyThreshold;
        private String host;
        private Integer restartThreshold;
        private String timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.disableHealthCheck = defaults.disableHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.host = defaults.host;
    	      this.restartThreshold = defaults.restartThreshold;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setCheckInterval(String checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }

        public Builder setDisableHealthCheck(Boolean disableHealthCheck) {
            this.disableHealthCheck = Objects.requireNonNull(disableHealthCheck);
            return this;
        }

        public Builder setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setRestartThreshold(Integer restartThreshold) {
            this.restartThreshold = Objects.requireNonNull(restartThreshold);
            return this;
        }

        public Builder setTimeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }

        public HealthCheckResponse build() {
            return new HealthCheckResponse(checkInterval, disableHealthCheck, healthyThreshold, host, restartThreshold, timeout, unhealthyThreshold);
        }
    }
}
