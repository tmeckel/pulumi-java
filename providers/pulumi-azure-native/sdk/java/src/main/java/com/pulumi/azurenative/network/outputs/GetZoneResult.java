// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetZoneResult {
    /**
     * @return The etag of the zone.
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource location.
     * 
     */
    private final String location;
    /**
     * @return The maximum number of record sets that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final Double maxNumberOfRecordSets;
    /**
     * @return The maximum number of records per record set that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final Double maxNumberOfRecordsPerRecordSet;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The name servers for this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final List<String> nameServers;
    /**
     * @return The current number of record sets in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final Double numberOfRecordSets;
    /**
     * @return A list of references to virtual networks that register hostnames in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    private final @Nullable List<SubResourceResponse> registrationVirtualNetworks;
    /**
     * @return A list of references to virtual networks that resolve records in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    private final @Nullable List<SubResourceResponse> resolutionVirtualNetworks;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return The type of this DNS zone (Public or Private).
     * 
     */
    private final @Nullable String zoneType;

    @CustomType.Constructor
    private GetZoneResult(
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("maxNumberOfRecordSets") Double maxNumberOfRecordSets,
        @CustomType.Parameter("maxNumberOfRecordsPerRecordSet") Double maxNumberOfRecordsPerRecordSet,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nameServers") List<String> nameServers,
        @CustomType.Parameter("numberOfRecordSets") Double numberOfRecordSets,
        @CustomType.Parameter("registrationVirtualNetworks") @Nullable List<SubResourceResponse> registrationVirtualNetworks,
        @CustomType.Parameter("resolutionVirtualNetworks") @Nullable List<SubResourceResponse> resolutionVirtualNetworks,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("zoneType") @Nullable String zoneType) {
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.maxNumberOfRecordSets = maxNumberOfRecordSets;
        this.maxNumberOfRecordsPerRecordSet = maxNumberOfRecordsPerRecordSet;
        this.name = name;
        this.nameServers = nameServers;
        this.numberOfRecordSets = numberOfRecordSets;
        this.registrationVirtualNetworks = registrationVirtualNetworks;
        this.resolutionVirtualNetworks = resolutionVirtualNetworks;
        this.tags = tags;
        this.type = type;
        this.zoneType = zoneType;
    }

    /**
     * @return The etag of the zone.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The maximum number of record sets that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Double maxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }
    /**
     * @return The maximum number of records per record set that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Double maxNumberOfRecordsPerRecordSet() {
        return this.maxNumberOfRecordsPerRecordSet;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name servers for this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public List<String> nameServers() {
        return this.nameServers;
    }
    /**
     * @return The current number of record sets in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Double numberOfRecordSets() {
        return this.numberOfRecordSets;
    }
    /**
     * @return A list of references to virtual networks that register hostnames in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    public List<SubResourceResponse> registrationVirtualNetworks() {
        return this.registrationVirtualNetworks == null ? List.of() : this.registrationVirtualNetworks;
    }
    /**
     * @return A list of references to virtual networks that resolve records in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    public List<SubResourceResponse> resolutionVirtualNetworks() {
        return this.resolutionVirtualNetworks == null ? List.of() : this.resolutionVirtualNetworks;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The type of this DNS zone (Public or Private).
     * 
     */
    public Optional<String> zoneType() {
        return Optional.ofNullable(this.zoneType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String location;
        private Double maxNumberOfRecordSets;
        private Double maxNumberOfRecordsPerRecordSet;
        private String name;
        private List<String> nameServers;
        private Double numberOfRecordSets;
        private @Nullable List<SubResourceResponse> registrationVirtualNetworks;
        private @Nullable List<SubResourceResponse> resolutionVirtualNetworks;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String zoneType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maxNumberOfRecordSets = defaults.maxNumberOfRecordSets;
    	      this.maxNumberOfRecordsPerRecordSet = defaults.maxNumberOfRecordsPerRecordSet;
    	      this.name = defaults.name;
    	      this.nameServers = defaults.nameServers;
    	      this.numberOfRecordSets = defaults.numberOfRecordSets;
    	      this.registrationVirtualNetworks = defaults.registrationVirtualNetworks;
    	      this.resolutionVirtualNetworks = defaults.resolutionVirtualNetworks;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zoneType = defaults.zoneType;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder maxNumberOfRecordSets(Double maxNumberOfRecordSets) {
            this.maxNumberOfRecordSets = Objects.requireNonNull(maxNumberOfRecordSets);
            return this;
        }
        public Builder maxNumberOfRecordsPerRecordSet(Double maxNumberOfRecordsPerRecordSet) {
            this.maxNumberOfRecordsPerRecordSet = Objects.requireNonNull(maxNumberOfRecordsPerRecordSet);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }
        public Builder numberOfRecordSets(Double numberOfRecordSets) {
            this.numberOfRecordSets = Objects.requireNonNull(numberOfRecordSets);
            return this;
        }
        public Builder registrationVirtualNetworks(@Nullable List<SubResourceResponse> registrationVirtualNetworks) {
            this.registrationVirtualNetworks = registrationVirtualNetworks;
            return this;
        }
        public Builder registrationVirtualNetworks(SubResourceResponse... registrationVirtualNetworks) {
            return registrationVirtualNetworks(List.of(registrationVirtualNetworks));
        }
        public Builder resolutionVirtualNetworks(@Nullable List<SubResourceResponse> resolutionVirtualNetworks) {
            this.resolutionVirtualNetworks = resolutionVirtualNetworks;
            return this;
        }
        public Builder resolutionVirtualNetworks(SubResourceResponse... resolutionVirtualNetworks) {
            return resolutionVirtualNetworks(List.of(resolutionVirtualNetworks));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder zoneType(@Nullable String zoneType) {
            this.zoneType = zoneType;
            return this;
        }        public GetZoneResult build() {
            return new GetZoneResult(etag, id, location, maxNumberOfRecordSets, maxNumberOfRecordsPerRecordSet, name, nameServers, numberOfRecordSets, registrationVirtualNetworks, resolutionVirtualNetworks, tags, type, zoneType);
        }
    }
}
