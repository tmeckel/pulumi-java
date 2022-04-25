// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.inputs.EntityReferenceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data proxy properties for a managed dedicated integration runtime.
 * 
 */
public final class IntegrationRuntimeDataProxyPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeDataProxyPropertiesResponse Empty = new IntegrationRuntimeDataProxyPropertiesResponse();

    /**
     * The self-hosted integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable EntityReferenceResponse connectVia;

    /**
     * @return The self-hosted integration runtime reference.
     * 
     */
    public Optional<EntityReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * The path to contain the staged data in the Blob storage.
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    /**
     * @return The path to contain the staged data in the Blob storage.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The staging linked service reference.
     * 
     */
    @Import(name="stagingLinkedService")
    private @Nullable EntityReferenceResponse stagingLinkedService;

    /**
     * @return The staging linked service reference.
     * 
     */
    public Optional<EntityReferenceResponse> stagingLinkedService() {
        return Optional.ofNullable(this.stagingLinkedService);
    }

    private IntegrationRuntimeDataProxyPropertiesResponse() {}

    private IntegrationRuntimeDataProxyPropertiesResponse(IntegrationRuntimeDataProxyPropertiesResponse $) {
        this.connectVia = $.connectVia;
        this.path = $.path;
        this.stagingLinkedService = $.stagingLinkedService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeDataProxyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeDataProxyPropertiesResponse $;

        public Builder() {
            $ = new IntegrationRuntimeDataProxyPropertiesResponse();
        }

        public Builder(IntegrationRuntimeDataProxyPropertiesResponse defaults) {
            $ = new IntegrationRuntimeDataProxyPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectVia The self-hosted integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(@Nullable EntityReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        /**
         * @param path The path to contain the staged data in the Blob storage.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        /**
         * @param stagingLinkedService The staging linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder stagingLinkedService(@Nullable EntityReferenceResponse stagingLinkedService) {
            $.stagingLinkedService = stagingLinkedService;
            return this;
        }

        public IntegrationRuntimeDataProxyPropertiesResponse build() {
            return $;
        }
    }

}
