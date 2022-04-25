// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.AacAudioResponse;
import com.pulumi.azurenative.media.inputs.AudioResponse;
import com.pulumi.azurenative.media.inputs.CopyAudioResponse;
import com.pulumi.azurenative.media.inputs.CopyVideoResponse;
import com.pulumi.azurenative.media.inputs.FiltersResponse;
import com.pulumi.azurenative.media.inputs.H264VideoResponse;
import com.pulumi.azurenative.media.inputs.H265VideoResponse;
import com.pulumi.azurenative.media.inputs.ImageFormatResponse;
import com.pulumi.azurenative.media.inputs.ImageResponse;
import com.pulumi.azurenative.media.inputs.JpgFormatResponse;
import com.pulumi.azurenative.media.inputs.JpgImageResponse;
import com.pulumi.azurenative.media.inputs.Mp4FormatResponse;
import com.pulumi.azurenative.media.inputs.MultiBitrateFormatResponse;
import com.pulumi.azurenative.media.inputs.PngFormatResponse;
import com.pulumi.azurenative.media.inputs.PngImageResponse;
import com.pulumi.azurenative.media.inputs.TransportStreamFormatResponse;
import com.pulumi.azurenative.media.inputs.VideoResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes all the settings to be used when encoding the input video with the Standard Encoder.
 * 
 */
public final class StandardEncoderPresetResponse extends com.pulumi.resources.InvokeArgs {

    public static final StandardEncoderPresetResponse Empty = new StandardEncoderPresetResponse();

    /**
     * The list of codecs to be used when encoding the input video.
     * 
     */
    @Import(name="codecs", required=true)
    private List<Object> codecs;

    /**
     * @return The list of codecs to be used when encoding the input video.
     * 
     */
    public List<Object> codecs() {
        return this.codecs;
    }

    /**
     * One or more filtering operations that are applied to the input media before encoding.
     * 
     */
    @Import(name="filters")
    private @Nullable FiltersResponse filters;

    /**
     * @return One or more filtering operations that are applied to the input media before encoding.
     * 
     */
    public Optional<FiltersResponse> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The list of outputs to be produced by the encoder.
     * 
     */
    @Import(name="formats", required=true)
    private List<Object> formats;

    /**
     * @return The list of outputs to be produced by the encoder.
     * 
     */
    public List<Object> formats() {
        return this.formats;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.StandardEncoderPreset&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private String odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.StandardEncoderPreset&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }

    private StandardEncoderPresetResponse() {}

    private StandardEncoderPresetResponse(StandardEncoderPresetResponse $) {
        this.codecs = $.codecs;
        this.filters = $.filters;
        this.formats = $.formats;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardEncoderPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardEncoderPresetResponse $;

        public Builder() {
            $ = new StandardEncoderPresetResponse();
        }

        public Builder(StandardEncoderPresetResponse defaults) {
            $ = new StandardEncoderPresetResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param codecs The list of codecs to be used when encoding the input video.
         * 
         * @return builder
         * 
         */
        public Builder codecs(List<Object> codecs) {
            $.codecs = codecs;
            return this;
        }

        /**
         * @param codecs The list of codecs to be used when encoding the input video.
         * 
         * @return builder
         * 
         */
        public Builder codecs(Object... codecs) {
            return codecs(List.of(codecs));
        }

        /**
         * @param filters One or more filtering operations that are applied to the input media before encoding.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable FiltersResponse filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param formats The list of outputs to be produced by the encoder.
         * 
         * @return builder
         * 
         */
        public Builder formats(List<Object> formats) {
            $.formats = formats;
            return this;
        }

        /**
         * @param formats The list of outputs to be produced by the encoder.
         * 
         * @return builder
         * 
         */
        public Builder formats(Object... formats) {
            return formats(List.of(formats));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.StandardEncoderPreset&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public StandardEncoderPresetResponse build() {
            $.codecs = Objects.requireNonNull($.codecs, "expected parameter 'codecs' to be non-null");
            $.formats = Objects.requireNonNull($.formats, "expected parameter 'formats' to be non-null");
            $.odataType = Codegen.stringProp("odataType").arg($.odataType).require();
            return $;
        }
    }

}
