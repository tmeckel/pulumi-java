// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.outputs;

import com.pulumi.awsnative.imagebuilder.outputs.ImageRecipeAdditionalInstanceConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageRecipeResult {
    /**
     * @return Specify additional settings and launch scripts for your build instances.
     * 
     */
    private final @Nullable ImageRecipeAdditionalInstanceConfiguration additionalInstanceConfiguration;
    /**
     * @return The Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    private final @Nullable String arn;

    @CustomType.Constructor
    private GetImageRecipeResult(
        @CustomType.Parameter("additionalInstanceConfiguration") @Nullable ImageRecipeAdditionalInstanceConfiguration additionalInstanceConfiguration,
        @CustomType.Parameter("arn") @Nullable String arn) {
        this.additionalInstanceConfiguration = additionalInstanceConfiguration;
        this.arn = arn;
    }

    /**
     * @return Specify additional settings and launch scripts for your build instances.
     * 
     */
    public Optional<ImageRecipeAdditionalInstanceConfiguration> additionalInstanceConfiguration() {
        return Optional.ofNullable(this.additionalInstanceConfiguration);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ImageRecipeAdditionalInstanceConfiguration additionalInstanceConfiguration;
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageRecipeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInstanceConfiguration = defaults.additionalInstanceConfiguration;
    	      this.arn = defaults.arn;
        }

        public Builder additionalInstanceConfiguration(@Nullable ImageRecipeAdditionalInstanceConfiguration additionalInstanceConfiguration) {
            this.additionalInstanceConfiguration = additionalInstanceConfiguration;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }        public GetImageRecipeResult build() {
            return new GetImageRecipeResult(additionalInstanceConfiguration, arn);
        }
    }
}
