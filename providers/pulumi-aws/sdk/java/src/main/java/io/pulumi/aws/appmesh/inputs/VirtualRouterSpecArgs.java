// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualRouterSpecListenerArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class VirtualRouterSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualRouterSpecArgs Empty = new VirtualRouterSpecArgs();

    /**
     * The listeners that the virtual router is expected to receive inbound traffic from.
     * Currently only one listener is supported per virtual router.
     * 
     */
    @Import(name="listener", required=true)
      private final Output<VirtualRouterSpecListenerArgs> listener;

    public Output<VirtualRouterSpecListenerArgs> getListener() {
        return this.listener;
    }

    public VirtualRouterSpecArgs(Output<VirtualRouterSpecListenerArgs> listener) {
        this.listener = Objects.requireNonNull(listener, "expected parameter 'listener' to be non-null");
    }

    private VirtualRouterSpecArgs() {
        this.listener = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualRouterSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<VirtualRouterSpecListenerArgs> listener;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualRouterSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listener = defaults.listener;
        }

        public Builder listener(Output<VirtualRouterSpecListenerArgs> listener) {
            this.listener = Objects.requireNonNull(listener);
            return this;
        }
        public Builder listener(VirtualRouterSpecListenerArgs listener) {
            this.listener = Output.of(Objects.requireNonNull(listener));
            return this;
        }        public VirtualRouterSpecArgs build() {
            return new VirtualRouterSpecArgs(listener);
        }
    }
}
