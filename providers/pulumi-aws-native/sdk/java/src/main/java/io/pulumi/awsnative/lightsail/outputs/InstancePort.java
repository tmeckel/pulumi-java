// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstancePort {
    /**
     * Access Direction for Protocol of the Instance(inbound/outbound).
     * 
     */
    private final @Nullable String accessDirection;
    /**
     * Access From Protocol of the Instance.
     * 
     */
    private final @Nullable String accessFrom;
    /**
     * Access Type Protocol of the Instance.
     * 
     */
    private final @Nullable String accessType;
    private final @Nullable List<String> cidrListAliases;
    private final @Nullable List<String> cidrs;
    /**
     * CommonName for Protocol of the Instance.
     * 
     */
    private final @Nullable String commonName;
    /**
     * From Port of the Instance.
     * 
     */
    private final @Nullable Integer fromPort;
    private final @Nullable List<String> ipv6Cidrs;
    /**
     * Port Protocol of the Instance.
     * 
     */
    private final @Nullable String protocol;
    /**
     * To Port of the Instance.
     * 
     */
    private final @Nullable Integer toPort;

    @OutputCustomType.Constructor
    private InstancePort(
        @OutputCustomType.Parameter("accessDirection") @Nullable String accessDirection,
        @OutputCustomType.Parameter("accessFrom") @Nullable String accessFrom,
        @OutputCustomType.Parameter("accessType") @Nullable String accessType,
        @OutputCustomType.Parameter("cidrListAliases") @Nullable List<String> cidrListAliases,
        @OutputCustomType.Parameter("cidrs") @Nullable List<String> cidrs,
        @OutputCustomType.Parameter("commonName") @Nullable String commonName,
        @OutputCustomType.Parameter("fromPort") @Nullable Integer fromPort,
        @OutputCustomType.Parameter("ipv6Cidrs") @Nullable List<String> ipv6Cidrs,
        @OutputCustomType.Parameter("protocol") @Nullable String protocol,
        @OutputCustomType.Parameter("toPort") @Nullable Integer toPort) {
        this.accessDirection = accessDirection;
        this.accessFrom = accessFrom;
        this.accessType = accessType;
        this.cidrListAliases = cidrListAliases;
        this.cidrs = cidrs;
        this.commonName = commonName;
        this.fromPort = fromPort;
        this.ipv6Cidrs = ipv6Cidrs;
        this.protocol = protocol;
        this.toPort = toPort;
    }

    /**
     * Access Direction for Protocol of the Instance(inbound/outbound).
     * 
    */
    public Optional<String> getAccessDirection() {
        return Optional.ofNullable(this.accessDirection);
    }
    /**
     * Access From Protocol of the Instance.
     * 
    */
    public Optional<String> getAccessFrom() {
        return Optional.ofNullable(this.accessFrom);
    }
    /**
     * Access Type Protocol of the Instance.
     * 
    */
    public Optional<String> getAccessType() {
        return Optional.ofNullable(this.accessType);
    }
    public List<String> getCidrListAliases() {
        return this.cidrListAliases == null ? List.of() : this.cidrListAliases;
    }
    public List<String> getCidrs() {
        return this.cidrs == null ? List.of() : this.cidrs;
    }
    /**
     * CommonName for Protocol of the Instance.
     * 
    */
    public Optional<String> getCommonName() {
        return Optional.ofNullable(this.commonName);
    }
    /**
     * From Port of the Instance.
     * 
    */
    public Optional<Integer> getFromPort() {
        return Optional.ofNullable(this.fromPort);
    }
    public List<String> getIpv6Cidrs() {
        return this.ipv6Cidrs == null ? List.of() : this.ipv6Cidrs;
    }
    /**
     * Port Protocol of the Instance.
     * 
    */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * To Port of the Instance.
     * 
    */
    public Optional<Integer> getToPort() {
        return Optional.ofNullable(this.toPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessDirection;
        private @Nullable String accessFrom;
        private @Nullable String accessType;
        private @Nullable List<String> cidrListAliases;
        private @Nullable List<String> cidrs;
        private @Nullable String commonName;
        private @Nullable Integer fromPort;
        private @Nullable List<String> ipv6Cidrs;
        private @Nullable String protocol;
        private @Nullable Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessDirection = defaults.accessDirection;
    	      this.accessFrom = defaults.accessFrom;
    	      this.accessType = defaults.accessType;
    	      this.cidrListAliases = defaults.cidrListAliases;
    	      this.cidrs = defaults.cidrs;
    	      this.commonName = defaults.commonName;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6Cidrs = defaults.ipv6Cidrs;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder accessDirection(@Nullable String accessDirection) {
            this.accessDirection = accessDirection;
            return this;
        }

        public Builder accessFrom(@Nullable String accessFrom) {
            this.accessFrom = accessFrom;
            return this;
        }

        public Builder accessType(@Nullable String accessType) {
            this.accessType = accessType;
            return this;
        }

        public Builder cidrListAliases(@Nullable List<String> cidrListAliases) {
            this.cidrListAliases = cidrListAliases;
            return this;
        }

        public Builder cidrs(@Nullable List<String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }

        public Builder commonName(@Nullable String commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder fromPort(@Nullable Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        public Builder ipv6Cidrs(@Nullable List<String> ipv6Cidrs) {
            this.ipv6Cidrs = ipv6Cidrs;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder toPort(@Nullable Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public InstancePort build() {
            return new InstancePort(accessDirection, accessFrom, accessType, cidrListAliases, cidrs, commonName, fromPort, ipv6Cidrs, protocol, toPort);
        }
    }
}
