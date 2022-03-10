// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTargetGroupHealthCheck {
    private final Boolean enabled;
    private final Integer healthyThreshold;
    private final Integer interval;
    private final String matcher;
    private final String path;
    private final String port;
    private final String protocol;
    private final Integer timeout;
    private final Integer unhealthyThreshold;

    @OutputCustomType.Constructor
    private GetTargetGroupHealthCheck(
        @OutputCustomType.Parameter("enabled") Boolean enabled,
        @OutputCustomType.Parameter("healthyThreshold") Integer healthyThreshold,
        @OutputCustomType.Parameter("interval") Integer interval,
        @OutputCustomType.Parameter("matcher") String matcher,
        @OutputCustomType.Parameter("path") String path,
        @OutputCustomType.Parameter("port") String port,
        @OutputCustomType.Parameter("protocol") String protocol,
        @OutputCustomType.Parameter("timeout") Integer timeout,
        @OutputCustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
        this.enabled = enabled;
        this.healthyThreshold = healthyThreshold;
        this.interval = interval;
        this.matcher = matcher;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }
    public Integer getInterval() {
        return this.interval;
    }
    public String getMatcher() {
        return this.matcher;
    }
    public String getPath() {
        return this.path;
    }
    public String getPort() {
        return this.port;
    }
    public String getProtocol() {
        return this.protocol;
    }
    public Integer getTimeout() {
        return this.timeout;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetGroupHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private Integer healthyThreshold;
        private Integer interval;
        private String matcher;
        private String path;
        private String port;
        private String protocol;
        private Integer timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetGroupHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.matcher = defaults.matcher;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder matcher(String matcher) {
            this.matcher = Objects.requireNonNull(matcher);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public GetTargetGroupHealthCheck build() {
            return new GetTargetGroupHealthCheck(enabled, healthyThreshold, interval, matcher, path, port, protocol, timeout, unhealthyThreshold);
        }
    }
}
