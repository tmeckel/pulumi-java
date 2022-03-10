// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterArgs Empty = new GetClusterArgs();

    @InputImport(name="clusterId", required=true)
      private final String clusterId;

    public String getClusterId() {
        return this.clusterId;
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

    public GetClusterArgs(
        String clusterId,
        String location,
        @Nullable String project) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetClusterArgs() {
        this.clusterId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
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
        public GetClusterArgs build() {
            return new GetClusterArgs(clusterId, location, project);
        }
    }
}
