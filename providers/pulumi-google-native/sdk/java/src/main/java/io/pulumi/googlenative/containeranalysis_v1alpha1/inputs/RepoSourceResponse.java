// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * RepoSource describes the location of the source in a Google Cloud Source Repository.
 * 
 */
public final class RepoSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RepoSourceResponse Empty = new RepoSourceResponse();

    /**
     * Name of the branch to build.
     * 
     */
    @InputImport(name="branchName", required=true)
      private final String branchName;

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * Explicit commit SHA to build.
     * 
     */
    @InputImport(name="commitSha", required=true)
      private final String commitSha;

    public String getCommitSha() {
        return this.commitSha;
    }

    /**
     * ID of the project that owns the repo.
     * 
     */
    @InputImport(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * Name of the repo.
     * 
     */
    @InputImport(name="repoName", required=true)
      private final String repoName;

    public String getRepoName() {
        return this.repoName;
    }

    /**
     * Name of the tag to build.
     * 
     */
    @InputImport(name="tagName", required=true)
      private final String tagName;

    public String getTagName() {
        return this.tagName;
    }

    public RepoSourceResponse(
        String branchName,
        String commitSha,
        String project,
        String repoName,
        String tagName) {
        this.branchName = Objects.requireNonNull(branchName, "expected parameter 'branchName' to be non-null");
        this.commitSha = Objects.requireNonNull(commitSha, "expected parameter 'commitSha' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.repoName = Objects.requireNonNull(repoName, "expected parameter 'repoName' to be non-null");
        this.tagName = Objects.requireNonNull(tagName, "expected parameter 'tagName' to be non-null");
    }

    private RepoSourceResponse() {
        this.branchName = null;
        this.commitSha = null;
        this.project = null;
        this.repoName = null;
        this.tagName = null;
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

        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }

        public Builder commitSha(String commitSha) {
            this.commitSha = Objects.requireNonNull(commitSha);
            return this;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder repoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }

        public Builder tagName(String tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }
        public RepoSourceResponse build() {
            return new RepoSourceResponse(branchName, commitSha, project, repoName, tagName);
        }
    }
}
