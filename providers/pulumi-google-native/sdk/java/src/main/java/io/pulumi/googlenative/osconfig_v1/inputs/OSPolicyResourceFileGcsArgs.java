// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies a file available as a Cloud Storage Object.
 * 
 */
public final class OSPolicyResourceFileGcsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceFileGcsArgs Empty = new OSPolicyResourceFileGcsArgs();

    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    @InputImport(name="generation")
    private final @Nullable Input<String> generation;

    public Input<String> getGeneration() {
        return this.generation == null ? Input.empty() : this.generation;
    }

    /**
     * Name of the Cloud Storage object.
     * 
     */
    @InputImport(name="object", required=true)
    private final Input<String> object;

    public Input<String> getObject() {
        return this.object;
    }

    public OSPolicyResourceFileGcsArgs(
        Input<String> bucket,
        @Nullable Input<String> generation,
        Input<String> object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generation = generation;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private OSPolicyResourceFileGcsArgs() {
        this.bucket = Input.empty();
        this.generation = Input.empty();
        this.object = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileGcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<String> generation;
        private Input<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileGcsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setGeneration(@Nullable Input<String> generation) {
            this.generation = generation;
            return this;
        }

        public Builder setGeneration(@Nullable String generation) {
            this.generation = Input.ofNullable(generation);
            return this;
        }

        public Builder setObject(Input<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Input.of(Objects.requireNonNull(object));
            return this;
        }

        public OSPolicyResourceFileGcsArgs build() {
            return new OSPolicyResourceFileGcsArgs(bucket, generation, object);
        }
    }
}
