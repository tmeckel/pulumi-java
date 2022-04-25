// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder;

import com.pulumi.aws.elastictranscoder.inputs.PresetAudioArgs;
import com.pulumi.aws.elastictranscoder.inputs.PresetAudioCodecOptionsArgs;
import com.pulumi.aws.elastictranscoder.inputs.PresetThumbnailsArgs;
import com.pulumi.aws.elastictranscoder.inputs.PresetVideoArgs;
import com.pulumi.aws.elastictranscoder.inputs.PresetVideoWatermarkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PresetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PresetArgs Empty = new PresetArgs();

    /**
     * Audio parameters object (documented below).
     * 
     */
    @Import(name="audio")
    private @Nullable Output<PresetAudioArgs> audio;

    /**
     * @return Audio parameters object (documented below).
     * 
     */
    public Optional<Output<PresetAudioArgs>> audio() {
        return Optional.ofNullable(this.audio);
    }

    /**
     * Codec options for the audio parameters (documented below)
     * 
     */
    @Import(name="audioCodecOptions")
    private @Nullable Output<PresetAudioCodecOptionsArgs> audioCodecOptions;

    /**
     * @return Codec options for the audio parameters (documented below)
     * 
     */
    public Optional<Output<PresetAudioCodecOptionsArgs>> audioCodecOptions() {
        return Optional.ofNullable(this.audioCodecOptions);
    }

    /**
     * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
     * 
     */
    @Import(name="container", required=true)
    private Output<String> container;

    /**
     * @return The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
     * 
     */
    public Output<String> container() {
        return this.container;
    }

    /**
     * A description of the preset (maximum 255 characters)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the preset (maximum 255 characters)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the preset. (maximum 40 characters)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the preset. (maximum 40 characters)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Thumbnail parameters object (documented below)
     * 
     */
    @Import(name="thumbnails")
    private @Nullable Output<PresetThumbnailsArgs> thumbnails;

    /**
     * @return Thumbnail parameters object (documented below)
     * 
     */
    public Optional<Output<PresetThumbnailsArgs>> thumbnails() {
        return Optional.ofNullable(this.thumbnails);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Video parameters object (documented below)
     * 
     */
    @Import(name="video")
    private @Nullable Output<PresetVideoArgs> video;

    /**
     * @return Video parameters object (documented below)
     * 
     */
    public Optional<Output<PresetVideoArgs>> video() {
        return Optional.ofNullable(this.video);
    }

    /**
     * Codec options for the video parameters
     * 
     */
    @Import(name="videoCodecOptions")
    private @Nullable Output<Map<String,String>> videoCodecOptions;

    /**
     * @return Codec options for the video parameters
     * 
     */
    public Optional<Output<Map<String,String>>> videoCodecOptions() {
        return Optional.ofNullable(this.videoCodecOptions);
    }

    /**
     * Watermark parameters for the video parameters (documented below)
     * 
     */
    @Import(name="videoWatermarks")
    private @Nullable Output<List<PresetVideoWatermarkArgs>> videoWatermarks;

    /**
     * @return Watermark parameters for the video parameters (documented below)
     * 
     */
    public Optional<Output<List<PresetVideoWatermarkArgs>>> videoWatermarks() {
        return Optional.ofNullable(this.videoWatermarks);
    }

    private PresetArgs() {}

    private PresetArgs(PresetArgs $) {
        this.audio = $.audio;
        this.audioCodecOptions = $.audioCodecOptions;
        this.container = $.container;
        this.description = $.description;
        this.name = $.name;
        this.thumbnails = $.thumbnails;
        this.type = $.type;
        this.video = $.video;
        this.videoCodecOptions = $.videoCodecOptions;
        this.videoWatermarks = $.videoWatermarks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PresetArgs $;

        public Builder() {
            $ = new PresetArgs();
        }

        public Builder(PresetArgs defaults) {
            $ = new PresetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audio Audio parameters object (documented below).
         * 
         * @return builder
         * 
         */
        public Builder audio(@Nullable Output<PresetAudioArgs> audio) {
            $.audio = audio;
            return this;
        }

        /**
         * @param audio Audio parameters object (documented below).
         * 
         * @return builder
         * 
         */
        public Builder audio(PresetAudioArgs audio) {
            return audio(Output.of(audio));
        }

        /**
         * @param audioCodecOptions Codec options for the audio parameters (documented below)
         * 
         * @return builder
         * 
         */
        public Builder audioCodecOptions(@Nullable Output<PresetAudioCodecOptionsArgs> audioCodecOptions) {
            $.audioCodecOptions = audioCodecOptions;
            return this;
        }

        /**
         * @param audioCodecOptions Codec options for the audio parameters (documented below)
         * 
         * @return builder
         * 
         */
        public Builder audioCodecOptions(PresetAudioCodecOptionsArgs audioCodecOptions) {
            return audioCodecOptions(Output.of(audioCodecOptions));
        }

        /**
         * @param container The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
         * 
         * @return builder
         * 
         */
        public Builder container(Output<String> container) {
            $.container = container;
            return this;
        }

        /**
         * @param container The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
         * 
         * @return builder
         * 
         */
        public Builder container(String container) {
            return container(Output.of(container));
        }

        /**
         * @param description A description of the preset (maximum 255 characters)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the preset (maximum 255 characters)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the preset. (maximum 40 characters)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the preset. (maximum 40 characters)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param thumbnails Thumbnail parameters object (documented below)
         * 
         * @return builder
         * 
         */
        public Builder thumbnails(@Nullable Output<PresetThumbnailsArgs> thumbnails) {
            $.thumbnails = thumbnails;
            return this;
        }

        /**
         * @param thumbnails Thumbnail parameters object (documented below)
         * 
         * @return builder
         * 
         */
        public Builder thumbnails(PresetThumbnailsArgs thumbnails) {
            return thumbnails(Output.of(thumbnails));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param video Video parameters object (documented below)
         * 
         * @return builder
         * 
         */
        public Builder video(@Nullable Output<PresetVideoArgs> video) {
            $.video = video;
            return this;
        }

        /**
         * @param video Video parameters object (documented below)
         * 
         * @return builder
         * 
         */
        public Builder video(PresetVideoArgs video) {
            return video(Output.of(video));
        }

        /**
         * @param videoCodecOptions Codec options for the video parameters
         * 
         * @return builder
         * 
         */
        public Builder videoCodecOptions(@Nullable Output<Map<String,String>> videoCodecOptions) {
            $.videoCodecOptions = videoCodecOptions;
            return this;
        }

        /**
         * @param videoCodecOptions Codec options for the video parameters
         * 
         * @return builder
         * 
         */
        public Builder videoCodecOptions(Map<String,String> videoCodecOptions) {
            return videoCodecOptions(Output.of(videoCodecOptions));
        }

        /**
         * @param videoWatermarks Watermark parameters for the video parameters (documented below)
         * 
         * @return builder
         * 
         */
        public Builder videoWatermarks(@Nullable Output<List<PresetVideoWatermarkArgs>> videoWatermarks) {
            $.videoWatermarks = videoWatermarks;
            return this;
        }

        /**
         * @param videoWatermarks Watermark parameters for the video parameters (documented below)
         * 
         * @return builder
         * 
         */
        public Builder videoWatermarks(List<PresetVideoWatermarkArgs> videoWatermarks) {
            return videoWatermarks(Output.of(videoWatermarks));
        }

        /**
         * @param videoWatermarks Watermark parameters for the video parameters (documented below)
         * 
         * @return builder
         * 
         */
        public Builder videoWatermarks(PresetVideoWatermarkArgs... videoWatermarks) {
            return videoWatermarks(List.of(videoWatermarks));
        }

        public PresetArgs build() {
            $.container = Objects.requireNonNull($.container, "expected parameter 'container' to be non-null");
            return $;
        }
    }

}
