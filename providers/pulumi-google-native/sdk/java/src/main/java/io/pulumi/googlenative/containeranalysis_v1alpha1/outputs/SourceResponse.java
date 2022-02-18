// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RepoSourceResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.StorageSourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SourceResponse {
    /**
     * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    private final List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> additionalContexts;
    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
     */
    private final StorageSourceResponse artifactStorageSource;
    /**
     * If provided, the source code used for the build came from this location.
     * 
     */
    private final GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse context;
    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    private final Map<String,String> fileHashes;
    /**
     * If provided, get source from this location in a Cloud Repo.
     * 
     */
    private final RepoSourceResponse repoSource;
    /**
     * If provided, get the source from this location in in Google Cloud Storage.
     * 
     */
    private final StorageSourceResponse storageSource;

    @OutputCustomType.Constructor({"additionalContexts","artifactStorageSource","context","fileHashes","repoSource","storageSource"})
    private SourceResponse(
        List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> additionalContexts,
        StorageSourceResponse artifactStorageSource,
        GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse context,
        Map<String,String> fileHashes,
        RepoSourceResponse repoSource,
        StorageSourceResponse storageSource) {
        this.additionalContexts = Objects.requireNonNull(additionalContexts);
        this.artifactStorageSource = Objects.requireNonNull(artifactStorageSource);
        this.context = Objects.requireNonNull(context);
        this.fileHashes = Objects.requireNonNull(fileHashes);
        this.repoSource = Objects.requireNonNull(repoSource);
        this.storageSource = Objects.requireNonNull(storageSource);
    }

    /**
     * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    public List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> getAdditionalContexts() {
        return this.additionalContexts;
    }
    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
     */
    public StorageSourceResponse getArtifactStorageSource() {
        return this.artifactStorageSource;
    }
    /**
     * If provided, the source code used for the build came from this location.
     * 
     */
    public GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse getContext() {
        return this.context;
    }
    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    public Map<String,String> getFileHashes() {
        return this.fileHashes;
    }
    /**
     * If provided, get source from this location in a Cloud Repo.
     * 
     */
    public RepoSourceResponse getRepoSource() {
        return this.repoSource;
    }
    /**
     * If provided, get the source from this location in in Google Cloud Storage.
     * 
     */
    public StorageSourceResponse getStorageSource() {
        return this.storageSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> additionalContexts;
        private StorageSourceResponse artifactStorageSource;
        private GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse context;
        private Map<String,String> fileHashes;
        private RepoSourceResponse repoSource;
        private StorageSourceResponse storageSource;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalContexts = defaults.additionalContexts;
    	      this.artifactStorageSource = defaults.artifactStorageSource;
    	      this.context = defaults.context;
    	      this.fileHashes = defaults.fileHashes;
    	      this.repoSource = defaults.repoSource;
    	      this.storageSource = defaults.storageSource;
        }

        public Builder setAdditionalContexts(List<GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse> additionalContexts) {
            this.additionalContexts = Objects.requireNonNull(additionalContexts);
            return this;
        }

        public Builder setArtifactStorageSource(StorageSourceResponse artifactStorageSource) {
            this.artifactStorageSource = Objects.requireNonNull(artifactStorageSource);
            return this;
        }

        public Builder setContext(GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }

        public Builder setFileHashes(Map<String,String> fileHashes) {
            this.fileHashes = Objects.requireNonNull(fileHashes);
            return this;
        }

        public Builder setRepoSource(RepoSourceResponse repoSource) {
            this.repoSource = Objects.requireNonNull(repoSource);
            return this;
        }

        public Builder setStorageSource(StorageSourceResponse storageSource) {
            this.storageSource = Objects.requireNonNull(storageSource);
            return this;
        }

        public SourceResponse build() {
            return new SourceResponse(additionalContexts, artifactStorageSource, context, fileHashes, repoSource, storageSource);
        }
    }
}
