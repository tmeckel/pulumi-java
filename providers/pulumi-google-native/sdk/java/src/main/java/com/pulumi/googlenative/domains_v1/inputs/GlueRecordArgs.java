// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a host on your domain that is a DNS name server for your domain and/or other domains. Glue records are a way of making the IP address of a name server known, even when it serves DNS queries for its parent domain. For example, when `ns.example.com` is a name server for `example.com`, the host `ns.example.com` must have a glue record to break the circular DNS reference.
 * 
 */
public final class GlueRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlueRecordArgs Empty = new GlueRecordArgs();

    /**
     * Domain name of the host in Punycode format.
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    /**
     * @return Domain name of the host in Punycode format.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
     * 
     */
    @Import(name="ipv4Addresses")
    private @Nullable Output<List<String>> ipv4Addresses;

    /**
     * @return List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
     * 
     */
    public Optional<Output<List<String>>> ipv4Addresses() {
        return Optional.ofNullable(this.ipv4Addresses);
    }

    /**
     * List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
     * 
     */
    @Import(name="ipv6Addresses")
    private @Nullable Output<List<String>> ipv6Addresses;

    /**
     * @return List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
     * 
     */
    public Optional<Output<List<String>>> ipv6Addresses() {
        return Optional.ofNullable(this.ipv6Addresses);
    }

    private GlueRecordArgs() {}

    private GlueRecordArgs(GlueRecordArgs $) {
        this.hostName = $.hostName;
        this.ipv4Addresses = $.ipv4Addresses;
        this.ipv6Addresses = $.ipv6Addresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlueRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlueRecordArgs $;

        public Builder() {
            $ = new GlueRecordArgs();
        }

        public Builder(GlueRecordArgs defaults) {
            $ = new GlueRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostName Domain name of the host in Punycode format.
         * 
         * @return builder
         * 
         */
        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName Domain name of the host in Punycode format.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param ipv4Addresses List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Addresses(@Nullable Output<List<String>> ipv4Addresses) {
            $.ipv4Addresses = ipv4Addresses;
            return this;
        }

        /**
         * @param ipv4Addresses List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Addresses(List<String> ipv4Addresses) {
            return ipv4Addresses(Output.of(ipv4Addresses));
        }

        /**
         * @param ipv4Addresses List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Addresses(String... ipv4Addresses) {
            return ipv4Addresses(List.of(ipv4Addresses));
        }

        /**
         * @param ipv6Addresses List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Addresses(@Nullable Output<List<String>> ipv6Addresses) {
            $.ipv6Addresses = ipv6Addresses;
            return this;
        }

        /**
         * @param ipv6Addresses List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Addresses(List<String> ipv6Addresses) {
            return ipv6Addresses(Output.of(ipv6Addresses));
        }

        /**
         * @param ipv6Addresses List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Addresses(String... ipv6Addresses) {
            return ipv6Addresses(List.of(ipv6Addresses));
        }

        public GlueRecordArgs build() {
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            return $;
        }
    }

}
