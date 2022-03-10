// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiskIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDiskIamPolicyArgs Empty = new GetDiskIamPolicyArgs();

    @InputImport(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="resource", required=true)
      private final String resource;

    public String getResource() {
        return this.resource;
    }

    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetDiskIamPolicyArgs(
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String resource,
        String zone) {
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetDiskIamPolicyArgs() {
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.resource = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String resource;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.resource = defaults.resource;
    	      this.zone = defaults.zone;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetDiskIamPolicyArgs build() {
            return new GetDiskIamPolicyArgs(optionsRequestedPolicyVersion, project, resource, zone);
        }
    }
}
