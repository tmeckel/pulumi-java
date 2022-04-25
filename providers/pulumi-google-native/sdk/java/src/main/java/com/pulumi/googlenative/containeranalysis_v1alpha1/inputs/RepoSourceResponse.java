// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * RepoSource describes the location of the source in a Google Cloud Source Repository.
 * 
 */
public final class RepoSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final RepoSourceResponse Empty = new RepoSourceResponse();

    /**
     * Name of the branch to build.
     * 
     */
    @Import(name="branchName", required=true)
    private String branchName;

    /**
     * @return Name of the branch to build.
     * 
     */
    public String branchName() {
        return this.branchName;
    }

    /**
     * Explicit commit SHA to build.
     * 
     */
    @Import(name="commitSha", required=true)
    private String commitSha;

    /**
     * @return Explicit commit SHA to build.
     * 
     */
    public String commitSha() {
        return this.commitSha;
    }

    /**
     * ID of the project that owns the repo.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return ID of the project that owns the repo.
     * 
     */
    public String project() {
        return this.project;
    }

    /**
     * Name of the repo.
     * 
     */
    @Import(name="repoName", required=true)
    private String repoName;

    /**
     * @return Name of the repo.
     * 
     */
    public String repoName() {
        return this.repoName;
    }

    /**
     * Name of the tag to build.
     * 
     */
    @Import(name="tagName", required=true)
    private String tagName;

    /**
     * @return Name of the tag to build.
     * 
     */
    public String tagName() {
        return this.tagName;
    }

    private RepoSourceResponse() {}

    private RepoSourceResponse(RepoSourceResponse $) {
        this.branchName = $.branchName;
        this.commitSha = $.commitSha;
        this.project = $.project;
        this.repoName = $.repoName;
        this.tagName = $.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepoSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoSourceResponse $;

        public Builder() {
            $ = new RepoSourceResponse();
        }

        public Builder(RepoSourceResponse defaults) {
            $ = new RepoSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param branchName Name of the branch to build.
         * 
         * @return builder
         * 
         */
        public Builder branchName(String branchName) {
            $.branchName = branchName;
            return this;
        }

        /**
         * @param commitSha Explicit commit SHA to build.
         * 
         * @return builder
         * 
         */
        public Builder commitSha(String commitSha) {
            $.commitSha = commitSha;
            return this;
        }

        /**
         * @param project ID of the project that owns the repo.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        /**
         * @param repoName Name of the repo.
         * 
         * @return builder
         * 
         */
        public Builder repoName(String repoName) {
            $.repoName = repoName;
            return this;
        }

        /**
         * @param tagName Name of the tag to build.
         * 
         * @return builder
         * 
         */
        public Builder tagName(String tagName) {
            $.tagName = tagName;
            return this;
        }

        public RepoSourceResponse build() {
            $.branchName = Objects.requireNonNull($.branchName, "expected parameter 'branchName' to be non-null");
            $.commitSha = Objects.requireNonNull($.commitSha, "expected parameter 'commitSha' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.repoName = Objects.requireNonNull($.repoName, "expected parameter 'repoName' to be non-null");
            $.tagName = Objects.requireNonNull($.tagName, "expected parameter 'tagName' to be non-null");
            return $;
        }
    }

}
