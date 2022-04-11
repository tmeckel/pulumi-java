// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.ecs.inputs.CapacityProviderAutoScalingGroupProviderArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapacityProviderArgs Empty = new CapacityProviderArgs();

    /**
     * Configuration block for the provider for the ECS auto scaling group. Detailed below.
     * 
     */
    @Import(name="autoScalingGroupProvider", required=true)
      private final Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider;

    public Output<CapacityProviderAutoScalingGroupProviderArgs> getAutoScalingGroupProvider() {
        return this.autoScalingGroupProvider;
    }

    /**
     * Name of the capacity provider.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public CapacityProviderArgs(
        Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.autoScalingGroupProvider = Objects.requireNonNull(autoScalingGroupProvider, "expected parameter 'autoScalingGroupProvider' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private CapacityProviderArgs() {
        this.autoScalingGroupProvider = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupProvider = defaults.autoScalingGroupProvider;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder autoScalingGroupProvider(Output<CapacityProviderAutoScalingGroupProviderArgs> autoScalingGroupProvider) {
            this.autoScalingGroupProvider = Objects.requireNonNull(autoScalingGroupProvider);
            return this;
        }
        public Builder autoScalingGroupProvider(CapacityProviderAutoScalingGroupProviderArgs autoScalingGroupProvider) {
            this.autoScalingGroupProvider = Output.of(Objects.requireNonNull(autoScalingGroupProvider));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public CapacityProviderArgs build() {
            return new CapacityProviderArgs(autoScalingGroupProvider, name, tags);
        }
    }
}
