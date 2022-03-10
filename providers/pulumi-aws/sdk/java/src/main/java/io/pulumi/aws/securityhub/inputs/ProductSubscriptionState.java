// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProductSubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final ProductSubscriptionState Empty = new ProductSubscriptionState();

    /**
     * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The ARN of the product that generates findings that you want to import into Security Hub - see below.
     * 
     */
    @InputImport(name="productArn")
      private final @Nullable Input<String> productArn;

    public Input<String> getProductArn() {
        return this.productArn == null ? Input.empty() : this.productArn;
    }

    public ProductSubscriptionState(
        @Nullable Input<String> arn,
        @Nullable Input<String> productArn) {
        this.arn = arn;
        this.productArn = productArn;
    }

    private ProductSubscriptionState() {
        this.arn = Input.empty();
        this.productArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> productArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductSubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.productArn = defaults.productArn;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder productArn(@Nullable Input<String> productArn) {
            this.productArn = productArn;
            return this;
        }

        public Builder productArn(@Nullable String productArn) {
            this.productArn = Input.ofNullable(productArn);
            return this;
        }
        public ProductSubscriptionState build() {
            return new ProductSubscriptionState(arn, productArn);
        }
    }
}
