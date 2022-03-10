// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkIpamConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkIpamConfigArgs Empty = new NetworkIpamConfigArgs();

    @InputImport(name="auxAddress")
      private final @Nullable Input<Map<String,Object>> auxAddress;

    public Input<Map<String,Object>> getAuxAddress() {
        return this.auxAddress == null ? Input.empty() : this.auxAddress;
    }

    @InputImport(name="gateway")
      private final @Nullable Input<String> gateway;

    public Input<String> getGateway() {
        return this.gateway == null ? Input.empty() : this.gateway;
    }

    @InputImport(name="ipRange")
      private final @Nullable Input<String> ipRange;

    public Input<String> getIpRange() {
        return this.ipRange == null ? Input.empty() : this.ipRange;
    }

    @InputImport(name="subnet")
      private final @Nullable Input<String> subnet;

    public Input<String> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    public NetworkIpamConfigArgs(
        @Nullable Input<Map<String,Object>> auxAddress,
        @Nullable Input<String> gateway,
        @Nullable Input<String> ipRange,
        @Nullable Input<String> subnet) {
        this.auxAddress = auxAddress;
        this.gateway = gateway;
        this.ipRange = ipRange;
        this.subnet = subnet;
    }

    private NetworkIpamConfigArgs() {
        this.auxAddress = Input.empty();
        this.gateway = Input.empty();
        this.ipRange = Input.empty();
        this.subnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkIpamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,Object>> auxAddress;
        private @Nullable Input<String> gateway;
        private @Nullable Input<String> ipRange;
        private @Nullable Input<String> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkIpamConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxAddress = defaults.auxAddress;
    	      this.gateway = defaults.gateway;
    	      this.ipRange = defaults.ipRange;
    	      this.subnet = defaults.subnet;
        }

        public Builder auxAddress(@Nullable Input<Map<String,Object>> auxAddress) {
            this.auxAddress = auxAddress;
            return this;
        }

        public Builder auxAddress(@Nullable Map<String,Object> auxAddress) {
            this.auxAddress = Input.ofNullable(auxAddress);
            return this;
        }

        public Builder gateway(@Nullable Input<String> gateway) {
            this.gateway = gateway;
            return this;
        }

        public Builder gateway(@Nullable String gateway) {
            this.gateway = Input.ofNullable(gateway);
            return this;
        }

        public Builder ipRange(@Nullable Input<String> ipRange) {
            this.ipRange = ipRange;
            return this;
        }

        public Builder ipRange(@Nullable String ipRange) {
            this.ipRange = Input.ofNullable(ipRange);
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
        public NetworkIpamConfigArgs build() {
            return new NetworkIpamConfigArgs(auxAddress, gateway, ipRange, subnet);
        }
    }
}
