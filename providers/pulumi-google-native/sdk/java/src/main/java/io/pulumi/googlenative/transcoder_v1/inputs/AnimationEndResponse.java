// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * End previous overlay animation from the video. Without AnimationEnd, the overlay object will keep the state of previous animation until the end of the video.
 * 
 */
public final class AnimationEndResponse extends io.pulumi.resources.InvokeArgs {

    public static final AnimationEndResponse Empty = new AnimationEndResponse();

    /**
     * The time to end overlay object, in seconds. Default: 0
     * 
     */
    @InputImport(name="startTimeOffset", required=true)
    private final String startTimeOffset;

    public String getStartTimeOffset() {
        return this.startTimeOffset;
    }

    public AnimationEndResponse(String startTimeOffset) {
        this.startTimeOffset = Objects.requireNonNull(startTimeOffset, "expected parameter 'startTimeOffset' to be non-null");
    }

    private AnimationEndResponse() {
        this.startTimeOffset = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationEndResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String startTimeOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationEndResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTimeOffset = defaults.startTimeOffset;
        }

        public Builder setStartTimeOffset(String startTimeOffset) {
            this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
            return this;
        }

        public AnimationEndResponse build() {
            return new AnimationEndResponse(startTimeOffset);
        }
    }
}
