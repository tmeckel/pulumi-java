// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleMatcherLayer4ConfigResponse;
import io.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleSecureTagResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class FirewallPolicyRuleMatcherResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyRuleMatcherResponse Empty = new FirewallPolicyRuleMatcherResponse();

    /**
     * Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
     * 
     */
    @InputImport(name="destAddressGroups", required=true)
    private final List<String> destAddressGroups;

    public List<String> getDestAddressGroups() {
        return this.destAddressGroups;
    }

    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
     * 
     */
    @InputImport(name="destFqdns", required=true)
    private final List<String> destFqdns;

    public List<String> getDestFqdns() {
        return this.destFqdns;
    }

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    @InputImport(name="destIpRanges", required=true)
    private final List<String> destIpRanges;

    public List<String> getDestIpRanges() {
        return this.destIpRanges;
    }

    /**
     * Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of dest region codes allowed is 5000.
     * 
     */
    @InputImport(name="destRegionCodes", required=true)
    private final List<String> destRegionCodes;

    public List<String> getDestRegionCodes() {
        return this.destRegionCodes;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
     */
    @InputImport(name="layer4Configs", required=true)
    private final List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;

    public List<FirewallPolicyRuleMatcherLayer4ConfigResponse> getLayer4Configs() {
        return this.layer4Configs;
    }

    /**
     * Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
     * 
     */
    @InputImport(name="srcAddressGroups", required=true)
    private final List<String> srcAddressGroups;

    public List<String> getSrcAddressGroups() {
        return this.srcAddressGroups;
    }

    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
     * 
     */
    @InputImport(name="srcFqdns", required=true)
    private final List<String> srcFqdns;

    public List<String> getSrcFqdns() {
        return this.srcFqdns;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    @InputImport(name="srcIpRanges", required=true)
    private final List<String> srcIpRanges;

    public List<String> getSrcIpRanges() {
        return this.srcIpRanges;
    }

    /**
     * Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of source region codes allowed is 5000.
     * 
     */
    @InputImport(name="srcRegionCodes", required=true)
    private final List<String> srcRegionCodes;

    public List<String> getSrcRegionCodes() {
        return this.srcRegionCodes;
    }

    /**
     * List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    @InputImport(name="srcSecureTags", required=true)
    private final List<FirewallPolicyRuleSecureTagResponse> srcSecureTags;

    public List<FirewallPolicyRuleSecureTagResponse> getSrcSecureTags() {
        return this.srcSecureTags;
    }

    public FirewallPolicyRuleMatcherResponse(
        List<String> destAddressGroups,
        List<String> destFqdns,
        List<String> destIpRanges,
        List<String> destRegionCodes,
        List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs,
        List<String> srcAddressGroups,
        List<String> srcFqdns,
        List<String> srcIpRanges,
        List<String> srcRegionCodes,
        List<FirewallPolicyRuleSecureTagResponse> srcSecureTags) {
        this.destAddressGroups = Objects.requireNonNull(destAddressGroups, "expected parameter 'destAddressGroups' to be non-null");
        this.destFqdns = Objects.requireNonNull(destFqdns, "expected parameter 'destFqdns' to be non-null");
        this.destIpRanges = Objects.requireNonNull(destIpRanges, "expected parameter 'destIpRanges' to be non-null");
        this.destRegionCodes = Objects.requireNonNull(destRegionCodes, "expected parameter 'destRegionCodes' to be non-null");
        this.layer4Configs = Objects.requireNonNull(layer4Configs, "expected parameter 'layer4Configs' to be non-null");
        this.srcAddressGroups = Objects.requireNonNull(srcAddressGroups, "expected parameter 'srcAddressGroups' to be non-null");
        this.srcFqdns = Objects.requireNonNull(srcFqdns, "expected parameter 'srcFqdns' to be non-null");
        this.srcIpRanges = Objects.requireNonNull(srcIpRanges, "expected parameter 'srcIpRanges' to be non-null");
        this.srcRegionCodes = Objects.requireNonNull(srcRegionCodes, "expected parameter 'srcRegionCodes' to be non-null");
        this.srcSecureTags = Objects.requireNonNull(srcSecureTags, "expected parameter 'srcSecureTags' to be non-null");
    }

    private FirewallPolicyRuleMatcherResponse() {
        this.destAddressGroups = List.of();
        this.destFqdns = List.of();
        this.destIpRanges = List.of();
        this.destRegionCodes = List.of();
        this.layer4Configs = List.of();
        this.srcAddressGroups = List.of();
        this.srcFqdns = List.of();
        this.srcIpRanges = List.of();
        this.srcRegionCodes = List.of();
        this.srcSecureTags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destAddressGroups;
        private List<String> destFqdns;
        private List<String> destIpRanges;
        private List<String> destRegionCodes;
        private List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;
        private List<String> srcAddressGroups;
        private List<String> srcFqdns;
        private List<String> srcIpRanges;
        private List<String> srcRegionCodes;
        private List<FirewallPolicyRuleSecureTagResponse> srcSecureTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destAddressGroups = defaults.destAddressGroups;
    	      this.destFqdns = defaults.destFqdns;
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.destRegionCodes = defaults.destRegionCodes;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcAddressGroups = defaults.srcAddressGroups;
    	      this.srcFqdns = defaults.srcFqdns;
    	      this.srcIpRanges = defaults.srcIpRanges;
    	      this.srcRegionCodes = defaults.srcRegionCodes;
    	      this.srcSecureTags = defaults.srcSecureTags;
        }

        public Builder setDestAddressGroups(List<String> destAddressGroups) {
            this.destAddressGroups = Objects.requireNonNull(destAddressGroups);
            return this;
        }

        public Builder setDestFqdns(List<String> destFqdns) {
            this.destFqdns = Objects.requireNonNull(destFqdns);
            return this;
        }

        public Builder setDestIpRanges(List<String> destIpRanges) {
            this.destIpRanges = Objects.requireNonNull(destIpRanges);
            return this;
        }

        public Builder setDestRegionCodes(List<String> destRegionCodes) {
            this.destRegionCodes = Objects.requireNonNull(destRegionCodes);
            return this;
        }

        public Builder setLayer4Configs(List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }

        public Builder setSrcAddressGroups(List<String> srcAddressGroups) {
            this.srcAddressGroups = Objects.requireNonNull(srcAddressGroups);
            return this;
        }

        public Builder setSrcFqdns(List<String> srcFqdns) {
            this.srcFqdns = Objects.requireNonNull(srcFqdns);
            return this;
        }

        public Builder setSrcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }

        public Builder setSrcRegionCodes(List<String> srcRegionCodes) {
            this.srcRegionCodes = Objects.requireNonNull(srcRegionCodes);
            return this;
        }

        public Builder setSrcSecureTags(List<FirewallPolicyRuleSecureTagResponse> srcSecureTags) {
            this.srcSecureTags = Objects.requireNonNull(srcSecureTags);
            return this;
        }

        public FirewallPolicyRuleMatcherResponse build() {
            return new FirewallPolicyRuleMatcherResponse(destAddressGroups, destFqdns, destIpRanges, destRegionCodes, layer4Configs, srcAddressGroups, srcFqdns, srcIpRanges, srcRegionCodes, srcSecureTags);
        }
    }
}
