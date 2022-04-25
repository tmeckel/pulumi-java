// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The gallery artifact version source.
 * 
 */
public final class GalleryArtifactVersionSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GalleryArtifactVersionSourceArgs Empty = new GalleryArtifactVersionSourceArgs();

    /**
     * The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user image or storage account resource.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user image or storage account resource.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private GalleryArtifactVersionSourceArgs() {}

    private GalleryArtifactVersionSourceArgs(GalleryArtifactVersionSourceArgs $) {
        this.id = $.id;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryArtifactVersionSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryArtifactVersionSourceArgs $;

        public Builder() {
            $ = new GalleryArtifactVersionSourceArgs();
        }

        public Builder(GalleryArtifactVersionSourceArgs defaults) {
            $ = new GalleryArtifactVersionSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user image or storage account resource.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user image or storage account resource.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param uri The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public GalleryArtifactVersionSourceArgs build() {
            return $;
        }
    }

}
