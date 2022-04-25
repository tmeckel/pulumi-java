// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Location of the source manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
 * 
 */
public final class StorageSourceManifestArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageSourceManifestArgs Empty = new StorageSourceManifestArgs();

    /**
     * Google Cloud Storage bucket containing the source manifest (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return Google Cloud Storage bucket containing the source manifest (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    /**
     * @return Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
     * 
     */
    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * Google Cloud Storage object containing the source manifest. This object must be a JSON file.
     * 
     */
    @Import(name="object")
    private @Nullable Output<String> object;

    /**
     * @return Google Cloud Storage object containing the source manifest. This object must be a JSON file.
     * 
     */
    public Optional<Output<String>> object() {
        return Optional.ofNullable(this.object);
    }

    private StorageSourceManifestArgs() {}

    private StorageSourceManifestArgs(StorageSourceManifestArgs $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageSourceManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageSourceManifestArgs $;

        public Builder() {
            $ = new StorageSourceManifestArgs();
        }

        public Builder(StorageSourceManifestArgs defaults) {
            $ = new StorageSourceManifestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Google Cloud Storage bucket containing the source manifest (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Google Cloud Storage bucket containing the source manifest (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param generation Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param object Google Cloud Storage object containing the source manifest. This object must be a JSON file.
         * 
         * @return builder
         * 
         */
        public Builder object(@Nullable Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object Google Cloud Storage object containing the source manifest. This object must be a JSON file.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        public StorageSourceManifestArgs build() {
            return $;
        }
    }

}
