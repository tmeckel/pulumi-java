// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTopicIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTopicIamPolicyArgs Empty = new GetTopicIamPolicyArgs();

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

    @InputImport(name="topicId", required=true)
    private final String topicId;

    public String getTopicId() {
        return this.topicId;
    }

    public GetTopicIamPolicyArgs(
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String topicId) {
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.topicId = Objects.requireNonNull(topicId, "expected parameter 'topicId' to be non-null");
    }

    private GetTopicIamPolicyArgs() {
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.topicId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String topicId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.topicId = defaults.topicId;
        }

        public Builder setOptionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setTopicId(String topicId) {
            this.topicId = Objects.requireNonNull(topicId);
            return this;
        }

        public GetTopicIamPolicyArgs build() {
            return new GetTopicIamPolicyArgs(optionsRequestedPolicyVersion, project, topicId);
        }
    }
}
