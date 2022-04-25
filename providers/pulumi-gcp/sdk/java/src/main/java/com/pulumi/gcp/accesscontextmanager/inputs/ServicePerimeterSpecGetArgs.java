// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyGetArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecIngressPolicyGetArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecVpcAccessibleServicesGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecGetArgs Empty = new ServicePerimeterSpecGetArgs();

    /**
     * A list of AccessLevel resource names that allow resources within
     * the ServicePerimeter to be accessed from the internet.
     * AccessLevels listed must be in the same policy as this
     * ServicePerimeter. Referencing a nonexistent AccessLevel is a
     * syntax error. If no AccessLevel names are listed, resources within
     * the perimeter can only be accessed via GCP calls with request
     * origins within the perimeter. For Service Perimeter Bridge, must
     * be empty.
     * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
     * 
     */
    @Import(name="accessLevels")
    private @Nullable Output<List<String>> accessLevels;

    /**
     * @return A list of AccessLevel resource names that allow resources within
     * the ServicePerimeter to be accessed from the internet.
     * AccessLevels listed must be in the same policy as this
     * ServicePerimeter. Referencing a nonexistent AccessLevel is a
     * syntax error. If no AccessLevel names are listed, resources within
     * the perimeter can only be accessed via GCP calls with request
     * origins within the perimeter. For Service Perimeter Bridge, must
     * be empty.
     * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
     * 
     */
    public Optional<Output<List<String>>> accessLevels() {
        return Optional.ofNullable(this.accessLevels);
    }

    /**
     * List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * 
     */
    @Import(name="egressPolicies")
    private @Nullable Output<List<ServicePerimeterSpecEgressPolicyGetArgs>> egressPolicies;

    /**
     * @return List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServicePerimeterSpecEgressPolicyGetArgs>>> egressPolicies() {
        return Optional.ofNullable(this.egressPolicies);
    }

    /**
     * List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressPolicies")
    private @Nullable Output<List<ServicePerimeterSpecIngressPolicyGetArgs>> ingressPolicies;

    /**
     * @return List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServicePerimeterSpecIngressPolicyGetArgs>>> ingressPolicies() {
        return Optional.ofNullable(this.ingressPolicies);
    }

    /**
     * A list of resources, currently only projects in the form
     * `projects/&lt;projectnumber&gt;`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return A list of resources, currently only projects in the form
     * `projects/&lt;projectnumber&gt;`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter&#39;s access
     * restrictions.
     * 
     */
    @Import(name="restrictedServices")
    private @Nullable Output<List<String>> restrictedServices;

    /**
     * @return GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter&#39;s access
     * restrictions.
     * 
     */
    public Optional<Output<List<String>>> restrictedServices() {
        return Optional.ofNullable(this.restrictedServices);
    }

    /**
     * Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    @Import(name="vpcAccessibleServices")
    private @Nullable Output<ServicePerimeterSpecVpcAccessibleServicesGetArgs> vpcAccessibleServices;

    /**
     * @return Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterSpecVpcAccessibleServicesGetArgs>> vpcAccessibleServices() {
        return Optional.ofNullable(this.vpcAccessibleServices);
    }

    private ServicePerimeterSpecGetArgs() {}

    private ServicePerimeterSpecGetArgs(ServicePerimeterSpecGetArgs $) {
        this.accessLevels = $.accessLevels;
        this.egressPolicies = $.egressPolicies;
        this.ingressPolicies = $.ingressPolicies;
        this.resources = $.resources;
        this.restrictedServices = $.restrictedServices;
        this.vpcAccessibleServices = $.vpcAccessibleServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterSpecGetArgs $;

        public Builder() {
            $ = new ServicePerimeterSpecGetArgs();
        }

        public Builder(ServicePerimeterSpecGetArgs defaults) {
            $ = new ServicePerimeterSpecGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevels A list of AccessLevel resource names that allow resources within
         * the ServicePerimeter to be accessed from the internet.
         * AccessLevels listed must be in the same policy as this
         * ServicePerimeter. Referencing a nonexistent AccessLevel is a
         * syntax error. If no AccessLevel names are listed, resources within
         * the perimeter can only be accessed via GCP calls with request
         * origins within the perimeter. For Service Perimeter Bridge, must
         * be empty.
         * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(@Nullable Output<List<String>> accessLevels) {
            $.accessLevels = accessLevels;
            return this;
        }

        /**
         * @param accessLevels A list of AccessLevel resource names that allow resources within
         * the ServicePerimeter to be accessed from the internet.
         * AccessLevels listed must be in the same policy as this
         * ServicePerimeter. Referencing a nonexistent AccessLevel is a
         * syntax error. If no AccessLevel names are listed, resources within
         * the perimeter can only be accessed via GCP calls with request
         * origins within the perimeter. For Service Perimeter Bridge, must
         * be empty.
         * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(List<String> accessLevels) {
            return accessLevels(Output.of(accessLevels));
        }

        /**
         * @param accessLevels A list of AccessLevel resource names that allow resources within
         * the ServicePerimeter to be accessed from the internet.
         * AccessLevels listed must be in the same policy as this
         * ServicePerimeter. Referencing a nonexistent AccessLevel is a
         * syntax error. If no AccessLevel names are listed, resources within
         * the perimeter can only be accessed via GCP calls with request
         * origins within the perimeter. For Service Perimeter Bridge, must
         * be empty.
         * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(String... accessLevels) {
            return accessLevels(List.of(accessLevels));
        }

        /**
         * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
         * have multiple EgressPolicies, each of which is evaluated separately.
         * Access is granted if any EgressPolicy grants it. Must be empty for
         * a perimeter bridge.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressPolicies(@Nullable Output<List<ServicePerimeterSpecEgressPolicyGetArgs>> egressPolicies) {
            $.egressPolicies = egressPolicies;
            return this;
        }

        /**
         * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
         * have multiple EgressPolicies, each of which is evaluated separately.
         * Access is granted if any EgressPolicy grants it. Must be empty for
         * a perimeter bridge.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressPolicies(List<ServicePerimeterSpecEgressPolicyGetArgs> egressPolicies) {
            return egressPolicies(Output.of(egressPolicies));
        }

        /**
         * @param egressPolicies List of EgressPolicies to apply to the perimeter. A perimeter may
         * have multiple EgressPolicies, each of which is evaluated separately.
         * Access is granted if any EgressPolicy grants it. Must be empty for
         * a perimeter bridge.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressPolicies(ServicePerimeterSpecEgressPolicyGetArgs... egressPolicies) {
            return egressPolicies(List.of(egressPolicies));
        }

        /**
         * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
         * have multiple `IngressPolicies`, each of which is evaluated
         * separately. Access is granted if any `Ingress Policy` grants it.
         * Must be empty for a perimeter bridge.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ingressPolicies(@Nullable Output<List<ServicePerimeterSpecIngressPolicyGetArgs>> ingressPolicies) {
            $.ingressPolicies = ingressPolicies;
            return this;
        }

        /**
         * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
         * have multiple `IngressPolicies`, each of which is evaluated
         * separately. Access is granted if any `Ingress Policy` grants it.
         * Must be empty for a perimeter bridge.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ingressPolicies(List<ServicePerimeterSpecIngressPolicyGetArgs> ingressPolicies) {
            return ingressPolicies(Output.of(ingressPolicies));
        }

        /**
         * @param ingressPolicies List of `IngressPolicies` to apply to the perimeter. A perimeter may
         * have multiple `IngressPolicies`, each of which is evaluated
         * separately. Access is granted if any `Ingress Policy` grants it.
         * Must be empty for a perimeter bridge.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ingressPolicies(ServicePerimeterSpecIngressPolicyGetArgs... ingressPolicies) {
            return ingressPolicies(List.of(ingressPolicies));
        }

        /**
         * @param resources A list of resources, currently only projects in the form
         * `projects/&lt;projectnumber&gt;`, that match this to stanza. A request matches
         * if it contains a resource in this list. If * is specified for resources,
         * then this `EgressTo` rule will authorize access to all resources outside
         * the perimeter.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources A list of resources, currently only projects in the form
         * `projects/&lt;projectnumber&gt;`, that match this to stanza. A request matches
         * if it contains a resource in this list. If * is specified for resources,
         * then this `EgressTo` rule will authorize access to all resources outside
         * the perimeter.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources A list of resources, currently only projects in the form
         * `projects/&lt;projectnumber&gt;`, that match this to stanza. A request matches
         * if it contains a resource in this list. If * is specified for resources,
         * then this `EgressTo` rule will authorize access to all resources outside
         * the perimeter.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param restrictedServices GCP services that are subject to the Service Perimeter
         * restrictions. Must contain a list of services. For example, if
         * `storage.googleapis.com` is specified, access to the storage
         * buckets inside the perimeter must meet the perimeter&#39;s access
         * restrictions.
         * 
         * @return builder
         * 
         */
        public Builder restrictedServices(@Nullable Output<List<String>> restrictedServices) {
            $.restrictedServices = restrictedServices;
            return this;
        }

        /**
         * @param restrictedServices GCP services that are subject to the Service Perimeter
         * restrictions. Must contain a list of services. For example, if
         * `storage.googleapis.com` is specified, access to the storage
         * buckets inside the perimeter must meet the perimeter&#39;s access
         * restrictions.
         * 
         * @return builder
         * 
         */
        public Builder restrictedServices(List<String> restrictedServices) {
            return restrictedServices(Output.of(restrictedServices));
        }

        /**
         * @param restrictedServices GCP services that are subject to the Service Perimeter
         * restrictions. Must contain a list of services. For example, if
         * `storage.googleapis.com` is specified, access to the storage
         * buckets inside the perimeter must meet the perimeter&#39;s access
         * restrictions.
         * 
         * @return builder
         * 
         */
        public Builder restrictedServices(String... restrictedServices) {
            return restrictedServices(List.of(restrictedServices));
        }

        /**
         * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
         * Perimeter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vpcAccessibleServices(@Nullable Output<ServicePerimeterSpecVpcAccessibleServicesGetArgs> vpcAccessibleServices) {
            $.vpcAccessibleServices = vpcAccessibleServices;
            return this;
        }

        /**
         * @param vpcAccessibleServices Specifies how APIs are allowed to communicate within the Service
         * Perimeter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vpcAccessibleServices(ServicePerimeterSpecVpcAccessibleServicesGetArgs vpcAccessibleServices) {
            return vpcAccessibleServices(Output.of(vpcAccessibleServices));
        }

        public ServicePerimeterSpecGetArgs build() {
            return $;
        }
    }

}
