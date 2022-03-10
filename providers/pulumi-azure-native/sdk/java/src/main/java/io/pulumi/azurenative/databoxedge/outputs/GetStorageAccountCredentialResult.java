// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStorageAccountCredentialResult {
    /**
     * Encrypted storage key.
     * 
     */
    private final @Nullable AsymmetricEncryptedSecretResponse accountKey;
    /**
     * Type of storage accessed on the storage account.
     * 
     */
    private final String accountType;
    /**
     * Alias for the storage account.
     * 
     */
    private final String alias;
    /**
     * Blob end point for private clouds.
     * 
     */
    private final @Nullable String blobDomainName;
    /**
     * Connection string for the storage account. Use this string if username and account key are not specified.
     * 
     */
    private final @Nullable String connectionString;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * Signifies whether SSL needs to be enabled or not.
     * 
     */
    private final String sslStatus;
    /**
     * Id of the storage account.
     * 
     */
    private final @Nullable String storageAccountId;
    /**
     * StorageAccountCredential object
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * Username for the storage account.
     * 
     */
    private final @Nullable String userName;

    @OutputCustomType.Constructor
    private GetStorageAccountCredentialResult(
        @OutputCustomType.Parameter("accountKey") @Nullable AsymmetricEncryptedSecretResponse accountKey,
        @OutputCustomType.Parameter("accountType") String accountType,
        @OutputCustomType.Parameter("alias") String alias,
        @OutputCustomType.Parameter("blobDomainName") @Nullable String blobDomainName,
        @OutputCustomType.Parameter("connectionString") @Nullable String connectionString,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("sslStatus") String sslStatus,
        @OutputCustomType.Parameter("storageAccountId") @Nullable String storageAccountId,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userName") @Nullable String userName) {
        this.accountKey = accountKey;
        this.accountType = accountType;
        this.alias = alias;
        this.blobDomainName = blobDomainName;
        this.connectionString = connectionString;
        this.id = id;
        this.name = name;
        this.sslStatus = sslStatus;
        this.storageAccountId = storageAccountId;
        this.systemData = systemData;
        this.type = type;
        this.userName = userName;
    }

    /**
     * Encrypted storage key.
     * 
    */
    public Optional<AsymmetricEncryptedSecretResponse> getAccountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    /**
     * Type of storage accessed on the storage account.
     * 
    */
    public String getAccountType() {
        return this.accountType;
    }
    /**
     * Alias for the storage account.
     * 
    */
    public String getAlias() {
        return this.alias;
    }
    /**
     * Blob end point for private clouds.
     * 
    */
    public Optional<String> getBlobDomainName() {
        return Optional.ofNullable(this.blobDomainName);
    }
    /**
     * Connection string for the storage account. Use this string if username and account key are not specified.
     * 
    */
    public Optional<String> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The object name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Signifies whether SSL needs to be enabled or not.
     * 
    */
    public String getSslStatus() {
        return this.sslStatus;
    }
    /**
     * Id of the storage account.
     * 
    */
    public Optional<String> getStorageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }
    /**
     * StorageAccountCredential object
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Username for the storage account.
     * 
    */
    public Optional<String> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageAccountCredentialResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AsymmetricEncryptedSecretResponse accountKey;
        private String accountType;
        private String alias;
        private @Nullable String blobDomainName;
        private @Nullable String connectionString;
        private String id;
        private String name;
        private String sslStatus;
        private @Nullable String storageAccountId;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageAccountCredentialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountType = defaults.accountType;
    	      this.alias = defaults.alias;
    	      this.blobDomainName = defaults.blobDomainName;
    	      this.connectionString = defaults.connectionString;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sslStatus = defaults.sslStatus;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder accountKey(@Nullable AsymmetricEncryptedSecretResponse accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder accountType(String accountType) {
            this.accountType = Objects.requireNonNull(accountType);
            return this;
        }

        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }

        public Builder blobDomainName(@Nullable String blobDomainName) {
            this.blobDomainName = blobDomainName;
            return this;
        }

        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
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

        public Builder sslStatus(String sslStatus) {
            this.sslStatus = Objects.requireNonNull(sslStatus);
            return this;
        }

        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public GetStorageAccountCredentialResult build() {
            return new GetStorageAccountCredentialResult(accountKey, accountType, alias, blobDomainName, connectionString, id, name, sslStatus, storageAccountId, systemData, type, userName);
        }
    }
}
