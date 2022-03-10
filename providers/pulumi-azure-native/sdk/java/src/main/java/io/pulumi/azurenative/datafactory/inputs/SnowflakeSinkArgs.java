// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SnowflakeImportCopyCommandArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity snowflake sink.
 * 
 */
public final class SnowflakeSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnowflakeSinkArgs Empty = new SnowflakeSinkArgs();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
      private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * Snowflake import settings.
     * 
     */
    @InputImport(name="importSettings")
      private final @Nullable Input<SnowflakeImportCopyCommandArgs> importSettings;

    public Input<SnowflakeImportCopyCommandArgs> getImportSettings() {
        return this.importSettings == null ? Input.empty() : this.importSettings;
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
      private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="preCopyScript")
      private final @Nullable Input<Object> preCopyScript;

    public Input<Object> getPreCopyScript() {
        return this.preCopyScript == null ? Input.empty() : this.preCopyScript;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sinkRetryCount")
      private final @Nullable Input<Object> sinkRetryCount;

    public Input<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Input.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sinkRetryWait")
      private final @Nullable Input<Object> sinkRetryWait;

    public Input<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Input.empty() : this.sinkRetryWait;
    }

    /**
     * Copy sink type.
     * Expected value is 'SnowflakeSink'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="writeBatchSize")
      private final @Nullable Input<Object> writeBatchSize;

    public Input<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Input.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="writeBatchTimeout")
      private final @Nullable Input<Object> writeBatchTimeout;

    public Input<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Input.empty() : this.writeBatchTimeout;
    }

    public SnowflakeSinkArgs(
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<SnowflakeImportCopyCommandArgs> importSettings,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> preCopyScript,
        @Nullable Input<Object> sinkRetryCount,
        @Nullable Input<Object> sinkRetryWait,
        Input<String> type,
        @Nullable Input<Object> writeBatchSize,
        @Nullable Input<Object> writeBatchTimeout) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.importSettings = importSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.preCopyScript = preCopyScript;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private SnowflakeSinkArgs() {
        this.disableMetricsCollection = Input.empty();
        this.importSettings = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.preCopyScript = Input.empty();
        this.sinkRetryCount = Input.empty();
        this.sinkRetryWait = Input.empty();
        this.type = Input.empty();
        this.writeBatchSize = Input.empty();
        this.writeBatchTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnowflakeSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<SnowflakeImportCopyCommandArgs> importSettings;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> preCopyScript;
        private @Nullable Input<Object> sinkRetryCount;
        private @Nullable Input<Object> sinkRetryWait;
        private Input<String> type;
        private @Nullable Input<Object> writeBatchSize;
        private @Nullable Input<Object> writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(SnowflakeSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.importSettings = defaults.importSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.preCopyScript = defaults.preCopyScript;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder disableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder importSettings(@Nullable Input<SnowflakeImportCopyCommandArgs> importSettings) {
            this.importSettings = importSettings;
            return this;
        }

        public Builder importSettings(@Nullable SnowflakeImportCopyCommandArgs importSettings) {
            this.importSettings = Input.ofNullable(importSettings);
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder preCopyScript(@Nullable Input<Object> preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }

        public Builder preCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = Input.ofNullable(preCopyScript);
            return this;
        }

        public Builder sinkRetryCount(@Nullable Input<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Input.ofNullable(sinkRetryCount);
            return this;
        }

        public Builder sinkRetryWait(@Nullable Input<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Input.ofNullable(sinkRetryWait);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder writeBatchSize(@Nullable Input<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Input.ofNullable(writeBatchSize);
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Input<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Input.ofNullable(writeBatchTimeout);
            return this;
        }
        public SnowflakeSinkArgs build() {
            return new SnowflakeSinkArgs(disableMetricsCollection, importSettings, maxConcurrentConnections, preCopyScript, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
