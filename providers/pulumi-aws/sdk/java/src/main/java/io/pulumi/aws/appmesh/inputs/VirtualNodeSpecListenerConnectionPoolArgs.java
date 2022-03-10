// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolGrpcArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolHttp2Args;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolHttpArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolTcpArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerConnectionPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolArgs Empty = new VirtualNodeSpecListenerConnectionPoolArgs();

    /**
     * Connection pool information for gRPC listeners.
     * 
     */
    @InputImport(name="grpc")
      private final @Nullable Input<VirtualNodeSpecListenerConnectionPoolGrpcArgs> grpc;

    public Input<VirtualNodeSpecListenerConnectionPoolGrpcArgs> getGrpc() {
        return this.grpc == null ? Input.empty() : this.grpc;
    }

    /**
     * Connection pool information for HTTP listeners.
     * 
     */
    @InputImport(name="http")
      private final @Nullable Input<VirtualNodeSpecListenerConnectionPoolHttpArgs> http;

    public Input<VirtualNodeSpecListenerConnectionPoolHttpArgs> getHttp() {
        return this.http == null ? Input.empty() : this.http;
    }

    /**
     * Connection pool information for HTTP2 listeners.
     * 
     */
    @InputImport(name="http2")
      private final @Nullable Input<VirtualNodeSpecListenerConnectionPoolHttp2Args> http2;

    public Input<VirtualNodeSpecListenerConnectionPoolHttp2Args> getHttp2() {
        return this.http2 == null ? Input.empty() : this.http2;
    }

    /**
     * Connection pool information for TCP listeners.
     * 
     */
    @InputImport(name="tcp")
      private final @Nullable Input<VirtualNodeSpecListenerConnectionPoolTcpArgs> tcp;

    public Input<VirtualNodeSpecListenerConnectionPoolTcpArgs> getTcp() {
        return this.tcp == null ? Input.empty() : this.tcp;
    }

    public VirtualNodeSpecListenerConnectionPoolArgs(
        @Nullable Input<VirtualNodeSpecListenerConnectionPoolGrpcArgs> grpc,
        @Nullable Input<VirtualNodeSpecListenerConnectionPoolHttpArgs> http,
        @Nullable Input<VirtualNodeSpecListenerConnectionPoolHttp2Args> http2,
        @Nullable Input<VirtualNodeSpecListenerConnectionPoolTcpArgs> tcp) {
        this.grpc = grpc;
        this.http = http;
        this.http2 = http2;
        this.tcp = tcp;
    }

    private VirtualNodeSpecListenerConnectionPoolArgs() {
        this.grpc = Input.empty();
        this.http = Input.empty();
        this.http2 = Input.empty();
        this.tcp = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecListenerConnectionPoolGrpcArgs> grpc;
        private @Nullable Input<VirtualNodeSpecListenerConnectionPoolHttpArgs> http;
        private @Nullable Input<VirtualNodeSpecListenerConnectionPoolHttp2Args> http2;
        private @Nullable Input<VirtualNodeSpecListenerConnectionPoolTcpArgs> tcp;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpc = defaults.grpc;
    	      this.http = defaults.http;
    	      this.http2 = defaults.http2;
    	      this.tcp = defaults.tcp;
        }

        public Builder grpc(@Nullable Input<VirtualNodeSpecListenerConnectionPoolGrpcArgs> grpc) {
            this.grpc = grpc;
            return this;
        }

        public Builder grpc(@Nullable VirtualNodeSpecListenerConnectionPoolGrpcArgs grpc) {
            this.grpc = Input.ofNullable(grpc);
            return this;
        }

        public Builder http(@Nullable Input<VirtualNodeSpecListenerConnectionPoolHttpArgs> http) {
            this.http = http;
            return this;
        }

        public Builder http(@Nullable VirtualNodeSpecListenerConnectionPoolHttpArgs http) {
            this.http = Input.ofNullable(http);
            return this;
        }

        public Builder http2(@Nullable Input<VirtualNodeSpecListenerConnectionPoolHttp2Args> http2) {
            this.http2 = http2;
            return this;
        }

        public Builder http2(@Nullable VirtualNodeSpecListenerConnectionPoolHttp2Args http2) {
            this.http2 = Input.ofNullable(http2);
            return this;
        }

        public Builder tcp(@Nullable Input<VirtualNodeSpecListenerConnectionPoolTcpArgs> tcp) {
            this.tcp = tcp;
            return this;
        }

        public Builder tcp(@Nullable VirtualNodeSpecListenerConnectionPoolTcpArgs tcp) {
            this.tcp = Input.ofNullable(tcp);
            return this;
        }
        public VirtualNodeSpecListenerConnectionPoolArgs build() {
            return new VirtualNodeSpecListenerConnectionPoolArgs(grpc, http, http2, tcp);
        }
    }
}
