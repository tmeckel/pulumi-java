// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyAlternativeNameServerConfigTargetNameServer {
    /**
     * Forwarding path for this TargetNameServer. If unset or `default` Cloud DNS will make forwarding
     * decision based on address ranges, i.e. RFC1918 addresses go to the VPC, Non-RFC1918 addresses go
     * to the Internet. When set to `private`, Cloud DNS will always send queries through VPC for this target
     * Possible values are `default` and `private`.
     * 
     */
    private final @Nullable String forwardingPath;
    /**
     * IPv4 address to forward to.
     * 
     */
    private final String ipv4Address;

    @OutputCustomType.Constructor
    private PolicyAlternativeNameServerConfigTargetNameServer(
        @OutputCustomType.Parameter("forwardingPath") @Nullable String forwardingPath,
        @OutputCustomType.Parameter("ipv4Address") String ipv4Address) {
        this.forwardingPath = forwardingPath;
        this.ipv4Address = ipv4Address;
    }

    /**
     * Forwarding path for this TargetNameServer. If unset or `default` Cloud DNS will make forwarding
     * decision based on address ranges, i.e. RFC1918 addresses go to the VPC, Non-RFC1918 addresses go
     * to the Internet. When set to `private`, Cloud DNS will always send queries through VPC for this target
     * Possible values are `default` and `private`.
     * 
    */
    public Optional<String> getForwardingPath() {
        return Optional.ofNullable(this.forwardingPath);
    }
    /**
     * IPv4 address to forward to.
     * 
    */
    public String getIpv4Address() {
        return this.ipv4Address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAlternativeNameServerConfigTargetNameServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String forwardingPath;
        private String ipv4Address;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAlternativeNameServerConfigTargetNameServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
        }

        public Builder forwardingPath(@Nullable String forwardingPath) {
            this.forwardingPath = forwardingPath;
            return this;
        }

        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }
        public PolicyAlternativeNameServerConfigTargetNameServer build() {
            return new PolicyAlternativeNameServerConfigTargetNameServer(forwardingPath, ipv4Address);
        }
    }
}
