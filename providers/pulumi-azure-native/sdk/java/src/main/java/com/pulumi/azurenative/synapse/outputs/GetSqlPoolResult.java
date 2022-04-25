// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSqlPoolResult {
    /**
     * @return Collation mode
     * 
     */
    private final @Nullable String collation;
    /**
     * @return Specifies the mode of sql pool creation.
     * 
     * Default: regular sql pool creation.
     * 
     * PointInTimeRestore: Creates a sql pool by restoring a point in time backup of an existing sql pool. sourceDatabaseId must be specified as the resource ID of the existing sql pool, and restorePointInTime must be specified.
     * 
     * Recovery: Creates a sql pool by a geo-replicated backup. sourceDatabaseId  must be specified as the recoverableDatabaseId to restore.
     * 
     * Restore: Creates a sql pool by restoring a backup of a deleted sql  pool. SourceDatabaseId should be the sql pool&#39;s original resource ID. SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     * 
     */
    private final @Nullable String createMode;
    /**
     * @return Date the SQL pool was created
     * 
     */
    private final @Nullable String creationDate;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return Maximum size in bytes
     * 
     */
    private final @Nullable Double maxSizeBytes;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Resource state
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * @return Backup database to restore from
     * 
     */
    private final @Nullable String recoverableDatabaseId;
    /**
     * @return Snapshot time to restore
     * 
     */
    private final @Nullable String restorePointInTime;
    /**
     * @return SQL pool SKU
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * @return Source database to create from
     * 
     */
    private final @Nullable String sourceDatabaseId;
    /**
     * @return Resource status
     * 
     */
    private final @Nullable String status;
    /**
     * @return The storage account type used to store backups for this sql pool.
     * 
     */
    private final @Nullable String storageAccountType;
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
    private GetSqlPoolResult(
        @CustomType.Parameter("collation") @Nullable String collation,
        @CustomType.Parameter("createMode") @Nullable String createMode,
        @CustomType.Parameter("creationDate") @Nullable String creationDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("maxSizeBytes") @Nullable Double maxSizeBytes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("recoverableDatabaseId") @Nullable String recoverableDatabaseId,
        @CustomType.Parameter("restorePointInTime") @Nullable String restorePointInTime,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("sourceDatabaseId") @Nullable String sourceDatabaseId,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("storageAccountType") @Nullable String storageAccountType,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.collation = collation;
        this.createMode = createMode;
        this.creationDate = creationDate;
        this.id = id;
        this.location = location;
        this.maxSizeBytes = maxSizeBytes;
        this.name = name;
        this.provisioningState = provisioningState;
        this.recoverableDatabaseId = recoverableDatabaseId;
        this.restorePointInTime = restorePointInTime;
        this.sku = sku;
        this.sourceDatabaseId = sourceDatabaseId;
        this.status = status;
        this.storageAccountType = storageAccountType;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Collation mode
     * 
     */
    public Optional<String> collation() {
        return Optional.ofNullable(this.collation);
    }
    /**
     * @return Specifies the mode of sql pool creation.
     * 
     * Default: regular sql pool creation.
     * 
     * PointInTimeRestore: Creates a sql pool by restoring a point in time backup of an existing sql pool. sourceDatabaseId must be specified as the resource ID of the existing sql pool, and restorePointInTime must be specified.
     * 
     * Recovery: Creates a sql pool by a geo-replicated backup. sourceDatabaseId  must be specified as the recoverableDatabaseId to restore.
     * 
     * Restore: Creates a sql pool by restoring a backup of a deleted sql  pool. SourceDatabaseId should be the sql pool&#39;s original resource ID. SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     * 
     */
    public Optional<String> createMode() {
        return Optional.ofNullable(this.createMode);
    }
    /**
     * @return Date the SQL pool was created
     * 
     */
    public Optional<String> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Maximum size in bytes
     * 
     */
    public Optional<Double> maxSizeBytes() {
        return Optional.ofNullable(this.maxSizeBytes);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource state
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * @return Backup database to restore from
     * 
     */
    public Optional<String> recoverableDatabaseId() {
        return Optional.ofNullable(this.recoverableDatabaseId);
    }
    /**
     * @return Snapshot time to restore
     * 
     */
    public Optional<String> restorePointInTime() {
        return Optional.ofNullable(this.restorePointInTime);
    }
    /**
     * @return SQL pool SKU
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Source database to create from
     * 
     */
    public Optional<String> sourceDatabaseId() {
        return Optional.ofNullable(this.sourceDatabaseId);
    }
    /**
     * @return Resource status
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The storage account type used to store backups for this sql pool.
     * 
     */
    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
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

    public static Builder builder(GetSqlPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String collation;
        private @Nullable String createMode;
        private @Nullable String creationDate;
        private String id;
        private String location;
        private @Nullable Double maxSizeBytes;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable String recoverableDatabaseId;
        private @Nullable String restorePointInTime;
        private @Nullable SkuResponse sku;
        private @Nullable String sourceDatabaseId;
        private @Nullable String status;
        private @Nullable String storageAccountType;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collation = defaults.collation;
    	      this.createMode = defaults.createMode;
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maxSizeBytes = defaults.maxSizeBytes;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.recoverableDatabaseId = defaults.recoverableDatabaseId;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.sku = defaults.sku;
    	      this.sourceDatabaseId = defaults.sourceDatabaseId;
    	      this.status = defaults.status;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder collation(@Nullable String collation) {
            this.collation = collation;
            return this;
        }
        public Builder createMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }
        public Builder creationDate(@Nullable String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder maxSizeBytes(@Nullable Double maxSizeBytes) {
            this.maxSizeBytes = maxSizeBytes;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder recoverableDatabaseId(@Nullable String recoverableDatabaseId) {
            this.recoverableDatabaseId = recoverableDatabaseId;
            return this;
        }
        public Builder restorePointInTime(@Nullable String restorePointInTime) {
            this.restorePointInTime = restorePointInTime;
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder sourceDatabaseId(@Nullable String sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSqlPoolResult build() {
            return new GetSqlPoolResult(collation, createMode, creationDate, id, location, maxSizeBytes, name, provisioningState, recoverableDatabaseId, restorePointInTime, sku, sourceDatabaseId, status, storageAccountType, tags, type);
        }
    }
}
