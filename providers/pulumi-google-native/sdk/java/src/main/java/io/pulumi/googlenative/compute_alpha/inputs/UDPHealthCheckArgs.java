// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UDPHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final UDPHealthCheckArgs Empty = new UDPHealthCheckArgs();

    /**
     * The UDP port number for the health check request. Valid values are 1 through 65535.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    @InputImport(name="portName")
    private final @Nullable Input<String> portName;

    public Input<String> getPortName() {
        return this.portName == null ? Input.empty() : this.portName;
    }

    /**
     * Raw data of request to send in payload of UDP packet. It is an error if this is empty. The request data can only be ASCII.
     * 
     */
    @InputImport(name="request")
    private final @Nullable Input<String> request;

    public Input<String> getRequest() {
        return this.request == null ? Input.empty() : this.request;
    }

    /**
     * The bytes to match against the beginning of the response data. It is an error if this is empty. The response data can only be ASCII.
     * 
     */
    @InputImport(name="response")
    private final @Nullable Input<String> response;

    public Input<String> getResponse() {
        return this.response == null ? Input.empty() : this.response;
    }

    public UDPHealthCheckArgs(
        @Nullable Input<Integer> port,
        @Nullable Input<String> portName,
        @Nullable Input<String> request,
        @Nullable Input<String> response) {
        this.port = port;
        this.portName = portName;
        this.request = request;
        this.response = response;
    }

    private UDPHealthCheckArgs() {
        this.port = Input.empty();
        this.portName = Input.empty();
        this.request = Input.empty();
        this.response = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UDPHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> portName;
        private @Nullable Input<String> request;
        private @Nullable Input<String> response;

        public Builder() {
    	      // Empty
        }

        public Builder(UDPHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setPortName(@Nullable Input<String> portName) {
            this.portName = portName;
            return this;
        }

        public Builder setPortName(@Nullable String portName) {
            this.portName = Input.ofNullable(portName);
            return this;
        }

        public Builder setRequest(@Nullable Input<String> request) {
            this.request = request;
            return this;
        }

        public Builder setRequest(@Nullable String request) {
            this.request = Input.ofNullable(request);
            return this;
        }

        public Builder setResponse(@Nullable Input<String> response) {
            this.response = response;
            return this;
        }

        public Builder setResponse(@Nullable String response) {
            this.response = Input.ofNullable(response);
            return this;
        }

        public UDPHealthCheckArgs build() {
            return new UDPHealthCheckArgs(port, portName, request, response);
        }
    }
}
