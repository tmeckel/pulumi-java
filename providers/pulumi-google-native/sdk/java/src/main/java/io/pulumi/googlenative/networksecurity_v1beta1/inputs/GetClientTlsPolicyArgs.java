// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientTlsPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetClientTlsPolicyArgs Empty = new GetClientTlsPolicyArgs();

    @InputImport(name="clientTlsPolicyId", required=true)
    private final String clientTlsPolicyId;

    public String getClientTlsPolicyId() {
        return this.clientTlsPolicyId;
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

    public GetClientTlsPolicyArgs(
        String clientTlsPolicyId,
        String location,
        @Nullable String project) {
        this.clientTlsPolicyId = Objects.requireNonNull(clientTlsPolicyId, "expected parameter 'clientTlsPolicyId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetClientTlsPolicyArgs() {
        this.clientTlsPolicyId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientTlsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientTlsPolicyId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientTlsPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTlsPolicyId = defaults.clientTlsPolicyId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setClientTlsPolicyId(String clientTlsPolicyId) {
            this.clientTlsPolicyId = Objects.requireNonNull(clientTlsPolicyId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetClientTlsPolicyArgs build() {
            return new GetClientTlsPolicyArgs(clientTlsPolicyId, location, project);
        }
    }
}
