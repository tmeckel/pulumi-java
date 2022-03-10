// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.pubsublite_v1.inputs.DeliveryConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * The settings for this subscription's message delivery.
     * 
     */
    @InputImport(name="deliveryConfig")
      private final @Nullable Input<DeliveryConfigArgs> deliveryConfig;

    public Input<DeliveryConfigArgs> getDeliveryConfig() {
        return this.deliveryConfig == null ? Input.empty() : this.deliveryConfig;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the subscription. Structured like: projects/{project_number}/locations/{location}/subscriptions/{subscription_id}
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="skipBacklog")
      private final @Nullable Input<String> skipBacklog;

    public Input<String> getSkipBacklog() {
        return this.skipBacklog == null ? Input.empty() : this.skipBacklog;
    }

    @InputImport(name="subscriptionId", required=true)
      private final Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name of the topic this subscription is attached to. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    @InputImport(name="topic")
      private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    public SubscriptionArgs(
        @Nullable Input<DeliveryConfigArgs> deliveryConfig,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> skipBacklog,
        Input<String> subscriptionId,
        @Nullable Input<String> topic) {
        this.deliveryConfig = deliveryConfig;
        this.location = location;
        this.name = name;
        this.project = project;
        this.skipBacklog = skipBacklog;
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
        this.topic = topic;
    }

    private SubscriptionArgs() {
        this.deliveryConfig = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.skipBacklog = Input.empty();
        this.subscriptionId = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DeliveryConfigArgs> deliveryConfig;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> skipBacklog;
        private Input<String> subscriptionId;
        private @Nullable Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryConfig = defaults.deliveryConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.skipBacklog = defaults.skipBacklog;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.topic = defaults.topic;
        }

        public Builder deliveryConfig(@Nullable Input<DeliveryConfigArgs> deliveryConfig) {
            this.deliveryConfig = deliveryConfig;
            return this;
        }

        public Builder deliveryConfig(@Nullable DeliveryConfigArgs deliveryConfig) {
            this.deliveryConfig = Input.ofNullable(deliveryConfig);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder skipBacklog(@Nullable Input<String> skipBacklog) {
            this.skipBacklog = skipBacklog;
            return this;
        }

        public Builder skipBacklog(@Nullable String skipBacklog) {
            this.skipBacklog = Input.ofNullable(skipBacklog);
            return this;
        }

        public Builder subscriptionId(Input<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Input.of(Objects.requireNonNull(subscriptionId));
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
            return new SubscriptionArgs(deliveryConfig, location, name, project, skipBacklog, subscriptionId, topic);
        }
    }
}
