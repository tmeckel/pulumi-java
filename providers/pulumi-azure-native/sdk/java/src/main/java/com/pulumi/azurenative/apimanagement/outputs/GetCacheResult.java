// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCacheResult {
    /**
     * @return Runtime connection string to cache
     * 
     */
    private final String connectionString;
    /**
     * @return Cache description
     * 
     */
    private final @Nullable String description;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Original uri of entity in external system cache points to
     * 
     */
    private final @Nullable String resourceId;
    /**
     * @return Resource type for API Management resource.
     * 
     */
    private final String type;
    /**
     * @return Location identifier to use cache from (should be either &#39;default&#39; or valid Azure region identifier)
     * 
     */
    private final String useFromLocation;

    @CustomType.Constructor
    private GetCacheResult(
        @CustomType.Parameter("connectionString") String connectionString,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useFromLocation") String useFromLocation) {
        this.connectionString = connectionString;
        this.description = description;
        this.id = id;
        this.name = name;
        this.resourceId = resourceId;
        this.type = type;
        this.useFromLocation = useFromLocation;
    }

    /**
     * @return Runtime connection string to cache
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return Cache description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Original uri of entity in external system cache points to
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return Resource type for API Management resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Location identifier to use cache from (should be either &#39;default&#39; or valid Azure region identifier)
     * 
     */
    public String useFromLocation() {
        return this.useFromLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCacheResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionString;
        private @Nullable String description;
        private String id;
        private String name;
        private @Nullable String resourceId;
        private String type;
        private String useFromLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCacheResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.type = defaults.type;
    	      this.useFromLocation = defaults.useFromLocation;
        }

        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useFromLocation(String useFromLocation) {
            this.useFromLocation = Objects.requireNonNull(useFromLocation);
            return this;
        }        public GetCacheResult build() {
            return new GetCacheResult(connectionString, description, id, name, resourceId, type, useFromLocation);
        }
    }
}
