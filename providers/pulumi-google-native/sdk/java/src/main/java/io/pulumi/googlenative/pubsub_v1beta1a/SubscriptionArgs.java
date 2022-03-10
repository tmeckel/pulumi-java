// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta1a;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.pubsub_v1beta1a.inputs.PushConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * For either push or pull delivery, the value is the maximum time after a subscriber receives a message before the subscriber should acknowledge or Nack the message. If the Ack deadline for a message passes without an Ack or a Nack, the Pub/Sub system will eventually redeliver the message. If a subscriber acknowledges after the deadline, the Pub/Sub system may accept the Ack, but it is possible that the message has been already delivered again. Multiple Acks to the message are allowed and will succeed. For push delivery, this value is used to set the request timeout for the call to the push endpoint. For pull delivery, this value is used as the initial value for the Ack deadline. It may be overridden for each message using its corresponding ack_id with ModifyAckDeadline. While a message is outstanding (i.e. it has been delivered to a pull subscriber and the subscriber has not yet Acked or Nacked), the Pub/Sub system will not deliver that message to another pull subscriber (on a best-effort basis).
     * 
     */
    @InputImport(name="ackDeadlineSeconds")
      private final @Nullable Input<Integer> ackDeadlineSeconds;

    public Input<Integer> getAckDeadlineSeconds() {
        return this.ackDeadlineSeconds == null ? Input.empty() : this.ackDeadlineSeconds;
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
     * If push delivery is used with this subscription, this field is used to configure it.
     * 
     */
    @InputImport(name="pushConfig")
      private final @Nullable Input<PushConfigArgs> pushConfig;

    public Input<PushConfigArgs> getPushConfig() {
        return this.pushConfig == null ? Input.empty() : this.pushConfig;
    }

    /**
     * The name of the topic from which this subscription is receiving messages.
     * 
     */
    @InputImport(name="topic")
      private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    public SubscriptionArgs(
        @Nullable Input<Integer> ackDeadlineSeconds,
        @Nullable Input<String> name,
        @Nullable Input<PushConfigArgs> pushConfig,
        @Nullable Input<String> topic) {
        this.ackDeadlineSeconds = ackDeadlineSeconds;
        this.name = name;
        this.pushConfig = pushConfig;
        this.topic = topic;
    }

    private SubscriptionArgs() {
        this.ackDeadlineSeconds = Input.empty();
        this.name = Input.empty();
        this.pushConfig = Input.empty();
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
        private @Nullable Input<String> name;
        private @Nullable Input<PushConfigArgs> pushConfig;
        private @Nullable Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ackDeadlineSeconds = defaults.ackDeadlineSeconds;
    	      this.name = defaults.name;
    	      this.pushConfig = defaults.pushConfig;
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

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder pushConfig(@Nullable Input<PushConfigArgs> pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }

        public Builder pushConfig(@Nullable PushConfigArgs pushConfig) {
            this.pushConfig = Input.ofNullable(pushConfig);
            return this;
        }

        public Builder topic(@Nullable Input<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder topic(@Nullable String topic) {
            this.topic = Input.ofNullable(topic);
            return this;
        }
        public SubscriptionArgs build() {
            return new SubscriptionArgs(ackDeadlineSeconds, name, pushConfig, topic);
        }
    }
}
