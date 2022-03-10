// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.NormalizedCoordinateResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Display overlay object with fade animation.
 * 
 */
public final class AnimationFadeResponse extends io.pulumi.resources.InvokeArgs {

    public static final AnimationFadeResponse Empty = new AnimationFadeResponse();

    /**
     * The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
     * 
     */
    @InputImport(name="endTimeOffset", required=true)
      private final String endTimeOffset;

    public String getEndTimeOffset() {
        return this.endTimeOffset;
    }

    /**
     * Type of fade animation: `FADE_IN` or `FADE_OUT`.
     * 
     */
    @InputImport(name="fadeType", required=true)
      private final String fadeType;

    public String getFadeType() {
        return this.fadeType;
    }

    /**
     * The time to start the fade animation, in seconds. Default: 0
     * 
     */
    @InputImport(name="startTimeOffset", required=true)
      private final String startTimeOffset;

    public String getStartTimeOffset() {
        return this.startTimeOffset;
    }

    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    @InputImport(name="xy", required=true)
      private final NormalizedCoordinateResponse xy;

    public NormalizedCoordinateResponse getXy() {
        return this.xy;
    }

    public AnimationFadeResponse(
        String endTimeOffset,
        String fadeType,
        String startTimeOffset,
        NormalizedCoordinateResponse xy) {
        this.endTimeOffset = Objects.requireNonNull(endTimeOffset, "expected parameter 'endTimeOffset' to be non-null");
        this.fadeType = Objects.requireNonNull(fadeType, "expected parameter 'fadeType' to be non-null");
        this.startTimeOffset = Objects.requireNonNull(startTimeOffset, "expected parameter 'startTimeOffset' to be non-null");
        this.xy = Objects.requireNonNull(xy, "expected parameter 'xy' to be non-null");
    }

    private AnimationFadeResponse() {
        this.endTimeOffset = null;
        this.fadeType = null;
        this.startTimeOffset = null;
        this.xy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationFadeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTimeOffset;
        private String fadeType;
        private String startTimeOffset;
        private NormalizedCoordinateResponse xy;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationFadeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeOffset = defaults.endTimeOffset;
    	      this.fadeType = defaults.fadeType;
    	      this.startTimeOffset = defaults.startTimeOffset;
    	      this.xy = defaults.xy;
        }

        public Builder endTimeOffset(String endTimeOffset) {
            this.endTimeOffset = Objects.requireNonNull(endTimeOffset);
            return this;
        }

        public Builder fadeType(String fadeType) {
            this.fadeType = Objects.requireNonNull(fadeType);
            return this;
        }

        public Builder startTimeOffset(String startTimeOffset) {
            this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
            return this;
        }

        public Builder xy(NormalizedCoordinateResponse xy) {
            this.xy = Objects.requireNonNull(xy);
            return this;
        }
        public AnimationFadeResponse build() {
            return new AnimationFadeResponse(endTimeOffset, fadeType, startTimeOffset, xy);
        }
    }
}
