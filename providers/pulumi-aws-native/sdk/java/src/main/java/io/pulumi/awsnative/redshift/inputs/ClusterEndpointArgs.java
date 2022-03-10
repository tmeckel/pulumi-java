// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEndpointArgs Empty = new ClusterEndpointArgs();

    @InputImport(name="address")
      private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    @InputImport(name="port")
      private final @Nullable Input<String> port;

    public Input<String> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public ClusterEndpointArgs(
        @Nullable Input<String> address,
        @Nullable Input<String> port) {
        this.address = address;
        this.port = port;
    }

    private ClusterEndpointArgs() {
        this.address = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<String> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
        }

        public Builder address(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder address(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder port(@Nullable Input<String> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable String port) {
            this.port = Input.ofNullable(port);
            return this;
        }
        public ClusterEndpointArgs build() {
            return new ClusterEndpointArgs(address, port);
        }
    }
}
