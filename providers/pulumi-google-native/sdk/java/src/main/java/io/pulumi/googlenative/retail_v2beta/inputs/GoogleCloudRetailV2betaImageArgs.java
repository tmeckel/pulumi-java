// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Product thumbnail/detail image.
 * 
 */
public final class GoogleCloudRetailV2betaImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaImageArgs Empty = new GoogleCloudRetailV2betaImageArgs();

    /**
     * Height of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @InputImport(name="height")
      private final @Nullable Input<Integer> height;

    public Input<Integer> getHeight() {
        return this.height == null ? Input.empty() : this.height;
    }

    /**
     * URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property [Product.image](https://schema.org/image).
     * 
     */
    @InputImport(name="uri", required=true)
      private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    /**
     * Width of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @InputImport(name="width")
      private final @Nullable Input<Integer> width;

    public Input<Integer> getWidth() {
        return this.width == null ? Input.empty() : this.width;
    }

    public GoogleCloudRetailV2betaImageArgs(
        @Nullable Input<Integer> height,
        Input<String> uri,
        @Nullable Input<Integer> width) {
        this.height = height;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.width = width;
    }

    private GoogleCloudRetailV2betaImageArgs() {
        this.height = Input.empty();
        this.uri = Input.empty();
        this.width = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> height;
        private Input<String> uri;
        private @Nullable Input<Integer> width;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.uri = defaults.uri;
    	      this.width = defaults.width;
        }

        public Builder height(@Nullable Input<Integer> height) {
            this.height = height;
            return this;
        }

        public Builder height(@Nullable Integer height) {
            this.height = Input.ofNullable(height);
            return this;
        }

        public Builder uri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public Builder width(@Nullable Input<Integer> width) {
            this.width = width;
            return this;
        }

        public Builder width(@Nullable Integer width) {
            this.width = Input.ofNullable(width);
            return this;
        }
        public GoogleCloudRetailV2betaImageArgs build() {
            return new GoogleCloudRetailV2betaImageArgs(height, uri, width);
        }
    }
}
