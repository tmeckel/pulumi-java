// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceBindingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceBindingArgs Empty = new GetServiceBindingArgs();

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

    @InputImport(name="serviceBindingId", required=true)
    private final String serviceBindingId;

    public String getServiceBindingId() {
        return this.serviceBindingId;
    }

    public GetServiceBindingArgs(
        String location,
        @Nullable String project,
        String serviceBindingId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.serviceBindingId = Objects.requireNonNull(serviceBindingId, "expected parameter 'serviceBindingId' to be non-null");
    }

    private GetServiceBindingArgs() {
        this.location = null;
        this.project = null;
        this.serviceBindingId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String serviceBindingId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.serviceBindingId = defaults.serviceBindingId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setServiceBindingId(String serviceBindingId) {
            this.serviceBindingId = Objects.requireNonNull(serviceBindingId);
            return this;
        }

        public GetServiceBindingArgs build() {
            return new GetServiceBindingArgs(location, project, serviceBindingId);
        }
    }
}
