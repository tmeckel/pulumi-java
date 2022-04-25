// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.NetworkManagerSecurityGroupItemResponse;
import com.pulumi.azurenative.network.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserRuleCollectionResult {
    /**
     * @return Groups for configuration
     * 
     */
    private final @Nullable List<NetworkManagerSecurityGroupItemResponse> appliesToGroups;
    /**
     * @return A description of the rule collection.
     * 
     */
    private final @Nullable String description;
    /**
     * @return A display name of the rule collection.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
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
     * @return The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The system metadata related to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetUserRuleCollectionResult(
        @CustomType.Parameter("appliesToGroups") @Nullable List<NetworkManagerSecurityGroupItemResponse> appliesToGroups,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.appliesToGroups = appliesToGroups;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Groups for configuration
     * 
     */
    public List<NetworkManagerSecurityGroupItemResponse> appliesToGroups() {
        return this.appliesToGroups == null ? List.of() : this.appliesToGroups;
    }
    /**
     * @return A description of the rule collection.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A display name of the rule collection.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
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
     * @return The provisioning state of the resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The system metadata related to this resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserRuleCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NetworkManagerSecurityGroupItemResponse> appliesToGroups;
        private @Nullable String description;
        private @Nullable String displayName;
        private String etag;
        private String id;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserRuleCollectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliesToGroups = defaults.appliesToGroups;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder appliesToGroups(@Nullable List<NetworkManagerSecurityGroupItemResponse> appliesToGroups) {
            this.appliesToGroups = appliesToGroups;
            return this;
        }
        public Builder appliesToGroups(NetworkManagerSecurityGroupItemResponse... appliesToGroups) {
            return appliesToGroups(List.of(appliesToGroups));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetUserRuleCollectionResult build() {
            return new GetUserRuleCollectionResult(appliesToGroups, description, displayName, etag, id, name, provisioningState, systemData, type);
        }
    }
}
