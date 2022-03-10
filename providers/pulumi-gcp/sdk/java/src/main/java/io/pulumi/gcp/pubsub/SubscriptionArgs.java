// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyArgs;
import io.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyArgs;
import io.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs;
import io.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

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
    @InputImport(name="ackDeadlineSeconds")
      private final @Nullable Input<Integer> ackDeadlineSeconds;

    public Input<Integer> getAckDeadlineSeconds() {
        return this.ackDeadlineSeconds == null ? Input.empty() : this.ackDeadlineSeconds;
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
    @InputImport(name="deadLetterPolicy")
      private final @Nullable Input<SubscriptionDeadLetterPolicyArgs> deadLetterPolicy;

    public Input<SubscriptionDeadLetterPolicyArgs> getDeadLetterPolicy() {
        return this.deadLetterPolicy == null ? Input.empty() : this.deadLetterPolicy;
    }

    /**
     * If `true`, messages published with the same orderingKey in PubsubMessage will be delivered to
     * the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they
     * may be delivered in any order.
     * 
     */
    @InputImport(name="enableMessageOrdering")
      private final @Nullable Input<Boolean> enableMessageOrdering;

    public Input<Boolean> getEnableMessageOrdering() {
        return this.enableMessageOrdering == null ? Input.empty() : this.enableMessageOrdering;
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
    @InputImport(name="expirationPolicy")
      private final @Nullable Input<SubscriptionExpirationPolicyArgs> expirationPolicy;

    public Input<SubscriptionExpirationPolicyArgs> getExpirationPolicy() {
        return this.expirationPolicy == null ? Input.empty() : this.expirationPolicy;
    }

    /**
     * The subscription only delivers the messages that match the filter.
     * Pub/Sub automatically acknowledges the messages that don't match the filter. You can filter messages
     * by their attributes. The maximum length of a filter is 256 bytes. After creating the subscription,
     * you can't modify the filter.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * A set of key/value label pairs to assign to this Subscription.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
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
    @InputImport(name="messageRetentionDuration")
      private final @Nullable Input<String> messageRetentionDuration;

    public Input<String> getMessageRetentionDuration() {
        return this.messageRetentionDuration == null ? Input.empty() : this.messageRetentionDuration;
    }

    /**
     * Name of the subscription.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * If push delivery is used with this subscription, this field is used to
     * configure it. An empty pushConfig signifies that the subscriber will
     * pull and ack messages using API methods.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pushConfig")
      private final @Nullable Input<SubscriptionPushConfigArgs> pushConfig;

    public Input<SubscriptionPushConfigArgs> getPushConfig() {
        return this.pushConfig == null ? Input.empty() : this.pushConfig;
    }

    /**
     * Indicates whether to retain acknowledged messages. If `true`, then
     * messages are not expunged from the subscription's backlog, even if
     * they are acknowledged, until they fall out of the
     * messageRetentionDuration window.
     * 
     */
    @InputImport(name="retainAckedMessages")
      private final @Nullable Input<Boolean> retainAckedMessages;

    public Input<Boolean> getRetainAckedMessages() {
        return this.retainAckedMessages == null ? Input.empty() : this.retainAckedMessages;
    }

    /**
     * A policy that specifies how Pub/Sub retries message delivery for this subscription.
     * If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers.
     * RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message
     * Structure is documented below.
     * 
     */
    @InputImport(name="retryPolicy")
      private final @Nullable Input<SubscriptionRetryPolicyArgs> retryPolicy;

    public Input<SubscriptionRetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Input.empty() : this.retryPolicy;
    }

    /**
     * A reference to a Topic resource.
     * 
     */
    @InputImport(name="topic", required=true)
      private final Input<String> topic;

    public Input<String> getTopic() {
        return this.topic;
    }

    public SubscriptionArgs(
        @Nullable Input<Integer> ackDeadlineSeconds,
        @Nullable Input<SubscriptionDeadLetterPolicyArgs> deadLetterPolicy,
        @Nullable Input<Boolean> enableMessageOrdering,
        @Nullable Input<SubscriptionExpirationPolicyArgs> expirationPolicy,
        @Nullable Input<String> filter,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> messageRetentionDuration,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<SubscriptionPushConfigArgs> pushConfig,
        @Nullable Input<Boolean> retainAckedMessages,
        @Nullable Input<SubscriptionRetryPolicyArgs> retryPolicy,
        Input<String> topic) {
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
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private SubscriptionArgs() {
        this.ackDeadlineSeconds = Input.empty();
        this.deadLetterPolicy = Input.empty();
        this.enableMessageOrdering = Input.empty();
        this.expirationPolicy = Input.empty();
        this.filter = Input.empty();
        this.labels = Input.empty();
        this.messageRetentionDuration = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.pushConfig = Input.empty();
        this.retainAckedMessages = Input.empty();
        this.retryPolicy = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> ackDeadlineSeconds;
        private @Nullable Input<SubscriptionDeadLetterPolicyArgs> deadLetterPolicy;
        private @Nullable Input<Boolean> enableMessageOrdering;
        private @Nullable Input<SubscriptionExpirationPolicyArgs> expirationPolicy;
        private @Nullable Input<String> filter;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> messageRetentionDuration;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<SubscriptionPushConfigArgs> pushConfig;
        private @Nullable Input<Boolean> retainAckedMessages;
        private @Nullable Input<SubscriptionRetryPolicyArgs> retryPolicy;
        private Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
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

        public Builder ackDeadlineSeconds(@Nullable Input<Integer> ackDeadlineSeconds) {
            this.ackDeadlineSeconds = ackDeadlineSeconds;
            return this;
        }

        public Builder ackDeadlineSeconds(@Nullable Integer ackDeadlineSeconds) {
            this.ackDeadlineSeconds = Input.ofNullable(ackDeadlineSeconds);
            return this;
        }

        public Builder deadLetterPolicy(@Nullable Input<SubscriptionDeadLetterPolicyArgs> deadLetterPolicy) {
            this.deadLetterPolicy = deadLetterPolicy;
            return this;
        }

        public Builder deadLetterPolicy(@Nullable SubscriptionDeadLetterPolicyArgs deadLetterPolicy) {
            this.deadLetterPolicy = Input.ofNullable(deadLetterPolicy);
            return this;
        }

        public Builder enableMessageOrdering(@Nullable Input<Boolean> enableMessageOrdering) {
            this.enableMessageOrdering = enableMessageOrdering;
            return this;
        }

        public Builder enableMessageOrdering(@Nullable Boolean enableMessageOrdering) {
            this.enableMessageOrdering = Input.ofNullable(enableMessageOrdering);
            return this;
        }

        public Builder expirationPolicy(@Nullable Input<SubscriptionExpirationPolicyArgs> expirationPolicy) {
            this.expirationPolicy = expirationPolicy;
            return this;
        }

        public Builder expirationPolicy(@Nullable SubscriptionExpirationPolicyArgs expirationPolicy) {
            this.expirationPolicy = Input.ofNullable(expirationPolicy);
            return this;
        }

        public Builder filter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder messageRetentionDuration(@Nullable Input<String> messageRetentionDuration) {
            this.messageRetentionDuration = messageRetentionDuration;
            return this;
        }

        public Builder messageRetentionDuration(@Nullable String messageRetentionDuration) {
            this.messageRetentionDuration = Input.ofNullable(messageRetentionDuration);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder pushConfig(@Nullable Input<SubscriptionPushConfigArgs> pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }

        public Builder pushConfig(@Nullable SubscriptionPushConfigArgs pushConfig) {
            this.pushConfig = Input.ofNullable(pushConfig);
            return this;
        }

        public Builder retainAckedMessages(@Nullable Input<Boolean> retainAckedMessages) {
            this.retainAckedMessages = retainAckedMessages;
            return this;
        }

        public Builder retainAckedMessages(@Nullable Boolean retainAckedMessages) {
            this.retainAckedMessages = Input.ofNullable(retainAckedMessages);
            return this;
        }

        public Builder retryPolicy(@Nullable Input<SubscriptionRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable SubscriptionRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Input.ofNullable(retryPolicy);
            return this;
        }

        public Builder topic(Input<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder topic(String topic) {
            this.topic = Input.of(Objects.requireNonNull(topic));
            return this;
        }
        public SubscriptionArgs build() {
            return new SubscriptionArgs(ackDeadlineSeconds, deadLetterPolicy, enableMessageOrdering, expirationPolicy, filter, labels, messageRetentionDuration, name, project, pushConfig, retainAckedMessages, retryPolicy, topic);
        }
    }
}
