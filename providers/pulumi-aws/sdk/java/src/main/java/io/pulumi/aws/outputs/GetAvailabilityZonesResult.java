// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.aws.outputs.GetAvailabilityZonesFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAvailabilityZonesResult {
    private final @Nullable Boolean allAvailabilityZones;
    private final @Nullable List<String> excludeNames;
    private final @Nullable List<String> excludeZoneIds;
    private final @Nullable List<GetAvailabilityZonesFilter> filters;
    private final List<String> groupNames;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A list of the Availability Zone names available to the account.
     * 
     */
    private final List<String> names;
    private final @Nullable String state;
    /**
     * A list of the Availability Zone IDs available to the account.
     * 
     */
    private final List<String> zoneIds;

    @OutputCustomType.Constructor
    private GetAvailabilityZonesResult(
        @OutputCustomType.Parameter("allAvailabilityZones") @Nullable Boolean allAvailabilityZones,
        @OutputCustomType.Parameter("excludeNames") @Nullable List<String> excludeNames,
        @OutputCustomType.Parameter("excludeZoneIds") @Nullable List<String> excludeZoneIds,
        @OutputCustomType.Parameter("filters") @Nullable List<GetAvailabilityZonesFilter> filters,
        @OutputCustomType.Parameter("groupNames") List<String> groupNames,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("names") List<String> names,
        @OutputCustomType.Parameter("state") @Nullable String state,
        @OutputCustomType.Parameter("zoneIds") List<String> zoneIds) {
        this.allAvailabilityZones = allAvailabilityZones;
        this.excludeNames = excludeNames;
        this.excludeZoneIds = excludeZoneIds;
        this.filters = filters;
        this.groupNames = groupNames;
        this.id = id;
        this.names = names;
        this.state = state;
        this.zoneIds = zoneIds;
    }

    public Optional<Boolean> getAllAvailabilityZones() {
        return Optional.ofNullable(this.allAvailabilityZones);
    }
    public List<String> getExcludeNames() {
        return this.excludeNames == null ? List.of() : this.excludeNames;
    }
    public List<String> getExcludeZoneIds() {
        return this.excludeZoneIds == null ? List.of() : this.excludeZoneIds;
    }
    public List<GetAvailabilityZonesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public List<String> getGroupNames() {
        return this.groupNames;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A list of the Availability Zone names available to the account.
     * 
    */
    public List<String> getNames() {
        return this.names;
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * A list of the Availability Zone IDs available to the account.
     * 
    */
    public List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilityZonesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allAvailabilityZones;
        private @Nullable List<String> excludeNames;
        private @Nullable List<String> excludeZoneIds;
        private @Nullable List<GetAvailabilityZonesFilter> filters;
        private List<String> groupNames;
        private String id;
        private List<String> names;
        private @Nullable String state;
        private List<String> zoneIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilityZonesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAvailabilityZones = defaults.allAvailabilityZones;
    	      this.excludeNames = defaults.excludeNames;
    	      this.excludeZoneIds = defaults.excludeZoneIds;
    	      this.filters = defaults.filters;
    	      this.groupNames = defaults.groupNames;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
    	      this.state = defaults.state;
    	      this.zoneIds = defaults.zoneIds;
        }

        public Builder allAvailabilityZones(@Nullable Boolean allAvailabilityZones) {
            this.allAvailabilityZones = allAvailabilityZones;
            return this;
        }

        public Builder excludeNames(@Nullable List<String> excludeNames) {
            this.excludeNames = excludeNames;
            return this;
        }

        public Builder excludeZoneIds(@Nullable List<String> excludeZoneIds) {
            this.excludeZoneIds = excludeZoneIds;
            return this;
        }

        public Builder filters(@Nullable List<GetAvailabilityZonesFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder groupNames(List<String> groupNames) {
            this.groupNames = Objects.requireNonNull(groupNames);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder zoneIds(List<String> zoneIds) {
            this.zoneIds = Objects.requireNonNull(zoneIds);
            return this;
        }
        public GetAvailabilityZonesResult build() {
            return new GetAvailabilityZonesResult(allAvailabilityZones, excludeNames, excludeZoneIds, filters, groupNames, id, names, state, zoneIds);
        }
    }
}
