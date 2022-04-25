// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.CapacityReservationGroupInstanceViewResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCapacityReservationGroupResult {
    /**
     * @return A list of all capacity reservation resource ids that belong to capacity reservation group.
     * 
     */
    private final List<SubResourceReadOnlyResponse> capacityReservations;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return The capacity reservation group instance view which has the list of instance views for all the capacity reservations that belong to the capacity reservation group.
     * 
     */
    private final CapacityReservationGroupInstanceViewResponse instanceView;
    /**
     * @return Resource location
     * 
     */
    private final String location;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private final String type;
    /**
     * @return A list of references to all virtual machines associated to the capacity reservation group.
     * 
     */
    private final List<SubResourceReadOnlyResponse> virtualMachinesAssociated;
    /**
     * @return Availability Zones to use for this capacity reservation group. The zones can be assigned only during creation. If not provided, the group supports only regional resources in the region. If provided, enforces each capacity reservation in the group to be in one of the zones.
     * 
     */
    private final @Nullable List<String> zones;

    @CustomType.Constructor
    private GetCapacityReservationGroupResult(
        @CustomType.Parameter("capacityReservations") List<SubResourceReadOnlyResponse> capacityReservations,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceView") CapacityReservationGroupInstanceViewResponse instanceView,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualMachinesAssociated") List<SubResourceReadOnlyResponse> virtualMachinesAssociated,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.capacityReservations = capacityReservations;
        this.id = id;
        this.instanceView = instanceView;
        this.location = location;
        this.name = name;
        this.tags = tags;
        this.type = type;
        this.virtualMachinesAssociated = virtualMachinesAssociated;
        this.zones = zones;
    }

    /**
     * @return A list of all capacity reservation resource ids that belong to capacity reservation group.
     * 
     */
    public List<SubResourceReadOnlyResponse> capacityReservations() {
        return this.capacityReservations;
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The capacity reservation group instance view which has the list of instance views for all the capacity reservations that belong to the capacity reservation group.
     * 
     */
    public CapacityReservationGroupInstanceViewResponse instanceView() {
        return this.instanceView;
    }
    /**
     * @return Resource location
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return A list of references to all virtual machines associated to the capacity reservation group.
     * 
     */
    public List<SubResourceReadOnlyResponse> virtualMachinesAssociated() {
        return this.virtualMachinesAssociated;
    }
    /**
     * @return Availability Zones to use for this capacity reservation group. The zones can be assigned only during creation. If not provided, the group supports only regional resources in the region. If provided, enforces each capacity reservation in the group to be in one of the zones.
     * 
     */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityReservationGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SubResourceReadOnlyResponse> capacityReservations;
        private String id;
        private CapacityReservationGroupInstanceViewResponse instanceView;
        private String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;
        private List<SubResourceReadOnlyResponse> virtualMachinesAssociated;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityReservationGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservations = defaults.capacityReservations;
    	      this.id = defaults.id;
    	      this.instanceView = defaults.instanceView;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualMachinesAssociated = defaults.virtualMachinesAssociated;
    	      this.zones = defaults.zones;
        }

        public Builder capacityReservations(List<SubResourceReadOnlyResponse> capacityReservations) {
            this.capacityReservations = Objects.requireNonNull(capacityReservations);
            return this;
        }
        public Builder capacityReservations(SubResourceReadOnlyResponse... capacityReservations) {
            return capacityReservations(List.of(capacityReservations));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceView(CapacityReservationGroupInstanceViewResponse instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualMachinesAssociated(List<SubResourceReadOnlyResponse> virtualMachinesAssociated) {
            this.virtualMachinesAssociated = Objects.requireNonNull(virtualMachinesAssociated);
            return this;
        }
        public Builder virtualMachinesAssociated(SubResourceReadOnlyResponse... virtualMachinesAssociated) {
            return virtualMachinesAssociated(List.of(virtualMachinesAssociated));
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public GetCapacityReservationGroupResult build() {
            return new GetCapacityReservationGroupResult(capacityReservations, id, instanceView, location, name, tags, type, virtualMachinesAssociated, zones);
        }
    }
}
