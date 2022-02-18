// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Selects a repo using a Google Cloud Platform project ID (e.g., winged-cargo-31) and a repo name within that project.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs();

    /**
     * The ID of the project.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The name of the repo. Leave empty for the default repo.
     * 
     */
    @InputImport(name="repoName")
    private final @Nullable Input<String> repoName;

    public Input<String> getRepoName() {
        return this.repoName == null ? Input.empty() : this.repoName;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs(
        @Nullable Input<String> project,
        @Nullable Input<String> repoName) {
        this.project = project;
        this.repoName = repoName;
    }

    private GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs() {
        this.project = Input.empty();
        this.repoName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> project;
        private @Nullable Input<String> repoName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRepoName(@Nullable Input<String> repoName) {
            this.repoName = repoName;
            return this;
        }

        public Builder setRepoName(@Nullable String repoName) {
            this.repoName = Input.ofNullable(repoName);
            return this;
        }

        public GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdArgs(project, repoName);
        }
    }
}
