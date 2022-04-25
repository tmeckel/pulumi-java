// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PacketMirroringFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final PacketMirroringFilterArgs Empty = new PacketMirroringFilterArgs();

    /**
     * IP CIDR ranges that apply as a filter on the source (ingress) or
     * destination (egress) IP in the IP header. Only IPv4 is supported.
     * 
     */
    @Import(name="cidrRanges")
    private @Nullable Output<List<String>> cidrRanges;

    /**
     * @return IP CIDR ranges that apply as a filter on the source (ingress) or
     * destination (egress) IP in the IP header. Only IPv4 is supported.
     * 
     */
    public Optional<Output<List<String>>> cidrRanges() {
        return Optional.ofNullable(this.cidrRanges);
    }

    /**
     * Direction of traffic to mirror.
     * Default value is `BOTH`.
     * Possible values are `INGRESS`, `EGRESS`, and `BOTH`.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Direction of traffic to mirror.
     * Default value is `BOTH`.
     * Possible values are `INGRESS`, `EGRESS`, and `BOTH`.
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Protocols that apply as a filter on mirrored traffic.
     * Each value may be one of `tcp`, `udp`, and `icmp`.
     * 
     */
    @Import(name="ipProtocols")
    private @Nullable Output<List<String>> ipProtocols;

    /**
     * @return Protocols that apply as a filter on mirrored traffic.
     * Each value may be one of `tcp`, `udp`, and `icmp`.
     * 
     */
    public Optional<Output<List<String>>> ipProtocols() {
        return Optional.ofNullable(this.ipProtocols);
    }

    private PacketMirroringFilterArgs() {}

    private PacketMirroringFilterArgs(PacketMirroringFilterArgs $) {
        this.cidrRanges = $.cidrRanges;
        this.direction = $.direction;
        this.ipProtocols = $.ipProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringFilterArgs $;

        public Builder() {
            $ = new PacketMirroringFilterArgs();
        }

        public Builder(PacketMirroringFilterArgs defaults) {
            $ = new PacketMirroringFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrRanges IP CIDR ranges that apply as a filter on the source (ingress) or
         * destination (egress) IP in the IP header. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder cidrRanges(@Nullable Output<List<String>> cidrRanges) {
            $.cidrRanges = cidrRanges;
            return this;
        }

        /**
         * @param cidrRanges IP CIDR ranges that apply as a filter on the source (ingress) or
         * destination (egress) IP in the IP header. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder cidrRanges(List<String> cidrRanges) {
            return cidrRanges(Output.of(cidrRanges));
        }

        /**
         * @param cidrRanges IP CIDR ranges that apply as a filter on the source (ingress) or
         * destination (egress) IP in the IP header. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder cidrRanges(String... cidrRanges) {
            return cidrRanges(List.of(cidrRanges));
        }

        /**
         * @param direction Direction of traffic to mirror.
         * Default value is `BOTH`.
         * Possible values are `INGRESS`, `EGRESS`, and `BOTH`.
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Direction of traffic to mirror.
         * Default value is `BOTH`.
         * Possible values are `INGRESS`, `EGRESS`, and `BOTH`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param ipProtocols Protocols that apply as a filter on mirrored traffic.
         * Each value may be one of `tcp`, `udp`, and `icmp`.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocols(@Nullable Output<List<String>> ipProtocols) {
            $.ipProtocols = ipProtocols;
            return this;
        }

        /**
         * @param ipProtocols Protocols that apply as a filter on mirrored traffic.
         * Each value may be one of `tcp`, `udp`, and `icmp`.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocols(List<String> ipProtocols) {
            return ipProtocols(Output.of(ipProtocols));
        }

        /**
         * @param ipProtocols Protocols that apply as a filter on mirrored traffic.
         * Each value may be one of `tcp`, `udp`, and `icmp`.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocols(String... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }

        public PacketMirroringFilterArgs build() {
            return $;
        }
    }

}
