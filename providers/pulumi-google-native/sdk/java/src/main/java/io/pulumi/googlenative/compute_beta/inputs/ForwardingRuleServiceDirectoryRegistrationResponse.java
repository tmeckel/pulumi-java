// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the auto-registration of the Forwarding Rule to Service Directory. The region and project of the Service Directory resource generated from this registration will be the same as this Forwarding Rule.
 * 
 */
public final class ForwardingRuleServiceDirectoryRegistrationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ForwardingRuleServiceDirectoryRegistrationResponse Empty = new ForwardingRuleServiceDirectoryRegistrationResponse();

    /**
     * Service Directory namespace to register the forwarding rule under.
     * 
     */
    @InputImport(name="namespace", required=true)
    private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Service Directory service to register the forwarding rule under.
     * 
     */
    @InputImport(name="service", required=true)
    private final String service;

    public String getService() {
        return this.service;
    }

    /**
     * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
     * 
     */
    @InputImport(name="serviceDirectoryRegion", required=true)
    private final String serviceDirectoryRegion;

    public String getServiceDirectoryRegion() {
        return this.serviceDirectoryRegion;
    }

    public ForwardingRuleServiceDirectoryRegistrationResponse(
        String namespace,
        String service,
        String serviceDirectoryRegion) {
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.serviceDirectoryRegion = Objects.requireNonNull(serviceDirectoryRegion, "expected parameter 'serviceDirectoryRegion' to be non-null");
    }

    private ForwardingRuleServiceDirectoryRegistrationResponse() {
        this.namespace = null;
        this.service = null;
        this.serviceDirectoryRegion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingRuleServiceDirectoryRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;
        private String service;
        private String serviceDirectoryRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingRuleServiceDirectoryRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
    	      this.service = defaults.service;
    	      this.serviceDirectoryRegion = defaults.serviceDirectoryRegion;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setServiceDirectoryRegion(String serviceDirectoryRegion) {
            this.serviceDirectoryRegion = Objects.requireNonNull(serviceDirectoryRegion);
            return this;
        }

        public ForwardingRuleServiceDirectoryRegistrationResponse build() {
            return new ForwardingRuleServiceDirectoryRegistrationResponse(namespace, service, serviceDirectoryRegion);
        }
    }
}
