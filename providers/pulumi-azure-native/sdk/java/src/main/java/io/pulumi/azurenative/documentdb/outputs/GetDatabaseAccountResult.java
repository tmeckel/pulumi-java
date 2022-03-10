// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.ApiPropertiesResponse;
import io.pulumi.azurenative.documentdb.outputs.CapabilityResponse;
import io.pulumi.azurenative.documentdb.outputs.ConsistencyPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.ContinuousModeBackupPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.CorsPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.FailoverPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.IpAddressOrRangeResponse;
import io.pulumi.azurenative.documentdb.outputs.LocationResponse;
import io.pulumi.azurenative.documentdb.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.documentdb.outputs.PeriodicModeBackupPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.documentdb.outputs.VirtualNetworkRuleResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatabaseAccountResult {
    /**
     * API specific properties.
     * 
     */
    private final @Nullable ApiPropertiesResponse apiProperties;
    /**
     * The object representing the policy for taking backups on an account.
     * 
     */
    private final @Nullable Either<ContinuousModeBackupPolicyResponse,PeriodicModeBackupPolicyResponse> backupPolicy;
    /**
     * List of Cosmos DB capabilities for the account
     * 
     */
    private final @Nullable List<CapabilityResponse> capabilities;
    /**
     * The cassandra connector offer type for the Cosmos DB database C* account.
     * 
     */
    private final @Nullable String connectorOffer;
    /**
     * The consistency policy for the Cosmos DB database account.
     * 
     */
    private final @Nullable ConsistencyPolicyResponse consistencyPolicy;
    /**
     * The CORS policy for the Cosmos DB database account.
     * 
     */
    private final @Nullable List<CorsPolicyResponse> cors;
    /**
     * The offer type for the Cosmos DB database account. Default value: Standard.
     * 
     */
    private final String databaseAccountOfferType;
    /**
     * The default identity for accessing key vault used in features like customer managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity" and more.
     * 
     */
    private final @Nullable String defaultIdentity;
    /**
     * Disable write operations on metadata resources (databases, containers, throughput) via account keys
     * 
     */
    private final @Nullable Boolean disableKeyBasedMetadataWriteAccess;
    /**
     * The connection endpoint for the Cosmos DB database account.
     * 
     */
    private final String documentEndpoint;
    /**
     * Flag to indicate whether to enable storage analytics.
     * 
     */
    private final @Nullable Boolean enableAnalyticalStorage;
    /**
     * Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     * 
     */
    private final @Nullable Boolean enableAutomaticFailover;
    /**
     * Enables the cassandra connector on the Cosmos DB C* account
     * 
     */
    private final @Nullable Boolean enableCassandraConnector;
    /**
     * Flag to indicate whether Free Tier is enabled.
     * 
     */
    private final @Nullable Boolean enableFreeTier;
    /**
     * Enables the account to write in multiple locations
     * 
     */
    private final @Nullable Boolean enableMultipleWriteLocations;
    /**
     * An array that contains the regions ordered by their failover priorities.
     * 
     */
    private final List<FailoverPolicyResponse> failoverPolicies;
    /**
     * The unique resource identifier of the ARM resource.
     * 
     */
    private final String id;
    /**
     * Identity for the resource.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * List of IpRules.
     * 
     */
    private final @Nullable List<IpAddressOrRangeResponse> ipRules;
    /**
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     * 
     */
    private final @Nullable Boolean isVirtualNetworkFilterEnabled;
    /**
     * The URI of the key vault
     * 
     */
    private final @Nullable String keyVaultKeyUri;
    /**
     * Indicates the type of database account. This can only be set at database account creation.
     * 
     */
    private final @Nullable String kind;
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    private final @Nullable String location;
    /**
     * An array that contains all of the locations enabled for the Cosmos DB account.
     * 
     */
    private final List<LocationResponse> locations;
    /**
     * The name of the ARM resource.
     * 
     */
    private final String name;
    /**
     * Indicates what services are allowed to bypass firewall checks.
     * 
     */
    private final @Nullable String networkAclBypass;
    /**
     * An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     * 
     */
    private final @Nullable List<String> networkAclBypassResourceIds;
    /**
     * List of Private Endpoint Connections configured for the Cosmos DB account.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * The status of the Cosmos DB account at the time the operation was called. The status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in Creating state, only properties that are specified as input for the Create Cosmos DB account operation are returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation. 'DeletionFailed' – the Cosmos DB account deletion failed.
     * 
     */
    private final String provisioningState;
    /**
     * Whether requests from Public Network are allowed
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * An array that contains of the read locations enabled for the Cosmos DB account.
     * 
     */
    private final List<LocationResponse> readLocations;
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of Azure resource.
     * 
     */
    private final String type;
    /**
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
     */
    private final @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;
    /**
     * An array that contains the write location for the Cosmos DB account.
     * 
     */
    private final List<LocationResponse> writeLocations;

    @OutputCustomType.Constructor
    private GetDatabaseAccountResult(
        @OutputCustomType.Parameter("apiProperties") @Nullable ApiPropertiesResponse apiProperties,
        @OutputCustomType.Parameter("backupPolicy") @Nullable Either<ContinuousModeBackupPolicyResponse,PeriodicModeBackupPolicyResponse> backupPolicy,
        @OutputCustomType.Parameter("capabilities") @Nullable List<CapabilityResponse> capabilities,
        @OutputCustomType.Parameter("connectorOffer") @Nullable String connectorOffer,
        @OutputCustomType.Parameter("consistencyPolicy") @Nullable ConsistencyPolicyResponse consistencyPolicy,
        @OutputCustomType.Parameter("cors") @Nullable List<CorsPolicyResponse> cors,
        @OutputCustomType.Parameter("databaseAccountOfferType") String databaseAccountOfferType,
        @OutputCustomType.Parameter("defaultIdentity") @Nullable String defaultIdentity,
        @OutputCustomType.Parameter("disableKeyBasedMetadataWriteAccess") @Nullable Boolean disableKeyBasedMetadataWriteAccess,
        @OutputCustomType.Parameter("documentEndpoint") String documentEndpoint,
        @OutputCustomType.Parameter("enableAnalyticalStorage") @Nullable Boolean enableAnalyticalStorage,
        @OutputCustomType.Parameter("enableAutomaticFailover") @Nullable Boolean enableAutomaticFailover,
        @OutputCustomType.Parameter("enableCassandraConnector") @Nullable Boolean enableCassandraConnector,
        @OutputCustomType.Parameter("enableFreeTier") @Nullable Boolean enableFreeTier,
        @OutputCustomType.Parameter("enableMultipleWriteLocations") @Nullable Boolean enableMultipleWriteLocations,
        @OutputCustomType.Parameter("failoverPolicies") List<FailoverPolicyResponse> failoverPolicies,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("identity") @Nullable ManagedServiceIdentityResponse identity,
        @OutputCustomType.Parameter("ipRules") @Nullable List<IpAddressOrRangeResponse> ipRules,
        @OutputCustomType.Parameter("isVirtualNetworkFilterEnabled") @Nullable Boolean isVirtualNetworkFilterEnabled,
        @OutputCustomType.Parameter("keyVaultKeyUri") @Nullable String keyVaultKeyUri,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("locations") List<LocationResponse> locations,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("networkAclBypass") @Nullable String networkAclBypass,
        @OutputCustomType.Parameter("networkAclBypassResourceIds") @Nullable List<String> networkAclBypassResourceIds,
        @OutputCustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @OutputCustomType.Parameter("readLocations") List<LocationResponse> readLocations,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("virtualNetworkRules") @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules,
        @OutputCustomType.Parameter("writeLocations") List<LocationResponse> writeLocations) {
        this.apiProperties = apiProperties;
        this.backupPolicy = backupPolicy;
        this.capabilities = capabilities;
        this.connectorOffer = connectorOffer;
        this.consistencyPolicy = consistencyPolicy;
        this.cors = cors;
        this.databaseAccountOfferType = databaseAccountOfferType;
        this.defaultIdentity = defaultIdentity;
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        this.documentEndpoint = documentEndpoint;
        this.enableAnalyticalStorage = enableAnalyticalStorage;
        this.enableAutomaticFailover = enableAutomaticFailover;
        this.enableCassandraConnector = enableCassandraConnector;
        this.enableFreeTier = enableFreeTier;
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        this.failoverPolicies = failoverPolicies;
        this.id = id;
        this.identity = identity;
        this.ipRules = ipRules;
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        this.keyVaultKeyUri = keyVaultKeyUri;
        this.kind = kind;
        this.location = location;
        this.locations = locations;
        this.name = name;
        this.networkAclBypass = networkAclBypass;
        this.networkAclBypassResourceIds = networkAclBypassResourceIds;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.readLocations = readLocations;
        this.tags = tags;
        this.type = type;
        this.virtualNetworkRules = virtualNetworkRules;
        this.writeLocations = writeLocations;
    }

    /**
     * API specific properties.
     * 
    */
    public Optional<ApiPropertiesResponse> getApiProperties() {
        return Optional.ofNullable(this.apiProperties);
    }
    /**
     * The object representing the policy for taking backups on an account.
     * 
    */
    public Optional<Either<ContinuousModeBackupPolicyResponse,PeriodicModeBackupPolicyResponse>> getBackupPolicy() {
        return Optional.ofNullable(this.backupPolicy);
    }
    /**
     * List of Cosmos DB capabilities for the account
     * 
    */
    public List<CapabilityResponse> getCapabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }
    /**
     * The cassandra connector offer type for the Cosmos DB database C* account.
     * 
    */
    public Optional<String> getConnectorOffer() {
        return Optional.ofNullable(this.connectorOffer);
    }
    /**
     * The consistency policy for the Cosmos DB database account.
     * 
    */
    public Optional<ConsistencyPolicyResponse> getConsistencyPolicy() {
        return Optional.ofNullable(this.consistencyPolicy);
    }
    /**
     * The CORS policy for the Cosmos DB database account.
     * 
    */
    public List<CorsPolicyResponse> getCors() {
        return this.cors == null ? List.of() : this.cors;
    }
    /**
     * The offer type for the Cosmos DB database account. Default value: Standard.
     * 
    */
    public String getDatabaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }
    /**
     * The default identity for accessing key vault used in features like customer managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity" and more.
     * 
    */
    public Optional<String> getDefaultIdentity() {
        return Optional.ofNullable(this.defaultIdentity);
    }
    /**
     * Disable write operations on metadata resources (databases, containers, throughput) via account keys
     * 
    */
    public Optional<Boolean> getDisableKeyBasedMetadataWriteAccess() {
        return Optional.ofNullable(this.disableKeyBasedMetadataWriteAccess);
    }
    /**
     * The connection endpoint for the Cosmos DB database account.
     * 
    */
    public String getDocumentEndpoint() {
        return this.documentEndpoint;
    }
    /**
     * Flag to indicate whether to enable storage analytics.
     * 
    */
    public Optional<Boolean> getEnableAnalyticalStorage() {
        return Optional.ofNullable(this.enableAnalyticalStorage);
    }
    /**
     * Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     * 
    */
    public Optional<Boolean> getEnableAutomaticFailover() {
        return Optional.ofNullable(this.enableAutomaticFailover);
    }
    /**
     * Enables the cassandra connector on the Cosmos DB C* account
     * 
    */
    public Optional<Boolean> getEnableCassandraConnector() {
        return Optional.ofNullable(this.enableCassandraConnector);
    }
    /**
     * Flag to indicate whether Free Tier is enabled.
     * 
    */
    public Optional<Boolean> getEnableFreeTier() {
        return Optional.ofNullable(this.enableFreeTier);
    }
    /**
     * Enables the account to write in multiple locations
     * 
    */
    public Optional<Boolean> getEnableMultipleWriteLocations() {
        return Optional.ofNullable(this.enableMultipleWriteLocations);
    }
    /**
     * An array that contains the regions ordered by their failover priorities.
     * 
    */
    public List<FailoverPolicyResponse> getFailoverPolicies() {
        return this.failoverPolicies;
    }
    /**
     * The unique resource identifier of the ARM resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity for the resource.
     * 
    */
    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * List of IpRules.
     * 
    */
    public List<IpAddressOrRangeResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }
    /**
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     * 
    */
    public Optional<Boolean> getIsVirtualNetworkFilterEnabled() {
        return Optional.ofNullable(this.isVirtualNetworkFilterEnabled);
    }
    /**
     * The URI of the key vault
     * 
    */
    public Optional<String> getKeyVaultKeyUri() {
        return Optional.ofNullable(this.keyVaultKeyUri);
    }
    /**
     * Indicates the type of database account. This can only be set at database account creation.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The location of the resource group to which the resource belongs.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * An array that contains all of the locations enabled for the Cosmos DB account.
     * 
    */
    public List<LocationResponse> getLocations() {
        return this.locations;
    }
    /**
     * The name of the ARM resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Indicates what services are allowed to bypass firewall checks.
     * 
    */
    public Optional<String> getNetworkAclBypass() {
        return Optional.ofNullable(this.networkAclBypass);
    }
    /**
     * An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     * 
    */
    public List<String> getNetworkAclBypassResourceIds() {
        return this.networkAclBypassResourceIds == null ? List.of() : this.networkAclBypassResourceIds;
    }
    /**
     * List of Private Endpoint Connections configured for the Cosmos DB account.
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * The status of the Cosmos DB account at the time the operation was called. The status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in Creating state, only properties that are specified as input for the Create Cosmos DB account operation are returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation. 'DeletionFailed' – the Cosmos DB account deletion failed.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether requests from Public Network are allowed
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * An array that contains of the read locations enabled for the Cosmos DB account.
     * 
    */
    public List<LocationResponse> getReadLocations() {
        return this.readLocations;
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of Azure resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     * 
    */
    public List<VirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }
    /**
     * An array that contains the write location for the Cosmos DB account.
     * 
    */
    public List<LocationResponse> getWriteLocations() {
        return this.writeLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApiPropertiesResponse apiProperties;
        private @Nullable Either<ContinuousModeBackupPolicyResponse,PeriodicModeBackupPolicyResponse> backupPolicy;
        private @Nullable List<CapabilityResponse> capabilities;
        private @Nullable String connectorOffer;
        private @Nullable ConsistencyPolicyResponse consistencyPolicy;
        private @Nullable List<CorsPolicyResponse> cors;
        private String databaseAccountOfferType;
        private @Nullable String defaultIdentity;
        private @Nullable Boolean disableKeyBasedMetadataWriteAccess;
        private String documentEndpoint;
        private @Nullable Boolean enableAnalyticalStorage;
        private @Nullable Boolean enableAutomaticFailover;
        private @Nullable Boolean enableCassandraConnector;
        private @Nullable Boolean enableFreeTier;
        private @Nullable Boolean enableMultipleWriteLocations;
        private List<FailoverPolicyResponse> failoverPolicies;
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable List<IpAddressOrRangeResponse> ipRules;
        private @Nullable Boolean isVirtualNetworkFilterEnabled;
        private @Nullable String keyVaultKeyUri;
        private @Nullable String kind;
        private @Nullable String location;
        private List<LocationResponse> locations;
        private String name;
        private @Nullable String networkAclBypass;
        private @Nullable List<String> networkAclBypassResourceIds;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private List<LocationResponse> readLocations;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;
        private List<LocationResponse> writeLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProperties = defaults.apiProperties;
    	      this.backupPolicy = defaults.backupPolicy;
    	      this.capabilities = defaults.capabilities;
    	      this.connectorOffer = defaults.connectorOffer;
    	      this.consistencyPolicy = defaults.consistencyPolicy;
    	      this.cors = defaults.cors;
    	      this.databaseAccountOfferType = defaults.databaseAccountOfferType;
    	      this.defaultIdentity = defaults.defaultIdentity;
    	      this.disableKeyBasedMetadataWriteAccess = defaults.disableKeyBasedMetadataWriteAccess;
    	      this.documentEndpoint = defaults.documentEndpoint;
    	      this.enableAnalyticalStorage = defaults.enableAnalyticalStorage;
    	      this.enableAutomaticFailover = defaults.enableAutomaticFailover;
    	      this.enableCassandraConnector = defaults.enableCassandraConnector;
    	      this.enableFreeTier = defaults.enableFreeTier;
    	      this.enableMultipleWriteLocations = defaults.enableMultipleWriteLocations;
    	      this.failoverPolicies = defaults.failoverPolicies;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.ipRules = defaults.ipRules;
    	      this.isVirtualNetworkFilterEnabled = defaults.isVirtualNetworkFilterEnabled;
    	      this.keyVaultKeyUri = defaults.keyVaultKeyUri;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.networkAclBypass = defaults.networkAclBypass;
    	      this.networkAclBypassResourceIds = defaults.networkAclBypassResourceIds;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.readLocations = defaults.readLocations;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
    	      this.writeLocations = defaults.writeLocations;
        }

        public Builder apiProperties(@Nullable ApiPropertiesResponse apiProperties) {
            this.apiProperties = apiProperties;
            return this;
        }

        public Builder backupPolicy(@Nullable Either<ContinuousModeBackupPolicyResponse,PeriodicModeBackupPolicyResponse> backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }

        public Builder capabilities(@Nullable List<CapabilityResponse> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder connectorOffer(@Nullable String connectorOffer) {
            this.connectorOffer = connectorOffer;
            return this;
        }

        public Builder consistencyPolicy(@Nullable ConsistencyPolicyResponse consistencyPolicy) {
            this.consistencyPolicy = consistencyPolicy;
            return this;
        }

        public Builder cors(@Nullable List<CorsPolicyResponse> cors) {
            this.cors = cors;
            return this;
        }

        public Builder databaseAccountOfferType(String databaseAccountOfferType) {
            this.databaseAccountOfferType = Objects.requireNonNull(databaseAccountOfferType);
            return this;
        }

        public Builder defaultIdentity(@Nullable String defaultIdentity) {
            this.defaultIdentity = defaultIdentity;
            return this;
        }

        public Builder disableKeyBasedMetadataWriteAccess(@Nullable Boolean disableKeyBasedMetadataWriteAccess) {
            this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
            return this;
        }

        public Builder documentEndpoint(String documentEndpoint) {
            this.documentEndpoint = Objects.requireNonNull(documentEndpoint);
            return this;
        }

        public Builder enableAnalyticalStorage(@Nullable Boolean enableAnalyticalStorage) {
            this.enableAnalyticalStorage = enableAnalyticalStorage;
            return this;
        }

        public Builder enableAutomaticFailover(@Nullable Boolean enableAutomaticFailover) {
            this.enableAutomaticFailover = enableAutomaticFailover;
            return this;
        }

        public Builder enableCassandraConnector(@Nullable Boolean enableCassandraConnector) {
            this.enableCassandraConnector = enableCassandraConnector;
            return this;
        }

        public Builder enableFreeTier(@Nullable Boolean enableFreeTier) {
            this.enableFreeTier = enableFreeTier;
            return this;
        }

        public Builder enableMultipleWriteLocations(@Nullable Boolean enableMultipleWriteLocations) {
            this.enableMultipleWriteLocations = enableMultipleWriteLocations;
            return this;
        }

        public Builder failoverPolicies(List<FailoverPolicyResponse> failoverPolicies) {
            this.failoverPolicies = Objects.requireNonNull(failoverPolicies);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder identity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder ipRules(@Nullable List<IpAddressOrRangeResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder isVirtualNetworkFilterEnabled(@Nullable Boolean isVirtualNetworkFilterEnabled) {
            this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
            return this;
        }

        public Builder keyVaultKeyUri(@Nullable String keyVaultKeyUri) {
            this.keyVaultKeyUri = keyVaultKeyUri;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder locations(List<LocationResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkAclBypass(@Nullable String networkAclBypass) {
            this.networkAclBypass = networkAclBypass;
            return this;
        }

        public Builder networkAclBypassResourceIds(@Nullable List<String> networkAclBypassResourceIds) {
            this.networkAclBypassResourceIds = networkAclBypassResourceIds;
            return this;
        }

        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder readLocations(List<LocationResponse> readLocations) {
            this.readLocations = Objects.requireNonNull(readLocations);
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

        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        public Builder writeLocations(List<LocationResponse> writeLocations) {
            this.writeLocations = Objects.requireNonNull(writeLocations);
            return this;
        }
        public GetDatabaseAccountResult build() {
            return new GetDatabaseAccountResult(apiProperties, backupPolicy, capabilities, connectorOffer, consistencyPolicy, cors, databaseAccountOfferType, defaultIdentity, disableKeyBasedMetadataWriteAccess, documentEndpoint, enableAnalyticalStorage, enableAutomaticFailover, enableCassandraConnector, enableFreeTier, enableMultipleWriteLocations, failoverPolicies, id, identity, ipRules, isVirtualNetworkFilterEnabled, keyVaultKeyUri, kind, location, locations, name, networkAclBypass, networkAclBypassResourceIds, privateEndpointConnections, provisioningState, publicNetworkAccess, readLocations, tags, type, virtualNetworkRules, writeLocations);
        }
    }
}
