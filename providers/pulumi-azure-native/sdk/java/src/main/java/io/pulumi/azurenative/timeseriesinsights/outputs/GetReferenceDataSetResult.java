// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.azurenative.timeseriesinsights.outputs.ReferenceDataSetKeyPropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetReferenceDataSetResult {
    /**
     * The time the resource was created.
     * 
     */
    private final String creationTime;
    /**
     * The reference data set key comparison behavior can be set using this property. By default, the value is 'Ordinal' - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When 'OrdinalIgnoreCase' is set, case insensitive comparison will be used.
     * 
     */
    private final @Nullable String dataStringComparisonBehavior;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The list of key properties for the reference data set.
     * 
     */
    private final List<ReferenceDataSetKeyPropertyResponse> keyProperties;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetReferenceDataSetResult(
        @OutputCustomType.Parameter("creationTime") String creationTime,
        @OutputCustomType.Parameter("dataStringComparisonBehavior") @Nullable String dataStringComparisonBehavior,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("keyProperties") List<ReferenceDataSetKeyPropertyResponse> keyProperties,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
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
     * The time the resource was created.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * The reference data set key comparison behavior can be set using this property. By default, the value is 'Ordinal' - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When 'OrdinalIgnoreCase' is set, case insensitive comparison will be used.
     * 
    */
    public Optional<String> getDataStringComparisonBehavior() {
        return Optional.ofNullable(this.dataStringComparisonBehavior);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The list of key properties for the reference data set.
     * 
    */
    public List<ReferenceDataSetKeyPropertyResponse> getKeyProperties() {
        return this.keyProperties;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
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
        }
        public GetReferenceDataSetResult build() {
            return new GetReferenceDataSetResult(creationTime, dataStringComparisonBehavior, id, keyProperties, location, name, provisioningState, tags, type);
        }
    }
}
