// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VideoStreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final VideoStreamArgs Empty = new VideoStreamArgs();

    /**
     * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
     * 
     */
    @Import(name="dataRetentionInHours")
    private @Nullable Output<Integer> dataRetentionInHours;

    /**
     * @return The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
     * 
     */
    public Optional<Output<Integer>> dataRetentionInHours() {
        return Optional.ofNullable(this.dataRetentionInHours);
    }

    /**
     * The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
     * 
     */
    @Import(name="mediaType")
    private @Nullable Output<String> mediaType;

    /**
     * @return The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
     * 
     */
    public Optional<Output<String>> mediaType() {
        return Optional.ofNullable(this.mediaType);
    }

    /**
     * A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private VideoStreamArgs() {}

    private VideoStreamArgs(VideoStreamArgs $) {
        this.dataRetentionInHours = $.dataRetentionInHours;
        this.deviceName = $.deviceName;
        this.kmsKeyId = $.kmsKeyId;
        this.mediaType = $.mediaType;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VideoStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VideoStreamArgs $;

        public Builder() {
            $ = new VideoStreamArgs();
        }

        public Builder(VideoStreamArgs defaults) {
            $ = new VideoStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataRetentionInHours The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
         * 
         * @return builder
         * 
         */
        public Builder dataRetentionInHours(@Nullable Output<Integer> dataRetentionInHours) {
            $.dataRetentionInHours = dataRetentionInHours;
            return this;
        }

        /**
         * @param dataRetentionInHours The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
         * 
         * @return builder
         * 
         */
        public Builder dataRetentionInHours(Integer dataRetentionInHours) {
            return dataRetentionInHours(Output.of(dataRetentionInHours));
        }

        /**
         * @param deviceName The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param kmsKeyId The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param mediaType The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
         * 
         * @return builder
         * 
         */
        public Builder mediaType(@Nullable Output<String> mediaType) {
            $.mediaType = mediaType;
            return this;
        }

        /**
         * @param mediaType The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
         * 
         * @return builder
         * 
         */
        public Builder mediaType(String mediaType) {
            return mediaType(Output.of(mediaType));
        }

        /**
         * @param name A name to identify the stream. This is unique to the
         * AWS account and region the Stream is created in.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name to identify the stream. This is unique to the
         * AWS account and region the Stream is created in.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public VideoStreamArgs build() {
            return $;
        }
    }

}
