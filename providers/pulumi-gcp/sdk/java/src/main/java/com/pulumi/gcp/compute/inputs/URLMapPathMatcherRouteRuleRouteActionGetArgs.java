// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionGetArgs Empty = new URLMapPathMatcherRouteRuleRouteActionGetArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy;

    /**
     * @return The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs>> corsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
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
    @Import(name="faultInjectionPolicy")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy;

    /**
     * @return The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs>> faultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }

    /**
     * Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @Import(name="requestMirrorPolicy")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy;

    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs>> requestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs> retryPolicy;

    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs> timeout;

    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite;

    /**
     * @return The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs>> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
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
    @Import(name="weightedBackendServices")
    private @Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices;

    /**
     * @return A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs>>> weightedBackendServices() {
        return Optional.ofNullable(this.weightedBackendServices);
    }

    private URLMapPathMatcherRouteRuleRouteActionGetArgs() {}

    private URLMapPathMatcherRouteRuleRouteActionGetArgs(URLMapPathMatcherRouteRuleRouteActionGetArgs $) {
        this.corsPolicy = $.corsPolicy;
        this.faultInjectionPolicy = $.faultInjectionPolicy;
        this.requestMirrorPolicy = $.requestMirrorPolicy;
        this.retryPolicy = $.retryPolicy;
        this.timeout = $.timeout;
        this.urlRewrite = $.urlRewrite;
        this.weightedBackendServices = $.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherRouteRuleRouteActionGetArgs $;

        public Builder() {
            $ = new URLMapPathMatcherRouteRuleRouteActionGetArgs();
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionGetArgs defaults) {
            $ = new URLMapPathMatcherRouteRuleRouteActionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
         * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy) {
            $.corsPolicy = corsPolicy;
            return this;
        }

        /**
         * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
         * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(URLMapPathMatcherRouteRuleRouteActionCorsPolicyGetArgs corsPolicy) {
            return corsPolicy(Output.of(corsPolicy));
        }

        /**
         * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
         * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
         * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
         * by the Loadbalancer for a percentage of requests.
         * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder faultInjectionPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy) {
            $.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        /**
         * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
         * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
         * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
         * by the Loadbalancer for a percentage of requests.
         * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder faultInjectionPolicy(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs faultInjectionPolicy) {
            return faultInjectionPolicy(Output.of(faultInjectionPolicy));
        }

        /**
         * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
         * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
         * the host / authority header is suffixed with -shadow.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestMirrorPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy) {
            $.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        /**
         * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
         * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
         * the host / authority header is suffixed with -shadow.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestMirrorPolicy(URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyGetArgs requestMirrorPolicy) {
            return requestMirrorPolicy(Output.of(requestMirrorPolicy));
        }

        /**
         * @param retryPolicy Specifies the retry policy associated with this route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy Specifies the retry policy associated with this route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(URLMapPathMatcherRouteRuleRouteActionRetryPolicyGetArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been
         * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
         * If not specified, will use the largest timeout among all backend services associated with the route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been
         * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
         * If not specified, will use the largest timeout among all backend services associated with the route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(URLMapPathMatcherRouteRuleRouteActionTimeoutGetArgs timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to the matched service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite) {
            $.urlRewrite = urlRewrite;
            return this;
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to the matched service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(URLMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs urlRewrite) {
            return urlRewrite(Output.of(urlRewrite));
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs.
         * The weights determine the fraction of traffic that flows to their corresponding backend service.
         * If all traffic needs to go to a single backend service, there must be one weightedBackendService
         * with weight set to a non 0 number.
         * Once a backendService is identified and before forwarding the request to the backend service,
         * advanced routing actions like Url rewrites and header transformations are applied depending on
         * additional settings specified in this HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(@Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices) {
            $.weightedBackendServices = weightedBackendServices;
            return this;
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs.
         * The weights determine the fraction of traffic that flows to their corresponding backend service.
         * If all traffic needs to go to a single backend service, there must be one weightedBackendService
         * with weight set to a non 0 number.
         * Once a backendService is identified and before forwarding the request to the backend service,
         * advanced routing actions like Url rewrites and header transformations are applied depending on
         * additional settings specified in this HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs> weightedBackendServices) {
            return weightedBackendServices(Output.of(weightedBackendServices));
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs.
         * The weights determine the fraction of traffic that flows to their corresponding backend service.
         * If all traffic needs to go to a single backend service, there must be one weightedBackendService
         * with weight set to a non 0 number.
         * Once a backendService is identified and before forwarding the request to the backend service,
         * advanced routing actions like Url rewrites and header transformations are applied depending on
         * additional settings specified in this HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }

        public URLMapPathMatcherRouteRuleRouteActionGetArgs build() {
            return $;
        }
    }

}
