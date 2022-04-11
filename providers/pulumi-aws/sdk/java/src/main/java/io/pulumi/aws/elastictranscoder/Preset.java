// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elastictranscoder.PresetArgs;
import io.pulumi.aws.elastictranscoder.inputs.PresetState;
import io.pulumi.aws.elastictranscoder.outputs.PresetAudio;
import io.pulumi.aws.elastictranscoder.outputs.PresetAudioCodecOptions;
import io.pulumi.aws.elastictranscoder.outputs.PresetThumbnails;
import io.pulumi.aws.elastictranscoder.outputs.PresetVideo;
import io.pulumi.aws.elastictranscoder.outputs.PresetVideoWatermark;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Transcoder preset resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Elastic Transcoder presets can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elastictranscoder/preset:Preset basic_preset 1407981661351-cttk8b
 * ```
 * 
 */
@ResourceType(type="aws:elastictranscoder/preset:Preset")
public class Preset extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Elastic Transcoder Preset.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Elastic Transcoder Preset.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Audio parameters object (documented below).
     * 
     */
    @Export(name="audio", type=PresetAudio.class, parameters={})
    private Output</* @Nullable */ PresetAudio> audio;

    /**
     * @return Audio parameters object (documented below).
     * 
     */
    public Output</* @Nullable */ PresetAudio> getAudio() {
        return this.audio;
    }
    /**
     * Codec options for the audio parameters (documented below)
     * 
     */
    @Export(name="audioCodecOptions", type=PresetAudioCodecOptions.class, parameters={})
    private Output</* @Nullable */ PresetAudioCodecOptions> audioCodecOptions;

    /**
     * @return Codec options for the audio parameters (documented below)
     * 
     */
    public Output</* @Nullable */ PresetAudioCodecOptions> getAudioCodecOptions() {
        return this.audioCodecOptions;
    }
    /**
     * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
     * 
     */
    @Export(name="container", type=String.class, parameters={})
    private Output<String> container;

    /**
     * @return The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
     * 
     */
    public Output<String> getContainer() {
        return this.container;
    }
    /**
     * A description of the preset (maximum 255 characters)
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the preset (maximum 255 characters)
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the preset. (maximum 40 characters)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the preset. (maximum 40 characters)
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Thumbnail parameters object (documented below)
     * 
     */
    @Export(name="thumbnails", type=PresetThumbnails.class, parameters={})
    private Output</* @Nullable */ PresetThumbnails> thumbnails;

    /**
     * @return Thumbnail parameters object (documented below)
     * 
     */
    public Output</* @Nullable */ PresetThumbnails> getThumbnails() {
        return this.thumbnails;
    }
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    /**
     * Video parameters object (documented below)
     * 
     */
    @Export(name="video", type=PresetVideo.class, parameters={})
    private Output</* @Nullable */ PresetVideo> video;

    /**
     * @return Video parameters object (documented below)
     * 
     */
    public Output</* @Nullable */ PresetVideo> getVideo() {
        return this.video;
    }
    /**
     * Codec options for the video parameters
     * 
     */
    @Export(name="videoCodecOptions", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> videoCodecOptions;

    /**
     * @return Codec options for the video parameters
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getVideoCodecOptions() {
        return this.videoCodecOptions;
    }
    /**
     * Watermark parameters for the video parameters (documented below)
     * 
     */
    @Export(name="videoWatermarks", type=List.class, parameters={PresetVideoWatermark.class})
    private Output</* @Nullable */ List<PresetVideoWatermark>> videoWatermarks;

    /**
     * @return Watermark parameters for the video parameters (documented below)
     * 
     */
    public Output</* @Nullable */ List<PresetVideoWatermark>> getVideoWatermarks() {
        return this.videoWatermarks;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Preset(String name) {
        this(name, PresetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Preset(String name, PresetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Preset(String name, PresetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elastictranscoder/preset:Preset", name, args == null ? PresetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Preset(String name, Output<String> id, @Nullable PresetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elastictranscoder/preset:Preset", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Preset get(String name, Output<String> id, @Nullable PresetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Preset(name, id, state, options);
    }
}
