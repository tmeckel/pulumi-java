// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.outputs;

import com.pulumi.azurenative.virtualmachineimages.outputs.PlatformImagePurchasePlanResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageTemplatePlatformImageSourceResponse {
    /**
     * @return Image offer from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    private final @Nullable String offer;
    /**
     * @return Optional configuration of purchase plan for platform image.
     * 
     */
    private final @Nullable PlatformImagePurchasePlanResponse planInfo;
    /**
     * @return Image Publisher in [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    private final @Nullable String publisher;
    /**
     * @return Image sku from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    private final @Nullable String sku;
    /**
     * @return Specifies the type of source image you want to start with.
     * Expected value is &#39;PlatformImage&#39;.
     * 
     */
    private final String type;
    /**
     * @return Image version from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages). If &#39;latest&#39; is specified here, the version is evaluated when the image build takes place, not when the template is submitted. Specifying &#39;latest&#39; could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be fixed.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private ImageTemplatePlatformImageSourceResponse(
        @CustomType.Parameter("offer") @Nullable String offer,
        @CustomType.Parameter("planInfo") @Nullable PlatformImagePurchasePlanResponse planInfo,
        @CustomType.Parameter("publisher") @Nullable String publisher,
        @CustomType.Parameter("sku") @Nullable String sku,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") @Nullable String version) {
        this.offer = offer;
        this.planInfo = planInfo;
        this.publisher = publisher;
        this.sku = sku;
        this.type = type;
        this.version = version;
    }

    /**
     * @return Image offer from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    public Optional<String> offer() {
        return Optional.ofNullable(this.offer);
    }
    /**
     * @return Optional configuration of purchase plan for platform image.
     * 
     */
    public Optional<PlatformImagePurchasePlanResponse> planInfo() {
        return Optional.ofNullable(this.planInfo);
    }
    /**
     * @return Image Publisher in [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    public Optional<String> publisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * @return Image sku from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Specifies the type of source image you want to start with.
     * Expected value is &#39;PlatformImage&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Image version from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages). If &#39;latest&#39; is specified here, the version is evaluated when the image build takes place, not when the template is submitted. Specifying &#39;latest&#39; could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be fixed.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplatePlatformImageSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offer;
        private @Nullable PlatformImagePurchasePlanResponse planInfo;
        private @Nullable String publisher;
        private @Nullable String sku;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplatePlatformImageSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.planInfo = defaults.planInfo;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder offer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }
        public Builder planInfo(@Nullable PlatformImagePurchasePlanResponse planInfo) {
            this.planInfo = planInfo;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ImageTemplatePlatformImageSourceResponse build() {
            return new ImageTemplatePlatformImageSourceResponse(offer, planInfo, publisher, sku, type, version);
        }
    }
}
