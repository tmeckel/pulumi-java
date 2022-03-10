// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru;

import io.pulumi.awsnative.devopsguru.inputs.ResourceCollectionFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class ResourceCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceCollectionArgs Empty = new ResourceCollectionArgs();

    @InputImport(name="resourceCollectionFilter", required=true)
      private final Input<ResourceCollectionFilterArgs> resourceCollectionFilter;

    public Input<ResourceCollectionFilterArgs> getResourceCollectionFilter() {
        return this.resourceCollectionFilter;
    }

    public ResourceCollectionArgs(Input<ResourceCollectionFilterArgs> resourceCollectionFilter) {
        this.resourceCollectionFilter = Objects.requireNonNull(resourceCollectionFilter, "expected parameter 'resourceCollectionFilter' to be non-null");
    }

    private ResourceCollectionArgs() {
        this.resourceCollectionFilter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ResourceCollectionFilterArgs> resourceCollectionFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceCollectionFilter = defaults.resourceCollectionFilter;
        }

        public Builder resourceCollectionFilter(Input<ResourceCollectionFilterArgs> resourceCollectionFilter) {
            this.resourceCollectionFilter = Objects.requireNonNull(resourceCollectionFilter);
            return this;
        }

        public Builder resourceCollectionFilter(ResourceCollectionFilterArgs resourceCollectionFilter) {
            this.resourceCollectionFilter = Input.of(Objects.requireNonNull(resourceCollectionFilter));
            return this;
        }
        public ResourceCollectionArgs build() {
            return new ResourceCollectionArgs(resourceCollectionFilter);
        }
    }
}
