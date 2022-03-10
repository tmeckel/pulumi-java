// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Description of an a image to use during Skaffold rendering.
 * 
 */
public final class BuildArtifactResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuildArtifactResponse Empty = new BuildArtifactResponse();

    /**
     * Image name in Skaffold configuration.
     * 
     */
    @InputImport(name="image", required=true)
      private final String image;

    public String getImage() {
        return this.image;
    }

    /**
     * Image tag to use. This will generally be the full path to an image, such as "gcr.io/my-project/busybox:1.2.3" or "gcr.io/my-project/busybox@sha256:abc123".
     * 
     */
    @InputImport(name="tag", required=true)
      private final String tag;

    public String getTag() {
        return this.tag;
    }

    public BuildArtifactResponse(
        String image,
        String tag) {
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
    }

    private BuildArtifactResponse() {
        this.image = null;
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildArtifactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String image;
        private String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildArtifactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.tag = defaults.tag;
        }

        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public BuildArtifactResponse build() {
            return new BuildArtifactResponse(image, tag);
        }
    }
}
