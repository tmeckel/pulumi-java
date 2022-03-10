// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class Hl7StoreNotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreNotificationConfigArgs Empty = new Hl7StoreNotificationConfigArgs();

    /**
     * The Cloud Pub/Sub topic that notifications of changes are published on. Supplied by the client.
     * PubsubMessage.Data will contain the resource name. PubsubMessage.MessageId is the ID of this message.
     * It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message
     * was published. Notifications are only sent if the topic is non-empty. Topic names must be scoped to a
     * project. service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com must have publisher permissions on the given
     * Cloud Pub/Sub topic. Not having adequate permissions will cause the calls that send notifications to fail.
     * 
     */
    @InputImport(name="pubsubTopic", required=true)
      private final Input<String> pubsubTopic;

    public Input<String> getPubsubTopic() {
        return this.pubsubTopic;
    }

    public Hl7StoreNotificationConfigArgs(Input<String> pubsubTopic) {
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic, "expected parameter 'pubsubTopic' to be non-null");
    }

    private Hl7StoreNotificationConfigArgs() {
        this.pubsubTopic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreNotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> pubsubTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreNotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopic = defaults.pubsubTopic;
        }

        public Builder pubsubTopic(Input<String> pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }

        public Builder pubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Input.of(Objects.requireNonNull(pubsubTopic));
            return this;
        }
        public Hl7StoreNotificationConfigArgs build() {
            return new Hl7StoreNotificationConfigArgs(pubsubTopic);
        }
    }
}
