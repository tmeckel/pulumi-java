// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.ImageAnnotationType;
import io.pulumi.azurenative.machinelearningservices.enums.MediaType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LabelingJobImagePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelingJobImagePropertiesArgs Empty = new LabelingJobImagePropertiesArgs();

    /**
     * Annotation type of image labeling tasks.
     * 
     */
    @InputImport(name="annotationType")
      private final @Nullable Input<Either<String,ImageAnnotationType>> annotationType;

    public Input<Either<String,ImageAnnotationType>> getAnnotationType() {
        return this.annotationType == null ? Input.empty() : this.annotationType;
    }

    /**
     * Media type of data asset.
     * 
     */
    @InputImport(name="mediaType", required=true)
      private final Input<Either<String,MediaType>> mediaType;

    public Input<Either<String,MediaType>> getMediaType() {
        return this.mediaType;
    }

    public LabelingJobImagePropertiesArgs(
        @Nullable Input<Either<String,ImageAnnotationType>> annotationType,
        Input<Either<String,MediaType>> mediaType) {
        this.annotationType = annotationType;
        this.mediaType = Objects.requireNonNull(mediaType, "expected parameter 'mediaType' to be non-null");
    }

    private LabelingJobImagePropertiesArgs() {
        this.annotationType = Input.empty();
        this.mediaType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobImagePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ImageAnnotationType>> annotationType;
        private Input<Either<String,MediaType>> mediaType;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobImagePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationType = defaults.annotationType;
    	      this.mediaType = defaults.mediaType;
        }

        public Builder annotationType(@Nullable Input<Either<String,ImageAnnotationType>> annotationType) {
            this.annotationType = annotationType;
            return this;
        }

        public Builder annotationType(@Nullable Either<String,ImageAnnotationType> annotationType) {
            this.annotationType = Input.ofNullable(annotationType);
            return this;
        }

        public Builder mediaType(Input<Either<String,MediaType>> mediaType) {
            this.mediaType = Objects.requireNonNull(mediaType);
            return this;
        }

        public Builder mediaType(Either<String,MediaType> mediaType) {
            this.mediaType = Input.of(Objects.requireNonNull(mediaType));
            return this;
        }
        public LabelingJobImagePropertiesArgs build() {
            return new LabelingJobImagePropertiesArgs(annotationType, mediaType);
        }
    }
}
