// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AmazonRdsForOraclePartitionSettingsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity AmazonRdsForOracle source.
 * 
 */
public final class AmazonRdsForOracleSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AmazonRdsForOracleSourceResponse Empty = new AmazonRdsForOracleSourceResponse();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
    private @Nullable Object additionalColumns;

    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Object> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Object disableMetricsCollection;

    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Object maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * AmazonRdsForOracle reader query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="oracleReaderQuery")
    private @Nullable Object oracleReaderQuery;

    /**
     * @return AmazonRdsForOracle reader query. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> oracleReaderQuery() {
        return Optional.ofNullable(this.oracleReaderQuery);
    }

    /**
     * The partition mechanism that will be used for AmazonRdsForOracle read in parallel. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionOption")
    private @Nullable Object partitionOption;

    /**
     * @return The partition mechanism that will be used for AmazonRdsForOracle read in parallel. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionOption() {
        return Optional.ofNullable(this.partitionOption);
    }

    /**
     * The settings that will be leveraged for AmazonRdsForOracle source partitioning.
     * 
     */
    @Import(name="partitionSettings")
    private @Nullable AmazonRdsForOraclePartitionSettingsResponse partitionSettings;

    /**
     * @return The settings that will be leveraged for AmazonRdsForOracle source partitioning.
     * 
     */
    public Optional<AmazonRdsForOraclePartitionSettingsResponse> partitionSettings() {
        return Optional.ofNullable(this.partitionSettings);
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Object queryTimeout;

    /**
     * @return Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Object sourceRetryCount;

    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Object sourceRetryWait;

    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is &#39;AmazonRdsForOracleSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Copy source type.
     * Expected value is &#39;AmazonRdsForOracleSource&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private AmazonRdsForOracleSourceResponse() {}

    private AmazonRdsForOracleSourceResponse(AmazonRdsForOracleSourceResponse $) {
        this.additionalColumns = $.additionalColumns;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.oracleReaderQuery = $.oracleReaderQuery;
        this.partitionOption = $.partitionOption;
        this.partitionSettings = $.partitionSettings;
        this.queryTimeout = $.queryTimeout;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmazonRdsForOracleSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmazonRdsForOracleSourceResponse $;

        public Builder() {
            $ = new AmazonRdsForOracleSourceResponse();
        }

        public Builder(AmazonRdsForOracleSourceResponse defaults) {
            $ = new AmazonRdsForOracleSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(@Nullable Object additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param oracleReaderQuery AmazonRdsForOracle reader query. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder oracleReaderQuery(@Nullable Object oracleReaderQuery) {
            $.oracleReaderQuery = oracleReaderQuery;
            return this;
        }

        /**
         * @param partitionOption The partition mechanism that will be used for AmazonRdsForOracle read in parallel. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionOption(@Nullable Object partitionOption) {
            $.partitionOption = partitionOption;
            return this;
        }

        /**
         * @param partitionSettings The settings that will be leveraged for AmazonRdsForOracle source partitioning.
         * 
         * @return builder
         * 
         */
        public Builder partitionSettings(@Nullable AmazonRdsForOraclePartitionSettingsResponse partitionSettings) {
            $.partitionSettings = partitionSettings;
            return this;
        }

        /**
         * @param queryTimeout Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;AmazonRdsForOracleSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AmazonRdsForOracleSourceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
