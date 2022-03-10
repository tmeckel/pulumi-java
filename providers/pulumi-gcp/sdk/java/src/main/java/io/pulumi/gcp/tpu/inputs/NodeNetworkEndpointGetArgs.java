// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tpu.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeNetworkEndpointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeNetworkEndpointGetArgs Empty = new NodeNetworkEndpointGetArgs();

    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public NodeNetworkEndpointGetArgs(
        @Nullable Input<String> ipAddress,
        @Nullable Input<Integer> port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    private NodeNetworkEndpointGetArgs() {
        this.ipAddress = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeNetworkEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeNetworkEndpointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
        }

        public Builder ipAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder port(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }
        public NodeNetworkEndpointGetArgs build() {
            return new NodeNetworkEndpointGetArgs(ipAddress, port);
        }
    }
}
