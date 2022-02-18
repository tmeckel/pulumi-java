// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Promotion information.
 * 
 */
public final class GoogleCloudRetailV2betaPromotionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaPromotionArgs Empty = new GoogleCloudRetailV2betaPromotionArgs();

    /**
     * ID of the promotion. For example, "free gift". The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [promotion](https://support.google.com/merchants/answer/7050148).
     * 
     */
    @InputImport(name="promotionId")
    private final @Nullable Input<String> promotionId;

    public Input<String> getPromotionId() {
        return this.promotionId == null ? Input.empty() : this.promotionId;
    }

    public GoogleCloudRetailV2betaPromotionArgs(@Nullable Input<String> promotionId) {
        this.promotionId = promotionId;
    }

    private GoogleCloudRetailV2betaPromotionArgs() {
        this.promotionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaPromotionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> promotionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaPromotionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.promotionId = defaults.promotionId;
        }

        public Builder setPromotionId(@Nullable Input<String> promotionId) {
            this.promotionId = promotionId;
            return this;
        }

        public Builder setPromotionId(@Nullable String promotionId) {
            this.promotionId = Input.ofNullable(promotionId);
            return this;
        }

        public GoogleCloudRetailV2betaPromotionArgs build() {
            return new GoogleCloudRetailV2betaPromotionArgs(promotionId);
        }
    }
}
