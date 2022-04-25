// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingStorageContainerPropertiesResponse {
    /**
     * @return Method used to authenticate against the storage endpoint
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * @return Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     * 
     */
    private final @Nullable Integer batchFrequencyInSeconds;
    /**
     * @return The connection string of the storage account.
     * 
     */
    private final @Nullable String connectionString;
    /**
     * @return The name of storage container in the storage account.
     * 
     */
    private final String containerName;
    /**
     * @return Encoding that is used to serialize messages to blobs. Supported values are &#39;avro&#39;, &#39;avrodeflate&#39;, and &#39;JSON&#39;. Default value is &#39;avro&#39;.
     * 
     */
    private final @Nullable String encoding;
    /**
     * @return The url of the storage endpoint. It must include the protocol https://
     * 
     */
    private final @Nullable String endpointUri;
    /**
     * @return File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     * 
     */
    private final @Nullable String fileNameFormat;
    /**
     * @return Id of the storage container endpoint
     * 
     */
    private final @Nullable String id;
    /**
     * @return Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     * 
     */
    private final @Nullable Integer maxChunkSizeInBytes;
    /**
     * @return The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
     */
    private final String name;
    /**
     * @return The name of the resource group of the storage account.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * @return The subscription identifier of the storage account.
     * 
     */
    private final @Nullable String subscriptionId;

    @CustomType.Constructor
    private RoutingStorageContainerPropertiesResponse(
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("batchFrequencyInSeconds") @Nullable Integer batchFrequencyInSeconds,
        @CustomType.Parameter("connectionString") @Nullable String connectionString,
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("encoding") @Nullable String encoding,
        @CustomType.Parameter("endpointUri") @Nullable String endpointUri,
        @CustomType.Parameter("fileNameFormat") @Nullable String fileNameFormat,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("maxChunkSizeInBytes") @Nullable Integer maxChunkSizeInBytes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId) {
        this.authenticationType = authenticationType;
        this.batchFrequencyInSeconds = batchFrequencyInSeconds;
        this.connectionString = connectionString;
        this.containerName = containerName;
        this.encoding = encoding;
        this.endpointUri = endpointUri;
        this.fileNameFormat = fileNameFormat;
        this.id = id;
        this.maxChunkSizeInBytes = maxChunkSizeInBytes;
        this.name = name;
        this.resourceGroup = resourceGroup;
        this.subscriptionId = subscriptionId;
    }

    /**
     * @return Method used to authenticate against the storage endpoint
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * @return Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     * 
     */
    public Optional<Integer> batchFrequencyInSeconds() {
        return Optional.ofNullable(this.batchFrequencyInSeconds);
    }
    /**
     * @return The connection string of the storage account.
     * 
     */
    public Optional<String> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * @return The name of storage container in the storage account.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return Encoding that is used to serialize messages to blobs. Supported values are &#39;avro&#39;, &#39;avrodeflate&#39;, and &#39;JSON&#39;. Default value is &#39;avro&#39;.
     * 
     */
    public Optional<String> encoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * @return The url of the storage endpoint. It must include the protocol https://
     * 
     */
    public Optional<String> endpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }
    /**
     * @return File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     * 
     */
    public Optional<String> fileNameFormat() {
        return Optional.ofNullable(this.fileNameFormat);
    }
    /**
     * @return Id of the storage container endpoint
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     * 
     */
    public Optional<Integer> maxChunkSizeInBytes() {
        return Optional.ofNullable(this.maxChunkSizeInBytes);
    }
    /**
     * @return The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the resource group of the storage account.
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return The subscription identifier of the storage account.
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingStorageContainerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private @Nullable Integer batchFrequencyInSeconds;
        private @Nullable String connectionString;
        private String containerName;
        private @Nullable String encoding;
        private @Nullable String endpointUri;
        private @Nullable String fileNameFormat;
        private @Nullable String id;
        private @Nullable Integer maxChunkSizeInBytes;
        private String name;
        private @Nullable String resourceGroup;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingStorageContainerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.batchFrequencyInSeconds = defaults.batchFrequencyInSeconds;
    	      this.connectionString = defaults.connectionString;
    	      this.containerName = defaults.containerName;
    	      this.encoding = defaults.encoding;
    	      this.endpointUri = defaults.endpointUri;
    	      this.fileNameFormat = defaults.fileNameFormat;
    	      this.id = defaults.id;
    	      this.maxChunkSizeInBytes = defaults.maxChunkSizeInBytes;
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder batchFrequencyInSeconds(@Nullable Integer batchFrequencyInSeconds) {
            this.batchFrequencyInSeconds = batchFrequencyInSeconds;
            return this;
        }
        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }
        public Builder fileNameFormat(@Nullable String fileNameFormat) {
            this.fileNameFormat = fileNameFormat;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder maxChunkSizeInBytes(@Nullable Integer maxChunkSizeInBytes) {
            this.maxChunkSizeInBytes = maxChunkSizeInBytes;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }        public RoutingStorageContainerPropertiesResponse build() {
            return new RoutingStorageContainerPropertiesResponse(authenticationType, batchFrequencyInSeconds, connectionString, containerName, encoding, endpointUri, fileNameFormat, id, maxChunkSizeInBytes, name, resourceGroup, subscriptionId);
        }
    }
}
