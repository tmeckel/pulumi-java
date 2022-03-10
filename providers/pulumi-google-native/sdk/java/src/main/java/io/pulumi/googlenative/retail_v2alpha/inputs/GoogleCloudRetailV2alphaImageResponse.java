// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Product thumbnail/detail image.
 * 
 */
public final class GoogleCloudRetailV2alphaImageResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaImageResponse Empty = new GoogleCloudRetailV2alphaImageResponse();

    /**
     * Height of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @InputImport(name="height", required=true)
      private final Integer height;

    public Integer getHeight() {
        return this.height;
    }

    /**
     * URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property [Product.image](https://schema.org/image).
     * 
     */
    @InputImport(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    /**
     * Width of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @InputImport(name="width", required=true)
      private final Integer width;

    public Integer getWidth() {
        return this.width;
    }

    public GoogleCloudRetailV2alphaImageResponse(
        Integer height,
        String uri,
        Integer width) {
        this.height = Objects.requireNonNull(height, "expected parameter 'height' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.width = Objects.requireNonNull(width, "expected parameter 'width' to be non-null");
    }

    private GoogleCloudRetailV2alphaImageResponse() {
        this.height = null;
        this.uri = null;
        this.width = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer height;
        private String uri;
        private Integer width;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.uri = defaults.uri;
    	      this.width = defaults.width;
        }

        public Builder height(Integer height) {
            this.height = Objects.requireNonNull(height);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder width(Integer width) {
            this.width = Objects.requireNonNull(width);
            return this;
        }
        public GoogleCloudRetailV2alphaImageResponse build() {
            return new GoogleCloudRetailV2alphaImageResponse(height, uri, width);
        }
    }
}
