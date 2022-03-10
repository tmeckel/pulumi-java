// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.ImageOutputResourceAmi;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageOutputResource {
    /**
     * Set of objects with each Amazon Machine Image (AMI) created.
     * 
     */
    private final @Nullable List<ImageOutputResourceAmi> amis;

    @OutputCustomType.Constructor
    private ImageOutputResource(@OutputCustomType.Parameter("amis") @Nullable List<ImageOutputResourceAmi> amis) {
        this.amis = amis;
    }

    /**
     * Set of objects with each Amazon Machine Image (AMI) created.
     * 
    */
    public List<ImageOutputResourceAmi> getAmis() {
        return this.amis == null ? List.of() : this.amis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageOutputResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ImageOutputResourceAmi> amis;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageOutputResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amis = defaults.amis;
        }

        public Builder amis(@Nullable List<ImageOutputResourceAmi> amis) {
            this.amis = amis;
            return this;
        }
        public ImageOutputResource build() {
            return new ImageOutputResource(amis);
        }
    }
}
