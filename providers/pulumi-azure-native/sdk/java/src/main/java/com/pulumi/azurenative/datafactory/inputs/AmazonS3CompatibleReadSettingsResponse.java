// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Amazon S3 Compatible read settings.
 * 
 */
public final class AmazonS3CompatibleReadSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AmazonS3CompatibleReadSettingsResponse Empty = new AmazonS3CompatibleReadSettingsResponse();

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="deleteFilesAfterCompletion")
    private @Nullable Object deleteFilesAfterCompletion;

    /**
     * @return Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> deleteFilesAfterCompletion() {
        return Optional.ofNullable(this.deleteFilesAfterCompletion);
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
     * Indicates whether to enable partition discovery.
     * 
     */
    @Import(name="enablePartitionDiscovery")
    private @Nullable Boolean enablePartitionDiscovery;

    /**
     * @return Indicates whether to enable partition discovery.
     * 
     */
    public Optional<Boolean> enablePartitionDiscovery() {
        return Optional.ofNullable(this.enablePartitionDiscovery);
    }

    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileListPath")
    private @Nullable Object fileListPath;

    /**
     * @return Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> fileListPath() {
        return Optional.ofNullable(this.fileListPath);
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
     * The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
    private @Nullable Object modifiedDatetimeEnd;

    /**
     * @return The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> modifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
    private @Nullable Object modifiedDatetimeStart;

    /**
     * @return The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> modifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionRootPath")
    private @Nullable Object partitionRootPath;

    /**
     * @return Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> partitionRootPath() {
        return Optional.ofNullable(this.partitionRootPath);
    }

    /**
     * The prefix filter for the S3 Compatible object name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="prefix")
    private @Nullable Object prefix;

    /**
     * @return The prefix filter for the S3 Compatible object name. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="recursive")
    private @Nullable Object recursive;

    /**
     * @return If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> recursive() {
        return Optional.ofNullable(this.recursive);
    }

    /**
     * The read setting type.
     * Expected value is &#39;AmazonS3CompatibleReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The read setting type.
     * Expected value is &#39;AmazonS3CompatibleReadSettings&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Amazon S3 Compatible wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFileName")
    private @Nullable Object wildcardFileName;

    /**
     * @return Amazon S3 Compatible wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> wildcardFileName() {
        return Optional.ofNullable(this.wildcardFileName);
    }

    /**
     * Amazon S3 Compatible wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFolderPath")
    private @Nullable Object wildcardFolderPath;

    /**
     * @return Amazon S3 Compatible wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> wildcardFolderPath() {
        return Optional.ofNullable(this.wildcardFolderPath);
    }

    private AmazonS3CompatibleReadSettingsResponse() {}

    private AmazonS3CompatibleReadSettingsResponse(AmazonS3CompatibleReadSettingsResponse $) {
        this.deleteFilesAfterCompletion = $.deleteFilesAfterCompletion;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.enablePartitionDiscovery = $.enablePartitionDiscovery;
        this.fileListPath = $.fileListPath;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.modifiedDatetimeEnd = $.modifiedDatetimeEnd;
        this.modifiedDatetimeStart = $.modifiedDatetimeStart;
        this.partitionRootPath = $.partitionRootPath;
        this.prefix = $.prefix;
        this.recursive = $.recursive;
        this.type = $.type;
        this.wildcardFileName = $.wildcardFileName;
        this.wildcardFolderPath = $.wildcardFolderPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmazonS3CompatibleReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmazonS3CompatibleReadSettingsResponse $;

        public Builder() {
            $ = new AmazonS3CompatibleReadSettingsResponse();
        }

        public Builder(AmazonS3CompatibleReadSettingsResponse defaults) {
            $ = new AmazonS3CompatibleReadSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteFilesAfterCompletion Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder deleteFilesAfterCompletion(@Nullable Object deleteFilesAfterCompletion) {
            $.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
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
         * @param enablePartitionDiscovery Indicates whether to enable partition discovery.
         * 
         * @return builder
         * 
         */
        public Builder enablePartitionDiscovery(@Nullable Boolean enablePartitionDiscovery) {
            $.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }

        /**
         * @param fileListPath Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileListPath(@Nullable Object fileListPath) {
            $.fileListPath = fileListPath;
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
         * @param modifiedDatetimeEnd The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            $.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        /**
         * @param modifiedDatetimeStart The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            $.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        /**
         * @param partitionRootPath Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionRootPath(@Nullable Object partitionRootPath) {
            $.partitionRootPath = partitionRootPath;
            return this;
        }

        /**
         * @param prefix The prefix filter for the S3 Compatible object name. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Object prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param recursive If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder recursive(@Nullable Object recursive) {
            $.recursive = recursive;
            return this;
        }

        /**
         * @param type The read setting type.
         * Expected value is &#39;AmazonS3CompatibleReadSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param wildcardFileName Amazon S3 Compatible wildcardFileName. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder wildcardFileName(@Nullable Object wildcardFileName) {
            $.wildcardFileName = wildcardFileName;
            return this;
        }

        /**
         * @param wildcardFolderPath Amazon S3 Compatible wildcardFolderPath. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder wildcardFolderPath(@Nullable Object wildcardFolderPath) {
            $.wildcardFolderPath = wildcardFolderPath;
            return this;
        }

        public AmazonS3CompatibleReadSettingsResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
