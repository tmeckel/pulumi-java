// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FirewallSubnetMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallSubnetMappingArgs Empty = new FirewallSubnetMappingArgs();

    /**
     * A SubnetId.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    public FirewallSubnetMappingArgs(Output<String> subnetId) {
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private FirewallSubnetMappingArgs() {
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallSubnetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallSubnetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }        public FirewallSubnetMappingArgs build() {
            return new FirewallSubnetMappingArgs(subnetId);
        }
    }
}
