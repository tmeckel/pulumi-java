// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class NetworkInterfacePrivateIpAddressSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfacePrivateIpAddressSpecificationArgs Empty = new NetworkInterfacePrivateIpAddressSpecificationArgs();

    @InputImport(name="primary", required=true)
      private final Input<Boolean> primary;

    public Input<Boolean> getPrimary() {
        return this.primary;
    }

    @InputImport(name="privateIpAddress", required=true)
      private final Input<String> privateIpAddress;

    public Input<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public NetworkInterfacePrivateIpAddressSpecificationArgs(
        Input<Boolean> primary,
        Input<String> privateIpAddress) {
        this.primary = Objects.requireNonNull(primary, "expected parameter 'primary' to be non-null");
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
    }

    private NetworkInterfacePrivateIpAddressSpecificationArgs() {
        this.primary = Input.empty();
        this.privateIpAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfacePrivateIpAddressSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> primary;
        private Input<String> privateIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfacePrivateIpAddressSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primary = defaults.primary;
    	      this.privateIpAddress = defaults.privateIpAddress;
        }

        public Builder primary(Input<Boolean> primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }

        public Builder primary(Boolean primary) {
            this.primary = Input.of(Objects.requireNonNull(primary));
            return this;
        }

        public Builder privateIpAddress(Input<String> privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Input.of(Objects.requireNonNull(privateIpAddress));
            return this;
        }
        public NetworkInterfacePrivateIpAddressSpecificationArgs build() {
            return new NetworkInterfacePrivateIpAddressSpecificationArgs(primary, privateIpAddress);
        }
    }
}
