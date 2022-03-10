// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.inputs;

import io.pulumi.azurenative.hanaonazure.inputs.IpAddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the network settings for the HANA instance disks.
 * 
 */
public final class NetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * Specifies the network interfaces for the HANA instance.
     * 
     */
    @InputImport(name="networkInterfaces")
      private final @Nullable Input<List<IpAddressArgs>> networkInterfaces;

    public Input<List<IpAddressArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Input.empty() : this.networkInterfaces;
    }

    public NetworkProfileArgs(@Nullable Input<List<IpAddressArgs>> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    private NetworkProfileArgs() {
        this.networkInterfaces = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IpAddressArgs>> networkInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
        }

        public Builder networkInterfaces(@Nullable Input<List<IpAddressArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(@Nullable List<IpAddressArgs> networkInterfaces) {
            this.networkInterfaces = Input.ofNullable(networkInterfaces);
            return this;
        }
        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(networkInterfaces);
        }
    }
}
