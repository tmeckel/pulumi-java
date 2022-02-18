// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionHealthCheckArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionHealthCheckArgs Empty = new GetRegionHealthCheckArgs();

    @InputImport(name="healthCheck", required=true)
    private final String healthCheck;

    public String getHealthCheck() {
        return this.healthCheck;
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

    public GetRegionHealthCheckArgs(
        String healthCheck,
        @Nullable String project,
        String region) {
        this.healthCheck = Objects.requireNonNull(healthCheck, "expected parameter 'healthCheck' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetRegionHealthCheckArgs() {
        this.healthCheck = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String healthCheck;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheck = defaults.healthCheck;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setHealthCheck(String healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
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

        public GetRegionHealthCheckArgs build() {
            return new GetRegionHealthCheckArgs(healthCheck, project, region);
        }
    }
}
