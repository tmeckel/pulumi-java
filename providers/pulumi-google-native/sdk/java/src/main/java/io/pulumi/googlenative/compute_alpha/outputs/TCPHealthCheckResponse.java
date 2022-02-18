// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TCPHealthCheckResponse {
    /**
     * The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
     * 
     */
    private final Integer port;
    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    private final String portName;
    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, TCP health check follows behavior specified in port and portName fields.
     * 
     */
    private final String portSpecification;
    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    private final String proxyHeader;
    /**
     * The application data to send once the TCP connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
     * 
     */
    private final String request;
    /**
     * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
     * 
     */
    private final String response;

    @OutputCustomType.Constructor({"port","portName","portSpecification","proxyHeader","request","response"})
    private TCPHealthCheckResponse(
        Integer port,
        String portName,
        String portSpecification,
        String proxyHeader,
        String request,
        String response) {
        this.port = Objects.requireNonNull(port);
        this.portName = Objects.requireNonNull(portName);
        this.portSpecification = Objects.requireNonNull(portSpecification);
        this.proxyHeader = Objects.requireNonNull(proxyHeader);
        this.request = Objects.requireNonNull(request);
        this.response = Objects.requireNonNull(response);
    }

    /**
     * The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535.
     * 
     */
    public Integer getPort() {
        return this.port;
    }
    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    public String getPortName() {
        return this.portName;
    }
    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, TCP health check follows behavior specified in port and portName fields.
     * 
     */
    public String getPortSpecification() {
        return this.portSpecification;
    }
    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    public String getProxyHeader() {
        return this.proxyHeader;
    }
    /**
     * The application data to send once the TCP connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
     * 
     */
    public String getRequest() {
        return this.request;
    }
    /**
     * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
     * 
     */
    public String getResponse() {
        return this.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TCPHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String portName;
        private String portSpecification;
        private String proxyHeader;
        private String request;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(TCPHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPortName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }

        public Builder setPortSpecification(String portSpecification) {
            this.portSpecification = Objects.requireNonNull(portSpecification);
            return this;
        }

        public Builder setProxyHeader(String proxyHeader) {
            this.proxyHeader = Objects.requireNonNull(proxyHeader);
            return this;
        }

        public Builder setRequest(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }

        public Builder setResponse(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }

        public TCPHealthCheckResponse build() {
            return new TCPHealthCheckResponse(port, portName, portSpecification, proxyHeader, request, response);
        }
    }
}
