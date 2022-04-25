// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.ContentHashResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The content link.
 * 
 */
public final class ContentLinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContentLinkResponse Empty = new ContentLinkResponse();

    /**
     * The content hash.
     * 
     */
    @Import(name="contentHash", required=true)
    private ContentHashResponse contentHash;

    /**
     * @return The content hash.
     * 
     */
    public ContentHashResponse contentHash() {
        return this.contentHash;
    }

    /**
     * The content size.
     * 
     */
    @Import(name="contentSize", required=true)
    private Double contentSize;

    /**
     * @return The content size.
     * 
     */
    public Double contentSize() {
        return this.contentSize;
    }

    /**
     * The content version.
     * 
     */
    @Import(name="contentVersion", required=true)
    private String contentVersion;

    /**
     * @return The content version.
     * 
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * The metadata.
     * 
     */
    @Import(name="metadata", required=true)
    private Object metadata;

    /**
     * @return The metadata.
     * 
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * The content link URI.
     * 
     */
    @Import(name="uri")
    private @Nullable String uri;

    /**
     * @return The content link URI.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    private ContentLinkResponse() {}

    private ContentLinkResponse(ContentLinkResponse $) {
        this.contentHash = $.contentHash;
        this.contentSize = $.contentSize;
        this.contentVersion = $.contentVersion;
        this.metadata = $.metadata;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentLinkResponse $;

        public Builder() {
            $ = new ContentLinkResponse();
        }

        public Builder(ContentLinkResponse defaults) {
            $ = new ContentLinkResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentHash The content hash.
         * 
         * @return builder
         * 
         */
        public Builder contentHash(ContentHashResponse contentHash) {
            $.contentHash = contentHash;
            return this;
        }

        /**
         * @param contentSize The content size.
         * 
         * @return builder
         * 
         */
        public Builder contentSize(Double contentSize) {
            $.contentSize = contentSize;
            return this;
        }

        /**
         * @param contentVersion The content version.
         * 
         * @return builder
         * 
         */
        public Builder contentVersion(String contentVersion) {
            $.contentVersion = contentVersion;
            return this;
        }

        /**
         * @param metadata The metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Object metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param uri The content link URI.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable String uri) {
            $.uri = uri;
            return this;
        }

        public ContentLinkResponse build() {
            $.contentHash = Objects.requireNonNull($.contentHash, "expected parameter 'contentHash' to be non-null");
            $.contentSize = Objects.requireNonNull($.contentSize, "expected parameter 'contentSize' to be non-null");
            $.contentVersion = Objects.requireNonNull($.contentVersion, "expected parameter 'contentVersion' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            return $;
        }
    }

}
