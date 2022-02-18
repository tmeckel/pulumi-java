// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBuildArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBuildArgs Empty = new GetBuildArgs();

    @InputImport(name="buildId", required=true)
    private final String buildId;

    public String getBuildId() {
        return this.buildId;
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="projectId", required=true)
    private final String projectId;

    public String getProjectId() {
        return this.projectId;
    }

    public GetBuildArgs(
        String buildId,
        String id,
        String location,
        @Nullable String project,
        String projectId) {
        this.buildId = Objects.requireNonNull(buildId, "expected parameter 'buildId' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
    }

    private GetBuildArgs() {
        this.buildId = null;
        this.id = null;
        this.location = null;
        this.project = null;
        this.projectId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String buildId;
        private String id;
        private String location;
        private @Nullable String project;
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildId = defaults.buildId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.projectId = defaults.projectId;
        }

        public Builder setBuildId(String buildId) {
            this.buildId = Objects.requireNonNull(buildId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public GetBuildArgs build() {
            return new GetBuildArgs(buildId, id, location, project, projectId);
        }
    }
}
