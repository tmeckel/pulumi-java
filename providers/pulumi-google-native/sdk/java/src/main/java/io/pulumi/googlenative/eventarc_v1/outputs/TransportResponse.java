// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.eventarc_v1.outputs.PubsubResponse;
import java.util.Objects;

@OutputCustomType
public final class TransportResponse {
    /**
     * The Pub/Sub topic and subscription used by Eventarc as a transport intermediary.
     * 
     */
    private final PubsubResponse pubsub;

    @OutputCustomType.Constructor({"pubsub"})
    private TransportResponse(PubsubResponse pubsub) {
        this.pubsub = Objects.requireNonNull(pubsub);
    }

    /**
     * The Pub/Sub topic and subscription used by Eventarc as a transport intermediary.
     * 
     */
    public PubsubResponse getPubsub() {
        return this.pubsub;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PubsubResponse pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(TransportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder setPubsub(PubsubResponse pubsub) {
            this.pubsub = Objects.requireNonNull(pubsub);
            return this;
        }

        public TransportResponse build() {
            return new TransportResponse(pubsub);
        }
    }
}
