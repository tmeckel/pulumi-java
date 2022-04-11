// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyPeerArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyPortArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
 * 
 */
public final class NetworkPolicyIngressRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyIngressRuleArgs Empty = new NetworkPolicyIngressRuleArgs();

    /**
     * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     * 
     */
    @Import(name="from")
      private final @Nullable Output<List<NetworkPolicyPeerArgs>> from;

    public Output<List<NetworkPolicyPeerArgs>> getFrom() {
        return this.from == null ? Codegen.empty() : this.from;
    }

    /**
     * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<NetworkPolicyPortArgs>> ports;

    public Output<List<NetworkPolicyPortArgs>> getPorts() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    public NetworkPolicyIngressRuleArgs(
        @Nullable Output<List<NetworkPolicyPeerArgs>> from,
        @Nullable Output<List<NetworkPolicyPortArgs>> ports) {
        this.from = from;
        this.ports = ports;
    }

    private NetworkPolicyIngressRuleArgs() {
        this.from = Codegen.empty();
        this.ports = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyIngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NetworkPolicyPeerArgs>> from;
        private @Nullable Output<List<NetworkPolicyPortArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyIngressRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.ports = defaults.ports;
        }

        public Builder from(@Nullable Output<List<NetworkPolicyPeerArgs>> from) {
            this.from = from;
            return this;
        }
        public Builder from(@Nullable List<NetworkPolicyPeerArgs> from) {
            this.from = Codegen.ofNullable(from);
            return this;
        }
        public Builder from(NetworkPolicyPeerArgs... from) {
            return from(List.of(from));
        }
        public Builder ports(@Nullable Output<List<NetworkPolicyPortArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<NetworkPolicyPortArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(NetworkPolicyPortArgs... ports) {
            return ports(List.of(ports));
        }        public NetworkPolicyIngressRuleArgs build() {
            return new NetworkPolicyIngressRuleArgs(from, ports);
        }
    }
}
