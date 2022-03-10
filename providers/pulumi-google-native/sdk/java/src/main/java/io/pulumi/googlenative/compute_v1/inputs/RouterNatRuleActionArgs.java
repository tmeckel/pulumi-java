// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterNatRuleActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatRuleActionArgs Empty = new RouterNatRuleActionArgs();

    /**
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * 
     */
    @InputImport(name="sourceNatActiveIps")
      private final @Nullable Input<List<String>> sourceNatActiveIps;

    public Input<List<String>> getSourceNatActiveIps() {
        return this.sourceNatActiveIps == null ? Input.empty() : this.sourceNatActiveIps;
    }

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * 
     */
    @InputImport(name="sourceNatDrainIps")
      private final @Nullable Input<List<String>> sourceNatDrainIps;

    public Input<List<String>> getSourceNatDrainIps() {
        return this.sourceNatDrainIps == null ? Input.empty() : this.sourceNatDrainIps;
    }

    public RouterNatRuleActionArgs(
        @Nullable Input<List<String>> sourceNatActiveIps,
        @Nullable Input<List<String>> sourceNatDrainIps) {
        this.sourceNatActiveIps = sourceNatActiveIps;
        this.sourceNatDrainIps = sourceNatDrainIps;
    }

    private RouterNatRuleActionArgs() {
        this.sourceNatActiveIps = Input.empty();
        this.sourceNatDrainIps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> sourceNatActiveIps;
        private @Nullable Input<List<String>> sourceNatDrainIps;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceNatActiveIps = defaults.sourceNatActiveIps;
    	      this.sourceNatDrainIps = defaults.sourceNatDrainIps;
        }

        public Builder sourceNatActiveIps(@Nullable Input<List<String>> sourceNatActiveIps) {
            this.sourceNatActiveIps = sourceNatActiveIps;
            return this;
        }

        public Builder sourceNatActiveIps(@Nullable List<String> sourceNatActiveIps) {
            this.sourceNatActiveIps = Input.ofNullable(sourceNatActiveIps);
            return this;
        }

        public Builder sourceNatDrainIps(@Nullable Input<List<String>> sourceNatDrainIps) {
            this.sourceNatDrainIps = sourceNatDrainIps;
            return this;
        }

        public Builder sourceNatDrainIps(@Nullable List<String> sourceNatDrainIps) {
            this.sourceNatDrainIps = Input.ofNullable(sourceNatDrainIps);
            return this;
        }
        public RouterNatRuleActionArgs build() {
            return new RouterNatRuleActionArgs(sourceNatActiveIps, sourceNatDrainIps);
        }
    }
}
