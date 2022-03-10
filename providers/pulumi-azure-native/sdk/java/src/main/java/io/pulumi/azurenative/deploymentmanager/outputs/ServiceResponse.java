// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.ServiceUnitResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceResponse {
    /**
     * Name of the service.
     * 
     */
    private final @Nullable String name;
    /**
     * The detailed information about the units that make up the service.
     * 
     */
    private final @Nullable List<ServiceUnitResponse> serviceUnits;
    /**
     * The Azure location to which the resources in the service belong to or should be deployed to.
     * 
     */
    private final String targetLocation;
    /**
     * The subscription to which the resources in the service belong to or should be deployed to.
     * 
     */
    private final String targetSubscriptionId;

    @OutputCustomType.Constructor
    private ServiceResponse(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("serviceUnits") @Nullable List<ServiceUnitResponse> serviceUnits,
        @OutputCustomType.Parameter("targetLocation") String targetLocation,
        @OutputCustomType.Parameter("targetSubscriptionId") String targetSubscriptionId) {
        this.name = name;
        this.serviceUnits = serviceUnits;
        this.targetLocation = targetLocation;
        this.targetSubscriptionId = targetSubscriptionId;
    }

    /**
     * Name of the service.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The detailed information about the units that make up the service.
     * 
    */
    public List<ServiceUnitResponse> getServiceUnits() {
        return this.serviceUnits == null ? List.of() : this.serviceUnits;
    }
    /**
     * The Azure location to which the resources in the service belong to or should be deployed to.
     * 
    */
    public String getTargetLocation() {
        return this.targetLocation;
    }
    /**
     * The subscription to which the resources in the service belong to or should be deployed to.
     * 
    */
    public String getTargetSubscriptionId() {
        return this.targetSubscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<ServiceUnitResponse> serviceUnits;
        private String targetLocation;
        private String targetSubscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.serviceUnits = defaults.serviceUnits;
    	      this.targetLocation = defaults.targetLocation;
    	      this.targetSubscriptionId = defaults.targetSubscriptionId;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder serviceUnits(@Nullable List<ServiceUnitResponse> serviceUnits) {
            this.serviceUnits = serviceUnits;
            return this;
        }

        public Builder targetLocation(String targetLocation) {
            this.targetLocation = Objects.requireNonNull(targetLocation);
            return this;
        }

        public Builder targetSubscriptionId(String targetSubscriptionId) {
            this.targetSubscriptionId = Objects.requireNonNull(targetSubscriptionId);
            return this;
        }
        public ServiceResponse build() {
            return new ServiceResponse(name, serviceUnits, targetLocation, targetSubscriptionId);
        }
    }
}
