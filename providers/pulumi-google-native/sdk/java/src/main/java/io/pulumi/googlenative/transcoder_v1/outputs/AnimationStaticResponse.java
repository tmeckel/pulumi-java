// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.transcoder_v1.outputs.NormalizedCoordinateResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AnimationStaticResponse {
    /**
     * The time to start displaying the overlay object, in seconds. Default: 0
     * 
     */
    private final String startTimeOffset;
    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    private final NormalizedCoordinateResponse xy;

    @OutputCustomType.Constructor({"startTimeOffset","xy"})
    private AnimationStaticResponse(
        String startTimeOffset,
        NormalizedCoordinateResponse xy) {
        this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
        this.xy = Objects.requireNonNull(xy);
    }

    /**
     * The time to start displaying the overlay object, in seconds. Default: 0
     * 
     */
    public String getStartTimeOffset() {
        return this.startTimeOffset;
    }
    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    public NormalizedCoordinateResponse getXy() {
        return this.xy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationStaticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String startTimeOffset;
        private NormalizedCoordinateResponse xy;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationStaticResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTimeOffset = defaults.startTimeOffset;
    	      this.xy = defaults.xy;
        }

        public Builder setStartTimeOffset(String startTimeOffset) {
            this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
            return this;
        }

        public Builder setXy(NormalizedCoordinateResponse xy) {
            this.xy = Objects.requireNonNull(xy);
            return this;
        }

        public AnimationStaticResponse build() {
            return new AnimationStaticResponse(startTimeOffset, xy);
        }
    }
}
