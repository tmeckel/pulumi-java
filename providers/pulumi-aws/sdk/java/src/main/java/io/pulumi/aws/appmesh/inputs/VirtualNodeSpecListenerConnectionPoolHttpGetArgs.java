// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerConnectionPoolHttpGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolHttpGetArgs Empty = new VirtualNodeSpecListenerConnectionPoolHttpGetArgs();

    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @InputImport(name="maxConnections", required=true)
      private final Input<Integer> maxConnections;

    public Input<Integer> getMaxConnections() {
        return this.maxConnections;
    }

    /**
     * Number of overflowing requests after `max_connections` Envoy will queue to upstream cluster. Minimum value of `1`.
     * 
     */
    @InputImport(name="maxPendingRequests")
      private final @Nullable Input<Integer> maxPendingRequests;

    public Input<Integer> getMaxPendingRequests() {
        return this.maxPendingRequests == null ? Input.empty() : this.maxPendingRequests;
    }

    public VirtualNodeSpecListenerConnectionPoolHttpGetArgs(
        Input<Integer> maxConnections,
        @Nullable Input<Integer> maxPendingRequests) {
        this.maxConnections = Objects.requireNonNull(maxConnections, "expected parameter 'maxConnections' to be non-null");
        this.maxPendingRequests = maxPendingRequests;
    }

    private VirtualNodeSpecListenerConnectionPoolHttpGetArgs() {
        this.maxConnections = Input.empty();
        this.maxPendingRequests = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolHttpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxConnections;
        private @Nullable Input<Integer> maxPendingRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolHttpGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
        }

        public Builder maxConnections(Input<Integer> maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }

        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Input.of(Objects.requireNonNull(maxConnections));
            return this;
        }

        public Builder maxPendingRequests(@Nullable Input<Integer> maxPendingRequests) {
            this.maxPendingRequests = maxPendingRequests;
            return this;
        }

        public Builder maxPendingRequests(@Nullable Integer maxPendingRequests) {
            this.maxPendingRequests = Input.ofNullable(maxPendingRequests);
            return this;
        }
        public VirtualNodeSpecListenerConnectionPoolHttpGetArgs build() {
            return new VirtualNodeSpecListenerConnectionPoolHttpGetArgs(maxConnections, maxPendingRequests);
        }
    }
}
