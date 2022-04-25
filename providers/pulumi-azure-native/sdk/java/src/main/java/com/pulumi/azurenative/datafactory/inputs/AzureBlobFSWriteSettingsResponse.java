// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure blobFS write settings.
 * 
 */
public final class AzureBlobFSWriteSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureBlobFSWriteSettingsResponse Empty = new AzureBlobFSWriteSettingsResponse();

    /**
     * Indicates the block size(MB) when writing data to blob. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="blockSizeInMB")
    private @Nullable Object blockSizeInMB;

    /**
     * @return Indicates the block size(MB) when writing data to blob. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> blockSizeInMB() {
        return Optional.ofNullable(this.blockSizeInMB);
    }

    /**
     * The type of copy behavior for copy sink.
     * 
     */
    @Import(name="copyBehavior")
    private @Nullable Object copyBehavior;

    /**
     * @return The type of copy behavior for copy sink.
     * 
     */
    public Optional<Object> copyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
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
     * The write setting type.
     * Expected value is &#39;AzureBlobFSWriteSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The write setting type.
     * Expected value is &#39;AzureBlobFSWriteSettings&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private AzureBlobFSWriteSettingsResponse() {}

    private AzureBlobFSWriteSettingsResponse(AzureBlobFSWriteSettingsResponse $) {
        this.blockSizeInMB = $.blockSizeInMB;
        this.copyBehavior = $.copyBehavior;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBlobFSWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBlobFSWriteSettingsResponse $;

        public Builder() {
            $ = new AzureBlobFSWriteSettingsResponse();
        }

        public Builder(AzureBlobFSWriteSettingsResponse defaults) {
            $ = new AzureBlobFSWriteSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockSizeInMB Indicates the block size(MB) when writing data to blob. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder blockSizeInMB(@Nullable Object blockSizeInMB) {
            $.blockSizeInMB = blockSizeInMB;
            return this;
        }

        /**
         * @param copyBehavior The type of copy behavior for copy sink.
         * 
         * @return builder
         * 
         */
        public Builder copyBehavior(@Nullable Object copyBehavior) {
            $.copyBehavior = copyBehavior;
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
         * @param type The write setting type.
         * Expected value is &#39;AzureBlobFSWriteSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AzureBlobFSWriteSettingsResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
