// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.DerivedResponse;
import java.util.Objects;


/**
 * Details of an image occurrence.
 * 
 */
public final class GrafeasV1beta1ImageDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GrafeasV1beta1ImageDetailsResponse Empty = new GrafeasV1beta1ImageDetailsResponse();

    /**
     * Immutable. The child image derived from the base image.
     * 
     */
    @InputImport(name="derivedImage", required=true)
    private final DerivedResponse derivedImage;

    public DerivedResponse getDerivedImage() {
        return this.derivedImage;
    }

    public GrafeasV1beta1ImageDetailsResponse(DerivedResponse derivedImage) {
        this.derivedImage = Objects.requireNonNull(derivedImage, "expected parameter 'derivedImage' to be non-null");
    }

    private GrafeasV1beta1ImageDetailsResponse() {
        this.derivedImage = null;
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

        public Builder setDerivedImage(DerivedResponse derivedImage) {
            this.derivedImage = Objects.requireNonNull(derivedImage);
            return this;
        }

        public GrafeasV1beta1ImageDetailsResponse build() {
            return new GrafeasV1beta1ImageDetailsResponse(derivedImage);
        }
    }
}
