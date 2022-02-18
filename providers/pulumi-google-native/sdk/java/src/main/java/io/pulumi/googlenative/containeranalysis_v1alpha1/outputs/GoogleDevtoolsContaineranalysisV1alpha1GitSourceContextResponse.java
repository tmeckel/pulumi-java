// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse {
    /**
     * Git commit hash.
     * 
     */
    private final String revisionId;
    /**
     * Git repository URL.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"revisionId","url"})
    private GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse(
        String revisionId,
        String url) {
        this.revisionId = Objects.requireNonNull(revisionId);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * Git commit hash.
     * 
     */
    public String getRevisionId() {
        return this.revisionId;
    }
    /**
     * Git repository URL.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String revisionId;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revisionId = defaults.revisionId;
    	      this.url = defaults.url;
        }

        public Builder setRevisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse(revisionId, url);
        }
    }
}
