// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Date range of the data to export.
 * 
 */
public final class GoogleCloudApigeeV1DateRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1DateRangeArgs Empty = new GoogleCloudApigeeV1DateRangeArgs();

    /**
     * End date (exclusive) of the data to export in the format `yyyy-mm-dd`. The date range ends at 00:00:00 UTC on the end date- which will not be in the output.
     * 
     */
    @InputImport(name="end", required=true)
    private final Input<String> end;

    public Input<String> getEnd() {
        return this.end;
    }

    /**
     * Start date of the data to export in the format `yyyy-mm-dd`. The date range begins at 00:00:00 UTC on the start date.
     * 
     */
    @InputImport(name="start", required=true)
    private final Input<String> start;

    public Input<String> getStart() {
        return this.start;
    }

    public GoogleCloudApigeeV1DateRangeArgs(
        Input<String> end,
        Input<String> start) {
        this.end = Objects.requireNonNull(end, "expected parameter 'end' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
    }

    private GoogleCloudApigeeV1DateRangeArgs() {
        this.end = Input.empty();
        this.start = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1DateRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> end;
        private Input<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1DateRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder setEnd(Input<String> end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }

        public Builder setEnd(String end) {
            this.end = Input.of(Objects.requireNonNull(end));
            return this;
        }

        public Builder setStart(Input<String> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder setStart(String start) {
            this.start = Input.of(Objects.requireNonNull(start));
            return this;
        }

        public GoogleCloudApigeeV1DateRangeArgs build() {
            return new GoogleCloudApigeeV1DateRangeArgs(end, start);
        }
    }
}
