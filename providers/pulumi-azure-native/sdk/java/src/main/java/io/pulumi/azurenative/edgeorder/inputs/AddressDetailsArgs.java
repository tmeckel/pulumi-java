// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.AddressPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Address details for an order item.
 * 
 */
public final class AddressDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddressDetailsArgs Empty = new AddressDetailsArgs();

    /**
     * Customer address and contact details. It should be address resource
     * 
     */
    @Import(name="forwardAddress", required=true)
      private final Output<AddressPropertiesArgs> forwardAddress;

    public Output<AddressPropertiesArgs> getForwardAddress() {
        return this.forwardAddress;
    }

    public AddressDetailsArgs(Output<AddressPropertiesArgs> forwardAddress) {
        this.forwardAddress = Objects.requireNonNull(forwardAddress, "expected parameter 'forwardAddress' to be non-null");
    }

    private AddressDetailsArgs() {
        this.forwardAddress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AddressPropertiesArgs> forwardAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardAddress = defaults.forwardAddress;
        }

        public Builder forwardAddress(Output<AddressPropertiesArgs> forwardAddress) {
            this.forwardAddress = Objects.requireNonNull(forwardAddress);
            return this;
        }
        public Builder forwardAddress(AddressPropertiesArgs forwardAddress) {
            this.forwardAddress = Output.of(Objects.requireNonNull(forwardAddress));
            return this;
        }        public AddressDetailsArgs build() {
            return new AddressDetailsArgs(forwardAddress);
        }
    }
}
