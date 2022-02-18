// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleMatcherConfigResponse {
    /**
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
     */
    private final List<String> srcIpRanges;

    @OutputCustomType.Constructor({"srcIpRanges"})
    private SecurityPolicyRuleMatcherConfigResponse(List<String> srcIpRanges) {
        this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
    }

    /**
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
     */
    public List<String> getSrcIpRanges() {
        return this.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder setSrcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }

        public SecurityPolicyRuleMatcherConfigResponse build() {
            return new SecurityPolicyRuleMatcherConfigResponse(srcIpRanges);
        }
    }
}
