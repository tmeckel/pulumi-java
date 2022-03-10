// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEdgeCacheOriginIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEdgeCacheOriginIamPolicyArgs Empty = new GetEdgeCacheOriginIamPolicyArgs();

    @InputImport(name="edgeCacheOriginId", required=true)
      private final String edgeCacheOriginId;

    public String getEdgeCacheOriginId() {
        return this.edgeCacheOriginId;
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

    public GetEdgeCacheOriginIamPolicyArgs(
        String edgeCacheOriginId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.edgeCacheOriginId = Objects.requireNonNull(edgeCacheOriginId, "expected parameter 'edgeCacheOriginId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetEdgeCacheOriginIamPolicyArgs() {
        this.edgeCacheOriginId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEdgeCacheOriginIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String edgeCacheOriginId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEdgeCacheOriginIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edgeCacheOriginId = defaults.edgeCacheOriginId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder edgeCacheOriginId(String edgeCacheOriginId) {
            this.edgeCacheOriginId = Objects.requireNonNull(edgeCacheOriginId);
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
        public GetEdgeCacheOriginIamPolicyArgs build() {
            return new GetEdgeCacheOriginIamPolicyArgs(edgeCacheOriginId, location, optionsRequestedPolicyVersion, project);
        }
    }
}
