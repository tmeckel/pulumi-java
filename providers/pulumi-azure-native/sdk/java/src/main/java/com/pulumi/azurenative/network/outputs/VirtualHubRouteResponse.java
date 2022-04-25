// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualHubRouteResponse {
    /**
     * @return List of all addressPrefixes.
     * 
     */
    private final @Nullable List<String> addressPrefixes;
    /**
     * @return NextHop ip address.
     * 
     */
    private final @Nullable String nextHopIpAddress;

    @CustomType.Constructor
    private VirtualHubRouteResponse(
        @CustomType.Parameter("addressPrefixes") @Nullable List<String> addressPrefixes,
        @CustomType.Parameter("nextHopIpAddress") @Nullable String nextHopIpAddress) {
        this.addressPrefixes = addressPrefixes;
        this.nextHopIpAddress = nextHopIpAddress;
    }

    /**
     * @return List of all addressPrefixes.
     * 
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes == null ? List.of() : this.addressPrefixes;
    }
    /**
     * @return NextHop ip address.
     * 
     */
    public Optional<String> nextHopIpAddress() {
        return Optional.ofNullable(this.nextHopIpAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressPrefixes;
        private @Nullable String nextHopIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
        }

        public Builder addressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }
        public Builder nextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }        public VirtualHubRouteResponse build() {
            return new VirtualHubRouteResponse(addressPrefixes, nextHopIpAddress);
        }
    }
}
