// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VNet properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeVNetPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeVNetPropertiesArgs Empty = new IntegrationRuntimeVNetPropertiesArgs();

    /**
     * Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     */
    @InputImport(name="publicIPs")
      private final @Nullable Input<List<String>> publicIPs;

    public Input<List<String>> getPublicIPs() {
        return this.publicIPs == null ? Input.empty() : this.publicIPs;
    }

    /**
     * The name of the subnet this integration runtime will join.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable Input<String> subnet;

    public Input<String> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    /**
     * The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * The ID of the VNet that this integration runtime will join.
     * 
     */
    @InputImport(name="vNetId")
      private final @Nullable Input<String> vNetId;

    public Input<String> getVNetId() {
        return this.vNetId == null ? Input.empty() : this.vNetId;
    }

    public IntegrationRuntimeVNetPropertiesArgs(
        @Nullable Input<List<String>> publicIPs,
        @Nullable Input<String> subnet,
        @Nullable Input<String> subnetId,
        @Nullable Input<String> vNetId) {
        this.publicIPs = publicIPs;
        this.subnet = subnet;
        this.subnetId = subnetId;
        this.vNetId = vNetId;
    }

    private IntegrationRuntimeVNetPropertiesArgs() {
        this.publicIPs = Input.empty();
        this.subnet = Input.empty();
        this.subnetId = Input.empty();
        this.vNetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeVNetPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> publicIPs;
        private @Nullable Input<String> subnet;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<String> vNetId;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeVNetPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPs = defaults.publicIPs;
    	      this.subnet = defaults.subnet;
    	      this.subnetId = defaults.subnetId;
    	      this.vNetId = defaults.vNetId;
        }

        public Builder publicIPs(@Nullable Input<List<String>> publicIPs) {
            this.publicIPs = publicIPs;
            return this;
        }

        public Builder publicIPs(@Nullable List<String> publicIPs) {
            this.publicIPs = Input.ofNullable(publicIPs);
            return this;
        }

        public Builder subnet(@Nullable Input<String> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable String subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public Builder subnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder vNetId(@Nullable Input<String> vNetId) {
            this.vNetId = vNetId;
            return this;
        }

        public Builder vNetId(@Nullable String vNetId) {
            this.vNetId = Input.ofNullable(vNetId);
            return this;
        }
        public IntegrationRuntimeVNetPropertiesArgs build() {
            return new IntegrationRuntimeVNetPropertiesArgs(publicIPs, subnet, subnetId, vNetId);
        }
    }
}
