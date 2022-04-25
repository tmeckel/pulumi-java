// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.enums.ProbeProtocol;
import com.pulumi.azurenative.servicefabric.enums.Protocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a load balancing rule.
 * 
 */
public final class LoadBalancingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancingRuleArgs Empty = new LoadBalancingRuleArgs();

    /**
     * The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     * 
     */
    @Import(name="backendPort", required=true)
    private Output<Integer> backendPort;

    /**
     * @return The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     * 
     */
    public Output<Integer> backendPort() {
        return this.backendPort;
    }

    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 1 and 65534.
     * 
     */
    @Import(name="frontendPort", required=true)
    private Output<Integer> frontendPort;

    /**
     * @return The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 1 and 65534.
     * 
     */
    public Output<Integer> frontendPort() {
        return this.frontendPort;
    }

    /**
     * the reference to the load balancer probe used by the load balancing rule.
     * 
     */
    @Import(name="probeProtocol", required=true)
    private Output<Either<String,ProbeProtocol>> probeProtocol;

    /**
     * @return the reference to the load balancer probe used by the load balancing rule.
     * 
     */
    public Output<Either<String,ProbeProtocol>> probeProtocol() {
        return this.probeProtocol;
    }

    /**
     * The probe request path. Only supported for HTTP/HTTPS probes.
     * 
     */
    @Import(name="probeRequestPath")
    private @Nullable Output<String> probeRequestPath;

    /**
     * @return The probe request path. Only supported for HTTP/HTTPS probes.
     * 
     */
    public Optional<Output<String>> probeRequestPath() {
        return Optional.ofNullable(this.probeRequestPath);
    }

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<Either<String,Protocol>> protocol;

    /**
     * @return The reference to the transport protocol used by the load balancing rule.
     * 
     */
    public Output<Either<String,Protocol>> protocol() {
        return this.protocol;
    }

    private LoadBalancingRuleArgs() {}

    private LoadBalancingRuleArgs(LoadBalancingRuleArgs $) {
        this.backendPort = $.backendPort;
        this.frontendPort = $.frontendPort;
        this.probeProtocol = $.probeProtocol;
        this.probeRequestPath = $.probeRequestPath;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancingRuleArgs $;

        public Builder() {
            $ = new LoadBalancingRuleArgs();
        }

        public Builder(LoadBalancingRuleArgs defaults) {
            $ = new LoadBalancingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendPort The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Output<Integer> backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        /**
         * @param backendPort The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Integer backendPort) {
            return backendPort(Output.of(backendPort));
        }

        /**
         * @param frontendPort The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 1 and 65534.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(Output<Integer> frontendPort) {
            $.frontendPort = frontendPort;
            return this;
        }

        /**
         * @param frontendPort The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 1 and 65534.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(Integer frontendPort) {
            return frontendPort(Output.of(frontendPort));
        }

        /**
         * @param probeProtocol the reference to the load balancer probe used by the load balancing rule.
         * 
         * @return builder
         * 
         */
        public Builder probeProtocol(Output<Either<String,ProbeProtocol>> probeProtocol) {
            $.probeProtocol = probeProtocol;
            return this;
        }

        /**
         * @param probeProtocol the reference to the load balancer probe used by the load balancing rule.
         * 
         * @return builder
         * 
         */
        public Builder probeProtocol(Either<String,ProbeProtocol> probeProtocol) {
            return probeProtocol(Output.of(probeProtocol));
        }

        /**
         * @param probeProtocol the reference to the load balancer probe used by the load balancing rule.
         * 
         * @return builder
         * 
         */
        public Builder probeProtocol(String probeProtocol) {
            return probeProtocol(Either.ofLeft(probeProtocol));
        }

        /**
         * @param probeProtocol the reference to the load balancer probe used by the load balancing rule.
         * 
         * @return builder
         * 
         */
        public Builder probeProtocol(ProbeProtocol probeProtocol) {
            return probeProtocol(Either.ofRight(probeProtocol));
        }

        /**
         * @param probeRequestPath The probe request path. Only supported for HTTP/HTTPS probes.
         * 
         * @return builder
         * 
         */
        public Builder probeRequestPath(@Nullable Output<String> probeRequestPath) {
            $.probeRequestPath = probeRequestPath;
            return this;
        }

        /**
         * @param probeRequestPath The probe request path. Only supported for HTTP/HTTPS probes.
         * 
         * @return builder
         * 
         */
        public Builder probeRequestPath(String probeRequestPath) {
            return probeRequestPath(Output.of(probeRequestPath));
        }

        /**
         * @param protocol The reference to the transport protocol used by the load balancing rule.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<Either<String,Protocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The reference to the transport protocol used by the load balancing rule.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Either<String,Protocol> protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param protocol The reference to the transport protocol used by the load balancing rule.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        /**
         * @param protocol The reference to the transport protocol used by the load balancing rule.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Protocol protocol) {
            return protocol(Either.ofRight(protocol));
        }

        public LoadBalancingRuleArgs build() {
            $.backendPort = Objects.requireNonNull($.backendPort, "expected parameter 'backendPort' to be non-null");
            $.frontendPort = Objects.requireNonNull($.frontendPort, "expected parameter 'frontendPort' to be non-null");
            $.probeProtocol = Objects.requireNonNull($.probeProtocol, "expected parameter 'probeProtocol' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
