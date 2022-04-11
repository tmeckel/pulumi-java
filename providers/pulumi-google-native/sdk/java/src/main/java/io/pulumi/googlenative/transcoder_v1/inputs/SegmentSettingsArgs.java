// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Segment settings for `ts`, `fmp4` and `vtt`.
 * 
 */
public final class SegmentSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SegmentSettingsArgs Empty = new SegmentSettingsArgs();

    /**
     * Create an individual segment file. The default is `false`.
     * 
     */
    @Import(name="individualSegments", required=true)
      private final Output<Boolean> individualSegments;

    public Output<Boolean> getIndividualSegments() {
        return this.individualSegments;
    }

    /**
     * Duration of the segments in seconds. The default is `6.0s`. Note that `segmentDuration` must be greater than or equal to [`gopDuration`](#videostream), and `segmentDuration` must be divisible by [`gopDuration`](#videostream).
     * 
     */
    @Import(name="segmentDuration")
      private final @Nullable Output<String> segmentDuration;

    public Output<String> getSegmentDuration() {
        return this.segmentDuration == null ? Codegen.empty() : this.segmentDuration;
    }

    public SegmentSettingsArgs(
        Output<Boolean> individualSegments,
        @Nullable Output<String> segmentDuration) {
        this.individualSegments = Objects.requireNonNull(individualSegments, "expected parameter 'individualSegments' to be non-null");
        this.segmentDuration = segmentDuration;
    }

    private SegmentSettingsArgs() {
        this.individualSegments = Codegen.empty();
        this.segmentDuration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SegmentSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> individualSegments;
        private @Nullable Output<String> segmentDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(SegmentSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.individualSegments = defaults.individualSegments;
    	      this.segmentDuration = defaults.segmentDuration;
        }

        public Builder individualSegments(Output<Boolean> individualSegments) {
            this.individualSegments = Objects.requireNonNull(individualSegments);
            return this;
        }
        public Builder individualSegments(Boolean individualSegments) {
            this.individualSegments = Output.of(Objects.requireNonNull(individualSegments));
            return this;
        }
        public Builder segmentDuration(@Nullable Output<String> segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }
        public Builder segmentDuration(@Nullable String segmentDuration) {
            this.segmentDuration = Codegen.ofNullable(segmentDuration);
            return this;
        }        public SegmentSettingsArgs build() {
            return new SegmentSettingsArgs(individualSegments, segmentDuration);
        }
    }
}
