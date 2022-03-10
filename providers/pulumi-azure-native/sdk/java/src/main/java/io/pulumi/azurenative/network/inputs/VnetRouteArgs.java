// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.StaticRouteArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * List of routes that control routing from VirtualHub into a virtual network connection.
 * 
 */
public final class VnetRouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final VnetRouteArgs Empty = new VnetRouteArgs();

    /**
     * List of all Static Routes.
     * 
     */
    @InputImport(name="staticRoutes")
      private final @Nullable Input<List<StaticRouteArgs>> staticRoutes;

    public Input<List<StaticRouteArgs>> getStaticRoutes() {
        return this.staticRoutes == null ? Input.empty() : this.staticRoutes;
    }

    public VnetRouteArgs(@Nullable Input<List<StaticRouteArgs>> staticRoutes) {
        this.staticRoutes = staticRoutes;
    }

    private VnetRouteArgs() {
        this.staticRoutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VnetRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<StaticRouteArgs>> staticRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(VnetRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.staticRoutes = defaults.staticRoutes;
        }

        public Builder staticRoutes(@Nullable Input<List<StaticRouteArgs>> staticRoutes) {
            this.staticRoutes = staticRoutes;
            return this;
        }

        public Builder staticRoutes(@Nullable List<StaticRouteArgs> staticRoutes) {
            this.staticRoutes = Input.ofNullable(staticRoutes);
            return this;
        }
        public VnetRouteArgs build() {
            return new VnetRouteArgs(staticRoutes);
        }
    }
}
