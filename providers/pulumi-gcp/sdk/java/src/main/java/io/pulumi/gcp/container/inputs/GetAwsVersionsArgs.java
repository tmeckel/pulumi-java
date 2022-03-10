// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAwsVersionsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAwsVersionsArgs Empty = new GetAwsVersionsArgs();

    /**
     * The location to list versions for.
     * 
     */
    @InputImport(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
     * Defaults to the project that the provider is authenticated with.
     * 
     */
    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetAwsVersionsArgs(
        @Nullable String location,
        @Nullable String project) {
        this.location = location;
        this.project = project;
    }

    private GetAwsVersionsArgs() {
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAwsVersionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetAwsVersionsArgs build() {
            return new GetAwsVersionsArgs(location, project);
        }
    }
}
