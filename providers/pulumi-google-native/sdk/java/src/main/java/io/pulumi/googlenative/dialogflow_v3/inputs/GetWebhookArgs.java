// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebhookArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebhookArgs Empty = new GetWebhookArgs();

    @InputImport(name="agentId", required=true)
      private final String agentId;

    public String getAgentId() {
        return this.agentId;
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

    @InputImport(name="webhookId", required=true)
      private final String webhookId;

    public String getWebhookId() {
        return this.webhookId;
    }

    public GetWebhookArgs(
        String agentId,
        String location,
        @Nullable String project,
        String webhookId) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.webhookId = Objects.requireNonNull(webhookId, "expected parameter 'webhookId' to be non-null");
    }

    private GetWebhookArgs() {
        this.agentId = null;
        this.location = null;
        this.project = null;
        this.webhookId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String location;
        private @Nullable String project;
        private String webhookId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.webhookId = defaults.webhookId;
        }

        public Builder agentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder webhookId(String webhookId) {
            this.webhookId = Objects.requireNonNull(webhookId);
            return this;
        }
        public GetWebhookArgs build() {
            return new GetWebhookArgs(agentId, location, project, webhookId);
        }
    }
}
