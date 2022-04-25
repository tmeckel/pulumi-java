// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VNet properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeVNetPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeVNetPropertiesArgs Empty = new IntegrationRuntimeVNetPropertiesArgs();

    /**
     * Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     */
    @Import(name="publicIPs")
    private @Nullable Output<List<String>> publicIPs;

    /**
     * @return Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     */
    public Optional<Output<List<String>>> publicIPs() {
        return Optional.ofNullable(this.publicIPs);
    }

    /**
     * The name of the subnet this integration runtime will join.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return The name of the subnet this integration runtime will join.
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The ID of the VNet that this integration runtime will join.
     * 
     */
    @Import(name="vNetId")
    private @Nullable Output<String> vNetId;

    /**
     * @return The ID of the VNet that this integration runtime will join.
     * 
     */
    public Optional<Output<String>> vNetId() {
        return Optional.ofNullable(this.vNetId);
    }

    private IntegrationRuntimeVNetPropertiesArgs() {}

    private IntegrationRuntimeVNetPropertiesArgs(IntegrationRuntimeVNetPropertiesArgs $) {
        this.publicIPs = $.publicIPs;
        this.subnet = $.subnet;
        this.subnetId = $.subnetId;
        this.vNetId = $.vNetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeVNetPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeVNetPropertiesArgs $;

        public Builder() {
            $ = new IntegrationRuntimeVNetPropertiesArgs();
        }

        public Builder(IntegrationRuntimeVNetPropertiesArgs defaults) {
            $ = new IntegrationRuntimeVNetPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicIPs Resource IDs of the public IP addresses that this integration runtime will use.
         * 
         * @return builder
         * 
         */
        public Builder publicIPs(@Nullable Output<List<String>> publicIPs) {
            $.publicIPs = publicIPs;
            return this;
        }

        /**
         * @param publicIPs Resource IDs of the public IP addresses that this integration runtime will use.
         * 
         * @return builder
         * 
         */
        public Builder publicIPs(List<String> publicIPs) {
            return publicIPs(Output.of(publicIPs));
        }

        /**
         * @param publicIPs Resource IDs of the public IP addresses that this integration runtime will use.
         * 
         * @return builder
         * 
         */
        public Builder publicIPs(String... publicIPs) {
            return publicIPs(List.of(publicIPs));
        }

        /**
         * @param subnet The name of the subnet this integration runtime will join.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet The name of the subnet this integration runtime will join.
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param subnetId The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param vNetId The ID of the VNet that this integration runtime will join.
         * 
         * @return builder
         * 
         */
        public Builder vNetId(@Nullable Output<String> vNetId) {
            $.vNetId = vNetId;
            return this;
        }

        /**
         * @param vNetId The ID of the VNet that this integration runtime will join.
         * 
         * @return builder
         * 
         */
        public Builder vNetId(String vNetId) {
            return vNetId(Output.of(vNetId));
        }

        public IntegrationRuntimeVNetPropertiesArgs build() {
            return $;
        }
    }

}
