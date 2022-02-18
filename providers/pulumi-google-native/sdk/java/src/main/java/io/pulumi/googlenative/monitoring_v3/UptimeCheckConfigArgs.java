// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.enums.UptimeCheckConfigCheckerType;
import io.pulumi.googlenative.monitoring_v3.enums.UptimeCheckConfigSelectedRegionsItem;
import io.pulumi.googlenative.monitoring_v3.inputs.ContentMatcherArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.HttpCheckArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.InternalCheckerArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.MonitoredResourceArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.ResourceGroupArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.TcpCheckArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UptimeCheckConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigArgs Empty = new UptimeCheckConfigArgs();

    /**
     * The type of checkers to use to execute the Uptime check.
     * 
     */
    @InputImport(name="checkerType")
    private final @Nullable Input<UptimeCheckConfigCheckerType> checkerType;

    public Input<UptimeCheckConfigCheckerType> getCheckerType() {
        return this.checkerType == null ? Input.empty() : this.checkerType;
    }

    /**
     * The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
     * 
     */
    @InputImport(name="contentMatchers")
    private final @Nullable Input<List<ContentMatcherArgs>> contentMatchers;

    public Input<List<ContentMatcherArgs>> getContentMatchers() {
        return this.contentMatchers == null ? Input.empty() : this.contentMatchers;
    }

    /**
     * A human-friendly name for the Uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced. Required.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * 
     */
    @InputImport(name="httpCheck")
    private final @Nullable Input<HttpCheckArgs> httpCheck;

    public Input<HttpCheckArgs> getHttpCheck() {
        return this.httpCheck == null ? Input.empty() : this.httpCheck;
    }

    /**
     * The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project that owns this UptimeCheckConfig.
     * 
     */
    @InputImport(name="internalCheckers")
    private final @Nullable Input<List<InternalCheckerArgs>> internalCheckers;

    public Input<List<InternalCheckerArgs>> getInternalCheckers() {
        return this.internalCheckers == null ? Input.empty() : this.internalCheckers;
    }

    /**
     * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then checks are made only from the 'selected_regions'. It is an error to provide 'selected_regions' when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
     * 
     */
    @InputImport(name="isInternal")
    private final @Nullable Input<Boolean> isInternal;

    public Input<Boolean> getIsInternal() {
        return this.isInternal == null ? Input.empty() : this.isInternal;
    }

    /**
     * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field: uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service
     * 
     */
    @InputImport(name="monitoredResource")
    private final @Nullable Input<MonitoredResourceArgs> monitoredResource;

    public Input<MonitoredResourceArgs> getMonitoredResource() {
        return this.monitoredResource == null ? Input.empty() : this.monitoredResource;
    }

    /**
     * A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the server and included in the response.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 60s.
     * 
     */
    @InputImport(name="period")
    private final @Nullable Input<String> period;

    public Input<String> getPeriod() {
        return this.period == null ? Input.empty() : this.period;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The group resource associated with the configuration.
     * 
     */
    @InputImport(name="resourceGroup")
    private final @Nullable Input<ResourceGroupArgs> resourceGroup;

    public Input<ResourceGroupArgs> getResourceGroup() {
        return this.resourceGroup == null ? Input.empty() : this.resourceGroup;
    }

    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
     * 
     */
    @InputImport(name="selectedRegions")
    private final @Nullable Input<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions;

    public Input<List<UptimeCheckConfigSelectedRegionsItem>> getSelectedRegions() {
        return this.selectedRegions == null ? Input.empty() : this.selectedRegions;
    }

    /**
     * Contains information needed to make a TCP check.
     * 
     */
    @InputImport(name="tcpCheck")
    private final @Nullable Input<TcpCheckArgs> tcpCheck;

    public Input<TcpCheckArgs> getTcpCheck() {
        return this.tcpCheck == null ? Input.empty() : this.tcpCheck;
    }

    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public UptimeCheckConfigArgs(
        @Nullable Input<UptimeCheckConfigCheckerType> checkerType,
        @Nullable Input<List<ContentMatcherArgs>> contentMatchers,
        @Nullable Input<String> displayName,
        @Nullable Input<HttpCheckArgs> httpCheck,
        @Nullable Input<List<InternalCheckerArgs>> internalCheckers,
        @Nullable Input<Boolean> isInternal,
        @Nullable Input<MonitoredResourceArgs> monitoredResource,
        @Nullable Input<String> name,
        @Nullable Input<String> period,
        @Nullable Input<String> project,
        @Nullable Input<ResourceGroupArgs> resourceGroup,
        @Nullable Input<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions,
        @Nullable Input<TcpCheckArgs> tcpCheck,
        @Nullable Input<String> timeout) {
        this.checkerType = checkerType;
        this.contentMatchers = contentMatchers;
        this.displayName = displayName;
        this.httpCheck = httpCheck;
        this.internalCheckers = internalCheckers;
        this.isInternal = isInternal;
        this.monitoredResource = monitoredResource;
        this.name = name;
        this.period = period;
        this.project = project;
        this.resourceGroup = resourceGroup;
        this.selectedRegions = selectedRegions;
        this.tcpCheck = tcpCheck;
        this.timeout = timeout;
    }

    private UptimeCheckConfigArgs() {
        this.checkerType = Input.empty();
        this.contentMatchers = Input.empty();
        this.displayName = Input.empty();
        this.httpCheck = Input.empty();
        this.internalCheckers = Input.empty();
        this.isInternal = Input.empty();
        this.monitoredResource = Input.empty();
        this.name = Input.empty();
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
        private @Nullable Input<UptimeCheckConfigCheckerType> checkerType;
        private @Nullable Input<List<ContentMatcherArgs>> contentMatchers;
        private @Nullable Input<String> displayName;
        private @Nullable Input<HttpCheckArgs> httpCheck;
        private @Nullable Input<List<InternalCheckerArgs>> internalCheckers;
        private @Nullable Input<Boolean> isInternal;
        private @Nullable Input<MonitoredResourceArgs> monitoredResource;
        private @Nullable Input<String> name;
        private @Nullable Input<String> period;
        private @Nullable Input<String> project;
        private @Nullable Input<ResourceGroupArgs> resourceGroup;
        private @Nullable Input<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions;
        private @Nullable Input<TcpCheckArgs> tcpCheck;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkerType = defaults.checkerType;
    	      this.contentMatchers = defaults.contentMatchers;
    	      this.displayName = defaults.displayName;
    	      this.httpCheck = defaults.httpCheck;
    	      this.internalCheckers = defaults.internalCheckers;
    	      this.isInternal = defaults.isInternal;
    	      this.monitoredResource = defaults.monitoredResource;
    	      this.name = defaults.name;
    	      this.period = defaults.period;
    	      this.project = defaults.project;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.selectedRegions = defaults.selectedRegions;
    	      this.tcpCheck = defaults.tcpCheck;
    	      this.timeout = defaults.timeout;
        }

        public Builder setCheckerType(@Nullable Input<UptimeCheckConfigCheckerType> checkerType) {
            this.checkerType = checkerType;
            return this;
        }

        public Builder setCheckerType(@Nullable UptimeCheckConfigCheckerType checkerType) {
            this.checkerType = Input.ofNullable(checkerType);
            return this;
        }

        public Builder setContentMatchers(@Nullable Input<List<ContentMatcherArgs>> contentMatchers) {
            this.contentMatchers = contentMatchers;
            return this;
        }

        public Builder setContentMatchers(@Nullable List<ContentMatcherArgs> contentMatchers) {
            this.contentMatchers = Input.ofNullable(contentMatchers);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setHttpCheck(@Nullable Input<HttpCheckArgs> httpCheck) {
            this.httpCheck = httpCheck;
            return this;
        }

        public Builder setHttpCheck(@Nullable HttpCheckArgs httpCheck) {
            this.httpCheck = Input.ofNullable(httpCheck);
            return this;
        }

        public Builder setInternalCheckers(@Nullable Input<List<InternalCheckerArgs>> internalCheckers) {
            this.internalCheckers = internalCheckers;
            return this;
        }

        public Builder setInternalCheckers(@Nullable List<InternalCheckerArgs> internalCheckers) {
            this.internalCheckers = Input.ofNullable(internalCheckers);
            return this;
        }

        public Builder setIsInternal(@Nullable Input<Boolean> isInternal) {
            this.isInternal = isInternal;
            return this;
        }

        public Builder setIsInternal(@Nullable Boolean isInternal) {
            this.isInternal = Input.ofNullable(isInternal);
            return this;
        }

        public Builder setMonitoredResource(@Nullable Input<MonitoredResourceArgs> monitoredResource) {
            this.monitoredResource = monitoredResource;
            return this;
        }

        public Builder setMonitoredResource(@Nullable MonitoredResourceArgs monitoredResource) {
            this.monitoredResource = Input.ofNullable(monitoredResource);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPeriod(@Nullable Input<String> period) {
            this.period = period;
            return this;
        }

        public Builder setPeriod(@Nullable String period) {
            this.period = Input.ofNullable(period);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setResourceGroup(@Nullable Input<ResourceGroupArgs> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceGroup(@Nullable ResourceGroupArgs resourceGroup) {
            this.resourceGroup = Input.ofNullable(resourceGroup);
            return this;
        }

        public Builder setSelectedRegions(@Nullable Input<List<UptimeCheckConfigSelectedRegionsItem>> selectedRegions) {
            this.selectedRegions = selectedRegions;
            return this;
        }

        public Builder setSelectedRegions(@Nullable List<UptimeCheckConfigSelectedRegionsItem> selectedRegions) {
            this.selectedRegions = Input.ofNullable(selectedRegions);
            return this;
        }

        public Builder setTcpCheck(@Nullable Input<TcpCheckArgs> tcpCheck) {
            this.tcpCheck = tcpCheck;
            return this;
        }

        public Builder setTcpCheck(@Nullable TcpCheckArgs tcpCheck) {
            this.tcpCheck = Input.ofNullable(tcpCheck);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public UptimeCheckConfigArgs build() {
            return new UptimeCheckConfigArgs(checkerType, contentMatchers, displayName, httpCheck, internalCheckers, isInternal, monitoredResource, name, period, project, resourceGroup, selectedRegions, tcpCheck, timeout);
        }
    }
}
