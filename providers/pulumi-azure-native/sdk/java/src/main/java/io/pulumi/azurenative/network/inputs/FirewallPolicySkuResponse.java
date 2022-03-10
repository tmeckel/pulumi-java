// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU of Firewall policy.
 * 
 */
public final class FirewallPolicySkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicySkuResponse Empty = new FirewallPolicySkuResponse();

    /**
     * Tier of Firewall Policy.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public FirewallPolicySkuResponse(@Nullable String tier) {
        this.tier = tier;
    }

    private FirewallPolicySkuResponse() {
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicySkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicySkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tier = defaults.tier;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public FirewallPolicySkuResponse build() {
            return new FirewallPolicySkuResponse(tier);
        }
    }
}
