// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * A sequence of absolute datetime ranges as a string. The datetime values should follow IS08601, and the sum of the ranges should add up to 24 hours or less. Currently, there can be only one range specified in the sequence.
 * 
 */
public final class VideoSequenceAbsoluteTimeMarkersArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoSequenceAbsoluteTimeMarkersArgs Empty = new VideoSequenceAbsoluteTimeMarkersArgs();

    /**
     * The sequence of datetime ranges. Example: '[["2021-10-05T03:30:00Z", "2021-10-05T03:40:00Z"]]'.
     * 
     */
    @Import(name="ranges", required=true)
      private final Output<String> ranges;

    public Output<String> getRanges() {
        return this.ranges;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSequenceAbsoluteTimeMarkers'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public VideoSequenceAbsoluteTimeMarkersArgs(
        Output<String> ranges,
        Output<String> type) {
        this.ranges = Objects.requireNonNull(ranges, "expected parameter 'ranges' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VideoSequenceAbsoluteTimeMarkersArgs() {
        this.ranges = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoSequenceAbsoluteTimeMarkersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ranges;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoSequenceAbsoluteTimeMarkersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.type = defaults.type;
        }

        public Builder ranges(Output<String> ranges) {
            this.ranges = Objects.requireNonNull(ranges);
            return this;
        }
        public Builder ranges(String ranges) {
            this.ranges = Output.of(Objects.requireNonNull(ranges));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public VideoSequenceAbsoluteTimeMarkersArgs build() {
            return new VideoSequenceAbsoluteTimeMarkersArgs(ranges, type);
        }
    }
}
