// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation.outputs;

import io.pulumi.azurenative.machinelearningexperimentation.outputs.StorageAccountPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccountResult {
    /**
     * The immutable id associated with this team account.
     * 
     */
    private final String accountId;
    /**
     * The creation date of the machine learning team account in ISO8601 format.
     * 
     */
    private final String creationDate;
    /**
     * The description of this workspace.
     * 
     */
    private final @Nullable String description;
    /**
     * The uri for this machine learning team account.
     * 
     */
    private final String discoveryUri;
    /**
     * The friendly name for this workspace. This will be the workspace name in the arm id when the workspace object gets created
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The fully qualified arm id of the user key vault.
     * 
     */
    private final String keyVaultId;
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    private final String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The current deployment state of team account resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * The no of users/seats who can access this team account. This property defines the charge on the team account.
     * 
     */
    private final @Nullable String seats;
    /**
     * The properties of the storage account for the machine learning team account.
     * 
     */
    private final StorageAccountPropertiesResponse storageAccount;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The fully qualified arm id of the vso account to be used for this team account.
     * 
     */
    private final String vsoAccountId;

    @OutputCustomType.Constructor
    private GetAccountResult(
        @OutputCustomType.Parameter("accountId") String accountId,
        @OutputCustomType.Parameter("creationDate") String creationDate,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("discoveryUri") String discoveryUri,
        @OutputCustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("keyVaultId") String keyVaultId,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("seats") @Nullable String seats,
        @OutputCustomType.Parameter("storageAccount") StorageAccountPropertiesResponse storageAccount,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("vsoAccountId") String vsoAccountId) {
        this.accountId = accountId;
        this.creationDate = creationDate;
        this.description = description;
        this.discoveryUri = discoveryUri;
        this.friendlyName = friendlyName;
        this.id = id;
        this.keyVaultId = keyVaultId;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.seats = seats;
        this.storageAccount = storageAccount;
        this.tags = tags;
        this.type = type;
        this.vsoAccountId = vsoAccountId;
    }

    /**
     * The immutable id associated with this team account.
     * 
    */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * The creation date of the machine learning team account in ISO8601 format.
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The description of this workspace.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The uri for this machine learning team account.
     * 
    */
    public String getDiscoveryUri() {
        return this.discoveryUri;
    }
    /**
     * The friendly name for this workspace. This will be the workspace name in the arm id when the workspace object gets created
     * 
    */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The fully qualified arm id of the user key vault.
     * 
    */
    public String getKeyVaultId() {
        return this.keyVaultId;
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The current deployment state of team account resource. The provisioningState is to indicate states for resource provisioning.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The no of users/seats who can access this team account. This property defines the charge on the team account.
     * 
    */
    public Optional<String> getSeats() {
        return Optional.ofNullable(this.seats);
    }
    /**
     * The properties of the storage account for the machine learning team account.
     * 
    */
    public StorageAccountPropertiesResponse getStorageAccount() {
        return this.storageAccount;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The fully qualified arm id of the vso account to be used for this team account.
     * 
    */
    public String getVsoAccountId() {
        return this.vsoAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String creationDate;
        private @Nullable String description;
        private String discoveryUri;
        private @Nullable String friendlyName;
        private String id;
        private String keyVaultId;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable String seats;
        private StorageAccountPropertiesResponse storageAccount;
        private @Nullable Map<String,String> tags;
        private String type;
        private String vsoAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.creationDate = defaults.creationDate;
    	      this.description = defaults.description;
    	      this.discoveryUri = defaults.discoveryUri;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.seats = defaults.seats;
    	      this.storageAccount = defaults.storageAccount;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vsoAccountId = defaults.vsoAccountId;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder discoveryUri(String discoveryUri) {
            this.discoveryUri = Objects.requireNonNull(discoveryUri);
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder keyVaultId(String keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
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

        public Builder seats(@Nullable String seats) {
            this.seats = seats;
            return this;
        }

        public Builder storageAccount(StorageAccountPropertiesResponse storageAccount) {
            this.storageAccount = Objects.requireNonNull(storageAccount);
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

        public Builder vsoAccountId(String vsoAccountId) {
            this.vsoAccountId = Objects.requireNonNull(vsoAccountId);
            return this;
        }
        public GetAccountResult build() {
            return new GetAccountResult(accountId, creationDate, description, discoveryUri, friendlyName, id, keyVaultId, location, name, provisioningState, seats, storageAccount, tags, type, vsoAccountId);
        }
    }
}
