// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs Empty = new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs();

    /**
     * The fractional portion, in cents, of the amount. Valid value range between `0` and `99`.
     * 
     */
    @Import(name="cents")
      private final @Nullable Output<Integer> cents;

    public Output<Integer> getCents() {
        return this.cents == null ? Codegen.empty() : this.cents;
    }

    /**
     * The whole number of dollars in the amount. Valid value range between `0` and `2`.
     * 
     */
    @Import(name="dollars")
      private final @Nullable Output<Integer> dollars;

    public Output<Integer> getDollars() {
        return this.dollars == null ? Codegen.empty() : this.dollars;
    }

    /**
     * Fractions of a cent, in tenths. Valid value range between `0` and `9`.
     * 
     */
    @Import(name="tenthFractionsOfACent")
      private final @Nullable Output<Integer> tenthFractionsOfACent;

    public Output<Integer> getTenthFractionsOfACent() {
        return this.tenthFractionsOfACent == null ? Codegen.empty() : this.tenthFractionsOfACent;
    }

    public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs(
        @Nullable Output<Integer> cents,
        @Nullable Output<Integer> dollars,
        @Nullable Output<Integer> tenthFractionsOfACent) {
        this.cents = cents;
        this.dollars = dollars;
        this.tenthFractionsOfACent = tenthFractionsOfACent;
    }

    private FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs() {
        this.cents = Codegen.empty();
        this.dollars = Codegen.empty();
        this.tenthFractionsOfACent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cents;
        private @Nullable Output<Integer> dollars;
        private @Nullable Output<Integer> tenthFractionsOfACent;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cents = defaults.cents;
    	      this.dollars = defaults.dollars;
    	      this.tenthFractionsOfACent = defaults.tenthFractionsOfACent;
        }

        public Builder cents(@Nullable Output<Integer> cents) {
            this.cents = cents;
            return this;
        }
        public Builder cents(@Nullable Integer cents) {
            this.cents = Codegen.ofNullable(cents);
            return this;
        }
        public Builder dollars(@Nullable Output<Integer> dollars) {
            this.dollars = dollars;
            return this;
        }
        public Builder dollars(@Nullable Integer dollars) {
            this.dollars = Codegen.ofNullable(dollars);
            return this;
        }
        public Builder tenthFractionsOfACent(@Nullable Output<Integer> tenthFractionsOfACent) {
            this.tenthFractionsOfACent = tenthFractionsOfACent;
            return this;
        }
        public Builder tenthFractionsOfACent(@Nullable Integer tenthFractionsOfACent) {
            this.tenthFractionsOfACent = Codegen.ofNullable(tenthFractionsOfACent);
            return this;
        }        public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs build() {
            return new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdArgs(cents, dollars, tenthFractionsOfACent);
        }
    }
}
