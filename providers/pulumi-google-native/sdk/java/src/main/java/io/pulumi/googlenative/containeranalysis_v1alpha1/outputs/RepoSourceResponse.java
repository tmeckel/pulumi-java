// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RepoSourceResponse {
    /**
     * Name of the branch to build.
     * 
     */
    private final String branchName;
    /**
     * Explicit commit SHA to build.
     * 
     */
    private final String commitSha;
    /**
     * ID of the project that owns the repo.
     * 
     */
    private final String project;
    /**
     * Name of the repo.
     * 
     */
    private final String repoName;
    /**
     * Name of the tag to build.
     * 
     */
    private final String tagName;

    @OutputCustomType.Constructor({"branchName","commitSha","project","repoName","tagName"})
    private RepoSourceResponse(
        String branchName,
        String commitSha,
        String project,
        String repoName,
        String tagName) {
        this.branchName = Objects.requireNonNull(branchName);
        this.commitSha = Objects.requireNonNull(commitSha);
        this.project = Objects.requireNonNull(project);
        this.repoName = Objects.requireNonNull(repoName);
        this.tagName = Objects.requireNonNull(tagName);
    }

    /**
     * Name of the branch to build.
     * 
     */
    public String getBranchName() {
        return this.branchName;
    }
    /**
     * Explicit commit SHA to build.
     * 
     */
    public String getCommitSha() {
        return this.commitSha;
    }
    /**
     * ID of the project that owns the repo.
     * 
     */
    public String getProject() {
        return this.project;
    }
    /**
     * Name of the repo.
     * 
     */
    public String getRepoName() {
        return this.repoName;
    }
    /**
     * Name of the tag to build.
     * 
     */
    public String getTagName() {
        return this.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branchName;
        private String commitSha;
        private String project;
        private String repoName;
        private String tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
    	      this.tagName = defaults.tagName;
        }

        public Builder setBranchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }

        public Builder setCommitSha(String commitSha) {
            this.commitSha = Objects.requireNonNull(commitSha);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRepoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }

        public Builder setTagName(String tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }

        public RepoSourceResponse build() {
            return new RepoSourceResponse(branchName, commitSha, project, repoName, tagName);
        }
    }
}
