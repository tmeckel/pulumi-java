// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The color information of a Product.
 * 
 */
public final class GoogleCloudRetailV2ColorInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2ColorInfoArgs Empty = new GoogleCloudRetailV2ColorInfoArgs();

    /**
     * The standard color families. Strongly recommended to use the following standard color groups: "Red", "Pink", "Orange", "Yellow", "Purple", "Green", "Cyan", "Blue", "Brown", "White", "Gray", "Black" and "Mixed". Normally it is expected to have only 1 color family. May consider using single "Mixed" instead of multiple values. A maximum of 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @InputImport(name="colorFamilies")
    private final @Nullable Input<List<String>> colorFamilies;

    public Input<List<String>> getColorFamilies() {
        return this.colorFamilies == null ? Input.empty() : this.colorFamilies;
    }

    /**
     * The color display names, which may be different from standard color family names, such as the color aliases used in the website frontend. Normally it is expected to have only 1 color. May consider using single "Mixed" instead of multiple values. A maximum of 25 colors are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @InputImport(name="colors")
    private final @Nullable Input<List<String>> colors;

    public Input<List<String>> getColors() {
        return this.colors == null ? Input.empty() : this.colors;
    }

    public GoogleCloudRetailV2ColorInfoArgs(
        @Nullable Input<List<String>> colorFamilies,
        @Nullable Input<List<String>> colors) {
        this.colorFamilies = colorFamilies;
        this.colors = colors;
    }

    private GoogleCloudRetailV2ColorInfoArgs() {
        this.colorFamilies = Input.empty();
        this.colors = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2ColorInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> colorFamilies;
        private @Nullable Input<List<String>> colors;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2ColorInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorFamilies = defaults.colorFamilies;
    	      this.colors = defaults.colors;
        }

        public Builder setColorFamilies(@Nullable Input<List<String>> colorFamilies) {
            this.colorFamilies = colorFamilies;
            return this;
        }

        public Builder setColorFamilies(@Nullable List<String> colorFamilies) {
            this.colorFamilies = Input.ofNullable(colorFamilies);
            return this;
        }

        public Builder setColors(@Nullable Input<List<String>> colors) {
            this.colors = colors;
            return this;
        }

        public Builder setColors(@Nullable List<String> colors) {
            this.colors = Input.ofNullable(colors);
            return this;
        }

        public GoogleCloudRetailV2ColorInfoArgs build() {
            return new GoogleCloudRetailV2ColorInfoArgs(colorFamilies, colors);
        }
    }
}
