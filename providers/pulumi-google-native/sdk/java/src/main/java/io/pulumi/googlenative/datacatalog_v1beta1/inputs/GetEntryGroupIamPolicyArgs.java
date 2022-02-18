// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntryGroupIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEntryGroupIamPolicyArgs Empty = new GetEntryGroupIamPolicyArgs();

    @InputImport(name="entryGroupId", required=true)
    private final String entryGroupId;

    public String getEntryGroupId() {
        return this.entryGroupId;
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

    public GetEntryGroupIamPolicyArgs(
        String entryGroupId,
        String location,
        @Nullable String project) {
        this.entryGroupId = Objects.requireNonNull(entryGroupId, "expected parameter 'entryGroupId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetEntryGroupIamPolicyArgs() {
        this.entryGroupId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntryGroupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entryGroupId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntryGroupIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entryGroupId = defaults.entryGroupId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setEntryGroupId(String entryGroupId) {
            this.entryGroupId = Objects.requireNonNull(entryGroupId);
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

        public GetEntryGroupIamPolicyArgs build() {
            return new GetEntryGroupIamPolicyArgs(entryGroupId, location, project);
        }
    }
}
