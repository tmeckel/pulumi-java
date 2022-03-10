// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigState extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigState Empty = new AppImageConfigState();

    /**
     * The name of the App Image Config.
     * 
     */
    @InputImport(name="appImageConfigName")
      private final @Nullable Input<String> appImageConfigName;

    public Input<String> getAppImageConfigName() {
        return this.appImageConfigName == null ? Input.empty() : this.appImageConfigName;
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this App Image Config.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * 
     */
    @InputImport(name="kernelGatewayImageConfig")
      private final @Nullable Input<AppImageConfigKernelGatewayImageConfigGetArgs> kernelGatewayImageConfig;

    public Input<AppImageConfigKernelGatewayImageConfigGetArgs> getKernelGatewayImageConfig() {
        return this.kernelGatewayImageConfig == null ? Input.empty() : this.kernelGatewayImageConfig;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public AppImageConfigState(
        @Nullable Input<String> appImageConfigName,
        @Nullable Input<String> arn,
        @Nullable Input<AppImageConfigKernelGatewayImageConfigGetArgs> kernelGatewayImageConfig,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.appImageConfigName = appImageConfigName;
        this.arn = arn;
        this.kernelGatewayImageConfig = kernelGatewayImageConfig;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private AppImageConfigState() {
        this.appImageConfigName = Input.empty();
        this.arn = Input.empty();
        this.kernelGatewayImageConfig = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appImageConfigName;
        private @Nullable Input<String> arn;
        private @Nullable Input<AppImageConfigKernelGatewayImageConfigGetArgs> kernelGatewayImageConfig;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appImageConfigName = defaults.appImageConfigName;
    	      this.arn = defaults.arn;
    	      this.kernelGatewayImageConfig = defaults.kernelGatewayImageConfig;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder appImageConfigName(@Nullable Input<String> appImageConfigName) {
            this.appImageConfigName = appImageConfigName;
            return this;
        }

        public Builder appImageConfigName(@Nullable String appImageConfigName) {
            this.appImageConfigName = Input.ofNullable(appImageConfigName);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder kernelGatewayImageConfig(@Nullable Input<AppImageConfigKernelGatewayImageConfigGetArgs> kernelGatewayImageConfig) {
            this.kernelGatewayImageConfig = kernelGatewayImageConfig;
            return this;
        }

        public Builder kernelGatewayImageConfig(@Nullable AppImageConfigKernelGatewayImageConfigGetArgs kernelGatewayImageConfig) {
            this.kernelGatewayImageConfig = Input.ofNullable(kernelGatewayImageConfig);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public AppImageConfigState build() {
            return new AppImageConfigState(appImageConfigName, arn, kernelGatewayImageConfig, tags, tagsAll);
        }
    }
}
