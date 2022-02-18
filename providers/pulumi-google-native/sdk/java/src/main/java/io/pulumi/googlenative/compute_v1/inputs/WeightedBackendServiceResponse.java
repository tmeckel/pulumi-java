// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.HttpHeaderActionResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * In contrast to a single BackendService in HttpRouteAction to which all matching traffic is directed to, WeightedBackendService allows traffic to be split across multiple backend services. The volume of traffic for each backend service is proportional to the weight specified in each WeightedBackendService
 * 
 */
public final class WeightedBackendServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final WeightedBackendServiceResponse Empty = new WeightedBackendServiceResponse();

    /**
     * The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
     * 
     */
    @InputImport(name="backendService", required=true)
    private final String backendService;

    public String getBackendService() {
        return this.backendService;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="headerAction", required=true)
    private final HttpHeaderActionResponse headerAction;

    public HttpHeaderActionResponse getHeaderAction() {
        return this.headerAction;
    }

    /**
     * Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) . The selection of a backend service is determined only for new traffic. Once a user's request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service's session affinity policy. The value must be from 0 to 1000.
     * 
     */
    @InputImport(name="weight", required=true)
    private final Integer weight;

    public Integer getWeight() {
        return this.weight;
    }

    public WeightedBackendServiceResponse(
        String backendService,
        HttpHeaderActionResponse headerAction,
        Integer weight) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
        this.headerAction = Objects.requireNonNull(headerAction, "expected parameter 'headerAction' to be non-null");
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private WeightedBackendServiceResponse() {
        this.backendService = null;
        this.headerAction = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeightedBackendServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;
        private HttpHeaderActionResponse headerAction;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(WeightedBackendServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.headerAction = defaults.headerAction;
    	      this.weight = defaults.weight;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setHeaderAction(HttpHeaderActionResponse headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public WeightedBackendServiceResponse build() {
            return new WeightedBackendServiceResponse(backendService, headerAction, weight);
        }
    }
}
