// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyGetArgs;
import io.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyGetArgs;
import io.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigGetArgs;
import io.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionState Empty = new SubscriptionState();

    /**
     * This value is the maximum time after a subscriber receives a message
     * before the subscriber should acknowledge the message. After message
     * delivery but before the ack deadline expires and before the message is
     * acknowledged, it is an outstanding message and will not be delivered
     * again during that time (on a best-effort basis).
     * For pull subscriptions, this value is used as the initial value for
     * the ack deadline. To override this value for a given message, call
     * subscriptions.modifyAckDeadline with the corresponding ackId if using
     * pull. The minimum custom deadline you can specify is 10 seconds. The
     * maximum custom deadline you can specify is 600 seconds (10 minutes).
     * If this parameter is 0, a default value of 10 seconds is used.
     * For push delivery, this value is also used to set the request timeout
     * for the call to the push endpoint.
     * If the subscriber never acknowledges the message, the Pub/Sub system
     * will eventually redeliver the message.
     * 
     */
    @Import(name="ackDeadlineSeconds")
      private final @Nullable Output<Integer> ackDeadlineSeconds;

    public Output<Integer> getAckDeadlineSeconds() {
        return this.ackDeadlineSeconds == null ? Codegen.empty() : this.ackDeadlineSeconds;
    }

    /**
     * A policy that specifies the conditions for dead lettering messages in
     * this subscription. If dead_letter_policy is not set, dead lettering
     * is disabled.
     * The Cloud Pub/Sub service account associated with this subscription's
     * parent project (i.e.,
     * service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have
     * permission to Acknowledge() messages on this subscription.
     * Structure is documented below.
     * 
     */
    @Import(name="deadLetterPolicy")
      private final @Nullable Output<SubscriptionDeadLetterPolicyGetArgs> deadLetterPolicy;

    public Output<SubscriptionDeadLetterPolicyGetArgs> getDeadLetterPolicy() {
        return this.deadLetterPolicy == null ? Codegen.empty() : this.deadLetterPolicy;
    }

    /**
     * If `true`, messages published with the same orderingKey in PubsubMessage will be delivered to
     * the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they
     * may be delivered in any order.
     * 
     */
    @Import(name="enableMessageOrdering")
      private final @Nullable Output<Boolean> enableMessageOrdering;

    public Output<Boolean> getEnableMessageOrdering() {
        return this.enableMessageOrdering == null ? Codegen.empty() : this.enableMessageOrdering;
    }

    /**
     * A policy that specifies the conditions for this subscription's expiration.
     * A subscription is considered active as long as any connected subscriber
     * is successfully consuming messages from the subscription or is issuing
     * operations on the subscription. If expirationPolicy is not set, a default
     * policy with ttl of 31 days will be used.  If it is set but ttl is "", the
     * resource never expires.  The minimum allowed value for expirationPolicy.ttl
     * is 1 day.
     * Structure is documented below.
     * 
     */
    @Import(name="expirationPolicy")
      private final @Nullable Output<SubscriptionExpirationPolicyGetArgs> expirationPolicy;

    public Output<SubscriptionExpirationPolicyGetArgs> getExpirationPolicy() {
        return this.expirationPolicy == null ? Codegen.empty() : this.expirationPolicy;
    }

    /**
     * The subscription only delivers the messages that match the filter.
     * Pub/Sub automatically acknowledges the messages that don't match the filter. You can filter messages
     * by their attributes. The maximum length of a filter is 256 bytes. After creating the subscription,
     * you can't modify the filter.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * A set of key/value label pairs to assign to this Subscription.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * How long to retain unacknowledged messages in the subscription's
     * backlog, from the moment a message is published. If
     * retainAckedMessages is true, then this also configures the retention
     * of acknowledged messages, and thus configures how far back in time a
     * subscriptions.seek can be done. Defaults to 7 days. Cannot be more
     * than 7 days (`"604800s"`) or less than 10 minutes (`"600s"`).
     * A duration in seconds with up to nine fractional digits, terminated
     * by 's'. Example: `"600.5s"`.
     * 
     */
    @Import(name="messageRetentionDuration")
      private final @Nullable Output<String> messageRetentionDuration;

    public Output<String> getMessageRetentionDuration() {
        return this.messageRetentionDuration == null ? Codegen.empty() : this.messageRetentionDuration;
    }

    /**
     * Name of the subscription.
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
     * If push delivery is used with this subscription, this field is used to
     * configure it. An empty pushConfig signifies that the subscriber will
     * pull and ack messages using API methods.
     * Structure is documented below.
     * 
     */
    @Import(name="pushConfig")
      private final @Nullable Output<SubscriptionPushConfigGetArgs> pushConfig;

    public Output<SubscriptionPushConfigGetArgs> getPushConfig() {
        return this.pushConfig == null ? Codegen.empty() : this.pushConfig;
    }

    /**
     * Indicates whether to retain acknowledged messages. If `true`, then
     * messages are not expunged from the subscription's backlog, even if
     * they are acknowledged, until they fall out of the
     * messageRetentionDuration window.
     * 
     */
    @Import(name="retainAckedMessages")
      private final @Nullable Output<Boolean> retainAckedMessages;

    public Output<Boolean> getRetainAckedMessages() {
        return this.retainAckedMessages == null ? Codegen.empty() : this.retainAckedMessages;
    }

    /**
     * A policy that specifies how Pub/Sub retries message delivery for this subscription.
     * If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers.
     * RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<SubscriptionRetryPolicyGetArgs> retryPolicy;

    public Output<SubscriptionRetryPolicyGetArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Codegen.empty() : this.retryPolicy;
    }

    /**
     * A reference to a Topic resource.
     * 
     */
    @Import(name="topic")
      private final @Nullable Output<String> topic;

    public Output<String> getTopic() {
        return this.topic == null ? Codegen.empty() : this.topic;
    }

    public SubscriptionState(
        @Nullable Output<Integer> ackDeadlineSeconds,
        @Nullable Output<SubscriptionDeadLetterPolicyGetArgs> deadLetterPolicy,
        @Nullable Output<Boolean> enableMessageOrdering,
        @Nullable Output<SubscriptionExpirationPolicyGetArgs> expirationPolicy,
        @Nullable Output<String> filter,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> messageRetentionDuration,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<SubscriptionPushConfigGetArgs> pushConfig,
        @Nullable Output<Boolean> retainAckedMessages,
        @Nullable Output<SubscriptionRetryPolicyGetArgs> retryPolicy,
        @Nullable Output<String> topic) {
        this.ackDeadlineSeconds = ackDeadlineSeconds;
        this.deadLetterPolicy = deadLetterPolicy;
        this.enableMessageOrdering = enableMessageOrdering;
        this.expirationPolicy = expirationPolicy;
        this.filter = filter;
        this.labels = labels;
        this.messageRetentionDuration = messageRetentionDuration;
        this.name = name;
        this.project = project;
        this.pushConfig = pushConfig;
        this.retainAckedMessages = retainAckedMessages;
        this.retryPolicy = retryPolicy;
        this.topic = topic;
    }

    private SubscriptionState() {
        this.ackDeadlineSeconds = Codegen.empty();
        this.deadLetterPolicy = Codegen.empty();
        this.enableMessageOrdering = Codegen.empty();
        this.expirationPolicy = Codegen.empty();
        this.filter = Codegen.empty();
        this.labels = Codegen.empty();
        this.messageRetentionDuration = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.pushConfig = Codegen.empty();
        this.retainAckedMessages = Codegen.empty();
        this.retryPolicy = Codegen.empty();
        this.topic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> ackDeadlineSeconds;
        private @Nullable Output<SubscriptionDeadLetterPolicyGetArgs> deadLetterPolicy;
        private @Nullable Output<Boolean> enableMessageOrdering;
        private @Nullable Output<SubscriptionExpirationPolicyGetArgs> expirationPolicy;
        private @Nullable Output<String> filter;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> messageRetentionDuration;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<SubscriptionPushConfigGetArgs> pushConfig;
        private @Nullable Output<Boolean> retainAckedMessages;
        private @Nullable Output<SubscriptionRetryPolicyGetArgs> retryPolicy;
        private @Nullable Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ackDeadlineSeconds = defaults.ackDeadlineSeconds;
    	      this.deadLetterPolicy = defaults.deadLetterPolicy;
    	      this.enableMessageOrdering = defaults.enableMessageOrdering;
    	      this.expirationPolicy = defaults.expirationPolicy;
    	      this.filter = defaults.filter;
    	      this.labels = defaults.labels;
    	      this.messageRetentionDuration = defaults.messageRetentionDuration;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pushConfig = defaults.pushConfig;
    	      this.retainAckedMessages = defaults.retainAckedMessages;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.topic = defaults.topic;
        }

        public Builder ackDeadlineSeconds(@Nullable Output<Integer> ackDeadlineSeconds) {
            this.ackDeadlineSeconds = ackDeadlineSeconds;
            return this;
        }
        public Builder ackDeadlineSeconds(@Nullable Integer ackDeadlineSeconds) {
            this.ackDeadlineSeconds = Codegen.ofNullable(ackDeadlineSeconds);
            return this;
        }
        public Builder deadLetterPolicy(@Nullable Output<SubscriptionDeadLetterPolicyGetArgs> deadLetterPolicy) {
            this.deadLetterPolicy = deadLetterPolicy;
            return this;
        }
        public Builder deadLetterPolicy(@Nullable SubscriptionDeadLetterPolicyGetArgs deadLetterPolicy) {
            this.deadLetterPolicy = Codegen.ofNullable(deadLetterPolicy);
            return this;
        }
        public Builder enableMessageOrdering(@Nullable Output<Boolean> enableMessageOrdering) {
            this.enableMessageOrdering = enableMessageOrdering;
            return this;
        }
        public Builder enableMessageOrdering(@Nullable Boolean enableMessageOrdering) {
            this.enableMessageOrdering = Codegen.ofNullable(enableMessageOrdering);
            return this;
        }
        public Builder expirationPolicy(@Nullable Output<SubscriptionExpirationPolicyGetArgs> expirationPolicy) {
            this.expirationPolicy = expirationPolicy;
            return this;
        }
        public Builder expirationPolicy(@Nullable SubscriptionExpirationPolicyGetArgs expirationPolicy) {
            this.expirationPolicy = Codegen.ofNullable(expirationPolicy);
            return this;
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
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
        public Builder pushConfig(@Nullable Output<SubscriptionPushConfigGetArgs> pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }
        public Builder pushConfig(@Nullable SubscriptionPushConfigGetArgs pushConfig) {
            this.pushConfig = Codegen.ofNullable(pushConfig);
            return this;
        }
        public Builder retainAckedMessages(@Nullable Output<Boolean> retainAckedMessages) {
            this.retainAckedMessages = retainAckedMessages;
            return this;
        }
        public Builder retainAckedMessages(@Nullable Boolean retainAckedMessages) {
            this.retainAckedMessages = Codegen.ofNullable(retainAckedMessages);
            return this;
        }
        public Builder retryPolicy(@Nullable Output<SubscriptionRetryPolicyGetArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable SubscriptionRetryPolicyGetArgs retryPolicy) {
            this.retryPolicy = Codegen.ofNullable(retryPolicy);
            return this;
        }
        public Builder topic(@Nullable Output<String> topic) {
            this.topic = topic;
            return this;
        }
        public Builder topic(@Nullable String topic) {
            this.topic = Codegen.ofNullable(topic);
            return this;
        }        public SubscriptionState build() {
            return new SubscriptionState(ackDeadlineSeconds, deadLetterPolicy, enableMessageOrdering, expirationPolicy, filter, labels, messageRetentionDuration, name, project, pushConfig, retainAckedMessages, retryPolicy, topic);
        }
    }
}
