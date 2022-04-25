// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual Hub identifier.
 * 
 */
public final class VirtualHubIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualHubIdArgs Empty = new VirtualHubIdArgs();

    /**
     * The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private VirtualHubIdArgs() {}

    private VirtualHubIdArgs(VirtualHubIdArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualHubIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualHubIdArgs $;

        public Builder() {
            $ = new VirtualHubIdArgs();
        }

        public Builder(VirtualHubIdArgs defaults) {
            $ = new VirtualHubIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public VirtualHubIdArgs build() {
            return $;
        }
    }

}
