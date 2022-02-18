// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ResourceRequirementsResponse {
    /**
     * (Optional) Only memory and CPU are supported. Limits describes the maximum amount of compute resources allowed. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    private final Map<String,String> limits;
    /**
     * (Optional) Only memory and CPU are supported. Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    private final Map<String,String> requests;

    @OutputCustomType.Constructor({"limits","requests"})
    private ResourceRequirementsResponse(
        Map<String,String> limits,
        Map<String,String> requests) {
        this.limits = Objects.requireNonNull(limits);
        this.requests = Objects.requireNonNull(requests);
    }

    /**
     * (Optional) Only memory and CPU are supported. Limits describes the maximum amount of compute resources allowed. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    public Map<String,String> getLimits() {
        return this.limits;
    }
    /**
     * (Optional) Only memory and CPU are supported. Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    public Map<String,String> getRequests() {
        return this.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> limits;
        private Map<String,String> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder setLimits(Map<String,String> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }

        public Builder setRequests(Map<String,String> requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }

        public ResourceRequirementsResponse build() {
            return new ResourceRequirementsResponse(limits, requests);
        }
    }
}
