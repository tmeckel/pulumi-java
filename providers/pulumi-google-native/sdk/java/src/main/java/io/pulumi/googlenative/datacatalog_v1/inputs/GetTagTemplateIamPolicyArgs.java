// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagTemplateIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTagTemplateIamPolicyArgs Empty = new GetTagTemplateIamPolicyArgs();

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

    @InputImport(name="tagTemplateId", required=true)
    private final String tagTemplateId;

    public String getTagTemplateId() {
        return this.tagTemplateId;
    }

    public GetTagTemplateIamPolicyArgs(
        String location,
        @Nullable String project,
        String tagTemplateId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.tagTemplateId = Objects.requireNonNull(tagTemplateId, "expected parameter 'tagTemplateId' to be non-null");
    }

    private GetTagTemplateIamPolicyArgs() {
        this.location = null;
        this.project = null;
        this.tagTemplateId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagTemplateIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String tagTemplateId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagTemplateIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.tagTemplateId = defaults.tagTemplateId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setTagTemplateId(String tagTemplateId) {
            this.tagTemplateId = Objects.requireNonNull(tagTemplateId);
            return this;
        }

        public GetTagTemplateIamPolicyArgs build() {
            return new GetTagTemplateIamPolicyArgs(location, project, tagTemplateId);
        }
    }
}
