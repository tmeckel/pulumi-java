// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
 * 
 */
public final class LivenessCheckResponse extends com.pulumi.resources.InvokeArgs {

    public static final LivenessCheckResponse Empty = new LivenessCheckResponse();

    /**
     * Interval between health checks.
     * 
     */
    @Import(name="checkInterval", required=true)
    private String checkInterval;

    /**
     * @return Interval between health checks.
     * 
     */
    public String checkInterval() {
        return this.checkInterval;
    }

    /**
     * Number of consecutive failed checks required before considering the VM unhealthy.
     * 
     */
    @Import(name="failureThreshold", required=true)
    private Integer failureThreshold;

    /**
     * @return Number of consecutive failed checks required before considering the VM unhealthy.
     * 
     */
    public Integer failureThreshold() {
        return this.failureThreshold;
    }

    /**
     * Host header to send when performing a HTTP Liveness check. Example: &#34;myapp.appspot.com&#34;
     * 
     */
    @Import(name="host", required=true)
    private String host;

    /**
     * @return Host header to send when performing a HTTP Liveness check. Example: &#34;myapp.appspot.com&#34;
     * 
     */
    public String host() {
        return this.host;
    }

    /**
     * The initial delay before starting to execute the checks.
     * 
     */
    @Import(name="initialDelay", required=true)
    private String initialDelay;

    /**
     * @return The initial delay before starting to execute the checks.
     * 
     */
    public String initialDelay() {
        return this.initialDelay;
    }

    /**
     * The request path.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return The request path.
     * 
     */
    public String path() {
        return this.path;
    }

    /**
     * Number of consecutive successful checks required before considering the VM healthy.
     * 
     */
    @Import(name="successThreshold", required=true)
    private Integer successThreshold;

    /**
     * @return Number of consecutive successful checks required before considering the VM healthy.
     * 
     */
    public Integer successThreshold() {
        return this.successThreshold;
    }

    /**
     * Time before the check is considered failed.
     * 
     */
    @Import(name="timeout", required=true)
    private String timeout;

    /**
     * @return Time before the check is considered failed.
     * 
     */
    public String timeout() {
        return this.timeout;
    }

    private LivenessCheckResponse() {}

    private LivenessCheckResponse(LivenessCheckResponse $) {
        this.checkInterval = $.checkInterval;
        this.failureThreshold = $.failureThreshold;
        this.host = $.host;
        this.initialDelay = $.initialDelay;
        this.path = $.path;
        this.successThreshold = $.successThreshold;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LivenessCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LivenessCheckResponse $;

        public Builder() {
            $ = new LivenessCheckResponse();
        }

        public Builder(LivenessCheckResponse defaults) {
            $ = new LivenessCheckResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkInterval Interval between health checks.
         * 
         * @return builder
         * 
         */
        public Builder checkInterval(String checkInterval) {
            $.checkInterval = checkInterval;
            return this;
        }

        /**
         * @param failureThreshold Number of consecutive failed checks required before considering the VM unhealthy.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(Integer failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * @param host Host header to send when performing a HTTP Liveness check. Example: &#34;myapp.appspot.com&#34;
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            $.host = host;
            return this;
        }

        /**
         * @param initialDelay The initial delay before starting to execute the checks.
         * 
         * @return builder
         * 
         */
        public Builder initialDelay(String initialDelay) {
            $.initialDelay = initialDelay;
            return this;
        }

        /**
         * @param path The request path.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        /**
         * @param successThreshold Number of consecutive successful checks required before considering the VM healthy.
         * 
         * @return builder
         * 
         */
        public Builder successThreshold(Integer successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        /**
         * @param timeout Time before the check is considered failed.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            $.timeout = timeout;
            return this;
        }

        public LivenessCheckResponse build() {
            $.checkInterval = Objects.requireNonNull($.checkInterval, "expected parameter 'checkInterval' to be non-null");
            $.failureThreshold = Objects.requireNonNull($.failureThreshold, "expected parameter 'failureThreshold' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.initialDelay = Objects.requireNonNull($.initialDelay, "expected parameter 'initialDelay' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.successThreshold = Objects.requireNonNull($.successThreshold, "expected parameter 'successThreshold' to be non-null");
            $.timeout = Objects.requireNonNull($.timeout, "expected parameter 'timeout' to be non-null");
            return $;
        }
    }

}
