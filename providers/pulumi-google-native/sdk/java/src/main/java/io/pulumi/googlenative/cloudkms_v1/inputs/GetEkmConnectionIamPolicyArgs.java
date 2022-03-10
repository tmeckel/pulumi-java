// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEkmConnectionIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEkmConnectionIamPolicyArgs Empty = new GetEkmConnectionIamPolicyArgs();

    @InputImport(name="ekmConnectionId", required=true)
      private final String ekmConnectionId;

    public String getEkmConnectionId() {
        return this.ekmConnectionId;
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

    public GetEkmConnectionIamPolicyArgs(
        String ekmConnectionId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.ekmConnectionId = Objects.requireNonNull(ekmConnectionId, "expected parameter 'ekmConnectionId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetEkmConnectionIamPolicyArgs() {
        this.ekmConnectionId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEkmConnectionIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ekmConnectionId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEkmConnectionIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ekmConnectionId = defaults.ekmConnectionId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder ekmConnectionId(String ekmConnectionId) {
            this.ekmConnectionId = Objects.requireNonNull(ekmConnectionId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetEkmConnectionIamPolicyArgs build() {
            return new GetEkmConnectionIamPolicyArgs(ekmConnectionId, location, optionsRequestedPolicyVersion, project);
        }
    }
}
