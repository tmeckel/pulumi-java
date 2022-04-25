// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs;
import com.pulumi.awsnative.sagemaker.inputs.AppImageConfigTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppImageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppImageConfigArgs Empty = new AppImageConfigArgs();

    /**
     * The Name of the AppImageConfig.
     * 
     */
    @Import(name="appImageConfigName")
    private @Nullable Output<String> appImageConfigName;

    /**
     * @return The Name of the AppImageConfig.
     * 
     */
    public Optional<Output<String>> appImageConfigName() {
        return Optional.ofNullable(this.appImageConfigName);
    }

    /**
     * The KernelGatewayImageConfig.
     * 
     */
    @Import(name="kernelGatewayImageConfig")
    private @Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig;

    /**
     * @return The KernelGatewayImageConfig.
     * 
     */
    public Optional<Output<AppImageConfigKernelGatewayImageConfigArgs>> kernelGatewayImageConfig() {
        return Optional.ofNullable(this.kernelGatewayImageConfig);
    }

    /**
     * A list of tags to apply to the AppImageConfig.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<AppImageConfigTagArgs>> tags;

    /**
     * @return A list of tags to apply to the AppImageConfig.
     * 
     */
    public Optional<Output<List<AppImageConfigTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AppImageConfigArgs() {}

    private AppImageConfigArgs(AppImageConfigArgs $) {
        this.appImageConfigName = $.appImageConfigName;
        this.kernelGatewayImageConfig = $.kernelGatewayImageConfig;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppImageConfigArgs $;

        public Builder() {
            $ = new AppImageConfigArgs();
        }

        public Builder(AppImageConfigArgs defaults) {
            $ = new AppImageConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appImageConfigName The Name of the AppImageConfig.
         * 
         * @return builder
         * 
         */
        public Builder appImageConfigName(@Nullable Output<String> appImageConfigName) {
            $.appImageConfigName = appImageConfigName;
            return this;
        }

        /**
         * @param appImageConfigName The Name of the AppImageConfig.
         * 
         * @return builder
         * 
         */
        public Builder appImageConfigName(String appImageConfigName) {
            return appImageConfigName(Output.of(appImageConfigName));
        }

        /**
         * @param kernelGatewayImageConfig The KernelGatewayImageConfig.
         * 
         * @return builder
         * 
         */
        public Builder kernelGatewayImageConfig(@Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig) {
            $.kernelGatewayImageConfig = kernelGatewayImageConfig;
            return this;
        }

        /**
         * @param kernelGatewayImageConfig The KernelGatewayImageConfig.
         * 
         * @return builder
         * 
         */
        public Builder kernelGatewayImageConfig(AppImageConfigKernelGatewayImageConfigArgs kernelGatewayImageConfig) {
            return kernelGatewayImageConfig(Output.of(kernelGatewayImageConfig));
        }

        /**
         * @param tags A list of tags to apply to the AppImageConfig.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<AppImageConfigTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to apply to the AppImageConfig.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<AppImageConfigTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to apply to the AppImageConfig.
         * 
         * @return builder
         * 
         */
        public Builder tags(AppImageConfigTagArgs... tags) {
            return tags(List.of(tags));
        }

        public AppImageConfigArgs build() {
            return $;
        }
    }

}
