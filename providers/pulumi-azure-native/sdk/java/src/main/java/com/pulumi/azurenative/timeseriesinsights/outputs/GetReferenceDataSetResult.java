// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.outputs;

import com.pulumi.azurenative.timeseriesinsights.outputs.ReferenceDataSetKeyPropertyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReferenceDataSetResult {
    /**
     * @return The time the resource was created.
     * 
     */
    private final String creationTime;
    /**
     * @return The reference data set key comparison behavior can be set using this property. By default, the value is &#39;Ordinal&#39; - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When &#39;OrdinalIgnoreCase&#39; is set, case insensitive comparison will be used.
     * 
     */
    private final @Nullable String dataStringComparisonBehavior;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return The list of key properties for the reference data set.
     * 
     */
    private final List<ReferenceDataSetKeyPropertyResponse> keyProperties;
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
     * @return Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
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

    @CustomType.Constructor
    private GetReferenceDataSetResult(
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("dataStringComparisonBehavior") @Nullable String dataStringComparisonBehavior,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyProperties") List<ReferenceDataSetKeyPropertyResponse> keyProperties,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.creationTime = creationTime;
        this.dataStringComparisonBehavior = dataStringComparisonBehavior;
        this.id = id;
        this.keyProperties = keyProperties;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The time the resource was created.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The reference data set key comparison behavior can be set using this property. By default, the value is &#39;Ordinal&#39; - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When &#39;OrdinalIgnoreCase&#39; is set, case insensitive comparison will be used.
     * 
     */
    public Optional<String> dataStringComparisonBehavior() {
        return Optional.ofNullable(this.dataStringComparisonBehavior);
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of key properties for the reference data set.
     * 
     */
    public List<ReferenceDataSetKeyPropertyResponse> keyProperties() {
        return this.keyProperties;
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
     * @return Provisioning state of the resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReferenceDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private @Nullable String dataStringComparisonBehavior;
        private String id;
        private List<ReferenceDataSetKeyPropertyResponse> keyProperties;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReferenceDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.dataStringComparisonBehavior = defaults.dataStringComparisonBehavior;
    	      this.id = defaults.id;
    	      this.keyProperties = defaults.keyProperties;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder dataStringComparisonBehavior(@Nullable String dataStringComparisonBehavior) {
            this.dataStringComparisonBehavior = dataStringComparisonBehavior;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyProperties(List<ReferenceDataSetKeyPropertyResponse> keyProperties) {
            this.keyProperties = Objects.requireNonNull(keyProperties);
            return this;
        }
        public Builder keyProperties(ReferenceDataSetKeyPropertyResponse... keyProperties) {
            return keyProperties(List.of(keyProperties));
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetReferenceDataSetResult build() {
            return new GetReferenceDataSetResult(creationTime, dataStringComparisonBehavior, id, keyProperties, location, name, provisioningState, tags, type);
        }
    }
}
