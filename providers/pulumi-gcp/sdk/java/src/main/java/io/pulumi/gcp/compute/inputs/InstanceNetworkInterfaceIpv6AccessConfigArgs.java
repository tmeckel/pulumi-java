// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceIpv6AccessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceIpv6AccessConfigArgs Empty = new InstanceNetworkInterfaceIpv6AccessConfigArgs();

    @InputImport(name="externalIpv6")
      private final @Nullable Input<String> externalIpv6;

    public Input<String> getExternalIpv6() {
        return this.externalIpv6 == null ? Input.empty() : this.externalIpv6;
    }

    @InputImport(name="externalIpv6PrefixLength")
      private final @Nullable Input<String> externalIpv6PrefixLength;

    public Input<String> getExternalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength == null ? Input.empty() : this.externalIpv6PrefixLength;
    }

    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
     */
    @InputImport(name="networkTier", required=true)
      private final Input<String> networkTier;

    public Input<String> getNetworkTier() {
        return this.networkTier;
    }

    /**
     * The domain name to be used when creating DNSv6
     * records for the external IPv6 ranges..
     * 
     */
    @InputImport(name="publicPtrDomainName")
      private final @Nullable Input<String> publicPtrDomainName;

    public Input<String> getPublicPtrDomainName() {
        return this.publicPtrDomainName == null ? Input.empty() : this.publicPtrDomainName;
    }

    public InstanceNetworkInterfaceIpv6AccessConfigArgs(
        @Nullable Input<String> externalIpv6,
        @Nullable Input<String> externalIpv6PrefixLength,
        Input<String> networkTier,
        @Nullable Input<String> publicPtrDomainName) {
        this.externalIpv6 = externalIpv6;
        this.externalIpv6PrefixLength = externalIpv6PrefixLength;
        this.networkTier = Objects.requireNonNull(networkTier, "expected parameter 'networkTier' to be non-null");
        this.publicPtrDomainName = publicPtrDomainName;
    }

    private InstanceNetworkInterfaceIpv6AccessConfigArgs() {
        this.externalIpv6 = Input.empty();
        this.externalIpv6PrefixLength = Input.empty();
        this.networkTier = Input.empty();
        this.publicPtrDomainName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterfaceIpv6AccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> externalIpv6;
        private @Nullable Input<String> externalIpv6PrefixLength;
        private Input<String> networkTier;
        private @Nullable Input<String> publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterfaceIpv6AccessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder externalIpv6(@Nullable Input<String> externalIpv6) {
            this.externalIpv6 = externalIpv6;
            return this;
        }

        public Builder externalIpv6(@Nullable String externalIpv6) {
            this.externalIpv6 = Input.ofNullable(externalIpv6);
            return this;
        }

        public Builder externalIpv6PrefixLength(@Nullable Input<String> externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = externalIpv6PrefixLength;
            return this;
        }

        public Builder externalIpv6PrefixLength(@Nullable String externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = Input.ofNullable(externalIpv6PrefixLength);
            return this;
        }

        public Builder networkTier(Input<String> networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder networkTier(String networkTier) {
            this.networkTier = Input.of(Objects.requireNonNull(networkTier));
            return this;
        }

        public Builder publicPtrDomainName(@Nullable Input<String> publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public Builder publicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = Input.ofNullable(publicPtrDomainName);
            return this;
        }
        public InstanceNetworkInterfaceIpv6AccessConfigArgs build() {
            return new InstanceNetworkInterfaceIpv6AccessConfigArgs(externalIpv6, externalIpv6PrefixLength, networkTier, publicPtrDomainName);
        }
    }
}
