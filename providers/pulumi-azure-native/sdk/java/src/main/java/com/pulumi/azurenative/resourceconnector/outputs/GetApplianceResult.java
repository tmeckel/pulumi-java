// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resourceconnector.outputs;

import com.pulumi.azurenative.resourceconnector.outputs.AppliancePropertiesResponseInfrastructureConfig;
import com.pulumi.azurenative.resourceconnector.outputs.IdentityResponse;
import com.pulumi.azurenative.resourceconnector.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplianceResult {
    /**
     * @return Represents a supported Fabric/Infra. (AKSEdge etc...).
     * 
     */
    private final @Nullable String distro;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return Identity for the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return Contains infrastructure information about the Appliance
     * 
     */
    private final @Nullable AppliancePropertiesResponseInfrastructureConfig infrastructureConfig;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * @return Certificates pair used to download MSI certificate from HIS
     * 
     */
    private final @Nullable String publicKey;
    /**
     * @return Appliance’s health and state of connection to on-prem
     * 
     */
    private final String status;
    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return Version of the Appliance
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetApplianceResult(
        @CustomType.Parameter("distro") @Nullable String distro,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("infrastructureConfig") @Nullable AppliancePropertiesResponseInfrastructureConfig infrastructureConfig,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicKey") @Nullable String publicKey,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") String version) {
        this.distro = distro;
        this.id = id;
        this.identity = identity;
        this.infrastructureConfig = infrastructureConfig;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publicKey = publicKey;
        this.status = status;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
        this.version = version;
    }

    /**
     * @return Represents a supported Fabric/Infra. (AKSEdge etc...).
     * 
     */
    public Optional<String> distro() {
        return Optional.ofNullable(this.distro);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identity for the resource.
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Contains infrastructure information about the Appliance
     * 
     */
    public Optional<AppliancePropertiesResponseInfrastructureConfig> infrastructureConfig() {
        return Optional.ofNullable(this.infrastructureConfig);
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Certificates pair used to download MSI certificate from HIS
     * 
     */
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * @return Appliance’s health and state of connection to on-prem
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Version of the Appliance
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String distro;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable AppliancePropertiesResponseInfrastructureConfig infrastructureConfig;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable String publicKey;
        private String status;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplianceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distro = defaults.distro;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.infrastructureConfig = defaults.infrastructureConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicKey = defaults.publicKey;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder distro(@Nullable String distro) {
            this.distro = distro;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder infrastructureConfig(@Nullable AppliancePropertiesResponseInfrastructureConfig infrastructureConfig) {
            this.infrastructureConfig = infrastructureConfig;
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
        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetApplianceResult build() {
            return new GetApplianceResult(distro, id, identity, infrastructureConfig, location, name, provisioningState, publicKey, status, systemData, tags, type, version);
        }
    }
}
