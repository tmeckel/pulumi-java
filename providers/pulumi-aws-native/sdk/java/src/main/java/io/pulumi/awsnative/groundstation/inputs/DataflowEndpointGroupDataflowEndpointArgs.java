// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.DataflowEndpointGroupSocketAddressArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupDataflowEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataflowEndpointGroupDataflowEndpointArgs Empty = new DataflowEndpointGroupDataflowEndpointArgs();

    @Import(name="address")
      private final @Nullable Output<DataflowEndpointGroupSocketAddressArgs> address;

    public Output<DataflowEndpointGroupSocketAddressArgs> getAddress() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    @Import(name="mtu")
      private final @Nullable Output<Integer> mtu;

    public Output<Integer> getMtu() {
        return this.mtu == null ? Codegen.empty() : this.mtu;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public DataflowEndpointGroupDataflowEndpointArgs(
        @Nullable Output<DataflowEndpointGroupSocketAddressArgs> address,
        @Nullable Output<Integer> mtu,
        @Nullable Output<String> name) {
        this.address = address;
        this.mtu = mtu;
        this.name = name;
    }

    private DataflowEndpointGroupDataflowEndpointArgs() {
        this.address = Codegen.empty();
        this.mtu = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupDataflowEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataflowEndpointGroupSocketAddressArgs> address;
        private @Nullable Output<Integer> mtu;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupDataflowEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
        }

        public Builder address(@Nullable Output<DataflowEndpointGroupSocketAddressArgs> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable DataflowEndpointGroupSocketAddressArgs address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder mtu(@Nullable Output<Integer> mtu) {
            this.mtu = mtu;
            return this;
        }
        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = Codegen.ofNullable(mtu);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public DataflowEndpointGroupDataflowEndpointArgs build() {
            return new DataflowEndpointGroupDataflowEndpointArgs(address, mtu, name);
        }
    }
}
