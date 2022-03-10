// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SubnetRouteTableAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetRouteTableAssociationArgs Empty = new SubnetRouteTableAssociationArgs();

    @InputImport(name="routeTableId", required=true)
      private final Input<String> routeTableId;

    public Input<String> getRouteTableId() {
        return this.routeTableId;
    }

    @InputImport(name="subnetId", required=true)
      private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    public SubnetRouteTableAssociationArgs(
        Input<String> routeTableId,
        Input<String> subnetId) {
        this.routeTableId = Objects.requireNonNull(routeTableId, "expected parameter 'routeTableId' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private SubnetRouteTableAssociationArgs() {
        this.routeTableId = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetRouteTableAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> routeTableId;
        private Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetRouteTableAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routeTableId = defaults.routeTableId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder routeTableId(Input<String> routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }

        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Input.of(Objects.requireNonNull(routeTableId));
            return this;
        }

        public Builder subnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder subnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public SubnetRouteTableAssociationArgs build() {
            return new SubnetRouteTableAssociationArgs(routeTableId, subnetId);
        }
    }
}
