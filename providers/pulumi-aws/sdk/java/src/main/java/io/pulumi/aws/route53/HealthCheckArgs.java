// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckArgs Empty = new HealthCheckArgs();

    /**
     * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
     * 
     */
    @InputImport(name="childHealthThreshold")
      private final @Nullable Input<Integer> childHealthThreshold;

    public Input<Integer> getChildHealthThreshold() {
        return this.childHealthThreshold == null ? Input.empty() : this.childHealthThreshold;
    }

    /**
     * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
     * 
     */
    @InputImport(name="childHealthchecks")
      private final @Nullable Input<List<String>> childHealthchecks;

    public Input<List<String>> getChildHealthchecks() {
        return this.childHealthchecks == null ? Input.empty() : this.childHealthchecks;
    }

    /**
     * The name of the CloudWatch alarm.
     * 
     */
    @InputImport(name="cloudwatchAlarmName")
      private final @Nullable Input<String> cloudwatchAlarmName;

    public Input<String> getCloudwatchAlarmName() {
        return this.cloudwatchAlarmName == null ? Input.empty() : this.cloudwatchAlarmName;
    }

    /**
     * The CloudWatchRegion that the CloudWatch alarm was created in.
     * 
     */
    @InputImport(name="cloudwatchAlarmRegion")
      private final @Nullable Input<String> cloudwatchAlarmRegion;

    public Input<String> getCloudwatchAlarmRegion() {
        return this.cloudwatchAlarmRegion == null ? Input.empty() : this.cloudwatchAlarmRegion;
    }

    /**
     * A boolean value that stops Route 53 from performing health checks. When set to true, Route 53 will do the following depending on the type of health check:
     * * For health checks that check the health of endpoints, Route5 53 stops submitting requests to your application, server, or other resource.
     * * For calculated health checks, Route 53 stops aggregating the status of the referenced health checks.
     * * For health checks that monitor CloudWatch alarms, Route 53 stops monitoring the corresponding CloudWatch metrics.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enable_sni` defaults to `true`, when `type` is anything else `enable_sni` defaults to `false`.
     * 
     */
    @InputImport(name="enableSni")
      private final @Nullable Input<Boolean> enableSni;

    public Input<Boolean> getEnableSni() {
        return this.enableSni == null ? Input.empty() : this.enableSni;
    }

    /**
     * The number of consecutive health checks that an endpoint must pass or fail.
     * 
     */
    @InputImport(name="failureThreshold")
      private final @Nullable Input<Integer> failureThreshold;

    public Input<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Input.empty() : this.failureThreshold;
    }

    /**
     * The fully qualified domain name of the endpoint to be checked.
     * 
     */
    @InputImport(name="fqdn")
      private final @Nullable Input<String> fqdn;

    public Input<String> getFqdn() {
        return this.fqdn == null ? Input.empty() : this.fqdn;
    }

    /**
     * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
     * 
     */
    @InputImport(name="insufficientDataHealthStatus")
      private final @Nullable Input<String> insufficientDataHealthStatus;

    public Input<String> getInsufficientDataHealthStatus() {
        return this.insufficientDataHealthStatus == null ? Input.empty() : this.insufficientDataHealthStatus;
    }

    /**
     * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
     * 
     */
    @InputImport(name="invertHealthcheck")
      private final @Nullable Input<Boolean> invertHealthcheck;

    public Input<Boolean> getInvertHealthcheck() {
        return this.invertHealthcheck == null ? Input.empty() : this.invertHealthcheck;
    }

    /**
     * The IP address of the endpoint to be checked.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
     * 
     */
    @InputImport(name="measureLatency")
      private final @Nullable Input<Boolean> measureLatency;

    public Input<Boolean> getMeasureLatency() {
        return this.measureLatency == null ? Input.empty() : this.measureLatency;
    }

    /**
     * The port of the endpoint to be checked.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * This is a reference name used in Caller Reference
     * (helpful for identifying single health_check set amongst others)
     * 
     */
    @InputImport(name="referenceName")
      private final @Nullable Input<String> referenceName;

    public Input<String> getReferenceName() {
        return this.referenceName == null ? Input.empty() : this.referenceName;
    }

    /**
     * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
     * 
     */
    @InputImport(name="regions")
      private final @Nullable Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    /**
     * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
     * 
     */
    @InputImport(name="requestInterval")
      private final @Nullable Input<Integer> requestInterval;

    public Input<Integer> getRequestInterval() {
        return this.requestInterval == null ? Input.empty() : this.requestInterval;
    }

    /**
     * The path that you want Amazon Route 53 to request when performing health checks.
     * 
     */
    @InputImport(name="resourcePath")
      private final @Nullable Input<String> resourcePath;

    public Input<String> getResourcePath() {
        return this.resourcePath == null ? Input.empty() : this.resourcePath;
    }

    /**
     * The Amazon Resource Name (ARN) for the Route 53 Application Recovery Controller routing control. This is used when health check type is `RECOVERY_CONTROL`
     * 
     */
    @InputImport(name="routingControlArn")
      private final @Nullable Input<String> routingControlArn;

    public Input<String> getRoutingControlArn() {
        return this.routingControlArn == null ? Input.empty() : this.routingControlArn;
    }

    /**
     * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
     * 
     */
    @InputImport(name="searchString")
      private final @Nullable Input<String> searchString;

    public Input<String> getSearchString() {
        return this.searchString == null ? Input.empty() : this.searchString;
    }

    /**
     * A map of tags to assign to the health check. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED`, `CLOUDWATCH_METRIC` and `RECOVERY_CONTROL`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public HealthCheckArgs(
        @Nullable Input<Integer> childHealthThreshold,
        @Nullable Input<List<String>> childHealthchecks,
        @Nullable Input<String> cloudwatchAlarmName,
        @Nullable Input<String> cloudwatchAlarmRegion,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<Boolean> enableSni,
        @Nullable Input<Integer> failureThreshold,
        @Nullable Input<String> fqdn,
        @Nullable Input<String> insufficientDataHealthStatus,
        @Nullable Input<Boolean> invertHealthcheck,
        @Nullable Input<String> ipAddress,
        @Nullable Input<Boolean> measureLatency,
        @Nullable Input<Integer> port,
        @Nullable Input<String> referenceName,
        @Nullable Input<List<String>> regions,
        @Nullable Input<Integer> requestInterval,
        @Nullable Input<String> resourcePath,
        @Nullable Input<String> routingControlArn,
        @Nullable Input<String> searchString,
        @Nullable Input<Map<String,String>> tags,
        Input<String> type) {
        this.childHealthThreshold = childHealthThreshold;
        this.childHealthchecks = childHealthchecks;
        this.cloudwatchAlarmName = cloudwatchAlarmName;
        this.cloudwatchAlarmRegion = cloudwatchAlarmRegion;
        this.disabled = disabled;
        this.enableSni = enableSni;
        this.failureThreshold = failureThreshold;
        this.fqdn = fqdn;
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
        this.invertHealthcheck = invertHealthcheck;
        this.ipAddress = ipAddress;
        this.measureLatency = measureLatency;
        this.port = port;
        this.referenceName = referenceName;
        this.regions = regions;
        this.requestInterval = requestInterval;
        this.resourcePath = resourcePath;
        this.routingControlArn = routingControlArn;
        this.searchString = searchString;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HealthCheckArgs() {
        this.childHealthThreshold = Input.empty();
        this.childHealthchecks = Input.empty();
        this.cloudwatchAlarmName = Input.empty();
        this.cloudwatchAlarmRegion = Input.empty();
        this.disabled = Input.empty();
        this.enableSni = Input.empty();
        this.failureThreshold = Input.empty();
        this.fqdn = Input.empty();
        this.insufficientDataHealthStatus = Input.empty();
        this.invertHealthcheck = Input.empty();
        this.ipAddress = Input.empty();
        this.measureLatency = Input.empty();
        this.port = Input.empty();
        this.referenceName = Input.empty();
        this.regions = Input.empty();
        this.requestInterval = Input.empty();
        this.resourcePath = Input.empty();
        this.routingControlArn = Input.empty();
        this.searchString = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> childHealthThreshold;
        private @Nullable Input<List<String>> childHealthchecks;
        private @Nullable Input<String> cloudwatchAlarmName;
        private @Nullable Input<String> cloudwatchAlarmRegion;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<Boolean> enableSni;
        private @Nullable Input<Integer> failureThreshold;
        private @Nullable Input<String> fqdn;
        private @Nullable Input<String> insufficientDataHealthStatus;
        private @Nullable Input<Boolean> invertHealthcheck;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<Boolean> measureLatency;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> referenceName;
        private @Nullable Input<List<String>> regions;
        private @Nullable Input<Integer> requestInterval;
        private @Nullable Input<String> resourcePath;
        private @Nullable Input<String> routingControlArn;
        private @Nullable Input<String> searchString;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childHealthThreshold = defaults.childHealthThreshold;
    	      this.childHealthchecks = defaults.childHealthchecks;
    	      this.cloudwatchAlarmName = defaults.cloudwatchAlarmName;
    	      this.cloudwatchAlarmRegion = defaults.cloudwatchAlarmRegion;
    	      this.disabled = defaults.disabled;
    	      this.enableSni = defaults.enableSni;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.fqdn = defaults.fqdn;
    	      this.insufficientDataHealthStatus = defaults.insufficientDataHealthStatus;
    	      this.invertHealthcheck = defaults.invertHealthcheck;
    	      this.ipAddress = defaults.ipAddress;
    	      this.measureLatency = defaults.measureLatency;
    	      this.port = defaults.port;
    	      this.referenceName = defaults.referenceName;
    	      this.regions = defaults.regions;
    	      this.requestInterval = defaults.requestInterval;
    	      this.resourcePath = defaults.resourcePath;
    	      this.routingControlArn = defaults.routingControlArn;
    	      this.searchString = defaults.searchString;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder childHealthThreshold(@Nullable Input<Integer> childHealthThreshold) {
            this.childHealthThreshold = childHealthThreshold;
            return this;
        }

        public Builder childHealthThreshold(@Nullable Integer childHealthThreshold) {
            this.childHealthThreshold = Input.ofNullable(childHealthThreshold);
            return this;
        }

        public Builder childHealthchecks(@Nullable Input<List<String>> childHealthchecks) {
            this.childHealthchecks = childHealthchecks;
            return this;
        }

        public Builder childHealthchecks(@Nullable List<String> childHealthchecks) {
            this.childHealthchecks = Input.ofNullable(childHealthchecks);
            return this;
        }

        public Builder cloudwatchAlarmName(@Nullable Input<String> cloudwatchAlarmName) {
            this.cloudwatchAlarmName = cloudwatchAlarmName;
            return this;
        }

        public Builder cloudwatchAlarmName(@Nullable String cloudwatchAlarmName) {
            this.cloudwatchAlarmName = Input.ofNullable(cloudwatchAlarmName);
            return this;
        }

        public Builder cloudwatchAlarmRegion(@Nullable Input<String> cloudwatchAlarmRegion) {
            this.cloudwatchAlarmRegion = cloudwatchAlarmRegion;
            return this;
        }

        public Builder cloudwatchAlarmRegion(@Nullable String cloudwatchAlarmRegion) {
            this.cloudwatchAlarmRegion = Input.ofNullable(cloudwatchAlarmRegion);
            return this;
        }

        public Builder disabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder enableSni(@Nullable Input<Boolean> enableSni) {
            this.enableSni = enableSni;
            return this;
        }

        public Builder enableSni(@Nullable Boolean enableSni) {
            this.enableSni = Input.ofNullable(enableSni);
            return this;
        }

        public Builder failureThreshold(@Nullable Input<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Input.ofNullable(failureThreshold);
            return this;
        }

        public Builder fqdn(@Nullable Input<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = Input.ofNullable(fqdn);
            return this;
        }

        public Builder insufficientDataHealthStatus(@Nullable Input<String> insufficientDataHealthStatus) {
            this.insufficientDataHealthStatus = insufficientDataHealthStatus;
            return this;
        }

        public Builder insufficientDataHealthStatus(@Nullable String insufficientDataHealthStatus) {
            this.insufficientDataHealthStatus = Input.ofNullable(insufficientDataHealthStatus);
            return this;
        }

        public Builder invertHealthcheck(@Nullable Input<Boolean> invertHealthcheck) {
            this.invertHealthcheck = invertHealthcheck;
            return this;
        }

        public Builder invertHealthcheck(@Nullable Boolean invertHealthcheck) {
            this.invertHealthcheck = Input.ofNullable(invertHealthcheck);
            return this;
        }

        public Builder ipAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder measureLatency(@Nullable Input<Boolean> measureLatency) {
            this.measureLatency = measureLatency;
            return this;
        }

        public Builder measureLatency(@Nullable Boolean measureLatency) {
            this.measureLatency = Input.ofNullable(measureLatency);
            return this;
        }

        public Builder port(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder referenceName(@Nullable Input<String> referenceName) {
            this.referenceName = referenceName;
            return this;
        }

        public Builder referenceName(@Nullable String referenceName) {
            this.referenceName = Input.ofNullable(referenceName);
            return this;
        }

        public Builder regions(@Nullable Input<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder regions(@Nullable List<String> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }

        public Builder requestInterval(@Nullable Input<Integer> requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }

        public Builder requestInterval(@Nullable Integer requestInterval) {
            this.requestInterval = Input.ofNullable(requestInterval);
            return this;
        }

        public Builder resourcePath(@Nullable Input<String> resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder resourcePath(@Nullable String resourcePath) {
            this.resourcePath = Input.ofNullable(resourcePath);
            return this;
        }

        public Builder routingControlArn(@Nullable Input<String> routingControlArn) {
            this.routingControlArn = routingControlArn;
            return this;
        }

        public Builder routingControlArn(@Nullable String routingControlArn) {
            this.routingControlArn = Input.ofNullable(routingControlArn);
            return this;
        }

        public Builder searchString(@Nullable Input<String> searchString) {
            this.searchString = searchString;
            return this;
        }

        public Builder searchString(@Nullable String searchString) {
            this.searchString = Input.ofNullable(searchString);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public HealthCheckArgs build() {
            return new HealthCheckArgs(childHealthThreshold, childHealthchecks, cloudwatchAlarmName, cloudwatchAlarmRegion, disabled, enableSni, failureThreshold, fqdn, insufficientDataHealthStatus, invertHealthcheck, ipAddress, measureLatency, port, referenceName, regions, requestInterval, resourcePath, routingControlArn, searchString, tags, type);
        }
    }
}
