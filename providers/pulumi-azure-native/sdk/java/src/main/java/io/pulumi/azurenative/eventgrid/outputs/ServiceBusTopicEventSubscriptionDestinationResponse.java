// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceBusTopicEventSubscriptionDestinationResponse {
    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'ServiceBusTopic'.
     * 
     */
    private final String endpointType;
    /**
     * The Azure Resource Id that represents the endpoint of the Service Bus Topic destination of an event subscription.
     * 
     */
    private final @Nullable String resourceId;

    @OutputCustomType.Constructor
    private ServiceBusTopicEventSubscriptionDestinationResponse(
        @OutputCustomType.Parameter("endpointType") String endpointType,
        @OutputCustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.endpointType = endpointType;
        this.resourceId = resourceId;
    }

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'ServiceBusTopic'.
     * 
    */
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * The Azure Resource Id that represents the endpoint of the Service Bus Topic destination of an event subscription.
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusTopicEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusTopicEventSubscriptionDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public ServiceBusTopicEventSubscriptionDestinationResponse build() {
            return new ServiceBusTopicEventSubscriptionDestinationResponse(endpointType, resourceId);
        }
    }
}
