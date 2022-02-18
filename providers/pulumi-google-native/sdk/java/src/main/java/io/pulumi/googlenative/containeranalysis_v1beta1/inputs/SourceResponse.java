// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Source describes the location of the source used for the build.
 * 
 */
public final class SourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceResponse Empty = new SourceResponse();

    /**
     * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    @InputImport(name="additionalContexts", required=true)
    private final List<SourceContextResponse> additionalContexts;

    public List<SourceContextResponse> getAdditionalContexts() {
        return this.additionalContexts;
    }

    /**
     * If provided, the input binary artifacts for the build came from this location.
     * 
     */
    @InputImport(name="artifactStorageSourceUri", required=true)
    private final String artifactStorageSourceUri;

    public String getArtifactStorageSourceUri() {
        return this.artifactStorageSourceUri;
    }

    /**
     * If provided, the source code used for the build came from this location.
     * 
     */
    @InputImport(name="context", required=true)
    private final SourceContextResponse context;

    public SourceContextResponse getContext() {
        return this.context;
    }

    /**
     * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    @InputImport(name="fileHashes", required=true)
    private final Map<String,String> fileHashes;

    public Map<String,String> getFileHashes() {
        return this.fileHashes;
    }

    public SourceResponse(
        List<SourceContextResponse> additionalContexts,
        String artifactStorageSourceUri,
        SourceContextResponse context,
        Map<String,String> fileHashes) {
        this.additionalContexts = Objects.requireNonNull(additionalContexts, "expected parameter 'additionalContexts' to be non-null");
        this.artifactStorageSourceUri = Objects.requireNonNull(artifactStorageSourceUri, "expected parameter 'artifactStorageSourceUri' to be non-null");
        this.context = Objects.requireNonNull(context, "expected parameter 'context' to be non-null");
        this.fileHashes = Objects.requireNonNull(fileHashes, "expected parameter 'fileHashes' to be non-null");
    }

    private SourceResponse() {
        this.additionalContexts = List.of();
        this.artifactStorageSourceUri = null;
        this.context = null;
        this.fileHashes = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SourceContextResponse> additionalContexts;
        private String artifactStorageSourceUri;
        private SourceContextResponse context;
        private Map<String,String> fileHashes;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalContexts = defaults.additionalContexts;
    	      this.artifactStorageSourceUri = defaults.artifactStorageSourceUri;
    	      this.context = defaults.context;
    	      this.fileHashes = defaults.fileHashes;
        }

        public Builder setAdditionalContexts(List<SourceContextResponse> additionalContexts) {
            this.additionalContexts = Objects.requireNonNull(additionalContexts);
            return this;
        }

        public Builder setArtifactStorageSourceUri(String artifactStorageSourceUri) {
            this.artifactStorageSourceUri = Objects.requireNonNull(artifactStorageSourceUri);
            return this;
        }

        public Builder setContext(SourceContextResponse context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }

        public Builder setFileHashes(Map<String,String> fileHashes) {
            this.fileHashes = Objects.requireNonNull(fileHashes);
            return this;
        }

        public SourceResponse build() {
            return new SourceResponse(additionalContexts, artifactStorageSourceUri, context, fileHashes);
        }
    }
}
