// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.outputs;

import com.pulumi.azurenative.powerplatform.outputs.SubnetPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkPropertiesResponse {
    /**
     * @return Uri of the virtual network.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Properties of a subnet.
     * 
     */
    private final @Nullable SubnetPropertiesResponse subnet;

    @CustomType.Constructor
    private VirtualNetworkPropertiesResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("subnet") @Nullable SubnetPropertiesResponse subnet) {
        this.id = id;
        this.subnet = subnet;
    }

    /**
     * @return Uri of the virtual network.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Properties of a subnet.
     * 
     */
    public Optional<SubnetPropertiesResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable SubnetPropertiesResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subnet = defaults.subnet;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder subnet(@Nullable SubnetPropertiesResponse subnet) {
            this.subnet = subnet;
            return this;
        }        public VirtualNetworkPropertiesResponse build() {
            return new VirtualNetworkPropertiesResponse(id, subnet);
        }
    }
}
