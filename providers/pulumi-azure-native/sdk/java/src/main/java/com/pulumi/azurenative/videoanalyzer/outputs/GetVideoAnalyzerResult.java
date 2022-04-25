// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.azurenative.videoanalyzer.outputs.AccountEncryptionResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.EndpointResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.StorageAccountResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.VideoAnalyzerIdentityResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVideoAnalyzerResult {
    /**
     * @return The account encryption properties.
     * 
     */
    private final AccountEncryptionResponse encryption;
    /**
     * @return The list of endpoints associated with this resource.
     * 
     */
    private final List<EndpointResponse> endpoints;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The set of managed identities associated with the Video Analyzer resource.
     * 
     */
    private final @Nullable VideoAnalyzerIdentityResponse identity;
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
     * @return The storage accounts for this resource.
     * 
     */
    private final List<StorageAccountResponse> storageAccounts;
    /**
     * @return The system data of the Video Analyzer account.
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

    @CustomType.Constructor
    private GetVideoAnalyzerResult(
        @CustomType.Parameter("encryption") AccountEncryptionResponse encryption,
        @CustomType.Parameter("endpoints") List<EndpointResponse> endpoints,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable VideoAnalyzerIdentityResponse identity,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("storageAccounts") List<StorageAccountResponse> storageAccounts,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.encryption = encryption;
        this.endpoints = endpoints;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.storageAccounts = storageAccounts;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The account encryption properties.
     * 
     */
    public AccountEncryptionResponse encryption() {
        return this.encryption;
    }
    /**
     * @return The list of endpoints associated with this resource.
     * 
     */
    public List<EndpointResponse> endpoints() {
        return this.endpoints;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The set of managed identities associated with the Video Analyzer resource.
     * 
     */
    public Optional<VideoAnalyzerIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
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
     * @return The storage accounts for this resource.
     * 
     */
    public List<StorageAccountResponse> storageAccounts() {
        return this.storageAccounts;
    }
    /**
     * @return The system data of the Video Analyzer account.
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVideoAnalyzerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountEncryptionResponse encryption;
        private List<EndpointResponse> endpoints;
        private String id;
        private @Nullable VideoAnalyzerIdentityResponse identity;
        private String location;
        private String name;
        private List<StorageAccountResponse> storageAccounts;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVideoAnalyzerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.endpoints = defaults.endpoints;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.storageAccounts = defaults.storageAccounts;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder encryption(AccountEncryptionResponse encryption) {
            this.encryption = Objects.requireNonNull(encryption);
            return this;
        }
        public Builder endpoints(List<EndpointResponse> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder endpoints(EndpointResponse... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable VideoAnalyzerIdentityResponse identity) {
            this.identity = identity;
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
        public Builder storageAccounts(List<StorageAccountResponse> storageAccounts) {
            this.storageAccounts = Objects.requireNonNull(storageAccounts);
            return this;
        }
        public Builder storageAccounts(StorageAccountResponse... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
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
        }        public GetVideoAnalyzerResult build() {
            return new GetVideoAnalyzerResult(encryption, endpoints, id, identity, location, name, storageAccounts, systemData, tags, type);
        }
    }
}
