// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceArgs;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigResourceGroupArgs;
import io.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UptimeCheckConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigArgs Empty = new UptimeCheckConfigArgs();

    /**
     * The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response's content. This field is optional and should only be specified if a content match is required.
     * Structure is documented below.
     * 
     */
    @InputImport(name="contentMatchers")
      private final @Nullable Input<List<UptimeCheckConfigContentMatcherArgs>> contentMatchers;

    public Input<List<UptimeCheckConfigContentMatcherArgs>> getContentMatchers() {
        return this.contentMatchers == null ? Input.empty() : this.contentMatchers;
    }

    /**
     * A human-friendly name for the uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * Structure is documented below.
     * 
     */
    @InputImport(name="httpCheck")
      private final @Nullable Input<UptimeCheckConfigHttpCheckArgs> httpCheck;

    public Input<UptimeCheckConfigHttpCheckArgs> getHttpCheck() {
        return this.httpCheck == null ? Input.empty() : this.httpCheck;
    }

    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are supported for uptime checks:  uptime_url  gce_instance  gae_app  aws_ec2_instance  aws_elb_load_balancer
     * Structure is documented below.
     * 
     */
    @InputImport(name="monitoredResource")
      private final @Nullable Input<UptimeCheckConfigMonitoredResourceArgs> monitoredResource;

    public Input<UptimeCheckConfigMonitoredResourceArgs> getMonitoredResource() {
        return this.monitoredResource == null ? Input.empty() : this.monitoredResource;
    }

    /**
     * How often, in seconds, the uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 300s.
     * 
     */
    @InputImport(name="period")
      private final @Nullable Input<String> period;

    public Input<String> getPeriod() {
        return this.period == null ? Input.empty() : this.period;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The group resource associated with the configuration.
     * Structure is documented below.
     * 
     */
    @InputImport(name="resourceGroup")
      private final @Nullable Input<UptimeCheckConfigResourceGroupArgs> resourceGroup;

    public Input<UptimeCheckConfigResourceGroupArgs> getResourceGroup() {
        return this.resourceGroup == null ? Input.empty() : this.resourceGroup;
    }

    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions to include a minimum of 3 locations must be provided, or an error message is returned. Not specifying this field will result in uptime checks running from all regions.
     * 
     */
    @InputImport(name="selectedRegions")
      private final @Nullable Input<List<String>> selectedRegions;

    public Input<List<String>> getSelectedRegions() {
        return this.selectedRegions == null ? Input.empty() : this.selectedRegions;
    }

    /**
     * Contains information needed to make a TCP check.
     * Structure is documented below.
     * 
     */
    @InputImport(name="tcpCheck")
      private final @Nullable Input<UptimeCheckConfigTcpCheckArgs> tcpCheck;

    public Input<UptimeCheckConfigTcpCheckArgs> getTcpCheck() {
        return this.tcpCheck == null ? Input.empty() : this.tcpCheck;
    }

    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Accepted formats https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration
     * 
     */
    @InputImport(name="timeout", required=true)
      private final Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout;
    }

    public UptimeCheckConfigArgs(
        @Nullable Input<List<UptimeCheckConfigContentMatcherArgs>> contentMatchers,
        Input<String> displayName,
        @Nullable Input<UptimeCheckConfigHttpCheckArgs> httpCheck,
        @Nullable Input<UptimeCheckConfigMonitoredResourceArgs> monitoredResource,
        @Nullable Input<String> period,
        @Nullable Input<String> project,
        @Nullable Input<UptimeCheckConfigResourceGroupArgs> resourceGroup,
        @Nullable Input<List<String>> selectedRegions,
        @Nullable Input<UptimeCheckConfigTcpCheckArgs> tcpCheck,
        Input<String> timeout) {
        this.contentMatchers = contentMatchers;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.httpCheck = httpCheck;
        this.monitoredResource = monitoredResource;
        this.period = period;
        this.project = project;
        this.resourceGroup = resourceGroup;
        this.selectedRegions = selectedRegions;
        this.tcpCheck = tcpCheck;
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
    }

    private UptimeCheckConfigArgs() {
        this.contentMatchers = Input.empty();
        this.displayName = Input.empty();
        this.httpCheck = Input.empty();
        this.monitoredResource = Input.empty();
        this.period = Input.empty();
        this.project = Input.empty();
        this.resourceGroup = Input.empty();
        this.selectedRegions = Input.empty();
        this.tcpCheck = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<UptimeCheckConfigContentMatcherArgs>> contentMatchers;
        private Input<String> displayName;
        private @Nullable Input<UptimeCheckConfigHttpCheckArgs> httpCheck;
        private @Nullable Input<UptimeCheckConfigMonitoredResourceArgs> monitoredResource;
        private @Nullable Input<String> period;
        private @Nullable Input<String> project;
        private @Nullable Input<UptimeCheckConfigResourceGroupArgs> resourceGroup;
        private @Nullable Input<List<String>> selectedRegions;
        private @Nullable Input<UptimeCheckConfigTcpCheckArgs> tcpCheck;
        private Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentMatchers = defaults.contentMatchers;
    	      this.displayName = defaults.displayName;
    	      this.httpCheck = defaults.httpCheck;
    	      this.monitoredResource = defaults.monitoredResource;
    	      this.period = defaults.period;
    	      this.project = defaults.project;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.selectedRegions = defaults.selectedRegions;
    	      this.tcpCheck = defaults.tcpCheck;
    	      this.timeout = defaults.timeout;
        }

        public Builder contentMatchers(@Nullable Input<List<UptimeCheckConfigContentMatcherArgs>> contentMatchers) {
            this.contentMatchers = contentMatchers;
            return this;
        }

        public Builder contentMatchers(@Nullable List<UptimeCheckConfigContentMatcherArgs> contentMatchers) {
            this.contentMatchers = Input.ofNullable(contentMatchers);
            return this;
        }

        public Builder displayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder httpCheck(@Nullable Input<UptimeCheckConfigHttpCheckArgs> httpCheck) {
            this.httpCheck = httpCheck;
            return this;
        }

        public Builder httpCheck(@Nullable UptimeCheckConfigHttpCheckArgs httpCheck) {
            this.httpCheck = Input.ofNullable(httpCheck);
            return this;
        }

        public Builder monitoredResource(@Nullable Input<UptimeCheckConfigMonitoredResourceArgs> monitoredResource) {
            this.monitoredResource = monitoredResource;
            return this;
        }

        public Builder monitoredResource(@Nullable UptimeCheckConfigMonitoredResourceArgs monitoredResource) {
            this.monitoredResource = Input.ofNullable(monitoredResource);
            return this;
        }

        public Builder period(@Nullable Input<String> period) {
            this.period = period;
            return this;
        }

        public Builder period(@Nullable String period) {
            this.period = Input.ofNullable(period);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder resourceGroup(@Nullable Input<UptimeCheckConfigResourceGroupArgs> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder resourceGroup(@Nullable UptimeCheckConfigResourceGroupArgs resourceGroup) {
            this.resourceGroup = Input.ofNullable(resourceGroup);
            return this;
        }

        public Builder selectedRegions(@Nullable Input<List<String>> selectedRegions) {
            this.selectedRegions = selectedRegions;
            return this;
        }

        public Builder selectedRegions(@Nullable List<String> selectedRegions) {
            this.selectedRegions = Input.ofNullable(selectedRegions);
            return this;
        }

        public Builder tcpCheck(@Nullable Input<UptimeCheckConfigTcpCheckArgs> tcpCheck) {
            this.tcpCheck = tcpCheck;
            return this;
        }

        public Builder tcpCheck(@Nullable UptimeCheckConfigTcpCheckArgs tcpCheck) {
            this.tcpCheck = Input.ofNullable(tcpCheck);
            return this;
        }

        public Builder timeout(Input<String> timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder timeout(String timeout) {
            this.timeout = Input.of(Objects.requireNonNull(timeout));
            return this;
        }
        public UptimeCheckConfigArgs build() {
            return new UptimeCheckConfigArgs(contentMatchers, displayName, httpCheck, monitoredResource, period, project, resourceGroup, selectedRegions, tcpCheck, timeout);
        }
    }
}
