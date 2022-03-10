// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationEnvironmentIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationEnvironmentIamPolicyArgs Empty = new GetOrganizationEnvironmentIamPolicyArgs();

    @InputImport(name="environmentId", required=true)
      private final String environmentId;

    public String getEnvironmentId() {
        return this.environmentId;
    }

    @InputImport(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @InputImport(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetOrganizationEnvironmentIamPolicyArgs(
        String environmentId,
        @Nullable String optionsRequestedPolicyVersion,
        String organizationId) {
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetOrganizationEnvironmentIamPolicyArgs() {
        this.environmentId = null;
        this.optionsRequestedPolicyVersion = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationEnvironmentIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentId;
        private @Nullable String optionsRequestedPolicyVersion;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationEnvironmentIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder environmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public GetOrganizationEnvironmentIamPolicyArgs build() {
            return new GetOrganizationEnvironmentIamPolicyArgs(environmentId, optionsRequestedPolicyVersion, organizationId);
        }
    }
}
