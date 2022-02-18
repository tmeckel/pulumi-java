// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings controlling the volume of requests, connections and retries to this backend service.
 * 
 */
public final class CircuitBreakersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CircuitBreakersArgs Empty = new CircuitBreakersArgs();

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="maxConnections")
    private final @Nullable Input<Integer> maxConnections;

    public Input<Integer> getMaxConnections() {
        return this.maxConnections == null ? Input.empty() : this.maxConnections;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="maxPendingRequests")
    private final @Nullable Input<Integer> maxPendingRequests;

    public Input<Integer> getMaxPendingRequests() {
        return this.maxPendingRequests == null ? Input.empty() : this.maxPendingRequests;
    }

    /**
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * 
     */
    @InputImport(name="maxRequests")
    private final @Nullable Input<Integer> maxRequests;

    public Input<Integer> getMaxRequests() {
        return this.maxRequests == null ? Input.empty() : this.maxRequests;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="maxRequestsPerConnection")
    private final @Nullable Input<Integer> maxRequestsPerConnection;

    public Input<Integer> getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection == null ? Input.empty() : this.maxRequestsPerConnection;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="maxRetries")
    private final @Nullable Input<Integer> maxRetries;

    public Input<Integer> getMaxRetries() {
        return this.maxRetries == null ? Input.empty() : this.maxRetries;
    }

    public CircuitBreakersArgs(
        @Nullable Input<Integer> maxConnections,
        @Nullable Input<Integer> maxPendingRequests,
        @Nullable Input<Integer> maxRequests,
        @Nullable Input<Integer> maxRequestsPerConnection,
        @Nullable Input<Integer> maxRetries) {
        this.maxConnections = maxConnections;
        this.maxPendingRequests = maxPendingRequests;
        this.maxRequests = maxRequests;
        this.maxRequestsPerConnection = maxRequestsPerConnection;
        this.maxRetries = maxRetries;
    }

    private CircuitBreakersArgs() {
        this.maxConnections = Input.empty();
        this.maxPendingRequests = Input.empty();
        this.maxRequests = Input.empty();
        this.maxRequestsPerConnection = Input.empty();
        this.maxRetries = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CircuitBreakersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxConnections;
        private @Nullable Input<Integer> maxPendingRequests;
        private @Nullable Input<Integer> maxRequests;
        private @Nullable Input<Integer> maxRequestsPerConnection;
        private @Nullable Input<Integer> maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(CircuitBreakersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder setMaxConnections(@Nullable Input<Integer> maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder setMaxConnections(@Nullable Integer maxConnections) {
            this.maxConnections = Input.ofNullable(maxConnections);
            return this;
        }

        public Builder setMaxPendingRequests(@Nullable Input<Integer> maxPendingRequests) {
            this.maxPendingRequests = maxPendingRequests;
            return this;
        }

        public Builder setMaxPendingRequests(@Nullable Integer maxPendingRequests) {
            this.maxPendingRequests = Input.ofNullable(maxPendingRequests);
            return this;
        }

        public Builder setMaxRequests(@Nullable Input<Integer> maxRequests) {
            this.maxRequests = maxRequests;
            return this;
        }

        public Builder setMaxRequests(@Nullable Integer maxRequests) {
            this.maxRequests = Input.ofNullable(maxRequests);
            return this;
        }

        public Builder setMaxRequestsPerConnection(@Nullable Input<Integer> maxRequestsPerConnection) {
            this.maxRequestsPerConnection = maxRequestsPerConnection;
            return this;
        }

        public Builder setMaxRequestsPerConnection(@Nullable Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Input.ofNullable(maxRequestsPerConnection);
            return this;
        }

        public Builder setMaxRetries(@Nullable Input<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder setMaxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Input.ofNullable(maxRetries);
            return this;
        }

        public CircuitBreakersArgs build() {
            return new CircuitBreakersArgs(maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}
