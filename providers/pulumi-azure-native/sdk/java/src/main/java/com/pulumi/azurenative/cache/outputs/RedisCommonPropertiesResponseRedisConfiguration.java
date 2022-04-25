// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RedisCommonPropertiesResponseRedisConfiguration {
    /**
     * @return First storage account connection string
     * 
     */
    private final @Nullable String aofStorageConnectionString0;
    /**
     * @return Second storage account connection string
     * 
     */
    private final @Nullable String aofStorageConnectionString1;
    /**
     * @return The max clients config
     * 
     */
    private final String maxclients;
    /**
     * @return Value in megabytes reserved for fragmentation per shard
     * 
     */
    private final @Nullable String maxfragmentationmemoryReserved;
    /**
     * @return Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    private final @Nullable String maxmemoryDelta;
    /**
     * @return The eviction strategy used when your data won&#39;t fit within its memory limit.
     * 
     */
    private final @Nullable String maxmemoryPolicy;
    /**
     * @return Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    private final @Nullable String maxmemoryReserved;
    /**
     * @return Specifies whether the rdb backup is enabled
     * 
     */
    private final @Nullable String rdbBackupEnabled;
    /**
     * @return Specifies the frequency for creating rdb backup
     * 
     */
    private final @Nullable String rdbBackupFrequency;
    /**
     * @return Specifies the maximum number of snapshots for rdb backup
     * 
     */
    private final @Nullable String rdbBackupMaxSnapshotCount;
    /**
     * @return The storage account connection string for storing rdb file
     * 
     */
    private final @Nullable String rdbStorageConnectionString;

    @CustomType.Constructor
    private RedisCommonPropertiesResponseRedisConfiguration(
        @CustomType.Parameter("aofStorageConnectionString0") @Nullable String aofStorageConnectionString0,
        @CustomType.Parameter("aofStorageConnectionString1") @Nullable String aofStorageConnectionString1,
        @CustomType.Parameter("maxclients") String maxclients,
        @CustomType.Parameter("maxfragmentationmemoryReserved") @Nullable String maxfragmentationmemoryReserved,
        @CustomType.Parameter("maxmemoryDelta") @Nullable String maxmemoryDelta,
        @CustomType.Parameter("maxmemoryPolicy") @Nullable String maxmemoryPolicy,
        @CustomType.Parameter("maxmemoryReserved") @Nullable String maxmemoryReserved,
        @CustomType.Parameter("rdbBackupEnabled") @Nullable String rdbBackupEnabled,
        @CustomType.Parameter("rdbBackupFrequency") @Nullable String rdbBackupFrequency,
        @CustomType.Parameter("rdbBackupMaxSnapshotCount") @Nullable String rdbBackupMaxSnapshotCount,
        @CustomType.Parameter("rdbStorageConnectionString") @Nullable String rdbStorageConnectionString) {
        this.aofStorageConnectionString0 = aofStorageConnectionString0;
        this.aofStorageConnectionString1 = aofStorageConnectionString1;
        this.maxclients = maxclients;
        this.maxfragmentationmemoryReserved = maxfragmentationmemoryReserved;
        this.maxmemoryDelta = maxmemoryDelta;
        this.maxmemoryPolicy = maxmemoryPolicy;
        this.maxmemoryReserved = maxmemoryReserved;
        this.rdbBackupEnabled = rdbBackupEnabled;
        this.rdbBackupFrequency = rdbBackupFrequency;
        this.rdbBackupMaxSnapshotCount = rdbBackupMaxSnapshotCount;
        this.rdbStorageConnectionString = rdbStorageConnectionString;
    }

    /**
     * @return First storage account connection string
     * 
     */
    public Optional<String> aofStorageConnectionString0() {
        return Optional.ofNullable(this.aofStorageConnectionString0);
    }
    /**
     * @return Second storage account connection string
     * 
     */
    public Optional<String> aofStorageConnectionString1() {
        return Optional.ofNullable(this.aofStorageConnectionString1);
    }
    /**
     * @return The max clients config
     * 
     */
    public String maxclients() {
        return this.maxclients;
    }
    /**
     * @return Value in megabytes reserved for fragmentation per shard
     * 
     */
    public Optional<String> maxfragmentationmemoryReserved() {
        return Optional.ofNullable(this.maxfragmentationmemoryReserved);
    }
    /**
     * @return Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    public Optional<String> maxmemoryDelta() {
        return Optional.ofNullable(this.maxmemoryDelta);
    }
    /**
     * @return The eviction strategy used when your data won&#39;t fit within its memory limit.
     * 
     */
    public Optional<String> maxmemoryPolicy() {
        return Optional.ofNullable(this.maxmemoryPolicy);
    }
    /**
     * @return Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    public Optional<String> maxmemoryReserved() {
        return Optional.ofNullable(this.maxmemoryReserved);
    }
    /**
     * @return Specifies whether the rdb backup is enabled
     * 
     */
    public Optional<String> rdbBackupEnabled() {
        return Optional.ofNullable(this.rdbBackupEnabled);
    }
    /**
     * @return Specifies the frequency for creating rdb backup
     * 
     */
    public Optional<String> rdbBackupFrequency() {
        return Optional.ofNullable(this.rdbBackupFrequency);
    }
    /**
     * @return Specifies the maximum number of snapshots for rdb backup
     * 
     */
    public Optional<String> rdbBackupMaxSnapshotCount() {
        return Optional.ofNullable(this.rdbBackupMaxSnapshotCount);
    }
    /**
     * @return The storage account connection string for storing rdb file
     * 
     */
    public Optional<String> rdbStorageConnectionString() {
        return Optional.ofNullable(this.rdbStorageConnectionString);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedisCommonPropertiesResponseRedisConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aofStorageConnectionString0;
        private @Nullable String aofStorageConnectionString1;
        private String maxclients;
        private @Nullable String maxfragmentationmemoryReserved;
        private @Nullable String maxmemoryDelta;
        private @Nullable String maxmemoryPolicy;
        private @Nullable String maxmemoryReserved;
        private @Nullable String rdbBackupEnabled;
        private @Nullable String rdbBackupFrequency;
        private @Nullable String rdbBackupMaxSnapshotCount;
        private @Nullable String rdbStorageConnectionString;

        public Builder() {
    	      // Empty
        }

        public Builder(RedisCommonPropertiesResponseRedisConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aofStorageConnectionString0 = defaults.aofStorageConnectionString0;
    	      this.aofStorageConnectionString1 = defaults.aofStorageConnectionString1;
    	      this.maxclients = defaults.maxclients;
    	      this.maxfragmentationmemoryReserved = defaults.maxfragmentationmemoryReserved;
    	      this.maxmemoryDelta = defaults.maxmemoryDelta;
    	      this.maxmemoryPolicy = defaults.maxmemoryPolicy;
    	      this.maxmemoryReserved = defaults.maxmemoryReserved;
    	      this.rdbBackupEnabled = defaults.rdbBackupEnabled;
    	      this.rdbBackupFrequency = defaults.rdbBackupFrequency;
    	      this.rdbBackupMaxSnapshotCount = defaults.rdbBackupMaxSnapshotCount;
    	      this.rdbStorageConnectionString = defaults.rdbStorageConnectionString;
        }

        public Builder aofStorageConnectionString0(@Nullable String aofStorageConnectionString0) {
            this.aofStorageConnectionString0 = aofStorageConnectionString0;
            return this;
        }
        public Builder aofStorageConnectionString1(@Nullable String aofStorageConnectionString1) {
            this.aofStorageConnectionString1 = aofStorageConnectionString1;
            return this;
        }
        public Builder maxclients(String maxclients) {
            this.maxclients = Objects.requireNonNull(maxclients);
            return this;
        }
        public Builder maxfragmentationmemoryReserved(@Nullable String maxfragmentationmemoryReserved) {
            this.maxfragmentationmemoryReserved = maxfragmentationmemoryReserved;
            return this;
        }
        public Builder maxmemoryDelta(@Nullable String maxmemoryDelta) {
            this.maxmemoryDelta = maxmemoryDelta;
            return this;
        }
        public Builder maxmemoryPolicy(@Nullable String maxmemoryPolicy) {
            this.maxmemoryPolicy = maxmemoryPolicy;
            return this;
        }
        public Builder maxmemoryReserved(@Nullable String maxmemoryReserved) {
            this.maxmemoryReserved = maxmemoryReserved;
            return this;
        }
        public Builder rdbBackupEnabled(@Nullable String rdbBackupEnabled) {
            this.rdbBackupEnabled = rdbBackupEnabled;
            return this;
        }
        public Builder rdbBackupFrequency(@Nullable String rdbBackupFrequency) {
            this.rdbBackupFrequency = rdbBackupFrequency;
            return this;
        }
        public Builder rdbBackupMaxSnapshotCount(@Nullable String rdbBackupMaxSnapshotCount) {
            this.rdbBackupMaxSnapshotCount = rdbBackupMaxSnapshotCount;
            return this;
        }
        public Builder rdbStorageConnectionString(@Nullable String rdbStorageConnectionString) {
            this.rdbStorageConnectionString = rdbStorageConnectionString;
            return this;
        }        public RedisCommonPropertiesResponseRedisConfiguration build() {
            return new RedisCommonPropertiesResponseRedisConfiguration(aofStorageConnectionString0, aofStorageConnectionString1, maxclients, maxfragmentationmemoryReserved, maxmemoryDelta, maxmemoryPolicy, maxmemoryReserved, rdbBackupEnabled, rdbBackupFrequency, rdbBackupMaxSnapshotCount, rdbStorageConnectionString);
        }
    }
}
