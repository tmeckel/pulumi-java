// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AddressSpace contains an array of IP address ranges that can be used by subnets of the virtual network.
 * 
 */
public final class AddressSpaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddressSpaceArgs Empty = new AddressSpaceArgs();

    /**
     * A list of address blocks reserved for this virtual network in CIDR notation.
     * 
     */
    @InputImport(name="addressPrefixes")
      private final @Nullable Input<List<String>> addressPrefixes;

    public Input<List<String>> getAddressPrefixes() {
        return this.addressPrefixes == null ? Input.empty() : this.addressPrefixes;
    }

    public AddressSpaceArgs(@Nullable Input<List<String>> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
    }

    private AddressSpaceArgs() {
        this.addressPrefixes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressSpaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> addressPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressSpaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
        }

        public Builder addressPrefixes(@Nullable Input<List<String>> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }

        public Builder addressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = Input.ofNullable(addressPrefixes);
            return this;
        }
        public AddressSpaceArgs build() {
            return new AddressSpaceArgs(addressPrefixes);
        }
    }
}
