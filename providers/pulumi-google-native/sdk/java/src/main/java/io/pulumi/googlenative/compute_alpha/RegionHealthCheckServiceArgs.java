// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.RegionHealthCheckServiceHealthStatusAggregationPolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionHealthCheckServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionHealthCheckServiceArgs Empty = new RegionHealthCheckServiceArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A list of URLs to the HealthCheck resources. Must have at least one HealthCheck, and not more than 10. HealthCheck resources must have portSpecification=USE_SERVING_PORT or portSpecification=USE_FIXED_PORT. For regional HealthCheckService, the HealthCheck must be regional and in the same region. For global HealthCheckService, HealthCheck must be global. Mix of regional and global HealthChecks is not supported. Multiple regional HealthChecks must belong to the same region. Regional HealthChecks must belong to the same region as zones of NEGs.
     * 
     */
    @InputImport(name="healthChecks")
      private final @Nullable Input<List<String>> healthChecks;

    public Input<List<String>> getHealthChecks() {
        return this.healthChecks == null ? Input.empty() : this.healthChecks;
    }

    /**
     * Optional. Policy for how the results from multiple health checks for the same endpoint are aggregated. Defaults to NO_AGGREGATION if unspecified. - NO_AGGREGATION. An EndpointHealth message is returned for each pair in the health check service. - AND. If any health check of an endpoint reports UNHEALTHY, then UNHEALTHY is the HealthState of the endpoint. If all health checks report HEALTHY, the HealthState of the endpoint is HEALTHY. .
     * 
     */
    @InputImport(name="healthStatusAggregationPolicy")
      private final @Nullable Input<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy;

    public Input<RegionHealthCheckServiceHealthStatusAggregationPolicy> getHealthStatusAggregationPolicy() {
        return this.healthStatusAggregationPolicy == null ? Input.empty() : this.healthStatusAggregationPolicy;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of URLs to the NetworkEndpointGroup resources. Must not have more than 100. For regional HealthCheckService, NEGs must be in zones in the region of the HealthCheckService.
     * 
     */
    @InputImport(name="networkEndpointGroups")
      private final @Nullable Input<List<String>> networkEndpointGroups;

    public Input<List<String>> getNetworkEndpointGroups() {
        return this.networkEndpointGroups == null ? Input.empty() : this.networkEndpointGroups;
    }

    /**
     * A list of URLs to the NotificationEndpoint resources. Must not have more than 10. A list of endpoints for receiving notifications of change in health status. For regional HealthCheckService, NotificationEndpoint must be regional and in the same region. For global HealthCheckService, NotificationEndpoint must be global.
     * 
     */
    @InputImport(name="notificationEndpoints")
      private final @Nullable Input<List<String>> notificationEndpoints;

    public Input<List<String>> getNotificationEndpoints() {
        return this.notificationEndpoints == null ? Input.empty() : this.notificationEndpoints;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    public RegionHealthCheckServiceArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> healthChecks,
        @Nullable Input<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> networkEndpointGroups,
        @Nullable Input<List<String>> notificationEndpoints,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId) {
        this.description = description;
        this.healthChecks = healthChecks;
        this.healthStatusAggregationPolicy = healthStatusAggregationPolicy;
        this.name = name;
        this.networkEndpointGroups = networkEndpointGroups;
        this.notificationEndpoints = notificationEndpoints;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
    }

    private RegionHealthCheckServiceArgs() {
        this.description = Input.empty();
        this.healthChecks = Input.empty();
        this.healthStatusAggregationPolicy = Input.empty();
        this.name = Input.empty();
        this.networkEndpointGroups = Input.empty();
        this.notificationEndpoints = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionHealthCheckServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> healthChecks;
        private @Nullable Input<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> networkEndpointGroups;
        private @Nullable Input<List<String>> notificationEndpoints;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionHealthCheckServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.healthChecks = defaults.healthChecks;
    	      this.healthStatusAggregationPolicy = defaults.healthStatusAggregationPolicy;
    	      this.name = defaults.name;
    	      this.networkEndpointGroups = defaults.networkEndpointGroups;
    	      this.notificationEndpoints = defaults.notificationEndpoints;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder healthChecks(@Nullable Input<List<String>> healthChecks) {
            this.healthChecks = healthChecks;
            return this;
        }

        public Builder healthChecks(@Nullable List<String> healthChecks) {
            this.healthChecks = Input.ofNullable(healthChecks);
            return this;
        }

        public Builder healthStatusAggregationPolicy(@Nullable Input<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy) {
            this.healthStatusAggregationPolicy = healthStatusAggregationPolicy;
            return this;
        }

        public Builder healthStatusAggregationPolicy(@Nullable RegionHealthCheckServiceHealthStatusAggregationPolicy healthStatusAggregationPolicy) {
            this.healthStatusAggregationPolicy = Input.ofNullable(healthStatusAggregationPolicy);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder networkEndpointGroups(@Nullable Input<List<String>> networkEndpointGroups) {
            this.networkEndpointGroups = networkEndpointGroups;
            return this;
        }

        public Builder networkEndpointGroups(@Nullable List<String> networkEndpointGroups) {
            this.networkEndpointGroups = Input.ofNullable(networkEndpointGroups);
            return this;
        }

        public Builder notificationEndpoints(@Nullable Input<List<String>> notificationEndpoints) {
            this.notificationEndpoints = notificationEndpoints;
            return this;
        }

        public Builder notificationEndpoints(@Nullable List<String> notificationEndpoints) {
            this.notificationEndpoints = Input.ofNullable(notificationEndpoints);
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

        public Builder region(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }
        public RegionHealthCheckServiceArgs build() {
            return new RegionHealthCheckServiceArgs(description, healthChecks, healthStatusAggregationPolicy, name, networkEndpointGroups, notificationEndpoints, project, region, requestId);
        }
    }
}
