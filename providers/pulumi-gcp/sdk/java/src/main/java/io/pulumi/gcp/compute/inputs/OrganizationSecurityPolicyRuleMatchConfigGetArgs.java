// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyRuleMatchConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyRuleMatchConfigGetArgs Empty = new OrganizationSecurityPolicyRuleMatchConfigGetArgs();

    /**
     * Destination IP address range in CIDR format. Required for
     * EGRESS rules.
     * 
     */
    @InputImport(name="destIpRanges")
      private final @Nullable Input<List<String>> destIpRanges;

    public Input<List<String>> getDestIpRanges() {
        return this.destIpRanges == null ? Input.empty() : this.destIpRanges;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * 
     */
    @InputImport(name="layer4Configs", required=true)
      private final Input<List<OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs>> layer4Configs;

    public Input<List<OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs>> getLayer4Configs() {
        return this.layer4Configs;
    }

    /**
     * Source IP address range in CIDR format. Required for
     * INGRESS rules.
     * 
     */
    @InputImport(name="srcIpRanges")
      private final @Nullable Input<List<String>> srcIpRanges;

    public Input<List<String>> getSrcIpRanges() {
        return this.srcIpRanges == null ? Input.empty() : this.srcIpRanges;
    }

    public OrganizationSecurityPolicyRuleMatchConfigGetArgs(
        @Nullable Input<List<String>> destIpRanges,
        Input<List<OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs>> layer4Configs,
        @Nullable Input<List<String>> srcIpRanges) {
        this.destIpRanges = destIpRanges;
        this.layer4Configs = Objects.requireNonNull(layer4Configs, "expected parameter 'layer4Configs' to be non-null");
        this.srcIpRanges = srcIpRanges;
    }

    private OrganizationSecurityPolicyRuleMatchConfigGetArgs() {
        this.destIpRanges = Input.empty();
        this.layer4Configs = Input.empty();
        this.srcIpRanges = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSecurityPolicyRuleMatchConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> destIpRanges;
        private Input<List<OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs>> layer4Configs;
        private @Nullable Input<List<String>> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSecurityPolicyRuleMatchConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder destIpRanges(@Nullable Input<List<String>> destIpRanges) {
            this.destIpRanges = destIpRanges;
            return this;
        }

        public Builder destIpRanges(@Nullable List<String> destIpRanges) {
            this.destIpRanges = Input.ofNullable(destIpRanges);
            return this;
        }

        public Builder layer4Configs(Input<List<OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs>> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }

        public Builder layer4Configs(List<OrganizationSecurityPolicyRuleMatchConfigLayer4ConfigGetArgs> layer4Configs) {
            this.layer4Configs = Input.of(Objects.requireNonNull(layer4Configs));
            return this;
        }

        public Builder srcIpRanges(@Nullable Input<List<String>> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }

        public Builder srcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = Input.ofNullable(srcIpRanges);
            return this;
        }
        public OrganizationSecurityPolicyRuleMatchConfigGetArgs build() {
            return new OrganizationSecurityPolicyRuleMatchConfigGetArgs(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
