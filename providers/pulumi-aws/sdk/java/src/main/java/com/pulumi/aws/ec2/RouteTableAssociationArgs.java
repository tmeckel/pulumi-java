// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteTableAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteTableAssociationArgs Empty = new RouteTableAssociationArgs();

    /**
     * The gateway ID to create an association. Conflicts with `subnet_id`.
     * 
     */
    @Import(name="gatewayId")
    private @Nullable Output<String> gatewayId;

    /**
     * @return The gateway ID to create an association. Conflicts with `subnet_id`.
     * 
     */
    public Optional<Output<String>> gatewayId() {
        return Optional.ofNullable(this.gatewayId);
    }

    /**
     * The ID of the routing table to associate with.
     * 
     */
    @Import(name="routeTableId", required=true)
    private Output<String> routeTableId;

    /**
     * @return The ID of the routing table to associate with.
     * 
     */
    public Output<String> routeTableId() {
        return this.routeTableId;
    }

    /**
     * The subnet ID to create an association. Conflicts with `gateway_id`.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The subnet ID to create an association. Conflicts with `gateway_id`.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    private RouteTableAssociationArgs() {}

    private RouteTableAssociationArgs(RouteTableAssociationArgs $) {
        this.gatewayId = $.gatewayId;
        this.routeTableId = $.routeTableId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteTableAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteTableAssociationArgs $;

        public Builder() {
            $ = new RouteTableAssociationArgs();
        }

        public Builder(RouteTableAssociationArgs defaults) {
            $ = new RouteTableAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayId The gateway ID to create an association. Conflicts with `subnet_id`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(@Nullable Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId The gateway ID to create an association. Conflicts with `subnet_id`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        /**
         * @param routeTableId The ID of the routing table to associate with.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(Output<String> routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        /**
         * @param routeTableId The ID of the routing table to associate with.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(String routeTableId) {
            return routeTableId(Output.of(routeTableId));
        }

        /**
         * @param subnetId The subnet ID to create an association. Conflicts with `gateway_id`.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The subnet ID to create an association. Conflicts with `gateway_id`.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public RouteTableAssociationArgs build() {
            $.routeTableId = Objects.requireNonNull($.routeTableId, "expected parameter 'routeTableId' to be non-null");
            return $;
        }
    }

}
