// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckGrpcHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckGrpcHealthCheckArgs Empty = new HealthCheckGrpcHealthCheckArgs();

    /**
     * The gRPC service name for the health check.
     * The value of grpcServiceName has the following meanings by convention:
     * - Empty serviceName means the overall status of all services at the backend.
     * - Non-empty serviceName means the health of that gRPC service, as defined by the owner of the service.
     *   The grpcServiceName can only be ASCII.
     * 
     */
    @Import(name="grpcServiceName")
      private final @Nullable Output<String> grpcServiceName;

    public Output<String> getGrpcServiceName() {
        return this.grpcServiceName == null ? Codegen.empty() : this.grpcServiceName;
    }

    /**
     * The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    @Import(name="portName")
      private final @Nullable Output<String> portName;

    public Output<String> getPortName() {
        return this.portName == null ? Codegen.empty() : this.portName;
    }

    /**
     * Specifies how port is selected for health checking, can be one of the
     * following values:
     * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
     * * `USE_NAMED_PORT`: The `portName` is used for health checking.
     * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
     *   network endpoint is used for health checking. For other backends, the
     *   port or named port specified in the Backend Service is used for health
     *   checking.
     *   If not specified, gRPC health check follows behavior specified in `port` and
     *   `portName` fields.
     *   Possible values are `USE_FIXED_PORT`, `USE_NAMED_PORT`, and `USE_SERVING_PORT`.
     * 
     */
    @Import(name="portSpecification")
      private final @Nullable Output<String> portSpecification;

    public Output<String> getPortSpecification() {
        return this.portSpecification == null ? Codegen.empty() : this.portSpecification;
    }

    public HealthCheckGrpcHealthCheckArgs(
        @Nullable Output<String> grpcServiceName,
        @Nullable Output<Integer> port,
        @Nullable Output<String> portName,
        @Nullable Output<String> portSpecification) {
        this.grpcServiceName = grpcServiceName;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
    }

    private HealthCheckGrpcHealthCheckArgs() {
        this.grpcServiceName = Codegen.empty();
        this.port = Codegen.empty();
        this.portName = Codegen.empty();
        this.portSpecification = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckGrpcHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> grpcServiceName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> portName;
        private @Nullable Output<String> portSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckGrpcHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcServiceName = defaults.grpcServiceName;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
        }

        public Builder grpcServiceName(@Nullable Output<String> grpcServiceName) {
            this.grpcServiceName = grpcServiceName;
            return this;
        }
        public Builder grpcServiceName(@Nullable String grpcServiceName) {
            this.grpcServiceName = Codegen.ofNullable(grpcServiceName);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder portName(@Nullable Output<String> portName) {
            this.portName = portName;
            return this;
        }
        public Builder portName(@Nullable String portName) {
            this.portName = Codegen.ofNullable(portName);
            return this;
        }
        public Builder portSpecification(@Nullable Output<String> portSpecification) {
            this.portSpecification = portSpecification;
            return this;
        }
        public Builder portSpecification(@Nullable String portSpecification) {
            this.portSpecification = Codegen.ofNullable(portSpecification);
            return this;
        }        public HealthCheckGrpcHealthCheckArgs build() {
            return new HealthCheckGrpcHealthCheckArgs(grpcServiceName, port, portName, portSpecification);
        }
    }
}
