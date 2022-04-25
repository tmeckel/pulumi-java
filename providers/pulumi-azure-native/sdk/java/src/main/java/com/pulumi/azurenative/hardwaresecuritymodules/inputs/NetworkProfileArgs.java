// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hardwaresecuritymodules.inputs;

import com.pulumi.azurenative.hardwaresecuritymodules.inputs.ApiEntityReferenceArgs;
import com.pulumi.azurenative.hardwaresecuritymodules.inputs.NetworkInterfaceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * Specifies the list of resource Ids for the network interfaces associated with the dedicated HSM.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;

    /**
     * @return Specifies the list of resource Ids for the network interfaces associated with the dedicated HSM.
     * 
     */
    public Optional<Output<List<NetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    /**
     * Specifies the identifier of the subnet.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<ApiEntityReferenceArgs> subnet;

    /**
     * @return Specifies the identifier of the subnet.
     * 
     */
    public Optional<Output<ApiEntityReferenceArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private NetworkProfileArgs() {}

    private NetworkProfileArgs(NetworkProfileArgs $) {
        this.networkInterfaces = $.networkInterfaces;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkProfileArgs $;

        public Builder() {
            $ = new NetworkProfileArgs();
        }

        public Builder(NetworkProfileArgs defaults) {
            $ = new NetworkProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkInterfaces Specifies the list of resource Ids for the network interfaces associated with the dedicated HSM.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(@Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces Specifies the list of resource Ids for the network interfaces associated with the dedicated HSM.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<NetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces Specifies the list of resource Ids for the network interfaces associated with the dedicated HSM.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(NetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        /**
         * @param subnet Specifies the identifier of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<ApiEntityReferenceArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet Specifies the identifier of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnet(ApiEntityReferenceArgs subnet) {
            return subnet(Output.of(subnet));
        }

        public NetworkProfileArgs build() {
            return $;
        }
    }

}
