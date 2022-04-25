// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SourceResponse {
    /**
     * @return If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    private final List<SourceContextResponse> additionalContexts;
    /**
     * @return If provided, the input binary artifacts for the build came from this location.
     * 
     */
    private final String artifactStorageSourceUri;
    /**
     * @return If provided, the source code used for the build came from this location.
     * 
     */
    private final SourceContextResponse context;
    /**
     * @return Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    private final Map<String,String> fileHashes;

    @CustomType.Constructor
    private SourceResponse(
        @CustomType.Parameter("additionalContexts") List<SourceContextResponse> additionalContexts,
        @CustomType.Parameter("artifactStorageSourceUri") String artifactStorageSourceUri,
        @CustomType.Parameter("context") SourceContextResponse context,
        @CustomType.Parameter("fileHashes") Map<String,String> fileHashes) {
        this.additionalContexts = additionalContexts;
        this.artifactStorageSourceUri = artifactStorageSourceUri;
        this.context = context;
        this.fileHashes = fileHashes;
    }

    /**
     * @return If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
     * 
     */
    public List<SourceContextResponse> additionalContexts() {
        return this.additionalContexts;
    }
    /**
     * @return If provided, the input binary artifacts for the build came from this location.
     * 
     */
    public String artifactStorageSourceUri() {
        return this.artifactStorageSourceUri;
    }
    /**
     * @return If provided, the source code used for the build came from this location.
     * 
     */
    public SourceContextResponse context() {
        return this.context;
    }
    /**
     * @return Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build. The keys to this map are file paths used as build source and the values contain the hash values for those files. If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
     * 
     */
    public Map<String,String> fileHashes() {
        return this.fileHashes;
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

        public Builder additionalContexts(List<SourceContextResponse> additionalContexts) {
            this.additionalContexts = Objects.requireNonNull(additionalContexts);
            return this;
        }
        public Builder additionalContexts(SourceContextResponse... additionalContexts) {
            return additionalContexts(List.of(additionalContexts));
        }
        public Builder artifactStorageSourceUri(String artifactStorageSourceUri) {
            this.artifactStorageSourceUri = Objects.requireNonNull(artifactStorageSourceUri);
            return this;
        }
        public Builder context(SourceContextResponse context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }
        public Builder fileHashes(Map<String,String> fileHashes) {
            this.fileHashes = Objects.requireNonNull(fileHashes);
            return this;
        }        public SourceResponse build() {
            return new SourceResponse(additionalContexts, artifactStorageSourceUri, context, fileHashes);
        }
    }
}
