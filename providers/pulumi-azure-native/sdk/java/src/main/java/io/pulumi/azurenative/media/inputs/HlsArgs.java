// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HTTP Live Streaming (HLS) packing setting for the live output.
 * 
 */
public final class HlsArgs extends io.pulumi.resources.ResourceArgs {

    public static final HlsArgs Empty = new HlsArgs();

    /**
     * The number of fragments in an HTTP Live Streaming (HLS) TS segment in the output of the live event. This value does not affect the packing ratio for HLS CMAF output.
     * 
     */
    @Import(name="fragmentsPerTsSegment")
      private final @Nullable Output<Integer> fragmentsPerTsSegment;

    public Output<Integer> getFragmentsPerTsSegment() {
        return this.fragmentsPerTsSegment == null ? Codegen.empty() : this.fragmentsPerTsSegment;
    }

    public HlsArgs(@Nullable Output<Integer> fragmentsPerTsSegment) {
        this.fragmentsPerTsSegment = fragmentsPerTsSegment;
    }

    private HlsArgs() {
        this.fragmentsPerTsSegment = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> fragmentsPerTsSegment;

        public Builder() {
    	      // Empty
        }

        public Builder(HlsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fragmentsPerTsSegment = defaults.fragmentsPerTsSegment;
        }

        public Builder fragmentsPerTsSegment(@Nullable Output<Integer> fragmentsPerTsSegment) {
            this.fragmentsPerTsSegment = fragmentsPerTsSegment;
            return this;
        }
        public Builder fragmentsPerTsSegment(@Nullable Integer fragmentsPerTsSegment) {
            this.fragmentsPerTsSegment = Codegen.ofNullable(fragmentsPerTsSegment);
            return this;
        }        public HlsArgs build() {
            return new HlsArgs(fragmentsPerTsSegment);
        }
    }
}
