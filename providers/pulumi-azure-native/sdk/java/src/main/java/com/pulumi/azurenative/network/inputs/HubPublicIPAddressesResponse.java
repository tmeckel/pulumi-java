// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.AzureFirewallPublicIPAddressResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Public IP addresses associated with azure firewall.
 * 
 */
public final class HubPublicIPAddressesResponse extends com.pulumi.resources.InvokeArgs {

    public static final HubPublicIPAddressesResponse Empty = new HubPublicIPAddressesResponse();

    /**
     * The list of Public IP addresses associated with azure firewall or IP addresses to be retained.
     * 
     */
    @Import(name="addresses")
    private @Nullable List<AzureFirewallPublicIPAddressResponse> addresses;

    /**
     * @return The list of Public IP addresses associated with azure firewall or IP addresses to be retained.
     * 
     */
    public Optional<List<AzureFirewallPublicIPAddressResponse>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    /**
     * The number of Public IP addresses associated with azure firewall.
     * 
     */
    @Import(name="count")
    private @Nullable Integer count;

    /**
     * @return The number of Public IP addresses associated with azure firewall.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }

    private HubPublicIPAddressesResponse() {}

    private HubPublicIPAddressesResponse(HubPublicIPAddressesResponse $) {
        this.addresses = $.addresses;
        this.count = $.count;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HubPublicIPAddressesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HubPublicIPAddressesResponse $;

        public Builder() {
            $ = new HubPublicIPAddressesResponse();
        }

        public Builder(HubPublicIPAddressesResponse defaults) {
            $ = new HubPublicIPAddressesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses The list of Public IP addresses associated with azure firewall or IP addresses to be retained.
         * 
         * @return builder
         * 
         */
        public Builder addresses(@Nullable List<AzureFirewallPublicIPAddressResponse> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses The list of Public IP addresses associated with azure firewall or IP addresses to be retained.
         * 
         * @return builder
         * 
         */
        public Builder addresses(AzureFirewallPublicIPAddressResponse... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param count The number of Public IP addresses associated with azure firewall.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Integer count) {
            $.count = count;
            return this;
        }

        public HubPublicIPAddressesResponse build() {
            return $;
        }
    }

}
