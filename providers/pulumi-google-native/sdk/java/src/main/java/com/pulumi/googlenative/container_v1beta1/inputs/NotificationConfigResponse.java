// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.PubSubResponse;
import java.util.Objects;


/**
 * NotificationConfig is the configuration of notifications.
 * 
 */
public final class NotificationConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final NotificationConfigResponse Empty = new NotificationConfigResponse();

    /**
     * Notification config for Pub/Sub.
     * 
     */
    @Import(name="pubsub", required=true)
    private PubSubResponse pubsub;

    /**
     * @return Notification config for Pub/Sub.
     * 
     */
    public PubSubResponse pubsub() {
        return this.pubsub;
    }

    private NotificationConfigResponse() {}

    private NotificationConfigResponse(NotificationConfigResponse $) {
        this.pubsub = $.pubsub;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationConfigResponse $;

        public Builder() {
            $ = new NotificationConfigResponse();
        }

        public Builder(NotificationConfigResponse defaults) {
            $ = new NotificationConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param pubsub Notification config for Pub/Sub.
         * 
         * @return builder
         * 
         */
        public Builder pubsub(PubSubResponse pubsub) {
            $.pubsub = pubsub;
            return this;
        }

        public NotificationConfigResponse build() {
            $.pubsub = Objects.requireNonNull($.pubsub, "expected parameter 'pubsub' to be non-null");
            return $;
        }
    }

}
