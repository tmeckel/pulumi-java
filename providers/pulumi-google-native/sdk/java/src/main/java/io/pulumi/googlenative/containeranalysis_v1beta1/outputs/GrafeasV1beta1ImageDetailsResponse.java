// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.DerivedResponse;
import java.util.Objects;

@OutputCustomType
public final class GrafeasV1beta1ImageDetailsResponse {
    /**
     * Immutable. The child image derived from the base image.
     * 
     */
    private final DerivedResponse derivedImage;

    @OutputCustomType.Constructor
    private GrafeasV1beta1ImageDetailsResponse(@OutputCustomType.Parameter("derivedImage") DerivedResponse derivedImage) {
        this.derivedImage = derivedImage;
    }

    /**
     * Immutable. The child image derived from the base image.
     * 
    */
    public DerivedResponse getDerivedImage() {
        return this.derivedImage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1ImageDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DerivedResponse derivedImage;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1ImageDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.derivedImage = defaults.derivedImage;
        }

        public Builder derivedImage(DerivedResponse derivedImage) {
            this.derivedImage = Objects.requireNonNull(derivedImage);
            return this;
        }
        public GrafeasV1beta1ImageDetailsResponse build() {
            return new GrafeasV1beta1ImageDetailsResponse(derivedImage);
        }
    }
}
