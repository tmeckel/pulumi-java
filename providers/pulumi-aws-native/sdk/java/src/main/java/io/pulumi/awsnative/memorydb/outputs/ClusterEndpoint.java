// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterEndpoint {
    /**
     * The DNS address of the primary read-write node.
     * 
     */
    private final @Nullable String address;
    /**
     * The port number that the engine is listening on.
     * 
     */
    private final @Nullable Integer port;

    @OutputCustomType.Constructor
    private ClusterEndpoint(
        @OutputCustomType.Parameter("address") @Nullable String address,
        @OutputCustomType.Parameter("port") @Nullable Integer port) {
        this.address = address;
        this.port = port;
    }

    /**
     * The DNS address of the primary read-write node.
     * 
    */
    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    /**
     * The port number that the engine is listening on.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public ClusterEndpoint build() {
            return new ClusterEndpoint(address, port);
        }
    }
}
