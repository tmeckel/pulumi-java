// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecuritySettingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecuritySettingArgs Empty = new GetSecuritySettingArgs();

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

    @InputImport(name="securitySettingId", required=true)
      private final String securitySettingId;

    public String getSecuritySettingId() {
        return this.securitySettingId;
    }

    public GetSecuritySettingArgs(
        String location,
        @Nullable String project,
        String securitySettingId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.securitySettingId = Objects.requireNonNull(securitySettingId, "expected parameter 'securitySettingId' to be non-null");
    }

    private GetSecuritySettingArgs() {
        this.location = null;
        this.project = null;
        this.securitySettingId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecuritySettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String securitySettingId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecuritySettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.securitySettingId = defaults.securitySettingId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder securitySettingId(String securitySettingId) {
            this.securitySettingId = Objects.requireNonNull(securitySettingId);
            return this;
        }
        public GetSecuritySettingArgs build() {
            return new GetSecuritySettingArgs(location, project, securitySettingId);
        }
    }
}
