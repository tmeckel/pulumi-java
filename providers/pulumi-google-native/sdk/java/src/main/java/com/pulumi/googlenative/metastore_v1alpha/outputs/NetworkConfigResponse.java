// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.metastore_v1alpha.outputs.ConsumerResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NetworkConfigResponse {
    /**
     * @return Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
     * 
     */
    private final List<ConsumerResponse> consumers;

    @CustomType.Constructor
    private NetworkConfigResponse(@CustomType.Parameter("consumers") List<ConsumerResponse> consumers) {
        this.consumers = consumers;
    }

    /**
     * @return Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
     * 
     */
    public List<ConsumerResponse> consumers() {
        return this.consumers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ConsumerResponse> consumers;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumers = defaults.consumers;
        }

        public Builder consumers(List<ConsumerResponse> consumers) {
            this.consumers = Objects.requireNonNull(consumers);
            return this;
        }
        public Builder consumers(ConsumerResponse... consumers) {
            return consumers(List.of(consumers));
        }        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(consumers);
        }
    }
}
