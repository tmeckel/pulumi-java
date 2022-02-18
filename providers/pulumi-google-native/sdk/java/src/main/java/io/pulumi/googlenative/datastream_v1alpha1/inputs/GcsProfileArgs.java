// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud Storage bucket profile.
 * 
 */
public final class GcsProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcsProfileArgs Empty = new GcsProfileArgs();

    /**
     * The full project and resource path for Cloud Storage bucket including the name.
     * 
     */
    @InputImport(name="bucketName", required=true)
    private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * The root path inside the Cloud Storage bucket.
     * 
     */
    @InputImport(name="rootPath")
    private final @Nullable Input<String> rootPath;

    public Input<String> getRootPath() {
        return this.rootPath == null ? Input.empty() : this.rootPath;
    }

    public GcsProfileArgs(
        Input<String> bucketName,
        @Nullable Input<String> rootPath) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.rootPath = rootPath;
    }

    private GcsProfileArgs() {
        this.bucketName = Input.empty();
        this.rootPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketName;
        private @Nullable Input<String> rootPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.rootPath = defaults.rootPath;
        }

        public Builder setBucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setRootPath(@Nullable Input<String> rootPath) {
            this.rootPath = rootPath;
            return this;
        }

        public Builder setRootPath(@Nullable String rootPath) {
            this.rootPath = Input.ofNullable(rootPath);
            return this;
        }

        public GcsProfileArgs build() {
            return new GcsProfileArgs(bucketName, rootPath);
        }
    }
}
