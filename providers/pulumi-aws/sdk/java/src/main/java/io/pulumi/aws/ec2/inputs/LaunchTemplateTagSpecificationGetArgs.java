// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchTemplateTagSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateTagSpecificationGetArgs Empty = new LaunchTemplateTagSpecificationGetArgs();

    /**
     * The type of resource to tag.
     * 
     */
    @Import(name="resourceType")
      private final @Nullable Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType == null ? Codegen.empty() : this.resourceType;
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public LaunchTemplateTagSpecificationGetArgs(
        @Nullable Output<String> resourceType,
        @Nullable Output<Map<String,String>> tags) {
        this.resourceType = resourceType;
        this.tags = tags;
    }

    private LaunchTemplateTagSpecificationGetArgs() {
        this.resourceType = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateTagSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceType;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateTagSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder resourceType(@Nullable Output<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Codegen.ofNullable(resourceType);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public LaunchTemplateTagSpecificationGetArgs build() {
            return new LaunchTemplateTagSpecificationGetArgs(resourceType, tags);
        }
    }
}
