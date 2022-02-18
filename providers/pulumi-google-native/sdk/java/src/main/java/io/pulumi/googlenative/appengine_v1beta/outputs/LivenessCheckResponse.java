// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LivenessCheckResponse {
    /**
     * Interval between health checks.
     * 
     */
    private final String checkInterval;
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy.
     * 
     */
    private final Integer failureThreshold;
    /**
     * Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com"
     * 
     */
    private final String host;
    /**
     * The initial delay before starting to execute the checks.
     * 
     */
    private final String initialDelay;
    /**
     * The request path.
     * 
     */
    private final String path;
    /**
     * Number of consecutive successful checks required before considering the VM healthy.
     * 
     */
    private final Integer successThreshold;
    /**
     * Time before the check is considered failed.
     * 
     */
    private final String timeout;

    @OutputCustomType.Constructor({"checkInterval","failureThreshold","host","initialDelay","path","successThreshold","timeout"})
    private LivenessCheckResponse(
        String checkInterval,
        Integer failureThreshold,
        String host,
        String initialDelay,
        String path,
        Integer successThreshold,
        String timeout) {
        this.checkInterval = Objects.requireNonNull(checkInterval);
        this.failureThreshold = Objects.requireNonNull(failureThreshold);
        this.host = Objects.requireNonNull(host);
        this.initialDelay = Objects.requireNonNull(initialDelay);
        this.path = Objects.requireNonNull(path);
        this.successThreshold = Objects.requireNonNull(successThreshold);
        this.timeout = Objects.requireNonNull(timeout);
    }

    /**
     * Interval between health checks.
     * 
     */
    public String getCheckInterval() {
        return this.checkInterval;
    }
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy.
     * 
     */
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }
    /**
     * Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com"
     * 
     */
    public String getHost() {
        return this.host;
    }
    /**
     * The initial delay before starting to execute the checks.
     * 
     */
    public String getInitialDelay() {
        return this.initialDelay;
    }
    /**
     * The request path.
     * 
     */
    public String getPath() {
        return this.path;
    }
    /**
     * Number of consecutive successful checks required before considering the VM healthy.
     * 
     */
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }
    /**
     * Time before the check is considered failed.
     * 
     */
    public String getTimeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LivenessCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checkInterval;
        private Integer failureThreshold;
        private String host;
        private String initialDelay;
        private String path;
        private Integer successThreshold;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(LivenessCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.initialDelay = defaults.initialDelay;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder setCheckInterval(String checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }

        public Builder setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = Objects.requireNonNull(failureThreshold);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setInitialDelay(String initialDelay) {
            this.initialDelay = Objects.requireNonNull(initialDelay);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = Objects.requireNonNull(successThreshold);
            return this;
        }

        public Builder setTimeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public LivenessCheckResponse build() {
            return new LivenessCheckResponse(checkInterval, failureThreshold, host, initialDelay, path, successThreshold, timeout);
        }
    }
}
