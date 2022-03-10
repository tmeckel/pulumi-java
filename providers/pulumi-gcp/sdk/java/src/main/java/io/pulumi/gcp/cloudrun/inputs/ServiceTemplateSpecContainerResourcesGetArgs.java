// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerResourcesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerResourcesGetArgs Empty = new ServiceTemplateSpecContainerResourcesGetArgs();

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * The values of the map is string form of the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    @InputImport(name="limits")
      private final @Nullable Input<Map<String,String>> limits;

    public Input<Map<String,String>> getLimits() {
        return this.limits == null ? Input.empty() : this.limits;
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * If Requests is omitted for a container, it defaults to Limits if that is
     * explicitly specified, otherwise to an implementation-defined value.
     * The values of the map is string form of the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    @InputImport(name="requests")
      private final @Nullable Input<Map<String,String>> requests;

    public Input<Map<String,String>> getRequests() {
        return this.requests == null ? Input.empty() : this.requests;
    }

    public ServiceTemplateSpecContainerResourcesGetArgs(
        @Nullable Input<Map<String,String>> limits,
        @Nullable Input<Map<String,String>> requests) {
        this.limits = limits;
        this.requests = requests;
    }

    private ServiceTemplateSpecContainerResourcesGetArgs() {
        this.limits = Input.empty();
        this.requests = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerResourcesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> limits;
        private @Nullable Input<Map<String,String>> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerResourcesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder limits(@Nullable Input<Map<String,String>> limits) {
            this.limits = limits;
            return this;
        }

        public Builder limits(@Nullable Map<String,String> limits) {
            this.limits = Input.ofNullable(limits);
            return this;
        }

        public Builder requests(@Nullable Input<Map<String,String>> requests) {
            this.requests = requests;
            return this;
        }

        public Builder requests(@Nullable Map<String,String> requests) {
            this.requests = Input.ofNullable(requests);
            return this;
        }
        public ServiceTemplateSpecContainerResourcesGetArgs build() {
            return new ServiceTemplateSpecContainerResourcesGetArgs(limits, requests);
        }
    }
}
