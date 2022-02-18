// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAttestorIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAttestorIamPolicyArgs Empty = new GetAttestorIamPolicyArgs();

    @InputImport(name="attestorId", required=true)
    private final String attestorId;

    public String getAttestorId() {
        return this.attestorId;
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

    public GetAttestorIamPolicyArgs(
        String attestorId,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.attestorId = Objects.requireNonNull(attestorId, "expected parameter 'attestorId' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetAttestorIamPolicyArgs() {
        this.attestorId = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttestorIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attestorId;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttestorIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestorId = defaults.attestorId;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder setAttestorId(String attestorId) {
            this.attestorId = Objects.requireNonNull(attestorId);
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

        public GetAttestorIamPolicyArgs build() {
            return new GetAttestorIamPolicyArgs(attestorId, optionsRequestedPolicyVersion, project);
        }
    }
}
