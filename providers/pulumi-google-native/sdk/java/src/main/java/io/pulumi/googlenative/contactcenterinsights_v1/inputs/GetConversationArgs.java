// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConversationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConversationArgs Empty = new GetConversationArgs();

    @InputImport(name="conversationId", required=true)
    private final String conversationId;

    public String getConversationId() {
        return this.conversationId;
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

    @InputImport(name="view")
    private final @Nullable String view;

    public Optional<String> getView() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetConversationArgs(
        String conversationId,
        String location,
        @Nullable String project,
        @Nullable String view) {
        this.conversationId = Objects.requireNonNull(conversationId, "expected parameter 'conversationId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.view = view;
    }

    private GetConversationArgs() {
        this.conversationId = null;
        this.location = null;
        this.project = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConversationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String conversationId;
        private String location;
        private @Nullable String project;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConversationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationId = defaults.conversationId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.view = defaults.view;
        }

        public Builder setConversationId(String conversationId) {
            this.conversationId = Objects.requireNonNull(conversationId);
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

        public Builder setView(@Nullable String view) {
            this.view = view;
            return this;
        }

        public GetConversationArgs build() {
            return new GetConversationArgs(conversationId, location, project, view);
        }
    }
}
