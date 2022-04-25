// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CapacityProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final CapacityProviderArgs Empty = new CapacityProviderArgs();

    /**
     * Configuration block for the provider for the ECS auto scaling group. Detailed below.
     * 
     */
    @Import(name="autoScalingGroupProvider", required=true)
    private Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider;

    /**
     * @return Configuration block for the provider for the ECS auto scaling group. Detailed below.
     * 
     */
    public Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider() {
        return this.autoScalingGroupProvider;
    }

    /**
     * Name of the capacity provider.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the capacity provider.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CapacityProviderArgs() {}

    private CapacityProviderArgs(CapacityProviderArgs $) {
        this.autoScalingGroupProvider = $.autoScalingGroupProvider;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CapacityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapacityProviderArgs $;

        public Builder() {
            $ = new CapacityProviderArgs();
        }

        public Builder(CapacityProviderArgs defaults) {
            $ = new CapacityProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoScalingGroupProvider Configuration block for the provider for the ECS auto scaling group. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingGroupProvider(Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider) {
            $.autoScalingGroupProvider = autoScalingGroupProvider;
            return this;
        }

        /**
         * @param autoScalingGroupProvider Configuration block for the provider for the ECS auto scaling group. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingGroupProvider(CapacityProviderAutoScalingGroupProviderArgs autoScalingGroupProvider) {
            return autoScalingGroupProvider(Output.of(autoScalingGroupProvider));
        }

        /**
         * @param name Name of the capacity provider.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the capacity provider.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CapacityProviderArgs build() {
            $.autoScalingGroupProvider = Objects.requireNonNull($.autoScalingGroupProvider, "expected parameter 'autoScalingGroupProvider' to be non-null");
            return $;
        }
    }

}
