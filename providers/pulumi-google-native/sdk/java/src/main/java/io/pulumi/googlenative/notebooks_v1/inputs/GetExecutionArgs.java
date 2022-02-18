// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExecutionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExecutionArgs Empty = new GetExecutionArgs();

    @InputImport(name="executionId", required=true)
    private final String executionId;

    public String getExecutionId() {
        return this.executionId;
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

    public GetExecutionArgs(
        String executionId,
        String location,
        @Nullable String project) {
        this.executionId = Objects.requireNonNull(executionId, "expected parameter 'executionId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetExecutionArgs() {
        this.executionId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executionId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExecutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionId = defaults.executionId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setExecutionId(String executionId) {
            this.executionId = Objects.requireNonNull(executionId);
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

        public GetExecutionArgs build() {
            return new GetExecutionArgs(executionId, location, project);
        }
    }
}
