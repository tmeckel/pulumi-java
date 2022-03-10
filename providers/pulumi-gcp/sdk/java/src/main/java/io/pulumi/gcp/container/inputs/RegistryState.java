// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryState extends io.pulumi.resources.ResourceArgs {

    public static final RegistryState Empty = new RegistryState();

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="bucketSelfLink")
      private final @Nullable Input<String> bucketSelfLink;

    public Input<String> getBucketSelfLink() {
        return this.bucketSelfLink == null ? Input.empty() : this.bucketSelfLink;
    }

    /**
     * The location of the registry. One of `ASIA`, `EU`, `US` or not specified. See [the official documentation](https://cloud.google.com/container-registry/docs/pushing-and-pulling#pushing_an_image_to_a_registry) for more information on registry locations.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public RegistryState(
        @Nullable Input<String> bucketSelfLink,
        @Nullable Input<String> location,
        @Nullable Input<String> project) {
        this.bucketSelfLink = bucketSelfLink;
        this.location = location;
        this.project = project;
    }

    private RegistryState() {
        this.bucketSelfLink = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketSelfLink;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSelfLink = defaults.bucketSelfLink;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder bucketSelfLink(@Nullable Input<String> bucketSelfLink) {
            this.bucketSelfLink = bucketSelfLink;
            return this;
        }

        public Builder bucketSelfLink(@Nullable String bucketSelfLink) {
            this.bucketSelfLink = Input.ofNullable(bucketSelfLink);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public RegistryState build() {
            return new RegistryState(bucketSelfLink, location, project);
        }
    }
}
