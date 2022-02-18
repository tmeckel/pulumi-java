// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Selects a repo using a Google Cloud Platform project ID (e.g., winged-cargo-31) and a repo name within that project.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse Empty = new GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse();

    /**
     * The ID of the project.
     * 
     */
    @InputImport(name="project", required=true)
    private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * The name of the repo. Leave empty for the default repo.
     * 
     */
    @InputImport(name="repoName", required=true)
    private final String repoName;

    public String getRepoName() {
        return this.repoName;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse(
        String project,
        String repoName) {
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.repoName = Objects.requireNonNull(repoName, "expected parameter 'repoName' to be non-null");
    }

    private GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse() {
        this.project = null;
        this.repoName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String project;
        private String repoName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRepoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }

        public GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse(project, repoName);
        }
    }
}
