// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.LoadBalancerOutboundRuleProtocol;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Outbound rule of the load balancer.
 * 
 */
public final class OutboundRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutboundRuleArgs Empty = new OutboundRuleArgs();

    /**
     * The number of outbound ports to be used for NAT.
     * 
     */
    @Import(name="allocatedOutboundPorts")
    private @Nullable Output<Integer> allocatedOutboundPorts;

    /**
     * @return The number of outbound ports to be used for NAT.
     * 
     */
    public Optional<Output<Integer>> allocatedOutboundPorts() {
        return Optional.ofNullable(this.allocatedOutboundPorts);
    }

    /**
     * A reference to a pool of DIPs. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    @Import(name="backendAddressPool", required=true)
    private Output<SubResourceArgs> backendAddressPool;

    /**
     * @return A reference to a pool of DIPs. Outbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    public Output<SubResourceArgs> backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
    private @Nullable Output<Boolean> enableTcpReset;

    /**
     * @return Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    public Optional<Output<Boolean>> enableTcpReset() {
        return Optional.ofNullable(this.enableTcpReset);
    }

    /**
     * The Frontend IP addresses of the load balancer.
     * 
     */
    @Import(name="frontendIPConfigurations", required=true)
    private Output<List<SubResourceArgs>> frontendIPConfigurations;

    /**
     * @return The Frontend IP addresses of the load balancer.
     * 
     */
    public Output<List<SubResourceArgs>> frontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The timeout for the TCP idle connection.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    /**
     * @return The timeout for the TCP idle connection.
     * 
     */
    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The protocol for the outbound rule in load balancer.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol;

    /**
     * @return The protocol for the outbound rule in load balancer.
     * 
     */
    public Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol() {
        return this.protocol;
    }

    private OutboundRuleArgs() {}

    private OutboundRuleArgs(OutboundRuleArgs $) {
        this.allocatedOutboundPorts = $.allocatedOutboundPorts;
        this.backendAddressPool = $.backendAddressPool;
        this.enableTcpReset = $.enableTcpReset;
        this.frontendIPConfigurations = $.frontendIPConfigurations;
        this.id = $.id;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.name = $.name;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutboundRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutboundRuleArgs $;

        public Builder() {
            $ = new OutboundRuleArgs();
        }

        public Builder(OutboundRuleArgs defaults) {
            $ = new OutboundRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocatedOutboundPorts The number of outbound ports to be used for NAT.
         * 
         * @return builder
         * 
         */
        public Builder allocatedOutboundPorts(@Nullable Output<Integer> allocatedOutboundPorts) {
            $.allocatedOutboundPorts = allocatedOutboundPorts;
            return this;
        }

        /**
         * @param allocatedOutboundPorts The number of outbound ports to be used for NAT.
         * 
         * @return builder
         * 
         */
        public Builder allocatedOutboundPorts(Integer allocatedOutboundPorts) {
            return allocatedOutboundPorts(Output.of(allocatedOutboundPorts));
        }

        /**
         * @param backendAddressPool A reference to a pool of DIPs. Outbound traffic is randomly load balanced across IPs in the backend IPs.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPool(Output<SubResourceArgs> backendAddressPool) {
            $.backendAddressPool = backendAddressPool;
            return this;
        }

        /**
         * @param backendAddressPool A reference to a pool of DIPs. Outbound traffic is randomly load balanced across IPs in the backend IPs.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPool(SubResourceArgs backendAddressPool) {
            return backendAddressPool(Output.of(backendAddressPool));
        }

        /**
         * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder enableTcpReset(@Nullable Output<Boolean> enableTcpReset) {
            $.enableTcpReset = enableTcpReset;
            return this;
        }

        /**
         * @param enableTcpReset Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
         * 
         * @return builder
         * 
         */
        public Builder enableTcpReset(Boolean enableTcpReset) {
            return enableTcpReset(Output.of(enableTcpReset));
        }

        /**
         * @param frontendIPConfigurations The Frontend IP addresses of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder frontendIPConfigurations(Output<List<SubResourceArgs>> frontendIPConfigurations) {
            $.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        /**
         * @param frontendIPConfigurations The Frontend IP addresses of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder frontendIPConfigurations(List<SubResourceArgs> frontendIPConfigurations) {
            return frontendIPConfigurations(Output.of(frontendIPConfigurations));
        }

        /**
         * @param frontendIPConfigurations The Frontend IP addresses of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder frontendIPConfigurations(SubResourceArgs... frontendIPConfigurations) {
            return frontendIPConfigurations(List.of(frontendIPConfigurations));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param idleTimeoutInMinutes The timeout for the TCP idle connection.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        /**
         * @param idleTimeoutInMinutes The timeout for the TCP idle connection.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        /**
         * @param name The name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocol The protocol for the outbound rule in load balancer.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<Either<String,LoadBalancerOutboundRuleProtocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol for the outbound rule in load balancer.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Either<String,LoadBalancerOutboundRuleProtocol> protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param protocol The protocol for the outbound rule in load balancer.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        /**
         * @param protocol The protocol for the outbound rule in load balancer.
         * 
         * @return builder
         * 
         */
        public Builder protocol(LoadBalancerOutboundRuleProtocol protocol) {
            return protocol(Either.ofRight(protocol));
        }

        public OutboundRuleArgs build() {
            $.backendAddressPool = Objects.requireNonNull($.backendAddressPool, "expected parameter 'backendAddressPool' to be non-null");
            $.frontendIPConfigurations = Objects.requireNonNull($.frontendIPConfigurations, "expected parameter 'frontendIPConfigurations' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
