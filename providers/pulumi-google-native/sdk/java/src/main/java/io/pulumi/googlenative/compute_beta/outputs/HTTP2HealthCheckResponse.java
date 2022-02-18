// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HTTP2HealthCheckResponse {
    /**
     * The value of the host header in the HTTP/2 health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    private final String host;
    /**
     * The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
     * 
     */
    private final Integer port;
    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    private final String portName;
    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP2 health check follows behavior specified in port and portName fields.
     * 
     */
    private final String portSpecification;
    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    private final String proxyHeader;
    /**
     * The request path of the HTTP/2 health check request. The default value is /.
     * 
     */
    private final String requestPath;
    /**
     * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    private final String response;

    @OutputCustomType.Constructor({"host","port","portName","portSpecification","proxyHeader","requestPath","response"})
    private HTTP2HealthCheckResponse(
        String host,
        Integer port,
        String portName,
        String portSpecification,
        String proxyHeader,
        String requestPath,
        String response) {
        this.host = Objects.requireNonNull(host);
        this.port = Objects.requireNonNull(port);
        this.portName = Objects.requireNonNull(portName);
        this.portSpecification = Objects.requireNonNull(portSpecification);
        this.proxyHeader = Objects.requireNonNull(proxyHeader);
        this.requestPath = Objects.requireNonNull(requestPath);
        this.response = Objects.requireNonNull(response);
    }

    /**
     * The value of the host header in the HTTP/2 health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    public String getHost() {
        return this.host;
    }
    /**
     * The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
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
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTP2 health check follows behavior specified in port and portName fields.
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
     * The request path of the HTTP/2 health check request. The default value is /.
     * 
     */
    public String getRequestPath() {
        return this.requestPath;
    }
    /**
     * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    public String getResponse() {
        return this.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTP2HealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private Integer port;
        private String portName;
        private String portSpecification;
        private String proxyHeader;
        private String requestPath;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTP2HealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestPath = defaults.requestPath;
    	      this.response = defaults.response;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
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

        public Builder setRequestPath(String requestPath) {
            this.requestPath = Objects.requireNonNull(requestPath);
            return this;
        }

        public Builder setResponse(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }

        public HTTP2HealthCheckResponse build() {
            return new HTTP2HealthCheckResponse(host, port, portName, portSpecification, proxyHeader, requestPath, response);
        }
    }
}
