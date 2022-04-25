// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.HttpFaultAbortResponse;
import com.pulumi.googlenative.compute_beta.inputs.HttpFaultDelayResponse;
import java.util.Objects;


/**
 * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by the load balancer on a percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests.
 * 
 */
public final class HttpFaultInjectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpFaultInjectionResponse Empty = new HttpFaultInjectionResponse();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * 
     */
    @Import(name="abort", required=true)
    private HttpFaultAbortResponse abort;

    /**
     * @return The specification for how client requests are aborted as part of fault injection.
     * 
     */
    public HttpFaultAbortResponse abort() {
        return this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * 
     */
    @Import(name="delay", required=true)
    private HttpFaultDelayResponse delay;

    /**
     * @return The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * 
     */
    public HttpFaultDelayResponse delay() {
        return this.delay;
    }

    private HttpFaultInjectionResponse() {}

    private HttpFaultInjectionResponse(HttpFaultInjectionResponse $) {
        this.abort = $.abort;
        this.delay = $.delay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpFaultInjectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpFaultInjectionResponse $;

        public Builder() {
            $ = new HttpFaultInjectionResponse();
        }

        public Builder(HttpFaultInjectionResponse defaults) {
            $ = new HttpFaultInjectionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param abort The specification for how client requests are aborted as part of fault injection.
         * 
         * @return builder
         * 
         */
        public Builder abort(HttpFaultAbortResponse abort) {
            $.abort = abort;
            return this;
        }

        /**
         * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
         * 
         * @return builder
         * 
         */
        public Builder delay(HttpFaultDelayResponse delay) {
            $.delay = delay;
            return this;
        }

        public HttpFaultInjectionResponse build() {
            $.abort = Objects.requireNonNull($.abort, "expected parameter 'abort' to be non-null");
            $.delay = Objects.requireNonNull($.delay, "expected parameter 'delay' to be non-null");
            return $;
        }
    }

}
