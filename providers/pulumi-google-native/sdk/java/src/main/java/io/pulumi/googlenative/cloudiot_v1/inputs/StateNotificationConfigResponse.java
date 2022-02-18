// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration for notification of new states received from the device.
 * 
 */
public final class StateNotificationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final StateNotificationConfigResponse Empty = new StateNotificationConfigResponse();

    /**
     * A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`.
     * 
     */
    @InputImport(name="pubsubTopicName", required=true)
    private final String pubsubTopicName;

    public String getPubsubTopicName() {
        return this.pubsubTopicName;
    }

    public StateNotificationConfigResponse(String pubsubTopicName) {
        this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName, "expected parameter 'pubsubTopicName' to be non-null");
    }

    private StateNotificationConfigResponse() {
        this.pubsubTopicName = null;
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

        public Builder setPubsubTopicName(String pubsubTopicName) {
            this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName);
            return this;
        }

        public StateNotificationConfigResponse build() {
            return new StateNotificationConfigResponse(pubsubTopicName);
        }
    }
}
