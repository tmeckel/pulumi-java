// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.pubsub_v1.outputs.DeadLetterPolicyResponse;
import io.pulumi.googlenative.pubsub_v1.outputs.ExpirationPolicyResponse;
import io.pulumi.googlenative.pubsub_v1.outputs.PushConfigResponse;
import io.pulumi.googlenative.pubsub_v1.outputs.RetryPolicyResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetSubscriptionResult {
    /**
     * The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
     * 
     */
    private final Integer ackDeadlineSeconds;
    /**
     * A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service account associated with this subscriptions's parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on this subscription.
     * 
     */
    private final DeadLetterPolicyResponse deadLetterPolicy;
    /**
     * Indicates whether the subscription is detached from its topic. Detached subscriptions don't receive messages from their topic and don't retain any backlog. `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
     * 
     */
    private final Boolean detached;
    /**
     * If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they may be delivered in any order.
     * 
     */
    private final Boolean enableMessageOrdering;
    /**
     * A policy that specifies the conditions for this subscription's expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
     * 
     */
    private final ExpirationPolicyResponse expirationPolicy;
    /**
     * An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the filter are delivered on this subscription. If empty, then no messages are filtered out.
     * 
     */
    private final String filter;
    /**
     * See Creating and managing labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * How long to retain unacknowledged messages in the subscription's backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    private final String messageRetentionDuration;
    /**
     * The name of the subscription. It must have the format `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
     * 
     */
    private final String name;
    /**
     * If push delivery is used with this subscription, this field is used to configure it. At most one of `pushConfig` and `bigQueryConfig` can be set. If both are empty, then the subscriber will pull and ack messages using API methods.
     * 
     */
    private final PushConfigResponse pushConfig;
    /**
     * Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription's backlog, even if they are acknowledged, until they fall out of the `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to replay previously-acknowledged messages.
     * 
     */
    private final Boolean retainAckedMessages;
    /**
     * A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
     * 
     */
    private final RetryPolicyResponse retryPolicy;
    /**
     * An output-only field indicating whether or not the subscription can receive messages.
     * 
     */
    private final String state;
    /**
     * The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    private final String topic;
    /**
     * Indicates the minimum duration for which a message is retained after it is published to the subscription's topic. If this field is set, messages published to the subscription's topic in the last `topic_message_retention_duration` are always available to subscribers. See the `message_retention_duration` field in `Topic`. This field is set only in responses from the server; it is ignored if it is set in any requests.
     * 
     */
    private final String topicMessageRetentionDuration;

    @OutputCustomType.Constructor
    private GetSubscriptionResult(
        @OutputCustomType.Parameter("ackDeadlineSeconds") Integer ackDeadlineSeconds,
        @OutputCustomType.Parameter("deadLetterPolicy") DeadLetterPolicyResponse deadLetterPolicy,
        @OutputCustomType.Parameter("detached") Boolean detached,
        @OutputCustomType.Parameter("enableMessageOrdering") Boolean enableMessageOrdering,
        @OutputCustomType.Parameter("expirationPolicy") ExpirationPolicyResponse expirationPolicy,
        @OutputCustomType.Parameter("filter") String filter,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("messageRetentionDuration") String messageRetentionDuration,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("pushConfig") PushConfigResponse pushConfig,
        @OutputCustomType.Parameter("retainAckedMessages") Boolean retainAckedMessages,
        @OutputCustomType.Parameter("retryPolicy") RetryPolicyResponse retryPolicy,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("topic") String topic,
        @OutputCustomType.Parameter("topicMessageRetentionDuration") String topicMessageRetentionDuration) {
        this.ackDeadlineSeconds = ackDeadlineSeconds;
        this.deadLetterPolicy = deadLetterPolicy;
        this.detached = detached;
        this.enableMessageOrdering = enableMessageOrdering;
        this.expirationPolicy = expirationPolicy;
        this.filter = filter;
        this.labels = labels;
        this.messageRetentionDuration = messageRetentionDuration;
        this.name = name;
        this.pushConfig = pushConfig;
        this.retainAckedMessages = retainAckedMessages;
        this.retryPolicy = retryPolicy;
        this.state = state;
        this.topic = topic;
        this.topicMessageRetentionDuration = topicMessageRetentionDuration;
    }

    /**
     * The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
     * 
    */
    public Integer getAckDeadlineSeconds() {
        return this.ackDeadlineSeconds;
    }
    /**
     * A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service account associated with this subscriptions's parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on this subscription.
     * 
    */
    public DeadLetterPolicyResponse getDeadLetterPolicy() {
        return this.deadLetterPolicy;
    }
    /**
     * Indicates whether the subscription is detached from its topic. Detached subscriptions don't receive messages from their topic and don't retain any backlog. `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
     * 
    */
    public Boolean getDetached() {
        return this.detached;
    }
    /**
     * If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they may be delivered in any order.
     * 
    */
    public Boolean getEnableMessageOrdering() {
        return this.enableMessageOrdering;
    }
    /**
     * A policy that specifies the conditions for this subscription's expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
     * 
    */
    public ExpirationPolicyResponse getExpirationPolicy() {
        return this.expirationPolicy;
    }
    /**
     * An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the filter are delivered on this subscription. If empty, then no messages are filtered out.
     * 
    */
    public String getFilter() {
        return this.filter;
    }
    /**
     * See Creating and managing labels.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * How long to retain unacknowledged messages in the subscription's backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
     * 
    */
    public String getMessageRetentionDuration() {
        return this.messageRetentionDuration;
    }
    /**
     * The name of the subscription. It must have the format `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * If push delivery is used with this subscription, this field is used to configure it. At most one of `pushConfig` and `bigQueryConfig` can be set. If both are empty, then the subscriber will pull and ack messages using API methods.
     * 
    */
    public PushConfigResponse getPushConfig() {
        return this.pushConfig;
    }
    /**
     * Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription's backlog, even if they are acknowledged, until they fall out of the `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to replay previously-acknowledged messages.
     * 
    */
    public Boolean getRetainAckedMessages() {
        return this.retainAckedMessages;
    }
    /**
     * A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
     * 
    */
    public RetryPolicyResponse getRetryPolicy() {
        return this.retryPolicy;
    }
    /**
     * An output-only field indicating whether or not the subscription can receive messages.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
    */
    public String getTopic() {
        return this.topic;
    }
    /**
     * Indicates the minimum duration for which a message is retained after it is published to the subscription's topic. If this field is set, messages published to the subscription's topic in the last `topic_message_retention_duration` are always available to subscribers. See the `message_retention_duration` field in `Topic`. This field is set only in responses from the server; it is ignored if it is set in any requests.
     * 
    */
    public String getTopicMessageRetentionDuration() {
        return this.topicMessageRetentionDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer ackDeadlineSeconds;
        private DeadLetterPolicyResponse deadLetterPolicy;
        private Boolean detached;
        private Boolean enableMessageOrdering;
        private ExpirationPolicyResponse expirationPolicy;
        private String filter;
        private Map<String,String> labels;
        private String messageRetentionDuration;
        private String name;
        private PushConfigResponse pushConfig;
        private Boolean retainAckedMessages;
        private RetryPolicyResponse retryPolicy;
        private String state;
        private String topic;
        private String topicMessageRetentionDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ackDeadlineSeconds = defaults.ackDeadlineSeconds;
    	      this.deadLetterPolicy = defaults.deadLetterPolicy;
    	      this.detached = defaults.detached;
    	      this.enableMessageOrdering = defaults.enableMessageOrdering;
    	      this.expirationPolicy = defaults.expirationPolicy;
    	      this.filter = defaults.filter;
    	      this.labels = defaults.labels;
    	      this.messageRetentionDuration = defaults.messageRetentionDuration;
    	      this.name = defaults.name;
    	      this.pushConfig = defaults.pushConfig;
    	      this.retainAckedMessages = defaults.retainAckedMessages;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.state = defaults.state;
    	      this.topic = defaults.topic;
    	      this.topicMessageRetentionDuration = defaults.topicMessageRetentionDuration;
        }

        public Builder ackDeadlineSeconds(Integer ackDeadlineSeconds) {
            this.ackDeadlineSeconds = Objects.requireNonNull(ackDeadlineSeconds);
            return this;
        }

        public Builder deadLetterPolicy(DeadLetterPolicyResponse deadLetterPolicy) {
            this.deadLetterPolicy = Objects.requireNonNull(deadLetterPolicy);
            return this;
        }

        public Builder detached(Boolean detached) {
            this.detached = Objects.requireNonNull(detached);
            return this;
        }

        public Builder enableMessageOrdering(Boolean enableMessageOrdering) {
            this.enableMessageOrdering = Objects.requireNonNull(enableMessageOrdering);
            return this;
        }

        public Builder expirationPolicy(ExpirationPolicyResponse expirationPolicy) {
            this.expirationPolicy = Objects.requireNonNull(expirationPolicy);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder messageRetentionDuration(String messageRetentionDuration) {
            this.messageRetentionDuration = Objects.requireNonNull(messageRetentionDuration);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder pushConfig(PushConfigResponse pushConfig) {
            this.pushConfig = Objects.requireNonNull(pushConfig);
            return this;
        }

        public Builder retainAckedMessages(Boolean retainAckedMessages) {
            this.retainAckedMessages = Objects.requireNonNull(retainAckedMessages);
            return this;
        }

        public Builder retryPolicy(RetryPolicyResponse retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder topicMessageRetentionDuration(String topicMessageRetentionDuration) {
            this.topicMessageRetentionDuration = Objects.requireNonNull(topicMessageRetentionDuration);
            return this;
        }
        public GetSubscriptionResult build() {
            return new GetSubscriptionResult(ackDeadlineSeconds, deadLetterPolicy, detached, enableMessageOrdering, expirationPolicy, filter, labels, messageRetentionDuration, name, pushConfig, retainAckedMessages, retryPolicy, state, topic, topicMessageRetentionDuration);
        }
    }
}
