// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.securitycenter;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationConfigArgs Empty = new NotificationConfigArgs();

    /**
     * This must be unique within the organization.
     * 
     */
    @InputImport(name="configId", required=true)
      private final Input<String> configId;

    public Input<String> getConfigId() {
        return this.configId;
    }

    /**
     * The description of the notification config (max of 1024 characters).
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The organization whose Cloud Security Command Center the Notification
     * Config lives in.
     * 
     */
    @InputImport(name="organization", required=true)
      private final Input<String> organization;

    public Input<String> getOrganization() {
        return this.organization;
    }

    /**
     * The Pub/Sub topic to send notifications to. Its format is
     * "projects/[project_id]/topics/[topic]".
     * 
     */
    @InputImport(name="pubsubTopic", required=true)
      private final Input<String> pubsubTopic;

    public Input<String> getPubsubTopic() {
        return this.pubsubTopic;
    }

    /**
     * The config for triggering streaming-based notifications.
     * Structure is documented below.
     * 
     */
    @InputImport(name="streamingConfig", required=true)
      private final Input<NotificationConfigStreamingConfigArgs> streamingConfig;

    public Input<NotificationConfigStreamingConfigArgs> getStreamingConfig() {
        return this.streamingConfig;
    }

    public NotificationConfigArgs(
        Input<String> configId,
        @Nullable Input<String> description,
        Input<String> organization,
        Input<String> pubsubTopic,
        Input<NotificationConfigStreamingConfigArgs> streamingConfig) {
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.description = description;
        this.organization = Objects.requireNonNull(organization, "expected parameter 'organization' to be non-null");
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic, "expected parameter 'pubsubTopic' to be non-null");
        this.streamingConfig = Objects.requireNonNull(streamingConfig, "expected parameter 'streamingConfig' to be non-null");
    }

    private NotificationConfigArgs() {
        this.configId = Input.empty();
        this.description = Input.empty();
        this.organization = Input.empty();
        this.pubsubTopic = Input.empty();
        this.streamingConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> configId;
        private @Nullable Input<String> description;
        private Input<String> organization;
        private Input<String> pubsubTopic;
        private Input<NotificationConfigStreamingConfigArgs> streamingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.description = defaults.description;
    	      this.organization = defaults.organization;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.streamingConfig = defaults.streamingConfig;
        }

        public Builder configId(Input<String> configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }

        public Builder configId(String configId) {
            this.configId = Input.of(Objects.requireNonNull(configId));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder organization(Input<String> organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }

        public Builder organization(String organization) {
            this.organization = Input.of(Objects.requireNonNull(organization));
            return this;
        }

        public Builder pubsubTopic(Input<String> pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }

        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Input.of(Objects.requireNonNull(pubsubTopic));
            return this;
        }

        public Builder streamingConfig(Input<NotificationConfigStreamingConfigArgs> streamingConfig) {
            this.streamingConfig = Objects.requireNonNull(streamingConfig);
            return this;
        }

        public Builder streamingConfig(NotificationConfigStreamingConfigArgs streamingConfig) {
            this.streamingConfig = Input.of(Objects.requireNonNull(streamingConfig));
            return this;
        }
        public NotificationConfigArgs build() {
            return new NotificationConfigArgs(configId, description, organization, pubsubTopic, streamingConfig);
        }
    }
}
