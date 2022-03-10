// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigTargetNameServerGetArgs;
import java.util.List;
import java.util.Objects;


public final class ManagedZoneForwardingConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigGetArgs Empty = new ManagedZoneForwardingConfigGetArgs();

    /**
     * List of target name servers to forward to. Cloud DNS will
     * select the best available name server if more than
     * one target is given.
     * Structure is documented below.
     * 
     */
    @InputImport(name="targetNameServers", required=true)
      private final Input<List<ManagedZoneForwardingConfigTargetNameServerGetArgs>> targetNameServers;

    public Input<List<ManagedZoneForwardingConfigTargetNameServerGetArgs>> getTargetNameServers() {
        return this.targetNameServers;
    }

    public ManagedZoneForwardingConfigGetArgs(Input<List<ManagedZoneForwardingConfigTargetNameServerGetArgs>> targetNameServers) {
        this.targetNameServers = Objects.requireNonNull(targetNameServers, "expected parameter 'targetNameServers' to be non-null");
    }

    private ManagedZoneForwardingConfigGetArgs() {
        this.targetNameServers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ManagedZoneForwardingConfigTargetNameServerGetArgs>> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder targetNameServers(Input<List<ManagedZoneForwardingConfigTargetNameServerGetArgs>> targetNameServers) {
            this.targetNameServers = Objects.requireNonNull(targetNameServers);
            return this;
        }

        public Builder targetNameServers(List<ManagedZoneForwardingConfigTargetNameServerGetArgs> targetNameServers) {
            this.targetNameServers = Input.of(Objects.requireNonNull(targetNameServers));
            return this;
        }
        public ManagedZoneForwardingConfigGetArgs build() {
            return new ManagedZoneForwardingConfigGetArgs(targetNameServers);
        }
    }
}
