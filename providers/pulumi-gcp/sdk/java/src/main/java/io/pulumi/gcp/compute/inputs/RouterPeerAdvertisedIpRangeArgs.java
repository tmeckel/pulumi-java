// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterPeerAdvertisedIpRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterPeerAdvertisedIpRangeArgs Empty = new RouterPeerAdvertisedIpRangeArgs();

    /**
     * User-specified description for the IP range.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The IP range to advertise. The value must be a
     * CIDR-formatted string.
     * 
     */
    @Import(name="range", required=true)
      private final Output<String> range;

    public Output<String> getRange() {
        return this.range;
    }

    public RouterPeerAdvertisedIpRangeArgs(
        @Nullable Output<String> description,
        Output<String> range) {
        this.description = description;
        this.range = Objects.requireNonNull(range, "expected parameter 'range' to be non-null");
    }

    private RouterPeerAdvertisedIpRangeArgs() {
        this.description = Codegen.empty();
        this.range = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterPeerAdvertisedIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> range;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterPeerAdvertisedIpRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder range(Output<String> range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public Builder range(String range) {
            this.range = Output.of(Objects.requireNonNull(range));
            return this;
        }        public RouterPeerAdvertisedIpRangeArgs build() {
            return new RouterPeerAdvertisedIpRangeArgs(description, range);
        }
    }
}
