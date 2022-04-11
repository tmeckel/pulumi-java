// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.inputs.GrpcServiceConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] The configuration to access the SDS server. The configuration to access the SDS server.
 * 
 */
public final class SdsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SdsConfigArgs Empty = new SdsConfigArgs();

    /**
     * The configuration to access the SDS server over GRPC.
     * 
     */
    @Import(name="grpcServiceConfig")
      private final @Nullable Output<GrpcServiceConfigArgs> grpcServiceConfig;

    public Output<GrpcServiceConfigArgs> getGrpcServiceConfig() {
        return this.grpcServiceConfig == null ? Codegen.empty() : this.grpcServiceConfig;
    }

    public SdsConfigArgs(@Nullable Output<GrpcServiceConfigArgs> grpcServiceConfig) {
        this.grpcServiceConfig = grpcServiceConfig;
    }

    private SdsConfigArgs() {
        this.grpcServiceConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SdsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GrpcServiceConfigArgs> grpcServiceConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SdsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcServiceConfig = defaults.grpcServiceConfig;
        }

        public Builder grpcServiceConfig(@Nullable Output<GrpcServiceConfigArgs> grpcServiceConfig) {
            this.grpcServiceConfig = grpcServiceConfig;
            return this;
        }
        public Builder grpcServiceConfig(@Nullable GrpcServiceConfigArgs grpcServiceConfig) {
            this.grpcServiceConfig = Codegen.ofNullable(grpcServiceConfig);
            return this;
        }        public SdsConfigArgs build() {
            return new SdsConfigArgs(grpcServiceConfig);
        }
    }
}
