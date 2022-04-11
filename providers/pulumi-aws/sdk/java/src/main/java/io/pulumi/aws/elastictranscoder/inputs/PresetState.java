// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.aws.elastictranscoder.inputs.PresetAudioCodecOptionsGetArgs;
import io.pulumi.aws.elastictranscoder.inputs.PresetAudioGetArgs;
import io.pulumi.aws.elastictranscoder.inputs.PresetThumbnailsGetArgs;
import io.pulumi.aws.elastictranscoder.inputs.PresetVideoGetArgs;
import io.pulumi.aws.elastictranscoder.inputs.PresetVideoWatermarkGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PresetState extends io.pulumi.resources.ResourceArgs {

    public static final PresetState Empty = new PresetState();

    /**
     * Amazon Resource Name (ARN) of the Elastic Transcoder Preset.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Audio parameters object (documented below).
     * 
     */
    @Import(name="audio")
      private final @Nullable Output<PresetAudioGetArgs> audio;

    public Output<PresetAudioGetArgs> getAudio() {
        return this.audio == null ? Codegen.empty() : this.audio;
    }

    /**
     * Codec options for the audio parameters (documented below)
     * 
     */
    @Import(name="audioCodecOptions")
      private final @Nullable Output<PresetAudioCodecOptionsGetArgs> audioCodecOptions;

    public Output<PresetAudioCodecOptionsGetArgs> getAudioCodecOptions() {
        return this.audioCodecOptions == null ? Codegen.empty() : this.audioCodecOptions;
    }

    /**
     * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
     * 
     */
    @Import(name="container")
      private final @Nullable Output<String> container;

    public Output<String> getContainer() {
        return this.container == null ? Codegen.empty() : this.container;
    }

    /**
     * A description of the preset (maximum 255 characters)
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the preset. (maximum 40 characters)
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Thumbnail parameters object (documented below)
     * 
     */
    @Import(name="thumbnails")
      private final @Nullable Output<PresetThumbnailsGetArgs> thumbnails;

    public Output<PresetThumbnailsGetArgs> getThumbnails() {
        return this.thumbnails == null ? Codegen.empty() : this.thumbnails;
    }

    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * Video parameters object (documented below)
     * 
     */
    @Import(name="video")
      private final @Nullable Output<PresetVideoGetArgs> video;

    public Output<PresetVideoGetArgs> getVideo() {
        return this.video == null ? Codegen.empty() : this.video;
    }

    /**
     * Codec options for the video parameters
     * 
     */
    @Import(name="videoCodecOptions")
      private final @Nullable Output<Map<String,String>> videoCodecOptions;

    public Output<Map<String,String>> getVideoCodecOptions() {
        return this.videoCodecOptions == null ? Codegen.empty() : this.videoCodecOptions;
    }

    /**
     * Watermark parameters for the video parameters (documented below)
     * 
     */
    @Import(name="videoWatermarks")
      private final @Nullable Output<List<PresetVideoWatermarkGetArgs>> videoWatermarks;

    public Output<List<PresetVideoWatermarkGetArgs>> getVideoWatermarks() {
        return this.videoWatermarks == null ? Codegen.empty() : this.videoWatermarks;
    }

    public PresetState(
        @Nullable Output<String> arn,
        @Nullable Output<PresetAudioGetArgs> audio,
        @Nullable Output<PresetAudioCodecOptionsGetArgs> audioCodecOptions,
        @Nullable Output<String> container,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<PresetThumbnailsGetArgs> thumbnails,
        @Nullable Output<String> type,
        @Nullable Output<PresetVideoGetArgs> video,
        @Nullable Output<Map<String,String>> videoCodecOptions,
        @Nullable Output<List<PresetVideoWatermarkGetArgs>> videoWatermarks) {
        this.arn = arn;
        this.audio = audio;
        this.audioCodecOptions = audioCodecOptions;
        this.container = container;
        this.description = description;
        this.name = name;
        this.thumbnails = thumbnails;
        this.type = type;
        this.video = video;
        this.videoCodecOptions = videoCodecOptions;
        this.videoWatermarks = videoWatermarks;
    }

    private PresetState() {
        this.arn = Codegen.empty();
        this.audio = Codegen.empty();
        this.audioCodecOptions = Codegen.empty();
        this.container = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.thumbnails = Codegen.empty();
        this.type = Codegen.empty();
        this.video = Codegen.empty();
        this.videoCodecOptions = Codegen.empty();
        this.videoWatermarks = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<PresetAudioGetArgs> audio;
        private @Nullable Output<PresetAudioCodecOptionsGetArgs> audioCodecOptions;
        private @Nullable Output<String> container;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<PresetThumbnailsGetArgs> thumbnails;
        private @Nullable Output<String> type;
        private @Nullable Output<PresetVideoGetArgs> video;
        private @Nullable Output<Map<String,String>> videoCodecOptions;
        private @Nullable Output<List<PresetVideoWatermarkGetArgs>> videoWatermarks;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.audio = defaults.audio;
    	      this.audioCodecOptions = defaults.audioCodecOptions;
    	      this.container = defaults.container;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.thumbnails = defaults.thumbnails;
    	      this.type = defaults.type;
    	      this.video = defaults.video;
    	      this.videoCodecOptions = defaults.videoCodecOptions;
    	      this.videoWatermarks = defaults.videoWatermarks;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder audio(@Nullable Output<PresetAudioGetArgs> audio) {
            this.audio = audio;
            return this;
        }
        public Builder audio(@Nullable PresetAudioGetArgs audio) {
            this.audio = Codegen.ofNullable(audio);
            return this;
        }
        public Builder audioCodecOptions(@Nullable Output<PresetAudioCodecOptionsGetArgs> audioCodecOptions) {
            this.audioCodecOptions = audioCodecOptions;
            return this;
        }
        public Builder audioCodecOptions(@Nullable PresetAudioCodecOptionsGetArgs audioCodecOptions) {
            this.audioCodecOptions = Codegen.ofNullable(audioCodecOptions);
            return this;
        }
        public Builder container(@Nullable Output<String> container) {
            this.container = container;
            return this;
        }
        public Builder container(@Nullable String container) {
            this.container = Codegen.ofNullable(container);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder thumbnails(@Nullable Output<PresetThumbnailsGetArgs> thumbnails) {
            this.thumbnails = thumbnails;
            return this;
        }
        public Builder thumbnails(@Nullable PresetThumbnailsGetArgs thumbnails) {
            this.thumbnails = Codegen.ofNullable(thumbnails);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder video(@Nullable Output<PresetVideoGetArgs> video) {
            this.video = video;
            return this;
        }
        public Builder video(@Nullable PresetVideoGetArgs video) {
            this.video = Codegen.ofNullable(video);
            return this;
        }
        public Builder videoCodecOptions(@Nullable Output<Map<String,String>> videoCodecOptions) {
            this.videoCodecOptions = videoCodecOptions;
            return this;
        }
        public Builder videoCodecOptions(@Nullable Map<String,String> videoCodecOptions) {
            this.videoCodecOptions = Codegen.ofNullable(videoCodecOptions);
            return this;
        }
        public Builder videoWatermarks(@Nullable Output<List<PresetVideoWatermarkGetArgs>> videoWatermarks) {
            this.videoWatermarks = videoWatermarks;
            return this;
        }
        public Builder videoWatermarks(@Nullable List<PresetVideoWatermarkGetArgs> videoWatermarks) {
            this.videoWatermarks = Codegen.ofNullable(videoWatermarks);
            return this;
        }
        public Builder videoWatermarks(PresetVideoWatermarkGetArgs... videoWatermarks) {
            return videoWatermarks(List.of(videoWatermarks));
        }        public PresetState build() {
            return new PresetState(arn, audio, audioCodecOptions, container, description, name, thumbnails, type, video, videoCodecOptions, videoWatermarks);
        }
    }
}
