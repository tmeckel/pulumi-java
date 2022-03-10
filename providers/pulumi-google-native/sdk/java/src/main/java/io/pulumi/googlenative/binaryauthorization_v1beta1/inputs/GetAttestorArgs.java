// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAttestorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAttestorArgs Empty = new GetAttestorArgs();

    @InputImport(name="attestorId", required=true)
      private final String attestorId;

    public String getAttestorId() {
        return this.attestorId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetAttestorArgs(
        String attestorId,
        @Nullable String project) {
        this.attestorId = Objects.requireNonNull(attestorId, "expected parameter 'attestorId' to be non-null");
        this.project = project;
    }

    private GetAttestorArgs() {
        this.attestorId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttestorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attestorId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttestorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestorId = defaults.attestorId;
    	      this.project = defaults.project;
        }

        public Builder attestorId(String attestorId) {
            this.attestorId = Objects.requireNonNull(attestorId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetAttestorArgs build() {
            return new GetAttestorArgs(attestorId, project);
        }
    }
}
