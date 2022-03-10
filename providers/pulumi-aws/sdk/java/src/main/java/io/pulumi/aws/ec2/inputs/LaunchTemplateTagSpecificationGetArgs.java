// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="resourceType")
      private final @Nullable Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LaunchTemplateTagSpecificationGetArgs(
        @Nullable Input<String> resourceType,
        @Nullable Input<Map<String,String>> tags) {
        this.resourceType = resourceType;
        this.tags = tags;
    }

    private LaunchTemplateTagSpecificationGetArgs() {
        this.resourceType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateTagSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceType;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateTagSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder resourceType(@Nullable Input<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
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
        public LaunchTemplateTagSpecificationGetArgs build() {
            return new LaunchTemplateTagSpecificationGetArgs(resourceType, tags);
        }
    }
}
