// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Image asset.
 * 
 */
public final class ImageAssetResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageAssetResponse Empty = new ImageAssetResponse();

    /**
     * The Asset Id.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The Asset Id.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The mime type.
     * 
     */
    @Import(name="mimeType")
    private @Nullable String mimeType;

    /**
     * @return The mime type.
     * 
     */
    public Optional<String> mimeType() {
        return Optional.ofNullable(this.mimeType);
    }

    /**
     * Whether the Asset is unpacked.
     * 
     */
    @Import(name="unpack")
    private @Nullable Boolean unpack;

    /**
     * @return Whether the Asset is unpacked.
     * 
     */
    public Optional<Boolean> unpack() {
        return Optional.ofNullable(this.unpack);
    }

    /**
     * The Url of the Asset.
     * 
     */
    @Import(name="url")
    private @Nullable String url;

    /**
     * @return The Url of the Asset.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    private ImageAssetResponse() {}

    private ImageAssetResponse(ImageAssetResponse $) {
        this.id = $.id;
        this.mimeType = $.mimeType;
        this.unpack = $.unpack;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageAssetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageAssetResponse $;

        public Builder() {
            $ = new ImageAssetResponse();
        }

        public Builder(ImageAssetResponse defaults) {
            $ = new ImageAssetResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The Asset Id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param mimeType The mime type.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(@Nullable String mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param unpack Whether the Asset is unpacked.
         * 
         * @return builder
         * 
         */
        public Builder unpack(@Nullable Boolean unpack) {
            $.unpack = unpack;
            return this;
        }

        /**
         * @param url The Url of the Asset.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable String url) {
            $.url = url;
            return this;
        }

        public ImageAssetResponse build() {
            return $;
        }
    }

}
