// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNamespaceServiceIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNamespaceServiceIamPolicyArgs Empty = new GetNamespaceServiceIamPolicyArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="namespaceId", required=true)
      private final String namespaceId;

    public String getNamespaceId() {
        return this.namespaceId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="serviceId", required=true)
      private final String serviceId;

    public String getServiceId() {
        return this.serviceId;
    }

    public GetNamespaceServiceIamPolicyArgs(
        String location,
        String namespaceId,
        @Nullable String project,
        String serviceId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.namespaceId = Objects.requireNonNull(namespaceId, "expected parameter 'namespaceId' to be non-null");
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private GetNamespaceServiceIamPolicyArgs() {
        this.location = null;
        this.namespaceId = null;
        this.project = null;
        this.serviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceServiceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String namespaceId;
        private @Nullable String project;
        private String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceServiceIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.namespaceId = defaults.namespaceId;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public GetNamespaceServiceIamPolicyArgs build() {
            return new GetNamespaceServiceIamPolicyArgs(location, namespaceId, project, serviceId);
        }
    }
}
