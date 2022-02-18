// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

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

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
    private final String region;

    public String getRegion() {
        return this.region;
    }

    public GetJobArgs(
        String jobId,
        @Nullable String project,
        String region) {
        this.jobId = Objects.requireNonNull(jobId, "expected parameter 'jobId' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetJobArgs() {
        this.jobId = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobId;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setJobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public GetJobArgs build() {
            return new GetJobArgs(jobId, project, region);
        }
    }
}
