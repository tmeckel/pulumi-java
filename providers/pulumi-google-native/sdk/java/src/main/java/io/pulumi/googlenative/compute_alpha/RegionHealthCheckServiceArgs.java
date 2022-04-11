// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A list of URLs to the HealthCheck resources. Must have at least one HealthCheck, and not more than 10. HealthCheck resources must have portSpecification=USE_SERVING_PORT or portSpecification=USE_FIXED_PORT. For regional HealthCheckService, the HealthCheck must be regional and in the same region. For global HealthCheckService, HealthCheck must be global. Mix of regional and global HealthChecks is not supported. Multiple regional HealthChecks must belong to the same region. Regional HealthChecks must belong to the same region as zones of NEGs.
     * 
     */
    @Import(name="healthChecks")
      private final @Nullable Output<List<String>> healthChecks;

    public Output<List<String>> getHealthChecks() {
        return this.healthChecks == null ? Codegen.empty() : this.healthChecks;
    }

    /**
     * Optional. Policy for how the results from multiple health checks for the same endpoint are aggregated. Defaults to NO_AGGREGATION if unspecified. - NO_AGGREGATION. An EndpointHealth message is returned for each pair in the health check service. - AND. If any health check of an endpoint reports UNHEALTHY, then UNHEALTHY is the HealthState of the endpoint. If all health checks report HEALTHY, the HealthState of the endpoint is HEALTHY. .
     * 
     */
    @Import(name="healthStatusAggregationPolicy")
      private final @Nullable Output<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy;

    public Output<RegionHealthCheckServiceHealthStatusAggregationPolicy> getHealthStatusAggregationPolicy() {
        return this.healthStatusAggregationPolicy == null ? Codegen.empty() : this.healthStatusAggregationPolicy;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of URLs to the NetworkEndpointGroup resources. Must not have more than 100. For regional HealthCheckService, NEGs must be in zones in the region of the HealthCheckService.
     * 
     */
    @Import(name="networkEndpointGroups")
      private final @Nullable Output<List<String>> networkEndpointGroups;

    public Output<List<String>> getNetworkEndpointGroups() {
        return this.networkEndpointGroups == null ? Codegen.empty() : this.networkEndpointGroups;
    }

    /**
     * A list of URLs to the NotificationEndpoint resources. Must not have more than 10. A list of endpoints for receiving notifications of change in health status. For regional HealthCheckService, NotificationEndpoint must be regional and in the same region. For global HealthCheckService, NotificationEndpoint must be global.
     * 
     */
    @Import(name="notificationEndpoints")
      private final @Nullable Output<List<String>> notificationEndpoints;

    public Output<List<String>> getNotificationEndpoints() {
        return this.notificationEndpoints == null ? Codegen.empty() : this.notificationEndpoints;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    public RegionHealthCheckServiceArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> healthChecks,
        @Nullable Output<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> networkEndpointGroups,
        @Nullable Output<List<String>> notificationEndpoints,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId) {
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
        this.description = Codegen.empty();
        this.healthChecks = Codegen.empty();
        this.healthStatusAggregationPolicy = Codegen.empty();
        this.name = Codegen.empty();
        this.networkEndpointGroups = Codegen.empty();
        this.notificationEndpoints = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionHealthCheckServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> healthChecks;
        private @Nullable Output<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> networkEndpointGroups;
        private @Nullable Output<List<String>> notificationEndpoints;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;

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

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder healthChecks(@Nullable Output<List<String>> healthChecks) {
            this.healthChecks = healthChecks;
            return this;
        }
        public Builder healthChecks(@Nullable List<String> healthChecks) {
            this.healthChecks = Codegen.ofNullable(healthChecks);
            return this;
        }
        public Builder healthChecks(String... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }
        public Builder healthStatusAggregationPolicy(@Nullable Output<RegionHealthCheckServiceHealthStatusAggregationPolicy> healthStatusAggregationPolicy) {
            this.healthStatusAggregationPolicy = healthStatusAggregationPolicy;
            return this;
        }
        public Builder healthStatusAggregationPolicy(@Nullable RegionHealthCheckServiceHealthStatusAggregationPolicy healthStatusAggregationPolicy) {
            this.healthStatusAggregationPolicy = Codegen.ofNullable(healthStatusAggregationPolicy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder networkEndpointGroups(@Nullable Output<List<String>> networkEndpointGroups) {
            this.networkEndpointGroups = networkEndpointGroups;
            return this;
        }
        public Builder networkEndpointGroups(@Nullable List<String> networkEndpointGroups) {
            this.networkEndpointGroups = Codegen.ofNullable(networkEndpointGroups);
            return this;
        }
        public Builder networkEndpointGroups(String... networkEndpointGroups) {
            return networkEndpointGroups(List.of(networkEndpointGroups));
        }
        public Builder notificationEndpoints(@Nullable Output<List<String>> notificationEndpoints) {
            this.notificationEndpoints = notificationEndpoints;
            return this;
        }
        public Builder notificationEndpoints(@Nullable List<String> notificationEndpoints) {
            this.notificationEndpoints = Codegen.ofNullable(notificationEndpoints);
            return this;
        }
        public Builder notificationEndpoints(String... notificationEndpoints) {
            return notificationEndpoints(List.of(notificationEndpoints));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }        public RegionHealthCheckServiceArgs build() {
            return new RegionHealthCheckServiceArgs(description, healthChecks, healthStatusAggregationPolicy, name, networkEndpointGroups, notificationEndpoints, project, region, requestId);
        }
    }
}
