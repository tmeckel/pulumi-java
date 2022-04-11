// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VirtualHubRouteTableV2 route.
 * 
 */
public final class VirtualHubRouteV2Args extends io.pulumi.resources.ResourceArgs {

    public static final VirtualHubRouteV2Args Empty = new VirtualHubRouteV2Args();

    /**
     * The type of destinations.
     * 
     */
    @Import(name="destinationType")
      private final @Nullable Output<String> destinationType;

    public Output<String> getDestinationType() {
        return this.destinationType == null ? Codegen.empty() : this.destinationType;
    }

    /**
     * List of all destinations.
     * 
     */
    @Import(name="destinations")
      private final @Nullable Output<List<String>> destinations;

    public Output<List<String>> getDestinations() {
        return this.destinations == null ? Codegen.empty() : this.destinations;
    }

    /**
     * The type of next hops.
     * 
     */
    @Import(name="nextHopType")
      private final @Nullable Output<String> nextHopType;

    public Output<String> getNextHopType() {
        return this.nextHopType == null ? Codegen.empty() : this.nextHopType;
    }

    /**
     * NextHops ip address.
     * 
     */
    @Import(name="nextHops")
      private final @Nullable Output<List<String>> nextHops;

    public Output<List<String>> getNextHops() {
        return this.nextHops == null ? Codegen.empty() : this.nextHops;
    }

    public VirtualHubRouteV2Args(
        @Nullable Output<String> destinationType,
        @Nullable Output<List<String>> destinations,
        @Nullable Output<String> nextHopType,
        @Nullable Output<List<String>> nextHops) {
        this.destinationType = destinationType;
        this.destinations = destinations;
        this.nextHopType = nextHopType;
        this.nextHops = nextHops;
    }

    private VirtualHubRouteV2Args() {
        this.destinationType = Codegen.empty();
        this.destinations = Codegen.empty();
        this.nextHopType = Codegen.empty();
        this.nextHops = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubRouteV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> destinationType;
        private @Nullable Output<List<String>> destinations;
        private @Nullable Output<String> nextHopType;
        private @Nullable Output<List<String>> nextHops;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubRouteV2Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationType = defaults.destinationType;
    	      this.destinations = defaults.destinations;
    	      this.nextHopType = defaults.nextHopType;
    	      this.nextHops = defaults.nextHops;
        }

        public Builder destinationType(@Nullable Output<String> destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public Builder destinationType(@Nullable String destinationType) {
            this.destinationType = Codegen.ofNullable(destinationType);
            return this;
        }
        public Builder destinations(@Nullable Output<List<String>> destinations) {
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(@Nullable List<String> destinations) {
            this.destinations = Codegen.ofNullable(destinations);
            return this;
        }
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder nextHopType(@Nullable Output<String> nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public Builder nextHopType(@Nullable String nextHopType) {
            this.nextHopType = Codegen.ofNullable(nextHopType);
            return this;
        }
        public Builder nextHops(@Nullable Output<List<String>> nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public Builder nextHops(@Nullable List<String> nextHops) {
            this.nextHops = Codegen.ofNullable(nextHops);
            return this;
        }
        public Builder nextHops(String... nextHops) {
            return nextHops(List.of(nextHops));
        }        public VirtualHubRouteV2Args build() {
            return new VirtualHubRouteV2Args(destinationType, destinations, nextHopType, nextHops);
        }
    }
}
