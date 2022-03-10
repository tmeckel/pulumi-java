// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs();

    /**
     * Required. Bucket of the Cloud Storage object.
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
      private final @Nullable Input<Integer> generation;

    public Input<Integer> getGeneration() {
        return this.generation == null ? Input.empty() : this.generation;
    }

    /**
     * Required. Name of the Cloud Storage object.
     * 
     */
    @InputImport(name="object", required=true)
      private final Input<String> object;

    public Input<String> getObject() {
        return this.object;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs(
        Input<String> bucket,
        @Nullable Input<Integer> generation,
        Input<String> object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generation = generation;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs() {
        this.bucket = Input.empty();
        this.generation = Input.empty();
        this.object = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<Integer> generation;
        private Input<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder generation(@Nullable Input<Integer> generation) {
            this.generation = generation;
            return this;
        }

        public Builder generation(@Nullable Integer generation) {
            this.generation = Input.ofNullable(generation);
            return this;
        }

        public Builder object(Input<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder object(String object) {
            this.object = Input.of(Objects.requireNonNull(object));
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs(bucket, generation, object);
        }
    }
}
