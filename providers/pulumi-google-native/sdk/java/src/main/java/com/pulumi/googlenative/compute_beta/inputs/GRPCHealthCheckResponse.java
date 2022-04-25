// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GRPCHealthCheckResponse extends com.pulumi.resources.InvokeArgs {

    public static final GRPCHealthCheckResponse Empty = new GRPCHealthCheckResponse();

    /**
     * The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
     * 
     */
    @Import(name="grpcServiceName", required=true)
    private String grpcServiceName;

    /**
     * @return The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
     * 
     */
    public String grpcServiceName() {
        return this.grpcServiceName;
    }

    /**
     * The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

    /**
     * @return The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
     * 
     */
    @Import(name="portName", required=true)
    private String portName;

    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
     * 
     */
    public String portName() {
        return this.portName;
    }

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
     * 
     */
    @Import(name="portSpecification", required=true)
    private String portSpecification;

    /**
     * @return Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
     * 
     */
    public String portSpecification() {
        return this.portSpecification;
    }

    private GRPCHealthCheckResponse() {}

    private GRPCHealthCheckResponse(GRPCHealthCheckResponse $) {
        this.grpcServiceName = $.grpcServiceName;
        this.port = $.port;
        this.portName = $.portName;
        this.portSpecification = $.portSpecification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GRPCHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GRPCHealthCheckResponse $;

        public Builder() {
            $ = new GRPCHealthCheckResponse();
        }

        public Builder(GRPCHealthCheckResponse defaults) {
            $ = new GRPCHealthCheckResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param grpcServiceName The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder grpcServiceName(String grpcServiceName) {
            $.grpcServiceName = grpcServiceName;
            return this;
        }

        /**
         * @param port The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        /**
         * @param portName Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder portName(String portName) {
            $.portName = portName;
            return this;
        }

        /**
         * @param portSpecification Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
         * 
         * @return builder
         * 
         */
        public Builder portSpecification(String portSpecification) {
            $.portSpecification = portSpecification;
            return this;
        }

        public GRPCHealthCheckResponse build() {
            $.grpcServiceName = Objects.requireNonNull($.grpcServiceName, "expected parameter 'grpcServiceName' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.portName = Objects.requireNonNull($.portName, "expected parameter 'portName' to be non-null");
            $.portSpecification = Objects.requireNonNull($.portSpecification, "expected parameter 'portSpecification' to be non-null");
            return $;
        }
    }

}
