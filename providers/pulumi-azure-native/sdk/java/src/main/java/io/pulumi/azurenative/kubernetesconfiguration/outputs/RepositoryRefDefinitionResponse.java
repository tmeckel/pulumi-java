// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RepositoryRefDefinitionResponse {
    /**
     * The git repository branch name to checkout.
     * 
     */
    private final @Nullable String branch;
    /**
     * The commit SHA to checkout. This value must be combined with the branch name to be valid. This takes precedence over semver.
     * 
     */
    private final @Nullable String commit;
    /**
     * The semver range used to match against git repository tags. This takes precedence over tag.
     * 
     */
    private final @Nullable String semver;
    /**
     * The git repository tag name to checkout. This takes precedence over branch.
     * 
     */
    private final @Nullable String tag;

    @OutputCustomType.Constructor
    private RepositoryRefDefinitionResponse(
        @OutputCustomType.Parameter("branch") @Nullable String branch,
        @OutputCustomType.Parameter("commit") @Nullable String commit,
        @OutputCustomType.Parameter("semver") @Nullable String semver,
        @OutputCustomType.Parameter("tag") @Nullable String tag) {
        this.branch = branch;
        this.commit = commit;
        this.semver = semver;
        this.tag = tag;
    }

    /**
     * The git repository branch name to checkout.
     * 
    */
    public Optional<String> getBranch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * The commit SHA to checkout. This value must be combined with the branch name to be valid. This takes precedence over semver.
     * 
    */
    public Optional<String> getCommit() {
        return Optional.ofNullable(this.commit);
    }
    /**
     * The semver range used to match against git repository tags. This takes precedence over tag.
     * 
    */
    public Optional<String> getSemver() {
        return Optional.ofNullable(this.semver);
    }
    /**
     * The git repository tag name to checkout. This takes precedence over branch.
     * 
    */
    public Optional<String> getTag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryRefDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private @Nullable String commit;
        private @Nullable String semver;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryRefDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commit = defaults.commit;
    	      this.semver = defaults.semver;
    	      this.tag = defaults.tag;
        }

        public Builder branch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }

        public Builder commit(@Nullable String commit) {
            this.commit = commit;
            return this;
        }

        public Builder semver(@Nullable String semver) {
            this.semver = semver;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public RepositoryRefDefinitionResponse build() {
            return new RepositoryRefDefinitionResponse(branch, commit, semver, tag);
        }
    }
}
