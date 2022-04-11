// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.LoadBalancerOutboundRuleProtocol;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Outbound rule of the load balancer.
 * 
 */
public final class OutboundRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final OutboundRuleArgs Empty = new OutboundRuleArgs();

    /**
     * The number of outbound ports to be used for NAT.
     * 
     */
    @Import(name="allocatedOutboundPorts")
      private final @Nullable Output<Integer> allocatedOutboundPorts;

    public Output<Integer> getAllocatedOutboundPorts() {
        return this.allocatedOutboundPorts == null ? Codegen.empty() : this.allocatedOutboundPorts;
    }

    /**
     * A reference to a pool of DIPs. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    @Import(name="backendAddressPool", required=true)
      private final Output<SubResourceArgs> backendAddressPool;

    public Output<SubResourceArgs> getBackendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
      private final @Nullable Output<Boolean> enableTcpReset;

    public Output<Boolean> getEnableTcpReset() {
        return this.enableTcpReset == null ? Codegen.empty() : this.enableTcpReset;
    }

    /**
     * The Frontend IP addresses of the load balancer.
     * 
     */
    @Import(name="frontendIPConfigurations", required=true)
      private final Output<List<SubResourceArgs>> frontendIPConfigurations;

    public Output<List<SubResourceArgs>> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The timeout for the TCP idle connection.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
      private final @Nullable Output<Integer> idleTimeoutInMinutes;

    public Output<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Codegen.empty() : this.idleTimeoutInMinutes;
    }

    /**
     * The name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The protocol for the outbound rule in load balancer.
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol;

    public Output<Either<String,LoadBalancerOutboundRuleProtocol>> getProtocol() {
        return this.protocol;
    }

    public OutboundRuleArgs(
        @Nullable Output<Integer> allocatedOutboundPorts,
        Output<SubResourceArgs> backendAddressPool,
        @Nullable Output<Boolean> enableTcpReset,
        Output<List<SubResourceArgs>> frontendIPConfigurations,
        @Nullable Output<String> id,
        @Nullable Output<Integer> idleTimeoutInMinutes,
        @Nullable Output<String> name,
        Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        this.backendAddressPool = Objects.requireNonNull(backendAddressPool, "expected parameter 'backendAddressPool' to be non-null");
        this.enableTcpReset = enableTcpReset;
        this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations, "expected parameter 'frontendIPConfigurations' to be non-null");
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.name = name;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private OutboundRuleArgs() {
        this.allocatedOutboundPorts = Codegen.empty();
        this.backendAddressPool = Codegen.empty();
        this.enableTcpReset = Codegen.empty();
        this.frontendIPConfigurations = Codegen.empty();
        this.id = Codegen.empty();
        this.idleTimeoutInMinutes = Codegen.empty();
        this.name = Codegen.empty();
        this.protocol = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutboundRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> allocatedOutboundPorts;
        private Output<SubResourceArgs> backendAddressPool;
        private @Nullable Output<Boolean> enableTcpReset;
        private Output<List<SubResourceArgs>> frontendIPConfigurations;
        private @Nullable Output<String> id;
        private @Nullable Output<Integer> idleTimeoutInMinutes;
        private @Nullable Output<String> name;
        private Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(OutboundRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedOutboundPorts = defaults.allocatedOutboundPorts;
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder allocatedOutboundPorts(@Nullable Output<Integer> allocatedOutboundPorts) {
            this.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }
        public Builder allocatedOutboundPorts(@Nullable Integer allocatedOutboundPorts) {
            this.allocatedOutboundPorts = Codegen.ofNullable(allocatedOutboundPorts);
            return this;
        }
        public Builder backendAddressPool(Output<SubResourceArgs> backendAddressPool) {
            this.backendAddressPool = Objects.requireNonNull(backendAddressPool);
            return this;
        }
        public Builder backendAddressPool(SubResourceArgs backendAddressPool) {
            this.backendAddressPool = Output.of(Objects.requireNonNull(backendAddressPool));
            return this;
        }
        public Builder enableTcpReset(@Nullable Output<Boolean> enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }
        public Builder enableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = Codegen.ofNullable(enableTcpReset);
            return this;
        }
        public Builder frontendIPConfigurations(Output<List<SubResourceArgs>> frontendIPConfigurations) {
            this.frontendIPConfigurations = Objects.requireNonNull(frontendIPConfigurations);
            return this;
        }
        public Builder frontendIPConfigurations(List<SubResourceArgs> frontendIPConfigurations) {
            this.frontendIPConfigurations = Output.of(Objects.requireNonNull(frontendIPConfigurations));
            return this;
        }
        public Builder frontendIPConfigurations(SubResourceArgs... frontendIPConfigurations) {
            return frontendIPConfigurations(List.of(frontendIPConfigurations));
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Codegen.ofNullable(idleTimeoutInMinutes);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder protocol(Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(Either<String,LoadBalancerOutboundRuleProtocol> protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }        public OutboundRuleArgs build() {
            return new OutboundRuleArgs(allocatedOutboundPorts, backendAddressPool, enableTcpReset, frontendIPConfigurations, id, idleTimeoutInMinutes, name, protocol);
        }
    }
}
