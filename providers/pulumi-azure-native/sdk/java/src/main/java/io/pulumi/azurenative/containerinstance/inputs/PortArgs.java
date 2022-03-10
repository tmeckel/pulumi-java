// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.enums.ContainerGroupNetworkProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The port exposed on the container group.
 * 
 */
public final class PortArgs extends io.pulumi.resources.ResourceArgs {

    public static final PortArgs Empty = new PortArgs();

    /**
     * The port number.
     * 
     */
    @InputImport(name="port", required=true)
      private final Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port;
    }

    /**
     * The protocol associated with the port.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<Either<String,ContainerGroupNetworkProtocol>> protocol;

    public Input<Either<String,ContainerGroupNetworkProtocol>> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public PortArgs(
        Input<Integer> port,
        @Nullable Input<Either<String,ContainerGroupNetworkProtocol>> protocol) {
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = protocol;
    }

    private PortArgs() {
        this.port = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> port;
        private @Nullable Input<Either<String,ContainerGroupNetworkProtocol>> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(PortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }

        public Builder protocol(@Nullable Input<Either<String,ContainerGroupNetworkProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable Either<String,ContainerGroupNetworkProtocol> protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }
        public PortArgs build() {
            return new PortArgs(port, protocol);
        }
    }
}
