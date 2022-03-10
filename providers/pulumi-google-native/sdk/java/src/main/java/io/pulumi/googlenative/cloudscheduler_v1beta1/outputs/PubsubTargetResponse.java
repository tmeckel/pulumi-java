// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class PubsubTargetResponse {
    /**
     * Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    private final Map<String,String> attributes;
    /**
     * The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    private final String data;
    /**
     * The name of the Cloud Pub/Sub topic to which messages will be published when a job is delivered. The topic name must be in the same format as required by PubSub's [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in the same project as the Cloud Scheduler job.
     * 
     */
    private final String topicName;

    @OutputCustomType.Constructor
    private PubsubTargetResponse(
        @OutputCustomType.Parameter("attributes") Map<String,String> attributes,
        @OutputCustomType.Parameter("data") String data,
        @OutputCustomType.Parameter("topicName") String topicName) {
        this.attributes = attributes;
        this.data = data;
        this.topicName = topicName;
    }

    /**
     * Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
    */
    public Map<String,String> getAttributes() {
        return this.attributes;
    }
    /**
     * The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
    */
    public String getData() {
        return this.data;
    }
    /**
     * The name of the Cloud Pub/Sub topic to which messages will be published when a job is delivered. The topic name must be in the same format as required by PubSub's [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in the same project as the Cloud Scheduler job.
     * 
    */
    public String getTopicName() {
        return this.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> attributes;
        private String data;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.data = defaults.data;
    	      this.topicName = defaults.topicName;
        }

        public Builder attributes(Map<String,String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder topicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }
        public PubsubTargetResponse build() {
            return new PubsubTargetResponse(attributes, data, topicName);
        }
    }
}
