// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHubArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHubArgs Empty = new GetHubArgs();

    @InputImport(name="hubId", required=true)
      private final String hubId;

    public String getHubId() {
        return this.hubId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetHubArgs(
        String hubId,
        @Nullable String project) {
        this.hubId = Objects.requireNonNull(hubId, "expected parameter 'hubId' to be non-null");
        this.project = project;
    }

    private GetHubArgs() {
        this.hubId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hubId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubId = defaults.hubId;
    	      this.project = defaults.project;
        }

        public Builder hubId(String hubId) {
            this.hubId = Objects.requireNonNull(hubId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetHubArgs build() {
            return new GetHubArgs(hubId, project);
        }
    }
}
