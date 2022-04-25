// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.inputs.NormalizedCoordinateResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Display overlay object with fade animation.
 * 
 */
public final class AnimationFadeResponse extends com.pulumi.resources.InvokeArgs {

    public static final AnimationFadeResponse Empty = new AnimationFadeResponse();

    /**
     * The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
     * 
     */
    @Import(name="endTimeOffset", required=true)
    private String endTimeOffset;

    /**
     * @return The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
     * 
     */
    public String endTimeOffset() {
        return this.endTimeOffset;
    }

    /**
     * Type of fade animation: `FADE_IN` or `FADE_OUT`.
     * 
     */
    @Import(name="fadeType", required=true)
    private String fadeType;

    /**
     * @return Type of fade animation: `FADE_IN` or `FADE_OUT`.
     * 
     */
    public String fadeType() {
        return this.fadeType;
    }

    /**
     * The time to start the fade animation, in seconds. Default: 0
     * 
     */
    @Import(name="startTimeOffset", required=true)
    private String startTimeOffset;

    /**
     * @return The time to start the fade animation, in seconds. Default: 0
     * 
     */
    public String startTimeOffset() {
        return this.startTimeOffset;
    }

    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    @Import(name="xy", required=true)
    private NormalizedCoordinateResponse xy;

    /**
     * @return Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    public NormalizedCoordinateResponse xy() {
        return this.xy;
    }

    private AnimationFadeResponse() {}

    private AnimationFadeResponse(AnimationFadeResponse $) {
        this.endTimeOffset = $.endTimeOffset;
        this.fadeType = $.fadeType;
        this.startTimeOffset = $.startTimeOffset;
        this.xy = $.xy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnimationFadeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnimationFadeResponse $;

        public Builder() {
            $ = new AnimationFadeResponse();
        }

        public Builder(AnimationFadeResponse defaults) {
            $ = new AnimationFadeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTimeOffset The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
         * 
         * @return builder
         * 
         */
        public Builder endTimeOffset(String endTimeOffset) {
            $.endTimeOffset = endTimeOffset;
            return this;
        }

        /**
         * @param fadeType Type of fade animation: `FADE_IN` or `FADE_OUT`.
         * 
         * @return builder
         * 
         */
        public Builder fadeType(String fadeType) {
            $.fadeType = fadeType;
            return this;
        }

        /**
         * @param startTimeOffset The time to start the fade animation, in seconds. Default: 0
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(String startTimeOffset) {
            $.startTimeOffset = startTimeOffset;
            return this;
        }

        /**
         * @param xy Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
         * 
         * @return builder
         * 
         */
        public Builder xy(NormalizedCoordinateResponse xy) {
            $.xy = xy;
            return this;
        }

        public AnimationFadeResponse build() {
            $.endTimeOffset = Objects.requireNonNull($.endTimeOffset, "expected parameter 'endTimeOffset' to be non-null");
            $.fadeType = Objects.requireNonNull($.fadeType, "expected parameter 'fadeType' to be non-null");
            $.startTimeOffset = Objects.requireNonNull($.startTimeOffset, "expected parameter 'startTimeOffset' to be non-null");
            $.xy = Objects.requireNonNull($.xy, "expected parameter 'xy' to be non-null");
            return $;
        }
    }

}
