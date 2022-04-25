// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.outputs;

import com.pulumi.awsnative.imagebuilder.outputs.ContainerRecipeInstanceBlockDeviceMapping;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerRecipeInstanceConfiguration {
    /**
     * @return Defines the block devices to attach for building an instance from this Image Builder AMI.
     * 
     */
    private final @Nullable List<ContainerRecipeInstanceBlockDeviceMapping> blockDeviceMappings;
    /**
     * @return The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
     * 
     */
    private final @Nullable String image;

    @CustomType.Constructor
    private ContainerRecipeInstanceConfiguration(
        @CustomType.Parameter("blockDeviceMappings") @Nullable List<ContainerRecipeInstanceBlockDeviceMapping> blockDeviceMappings,
        @CustomType.Parameter("image") @Nullable String image) {
        this.blockDeviceMappings = blockDeviceMappings;
        this.image = image;
    }

    /**
     * @return Defines the block devices to attach for building an instance from this Image Builder AMI.
     * 
     */
    public List<ContainerRecipeInstanceBlockDeviceMapping> blockDeviceMappings() {
        return this.blockDeviceMappings == null ? List.of() : this.blockDeviceMappings;
    }
    /**
     * @return The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeInstanceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ContainerRecipeInstanceBlockDeviceMapping> blockDeviceMappings;
        private @Nullable String image;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeInstanceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.image = defaults.image;
        }

        public Builder blockDeviceMappings(@Nullable List<ContainerRecipeInstanceBlockDeviceMapping> blockDeviceMappings) {
            this.blockDeviceMappings = blockDeviceMappings;
            return this;
        }
        public Builder blockDeviceMappings(ContainerRecipeInstanceBlockDeviceMapping... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }
        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }        public ContainerRecipeInstanceConfiguration build() {
            return new ContainerRecipeInstanceConfiguration(blockDeviceMappings, image);
        }
    }
}
