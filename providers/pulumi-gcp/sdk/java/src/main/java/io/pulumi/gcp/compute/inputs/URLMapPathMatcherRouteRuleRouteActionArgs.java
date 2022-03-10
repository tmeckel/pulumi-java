// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionTimeoutArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionArgs Empty = new URLMapPathMatcherRouteRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @InputImport(name="corsPolicy")
      private final @Nullable Input<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;

    public Input<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Input.empty() : this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="faultInjectionPolicy")
      private final @Nullable Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    public Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> getFaultInjectionPolicy() {
        return this.faultInjectionPolicy == null ? Input.empty() : this.faultInjectionPolicy;
    }

    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @InputImport(name="requestMirrorPolicy")
      private final @Nullable Input<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    public Input<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Input.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @InputImport(name="retryPolicy")
      private final @Nullable Input<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy;

    public Input<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Input.empty() : this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout;

    public Input<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="urlRewrite")
      private final @Nullable Input<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;

    public Input<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Input.empty() : this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @InputImport(name="weightedBackendServices")
      private final @Nullable Input<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    public Input<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Input.empty() : this.weightedBackendServices;
    }

    public URLMapPathMatcherRouteRuleRouteActionArgs(
        @Nullable Input<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy,
        @Nullable Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy,
        @Nullable Input<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy,
        @Nullable Input<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy,
        @Nullable Input<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout,
        @Nullable Input<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite,
        @Nullable Input<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private URLMapPathMatcherRouteRuleRouteActionArgs() {
        this.corsPolicy = Input.empty();
        this.faultInjectionPolicy = Input.empty();
        this.requestMirrorPolicy = Input.empty();
        this.retryPolicy = Input.empty();
        this.timeout = Input.empty();
        this.urlRewrite = Input.empty();
        this.weightedBackendServices = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;
        private @Nullable Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;
        private @Nullable Input<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;
        private @Nullable Input<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy;
        private @Nullable Input<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout;
        private @Nullable Input<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;
        private @Nullable Input<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Input<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder corsPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs corsPolicy) {
            this.corsPolicy = Input.ofNullable(corsPolicy);
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Input.ofNullable(faultInjectionPolicy);
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable Input<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Input.ofNullable(requestMirrorPolicy);
            return this;
        }

        public Builder retryPolicy(@Nullable Input<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Input.ofNullable(retryPolicy);
            return this;
        }

        public Builder timeout(@Nullable Input<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable URLMapPathMatcherRouteRuleRouteActionTimeoutArgs timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder urlRewrite(@Nullable Input<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder urlRewrite(@Nullable URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs urlRewrite) {
            this.urlRewrite = Input.ofNullable(urlRewrite);
            return this;
        }

        public Builder weightedBackendServices(@Nullable Input<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public Builder weightedBackendServices(@Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            this.weightedBackendServices = Input.ofNullable(weightedBackendServices);
            return this;
        }
        public URLMapPathMatcherRouteRuleRouteActionArgs build() {
            return new URLMapPathMatcherRouteRuleRouteActionArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
