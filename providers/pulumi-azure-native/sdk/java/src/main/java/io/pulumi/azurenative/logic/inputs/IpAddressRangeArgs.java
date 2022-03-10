// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The ip address range.
 * 
 */
public final class IpAddressRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpAddressRangeArgs Empty = new IpAddressRangeArgs();

    /**
     * The IP address range.
     * 
     */
    @InputImport(name="addressRange")
      private final @Nullable Input<String> addressRange;

    public Input<String> getAddressRange() {
        return this.addressRange == null ? Input.empty() : this.addressRange;
    }

    public IpAddressRangeArgs(@Nullable Input<String> addressRange) {
        this.addressRange = addressRange;
    }

    private IpAddressRangeArgs() {
        this.addressRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressRange = defaults.addressRange;
        }

        public Builder addressRange(@Nullable Input<String> addressRange) {
            this.addressRange = addressRange;
            return this;
        }

        public Builder addressRange(@Nullable String addressRange) {
            this.addressRange = Input.ofNullable(addressRange);
            return this;
        }
        public IpAddressRangeArgs build() {
            return new IpAddressRangeArgs(addressRange);
        }
    }
}
