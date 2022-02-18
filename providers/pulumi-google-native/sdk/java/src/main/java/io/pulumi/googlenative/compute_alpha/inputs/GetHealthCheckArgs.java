// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHealthCheckArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHealthCheckArgs Empty = new GetHealthCheckArgs();

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

    public GetHealthCheckArgs(
        String healthCheck,
        @Nullable String project) {
        this.healthCheck = Objects.requireNonNull(healthCheck, "expected parameter 'healthCheck' to be non-null");
        this.project = project;
    }

    private GetHealthCheckArgs() {
        this.healthCheck = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String healthCheck;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheck = defaults.healthCheck;
    	      this.project = defaults.project;
        }

        public Builder setHealthCheck(String healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetHealthCheckArgs build() {
            return new GetHealthCheckArgs(healthCheck, project);
        }
    }
}
