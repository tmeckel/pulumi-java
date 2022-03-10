// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.azurenative.healthcareapis.outputs.IotMappingPropertiesResponse;
import io.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIotConnectorFhirDestinationResult {
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    private final @Nullable String etag;
    /**
     * FHIR Mappings
     * 
     */
    private final IotMappingPropertiesResponse fhirMapping;
    /**
     * Fully qualified resource id of the FHIR service to connect to.
     * 
     */
    private final String fhirServiceResourceId;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * Determines how resource identity is resolved on the destination.
     * 
     */
    private final String resourceIdentityResolutionType;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetIotConnectorFhirDestinationResult(
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("fhirMapping") IotMappingPropertiesResponse fhirMapping,
        @OutputCustomType.Parameter("fhirServiceResourceId") String fhirServiceResourceId,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("resourceIdentityResolutionType") String resourceIdentityResolutionType,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.etag = etag;
        this.fhirMapping = fhirMapping;
        this.fhirServiceResourceId = fhirServiceResourceId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceIdentityResolutionType = resourceIdentityResolutionType;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * FHIR Mappings
     * 
    */
    public IotMappingPropertiesResponse getFhirMapping() {
        return this.fhirMapping;
    }
    /**
     * Fully qualified resource id of the FHIR service to connect to.
     * 
    */
    public String getFhirServiceResourceId() {
        return this.fhirServiceResourceId;
    }
    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Determines how resource identity is resolved on the destination.
     * 
    */
    public String getResourceIdentityResolutionType() {
        return this.resourceIdentityResolutionType;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotConnectorFhirDestinationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private IotMappingPropertiesResponse fhirMapping;
        private String fhirServiceResourceId;
        private String id;
        private @Nullable String location;
        private String name;
        private String resourceIdentityResolutionType;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotConnectorFhirDestinationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.fhirMapping = defaults.fhirMapping;
    	      this.fhirServiceResourceId = defaults.fhirServiceResourceId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceIdentityResolutionType = defaults.resourceIdentityResolutionType;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder fhirMapping(IotMappingPropertiesResponse fhirMapping) {
            this.fhirMapping = Objects.requireNonNull(fhirMapping);
            return this;
        }

        public Builder fhirServiceResourceId(String fhirServiceResourceId) {
            this.fhirServiceResourceId = Objects.requireNonNull(fhirServiceResourceId);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceIdentityResolutionType(String resourceIdentityResolutionType) {
            this.resourceIdentityResolutionType = Objects.requireNonNull(resourceIdentityResolutionType);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetIotConnectorFhirDestinationResult build() {
            return new GetIotConnectorFhirDestinationResult(etag, fhirMapping, fhirServiceResourceId, id, location, name, resourceIdentityResolutionType, systemData, type);
        }
    }
}
