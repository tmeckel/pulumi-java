// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.EgressPolicyResponse;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.IngressPolicyResponse;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.VpcAccessibleServicesResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * `ServicePerimeterConfig` specifies a set of Google Cloud resources that describe specific Service Perimeter configuration.
 * 
 */
public final class ServicePerimeterConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServicePerimeterConfigResponse Empty = new ServicePerimeterConfigResponse();

    /**
     * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be empty.
     * 
     */
    @InputImport(name="accessLevels", required=true)
    private final List<String> accessLevels;

    public List<String> getAccessLevels() {
        return this.accessLevels;
    }

    /**
     * List of EgressPolicies to apply to the perimeter. A perimeter may have multiple EgressPolicies, each of which is evaluated separately. Access is granted if any EgressPolicy grants it. Must be empty for a perimeter bridge.
     * 
     */
    @InputImport(name="egressPolicies", required=true)
    private final List<EgressPolicyResponse> egressPolicies;

    public List<EgressPolicyResponse> getEgressPolicies() {
        return this.egressPolicies;
    }

    /**
     * List of IngressPolicies to apply to the perimeter. A perimeter may have multiple IngressPolicies, each of which is evaluated separately. Access is granted if any Ingress Policy grants it. Must be empty for a perimeter bridge.
     * 
     */
    @InputImport(name="ingressPolicies", required=true)
    private final List<IngressPolicyResponse> ingressPolicies;

    public List<IngressPolicyResponse> getIngressPolicies() {
        return this.ingressPolicies;
    }

    /**
     * A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}`
     * 
     */
    @InputImport(name="resources", required=true)
    private final List<String> resources;

    public List<String> getResources() {
        return this.resources;
    }

    /**
     * Google Cloud services that are subject to the Service Perimeter restrictions. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter's access restrictions.
     * 
     */
    @InputImport(name="restrictedServices", required=true)
    private final List<String> restrictedServices;

    public List<String> getRestrictedServices() {
        return this.restrictedServices;
    }

    /**
     * Configuration for APIs allowed within Perimeter.
     * 
     */
    @InputImport(name="vpcAccessibleServices", required=true)
    private final VpcAccessibleServicesResponse vpcAccessibleServices;

    public VpcAccessibleServicesResponse getVpcAccessibleServices() {
        return this.vpcAccessibleServices;
    }

    public ServicePerimeterConfigResponse(
        List<String> accessLevels,
        List<EgressPolicyResponse> egressPolicies,
        List<IngressPolicyResponse> ingressPolicies,
        List<String> resources,
        List<String> restrictedServices,
        VpcAccessibleServicesResponse vpcAccessibleServices) {
        this.accessLevels = Objects.requireNonNull(accessLevels, "expected parameter 'accessLevels' to be non-null");
        this.egressPolicies = Objects.requireNonNull(egressPolicies, "expected parameter 'egressPolicies' to be non-null");
        this.ingressPolicies = Objects.requireNonNull(ingressPolicies, "expected parameter 'ingressPolicies' to be non-null");
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.restrictedServices = Objects.requireNonNull(restrictedServices, "expected parameter 'restrictedServices' to be non-null");
        this.vpcAccessibleServices = Objects.requireNonNull(vpcAccessibleServices, "expected parameter 'vpcAccessibleServices' to be non-null");
    }

    private ServicePerimeterConfigResponse() {
        this.accessLevels = List.of();
        this.egressPolicies = List.of();
        this.ingressPolicies = List.of();
        this.resources = List.of();
        this.restrictedServices = List.of();
        this.vpcAccessibleServices = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> accessLevels;
        private List<EgressPolicyResponse> egressPolicies;
        private List<IngressPolicyResponse> ingressPolicies;
        private List<String> resources;
        private List<String> restrictedServices;
        private VpcAccessibleServicesResponse vpcAccessibleServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.egressPolicies = defaults.egressPolicies;
    	      this.ingressPolicies = defaults.ingressPolicies;
    	      this.resources = defaults.resources;
    	      this.restrictedServices = defaults.restrictedServices;
    	      this.vpcAccessibleServices = defaults.vpcAccessibleServices;
        }

        public Builder setAccessLevels(List<String> accessLevels) {
            this.accessLevels = Objects.requireNonNull(accessLevels);
            return this;
        }

        public Builder setEgressPolicies(List<EgressPolicyResponse> egressPolicies) {
            this.egressPolicies = Objects.requireNonNull(egressPolicies);
            return this;
        }

        public Builder setIngressPolicies(List<IngressPolicyResponse> ingressPolicies) {
            this.ingressPolicies = Objects.requireNonNull(ingressPolicies);
            return this;
        }

        public Builder setResources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setRestrictedServices(List<String> restrictedServices) {
            this.restrictedServices = Objects.requireNonNull(restrictedServices);
            return this;
        }

        public Builder setVpcAccessibleServices(VpcAccessibleServicesResponse vpcAccessibleServices) {
            this.vpcAccessibleServices = Objects.requireNonNull(vpcAccessibleServices);
            return this;
        }

        public ServicePerimeterConfigResponse build() {
            return new ServicePerimeterConfigResponse(accessLevels, egressPolicies, ingressPolicies, resources, restrictedServices, vpcAccessibleServices);
        }
    }
}
