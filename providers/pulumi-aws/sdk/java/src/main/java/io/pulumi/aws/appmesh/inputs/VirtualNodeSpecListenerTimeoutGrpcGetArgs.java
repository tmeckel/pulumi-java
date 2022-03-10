// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcIdleGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcPerRequestGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutGrpcGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutGrpcGetArgs Empty = new VirtualNodeSpecListenerTimeoutGrpcGetArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @InputImport(name="idle")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcIdleGetArgs> idle;

    public Input<VirtualNodeSpecListenerTimeoutGrpcIdleGetArgs> getIdle() {
        return this.idle == null ? Input.empty() : this.idle;
    }

    /**
     * The per request timeout.
     * 
     */
    @InputImport(name="perRequest")
      private final @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestGetArgs> perRequest;

    public Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestGetArgs> getPerRequest() {
        return this.perRequest == null ? Input.empty() : this.perRequest;
    }

    public VirtualNodeSpecListenerTimeoutGrpcGetArgs(
        @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcIdleGetArgs> idle,
        @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestGetArgs> perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    private VirtualNodeSpecListenerTimeoutGrpcGetArgs() {
        this.idle = Input.empty();
        this.perRequest = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutGrpcGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcIdleGetArgs> idle;
        private @Nullable Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestGetArgs> perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutGrpcGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable Input<VirtualNodeSpecListenerTimeoutGrpcIdleGetArgs> idle) {
            this.idle = idle;
            return this;
        }

        public Builder idle(@Nullable VirtualNodeSpecListenerTimeoutGrpcIdleGetArgs idle) {
            this.idle = Input.ofNullable(idle);
            return this;
        }

        public Builder perRequest(@Nullable Input<VirtualNodeSpecListenerTimeoutGrpcPerRequestGetArgs> perRequest) {
            this.perRequest = perRequest;
            return this;
        }

        public Builder perRequest(@Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequestGetArgs perRequest) {
            this.perRequest = Input.ofNullable(perRequest);
            return this;
        }
        public VirtualNodeSpecListenerTimeoutGrpcGetArgs build() {
            return new VirtualNodeSpecListenerTimeoutGrpcGetArgs(idle, perRequest);
        }
    }
}
