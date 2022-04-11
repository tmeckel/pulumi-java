// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.enums.HTTPSHealthCheckPortSpecification;
import io.pulumi.googlenative.compute_beta.enums.HTTPSHealthCheckProxyHeader;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HTTPSHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HTTPSHealthCheckArgs Empty = new HTTPSHealthCheckArgs();

    /**
     * The value of the host header in the HTTPS health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Codegen.empty() : this.host;
    }

    /**
     * The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    @Import(name="portName")
      private final @Nullable Output<String> portName;

    public Output<String> getPortName() {
        return this.portName == null ? Codegen.empty() : this.portName;
    }

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, HTTPS health check follows behavior specified in port and portName fields.
     * 
     */
    @Import(name="portSpecification")
      private final @Nullable Output<HTTPSHealthCheckPortSpecification> portSpecification;

    public Output<HTTPSHealthCheckPortSpecification> getPortSpecification() {
        return this.portSpecification == null ? Codegen.empty() : this.portSpecification;
    }

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @Import(name="proxyHeader")
      private final @Nullable Output<HTTPSHealthCheckProxyHeader> proxyHeader;

    public Output<HTTPSHealthCheckProxyHeader> getProxyHeader() {
        return this.proxyHeader == null ? Codegen.empty() : this.proxyHeader;
    }

    /**
     * The request path of the HTTPS health check request. The default value is /.
     * 
     */
    @Import(name="requestPath")
      private final @Nullable Output<String> requestPath;

    public Output<String> getRequestPath() {
        return this.requestPath == null ? Codegen.empty() : this.requestPath;
    }

    /**
     * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
     * 
     */
    @Import(name="response")
      private final @Nullable Output<String> response;

    public Output<String> getResponse() {
        return this.response == null ? Codegen.empty() : this.response;
    }

    public HTTPSHealthCheckArgs(
        @Nullable Output<String> host,
        @Nullable Output<Integer> port,
        @Nullable Output<String> portName,
        @Nullable Output<HTTPSHealthCheckPortSpecification> portSpecification,
        @Nullable Output<HTTPSHealthCheckProxyHeader> proxyHeader,
        @Nullable Output<String> requestPath,
        @Nullable Output<String> response) {
        this.host = host;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
        this.proxyHeader = proxyHeader;
        this.requestPath = requestPath;
        this.response = response;
    }

    private HTTPSHealthCheckArgs() {
        this.host = Codegen.empty();
        this.port = Codegen.empty();
        this.portName = Codegen.empty();
        this.portSpecification = Codegen.empty();
        this.proxyHeader = Codegen.empty();
        this.requestPath = Codegen.empty();
        this.response = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPSHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> host;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> portName;
        private @Nullable Output<HTTPSHealthCheckPortSpecification> portSpecification;
        private @Nullable Output<HTTPSHealthCheckProxyHeader> proxyHeader;
        private @Nullable Output<String> requestPath;
        private @Nullable Output<String> response;

        public Builder() {
    	      // Empty
        }

        public Builder(HTTPSHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestPath = defaults.requestPath;
    	      this.response = defaults.response;
        }

        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Codegen.ofNullable(host);
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
        public Builder portSpecification(@Nullable Output<HTTPSHealthCheckPortSpecification> portSpecification) {
            this.portSpecification = portSpecification;
            return this;
        }
        public Builder portSpecification(@Nullable HTTPSHealthCheckPortSpecification portSpecification) {
            this.portSpecification = Codegen.ofNullable(portSpecification);
            return this;
        }
        public Builder proxyHeader(@Nullable Output<HTTPSHealthCheckProxyHeader> proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }
        public Builder proxyHeader(@Nullable HTTPSHealthCheckProxyHeader proxyHeader) {
            this.proxyHeader = Codegen.ofNullable(proxyHeader);
            return this;
        }
        public Builder requestPath(@Nullable Output<String> requestPath) {
            this.requestPath = requestPath;
            return this;
        }
        public Builder requestPath(@Nullable String requestPath) {
            this.requestPath = Codegen.ofNullable(requestPath);
            return this;
        }
        public Builder response(@Nullable Output<String> response) {
            this.response = response;
            return this;
        }
        public Builder response(@Nullable String response) {
            this.response = Codegen.ofNullable(response);
            return this;
        }        public HTTPSHealthCheckArgs build() {
            return new HTTPSHealthCheckArgs(host, port, portName, portSpecification, proxyHeader, requestPath, response);
        }
    }
}
