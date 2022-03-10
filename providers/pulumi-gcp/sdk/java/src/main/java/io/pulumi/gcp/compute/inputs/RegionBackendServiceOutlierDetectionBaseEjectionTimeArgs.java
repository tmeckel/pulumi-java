// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs Empty = new RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs();

    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations
     * less than one second are represented with a 0 `seconds` field and a positive
     * `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @InputImport(name="nanos")
      private final @Nullable Input<Integer> nanos;

    public Input<Integer> getNanos() {
        return this.nanos == null ? Input.empty() : this.nanos;
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000
     * inclusive.
     * 
     */
    @InputImport(name="seconds", required=true)
      private final Input<Integer> seconds;

    public Input<Integer> getSeconds() {
        return this.seconds;
    }

    public RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs(
        @Nullable Input<Integer> nanos,
        Input<Integer> seconds) {
        this.nanos = nanos;
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs() {
        this.nanos = Input.empty();
        this.seconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> nanos;
        private Input<Integer> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder nanos(@Nullable Input<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = Input.ofNullable(nanos);
            return this;
        }

        public Builder seconds(Input<Integer> seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }

        public Builder seconds(Integer seconds) {
            this.seconds = Input.of(Objects.requireNonNull(seconds));
            return this;
        }
        public RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs build() {
            return new RegionBackendServiceOutlierDetectionBaseEjectionTimeArgs(nanos, seconds);
        }
    }
}
