// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.AzureFilesIdentityBasedAuthenticationResponse;
import com.pulumi.azurenative.storage.outputs.BlobRestoreStatusResponse;
import com.pulumi.azurenative.storage.outputs.CustomDomainResponse;
import com.pulumi.azurenative.storage.outputs.EncryptionResponse;
import com.pulumi.azurenative.storage.outputs.EndpointsResponse;
import com.pulumi.azurenative.storage.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.storage.outputs.GeoReplicationStatsResponse;
import com.pulumi.azurenative.storage.outputs.IdentityResponse;
import com.pulumi.azurenative.storage.outputs.KeyCreationTimeResponse;
import com.pulumi.azurenative.storage.outputs.KeyPolicyResponse;
import com.pulumi.azurenative.storage.outputs.NetworkRuleSetResponse;
import com.pulumi.azurenative.storage.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.storage.outputs.RoutingPreferenceResponse;
import com.pulumi.azurenative.storage.outputs.SasPolicyResponse;
import com.pulumi.azurenative.storage.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStorageAccountResult {
    /**
     * @return Required for storage accounts where kind = BlobStorage. The access tier used for billing.
     * 
     */
    private final String accessTier;
    /**
     * @return Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property.
     * 
     */
    private final @Nullable Boolean allowBlobPublicAccess;
    /**
     * @return Indicates whether the storage account permits requests to be authorized with the account access key via Shared Key. If false, then all requests, including shared access signatures, must be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     */
    private final @Nullable Boolean allowSharedKeyAccess;
    /**
     * @return Provides the identity based authentication settings for Azure Files.
     * 
     */
    private final @Nullable AzureFilesIdentityBasedAuthenticationResponse azureFilesIdentityBasedAuthentication;
    /**
     * @return Blob restore status
     * 
     */
    private final BlobRestoreStatusResponse blobRestoreStatus;
    /**
     * @return Gets the creation date and time of the storage account in UTC.
     * 
     */
    private final String creationTime;
    /**
     * @return Gets the custom domain the user assigned to this storage account.
     * 
     */
    private final CustomDomainResponse customDomain;
    /**
     * @return Allows https traffic only to storage service if sets to true.
     * 
     */
    private final @Nullable Boolean enableHttpsTrafficOnly;
    /**
     * @return NFS 3.0 protocol support enabled if set to true.
     * 
     */
    private final @Nullable Boolean enableNfsV3;
    /**
     * @return Gets the encryption settings on the account. If unspecified, the account is unencrypted.
     * 
     */
    private final EncryptionResponse encryption;
    /**
     * @return The extendedLocation of the resource.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * @return If the failover is in progress, the value will be true, otherwise, it will be null.
     * 
     */
    private final Boolean failoverInProgress;
    /**
     * @return Geo Replication Stats
     * 
     */
    private final GeoReplicationStatsResponse geoReplicationStats;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return Account HierarchicalNamespace enabled if sets to true.
     * 
     */
    private final @Nullable Boolean isHnsEnabled;
    /**
     * @return Storage account keys creation time.
     * 
     */
    private final KeyCreationTimeResponse keyCreationTime;
    /**
     * @return KeyPolicy assigned to the storage account.
     * 
     */
    private final KeyPolicyResponse keyPolicy;
    /**
     * @return Gets the Kind.
     * 
     */
    private final String kind;
    /**
     * @return Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled.
     * 
     */
    private final @Nullable String largeFileSharesState;
    /**
     * @return Gets the timestamp of the most recent instance of a failover to the secondary location. Only the most recent timestamp is retained. This element is not returned if there has never been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    private final String lastGeoFailoverTime;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
     */
    private final @Nullable String minimumTlsVersion;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Network rule set
     * 
     */
    private final NetworkRuleSetResponse networkRuleSet;
    /**
     * @return Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     * 
     */
    private final EndpointsResponse primaryEndpoints;
    /**
     * @return Gets the location of the primary data center for the storage account.
     * 
     */
    private final String primaryLocation;
    /**
     * @return List of private endpoint connection associated with the specified storage account
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * @return Gets the status of the storage account at the time the operation was called.
     * 
     */
    private final String provisioningState;
    /**
     * @return Maintains information about the network routing choice opted by the user for data transfer
     * 
     */
    private final @Nullable RoutingPreferenceResponse routingPreference;
    /**
     * @return SasPolicy assigned to the storage account.
     * 
     */
    private final SasPolicyResponse sasPolicy;
    /**
     * @return Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object from the secondary location of the storage account. Only available if the SKU name is Standard_RAGRS.
     * 
     */
    private final EndpointsResponse secondaryEndpoints;
    /**
     * @return Gets the location of the geo-replicated secondary for the storage account. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    private final String secondaryLocation;
    /**
     * @return Gets the SKU.
     * 
     */
    private final SkuResponse sku;
    /**
     * @return Gets the status indicating whether the primary location of the storage account is available or unavailable.
     * 
     */
    private final String statusOfPrimary;
    /**
     * @return Gets the status indicating whether the secondary location of the storage account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     * 
     */
    private final String statusOfSecondary;
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
    private GetStorageAccountResult(
        @CustomType.Parameter("accessTier") String accessTier,
        @CustomType.Parameter("allowBlobPublicAccess") @Nullable Boolean allowBlobPublicAccess,
        @CustomType.Parameter("allowSharedKeyAccess") @Nullable Boolean allowSharedKeyAccess,
        @CustomType.Parameter("azureFilesIdentityBasedAuthentication") @Nullable AzureFilesIdentityBasedAuthenticationResponse azureFilesIdentityBasedAuthentication,
        @CustomType.Parameter("blobRestoreStatus") BlobRestoreStatusResponse blobRestoreStatus,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("customDomain") CustomDomainResponse customDomain,
        @CustomType.Parameter("enableHttpsTrafficOnly") @Nullable Boolean enableHttpsTrafficOnly,
        @CustomType.Parameter("enableNfsV3") @Nullable Boolean enableNfsV3,
        @CustomType.Parameter("encryption") EncryptionResponse encryption,
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("failoverInProgress") Boolean failoverInProgress,
        @CustomType.Parameter("geoReplicationStats") GeoReplicationStatsResponse geoReplicationStats,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("isHnsEnabled") @Nullable Boolean isHnsEnabled,
        @CustomType.Parameter("keyCreationTime") KeyCreationTimeResponse keyCreationTime,
        @CustomType.Parameter("keyPolicy") KeyPolicyResponse keyPolicy,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("largeFileSharesState") @Nullable String largeFileSharesState,
        @CustomType.Parameter("lastGeoFailoverTime") String lastGeoFailoverTime,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("minimumTlsVersion") @Nullable String minimumTlsVersion,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkRuleSet") NetworkRuleSetResponse networkRuleSet,
        @CustomType.Parameter("primaryEndpoints") EndpointsResponse primaryEndpoints,
        @CustomType.Parameter("primaryLocation") String primaryLocation,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("routingPreference") @Nullable RoutingPreferenceResponse routingPreference,
        @CustomType.Parameter("sasPolicy") SasPolicyResponse sasPolicy,
        @CustomType.Parameter("secondaryEndpoints") EndpointsResponse secondaryEndpoints,
        @CustomType.Parameter("secondaryLocation") String secondaryLocation,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("statusOfPrimary") String statusOfPrimary,
        @CustomType.Parameter("statusOfSecondary") String statusOfSecondary,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.accessTier = accessTier;
        this.allowBlobPublicAccess = allowBlobPublicAccess;
        this.allowSharedKeyAccess = allowSharedKeyAccess;
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        this.blobRestoreStatus = blobRestoreStatus;
        this.creationTime = creationTime;
        this.customDomain = customDomain;
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        this.enableNfsV3 = enableNfsV3;
        this.encryption = encryption;
        this.extendedLocation = extendedLocation;
        this.failoverInProgress = failoverInProgress;
        this.geoReplicationStats = geoReplicationStats;
        this.id = id;
        this.identity = identity;
        this.isHnsEnabled = isHnsEnabled;
        this.keyCreationTime = keyCreationTime;
        this.keyPolicy = keyPolicy;
        this.kind = kind;
        this.largeFileSharesState = largeFileSharesState;
        this.lastGeoFailoverTime = lastGeoFailoverTime;
        this.location = location;
        this.minimumTlsVersion = minimumTlsVersion;
        this.name = name;
        this.networkRuleSet = networkRuleSet;
        this.primaryEndpoints = primaryEndpoints;
        this.primaryLocation = primaryLocation;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.routingPreference = routingPreference;
        this.sasPolicy = sasPolicy;
        this.secondaryEndpoints = secondaryEndpoints;
        this.secondaryLocation = secondaryLocation;
        this.sku = sku;
        this.statusOfPrimary = statusOfPrimary;
        this.statusOfSecondary = statusOfSecondary;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Required for storage accounts where kind = BlobStorage. The access tier used for billing.
     * 
     */
    public String accessTier() {
        return this.accessTier;
    }
    /**
     * @return Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property.
     * 
     */
    public Optional<Boolean> allowBlobPublicAccess() {
        return Optional.ofNullable(this.allowBlobPublicAccess);
    }
    /**
     * @return Indicates whether the storage account permits requests to be authorized with the account access key via Shared Key. If false, then all requests, including shared access signatures, must be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     */
    public Optional<Boolean> allowSharedKeyAccess() {
        return Optional.ofNullable(this.allowSharedKeyAccess);
    }
    /**
     * @return Provides the identity based authentication settings for Azure Files.
     * 
     */
    public Optional<AzureFilesIdentityBasedAuthenticationResponse> azureFilesIdentityBasedAuthentication() {
        return Optional.ofNullable(this.azureFilesIdentityBasedAuthentication);
    }
    /**
     * @return Blob restore status
     * 
     */
    public BlobRestoreStatusResponse blobRestoreStatus() {
        return this.blobRestoreStatus;
    }
    /**
     * @return Gets the creation date and time of the storage account in UTC.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return Gets the custom domain the user assigned to this storage account.
     * 
     */
    public CustomDomainResponse customDomain() {
        return this.customDomain;
    }
    /**
     * @return Allows https traffic only to storage service if sets to true.
     * 
     */
    public Optional<Boolean> enableHttpsTrafficOnly() {
        return Optional.ofNullable(this.enableHttpsTrafficOnly);
    }
    /**
     * @return NFS 3.0 protocol support enabled if set to true.
     * 
     */
    public Optional<Boolean> enableNfsV3() {
        return Optional.ofNullable(this.enableNfsV3);
    }
    /**
     * @return Gets the encryption settings on the account. If unspecified, the account is unencrypted.
     * 
     */
    public EncryptionResponse encryption() {
        return this.encryption;
    }
    /**
     * @return The extendedLocation of the resource.
     * 
     */
    public Optional<ExtendedLocationResponse> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * @return If the failover is in progress, the value will be true, otherwise, it will be null.
     * 
     */
    public Boolean failoverInProgress() {
        return this.failoverInProgress;
    }
    /**
     * @return Geo Replication Stats
     * 
     */
    public GeoReplicationStatsResponse geoReplicationStats() {
        return this.geoReplicationStats;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity of the resource.
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Account HierarchicalNamespace enabled if sets to true.
     * 
     */
    public Optional<Boolean> isHnsEnabled() {
        return Optional.ofNullable(this.isHnsEnabled);
    }
    /**
     * @return Storage account keys creation time.
     * 
     */
    public KeyCreationTimeResponse keyCreationTime() {
        return this.keyCreationTime;
    }
    /**
     * @return KeyPolicy assigned to the storage account.
     * 
     */
    public KeyPolicyResponse keyPolicy() {
        return this.keyPolicy;
    }
    /**
     * @return Gets the Kind.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled.
     * 
     */
    public Optional<String> largeFileSharesState() {
        return Optional.ofNullable(this.largeFileSharesState);
    }
    /**
     * @return Gets the timestamp of the most recent instance of a failover to the secondary location. Only the most recent timestamp is retained. This element is not returned if there has never been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    public String lastGeoFailoverTime() {
        return this.lastGeoFailoverTime;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
     */
    public Optional<String> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Network rule set
     * 
     */
    public NetworkRuleSetResponse networkRuleSet() {
        return this.networkRuleSet;
    }
    /**
     * @return Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     * 
     */
    public EndpointsResponse primaryEndpoints() {
        return this.primaryEndpoints;
    }
    /**
     * @return Gets the location of the primary data center for the storage account.
     * 
     */
    public String primaryLocation() {
        return this.primaryLocation;
    }
    /**
     * @return List of private endpoint connection associated with the specified storage account
     * 
     */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * @return Gets the status of the storage account at the time the operation was called.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Maintains information about the network routing choice opted by the user for data transfer
     * 
     */
    public Optional<RoutingPreferenceResponse> routingPreference() {
        return Optional.ofNullable(this.routingPreference);
    }
    /**
     * @return SasPolicy assigned to the storage account.
     * 
     */
    public SasPolicyResponse sasPolicy() {
        return this.sasPolicy;
    }
    /**
     * @return Gets the URLs that are used to perform a retrieval of a public blob, queue, or table object from the secondary location of the storage account. Only available if the SKU name is Standard_RAGRS.
     * 
     */
    public EndpointsResponse secondaryEndpoints() {
        return this.secondaryEndpoints;
    }
    /**
     * @return Gets the location of the geo-replicated secondary for the storage account. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     * 
     */
    public String secondaryLocation() {
        return this.secondaryLocation;
    }
    /**
     * @return Gets the SKU.
     * 
     */
    public SkuResponse sku() {
        return this.sku;
    }
    /**
     * @return Gets the status indicating whether the primary location of the storage account is available or unavailable.
     * 
     */
    public String statusOfPrimary() {
        return this.statusOfPrimary;
    }
    /**
     * @return Gets the status indicating whether the secondary location of the storage account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS.
     * 
     */
    public String statusOfSecondary() {
        return this.statusOfSecondary;
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

    public static Builder builder(GetStorageAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessTier;
        private @Nullable Boolean allowBlobPublicAccess;
        private @Nullable Boolean allowSharedKeyAccess;
        private @Nullable AzureFilesIdentityBasedAuthenticationResponse azureFilesIdentityBasedAuthentication;
        private BlobRestoreStatusResponse blobRestoreStatus;
        private String creationTime;
        private CustomDomainResponse customDomain;
        private @Nullable Boolean enableHttpsTrafficOnly;
        private @Nullable Boolean enableNfsV3;
        private EncryptionResponse encryption;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private Boolean failoverInProgress;
        private GeoReplicationStatsResponse geoReplicationStats;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable Boolean isHnsEnabled;
        private KeyCreationTimeResponse keyCreationTime;
        private KeyPolicyResponse keyPolicy;
        private String kind;
        private @Nullable String largeFileSharesState;
        private String lastGeoFailoverTime;
        private String location;
        private @Nullable String minimumTlsVersion;
        private String name;
        private NetworkRuleSetResponse networkRuleSet;
        private EndpointsResponse primaryEndpoints;
        private String primaryLocation;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable RoutingPreferenceResponse routingPreference;
        private SasPolicyResponse sasPolicy;
        private EndpointsResponse secondaryEndpoints;
        private String secondaryLocation;
        private SkuResponse sku;
        private String statusOfPrimary;
        private String statusOfSecondary;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.allowBlobPublicAccess = defaults.allowBlobPublicAccess;
    	      this.allowSharedKeyAccess = defaults.allowSharedKeyAccess;
    	      this.azureFilesIdentityBasedAuthentication = defaults.azureFilesIdentityBasedAuthentication;
    	      this.blobRestoreStatus = defaults.blobRestoreStatus;
    	      this.creationTime = defaults.creationTime;
    	      this.customDomain = defaults.customDomain;
    	      this.enableHttpsTrafficOnly = defaults.enableHttpsTrafficOnly;
    	      this.enableNfsV3 = defaults.enableNfsV3;
    	      this.encryption = defaults.encryption;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.failoverInProgress = defaults.failoverInProgress;
    	      this.geoReplicationStats = defaults.geoReplicationStats;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.isHnsEnabled = defaults.isHnsEnabled;
    	      this.keyCreationTime = defaults.keyCreationTime;
    	      this.keyPolicy = defaults.keyPolicy;
    	      this.kind = defaults.kind;
    	      this.largeFileSharesState = defaults.largeFileSharesState;
    	      this.lastGeoFailoverTime = defaults.lastGeoFailoverTime;
    	      this.location = defaults.location;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.name = defaults.name;
    	      this.networkRuleSet = defaults.networkRuleSet;
    	      this.primaryEndpoints = defaults.primaryEndpoints;
    	      this.primaryLocation = defaults.primaryLocation;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routingPreference = defaults.routingPreference;
    	      this.sasPolicy = defaults.sasPolicy;
    	      this.secondaryEndpoints = defaults.secondaryEndpoints;
    	      this.secondaryLocation = defaults.secondaryLocation;
    	      this.sku = defaults.sku;
    	      this.statusOfPrimary = defaults.statusOfPrimary;
    	      this.statusOfSecondary = defaults.statusOfSecondary;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder accessTier(String accessTier) {
            this.accessTier = Objects.requireNonNull(accessTier);
            return this;
        }
        public Builder allowBlobPublicAccess(@Nullable Boolean allowBlobPublicAccess) {
            this.allowBlobPublicAccess = allowBlobPublicAccess;
            return this;
        }
        public Builder allowSharedKeyAccess(@Nullable Boolean allowSharedKeyAccess) {
            this.allowSharedKeyAccess = allowSharedKeyAccess;
            return this;
        }
        public Builder azureFilesIdentityBasedAuthentication(@Nullable AzureFilesIdentityBasedAuthenticationResponse azureFilesIdentityBasedAuthentication) {
            this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
            return this;
        }
        public Builder blobRestoreStatus(BlobRestoreStatusResponse blobRestoreStatus) {
            this.blobRestoreStatus = Objects.requireNonNull(blobRestoreStatus);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder customDomain(CustomDomainResponse customDomain) {
            this.customDomain = Objects.requireNonNull(customDomain);
            return this;
        }
        public Builder enableHttpsTrafficOnly(@Nullable Boolean enableHttpsTrafficOnly) {
            this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
            return this;
        }
        public Builder enableNfsV3(@Nullable Boolean enableNfsV3) {
            this.enableNfsV3 = enableNfsV3;
            return this;
        }
        public Builder encryption(EncryptionResponse encryption) {
            this.encryption = Objects.requireNonNull(encryption);
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder failoverInProgress(Boolean failoverInProgress) {
            this.failoverInProgress = Objects.requireNonNull(failoverInProgress);
            return this;
        }
        public Builder geoReplicationStats(GeoReplicationStatsResponse geoReplicationStats) {
            this.geoReplicationStats = Objects.requireNonNull(geoReplicationStats);
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
        public Builder isHnsEnabled(@Nullable Boolean isHnsEnabled) {
            this.isHnsEnabled = isHnsEnabled;
            return this;
        }
        public Builder keyCreationTime(KeyCreationTimeResponse keyCreationTime) {
            this.keyCreationTime = Objects.requireNonNull(keyCreationTime);
            return this;
        }
        public Builder keyPolicy(KeyPolicyResponse keyPolicy) {
            this.keyPolicy = Objects.requireNonNull(keyPolicy);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder largeFileSharesState(@Nullable String largeFileSharesState) {
            this.largeFileSharesState = largeFileSharesState;
            return this;
        }
        public Builder lastGeoFailoverTime(String lastGeoFailoverTime) {
            this.lastGeoFailoverTime = Objects.requireNonNull(lastGeoFailoverTime);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder minimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkRuleSet(NetworkRuleSetResponse networkRuleSet) {
            this.networkRuleSet = Objects.requireNonNull(networkRuleSet);
            return this;
        }
        public Builder primaryEndpoints(EndpointsResponse primaryEndpoints) {
            this.primaryEndpoints = Objects.requireNonNull(primaryEndpoints);
            return this;
        }
        public Builder primaryLocation(String primaryLocation) {
            this.primaryLocation = Objects.requireNonNull(primaryLocation);
            return this;
        }
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder routingPreference(@Nullable RoutingPreferenceResponse routingPreference) {
            this.routingPreference = routingPreference;
            return this;
        }
        public Builder sasPolicy(SasPolicyResponse sasPolicy) {
            this.sasPolicy = Objects.requireNonNull(sasPolicy);
            return this;
        }
        public Builder secondaryEndpoints(EndpointsResponse secondaryEndpoints) {
            this.secondaryEndpoints = Objects.requireNonNull(secondaryEndpoints);
            return this;
        }
        public Builder secondaryLocation(String secondaryLocation) {
            this.secondaryLocation = Objects.requireNonNull(secondaryLocation);
            return this;
        }
        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder statusOfPrimary(String statusOfPrimary) {
            this.statusOfPrimary = Objects.requireNonNull(statusOfPrimary);
            return this;
        }
        public Builder statusOfSecondary(String statusOfSecondary) {
            this.statusOfSecondary = Objects.requireNonNull(statusOfSecondary);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetStorageAccountResult build() {
            return new GetStorageAccountResult(accessTier, allowBlobPublicAccess, allowSharedKeyAccess, azureFilesIdentityBasedAuthentication, blobRestoreStatus, creationTime, customDomain, enableHttpsTrafficOnly, enableNfsV3, encryption, extendedLocation, failoverInProgress, geoReplicationStats, id, identity, isHnsEnabled, keyCreationTime, keyPolicy, kind, largeFileSharesState, lastGeoFailoverTime, location, minimumTlsVersion, name, networkRuleSet, primaryEndpoints, primaryLocation, privateEndpointConnections, provisioningState, routingPreference, sasPolicy, secondaryEndpoints, secondaryLocation, sku, statusOfPrimary, statusOfSecondary, tags, type);
        }
    }
}
