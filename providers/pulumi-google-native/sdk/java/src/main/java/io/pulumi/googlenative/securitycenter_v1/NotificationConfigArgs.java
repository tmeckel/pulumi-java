// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.securitycenter_v1.inputs.StreamingConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationConfigArgs Empty = new NotificationConfigArgs();

    @Import(name="configId", required=true)
      private final Output<String> configId;

    public Output<String> getConfigId() {
        return this.configId;
    }

    /**
     * The description of the notification config (max of 1024 characters).
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The relative resource name of this notification config. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id}/notificationConfigs/notify_public_bucket".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * The Pub/Sub topic to send notifications to. Its format is "projects/[project_id]/topics/[topic]".
     * 
     */
    @Import(name="pubsubTopic")
      private final @Nullable Output<String> pubsubTopic;

    public Output<String> getPubsubTopic() {
        return this.pubsubTopic == null ? Codegen.empty() : this.pubsubTopic;
    }

    /**
     * The config for triggering streaming-based notifications.
     * 
     */
    @Import(name="streamingConfig")
      private final @Nullable Output<StreamingConfigArgs> streamingConfig;

    public Output<StreamingConfigArgs> getStreamingConfig() {
        return this.streamingConfig == null ? Codegen.empty() : this.streamingConfig;
    }

    public NotificationConfigArgs(
        Output<String> configId,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> organizationId,
        @Nullable Output<String> pubsubTopic,
        @Nullable Output<StreamingConfigArgs> streamingConfig) {
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.description = description;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.pubsubTopic = pubsubTopic;
        this.streamingConfig = streamingConfig;
    }

    private NotificationConfigArgs() {
        this.configId = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.organizationId = Codegen.empty();
        this.pubsubTopic = Codegen.empty();
        this.streamingConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> organizationId;
        private @Nullable Output<String> pubsubTopic;
        private @Nullable Output<StreamingConfigArgs> streamingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.streamingConfig = defaults.streamingConfig;
        }

        public Builder configId(Output<String> configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }
        public Builder configId(String configId) {
            this.configId = Output.of(Objects.requireNonNull(configId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder pubsubTopic(@Nullable Output<String> pubsubTopic) {
            this.pubsubTopic = pubsubTopic;
            return this;
        }
        public Builder pubsubTopic(@Nullable String pubsubTopic) {
            this.pubsubTopic = Codegen.ofNullable(pubsubTopic);
            return this;
        }
        public Builder streamingConfig(@Nullable Output<StreamingConfigArgs> streamingConfig) {
            this.streamingConfig = streamingConfig;
            return this;
        }
        public Builder streamingConfig(@Nullable StreamingConfigArgs streamingConfig) {
            this.streamingConfig = Codegen.ofNullable(streamingConfig);
            return this;
        }        public NotificationConfigArgs build() {
            return new NotificationConfigArgs(configId, description, name, organizationId, pubsubTopic, streamingConfig);
        }
    }
}
