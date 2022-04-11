// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


public final class ProjectSourceGitSubmodulesConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSourceGitSubmodulesConfigGetArgs Empty = new ProjectSourceGitSubmodulesConfigGetArgs();

    /**
     * Whether to fetch Git submodules for the AWS CodeBuild build project.
     * 
     */
    @Import(name="fetchSubmodules", required=true)
      private final Output<Boolean> fetchSubmodules;

    public Output<Boolean> getFetchSubmodules() {
        return this.fetchSubmodules;
    }

    public ProjectSourceGitSubmodulesConfigGetArgs(Output<Boolean> fetchSubmodules) {
        this.fetchSubmodules = Objects.requireNonNull(fetchSubmodules, "expected parameter 'fetchSubmodules' to be non-null");
    }

    private ProjectSourceGitSubmodulesConfigGetArgs() {
        this.fetchSubmodules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSourceGitSubmodulesConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> fetchSubmodules;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSourceGitSubmodulesConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fetchSubmodules = defaults.fetchSubmodules;
        }

        public Builder fetchSubmodules(Output<Boolean> fetchSubmodules) {
            this.fetchSubmodules = Objects.requireNonNull(fetchSubmodules);
            return this;
        }
        public Builder fetchSubmodules(Boolean fetchSubmodules) {
            this.fetchSubmodules = Output.of(Objects.requireNonNull(fetchSubmodules));
            return this;
        }        public ProjectSourceGitSubmodulesConfigGetArgs build() {
            return new ProjectSourceGitSubmodulesConfigGetArgs(fetchSubmodules);
        }
    }
}
