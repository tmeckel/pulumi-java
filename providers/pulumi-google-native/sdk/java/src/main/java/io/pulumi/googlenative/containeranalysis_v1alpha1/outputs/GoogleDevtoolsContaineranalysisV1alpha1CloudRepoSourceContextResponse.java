// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse {
    /**
     * An alias, which may be a branch or tag.
     * 
     */
    private final GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext;
    /**
     * The ID of the repo.
     * 
     */
    private final GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse repoId;
    /**
     * A revision ID.
     * 
     */
    private final String revisionId;

    @OutputCustomType.Constructor({"aliasContext","repoId","revisionId"})
    private GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse(
        GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext,
        GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse repoId,
        String revisionId) {
        this.aliasContext = Objects.requireNonNull(aliasContext);
        this.repoId = Objects.requireNonNull(repoId);
        this.revisionId = Objects.requireNonNull(revisionId);
    }

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    public GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse getAliasContext() {
        return this.aliasContext;
    }
    /**
     * The ID of the repo.
     * 
     */
    public GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse getRepoId() {
        return this.repoId;
    }
    /**
     * A revision ID.
     * 
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext;
        private GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse repoId;
        private String revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasContext = defaults.aliasContext;
    	      this.repoId = defaults.repoId;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder setAliasContext(GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext) {
            this.aliasContext = Objects.requireNonNull(aliasContext);
            return this;
        }

        public Builder setRepoId(GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse repoId) {
            this.repoId = Objects.requireNonNull(repoId);
            return this;
        }

        public Builder setRevisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }

        public GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse(aliasContext, repoId, revisionId);
        }
    }
}
