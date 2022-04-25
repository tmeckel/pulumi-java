// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SSLHealthCheckResponse extends com.pulumi.resources.InvokeArgs {

    public static final SSLHealthCheckResponse Empty = new SSLHealthCheckResponse();

    /**
     * The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

    /**
     * @return The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    @Import(name="portName", required=true)
    private String portName;

    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    public String portName() {
        return this.portName;
    }

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, SSL health check follows behavior specified in port and portName fields.
     * 
     */
    @Import(name="portSpecification", required=true)
    private String portSpecification;

    /**
     * @return Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, SSL health check follows behavior specified in port and portName fields.
     * 
     */
    public String portSpecification() {
        return this.portSpecification;
    }

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @Import(name="proxyHeader", required=true)
    private String proxyHeader;

    /**
     * @return Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    public String proxyHeader() {
        return this.proxyHeader;
    }

    /**
     * The application data to send once the SSL connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
     * 
     */
    @Import(name="request", required=true)
    private String request;

    /**
     * @return The application data to send once the SSL connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
     * 
     */
    public String request() {
        return this.request;
    }

    /**
     * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
     * 
     */
    @Import(name="response", required=true)
    private String response;

    /**
     * @return The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
     * 
     */
    public String response() {
        return this.response;
    }

    private SSLHealthCheckResponse() {}

    private SSLHealthCheckResponse(SSLHealthCheckResponse $) {
        this.port = $.port;
        this.portName = $.portName;
        this.portSpecification = $.portSpecification;
        this.proxyHeader = $.proxyHeader;
        this.request = $.request;
        this.response = $.response;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SSLHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SSLHealthCheckResponse $;

        public Builder() {
            $ = new SSLHealthCheckResponse();
        }

        public Builder(SSLHealthCheckResponse defaults) {
            $ = new SSLHealthCheckResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        /**
         * @param portName Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder portName(String portName) {
            $.portName = portName;
            return this;
        }

        /**
         * @param portSpecification Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, SSL health check follows behavior specified in port and portName fields.
         * 
         * @return builder
         * 
         */
        public Builder portSpecification(String portSpecification) {
            $.portSpecification = portSpecification;
            return this;
        }

        /**
         * @param proxyHeader Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
         * 
         * @return builder
         * 
         */
        public Builder proxyHeader(String proxyHeader) {
            $.proxyHeader = proxyHeader;
            return this;
        }

        /**
         * @param request The application data to send once the SSL connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will indicate health. The request data can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder request(String request) {
            $.request = request;
            return this;
        }

        /**
         * @param response The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder response(String response) {
            $.response = response;
            return this;
        }

        public SSLHealthCheckResponse build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.portName = Objects.requireNonNull($.portName, "expected parameter 'portName' to be non-null");
            $.portSpecification = Objects.requireNonNull($.portSpecification, "expected parameter 'portSpecification' to be non-null");
            $.proxyHeader = Objects.requireNonNull($.proxyHeader, "expected parameter 'proxyHeader' to be non-null");
            $.request = Objects.requireNonNull($.request, "expected parameter 'request' to be non-null");
            $.response = Objects.requireNonNull($.response, "expected parameter 'response' to be non-null");
            return $;
        }
    }

}
