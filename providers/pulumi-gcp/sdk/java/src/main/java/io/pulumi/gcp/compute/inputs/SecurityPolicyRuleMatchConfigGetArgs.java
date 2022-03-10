// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SecurityPolicyRuleMatchConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleMatchConfigGetArgs Empty = new SecurityPolicyRuleMatchConfigGetArgs();

    /**
     * Set of IP addresses or ranges (IPV4 or IPV6) in CIDR notation
     * to match against inbound traffic. There is a limit of 10 IP ranges per rule. A value of '\*' matches all IPs
     * (can be used to override the default behavior).
     * 
     */
    @InputImport(name="srcIpRanges", required=true)
      private final Input<List<String>> srcIpRanges;

    public Input<List<String>> getSrcIpRanges() {
        return this.srcIpRanges;
    }

    public SecurityPolicyRuleMatchConfigGetArgs(Input<List<String>> srcIpRanges) {
        this.srcIpRanges = Objects.requireNonNull(srcIpRanges, "expected parameter 'srcIpRanges' to be non-null");
    }

    private SecurityPolicyRuleMatchConfigGetArgs() {
        this.srcIpRanges = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatchConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatchConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder srcIpRanges(Input<List<String>> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }

        public Builder srcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Input.of(Objects.requireNonNull(srcIpRanges));
            return this;
        }
        public SecurityPolicyRuleMatchConfigGetArgs build() {
            return new SecurityPolicyRuleMatchConfigGetArgs(srcIpRanges);
        }
    }
}
