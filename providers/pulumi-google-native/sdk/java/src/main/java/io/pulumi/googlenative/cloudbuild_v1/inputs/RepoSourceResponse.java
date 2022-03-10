// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Location of the source in a Google Cloud Source Repository.
 * 
 */
public final class RepoSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RepoSourceResponse Empty = new RepoSourceResponse();

    /**
     * Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
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
     * Directory, relative to the source root, in which to run the build. This must be a relative path. If a step's `dir` is specified and is an absolute path, this value is ignored for that step's execution.
     * 
     */
    @InputImport(name="dir", required=true)
      private final String dir;

    public String getDir() {
        return this.dir;
    }

    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    @InputImport(name="invertRegex", required=true)
      private final Boolean invertRegex;

    public Boolean getInvertRegex() {
        return this.invertRegex;
    }

    /**
     * ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
     * 
     */
    @InputImport(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * Name of the Cloud Source Repository.
     * 
     */
    @InputImport(name="repoName", required=true)
      private final String repoName;

    public String getRepoName() {
        return this.repoName;
    }

    /**
     * Substitutions to use in a triggered build. Should only be used with RunBuildTrigger
     * 
     */
    @InputImport(name="substitutions", required=true)
      private final Map<String,String> substitutions;

    public Map<String,String> getSubstitutions() {
        return this.substitutions;
    }

    /**
     * Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
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
        String dir,
        Boolean invertRegex,
        String project,
        String repoName,
        Map<String,String> substitutions,
        String tagName) {
        this.branchName = Objects.requireNonNull(branchName, "expected parameter 'branchName' to be non-null");
        this.commitSha = Objects.requireNonNull(commitSha, "expected parameter 'commitSha' to be non-null");
        this.dir = Objects.requireNonNull(dir, "expected parameter 'dir' to be non-null");
        this.invertRegex = Objects.requireNonNull(invertRegex, "expected parameter 'invertRegex' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.repoName = Objects.requireNonNull(repoName, "expected parameter 'repoName' to be non-null");
        this.substitutions = Objects.requireNonNull(substitutions, "expected parameter 'substitutions' to be non-null");
        this.tagName = Objects.requireNonNull(tagName, "expected parameter 'tagName' to be non-null");
    }

    private RepoSourceResponse() {
        this.branchName = null;
        this.commitSha = null;
        this.dir = null;
        this.invertRegex = null;
        this.project = null;
        this.repoName = null;
        this.substitutions = Map.of();
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
        private String dir;
        private Boolean invertRegex;
        private String project;
        private String repoName;
        private Map<String,String> substitutions;
        private String tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.dir = defaults.dir;
    	      this.invertRegex = defaults.invertRegex;
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
    	      this.substitutions = defaults.substitutions;
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

        public Builder dir(String dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }

        public Builder invertRegex(Boolean invertRegex) {
            this.invertRegex = Objects.requireNonNull(invertRegex);
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

        public Builder substitutions(Map<String,String> substitutions) {
            this.substitutions = Objects.requireNonNull(substitutions);
            return this;
        }

        public Builder tagName(String tagName) {
            this.tagName = Objects.requireNonNull(tagName);
            return this;
        }
        public RepoSourceResponse build() {
            return new RepoSourceResponse(branchName, commitSha, dir, invertRegex, project, repoName, substitutions, tagName);
        }
    }
}
