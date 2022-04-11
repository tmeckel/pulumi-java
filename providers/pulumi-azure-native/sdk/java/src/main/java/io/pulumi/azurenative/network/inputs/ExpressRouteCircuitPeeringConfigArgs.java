// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the peering configuration.
 * 
 */
public final class ExpressRouteCircuitPeeringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitPeeringConfigArgs Empty = new ExpressRouteCircuitPeeringConfigArgs();

    /**
     * The communities of bgp peering. Specified for microsoft peering.
     * 
     */
    @Import(name="advertisedCommunities")
      private final @Nullable Output<List<String>> advertisedCommunities;

    public Output<List<String>> getAdvertisedCommunities() {
        return this.advertisedCommunities == null ? Codegen.empty() : this.advertisedCommunities;
    }

    /**
     * The reference to AdvertisedPublicPrefixes.
     * 
     */
    @Import(name="advertisedPublicPrefixes")
      private final @Nullable Output<List<String>> advertisedPublicPrefixes;

    public Output<List<String>> getAdvertisedPublicPrefixes() {
        return this.advertisedPublicPrefixes == null ? Codegen.empty() : this.advertisedPublicPrefixes;
    }

    /**
     * The CustomerASN of the peering.
     * 
     */
    @Import(name="customerASN")
      private final @Nullable Output<Integer> customerASN;

    public Output<Integer> getCustomerASN() {
        return this.customerASN == null ? Codegen.empty() : this.customerASN;
    }

    /**
     * The legacy mode of the peering.
     * 
     */
    @Import(name="legacyMode")
      private final @Nullable Output<Integer> legacyMode;

    public Output<Integer> getLegacyMode() {
        return this.legacyMode == null ? Codegen.empty() : this.legacyMode;
    }

    /**
     * The RoutingRegistryName of the configuration.
     * 
     */
    @Import(name="routingRegistryName")
      private final @Nullable Output<String> routingRegistryName;

    public Output<String> getRoutingRegistryName() {
        return this.routingRegistryName == null ? Codegen.empty() : this.routingRegistryName;
    }

    public ExpressRouteCircuitPeeringConfigArgs(
        @Nullable Output<List<String>> advertisedCommunities,
        @Nullable Output<List<String>> advertisedPublicPrefixes,
        @Nullable Output<Integer> customerASN,
        @Nullable Output<Integer> legacyMode,
        @Nullable Output<String> routingRegistryName) {
        this.advertisedCommunities = advertisedCommunities;
        this.advertisedPublicPrefixes = advertisedPublicPrefixes;
        this.customerASN = customerASN;
        this.legacyMode = legacyMode;
        this.routingRegistryName = routingRegistryName;
    }

    private ExpressRouteCircuitPeeringConfigArgs() {
        this.advertisedCommunities = Codegen.empty();
        this.advertisedPublicPrefixes = Codegen.empty();
        this.customerASN = Codegen.empty();
        this.legacyMode = Codegen.empty();
        this.routingRegistryName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> advertisedCommunities;
        private @Nullable Output<List<String>> advertisedPublicPrefixes;
        private @Nullable Output<Integer> customerASN;
        private @Nullable Output<Integer> legacyMode;
        private @Nullable Output<String> routingRegistryName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitPeeringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertisedCommunities = defaults.advertisedCommunities;
    	      this.advertisedPublicPrefixes = defaults.advertisedPublicPrefixes;
    	      this.customerASN = defaults.customerASN;
    	      this.legacyMode = defaults.legacyMode;
    	      this.routingRegistryName = defaults.routingRegistryName;
        }

        public Builder advertisedCommunities(@Nullable Output<List<String>> advertisedCommunities) {
            this.advertisedCommunities = advertisedCommunities;
            return this;
        }
        public Builder advertisedCommunities(@Nullable List<String> advertisedCommunities) {
            this.advertisedCommunities = Codegen.ofNullable(advertisedCommunities);
            return this;
        }
        public Builder advertisedCommunities(String... advertisedCommunities) {
            return advertisedCommunities(List.of(advertisedCommunities));
        }
        public Builder advertisedPublicPrefixes(@Nullable Output<List<String>> advertisedPublicPrefixes) {
            this.advertisedPublicPrefixes = advertisedPublicPrefixes;
            return this;
        }
        public Builder advertisedPublicPrefixes(@Nullable List<String> advertisedPublicPrefixes) {
            this.advertisedPublicPrefixes = Codegen.ofNullable(advertisedPublicPrefixes);
            return this;
        }
        public Builder advertisedPublicPrefixes(String... advertisedPublicPrefixes) {
            return advertisedPublicPrefixes(List.of(advertisedPublicPrefixes));
        }
        public Builder customerASN(@Nullable Output<Integer> customerASN) {
            this.customerASN = customerASN;
            return this;
        }
        public Builder customerASN(@Nullable Integer customerASN) {
            this.customerASN = Codegen.ofNullable(customerASN);
            return this;
        }
        public Builder legacyMode(@Nullable Output<Integer> legacyMode) {
            this.legacyMode = legacyMode;
            return this;
        }
        public Builder legacyMode(@Nullable Integer legacyMode) {
            this.legacyMode = Codegen.ofNullable(legacyMode);
            return this;
        }
        public Builder routingRegistryName(@Nullable Output<String> routingRegistryName) {
            this.routingRegistryName = routingRegistryName;
            return this;
        }
        public Builder routingRegistryName(@Nullable String routingRegistryName) {
            this.routingRegistryName = Codegen.ofNullable(routingRegistryName);
            return this;
        }        public ExpressRouteCircuitPeeringConfigArgs build() {
            return new ExpressRouteCircuitPeeringConfigArgs(advertisedCommunities, advertisedPublicPrefixes, customerASN, legacyMode, routingRegistryName);
        }
    }
}
