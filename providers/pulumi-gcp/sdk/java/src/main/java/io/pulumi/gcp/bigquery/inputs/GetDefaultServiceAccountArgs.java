// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDefaultServiceAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDefaultServiceAccountArgs Empty = new GetDefaultServiceAccountArgs();

    /**
     * The project the unique service account was created for. If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDefaultServiceAccountArgs(@Nullable String project) {
        this.project = project;
    }

    private GetDefaultServiceAccountArgs() {
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetDefaultServiceAccountArgs build() {
            return new GetDefaultServiceAccountArgs(project);
        }
    }
}
