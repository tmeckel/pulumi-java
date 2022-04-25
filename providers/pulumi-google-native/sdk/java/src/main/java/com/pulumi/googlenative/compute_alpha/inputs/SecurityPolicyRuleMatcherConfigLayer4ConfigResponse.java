// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SecurityPolicyRuleMatcherConfigLayer4ConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyRuleMatcherConfigLayer4ConfigResponse Empty = new SecurityPolicyRuleMatcherConfigLayer4ConfigResponse();

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * 
     */
    @Import(name="ipProtocol", required=true)
    private String ipProtocol;

    /**
     * @return The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
     * 
     */
    public String ipProtocol() {
        return this.ipProtocol;
    }

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and [&#34;12345-12349&#34;]. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="ports", required=true)
    private List<String> ports;

    /**
     * @return An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and [&#34;12345-12349&#34;]. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    public List<String> ports() {
        return this.ports;
    }

    private SecurityPolicyRuleMatcherConfigLayer4ConfigResponse() {}

    private SecurityPolicyRuleMatcherConfigLayer4ConfigResponse(SecurityPolicyRuleMatcherConfigLayer4ConfigResponse $) {
        this.ipProtocol = $.ipProtocol;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleMatcherConfigLayer4ConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleMatcherConfigLayer4ConfigResponse $;

        public Builder() {
            $ = new SecurityPolicyRuleMatcherConfigLayer4ConfigResponse();
        }

        public Builder(SecurityPolicyRuleMatcherConfigLayer4ConfigResponse defaults) {
            $ = new SecurityPolicyRuleMatcherConfigLayer4ConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipProtocol The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(String ipProtocol) {
            $.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * @param ports An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and [&#34;12345-12349&#34;]. This field may only be specified when versioned_expr is set to FIREWALL.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<String> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: [&#34;22&#34;], [&#34;80&#34;,&#34;443&#34;], and [&#34;12345-12349&#34;]. This field may only be specified when versioned_expr is set to FIREWALL.
         * 
         * @return builder
         * 
         */
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }

        public SecurityPolicyRuleMatcherConfigLayer4ConfigResponse build() {
            $.ipProtocol = Objects.requireNonNull($.ipProtocol, "expected parameter 'ipProtocol' to be non-null");
            $.ports = Objects.requireNonNull($.ports, "expected parameter 'ports' to be non-null");
            return $;
        }
    }

}
