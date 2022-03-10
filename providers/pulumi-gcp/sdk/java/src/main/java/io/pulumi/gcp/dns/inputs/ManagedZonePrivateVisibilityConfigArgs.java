// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigNetworkArgs;
import java.util.List;
import java.util.Objects;


public final class ManagedZonePrivateVisibilityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePrivateVisibilityConfigArgs Empty = new ManagedZonePrivateVisibilityConfigArgs();

    @InputImport(name="networks", required=true)
      private final Input<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks;

    public Input<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> getNetworks() {
        return this.networks;
    }

    public ManagedZonePrivateVisibilityConfigArgs(Input<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks) {
        this.networks = Objects.requireNonNull(networks, "expected parameter 'networks' to be non-null");
    }

    private ManagedZonePrivateVisibilityConfigArgs() {
        this.networks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networks = defaults.networks;
        }

        public Builder networks(Input<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }

        public Builder networks(List<ManagedZonePrivateVisibilityConfigNetworkArgs> networks) {
            this.networks = Input.of(Objects.requireNonNull(networks));
            return this;
        }
        public ManagedZonePrivateVisibilityConfigArgs build() {
            return new ManagedZonePrivateVisibilityConfigArgs(networks);
        }
    }
}
