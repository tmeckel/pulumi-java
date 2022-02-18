// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientTlsPolicyIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetClientTlsPolicyIamPolicyArgs Empty = new GetClientTlsPolicyIamPolicyArgs();

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

    public GetClientTlsPolicyIamPolicyArgs(
        String clientTlsPolicyId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.clientTlsPolicyId = Objects.requireNonNull(clientTlsPolicyId, "expected parameter 'clientTlsPolicyId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetClientTlsPolicyIamPolicyArgs() {
        this.clientTlsPolicyId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientTlsPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientTlsPolicyId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientTlsPolicyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTlsPolicyId = defaults.clientTlsPolicyId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
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

        public Builder setOptionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetClientTlsPolicyIamPolicyArgs build() {
            return new GetClientTlsPolicyIamPolicyArgs(clientTlsPolicyId, location, optionsRequestedPolicyVersion, project);
        }
    }
}
