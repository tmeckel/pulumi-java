// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageRawDiskGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageRawDiskGetArgs Empty = new ImageRawDiskGetArgs();

    /**
     * The format used to encode and transmit the block device, which
     * should be TAR. This is just a container and transmission format
     * and not a runtime format. Provided by the client when the disk
     * image is created.
     * Default value is `TAR`.
     * Possible values are `TAR`.
     * 
     */
    @Import(name="containerType")
    private @Nullable Output<String> containerType;

    /**
     * @return The format used to encode and transmit the block device, which
     * should be TAR. This is just a container and transmission format
     * and not a runtime format. Provided by the client when the disk
     * image is created.
     * Default value is `TAR`.
     * Possible values are `TAR`.
     * 
     */
    public Optional<Output<String>> containerType() {
        return Optional.ofNullable(this.containerType);
    }

    /**
     * An optional SHA1 checksum of the disk image before unpackaging.
     * This is provided by the client when the disk image is created.
     * 
     */
    @Import(name="sha1")
    private @Nullable Output<String> sha1;

    /**
     * @return An optional SHA1 checksum of the disk image before unpackaging.
     * This is provided by the client when the disk image is created.
     * 
     */
    public Optional<Output<String>> sha1() {
        return Optional.ofNullable(this.sha1);
    }

    /**
     * The full Google Cloud Storage URL where disk storage is stored
     * You must provide either this property or the sourceDisk property
     * but not both.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The full Google Cloud Storage URL where disk storage is stored
     * You must provide either this property or the sourceDisk property
     * but not both.
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    private ImageRawDiskGetArgs() {}

    private ImageRawDiskGetArgs(ImageRawDiskGetArgs $) {
        this.containerType = $.containerType;
        this.sha1 = $.sha1;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRawDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRawDiskGetArgs $;

        public Builder() {
            $ = new ImageRawDiskGetArgs();
        }

        public Builder(ImageRawDiskGetArgs defaults) {
            $ = new ImageRawDiskGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerType The format used to encode and transmit the block device, which
         * should be TAR. This is just a container and transmission format
         * and not a runtime format. Provided by the client when the disk
         * image is created.
         * Default value is `TAR`.
         * Possible values are `TAR`.
         * 
         * @return builder
         * 
         */
        public Builder containerType(@Nullable Output<String> containerType) {
            $.containerType = containerType;
            return this;
        }

        /**
         * @param containerType The format used to encode and transmit the block device, which
         * should be TAR. This is just a container and transmission format
         * and not a runtime format. Provided by the client when the disk
         * image is created.
         * Default value is `TAR`.
         * Possible values are `TAR`.
         * 
         * @return builder
         * 
         */
        public Builder containerType(String containerType) {
            return containerType(Output.of(containerType));
        }

        /**
         * @param sha1 An optional SHA1 checksum of the disk image before unpackaging.
         * This is provided by the client when the disk image is created.
         * 
         * @return builder
         * 
         */
        public Builder sha1(@Nullable Output<String> sha1) {
            $.sha1 = sha1;
            return this;
        }

        /**
         * @param sha1 An optional SHA1 checksum of the disk image before unpackaging.
         * This is provided by the client when the disk image is created.
         * 
         * @return builder
         * 
         */
        public Builder sha1(String sha1) {
            return sha1(Output.of(sha1));
        }

        /**
         * @param source The full Google Cloud Storage URL where disk storage is stored
         * You must provide either this property or the sourceDisk property
         * but not both.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The full Google Cloud Storage URL where disk storage is stored
         * You must provide either this property or the sourceDisk property
         * but not both.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public ImageRawDiskGetArgs build() {
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
