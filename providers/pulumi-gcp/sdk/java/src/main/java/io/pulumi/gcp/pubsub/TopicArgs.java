// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs;
import io.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicArgs Empty = new TopicArgs();

    /**
     * The resource name of the Cloud KMS CryptoKey to be used to protect access
     * to messages published on this topic. Your project's PubSub service account
     * (`service-{{PROJECT_NUMBER}}@gcp-sa-pubsub.iam.gserviceaccount.com`) must have
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
     * The expected format is `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Codegen.empty() : this.kmsKeyName;
    }

    /**
     * A set of key/value label pairs to assign to this Topic.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Indicates the minimum duration to retain a message after it is published
     * to the topic. If this field is set, messages published to the topic in
     * the last messageRetentionDuration are always available to subscribers.
     * For instance, it allows any attached subscription to seek to a timestamp
     * that is up to messageRetentionDuration in the past. If this field is not
     * set, message retention is controlled by settings on individual subscriptions.
     * Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    @Import(name="messageRetentionDuration")
      private final @Nullable Output<String> messageRetentionDuration;

    public Output<String> getMessageRetentionDuration() {
        return this.messageRetentionDuration == null ? Codegen.empty() : this.messageRetentionDuration;
    }

    /**
     * Policy constraining the set of Google Cloud Platform regions where
     * messages published to the topic may be stored. If not present, then no
     * constraints are in effect.
     * Structure is documented below.
     * 
     */
    @Import(name="messageStoragePolicy")
      private final @Nullable Output<TopicMessageStoragePolicyArgs> messageStoragePolicy;

    public Output<TopicMessageStoragePolicyArgs> getMessageStoragePolicy() {
        return this.messageStoragePolicy == null ? Codegen.empty() : this.messageStoragePolicy;
    }

    /**
     * Name of the topic.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Settings for validating messages published against a schema.
     * Structure is documented below.
     * 
     */
    @Import(name="schemaSettings")
      private final @Nullable Output<TopicSchemaSettingsArgs> schemaSettings;

    public Output<TopicSchemaSettingsArgs> getSchemaSettings() {
        return this.schemaSettings == null ? Codegen.empty() : this.schemaSettings;
    }

    public TopicArgs(
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> messageRetentionDuration,
        @Nullable Output<TopicMessageStoragePolicyArgs> messageStoragePolicy,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<TopicSchemaSettingsArgs> schemaSettings) {
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.messageRetentionDuration = messageRetentionDuration;
        this.messageStoragePolicy = messageStoragePolicy;
        this.name = name;
        this.project = project;
        this.schemaSettings = schemaSettings;
    }

    private TopicArgs() {
        this.kmsKeyName = Codegen.empty();
        this.labels = Codegen.empty();
        this.messageRetentionDuration = Codegen.empty();
        this.messageStoragePolicy = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.schemaSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> messageRetentionDuration;
        private @Nullable Output<TopicMessageStoragePolicyArgs> messageStoragePolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<TopicSchemaSettingsArgs> schemaSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.messageRetentionDuration = defaults.messageRetentionDuration;
    	      this.messageStoragePolicy = defaults.messageStoragePolicy;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.schemaSettings = defaults.schemaSettings;
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Codegen.ofNullable(kmsKeyName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder messageRetentionDuration(@Nullable Output<String> messageRetentionDuration) {
            this.messageRetentionDuration = messageRetentionDuration;
            return this;
        }
        public Builder messageRetentionDuration(@Nullable String messageRetentionDuration) {
            this.messageRetentionDuration = Codegen.ofNullable(messageRetentionDuration);
            return this;
        }
        public Builder messageStoragePolicy(@Nullable Output<TopicMessageStoragePolicyArgs> messageStoragePolicy) {
            this.messageStoragePolicy = messageStoragePolicy;
            return this;
        }
        public Builder messageStoragePolicy(@Nullable TopicMessageStoragePolicyArgs messageStoragePolicy) {
            this.messageStoragePolicy = Codegen.ofNullable(messageStoragePolicy);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder schemaSettings(@Nullable Output<TopicSchemaSettingsArgs> schemaSettings) {
            this.schemaSettings = schemaSettings;
            return this;
        }
        public Builder schemaSettings(@Nullable TopicSchemaSettingsArgs schemaSettings) {
            this.schemaSettings = Codegen.ofNullable(schemaSettings);
            return this;
        }        public TopicArgs build() {
            return new TopicArgs(kmsKeyName, labels, messageRetentionDuration, messageStoragePolicy, name, project, schemaSettings);
        }
    }
}
