// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VendorSkuPreviewArgs extends io.pulumi.resources.ResourceArgs {

    public static final VendorSkuPreviewArgs Empty = new VendorSkuPreviewArgs();

    /**
     * Preview subscription ID.
     * 
     */
    @Import(name="previewSubscription")
      private final @Nullable Output<String> previewSubscription;

    public Output<String> getPreviewSubscription() {
        return this.previewSubscription == null ? Codegen.empty() : this.previewSubscription;
    }

    /**
     * The name of the vendor sku.
     * 
     */
    @Import(name="skuName", required=true)
      private final Output<String> skuName;

    public Output<String> getSkuName() {
        return this.skuName;
    }

    /**
     * The name of the vendor.
     * 
     */
    @Import(name="vendorName", required=true)
      private final Output<String> vendorName;

    public Output<String> getVendorName() {
        return this.vendorName;
    }

    public VendorSkuPreviewArgs(
        @Nullable Output<String> previewSubscription,
        Output<String> skuName,
        Output<String> vendorName) {
        this.previewSubscription = previewSubscription;
        this.skuName = Objects.requireNonNull(skuName, "expected parameter 'skuName' to be non-null");
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
    }

    private VendorSkuPreviewArgs() {
        this.previewSubscription = Codegen.empty();
        this.skuName = Codegen.empty();
        this.vendorName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VendorSkuPreviewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> previewSubscription;
        private Output<String> skuName;
        private Output<String> vendorName;

        public Builder() {
    	      // Empty
        }

        public Builder(VendorSkuPreviewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.previewSubscription = defaults.previewSubscription;
    	      this.skuName = defaults.skuName;
    	      this.vendorName = defaults.vendorName;
        }

        public Builder previewSubscription(@Nullable Output<String> previewSubscription) {
            this.previewSubscription = previewSubscription;
            return this;
        }
        public Builder previewSubscription(@Nullable String previewSubscription) {
            this.previewSubscription = Codegen.ofNullable(previewSubscription);
            return this;
        }
        public Builder skuName(Output<String> skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        public Builder skuName(String skuName) {
            this.skuName = Output.of(Objects.requireNonNull(skuName));
            return this;
        }
        public Builder vendorName(Output<String> vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }
        public Builder vendorName(String vendorName) {
            this.vendorName = Output.of(Objects.requireNonNull(vendorName));
            return this;
        }        public VendorSkuPreviewArgs build() {
            return new VendorSkuPreviewArgs(previewSubscription, skuName, vendorName);
        }
    }
}
