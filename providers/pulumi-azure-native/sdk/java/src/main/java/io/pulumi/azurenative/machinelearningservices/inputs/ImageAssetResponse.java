// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Image asset.
 * 
 */
public final class ImageAssetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageAssetResponse Empty = new ImageAssetResponse();

    /**
     * The Asset Id.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The mime type.
     * 
     */
    @InputImport(name="mimeType")
      private final @Nullable String mimeType;

    public Optional<String> getMimeType() {
        return this.mimeType == null ? Optional.empty() : Optional.ofNullable(this.mimeType);
    }

    /**
     * Whether the Asset is unpacked.
     * 
     */
    @InputImport(name="unpack")
      private final @Nullable Boolean unpack;

    public Optional<Boolean> getUnpack() {
        return this.unpack == null ? Optional.empty() : Optional.ofNullable(this.unpack);
    }

    /**
     * The Url of the Asset.
     * 
     */
    @InputImport(name="url")
      private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public ImageAssetResponse(
        @Nullable String id,
        @Nullable String mimeType,
        @Nullable Boolean unpack,
        @Nullable String url) {
        this.id = id;
        this.mimeType = mimeType;
        this.unpack = unpack;
        this.url = url;
    }

    private ImageAssetResponse() {
        this.id = null;
        this.mimeType = null;
        this.unpack = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageAssetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String mimeType;
        private @Nullable Boolean unpack;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageAssetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mimeType = defaults.mimeType;
    	      this.unpack = defaults.unpack;
    	      this.url = defaults.url;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder unpack(@Nullable Boolean unpack) {
            this.unpack = unpack;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ImageAssetResponse build() {
            return new ImageAssetResponse(id, mimeType, unpack, url);
        }
    }
}
