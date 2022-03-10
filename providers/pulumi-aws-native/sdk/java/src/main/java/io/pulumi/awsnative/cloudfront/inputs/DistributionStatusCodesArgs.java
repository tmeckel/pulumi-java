// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class DistributionStatusCodesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionStatusCodesArgs Empty = new DistributionStatusCodesArgs();

    @InputImport(name="items", required=true)
      private final Input<List<Integer>> items;

    public Input<List<Integer>> getItems() {
        return this.items;
    }

    @InputImport(name="quantity", required=true)
      private final Input<Integer> quantity;

    public Input<Integer> getQuantity() {
        return this.quantity;
    }

    public DistributionStatusCodesArgs(
        Input<List<Integer>> items,
        Input<Integer> quantity) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.quantity = Objects.requireNonNull(quantity, "expected parameter 'quantity' to be non-null");
    }

    private DistributionStatusCodesArgs() {
        this.items = Input.empty();
        this.quantity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionStatusCodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Integer>> items;
        private Input<Integer> quantity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionStatusCodesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.quantity = defaults.quantity;
        }

        public Builder items(Input<List<Integer>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder items(List<Integer> items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }

        public Builder quantity(Input<Integer> quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }

        public Builder quantity(Integer quantity) {
            this.quantity = Input.of(Objects.requireNonNull(quantity));
            return this;
        }
        public DistributionStatusCodesArgs build() {
            return new DistributionStatusCodesArgs(items, quantity);
        }
    }
}
