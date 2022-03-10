// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1beta2.inputs.ManagedZoneForwardingConfigNameServerTargetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneForwardingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigArgs Empty = new ManagedZoneForwardingConfigArgs();

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * List of target name servers to forward to. Cloud DNS selects the best available name server if more than one target is given.
     * 
     */
    @InputImport(name="targetNameServers")
      private final @Nullable Input<List<ManagedZoneForwardingConfigNameServerTargetArgs>> targetNameServers;

    public Input<List<ManagedZoneForwardingConfigNameServerTargetArgs>> getTargetNameServers() {
        return this.targetNameServers == null ? Input.empty() : this.targetNameServers;
    }

    public ManagedZoneForwardingConfigArgs(
        @Nullable Input<String> kind,
        @Nullable Input<List<ManagedZoneForwardingConfigNameServerTargetArgs>> targetNameServers) {
        this.kind = kind;
        this.targetNameServers = targetNameServers;
    }

    private ManagedZoneForwardingConfigArgs() {
        this.kind = Input.empty();
        this.targetNameServers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private @Nullable Input<List<ManagedZoneForwardingConfigNameServerTargetArgs>> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder targetNameServers(@Nullable Input<List<ManagedZoneForwardingConfigNameServerTargetArgs>> targetNameServers) {
            this.targetNameServers = targetNameServers;
            return this;
        }

        public Builder targetNameServers(@Nullable List<ManagedZoneForwardingConfigNameServerTargetArgs> targetNameServers) {
            this.targetNameServers = Input.ofNullable(targetNameServers);
            return this;
        }
        public ManagedZoneForwardingConfigArgs build() {
            return new ManagedZoneForwardingConfigArgs(kind, targetNameServers);
        }
    }
}
