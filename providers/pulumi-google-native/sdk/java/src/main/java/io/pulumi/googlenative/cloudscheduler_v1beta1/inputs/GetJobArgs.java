// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetJobArgs Empty = new GetJobArgs();

    @InputImport(name="jobId", required=true)
      private final String jobId;

    public String getJobId() {
        return this.jobId;
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

    public GetJobArgs(
        String jobId,
        String location,
        @Nullable String project) {
        this.jobId = Objects.requireNonNull(jobId, "expected parameter 'jobId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetJobArgs() {
        this.jobId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetJobArgs build() {
            return new GetJobArgs(jobId, location, project);
        }
    }
}
