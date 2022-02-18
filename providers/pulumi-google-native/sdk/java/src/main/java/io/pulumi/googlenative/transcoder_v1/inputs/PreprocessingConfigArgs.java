// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.AudioArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.ColorArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.CropArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.DeblockArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.DenoiseArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.PadArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Preprocessing configurations.
 * 
 */
public final class PreprocessingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreprocessingConfigArgs Empty = new PreprocessingConfigArgs();

    /**
     * Audio preprocessing configuration.
     * 
     */
    @InputImport(name="audio")
    private final @Nullable Input<AudioArgs> audio;

    public Input<AudioArgs> getAudio() {
        return this.audio == null ? Input.empty() : this.audio;
    }

    /**
     * Color preprocessing configuration.
     * 
     */
    @InputImport(name="color")
    private final @Nullable Input<ColorArgs> color;

    public Input<ColorArgs> getColor() {
        return this.color == null ? Input.empty() : this.color;
    }

    /**
     * Specify the video cropping configuration.
     * 
     */
    @InputImport(name="crop")
    private final @Nullable Input<CropArgs> crop;

    public Input<CropArgs> getCrop() {
        return this.crop == null ? Input.empty() : this.crop;
    }

    /**
     * Deblock preprocessing configuration.
     * 
     */
    @InputImport(name="deblock")
    private final @Nullable Input<DeblockArgs> deblock;

    public Input<DeblockArgs> getDeblock() {
        return this.deblock == null ? Input.empty() : this.deblock;
    }

    /**
     * Denoise preprocessing configuration.
     * 
     */
    @InputImport(name="denoise")
    private final @Nullable Input<DenoiseArgs> denoise;

    public Input<DenoiseArgs> getDenoise() {
        return this.denoise == null ? Input.empty() : this.denoise;
    }

    /**
     * Specify the video pad filter configuration.
     * 
     */
    @InputImport(name="pad")
    private final @Nullable Input<PadArgs> pad;

    public Input<PadArgs> getPad() {
        return this.pad == null ? Input.empty() : this.pad;
    }

    public PreprocessingConfigArgs(
        @Nullable Input<AudioArgs> audio,
        @Nullable Input<ColorArgs> color,
        @Nullable Input<CropArgs> crop,
        @Nullable Input<DeblockArgs> deblock,
        @Nullable Input<DenoiseArgs> denoise,
        @Nullable Input<PadArgs> pad) {
        this.audio = audio;
        this.color = color;
        this.crop = crop;
        this.deblock = deblock;
        this.denoise = denoise;
        this.pad = pad;
    }

    private PreprocessingConfigArgs() {
        this.audio = Input.empty();
        this.color = Input.empty();
        this.crop = Input.empty();
        this.deblock = Input.empty();
        this.denoise = Input.empty();
        this.pad = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreprocessingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AudioArgs> audio;
        private @Nullable Input<ColorArgs> color;
        private @Nullable Input<CropArgs> crop;
        private @Nullable Input<DeblockArgs> deblock;
        private @Nullable Input<DenoiseArgs> denoise;
        private @Nullable Input<PadArgs> pad;

        public Builder() {
    	      // Empty
        }

        public Builder(PreprocessingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.color = defaults.color;
    	      this.crop = defaults.crop;
    	      this.deblock = defaults.deblock;
    	      this.denoise = defaults.denoise;
    	      this.pad = defaults.pad;
        }

        public Builder setAudio(@Nullable Input<AudioArgs> audio) {
            this.audio = audio;
            return this;
        }

        public Builder setAudio(@Nullable AudioArgs audio) {
            this.audio = Input.ofNullable(audio);
            return this;
        }

        public Builder setColor(@Nullable Input<ColorArgs> color) {
            this.color = color;
            return this;
        }

        public Builder setColor(@Nullable ColorArgs color) {
            this.color = Input.ofNullable(color);
            return this;
        }

        public Builder setCrop(@Nullable Input<CropArgs> crop) {
            this.crop = crop;
            return this;
        }

        public Builder setCrop(@Nullable CropArgs crop) {
            this.crop = Input.ofNullable(crop);
            return this;
        }

        public Builder setDeblock(@Nullable Input<DeblockArgs> deblock) {
            this.deblock = deblock;
            return this;
        }

        public Builder setDeblock(@Nullable DeblockArgs deblock) {
            this.deblock = Input.ofNullable(deblock);
            return this;
        }

        public Builder setDenoise(@Nullable Input<DenoiseArgs> denoise) {
            this.denoise = denoise;
            return this;
        }

        public Builder setDenoise(@Nullable DenoiseArgs denoise) {
            this.denoise = Input.ofNullable(denoise);
            return this;
        }

        public Builder setPad(@Nullable Input<PadArgs> pad) {
            this.pad = pad;
            return this;
        }

        public Builder setPad(@Nullable PadArgs pad) {
            this.pad = Input.ofNullable(pad);
            return this;
        }

        public PreprocessingConfigArgs build() {
            return new PreprocessingConfigArgs(audio, color, crop, deblock, denoise, pad);
        }
    }
}
