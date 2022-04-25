// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
 * 
 */
public final class RedisCommonPropertiesResponseRedisConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final RedisCommonPropertiesResponseRedisConfiguration Empty = new RedisCommonPropertiesResponseRedisConfiguration();

    /**
     * First storage account connection string
     * 
     */
    @Import(name="aofStorageConnectionString0")
    private @Nullable String aofStorageConnectionString0;

    /**
     * @return First storage account connection string
     * 
     */
    public Optional<String> aofStorageConnectionString0() {
        return Optional.ofNullable(this.aofStorageConnectionString0);
    }

    /**
     * Second storage account connection string
     * 
     */
    @Import(name="aofStorageConnectionString1")
    private @Nullable String aofStorageConnectionString1;

    /**
     * @return Second storage account connection string
     * 
     */
    public Optional<String> aofStorageConnectionString1() {
        return Optional.ofNullable(this.aofStorageConnectionString1);
    }

    /**
     * The max clients config
     * 
     */
    @Import(name="maxclients", required=true)
    private String maxclients;

    /**
     * @return The max clients config
     * 
     */
    public String maxclients() {
        return this.maxclients;
    }

    /**
     * Value in megabytes reserved for fragmentation per shard
     * 
     */
    @Import(name="maxfragmentationmemoryReserved")
    private @Nullable String maxfragmentationmemoryReserved;

    /**
     * @return Value in megabytes reserved for fragmentation per shard
     * 
     */
    public Optional<String> maxfragmentationmemoryReserved() {
        return Optional.ofNullable(this.maxfragmentationmemoryReserved);
    }

    /**
     * Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    @Import(name="maxmemoryDelta")
    private @Nullable String maxmemoryDelta;

    /**
     * @return Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    public Optional<String> maxmemoryDelta() {
        return Optional.ofNullable(this.maxmemoryDelta);
    }

    /**
     * The eviction strategy used when your data won&#39;t fit within its memory limit.
     * 
     */
    @Import(name="maxmemoryPolicy")
    private @Nullable String maxmemoryPolicy;

    /**
     * @return The eviction strategy used when your data won&#39;t fit within its memory limit.
     * 
     */
    public Optional<String> maxmemoryPolicy() {
        return Optional.ofNullable(this.maxmemoryPolicy);
    }

    /**
     * Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    @Import(name="maxmemoryReserved")
    private @Nullable String maxmemoryReserved;

    /**
     * @return Value in megabytes reserved for non-cache usage per shard e.g. failover.
     * 
     */
    public Optional<String> maxmemoryReserved() {
        return Optional.ofNullable(this.maxmemoryReserved);
    }

    /**
     * Specifies whether the rdb backup is enabled
     * 
     */
    @Import(name="rdbBackupEnabled")
    private @Nullable String rdbBackupEnabled;

    /**
     * @return Specifies whether the rdb backup is enabled
     * 
     */
    public Optional<String> rdbBackupEnabled() {
        return Optional.ofNullable(this.rdbBackupEnabled);
    }

    /**
     * Specifies the frequency for creating rdb backup
     * 
     */
    @Import(name="rdbBackupFrequency")
    private @Nullable String rdbBackupFrequency;

    /**
     * @return Specifies the frequency for creating rdb backup
     * 
     */
    public Optional<String> rdbBackupFrequency() {
        return Optional.ofNullable(this.rdbBackupFrequency);
    }

    /**
     * Specifies the maximum number of snapshots for rdb backup
     * 
     */
    @Import(name="rdbBackupMaxSnapshotCount")
    private @Nullable String rdbBackupMaxSnapshotCount;

    /**
     * @return Specifies the maximum number of snapshots for rdb backup
     * 
     */
    public Optional<String> rdbBackupMaxSnapshotCount() {
        return Optional.ofNullable(this.rdbBackupMaxSnapshotCount);
    }

    /**
     * The storage account connection string for storing rdb file
     * 
     */
    @Import(name="rdbStorageConnectionString")
    private @Nullable String rdbStorageConnectionString;

    /**
     * @return The storage account connection string for storing rdb file
     * 
     */
    public Optional<String> rdbStorageConnectionString() {
        return Optional.ofNullable(this.rdbStorageConnectionString);
    }

    private RedisCommonPropertiesResponseRedisConfiguration() {}

    private RedisCommonPropertiesResponseRedisConfiguration(RedisCommonPropertiesResponseRedisConfiguration $) {
        this.aofStorageConnectionString0 = $.aofStorageConnectionString0;
        this.aofStorageConnectionString1 = $.aofStorageConnectionString1;
        this.maxclients = $.maxclients;
        this.maxfragmentationmemoryReserved = $.maxfragmentationmemoryReserved;
        this.maxmemoryDelta = $.maxmemoryDelta;
        this.maxmemoryPolicy = $.maxmemoryPolicy;
        this.maxmemoryReserved = $.maxmemoryReserved;
        this.rdbBackupEnabled = $.rdbBackupEnabled;
        this.rdbBackupFrequency = $.rdbBackupFrequency;
        this.rdbBackupMaxSnapshotCount = $.rdbBackupMaxSnapshotCount;
        this.rdbStorageConnectionString = $.rdbStorageConnectionString;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisCommonPropertiesResponseRedisConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisCommonPropertiesResponseRedisConfiguration $;

        public Builder() {
            $ = new RedisCommonPropertiesResponseRedisConfiguration();
        }

        public Builder(RedisCommonPropertiesResponseRedisConfiguration defaults) {
            $ = new RedisCommonPropertiesResponseRedisConfiguration(Objects.requireNonNull(defaults));
        }

        /**
         * @param aofStorageConnectionString0 First storage account connection string
         * 
         * @return builder
         * 
         */
        public Builder aofStorageConnectionString0(@Nullable String aofStorageConnectionString0) {
            $.aofStorageConnectionString0 = aofStorageConnectionString0;
            return this;
        }

        /**
         * @param aofStorageConnectionString1 Second storage account connection string
         * 
         * @return builder
         * 
         */
        public Builder aofStorageConnectionString1(@Nullable String aofStorageConnectionString1) {
            $.aofStorageConnectionString1 = aofStorageConnectionString1;
            return this;
        }

        /**
         * @param maxclients The max clients config
         * 
         * @return builder
         * 
         */
        public Builder maxclients(String maxclients) {
            $.maxclients = maxclients;
            return this;
        }

        /**
         * @param maxfragmentationmemoryReserved Value in megabytes reserved for fragmentation per shard
         * 
         * @return builder
         * 
         */
        public Builder maxfragmentationmemoryReserved(@Nullable String maxfragmentationmemoryReserved) {
            $.maxfragmentationmemoryReserved = maxfragmentationmemoryReserved;
            return this;
        }

        /**
         * @param maxmemoryDelta Value in megabytes reserved for non-cache usage per shard e.g. failover.
         * 
         * @return builder
         * 
         */
        public Builder maxmemoryDelta(@Nullable String maxmemoryDelta) {
            $.maxmemoryDelta = maxmemoryDelta;
            return this;
        }

        /**
         * @param maxmemoryPolicy The eviction strategy used when your data won&#39;t fit within its memory limit.
         * 
         * @return builder
         * 
         */
        public Builder maxmemoryPolicy(@Nullable String maxmemoryPolicy) {
            $.maxmemoryPolicy = maxmemoryPolicy;
            return this;
        }

        /**
         * @param maxmemoryReserved Value in megabytes reserved for non-cache usage per shard e.g. failover.
         * 
         * @return builder
         * 
         */
        public Builder maxmemoryReserved(@Nullable String maxmemoryReserved) {
            $.maxmemoryReserved = maxmemoryReserved;
            return this;
        }

        /**
         * @param rdbBackupEnabled Specifies whether the rdb backup is enabled
         * 
         * @return builder
         * 
         */
        public Builder rdbBackupEnabled(@Nullable String rdbBackupEnabled) {
            $.rdbBackupEnabled = rdbBackupEnabled;
            return this;
        }

        /**
         * @param rdbBackupFrequency Specifies the frequency for creating rdb backup
         * 
         * @return builder
         * 
         */
        public Builder rdbBackupFrequency(@Nullable String rdbBackupFrequency) {
            $.rdbBackupFrequency = rdbBackupFrequency;
            return this;
        }

        /**
         * @param rdbBackupMaxSnapshotCount Specifies the maximum number of snapshots for rdb backup
         * 
         * @return builder
         * 
         */
        public Builder rdbBackupMaxSnapshotCount(@Nullable String rdbBackupMaxSnapshotCount) {
            $.rdbBackupMaxSnapshotCount = rdbBackupMaxSnapshotCount;
            return this;
        }

        /**
         * @param rdbStorageConnectionString The storage account connection string for storing rdb file
         * 
         * @return builder
         * 
         */
        public Builder rdbStorageConnectionString(@Nullable String rdbStorageConnectionString) {
            $.rdbStorageConnectionString = rdbStorageConnectionString;
            return this;
        }

        public RedisCommonPropertiesResponseRedisConfiguration build() {
            $.maxclients = Objects.requireNonNull($.maxclients, "expected parameter 'maxclients' to be non-null");
            return $;
        }
    }

}
