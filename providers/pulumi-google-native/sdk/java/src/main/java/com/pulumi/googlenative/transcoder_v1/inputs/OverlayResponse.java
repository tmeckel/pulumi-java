// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.inputs.AnimationResponse;
import com.pulumi.googlenative.transcoder_v1.inputs.ImageResponse;
import java.util.List;
import java.util.Objects;


/**
 * Overlay configuration.
 * 
 */
public final class OverlayResponse extends com.pulumi.resources.InvokeArgs {

    public static final OverlayResponse Empty = new OverlayResponse();

    /**
     * List of Animations. The list should be chronological, without any time overlap.
     * 
     */
    @Import(name="animations", required=true)
    private List<AnimationResponse> animations;

    /**
     * @return List of Animations. The list should be chronological, without any time overlap.
     * 
     */
    public List<AnimationResponse> animations() {
        return this.animations;
    }

    /**
     * Image overlay.
     * 
     */
    @Import(name="image", required=true)
    private ImageResponse image;

    /**
     * @return Image overlay.
     * 
     */
    public ImageResponse image() {
        return this.image;
    }

    private OverlayResponse() {}

    private OverlayResponse(OverlayResponse $) {
        this.animations = $.animations;
        this.image = $.image;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OverlayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OverlayResponse $;

        public Builder() {
            $ = new OverlayResponse();
        }

        public Builder(OverlayResponse defaults) {
            $ = new OverlayResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param animations List of Animations. The list should be chronological, without any time overlap.
         * 
         * @return builder
         * 
         */
        public Builder animations(List<AnimationResponse> animations) {
            $.animations = animations;
            return this;
        }

        /**
         * @param animations List of Animations. The list should be chronological, without any time overlap.
         * 
         * @return builder
         * 
         */
        public Builder animations(AnimationResponse... animations) {
            return animations(List.of(animations));
        }

        /**
         * @param image Image overlay.
         * 
         * @return builder
         * 
         */
        public Builder image(ImageResponse image) {
            $.image = image;
            return this;
        }

        public OverlayResponse build() {
            $.animations = Objects.requireNonNull($.animations, "expected parameter 'animations' to be non-null");
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            return $;
        }
    }

}
