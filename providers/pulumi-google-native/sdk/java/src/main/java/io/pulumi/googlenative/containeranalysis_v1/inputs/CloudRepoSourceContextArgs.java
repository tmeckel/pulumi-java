// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.AliasContextArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.RepoIdArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CloudRepoSourceContext denotes a particular revision in a Google Cloud Source Repo.
 * 
 */
public final class CloudRepoSourceContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudRepoSourceContextArgs Empty = new CloudRepoSourceContextArgs();

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
     * The ID of the repo.
     * 
     */
    @InputImport(name="repoId")
      private final @Nullable Input<RepoIdArgs> repoId;

    public Input<RepoIdArgs> getRepoId() {
        return this.repoId == null ? Input.empty() : this.repoId;
    }

    /**
     * A revision ID.
     * 
     */
    @InputImport(name="revisionId")
      private final @Nullable Input<String> revisionId;

    public Input<String> getRevisionId() {
        return this.revisionId == null ? Input.empty() : this.revisionId;
    }

    public CloudRepoSourceContextArgs(
        @Nullable Input<AliasContextArgs> aliasContext,
        @Nullable Input<RepoIdArgs> repoId,
        @Nullable Input<String> revisionId) {
        this.aliasContext = aliasContext;
        this.repoId = repoId;
        this.revisionId = revisionId;
    }

    private CloudRepoSourceContextArgs() {
        this.aliasContext = Input.empty();
        this.repoId = Input.empty();
        this.revisionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRepoSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AliasContextArgs> aliasContext;
        private @Nullable Input<RepoIdArgs> repoId;
        private @Nullable Input<String> revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudRepoSourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasContext = defaults.aliasContext;
    	      this.repoId = defaults.repoId;
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

        public Builder repoId(@Nullable Input<RepoIdArgs> repoId) {
            this.repoId = repoId;
            return this;
        }

        public Builder repoId(@Nullable RepoIdArgs repoId) {
            this.repoId = Input.ofNullable(repoId);
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
        public CloudRepoSourceContextArgs build() {
            return new CloudRepoSourceContextArgs(aliasContext, repoId, revisionId);
        }
    }
}
