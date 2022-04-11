// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpIdleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutTcpArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutTcpArgs Empty = new VirtualNodeSpecListenerTimeoutTcpArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
      private final @Nullable Output<VirtualNodeSpecListenerTimeoutTcpIdleArgs> idle;

    public Output<VirtualNodeSpecListenerTimeoutTcpIdleArgs> getIdle() {
        return this.idle == null ? Codegen.empty() : this.idle;
    }

    public VirtualNodeSpecListenerTimeoutTcpArgs(@Nullable Output<VirtualNodeSpecListenerTimeoutTcpIdleArgs> idle) {
        this.idle = idle;
    }

    private VirtualNodeSpecListenerTimeoutTcpArgs() {
        this.idle = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutTcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecListenerTimeoutTcpIdleArgs> idle;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutTcpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
        }

        public Builder idle(@Nullable Output<VirtualNodeSpecListenerTimeoutTcpIdleArgs> idle) {
            this.idle = idle;
            return this;
        }
        public Builder idle(@Nullable VirtualNodeSpecListenerTimeoutTcpIdleArgs idle) {
            this.idle = Codegen.ofNullable(idle);
            return this;
        }        public VirtualNodeSpecListenerTimeoutTcpArgs build() {
            return new VirtualNodeSpecListenerTimeoutTcpArgs(idle);
        }
    }
}
