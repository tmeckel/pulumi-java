// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.inputs.EnrichmentPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.FallbackRoutePropertiesArgs;
import io.pulumi.azurenative.devices.inputs.RoutePropertiesArgs;
import io.pulumi.azurenative.devices.inputs.RoutingEndpointsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The routing related properties of the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
 * 
 */
public final class RoutingPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingPropertiesArgs Empty = new RoutingPropertiesArgs();

    /**
     * The properties related to the custom endpoints to which your IoT hub routes messages based on the routing rules. A maximum of 10 custom endpoints are allowed across all endpoint types for paid hubs and only 1 custom endpoint is allowed across all endpoint types for free hubs.
     * 
     */
    @InputImport(name="endpoints")
      private final @Nullable Input<RoutingEndpointsArgs> endpoints;

    public Input<RoutingEndpointsArgs> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    /**
     * The list of user-provided enrichments that the IoT hub applies to messages to be delivered to built-in and custom endpoints. See: https://aka.ms/telemetryoneventgrid
     * 
     */
    @InputImport(name="enrichments")
      private final @Nullable Input<List<EnrichmentPropertiesArgs>> enrichments;

    public Input<List<EnrichmentPropertiesArgs>> getEnrichments() {
        return this.enrichments == null ? Input.empty() : this.enrichments;
    }

    /**
     * The properties of the route that is used as a fall-back route when none of the conditions specified in the 'routes' section are met. This is an optional parameter. When this property is not set, the messages which do not meet any of the conditions specified in the 'routes' section get routed to the built-in eventhub endpoint.
     * 
     */
    @InputImport(name="fallbackRoute")
      private final @Nullable Input<FallbackRoutePropertiesArgs> fallbackRoute;

    public Input<FallbackRoutePropertiesArgs> getFallbackRoute() {
        return this.fallbackRoute == null ? Input.empty() : this.fallbackRoute;
    }

    /**
     * The list of user-provided routing rules that the IoT hub uses to route messages to built-in and custom endpoints. A maximum of 100 routing rules are allowed for paid hubs and a maximum of 5 routing rules are allowed for free hubs.
     * 
     */
    @InputImport(name="routes")
      private final @Nullable Input<List<RoutePropertiesArgs>> routes;

    public Input<List<RoutePropertiesArgs>> getRoutes() {
        return this.routes == null ? Input.empty() : this.routes;
    }

    public RoutingPropertiesArgs(
        @Nullable Input<RoutingEndpointsArgs> endpoints,
        @Nullable Input<List<EnrichmentPropertiesArgs>> enrichments,
        @Nullable Input<FallbackRoutePropertiesArgs> fallbackRoute,
        @Nullable Input<List<RoutePropertiesArgs>> routes) {
        this.endpoints = endpoints;
        this.enrichments = enrichments;
        this.fallbackRoute = fallbackRoute;
        this.routes = routes;
    }

    private RoutingPropertiesArgs() {
        this.endpoints = Input.empty();
        this.enrichments = Input.empty();
        this.fallbackRoute = Input.empty();
        this.routes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RoutingEndpointsArgs> endpoints;
        private @Nullable Input<List<EnrichmentPropertiesArgs>> enrichments;
        private @Nullable Input<FallbackRoutePropertiesArgs> fallbackRoute;
        private @Nullable Input<List<RoutePropertiesArgs>> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.enrichments = defaults.enrichments;
    	      this.fallbackRoute = defaults.fallbackRoute;
    	      this.routes = defaults.routes;
        }

        public Builder endpoints(@Nullable Input<RoutingEndpointsArgs> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(@Nullable RoutingEndpointsArgs endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder enrichments(@Nullable Input<List<EnrichmentPropertiesArgs>> enrichments) {
            this.enrichments = enrichments;
            return this;
        }

        public Builder enrichments(@Nullable List<EnrichmentPropertiesArgs> enrichments) {
            this.enrichments = Input.ofNullable(enrichments);
            return this;
        }

        public Builder fallbackRoute(@Nullable Input<FallbackRoutePropertiesArgs> fallbackRoute) {
            this.fallbackRoute = fallbackRoute;
            return this;
        }

        public Builder fallbackRoute(@Nullable FallbackRoutePropertiesArgs fallbackRoute) {
            this.fallbackRoute = Input.ofNullable(fallbackRoute);
            return this;
        }

        public Builder routes(@Nullable Input<List<RoutePropertiesArgs>> routes) {
            this.routes = routes;
            return this;
        }

        public Builder routes(@Nullable List<RoutePropertiesArgs> routes) {
            this.routes = Input.ofNullable(routes);
            return this;
        }
        public RoutingPropertiesArgs build() {
            return new RoutingPropertiesArgs(endpoints, enrichments, fallbackRoute, routes);
        }
    }
}
