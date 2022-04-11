// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.inputs.FirewallPolicyRuleMatcherLayer4ConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class FirewallPolicyRuleMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleMatcherArgs Empty = new FirewallPolicyRuleMatcherArgs();

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="destIpRanges")
      private final @Nullable Output<List<String>> destIpRanges;

    public Output<List<String>> getDestIpRanges() {
        return this.destIpRanges == null ? Codegen.empty() : this.destIpRanges;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
     */
    @Import(name="layer4Configs")
      private final @Nullable Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs;

    public Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> getLayer4Configs() {
        return this.layer4Configs == null ? Codegen.empty() : this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="srcIpRanges")
      private final @Nullable Output<List<String>> srcIpRanges;

    public Output<List<String>> getSrcIpRanges() {
        return this.srcIpRanges == null ? Codegen.empty() : this.srcIpRanges;
    }

    public FirewallPolicyRuleMatcherArgs(
        @Nullable Output<List<String>> destIpRanges,
        @Nullable Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs,
        @Nullable Output<List<String>> srcIpRanges) {
        this.destIpRanges = destIpRanges;
        this.layer4Configs = layer4Configs;
        this.srcIpRanges = srcIpRanges;
    }

    private FirewallPolicyRuleMatcherArgs() {
        this.destIpRanges = Codegen.empty();
        this.layer4Configs = Codegen.empty();
        this.srcIpRanges = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> destIpRanges;
        private @Nullable Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs;
        private @Nullable Output<List<String>> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder destIpRanges(@Nullable Output<List<String>> destIpRanges) {
            this.destIpRanges = destIpRanges;
            return this;
        }
        public Builder destIpRanges(@Nullable List<String> destIpRanges) {
            this.destIpRanges = Codegen.ofNullable(destIpRanges);
            return this;
        }
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }
        public Builder layer4Configs(@Nullable Output<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs) {
            this.layer4Configs = layer4Configs;
            return this;
        }
        public Builder layer4Configs(@Nullable List<FirewallPolicyRuleMatcherLayer4ConfigArgs> layer4Configs) {
            this.layer4Configs = Codegen.ofNullable(layer4Configs);
            return this;
        }
        public Builder layer4Configs(FirewallPolicyRuleMatcherLayer4ConfigArgs... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }
        public Builder srcIpRanges(@Nullable Output<List<String>> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }
        public Builder srcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = Codegen.ofNullable(srcIpRanges);
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }        public FirewallPolicyRuleMatcherArgs build() {
            return new FirewallPolicyRuleMatcherArgs(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
