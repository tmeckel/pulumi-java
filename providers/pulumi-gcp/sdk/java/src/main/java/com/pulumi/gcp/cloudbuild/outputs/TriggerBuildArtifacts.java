// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudbuild.outputs.TriggerBuildArtifactsObjects;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerBuildArtifacts {
    /**
     * @return A list of images to be pushed upon the successful completion of all build steps.
     * The images will be pushed using the builder service account&#39;s credentials.
     * The digests of the pushed images will be stored in the Build resource&#39;s results field.
     * If any of the images fail to be pushed, the build is marked FAILURE.
     * 
     */
    private final @Nullable List<String> images;
    /**
     * @return A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps.
     * Files in the workspace matching specified paths globs will be uploaded to the
     * Cloud Storage location using the builder service account&#39;s credentials.
     * The location and generation of the uploaded objects will be stored in the Build resource&#39;s results field.
     * If any objects fail to be pushed, the build is marked FAILURE.
     * Structure is documented below.
     * 
     */
    private final @Nullable TriggerBuildArtifactsObjects objects;

    @CustomType.Constructor
    private TriggerBuildArtifacts(
        @CustomType.Parameter("images") @Nullable List<String> images,
        @CustomType.Parameter("objects") @Nullable TriggerBuildArtifactsObjects objects) {
        this.images = images;
        this.objects = objects;
    }

    /**
     * @return A list of images to be pushed upon the successful completion of all build steps.
     * The images will be pushed using the builder service account&#39;s credentials.
     * The digests of the pushed images will be stored in the Build resource&#39;s results field.
     * If any of the images fail to be pushed, the build is marked FAILURE.
     * 
     */
    public List<String> images() {
        return this.images == null ? List.of() : this.images;
    }
    /**
     * @return A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps.
     * Files in the workspace matching specified paths globs will be uploaded to the
     * Cloud Storage location using the builder service account&#39;s credentials.
     * The location and generation of the uploaded objects will be stored in the Build resource&#39;s results field.
     * If any objects fail to be pushed, the build is marked FAILURE.
     * Structure is documented below.
     * 
     */
    public Optional<TriggerBuildArtifactsObjects> objects() {
        return Optional.ofNullable(this.objects);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildArtifacts defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> images;
        private @Nullable TriggerBuildArtifactsObjects objects;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildArtifacts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.images = defaults.images;
    	      this.objects = defaults.objects;
        }

        public Builder images(@Nullable List<String> images) {
            this.images = images;
            return this;
        }
        public Builder images(String... images) {
            return images(List.of(images));
        }
        public Builder objects(@Nullable TriggerBuildArtifactsObjects objects) {
            this.objects = objects;
            return this;
        }        public TriggerBuildArtifacts build() {
            return new TriggerBuildArtifacts(images, objects);
        }
    }
}
