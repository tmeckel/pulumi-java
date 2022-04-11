// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a secondary IP range of a subnetwork.
 * 
 */
public final class SubnetworkSecondaryRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkSecondaryRangeArgs Empty = new SubnetworkSecondaryRangeArgs();

    /**
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * 
     */
    @Import(name="ipCidrRange")
      private final @Nullable Output<String> ipCidrRange;

    public Output<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Codegen.empty() : this.ipCidrRange;
    }

    /**
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * 
     */
    @Import(name="rangeName")
      private final @Nullable Output<String> rangeName;

    public Output<String> getRangeName() {
        return this.rangeName == null ? Codegen.empty() : this.rangeName;
    }

    public SubnetworkSecondaryRangeArgs(
        @Nullable Output<String> ipCidrRange,
        @Nullable Output<String> rangeName) {
        this.ipCidrRange = ipCidrRange;
        this.rangeName = rangeName;
    }

    private SubnetworkSecondaryRangeArgs() {
        this.ipCidrRange = Codegen.empty();
        this.rangeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkSecondaryRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipCidrRange;
        private @Nullable Output<String> rangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkSecondaryRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.rangeName = defaults.rangeName;
        }

        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }
        public Builder ipCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Codegen.ofNullable(ipCidrRange);
            return this;
        }
        public Builder rangeName(@Nullable Output<String> rangeName) {
            this.rangeName = rangeName;
            return this;
        }
        public Builder rangeName(@Nullable String rangeName) {
            this.rangeName = Codegen.ofNullable(rangeName);
            return this;
        }        public SubnetworkSecondaryRangeArgs build() {
            return new SubnetworkSecondaryRangeArgs(ipCidrRange, rangeName);
        }
    }
}
