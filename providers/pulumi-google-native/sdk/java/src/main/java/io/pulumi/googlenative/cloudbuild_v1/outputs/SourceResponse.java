// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.RepoSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.StorageSourceManifestResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.StorageSourceResponse;
import java.util.Objects;

@OutputCustomType
public final class SourceResponse {
    /**
     * If provided, get the source from this location in a Cloud Source Repository.
     * 
     */
    private final RepoSourceResponse repoSource;
    /**
     * If provided, get the source from this location in Google Cloud Storage.
     * 
     */
    private final StorageSourceResponse storageSource;
    /**
     * If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
     * 
     */
    private final StorageSourceManifestResponse storageSourceManifest;

    @OutputCustomType.Constructor
    private SourceResponse(
        @OutputCustomType.Parameter("repoSource") RepoSourceResponse repoSource,
        @OutputCustomType.Parameter("storageSource") StorageSourceResponse storageSource,
        @OutputCustomType.Parameter("storageSourceManifest") StorageSourceManifestResponse storageSourceManifest) {
        this.repoSource = repoSource;
        this.storageSource = storageSource;
        this.storageSourceManifest = storageSourceManifest;
    }

    /**
     * If provided, get the source from this location in a Cloud Source Repository.
     * 
    */
    public RepoSourceResponse getRepoSource() {
        return this.repoSource;
    }
    /**
     * If provided, get the source from this location in Google Cloud Storage.
     * 
    */
    public StorageSourceResponse getStorageSource() {
        return this.storageSource;
    }
    /**
     * If provided, get the source from this manifest in Google Cloud Storage. This feature is in Preview; see description [here](https://github.com/GoogleCloudPlatform/cloud-builders/tree/master/gcs-fetcher).
     * 
    */
    public StorageSourceManifestResponse getStorageSourceManifest() {
        return this.storageSourceManifest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoSourceResponse repoSource;
        private StorageSourceResponse storageSource;
        private StorageSourceManifestResponse storageSourceManifest;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repoSource = defaults.repoSource;
    	      this.storageSource = defaults.storageSource;
    	      this.storageSourceManifest = defaults.storageSourceManifest;
        }

        public Builder repoSource(RepoSourceResponse repoSource) {
            this.repoSource = Objects.requireNonNull(repoSource);
            return this;
        }

        public Builder storageSource(StorageSourceResponse storageSource) {
            this.storageSource = Objects.requireNonNull(storageSource);
            return this;
        }

        public Builder storageSourceManifest(StorageSourceManifestResponse storageSourceManifest) {
            this.storageSourceManifest = Objects.requireNonNull(storageSourceManifest);
            return this;
        }
        public SourceResponse build() {
            return new SourceResponse(repoSource, storageSource, storageSourceManifest);
        }
    }
}
