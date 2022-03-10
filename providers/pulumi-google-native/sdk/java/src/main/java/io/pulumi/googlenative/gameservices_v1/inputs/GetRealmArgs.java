// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRealmArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRealmArgs Empty = new GetRealmArgs();

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

    @InputImport(name="realmId", required=true)
      private final String realmId;

    public String getRealmId() {
        return this.realmId;
    }

    public GetRealmArgs(
        String location,
        @Nullable String project,
        String realmId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.realmId = Objects.requireNonNull(realmId, "expected parameter 'realmId' to be non-null");
    }

    private GetRealmArgs() {
        this.location = null;
        this.project = null;
        this.realmId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRealmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String realmId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRealmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.realmId = defaults.realmId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder realmId(String realmId) {
            this.realmId = Objects.requireNonNull(realmId);
            return this;
        }
        public GetRealmArgs build() {
            return new GetRealmArgs(location, project, realmId);
        }
    }
}
