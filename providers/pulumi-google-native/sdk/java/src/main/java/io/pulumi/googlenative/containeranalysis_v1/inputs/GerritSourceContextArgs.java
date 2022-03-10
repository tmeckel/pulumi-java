// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.AliasContextArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A SourceContext referring to a Gerrit project.
 * 
 */
public final class GerritSourceContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GerritSourceContextArgs Empty = new GerritSourceContextArgs();

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    @InputImport(name="aliasContext")
      private final @Nullable Input<AliasContextArgs> aliasContext;

    public Input<AliasContextArgs> getAliasContext() {
        return this.aliasContext == null ? Input.empty() : this.aliasContext;
    }

    /**
     * The full project name within the host. Projects may be nested, so "project/subproject" is a valid project name. The "repo name" is the hostURI/project.
     * 
     */
    @InputImport(name="gerritProject")
      private final @Nullable Input<String> gerritProject;

    public Input<String> getGerritProject() {
        return this.gerritProject == null ? Input.empty() : this.gerritProject;
    }

    /**
     * The URI of a running Gerrit instance.
     * 
     */
    @InputImport(name="hostUri")
      private final @Nullable Input<String> hostUri;

    public Input<String> getHostUri() {
        return this.hostUri == null ? Input.empty() : this.hostUri;
    }

    /**
     * A revision (commit) ID.
     * 
     */
    @InputImport(name="revisionId")
      private final @Nullable Input<String> revisionId;

    public Input<String> getRevisionId() {
        return this.revisionId == null ? Input.empty() : this.revisionId;
    }

    public GerritSourceContextArgs(
        @Nullable Input<AliasContextArgs> aliasContext,
        @Nullable Input<String> gerritProject,
        @Nullable Input<String> hostUri,
        @Nullable Input<String> revisionId) {
        this.aliasContext = aliasContext;
        this.gerritProject = gerritProject;
        this.hostUri = hostUri;
        this.revisionId = revisionId;
    }

    private GerritSourceContextArgs() {
        this.aliasContext = Input.empty();
        this.gerritProject = Input.empty();
        this.hostUri = Input.empty();
        this.revisionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GerritSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AliasContextArgs> aliasContext;
        private @Nullable Input<String> gerritProject;
        private @Nullable Input<String> hostUri;
        private @Nullable Input<String> revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GerritSourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasContext = defaults.aliasContext;
    	      this.gerritProject = defaults.gerritProject;
    	      this.hostUri = defaults.hostUri;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder aliasContext(@Nullable Input<AliasContextArgs> aliasContext) {
            this.aliasContext = aliasContext;
            return this;
        }

        public Builder aliasContext(@Nullable AliasContextArgs aliasContext) {
            this.aliasContext = Input.ofNullable(aliasContext);
            return this;
        }

        public Builder gerritProject(@Nullable Input<String> gerritProject) {
            this.gerritProject = gerritProject;
            return this;
        }

        public Builder gerritProject(@Nullable String gerritProject) {
            this.gerritProject = Input.ofNullable(gerritProject);
            return this;
        }

        public Builder hostUri(@Nullable Input<String> hostUri) {
            this.hostUri = hostUri;
            return this;
        }

        public Builder hostUri(@Nullable String hostUri) {
            this.hostUri = Input.ofNullable(hostUri);
            return this;
        }

        public Builder revisionId(@Nullable Input<String> revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        public Builder revisionId(@Nullable String revisionId) {
            this.revisionId = Input.ofNullable(revisionId);
            return this;
        }
        public GerritSourceContextArgs build() {
            return new GerritSourceContextArgs(aliasContext, gerritProject, hostUri, revisionId);
        }
    }
}
