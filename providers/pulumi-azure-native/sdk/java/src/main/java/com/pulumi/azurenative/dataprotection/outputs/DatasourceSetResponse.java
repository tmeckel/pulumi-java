// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasourceSetResponse {
    /**
     * @return DatasourceType of the resource.
     * 
     */
    private final @Nullable String datasourceType;
    /**
     * @return Type of Datasource object, used to initialize the right inherited type
     * 
     */
    private final @Nullable String objectType;
    /**
     * @return Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure resources, this will be the ID created by backup service via Fabric/Vault.
     * 
     */
    private final String resourceID;
    /**
     * @return Location of datasource.
     * 
     */
    private final @Nullable String resourceLocation;
    /**
     * @return Unique identifier of the resource in the context of parent.
     * 
     */
    private final @Nullable String resourceName;
    /**
     * @return Resource Type of Datasource.
     * 
     */
    private final @Nullable String resourceType;
    /**
     * @return Uri of the resource.
     * 
     */
    private final @Nullable String resourceUri;

    @CustomType.Constructor
    private DatasourceSetResponse(
        @CustomType.Parameter("datasourceType") @Nullable String datasourceType,
        @CustomType.Parameter("objectType") @Nullable String objectType,
        @CustomType.Parameter("resourceID") String resourceID,
        @CustomType.Parameter("resourceLocation") @Nullable String resourceLocation,
        @CustomType.Parameter("resourceName") @Nullable String resourceName,
        @CustomType.Parameter("resourceType") @Nullable String resourceType,
        @CustomType.Parameter("resourceUri") @Nullable String resourceUri) {
        this.datasourceType = datasourceType;
        this.objectType = objectType;
        this.resourceID = resourceID;
        this.resourceLocation = resourceLocation;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.resourceUri = resourceUri;
    }

    /**
     * @return DatasourceType of the resource.
     * 
     */
    public Optional<String> datasourceType() {
        return Optional.ofNullable(this.datasourceType);
    }
    /**
     * @return Type of Datasource object, used to initialize the right inherited type
     * 
     */
    public Optional<String> objectType() {
        return Optional.ofNullable(this.objectType);
    }
    /**
     * @return Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure resources, this will be the ID created by backup service via Fabric/Vault.
     * 
     */
    public String resourceID() {
        return this.resourceID;
    }
    /**
     * @return Location of datasource.
     * 
     */
    public Optional<String> resourceLocation() {
        return Optional.ofNullable(this.resourceLocation);
    }
    /**
     * @return Unique identifier of the resource in the context of parent.
     * 
     */
    public Optional<String> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }
    /**
     * @return Resource Type of Datasource.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * @return Uri of the resource.
     * 
     */
    public Optional<String> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasourceSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datasourceType;
        private @Nullable String objectType;
        private String resourceID;
        private @Nullable String resourceLocation;
        private @Nullable String resourceName;
        private @Nullable String resourceType;
        private @Nullable String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasourceSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasourceType = defaults.datasourceType;
    	      this.objectType = defaults.objectType;
    	      this.resourceID = defaults.resourceID;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder datasourceType(@Nullable String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public Builder objectType(@Nullable String objectType) {
            this.objectType = objectType;
            return this;
        }
        public Builder resourceID(String resourceID) {
            this.resourceID = Objects.requireNonNull(resourceID);
            return this;
        }
        public Builder resourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }        public DatasourceSetResponse build() {
            return new DatasourceSetResponse(datasourceType, objectType, resourceID, resourceLocation, resourceName, resourceType, resourceUri);
        }
    }
}
