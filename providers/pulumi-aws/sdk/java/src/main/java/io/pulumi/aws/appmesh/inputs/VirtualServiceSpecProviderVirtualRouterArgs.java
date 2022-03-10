// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualServiceSpecProviderVirtualRouterArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualServiceSpecProviderVirtualRouterArgs Empty = new VirtualServiceSpecProviderVirtualRouterArgs();

    /**
     * The name of the virtual router that is acting as a service provider. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="virtualRouterName", required=true)
      private final Input<String> virtualRouterName;

    public Input<String> getVirtualRouterName() {
        return this.virtualRouterName;
    }

    public VirtualServiceSpecProviderVirtualRouterArgs(Input<String> virtualRouterName) {
        this.virtualRouterName = Objects.requireNonNull(virtualRouterName, "expected parameter 'virtualRouterName' to be non-null");
    }

    private VirtualServiceSpecProviderVirtualRouterArgs() {
        this.virtualRouterName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualServiceSpecProviderVirtualRouterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> virtualRouterName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualServiceSpecProviderVirtualRouterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualRouterName = defaults.virtualRouterName;
        }

        public Builder virtualRouterName(Input<String> virtualRouterName) {
            this.virtualRouterName = Objects.requireNonNull(virtualRouterName);
            return this;
        }

        public Builder virtualRouterName(String virtualRouterName) {
            this.virtualRouterName = Input.of(Objects.requireNonNull(virtualRouterName));
            return this;
        }
        public VirtualServiceSpecProviderVirtualRouterArgs build() {
            return new VirtualServiceSpecProviderVirtualRouterArgs(virtualRouterName);
        }
    }
}
