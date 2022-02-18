// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistryIamPolicyArgs Empty = new GetRegistryIamPolicyArgs();

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

    @InputImport(name="registryId", required=true)
    private final String registryId;

    public String getRegistryId() {
        return this.registryId;
    }

    public GetRegistryIamPolicyArgs(
        String location,
        @Nullable String project,
        String registryId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.registryId = Objects.requireNonNull(registryId, "expected parameter 'registryId' to be non-null");
    }

    private GetRegistryIamPolicyArgs() {
        this.location = null;
        this.project = null;
        this.registryId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.registryId = defaults.registryId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegistryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }

        public GetRegistryIamPolicyArgs build() {
            return new GetRegistryIamPolicyArgs(location, project, registryId);
        }
    }
}
