// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PolicyAlternativeNameServerConfigTargetNameServerResponse {
    /**
     * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    private final String forwardingPath;
    /**
     * IPv4 address to forward to.
     * 
     */
    private final String ipv4Address;
    /**
     * IPv6 address to forward to. Does not accept both fields (ipv4 & ipv6) being populated.
     * 
     */
    private final String ipv6Address;
    private final String kind;

    @OutputCustomType.Constructor({"forwardingPath","ipv4Address","ipv6Address","kind"})
    private PolicyAlternativeNameServerConfigTargetNameServerResponse(
        String forwardingPath,
        String ipv4Address,
        String ipv6Address,
        String kind) {
        this.forwardingPath = Objects.requireNonNull(forwardingPath);
        this.ipv4Address = Objects.requireNonNull(ipv4Address);
        this.ipv6Address = Objects.requireNonNull(ipv6Address);
        this.kind = Objects.requireNonNull(kind);
    }

    /**
     * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    public String getForwardingPath() {
        return this.forwardingPath;
    }
    /**
     * IPv4 address to forward to.
     * 
     */
    public String getIpv4Address() {
        return this.ipv4Address;
    }
    /**
     * IPv6 address to forward to. Does not accept both fields (ipv4 & ipv6) being populated.
     * 
     */
    public String getIpv6Address() {
        return this.ipv6Address;
    }
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAlternativeNameServerConfigTargetNameServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String forwardingPath;
        private String ipv4Address;
        private String ipv6Address;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAlternativeNameServerConfigTargetNameServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
        }

        public Builder setForwardingPath(String forwardingPath) {
            this.forwardingPath = Objects.requireNonNull(forwardingPath);
            return this;
        }

        public Builder setIpv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }

        public Builder setIpv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public PolicyAlternativeNameServerConfigTargetNameServerResponse build() {
            return new PolicyAlternativeNameServerConfigTargetNameServerResponse(forwardingPath, ipv4Address, ipv6Address, kind);
        }
    }
}
