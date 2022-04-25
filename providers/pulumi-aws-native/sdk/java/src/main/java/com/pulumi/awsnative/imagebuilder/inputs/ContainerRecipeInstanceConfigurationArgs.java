// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.inputs;

import com.pulumi.awsnative.imagebuilder.inputs.ContainerRecipeInstanceBlockDeviceMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A group of options that can be used to configure an instance for building and testing container images.
 * 
 */
public final class ContainerRecipeInstanceConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeInstanceConfigurationArgs Empty = new ContainerRecipeInstanceConfigurationArgs();

    /**
     * Defines the block devices to attach for building an instance from this Image Builder AMI.
     * 
     */
    @Import(name="blockDeviceMappings")
    private @Nullable Output<List<ContainerRecipeInstanceBlockDeviceMappingArgs>> blockDeviceMappings;

    /**
     * @return Defines the block devices to attach for building an instance from this Image Builder AMI.
     * 
     */
    public Optional<Output<List<ContainerRecipeInstanceBlockDeviceMappingArgs>>> blockDeviceMappings() {
        return Optional.ofNullable(this.blockDeviceMappings);
    }

    /**
     * The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    private ContainerRecipeInstanceConfigurationArgs() {}

    private ContainerRecipeInstanceConfigurationArgs(ContainerRecipeInstanceConfigurationArgs $) {
        this.blockDeviceMappings = $.blockDeviceMappings;
        this.image = $.image;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerRecipeInstanceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerRecipeInstanceConfigurationArgs $;

        public Builder() {
            $ = new ContainerRecipeInstanceConfigurationArgs();
        }

        public Builder(ContainerRecipeInstanceConfigurationArgs defaults) {
            $ = new ContainerRecipeInstanceConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockDeviceMappings Defines the block devices to attach for building an instance from this Image Builder AMI.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(@Nullable Output<List<ContainerRecipeInstanceBlockDeviceMappingArgs>> blockDeviceMappings) {
            $.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        /**
         * @param blockDeviceMappings Defines the block devices to attach for building an instance from this Image Builder AMI.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(List<ContainerRecipeInstanceBlockDeviceMappingArgs> blockDeviceMappings) {
            return blockDeviceMappings(Output.of(blockDeviceMappings));
        }

        /**
         * @param blockDeviceMappings Defines the block devices to attach for building an instance from this Image Builder AMI.
         * 
         * @return builder
         * 
         */
        public Builder blockDeviceMappings(ContainerRecipeInstanceBlockDeviceMappingArgs... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }

        /**
         * @param image The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        public ContainerRecipeInstanceConfigurationArgs build() {
            return $;
        }
    }

}
