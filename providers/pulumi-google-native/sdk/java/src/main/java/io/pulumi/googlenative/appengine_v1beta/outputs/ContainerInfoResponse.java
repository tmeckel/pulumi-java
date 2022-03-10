// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContainerInfoResponse {
    /**
     * URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: "gcr.io/my-project/image:tag" or "gcr.io/my-project/image@digest"
     * 
     */
    private final String image;

    @OutputCustomType.Constructor
    private ContainerInfoResponse(@OutputCustomType.Parameter("image") String image) {
        this.image = image;
    }

    /**
     * URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: "gcr.io/my-project/image:tag" or "gcr.io/my-project/image@digest"
     * 
    */
    public String getImage() {
        return this.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String image;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
        }

        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public ContainerInfoResponse build() {
            return new ContainerInfoResponse(image);
        }
    }
}
