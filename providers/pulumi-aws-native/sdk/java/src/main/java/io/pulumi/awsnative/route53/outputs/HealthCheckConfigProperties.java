// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.outputs;

import io.pulumi.awsnative.route53.enums.HealthCheckConfigPropertiesInsufficientDataHealthStatus;
import io.pulumi.awsnative.route53.enums.HealthCheckConfigPropertiesType;
import io.pulumi.awsnative.route53.outputs.HealthCheckAlarmIdentifier;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HealthCheckConfigProperties {
    private final @Nullable HealthCheckAlarmIdentifier alarmIdentifier;
    private final @Nullable List<String> childHealthChecks;
    private final @Nullable Boolean enableSNI;
    private final @Nullable Integer failureThreshold;
    private final @Nullable String fullyQualifiedDomainName;
    private final @Nullable Integer healthThreshold;
    private final @Nullable String iPAddress;
    private final @Nullable HealthCheckConfigPropertiesInsufficientDataHealthStatus insufficientDataHealthStatus;
    private final @Nullable Boolean inverted;
    private final @Nullable Boolean measureLatency;
    private final @Nullable Integer port;
    private final @Nullable List<String> regions;
    private final @Nullable Integer requestInterval;
    private final @Nullable String resourcePath;
    private final @Nullable String routingControlArn;
    private final @Nullable String searchString;
    private final HealthCheckConfigPropertiesType type;

    @OutputCustomType.Constructor
    private HealthCheckConfigProperties(
        @OutputCustomType.Parameter("alarmIdentifier") @Nullable HealthCheckAlarmIdentifier alarmIdentifier,
        @OutputCustomType.Parameter("childHealthChecks") @Nullable List<String> childHealthChecks,
        @OutputCustomType.Parameter("enableSNI") @Nullable Boolean enableSNI,
        @OutputCustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold,
        @OutputCustomType.Parameter("fullyQualifiedDomainName") @Nullable String fullyQualifiedDomainName,
        @OutputCustomType.Parameter("healthThreshold") @Nullable Integer healthThreshold,
        @OutputCustomType.Parameter("iPAddress") @Nullable String iPAddress,
        @OutputCustomType.Parameter("insufficientDataHealthStatus") @Nullable HealthCheckConfigPropertiesInsufficientDataHealthStatus insufficientDataHealthStatus,
        @OutputCustomType.Parameter("inverted") @Nullable Boolean inverted,
        @OutputCustomType.Parameter("measureLatency") @Nullable Boolean measureLatency,
        @OutputCustomType.Parameter("port") @Nullable Integer port,
        @OutputCustomType.Parameter("regions") @Nullable List<String> regions,
        @OutputCustomType.Parameter("requestInterval") @Nullable Integer requestInterval,
        @OutputCustomType.Parameter("resourcePath") @Nullable String resourcePath,
        @OutputCustomType.Parameter("routingControlArn") @Nullable String routingControlArn,
        @OutputCustomType.Parameter("searchString") @Nullable String searchString,
        @OutputCustomType.Parameter("type") HealthCheckConfigPropertiesType type) {
        this.alarmIdentifier = alarmIdentifier;
        this.childHealthChecks = childHealthChecks;
        this.enableSNI = enableSNI;
        this.failureThreshold = failureThreshold;
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        this.healthThreshold = healthThreshold;
        this.iPAddress = iPAddress;
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
        this.inverted = inverted;
        this.measureLatency = measureLatency;
        this.port = port;
        this.regions = regions;
        this.requestInterval = requestInterval;
        this.resourcePath = resourcePath;
        this.routingControlArn = routingControlArn;
        this.searchString = searchString;
        this.type = type;
    }

    public Optional<HealthCheckAlarmIdentifier> getAlarmIdentifier() {
        return Optional.ofNullable(this.alarmIdentifier);
    }
    public List<String> getChildHealthChecks() {
        return this.childHealthChecks == null ? List.of() : this.childHealthChecks;
    }
    public Optional<Boolean> getEnableSNI() {
        return Optional.ofNullable(this.enableSNI);
    }
    public Optional<Integer> getFailureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    public Optional<String> getFullyQualifiedDomainName() {
        return Optional.ofNullable(this.fullyQualifiedDomainName);
    }
    public Optional<Integer> getHealthThreshold() {
        return Optional.ofNullable(this.healthThreshold);
    }
    public Optional<String> getIPAddress() {
        return Optional.ofNullable(this.iPAddress);
    }
    public Optional<HealthCheckConfigPropertiesInsufficientDataHealthStatus> getInsufficientDataHealthStatus() {
        return Optional.ofNullable(this.insufficientDataHealthStatus);
    }
    public Optional<Boolean> getInverted() {
        return Optional.ofNullable(this.inverted);
    }
    public Optional<Boolean> getMeasureLatency() {
        return Optional.ofNullable(this.measureLatency);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
    }
    public Optional<Integer> getRequestInterval() {
        return Optional.ofNullable(this.requestInterval);
    }
    public Optional<String> getResourcePath() {
        return Optional.ofNullable(this.resourcePath);
    }
    public Optional<String> getRoutingControlArn() {
        return Optional.ofNullable(this.routingControlArn);
    }
    public Optional<String> getSearchString() {
        return Optional.ofNullable(this.searchString);
    }
    public HealthCheckConfigPropertiesType getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HealthCheckAlarmIdentifier alarmIdentifier;
        private @Nullable List<String> childHealthChecks;
        private @Nullable Boolean enableSNI;
        private @Nullable Integer failureThreshold;
        private @Nullable String fullyQualifiedDomainName;
        private @Nullable Integer healthThreshold;
        private @Nullable String iPAddress;
        private @Nullable HealthCheckConfigPropertiesInsufficientDataHealthStatus insufficientDataHealthStatus;
        private @Nullable Boolean inverted;
        private @Nullable Boolean measureLatency;
        private @Nullable Integer port;
        private @Nullable List<String> regions;
        private @Nullable Integer requestInterval;
        private @Nullable String resourcePath;
        private @Nullable String routingControlArn;
        private @Nullable String searchString;
        private HealthCheckConfigPropertiesType type;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmIdentifier = defaults.alarmIdentifier;
    	      this.childHealthChecks = defaults.childHealthChecks;
    	      this.enableSNI = defaults.enableSNI;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.fullyQualifiedDomainName = defaults.fullyQualifiedDomainName;
    	      this.healthThreshold = defaults.healthThreshold;
    	      this.iPAddress = defaults.iPAddress;
    	      this.insufficientDataHealthStatus = defaults.insufficientDataHealthStatus;
    	      this.inverted = defaults.inverted;
    	      this.measureLatency = defaults.measureLatency;
    	      this.port = defaults.port;
    	      this.regions = defaults.regions;
    	      this.requestInterval = defaults.requestInterval;
    	      this.resourcePath = defaults.resourcePath;
    	      this.routingControlArn = defaults.routingControlArn;
    	      this.searchString = defaults.searchString;
    	      this.type = defaults.type;
        }

        public Builder alarmIdentifier(@Nullable HealthCheckAlarmIdentifier alarmIdentifier) {
            this.alarmIdentifier = alarmIdentifier;
            return this;
        }

        public Builder childHealthChecks(@Nullable List<String> childHealthChecks) {
            this.childHealthChecks = childHealthChecks;
            return this;
        }

        public Builder enableSNI(@Nullable Boolean enableSNI) {
            this.enableSNI = enableSNI;
            return this;
        }

        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder fullyQualifiedDomainName(@Nullable String fullyQualifiedDomainName) {
            this.fullyQualifiedDomainName = fullyQualifiedDomainName;
            return this;
        }

        public Builder healthThreshold(@Nullable Integer healthThreshold) {
            this.healthThreshold = healthThreshold;
            return this;
        }

        public Builder iPAddress(@Nullable String iPAddress) {
            this.iPAddress = iPAddress;
            return this;
        }

        public Builder insufficientDataHealthStatus(@Nullable HealthCheckConfigPropertiesInsufficientDataHealthStatus insufficientDataHealthStatus) {
            this.insufficientDataHealthStatus = insufficientDataHealthStatus;
            return this;
        }

        public Builder inverted(@Nullable Boolean inverted) {
            this.inverted = inverted;
            return this;
        }

        public Builder measureLatency(@Nullable Boolean measureLatency) {
            this.measureLatency = measureLatency;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder requestInterval(@Nullable Integer requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }

        public Builder resourcePath(@Nullable String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder routingControlArn(@Nullable String routingControlArn) {
            this.routingControlArn = routingControlArn;
            return this;
        }

        public Builder searchString(@Nullable String searchString) {
            this.searchString = searchString;
            return this;
        }

        public Builder type(HealthCheckConfigPropertiesType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public HealthCheckConfigProperties build() {
            return new HealthCheckConfigProperties(alarmIdentifier, childHealthChecks, enableSNI, failureThreshold, fullyQualifiedDomainName, healthThreshold, iPAddress, insufficientDataHealthStatus, inverted, measureLatency, port, regions, requestInterval, resourcePath, routingControlArn, searchString, type);
        }
    }
}
