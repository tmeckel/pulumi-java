// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.inputs.ArtifactObjectsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Artifacts produced by a build that should be uploaded upon successful completion of all build steps.
 * 
 */
public final class ArtifactsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ArtifactsResponse Empty = new ArtifactsResponse();

    /**
     * A list of images to be pushed upon the successful completion of all build steps. The images will be pushed using the builder service account's credentials. The digests of the pushed images will be stored in the Build resource's results field. If any of the images fail to be pushed, the build is marked FAILURE.
     * 
     */
    @InputImport(name="images", required=true)
      private final List<String> images;

    public List<String> getImages() {
        return this.images;
    }

    /**
     * A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps. Files in the workspace matching specified paths globs will be uploaded to the specified Cloud Storage location using the builder service account's credentials. The location and generation of the uploaded objects will be stored in the Build resource's results field. If any objects fail to be pushed, the build is marked FAILURE.
     * 
     */
    @InputImport(name="objects", required=true)
      private final ArtifactObjectsResponse objects;

    public ArtifactObjectsResponse getObjects() {
        return this.objects;
    }

    public ArtifactsResponse(
        List<String> images,
        ArtifactObjectsResponse objects) {
        this.images = Objects.requireNonNull(images, "expected parameter 'images' to be non-null");
        this.objects = Objects.requireNonNull(objects, "expected parameter 'objects' to be non-null");
    }

    private ArtifactsResponse() {
        this.images = List.of();
        this.objects = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> images;
        private ArtifactObjectsResponse objects;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.images = defaults.images;
    	      this.objects = defaults.objects;
        }

        public Builder images(List<String> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }

        public Builder objects(ArtifactObjectsResponse objects) {
            this.objects = Objects.requireNonNull(objects);
            return this;
        }
        public ArtifactsResponse build() {
            return new ArtifactsResponse(images, objects);
        }
    }
}
