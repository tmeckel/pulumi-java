// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SkuCostArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuCostArgs Empty = new SkuCostArgs();

    @InputImport(name="extendedUnit")
      private final @Nullable Input<String> extendedUnit;

    public Input<String> getExtendedUnit() {
        return this.extendedUnit == null ? Input.empty() : this.extendedUnit;
    }

    @InputImport(name="meterId", required=true)
      private final Input<String> meterId;

    public Input<String> getMeterId() {
        return this.meterId;
    }

    @InputImport(name="quantity")
      private final @Nullable Input<Integer> quantity;

    public Input<Integer> getQuantity() {
        return this.quantity == null ? Input.empty() : this.quantity;
    }

    public SkuCostArgs(
        @Nullable Input<String> extendedUnit,
        Input<String> meterId,
        @Nullable Input<Integer> quantity) {
        this.extendedUnit = extendedUnit;
        this.meterId = Objects.requireNonNull(meterId, "expected parameter 'meterId' to be non-null");
        this.quantity = quantity;
    }

    private SkuCostArgs() {
        this.extendedUnit = Input.empty();
        this.meterId = Input.empty();
        this.quantity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuCostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> extendedUnit;
        private Input<String> meterId;
        private @Nullable Input<Integer> quantity;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuCostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedUnit = defaults.extendedUnit;
    	      this.meterId = defaults.meterId;
    	      this.quantity = defaults.quantity;
        }

        public Builder extendedUnit(@Nullable Input<String> extendedUnit) {
            this.extendedUnit = extendedUnit;
            return this;
        }

        public Builder extendedUnit(@Nullable String extendedUnit) {
            this.extendedUnit = Input.ofNullable(extendedUnit);
            return this;
        }

        public Builder meterId(Input<String> meterId) {
            this.meterId = Objects.requireNonNull(meterId);
            return this;
        }

        public Builder meterId(String meterId) {
            this.meterId = Input.of(Objects.requireNonNull(meterId));
            return this;
        }

        public Builder quantity(@Nullable Input<Integer> quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder quantity(@Nullable Integer quantity) {
            this.quantity = Input.ofNullable(quantity);
            return this;
        }
        public SkuCostArgs build() {
            return new SkuCostArgs(extendedUnit, meterId, quantity);
        }
    }
}
