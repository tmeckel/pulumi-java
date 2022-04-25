// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU of an Azure Firewall.
 * 
 */
public final class AzureFirewallSkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFirewallSkuResponse Empty = new AzureFirewallSkuResponse();

    /**
     * Name of an Azure Firewall SKU.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of an Azure Firewall SKU.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tier of an Azure Firewall.
     * 
     */
    @Import(name="tier")
    private @Nullable String tier;

    /**
     * @return Tier of an Azure Firewall.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    private AzureFirewallSkuResponse() {}

    private AzureFirewallSkuResponse(AzureFirewallSkuResponse $) {
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallSkuResponse $;

        public Builder() {
            $ = new AzureFirewallSkuResponse();
        }

        public Builder(AzureFirewallSkuResponse defaults) {
            $ = new AzureFirewallSkuResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of an Azure Firewall SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tier Tier of an Azure Firewall.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable String tier) {
            $.tier = tier;
            return this;
        }

        public AzureFirewallSkuResponse build() {
            return $;
        }
    }

}
