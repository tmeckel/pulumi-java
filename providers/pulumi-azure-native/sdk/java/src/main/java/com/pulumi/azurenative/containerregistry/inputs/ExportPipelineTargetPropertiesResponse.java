// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the export pipeline target.
 * 
 */
public final class ExportPipelineTargetPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExportPipelineTargetPropertiesResponse Empty = new ExportPipelineTargetPropertiesResponse();

    /**
     * They key vault secret uri to obtain the target storage SAS token.
     * 
     */
    @Import(name="keyVaultUri", required=true)
    private String keyVaultUri;

    /**
     * @return They key vault secret uri to obtain the target storage SAS token.
     * 
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * The type of target for the export pipeline.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of target for the export pipeline.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The target uri of the export pipeline.
     * When &#39;AzureStorageBlob&#39;: &#34;https://accountName.blob.core.windows.net/containerName/blobName&#34;
     * When &#39;AzureStorageBlobContainer&#39;:  &#34;https://accountName.blob.core.windows.net/containerName&#34;
     * 
     */
    @Import(name="uri")
    private @Nullable String uri;

    /**
     * @return The target uri of the export pipeline.
     * When &#39;AzureStorageBlob&#39;: &#34;https://accountName.blob.core.windows.net/containerName/blobName&#34;
     * When &#39;AzureStorageBlobContainer&#39;:  &#34;https://accountName.blob.core.windows.net/containerName&#34;
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    private ExportPipelineTargetPropertiesResponse() {}

    private ExportPipelineTargetPropertiesResponse(ExportPipelineTargetPropertiesResponse $) {
        this.keyVaultUri = $.keyVaultUri;
        this.type = $.type;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExportPipelineTargetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExportPipelineTargetPropertiesResponse $;

        public Builder() {
            $ = new ExportPipelineTargetPropertiesResponse();
        }

        public Builder(ExportPipelineTargetPropertiesResponse defaults) {
            $ = new ExportPipelineTargetPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyVaultUri They key vault secret uri to obtain the target storage SAS token.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultUri(String keyVaultUri) {
            $.keyVaultUri = keyVaultUri;
            return this;
        }

        /**
         * @param type The type of target for the export pipeline.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        /**
         * @param uri The target uri of the export pipeline.
         * When &#39;AzureStorageBlob&#39;: &#34;https://accountName.blob.core.windows.net/containerName/blobName&#34;
         * When &#39;AzureStorageBlobContainer&#39;:  &#34;https://accountName.blob.core.windows.net/containerName&#34;
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable String uri) {
            $.uri = uri;
            return this;
        }

        public ExportPipelineTargetPropertiesResponse build() {
            $.keyVaultUri = Objects.requireNonNull($.keyVaultUri, "expected parameter 'keyVaultUri' to be non-null");
            return $;
        }
    }

}
