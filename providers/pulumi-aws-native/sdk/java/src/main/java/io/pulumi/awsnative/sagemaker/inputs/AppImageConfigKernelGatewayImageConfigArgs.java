// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.AppImageConfigFileSystemConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.AppImageConfigKernelSpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app.
 * 
 */
public final class AppImageConfigKernelGatewayImageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigArgs Empty = new AppImageConfigKernelGatewayImageConfigArgs();

    /**
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * 
     */
    @Import(name="fileSystemConfig")
      private final @Nullable Output<AppImageConfigFileSystemConfigArgs> fileSystemConfig;

    public Output<AppImageConfigFileSystemConfigArgs> getFileSystemConfig() {
        return this.fileSystemConfig == null ? Codegen.empty() : this.fileSystemConfig;
    }

    /**
     * The specification of the Jupyter kernels in the image.
     * 
     */
    @Import(name="kernelSpecs", required=true)
      private final Output<List<AppImageConfigKernelSpecArgs>> kernelSpecs;

    public Output<List<AppImageConfigKernelSpecArgs>> getKernelSpecs() {
        return this.kernelSpecs;
    }

    public AppImageConfigKernelGatewayImageConfigArgs(
        @Nullable Output<AppImageConfigFileSystemConfigArgs> fileSystemConfig,
        Output<List<AppImageConfigKernelSpecArgs>> kernelSpecs) {
        this.fileSystemConfig = fileSystemConfig;
        this.kernelSpecs = Objects.requireNonNull(kernelSpecs, "expected parameter 'kernelSpecs' to be non-null");
    }

    private AppImageConfigKernelGatewayImageConfigArgs() {
        this.fileSystemConfig = Codegen.empty();
        this.kernelSpecs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AppImageConfigFileSystemConfigArgs> fileSystemConfig;
        private Output<List<AppImageConfigKernelSpecArgs>> kernelSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.kernelSpecs = defaults.kernelSpecs;
        }

        public Builder fileSystemConfig(@Nullable Output<AppImageConfigFileSystemConfigArgs> fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }
        public Builder fileSystemConfig(@Nullable AppImageConfigFileSystemConfigArgs fileSystemConfig) {
            this.fileSystemConfig = Codegen.ofNullable(fileSystemConfig);
            return this;
        }
        public Builder kernelSpecs(Output<List<AppImageConfigKernelSpecArgs>> kernelSpecs) {
            this.kernelSpecs = Objects.requireNonNull(kernelSpecs);
            return this;
        }
        public Builder kernelSpecs(List<AppImageConfigKernelSpecArgs> kernelSpecs) {
            this.kernelSpecs = Output.of(Objects.requireNonNull(kernelSpecs));
            return this;
        }
        public Builder kernelSpecs(AppImageConfigKernelSpecArgs... kernelSpecs) {
            return kernelSpecs(List.of(kernelSpecs));
        }        public AppImageConfigKernelGatewayImageConfigArgs build() {
            return new AppImageConfigKernelGatewayImageConfigArgs(fileSystemConfig, kernelSpecs);
        }
    }
}
