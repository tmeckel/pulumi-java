// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.GRPCHealthCheckResponse;
import io.pulumi.googlenative.compute_beta.outputs.HTTP2HealthCheckResponse;
import io.pulumi.googlenative.compute_beta.outputs.HTTPHealthCheckResponse;
import io.pulumi.googlenative.compute_beta.outputs.HTTPSHealthCheckResponse;
import io.pulumi.googlenative.compute_beta.outputs.HealthCheckLogConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.SSLHealthCheckResponse;
import io.pulumi.googlenative.compute_beta.outputs.TCPHealthCheckResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetHealthCheckResult {
    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    private final Integer checkIntervalSec;
    /**
     * Creation timestamp in 3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    private final GRPCHealthCheckResponse grpcHealthCheck;
    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    private final Integer healthyThreshold;
    private final HTTP2HealthCheckResponse http2HealthCheck;
    private final HTTPHealthCheckResponse httpHealthCheck;
    private final HTTPSHealthCheckResponse httpsHealthCheck;
    /**
     * Type of the resource.
     * 
     */
    private final String kind;
    /**
     * Configure logging on this health check.
     * 
     */
    private final HealthCheckLogConfigResponse logConfig;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn't a dash.
     * 
     */
    private final String name;
    /**
     * Region where the health check resides. Not applicable to global health checks.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    private final SSLHealthCheckResponse sslHealthCheck;
    private final TCPHealthCheckResponse tcpHealthCheck;
    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    private final Integer timeoutSec;
    /**
     * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
     */
    private final String type;
    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    private final Integer unhealthyThreshold;

    @OutputCustomType.Constructor
    private GetHealthCheckResult(
        @OutputCustomType.Parameter("checkIntervalSec") Integer checkIntervalSec,
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("grpcHealthCheck") GRPCHealthCheckResponse grpcHealthCheck,
        @OutputCustomType.Parameter("healthyThreshold") Integer healthyThreshold,
        @OutputCustomType.Parameter("http2HealthCheck") HTTP2HealthCheckResponse http2HealthCheck,
        @OutputCustomType.Parameter("httpHealthCheck") HTTPHealthCheckResponse httpHealthCheck,
        @OutputCustomType.Parameter("httpsHealthCheck") HTTPSHealthCheckResponse httpsHealthCheck,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("logConfig") HealthCheckLogConfigResponse logConfig,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("region") String region,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("sslHealthCheck") SSLHealthCheckResponse sslHealthCheck,
        @OutputCustomType.Parameter("tcpHealthCheck") TCPHealthCheckResponse tcpHealthCheck,
        @OutputCustomType.Parameter("timeoutSec") Integer timeoutSec,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.grpcHealthCheck = grpcHealthCheck;
        this.healthyThreshold = healthyThreshold;
        this.http2HealthCheck = http2HealthCheck;
        this.httpHealthCheck = httpHealthCheck;
        this.httpsHealthCheck = httpsHealthCheck;
        this.kind = kind;
        this.logConfig = logConfig;
        this.name = name;
        this.region = region;
        this.selfLink = selfLink;
        this.sslHealthCheck = sslHealthCheck;
        this.tcpHealthCheck = tcpHealthCheck;
        this.timeoutSec = timeoutSec;
        this.type = type;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
    */
    public Integer getCheckIntervalSec() {
        return this.checkIntervalSec;
    }
    /**
     * Creation timestamp in 3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    public GRPCHealthCheckResponse getGrpcHealthCheck() {
        return this.grpcHealthCheck;
    }
    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
    */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }
    public HTTP2HealthCheckResponse getHttp2HealthCheck() {
        return this.http2HealthCheck;
    }
    public HTTPHealthCheckResponse getHttpHealthCheck() {
        return this.httpHealthCheck;
    }
    public HTTPSHealthCheckResponse getHttpsHealthCheck() {
        return this.httpsHealthCheck;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Configure logging on this health check.
     * 
    */
    public HealthCheckLogConfigResponse getLogConfig() {
        return this.logConfig;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn't a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Region where the health check resides. Not applicable to global health checks.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    public SSLHealthCheckResponse getSslHealthCheck() {
        return this.sslHealthCheck;
    }
    public TCPHealthCheckResponse getTcpHealthCheck() {
        return this.tcpHealthCheck;
    }
    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
    */
    public Integer getTimeoutSec() {
        return this.timeoutSec;
    }
    /**
     * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
    */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer checkIntervalSec;
        private String creationTimestamp;
        private String description;
        private GRPCHealthCheckResponse grpcHealthCheck;
        private Integer healthyThreshold;
        private HTTP2HealthCheckResponse http2HealthCheck;
        private HTTPHealthCheckResponse httpHealthCheck;
        private HTTPSHealthCheckResponse httpsHealthCheck;
        private String kind;
        private HealthCheckLogConfigResponse logConfig;
        private String name;
        private String region;
        private String selfLink;
        private SSLHealthCheckResponse sslHealthCheck;
        private TCPHealthCheckResponse tcpHealthCheck;
        private Integer timeoutSec;
        private String type;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.grpcHealthCheck = defaults.grpcHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.http2HealthCheck = defaults.http2HealthCheck;
    	      this.httpHealthCheck = defaults.httpHealthCheck;
    	      this.httpsHealthCheck = defaults.httpsHealthCheck;
    	      this.kind = defaults.kind;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.sslHealthCheck = defaults.sslHealthCheck;
    	      this.tcpHealthCheck = defaults.tcpHealthCheck;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.type = defaults.type;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder checkIntervalSec(Integer checkIntervalSec) {
            this.checkIntervalSec = Objects.requireNonNull(checkIntervalSec);
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder grpcHealthCheck(GRPCHealthCheckResponse grpcHealthCheck) {
            this.grpcHealthCheck = Objects.requireNonNull(grpcHealthCheck);
            return this;
        }

        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder http2HealthCheck(HTTP2HealthCheckResponse http2HealthCheck) {
            this.http2HealthCheck = Objects.requireNonNull(http2HealthCheck);
            return this;
        }

        public Builder httpHealthCheck(HTTPHealthCheckResponse httpHealthCheck) {
            this.httpHealthCheck = Objects.requireNonNull(httpHealthCheck);
            return this;
        }

        public Builder httpsHealthCheck(HTTPSHealthCheckResponse httpsHealthCheck) {
            this.httpsHealthCheck = Objects.requireNonNull(httpsHealthCheck);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder logConfig(HealthCheckLogConfigResponse logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder sslHealthCheck(SSLHealthCheckResponse sslHealthCheck) {
            this.sslHealthCheck = Objects.requireNonNull(sslHealthCheck);
            return this;
        }

        public Builder tcpHealthCheck(TCPHealthCheckResponse tcpHealthCheck) {
            this.tcpHealthCheck = Objects.requireNonNull(tcpHealthCheck);
            return this;
        }

        public Builder timeoutSec(Integer timeoutSec) {
            this.timeoutSec = Objects.requireNonNull(timeoutSec);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public GetHealthCheckResult build() {
            return new GetHealthCheckResult(checkIntervalSec, creationTimestamp, description, grpcHealthCheck, healthyThreshold, http2HealthCheck, httpHealthCheck, httpsHealthCheck, kind, logConfig, name, region, selfLink, sslHealthCheck, tcpHealthCheck, timeoutSec, type, unhealthyThreshold);
        }
    }
}
