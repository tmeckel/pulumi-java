// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherGetArgs;
import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckGetArgs;
import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceGetArgs;
import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigResourceGroupGetArgs;
import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UptimeCheckConfigState extends com.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigState Empty = new UptimeCheckConfigState();

    /**
     * The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response&#39;s content. This field is optional and should only be specified if a content match is required.
     * Structure is documented below.
     * 
     */
    @Import(name="contentMatchers")
    private @Nullable Output<List<UptimeCheckConfigContentMatcherGetArgs>> contentMatchers;

    /**
     * @return The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response&#39;s content. This field is optional and should only be specified if a content match is required.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<UptimeCheckConfigContentMatcherGetArgs>>> contentMatchers() {
        return Optional.ofNullable(this.contentMatchers);
    }

    /**
     * A human-friendly name for the uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A human-friendly name for the uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * Structure is documented below.
     * 
     */
    @Import(name="httpCheck")
    private @Nullable Output<UptimeCheckConfigHttpCheckGetArgs> httpCheck;

    /**
     * @return Contains information needed to make an HTTP or HTTPS check.
     * Structure is documented below.
     * 
     */
    public Optional<Output<UptimeCheckConfigHttpCheckGetArgs>> httpCheck() {
        return Optional.ofNullable(this.httpCheck);
    }

    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are supported for uptime checks:  uptime_url  gce_instance  gae_app  aws_ec2_instance  aws_elb_load_balancer
     * Structure is documented below.
     * 
     */
    @Import(name="monitoredResource")
    private @Nullable Output<UptimeCheckConfigMonitoredResourceGetArgs> monitoredResource;

    /**
     * @return The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are supported for uptime checks:  uptime_url  gce_instance  gae_app  aws_ec2_instance  aws_elb_load_balancer
     * Structure is documented below.
     * 
     */
    public Optional<Output<UptimeCheckConfigMonitoredResourceGetArgs>> monitoredResource() {
        return Optional.ofNullable(this.monitoredResource);
    }

    /**
     * A unique resource name for this UptimeCheckConfig. The format is
     * projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique resource name for this UptimeCheckConfig. The format is
     * projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * How often, in seconds, the uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 300s.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return How often, in seconds, the uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 300s.
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The group resource associated with the configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable Output<UptimeCheckConfigResourceGroupGetArgs> resourceGroup;

    /**
     * @return The group resource associated with the configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<UptimeCheckConfigResourceGroupGetArgs>> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions to include a minimum of 3 locations must be provided, or an error message is returned. Not specifying this field will result in uptime checks running from all regions.
     * 
     */
    @Import(name="selectedRegions")
    private @Nullable Output<List<String>> selectedRegions;

    /**
     * @return The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions to include a minimum of 3 locations must be provided, or an error message is returned. Not specifying this field will result in uptime checks running from all regions.
     * 
     */
    public Optional<Output<List<String>>> selectedRegions() {
        return Optional.ofNullable(this.selectedRegions);
    }

    /**
     * Contains information needed to make a TCP check.
     * Structure is documented below.
     * 
     */
    @Import(name="tcpCheck")
    private @Nullable Output<UptimeCheckConfigTcpCheckGetArgs> tcpCheck;

    /**
     * @return Contains information needed to make a TCP check.
     * Structure is documented below.
     * 
     */
    public Optional<Output<UptimeCheckConfigTcpCheckGetArgs>> tcpCheck() {
        return Optional.ofNullable(this.tcpCheck);
    }

    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Accepted formats https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Accepted formats https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The id of the uptime check
     * 
     */
    @Import(name="uptimeCheckId")
    private @Nullable Output<String> uptimeCheckId;

    /**
     * @return The id of the uptime check
     * 
     */
    public Optional<Output<String>> uptimeCheckId() {
        return Optional.ofNullable(this.uptimeCheckId);
    }

    private UptimeCheckConfigState() {}

    private UptimeCheckConfigState(UptimeCheckConfigState $) {
        this.contentMatchers = $.contentMatchers;
        this.displayName = $.displayName;
        this.httpCheck = $.httpCheck;
        this.monitoredResource = $.monitoredResource;
        this.name = $.name;
        this.period = $.period;
        this.project = $.project;
        this.resourceGroup = $.resourceGroup;
        this.selectedRegions = $.selectedRegions;
        this.tcpCheck = $.tcpCheck;
        this.timeout = $.timeout;
        this.uptimeCheckId = $.uptimeCheckId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UptimeCheckConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UptimeCheckConfigState $;

        public Builder() {
            $ = new UptimeCheckConfigState();
        }

        public Builder(UptimeCheckConfigState defaults) {
            $ = new UptimeCheckConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentMatchers The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response&#39;s content. This field is optional and should only be specified if a content match is required.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder contentMatchers(@Nullable Output<List<UptimeCheckConfigContentMatcherGetArgs>> contentMatchers) {
            $.contentMatchers = contentMatchers;
            return this;
        }

        /**
         * @param contentMatchers The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response&#39;s content. This field is optional and should only be specified if a content match is required.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder contentMatchers(List<UptimeCheckConfigContentMatcherGetArgs> contentMatchers) {
            return contentMatchers(Output.of(contentMatchers));
        }

        /**
         * @param contentMatchers The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response&#39;s content. This field is optional and should only be specified if a content match is required.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder contentMatchers(UptimeCheckConfigContentMatcherGetArgs... contentMatchers) {
            return contentMatchers(List.of(contentMatchers));
        }

        /**
         * @param displayName A human-friendly name for the uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A human-friendly name for the uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param httpCheck Contains information needed to make an HTTP or HTTPS check.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder httpCheck(@Nullable Output<UptimeCheckConfigHttpCheckGetArgs> httpCheck) {
            $.httpCheck = httpCheck;
            return this;
        }

        /**
         * @param httpCheck Contains information needed to make an HTTP or HTTPS check.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder httpCheck(UptimeCheckConfigHttpCheckGetArgs httpCheck) {
            return httpCheck(Output.of(httpCheck));
        }

        /**
         * @param monitoredResource The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are supported for uptime checks:  uptime_url  gce_instance  gae_app  aws_ec2_instance  aws_elb_load_balancer
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResource(@Nullable Output<UptimeCheckConfigMonitoredResourceGetArgs> monitoredResource) {
            $.monitoredResource = monitoredResource;
            return this;
        }

        /**
         * @param monitoredResource The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are supported for uptime checks:  uptime_url  gce_instance  gae_app  aws_ec2_instance  aws_elb_load_balancer
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResource(UptimeCheckConfigMonitoredResourceGetArgs monitoredResource) {
            return monitoredResource(Output.of(monitoredResource));
        }

        /**
         * @param name A unique resource name for this UptimeCheckConfig. The format is
         * projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique resource name for this UptimeCheckConfig. The format is
         * projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param period How often, in seconds, the uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 300s.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period How often, in seconds, the uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 300s.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param resourceGroup The group resource associated with the configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable Output<UptimeCheckConfigResourceGroupGetArgs> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup The group resource associated with the configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(UptimeCheckConfigResourceGroupGetArgs resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param selectedRegions The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions to include a minimum of 3 locations must be provided, or an error message is returned. Not specifying this field will result in uptime checks running from all regions.
         * 
         * @return builder
         * 
         */
        public Builder selectedRegions(@Nullable Output<List<String>> selectedRegions) {
            $.selectedRegions = selectedRegions;
            return this;
        }

        /**
         * @param selectedRegions The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions to include a minimum of 3 locations must be provided, or an error message is returned. Not specifying this field will result in uptime checks running from all regions.
         * 
         * @return builder
         * 
         */
        public Builder selectedRegions(List<String> selectedRegions) {
            return selectedRegions(Output.of(selectedRegions));
        }

        /**
         * @param selectedRegions The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions to include a minimum of 3 locations must be provided, or an error message is returned. Not specifying this field will result in uptime checks running from all regions.
         * 
         * @return builder
         * 
         */
        public Builder selectedRegions(String... selectedRegions) {
            return selectedRegions(List.of(selectedRegions));
        }

        /**
         * @param tcpCheck Contains information needed to make a TCP check.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tcpCheck(@Nullable Output<UptimeCheckConfigTcpCheckGetArgs> tcpCheck) {
            $.tcpCheck = tcpCheck;
            return this;
        }

        /**
         * @param tcpCheck Contains information needed to make a TCP check.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder tcpCheck(UptimeCheckConfigTcpCheckGetArgs tcpCheck) {
            return tcpCheck(Output.of(tcpCheck));
        }

        /**
         * @param timeout The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Accepted formats https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Accepted formats https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param uptimeCheckId The id of the uptime check
         * 
         * @return builder
         * 
         */
        public Builder uptimeCheckId(@Nullable Output<String> uptimeCheckId) {
            $.uptimeCheckId = uptimeCheckId;
            return this;
        }

        /**
         * @param uptimeCheckId The id of the uptime check
         * 
         * @return builder
         * 
         */
        public Builder uptimeCheckId(String uptimeCheckId) {
            return uptimeCheckId(Output.of(uptimeCheckId));
        }

        public UptimeCheckConfigState build() {
            return $;
        }
    }

}
