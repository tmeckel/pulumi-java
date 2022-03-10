// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness;

import io.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSetArgs Empty = new ResourceSetArgs();

    /**
     * Unique name describing the resource set.
     * 
     */
    @InputImport(name="resourceSetName", required=true)
      private final Input<String> resourceSetName;

    public Input<String> getResourceSetName() {
        return this.resourceSetName;
    }

    /**
     * Type of the resources in the resource set.
     * 
     */
    @InputImport(name="resourceSetType", required=true)
      private final Input<String> resourceSetType;

    public Input<String> getResourceSetType() {
        return this.resourceSetType;
    }

    /**
     * List of resources to add to this resource set. See below.
     * 
     */
    @InputImport(name="resources", required=true)
      private final Input<List<ResourceSetResourceArgs>> resources;

    public Input<List<ResourceSetResourceArgs>> getResources() {
        return this.resources;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ResourceSetArgs(
        Input<String> resourceSetName,
        Input<String> resourceSetType,
        Input<List<ResourceSetResourceArgs>> resources,
        @Nullable Input<Map<String,String>> tags) {
        this.resourceSetName = Objects.requireNonNull(resourceSetName, "expected parameter 'resourceSetName' to be non-null");
        this.resourceSetType = Objects.requireNonNull(resourceSetType, "expected parameter 'resourceSetType' to be non-null");
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.tags = tags;
    }

    private ResourceSetArgs() {
        this.resourceSetName = Input.empty();
        this.resourceSetType = Input.empty();
        this.resources = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceSetName;
        private Input<String> resourceSetType;
        private Input<List<ResourceSetResourceArgs>> resources;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceSetName = defaults.resourceSetName;
    	      this.resourceSetType = defaults.resourceSetType;
    	      this.resources = defaults.resources;
    	      this.tags = defaults.tags;
        }

        public Builder resourceSetName(Input<String> resourceSetName) {
            this.resourceSetName = Objects.requireNonNull(resourceSetName);
            return this;
        }

        public Builder resourceSetName(String resourceSetName) {
            this.resourceSetName = Input.of(Objects.requireNonNull(resourceSetName));
            return this;
        }

        public Builder resourceSetType(Input<String> resourceSetType) {
            this.resourceSetType = Objects.requireNonNull(resourceSetType);
            return this;
        }

        public Builder resourceSetType(String resourceSetType) {
            this.resourceSetType = Input.of(Objects.requireNonNull(resourceSetType));
            return this;
        }

        public Builder resources(Input<List<ResourceSetResourceArgs>> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder resources(List<ResourceSetResourceArgs> resources) {
            this.resources = Input.of(Objects.requireNonNull(resources));
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
        public ResourceSetArgs build() {
            return new ResourceSetArgs(resourceSetName, resourceSetType, resources, tags);
        }
    }
}
