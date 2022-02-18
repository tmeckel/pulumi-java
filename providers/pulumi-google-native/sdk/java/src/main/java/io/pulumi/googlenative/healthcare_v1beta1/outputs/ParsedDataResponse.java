// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.SegmentResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ParsedDataResponse {
    private final List<SegmentResponse> segments;

    @OutputCustomType.Constructor({"segments"})
    private ParsedDataResponse(List<SegmentResponse> segments) {
        this.segments = Objects.requireNonNull(segments);
    }

    public List<SegmentResponse> getSegments() {
        return this.segments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParsedDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SegmentResponse> segments;

        public Builder() {
    	      // Empty
        }

        public Builder(ParsedDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segments = defaults.segments;
        }

        public Builder setSegments(List<SegmentResponse> segments) {
            this.segments = Objects.requireNonNull(segments);
            return this;
        }

        public ParsedDataResponse build() {
            return new ParsedDataResponse(segments);
        }
    }
}
