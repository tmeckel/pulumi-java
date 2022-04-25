// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceAccessConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceAccessConfigGetArgs Empty = new InstanceNetworkInterfaceAccessConfigGetArgs();

    /**
     * The IP address that will be 1:1 mapped to the instance&#39;s
     * network ip. If not given, one will be generated.
     * 
     */
    @Import(name="natIp")
    private @Nullable Output<String> natIp;

    /**
     * @return The IP address that will be 1:1 mapped to the instance&#39;s
     * network ip. If not given, one will be generated.
     * 
     */
    public Optional<Output<String>> natIp() {
        return Optional.ofNullable(this.natIp);
    }

    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
     */
    @Import(name="networkTier")
    private @Nullable Output<String> networkTier;

    /**
     * @return The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
     */
    public Optional<Output<String>> networkTier() {
        return Optional.ofNullable(this.networkTier);
    }

    /**
     * The domain name to be used when creating DNSv6
     * records for the external IPv6 ranges..
     * 
     */
    @Import(name="publicPtrDomainName")
    private @Nullable Output<String> publicPtrDomainName;

    /**
     * @return The domain name to be used when creating DNSv6
     * records for the external IPv6 ranges..
     * 
     */
    public Optional<Output<String>> publicPtrDomainName() {
        return Optional.ofNullable(this.publicPtrDomainName);
    }

    private InstanceNetworkInterfaceAccessConfigGetArgs() {}

    private InstanceNetworkInterfaceAccessConfigGetArgs(InstanceNetworkInterfaceAccessConfigGetArgs $) {
        this.natIp = $.natIp;
        this.networkTier = $.networkTier;
        this.publicPtrDomainName = $.publicPtrDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceNetworkInterfaceAccessConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceNetworkInterfaceAccessConfigGetArgs $;

        public Builder() {
            $ = new InstanceNetworkInterfaceAccessConfigGetArgs();
        }

        public Builder(InstanceNetworkInterfaceAccessConfigGetArgs defaults) {
            $ = new InstanceNetworkInterfaceAccessConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param natIp The IP address that will be 1:1 mapped to the instance&#39;s
         * network ip. If not given, one will be generated.
         * 
         * @return builder
         * 
         */
        public Builder natIp(@Nullable Output<String> natIp) {
            $.natIp = natIp;
            return this;
        }

        /**
         * @param natIp The IP address that will be 1:1 mapped to the instance&#39;s
         * network ip. If not given, one will be generated.
         * 
         * @return builder
         * 
         */
        public Builder natIp(String natIp) {
            return natIp(Output.of(natIp));
        }

        /**
         * @param networkTier The service-level to be provided for IPv6 traffic when the
         * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
         * 
         * @return builder
         * 
         */
        public Builder networkTier(@Nullable Output<String> networkTier) {
            $.networkTier = networkTier;
            return this;
        }

        /**
         * @param networkTier The service-level to be provided for IPv6 traffic when the
         * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
         * 
         * @return builder
         * 
         */
        public Builder networkTier(String networkTier) {
            return networkTier(Output.of(networkTier));
        }

        /**
         * @param publicPtrDomainName The domain name to be used when creating DNSv6
         * records for the external IPv6 ranges..
         * 
         * @return builder
         * 
         */
        public Builder publicPtrDomainName(@Nullable Output<String> publicPtrDomainName) {
            $.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        /**
         * @param publicPtrDomainName The domain name to be used when creating DNSv6
         * records for the external IPv6 ranges..
         * 
         * @return builder
         * 
         */
        public Builder publicPtrDomainName(String publicPtrDomainName) {
            return publicPtrDomainName(Output.of(publicPtrDomainName));
        }

        public InstanceNetworkInterfaceAccessConfigGetArgs build() {
            return $;
        }
    }

}
