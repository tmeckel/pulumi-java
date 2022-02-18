// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.HttpFaultAbortResponse;
import io.pulumi.googlenative.compute_v1.inputs.HttpFaultDelayResponse;
import java.util.Objects;


/**
 * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by the load balancer on a percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
 * 
 */
public final class HttpFaultInjectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpFaultInjectionResponse Empty = new HttpFaultInjectionResponse();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * 
     */
    @InputImport(name="abort", required=true)
    private final HttpFaultAbortResponse abort;

    public HttpFaultAbortResponse getAbort() {
        return this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * 
     */
    @InputImport(name="delay", required=true)
    private final HttpFaultDelayResponse delay;

    public HttpFaultDelayResponse getDelay() {
        return this.delay;
    }

    public HttpFaultInjectionResponse(
        HttpFaultAbortResponse abort,
        HttpFaultDelayResponse delay) {
        this.abort = Objects.requireNonNull(abort, "expected parameter 'abort' to be non-null");
        this.delay = Objects.requireNonNull(delay, "expected parameter 'delay' to be non-null");
    }

    private HttpFaultInjectionResponse() {
        this.abort = null;
        this.delay = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultInjectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpFaultAbortResponse abort;
        private HttpFaultDelayResponse delay;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultInjectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder setAbort(HttpFaultAbortResponse abort) {
            this.abort = Objects.requireNonNull(abort);
            return this;
        }

        public Builder setDelay(HttpFaultDelayResponse delay) {
            this.delay = Objects.requireNonNull(delay);
            return this;
        }

        public HttpFaultInjectionResponse build() {
            return new HttpFaultInjectionResponse(abort, delay);
        }
    }
}
