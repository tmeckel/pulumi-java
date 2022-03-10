// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StateNotificationConfigResponse {
    /**
     * A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`.
     * 
     */
    private final String pubsubTopicName;

    @OutputCustomType.Constructor
    private StateNotificationConfigResponse(@OutputCustomType.Parameter("pubsubTopicName") String pubsubTopicName) {
        this.pubsubTopicName = pubsubTopicName;
    }

    /**
     * A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`.
     * 
    */
    public String getPubsubTopicName() {
        return this.pubsubTopicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateNotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pubsubTopicName;

        public Builder() {
    	      // Empty
        }

        public Builder(StateNotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopicName = defaults.pubsubTopicName;
        }

        public Builder pubsubTopicName(String pubsubTopicName) {
            this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName);
            return this;
        }
        public StateNotificationConfigResponse build() {
            return new StateNotificationConfigResponse(pubsubTopicName);
        }
    }
}
