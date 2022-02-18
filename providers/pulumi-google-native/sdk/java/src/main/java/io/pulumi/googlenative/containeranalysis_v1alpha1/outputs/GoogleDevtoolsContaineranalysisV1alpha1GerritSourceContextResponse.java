// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse {
    /**
     * An alias, which may be a branch or tag.
     * 
     */
    private final GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext;
    /**
     * The full project name within the host. Projects may be nested, so "project/subproject" is a valid project name. The "repo name" is the hostURI/project.
     * 
     */
    private final String gerritProject;
    /**
     * The URI of a running Gerrit instance.
     * 
     */
    private final String hostUri;
    /**
     * A revision (commit) ID.
     * 
     */
    private final String revisionId;

    @OutputCustomType.Constructor({"aliasContext","gerritProject","hostUri","revisionId"})
    private GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse(
        GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext,
        String gerritProject,
        String hostUri,
        String revisionId) {
        this.aliasContext = Objects.requireNonNull(aliasContext);
        this.gerritProject = Objects.requireNonNull(gerritProject);
        this.hostUri = Objects.requireNonNull(hostUri);
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
     * The full project name within the host. Projects may be nested, so "project/subproject" is a valid project name. The "repo name" is the hostURI/project.
     * 
     */
    public String getGerritProject() {
        return this.gerritProject;
    }
    /**
     * The URI of a running Gerrit instance.
     * 
     */
    public String getHostUri() {
        return this.hostUri;
    }
    /**
     * A revision (commit) ID.
     * 
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext;
        private String gerritProject;
        private String hostUri;
        private String revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasContext = defaults.aliasContext;
    	      this.gerritProject = defaults.gerritProject;
    	      this.hostUri = defaults.hostUri;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder setAliasContext(GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext) {
            this.aliasContext = Objects.requireNonNull(aliasContext);
            return this;
        }

        public Builder setGerritProject(String gerritProject) {
            this.gerritProject = Objects.requireNonNull(gerritProject);
            return this;
        }

        public Builder setHostUri(String hostUri) {
            this.hostUri = Objects.requireNonNull(hostUri);
            return this;
        }

        public Builder setRevisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }

        public GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse(aliasContext, gerritProject, hostUri, revisionId);
        }
    }
}
