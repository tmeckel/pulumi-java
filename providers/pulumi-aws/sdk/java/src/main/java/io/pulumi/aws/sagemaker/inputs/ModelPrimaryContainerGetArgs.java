// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerImageConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelPrimaryContainerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelPrimaryContainerGetArgs Empty = new ModelPrimaryContainerGetArgs();

    /**
     * The DNS host name for the container.
     * 
     */
    @Import(name="containerHostname")
      private final @Nullable Output<String> containerHostname;

    public Output<String> getContainerHostname() {
        return this.containerHostname == null ? Codegen.empty() : this.containerHostname;
    }

    /**
     * Environment variables for the Docker container.
     * A list of key value pairs.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<Map<String,String>> environment;

    public Output<Map<String,String>> getEnvironment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * The registry path where the inference code image is stored in Amazon ECR.
     * 
     */
    @Import(name="image", required=true)
      private final Output<String> image;

    public Output<String> getImage() {
        return this.image;
    }

    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
     * 
     */
    @Import(name="imageConfig")
      private final @Nullable Output<ModelPrimaryContainerImageConfigGetArgs> imageConfig;

    public Output<ModelPrimaryContainerImageConfigGetArgs> getImageConfig() {
        return this.imageConfig == null ? Codegen.empty() : this.imageConfig;
    }

    /**
     * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * The URL for the S3 location where model artifacts are stored.
     * 
     */
    @Import(name="modelDataUrl")
      private final @Nullable Output<String> modelDataUrl;

    public Output<String> getModelDataUrl() {
        return this.modelDataUrl == null ? Codegen.empty() : this.modelDataUrl;
    }

    public ModelPrimaryContainerGetArgs(
        @Nullable Output<String> containerHostname,
        @Nullable Output<Map<String,String>> environment,
        Output<String> image,
        @Nullable Output<ModelPrimaryContainerImageConfigGetArgs> imageConfig,
        @Nullable Output<String> mode,
        @Nullable Output<String> modelDataUrl) {
        this.containerHostname = containerHostname;
        this.environment = environment;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.imageConfig = imageConfig;
        this.mode = mode;
        this.modelDataUrl = modelDataUrl;
    }

    private ModelPrimaryContainerGetArgs() {
        this.containerHostname = Codegen.empty();
        this.environment = Codegen.empty();
        this.image = Codegen.empty();
        this.imageConfig = Codegen.empty();
        this.mode = Codegen.empty();
        this.modelDataUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPrimaryContainerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerHostname;
        private @Nullable Output<Map<String,String>> environment;
        private Output<String> image;
        private @Nullable Output<ModelPrimaryContainerImageConfigGetArgs> imageConfig;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> modelDataUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelPrimaryContainerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerHostname = defaults.containerHostname;
    	      this.environment = defaults.environment;
    	      this.image = defaults.image;
    	      this.imageConfig = defaults.imageConfig;
    	      this.mode = defaults.mode;
    	      this.modelDataUrl = defaults.modelDataUrl;
        }

        public Builder containerHostname(@Nullable Output<String> containerHostname) {
            this.containerHostname = containerHostname;
            return this;
        }
        public Builder containerHostname(@Nullable String containerHostname) {
            this.containerHostname = Codegen.ofNullable(containerHostname);
            return this;
        }
        public Builder environment(@Nullable Output<Map<String,String>> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable Map<String,String> environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder image(Output<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder image(String image) {
            this.image = Output.of(Objects.requireNonNull(image));
            return this;
        }
        public Builder imageConfig(@Nullable Output<ModelPrimaryContainerImageConfigGetArgs> imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }
        public Builder imageConfig(@Nullable ModelPrimaryContainerImageConfigGetArgs imageConfig) {
            this.imageConfig = Codegen.ofNullable(imageConfig);
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder modelDataUrl(@Nullable Output<String> modelDataUrl) {
            this.modelDataUrl = modelDataUrl;
            return this;
        }
        public Builder modelDataUrl(@Nullable String modelDataUrl) {
            this.modelDataUrl = Codegen.ofNullable(modelDataUrl);
            return this;
        }        public ModelPrimaryContainerGetArgs build() {
            return new ModelPrimaryContainerGetArgs(containerHostname, environment, image, imageConfig, mode, modelDataUrl);
        }
    }
}
